package com.data.tencent;

import com.data.tencent.thread.SonThread;
import com.data.tencent.utils.HtmlContentUtil;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by runzhouwu
 * on 2019/3/12 11:10
 */
public class MoneySupply {

    private final static Logger logger = LoggerFactory.getLogger(MoneySupply.class);
    // E:\project\github\changsha\mvn-one\src\main\resources
    private final static String propertyName = "E:\\project\\github\\changsha\\mvn-one\\src\\main\\resources" +
            "\\moneySupply.properties";

    final Properties prop = new Properties();

    public static void main(String[] args) {

        logger.info("money supply");
        try {
            new MoneySupply().core();
        } catch (IOException e) {
            logger.error("", e);
            System.exit(1);
        }
    }

    private void core() throws IOException {
        init();
        downPage(prop.getProperty("mp2016"));
    }

    private void init() throws IOException {
        InputStream input = null;
        try {
            input = new FileInputStream(propertyName);
            // load a properties file
            prop.load(input);

        } catch (IOException ex) {
            throw ex;
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                }
            }
        }

    }


    /**
     * 下载页面
     */
    private void downPage(String page) {
        logger.info(page);
        Document doc = Jsoup.parse(HtmlContentUtil.getHtmlContent(page));
        Element body = doc.select("div.table").first();
        // 找出定义了 class=masthead 的元素
        Elements contents = body.select("div.table.tbody");
        int pa = 0;
        for (Element content : contents) {
            Element link = content.select("div").select("a").get(1);
            String linkHref = link.attr("href");
            String linkText = link.text();
            logger.info((pa++) + "-------" + linkHref + "-------------" + linkText);
        }
    }

    /**
     * 抠出数据
     */
    private void filterAndCombine() {

    }


    /**
     * 计算
     */

    public void compute(Double[][] m2) {
        computeQoQ(m2);
        logger.info("------------------------");
        computeYoY(m2);

    }

    // 同比
    private void computeYoY(Double[][] m2) {
        String[][] yoyRise = new String[4][12];
        String[][] yoyRisePer = new String[4][12];

        int length = 0;
        for (int j = 0; j < m2.length; j++) {
            length = length > m2[j].length ? length : m2[j].length;
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < m2.length - 1; j++) {
                if (m2[j].length <= i) {
//                    logger.warn("{} {} > {} ", 2016 + j, m2[j].length, i);
                    continue;
                }
                if (m2[j + 1].length <= i) {
//                    logger.warn("{} {} > {} ", 2016 + j + 1, m2[j + 1].length, i);
                    continue;
                }
                double pre = m2[j][i];
                double post = m2[j + 1][i];
                double gap = post - pre;
                double yoy = gap / pre;
                logger.info("同比 {} {} 月 {} {} {} {}", 2016 + j, i + 1, post, pre, df3.format(gap),
                        String.format("%.2f", (yoy * 100)) + "%");
                yoyRise[j][i] = df3.format(gap);
                yoyRisePer[j][i] = String.format("%.2f", (yoy * 100));
            }
            logger.info("");
        }
        printYoY(yoyRise, yoyRisePer);
    }

    private void printYoY(String[][] qoqRise, String[][] qoqRisePer) {
        int i;
        for (i = 0; i < qoqRise[0].length; i++) {
            System.out.print("'" + (i + 1) + "月',");
        }
        logger.info("");
        for (String[] qoqY : qoqRise) {
            logger.info(StringUtils.join(qoqY, ","));
        }
        for (String[] qoqPY : qoqRisePer) {
            logger.info(StringUtils.join(qoqPY, ","));
        }
    }

    private final DecimalFormat df2 = new DecimalFormat("#.00");
    private final DecimalFormat df3 = new DecimalFormat("#.000");
    private final DecimalFormat df4 = new DecimalFormat("#.0000");

    // 环比
    private void computeQoQ(Double[][] m2) {
        List<String> qoqTime = new ArrayList<>();
        List qoqRise = new ArrayList<String>();
        List qoqRisePer = new ArrayList<String>();
        List nowCap = new ArrayList();
        double lastOne = 0;
        for (int j = 0; j < m2.length; j++) {
            Double[] mps = m2[j];
            for (int i = 0; i < mps.length; i++) {
                Double pre = mps[i];
                if (lastOne != 0) {
                    double qoq = (pre - lastOne) / lastOne;
                    logger.info("环比 {} 年 {} 月 {} {} {} {}", 2015 + j, i + 1, pre, lastOne, df3.format((pre - lastOne)),
                            String.format("%.2f", (qoq * 100)) + "%");
                    qoqTime.add("'" + (2015 + j) + "年" + (i + 1) + "月'");
                    qoqRise.add(df3.format((pre - lastOne)));
                    qoqRisePer.add(String.format("%.2f", (qoq * 100)));
//                    nowCap.add(lastOne);
                    nowCap.add(pre);
                    lastOne = 0;
                }
                if (i + 1 == mps.length) {
                    // 最后一个
                    lastOne = mps[i];
                    continue;
                }

                Double post = mps[i + 1];
                double qoq = (post - pre) / pre;
                logger.info("环比 {} 年 {} 月 {} {} {} {}", 2015 + j, i + 2, post, pre, df3.format(post - pre),
                        String.format("%.2f", (qoq * 100)) + "%");

                qoqTime.add("'" + (2015 + j) + "年" + (i + 2) + "月'");
                qoqRise.add(df3.format((post - pre)));
                qoqRisePer.add(String.format("%.2f", (qoq * 100)));
                nowCap.add(post);

            }
        }

        printQoq(qoqTime, qoqRise, qoqRisePer);
        logger.info(StringUtils.join(nowCap, ","));
    }

    private void printQoq(List<String> times, List<String> rise, List<String> risePer) {
        logger.info(StringUtils.join(times, ","));
        logger.info(StringUtils.join(rise, ","));
        logger.info(StringUtils.join(risePer, ","));
    }

    private void persite() {

    }

    private void view() {

    }
}
