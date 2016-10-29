package com.data.tencent.thread;

import com.data.tencent.utils.Constant;
import com.data.tencent.utils.HtmlContentUtil;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/10/29.
 */
public class SonThreadType1Test {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCon(){
        String connect = "http://www.cstj.gov.cn/static/ydkb/20110426/15844.html";//http://www.cstj.gov.cn/static/ydkb/20110516/16083.html";

        Document doc = Jsoup.parse(HtmlContentUtil.getHtmlContent(connect));

        Elements body_ = doc.select("div.content");
        if(body_ == null){

        }
        // 找出定义了 class=masthead 的元素
        Elements contents_ = body_.select("div");

        if(contents_ == null){

        }
        if(10<=contents_.size()&&contents_.size()<=100){

        }else {
            for (Element content_ : contents_) {
                Elements links = content_.select("span");
                String info__ = "";
                if (links.size() > 200) {
                    info__ += links.text();
                } else {
                    for (int i = 1; i < links.size(); i++) {

                        String info_ = "";
                        for (Node info : links.get(i).childNodes()) {
                            try {
                                info_ += ((TextNode) info).text();
                            } catch (Exception e) {
                                info_ += "\n";
                            }
                        }
                        System.out.println(info_);
                    }
                }
                for (String str : info__.split("\\●")) {
                    if (!StringUtils.isEmpty(str.trim())) {
                        System.out.println(str.replaceAll(" ", ""));
                    }
                }

            }

        }
    }

    @Test
    public void testSimple(){
        String connect = "http://www.cstj.gov.cn/static/ydkb/20110426/15844.html";//http://www.cstj.gov.cn/static/ydkb/20110516/16083.html";

        Document doc = Jsoup.parse(HtmlContentUtil.getHtmlContent(connect));

        Elements body_ = doc.select("div.content");
        if(body_ == null){

        }
        // 找出定义了 class=masthead 的元素
        Elements contents_ = body_.select("div");

        if(contents_ == null){

        }
        String info = "";
        for(int i =1;i<contents_.size();i++){
            info += contents_.get(i).text();
//            if(element.tag().equals())
        }
        for (String str : info.split("\\●")) {
            if (!StringUtils.isEmpty(str.trim())) {
                System.out.println(str.replaceAll(" ", ""));
            }
        }

    }

}