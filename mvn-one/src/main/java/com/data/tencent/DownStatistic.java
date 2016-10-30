package com.data.tencent;


import com.data.tencent.thread.*;
import com.data.tencent.utils.Constant;
import com.data.tencent.utils.FileOption;
import com.data.tencent.utils.HtmlContentUtil;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2016/10/23.
 */
public class DownStatistic {

    private static Log logger = LogFactory.getLog(DownStatistic.class);

    public static void main(String[] args) {
        logger.info("");
        try {
            DownStatistic demo = new DownStatistic();
            demo.pageTree(Constant.page1);
            logger.info("------------------------------------------------------------------------");
            TimeUnit.SECONDS.sleep(1);
            demo.pageTree(Constant.page2);
            logger.info("------------------------------------------------------------------------");
            TimeUnit.SECONDS.sleep(1);
            demo.pageTree(Constant.page3);
            logger.info("------------------------------------------------------------------------");
            TimeUnit.SECONDS.sleep(1);
            demo.pageTree(Constant.page4);
            logger.info("------------------------------------------------------------------------");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public DownStatistic() {

    }

    public void pageTree(String page) throws IOException {
        logger.info(page);
        Document doc = Jsoup.parse(HtmlContentUtil.getHtmlContent(page));
        Element body = doc.select("div.c1-body").first();
        // 找出定义了 class=masthead 的元素
        Elements contents = body.select("div.c1-bline");
        int pa = 0;
        for (Element content : contents) {
            Element link = content.select("div").select("a").get(1);
            String linkHref = link.attr("href");
            String linkText = link.text();
            logger.info((pa++) + "-------"+linkHref + "-------------" + linkText);

            copyTofile("------------------------------",true);
            copyTofile(linkHref + "," + linkText + "\n",true);

            new SonThread(linkHref,linkText,page).execute();
        }
    }


    public void pageTreetype1(String page) throws IOException {
        logger.info(page);
        Document doc = Jsoup.parse(HtmlContentUtil.getHtmlContent(page));
        Element body = doc.select("div.c1-body").first();
        // 找出定义了 class=masthead 的元素
        Elements contents = body.select("div.c1-bline");
        for (Element content : contents) {
            Element link = content.select("div").select("a").get(1);
            String linkHref = link.attr("href");
            String linkText = link.text();
            logger.info(linkHref + "," + linkText);
            copyTofile("------------------------------",true);
            copyTofile(linkHref + "," + linkText + "\n",true);

            new SonThreadType1(linkHref,linkText).execute();
        }
    }



    public void copyTofile(String data,boolean append) {
//        System.out.println("rootpath:" +System.getProperty("java.class.path"));
//        System.out.println("rootPath: " + (new File("")).getAbsolutePath());
        String file = Constant.INITINFO;
        try {
            FileOption.WriteData(data, file,append);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
