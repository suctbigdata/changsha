package com.data.tencent.Jsoup;

import com.data.tencent.utils.Constant;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

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
//TODO: Test goes here... 
} 


} 
