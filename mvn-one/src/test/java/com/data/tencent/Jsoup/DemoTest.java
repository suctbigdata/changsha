package com.data.tencent.Jsoup;

import com.data.tencent.utils.Constant;
import com.data.tencent.utils.FileOption;
import com.data.tencent.utils.HtmlContentUtil;
import org.apache.commons.lang.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.IOException;

/** 
* Demo Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮ�� 24, 2016</pre> 
* @version 1.0 
*/ 
public class DemoTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: indexInfo(String page) 
* 
*/ 
@Test
public void testIndexInfo() throws Exception { 
//TODO: Test goes here...
    System.out.println("11111111111111");

    Document doc = Jsoup.connect(Constant.page1)
//                .cookie("auth", "token") // 设置 cookie
            .timeout(30000)           // 设置连接超时时间
            .get();


    Element body = doc.select("div.c1-body").first();
    // 找出定义了 class=masthead 的元素
    Elements contents = body.select("div.c1-bline");
    for (Element content : contents) {
        Element link = content.select("div").select("a").get(1);
        String linkHref = link.attr("href");
        String linkText = link.text();
        System.out.println("-------------------------");
        System.out.println(linkHref+","+linkText);

//            readStatics(linkHref);
    }
} 

/** 
* 
* Method: readStatics(String url) 
* 
*/ 
@Test
public void testReadStatics() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: copyTofile(String data) 
* 
*/ 
@Test
public void testCopyTofile() throws Exception {

    String page = Constant.page4;
    Document doc = Jsoup.parse(HtmlContentUtil.getHtmlContent(page));
    Element body = doc.select("div.c1-body").first();
    // 找出定义了 class=masthead 的元素
    Elements contents = body.select("div.c1-bline");
    int f = 0;
    for (Element content : contents) {

        Element link = content.select("div").select("a").get(1);
        String linkHref = link.attr("href");
        String linkText = link.text();

//        System.out.println((f++) +"--------" + linkHref +"............"+ linkText+"-------------------------------------------");
        System.out.println("static String str"+(f++)+"="+"\""+linkHref+"\";");
        String connect = Constant.PageURL + linkHref + "";
        Document doc_ = Jsoup.parse(HtmlContentUtil.getHtmlContent(connect));

        Elements body_ = doc_.select("div.content");
        if (body_ == null) {

        }

        String info = "";
        if(Constant.Spec_page1_5.equals(linkHref)||Constant.Spec_page2_all.equals(page)){
            Elements contents_ = body_.select("p");
            for(Element p:contents_){
                info += p.text();
            }
        }else if(StringUtils.join(Constant.Spec_page3_part,",").contains(linkHref)&&Constant.page3.equals(page)){
            Elements contents_ = body_.select("p");
            for(Element p:contents_){
                info += p.text();
            }
        }else if(StringUtils.join(Constant.Spec_page4_part,",").contains(linkHref)&&Constant.page4.equals(page)){
            Elements contents_ = body_.select("p");
            for(Element p:contents_){
                info += p.text();
            }
        }else {
            Elements contents_ = body_.select("div");
            if (contents_ == null) {

            }
            for (int i = 1; i < contents_.size(); i++) {
                info += contents_.get(i).text();
            }

        }
        for (String str : info.split("\\●")) {
            if (!StringUtils.isEmpty(str.trim())) {
                System.out.println(str.replaceAll(" ", ""));
            }
        }
    }

}

    /**
     *         String str0="/static/ydkb/20130403/22370.html";
     String str1="/static/ydkb/20130227/22143.html";
     String str2="/static/ydkb/20130227/22142.html";
     String str3="/static/ydkb/20121119/21743.html";
     String str4="/static/ydkb/20121029/21648.html";
     String str5="/static/ydkb/20120917/21452.html";
     String str6="/static/ydkb/20120821/21259.html";
     String str7="/static/ydkb/20120725/21083.html";
     String str8="/static/ydkb/20120618/20877.html";
     String str9="/static/ydkb/20120521/20677.html";
     String str10="/static/ydkb/20120423/20337.html";
     String str11="/static/ydkb/20120326/20094.html";
     String str12="/static/ydkb/20120207/19570.html";
     String str13="/static/ydkb/20111219/19300.html";
     String str14="/static/ydkb/20111121/19110.html";
     */

    @Test
    public void testpage3_part(){

         String str1="/static/ydkb/20110316/15518.html";
         String str3="/static/ydkb/20110214/15286.html";
         String str4="/static/ydkb/20101215/15086.html";
         String str5="/static/ydkb/20101115/14913.html";
         String str6="/static/ydkb/20101024/14717.html";
         String str7="/static/ydkb/20100916/14461.html";
         String str8="/static/ydkb/20100815/14265.html";

        String[] strs = {str1,str3,str4,str5,str6,str7,str8};
        for(String str_:strs){
            String connect = Constant.PageURL + str_;
            System.out.println(connect + "----------------------------------");
            Document doc_ = Jsoup.parse(HtmlContentUtil.getHtmlContent(connect));

            Elements body_ = doc_.select("div.content");
            if (body_ == null) {

            }
            // 找出定义了 class=masthead 的元素
            Elements contents_ = body_.select("p");

            String info = "";
            for(Element p:contents_){
                info += p.text();
            }
            for (String str : info.split("\\●")) {
                if (!StringUtils.isEmpty(str.trim())) {
                    System.out.println(str.replaceAll(" ", ""));
                }
            }
        }

    }

    @Test
    public void testSS(){
        String connect = "http://www.cstj.gov.cn/static/ydkb/20110516/16083.html";
        System.out.println(connect + "----------------------------------");
        Document doc_ = Jsoup.parse(HtmlContentUtil.getHtmlContent(connect));

        Elements body_ = doc_.select("div.content");
        if (body_ == null) {

        }
        // 找出定义了 class=masthead 的元素
        Elements contents_ = body_.select("p");

        String info = "";
        for(Element p:contents_){
            info += p.text();
        }
        for (String str : info.split("\\●")) {
            if (!StringUtils.isEmpty(str.trim())) {
                System.out.println(str.replaceAll(" ", ""));
            }
        }
    }


} 
