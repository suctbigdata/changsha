package com.data.tencent.Jsoup;

import com.data.tencent.servies.impl.WriteData;
import com.data.tencent.utils.Constant;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Administrator on 2016/10/23.
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println("");
        try {
            Demo demo = new Demo();
            demo.indexInfo(Constant.page1);
            demo.indexInfo(Constant.page2);
            demo.indexInfo(Constant.page3);
            demo.indexInfo(Constant.page4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private WriteData writeData;

    public Demo(){
        writeData = new WriteData();
    }

    public void indexInfo(String page) throws IOException {

        Document doc = Jsoup.connect(page)
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
            copyTofile("------------------------------");
            copyTofile(linkHref+","+linkText +"\n");
            readStatics(linkHref);
        }

    }

    public void readStatics(String url) throws IOException {
        String connect = Constant.PageURL+url;
        System.out.println(connect);
        Document doc = Jsoup.connect(connect)
//                .cookie("auth", "token") // 设置 cookie
                .timeout(30000)           // 设置连接超时时间
                .get();

        Elements body_ = doc.select("div.content");
        // 找出定义了 class=masthead 的元素
        Elements contents_ = body_.select("div");

        for (Element content_ : contents_) {
            Elements links = content_.select("div");
            for(int i=1;i<links.size();i++){

                String info_ = "";
                for(Element info:links.get(i).select("b")) {
                    info_ += info.text();
                }

                System.out.println(info_+"\n====="+links.get(i).text());
                copyTofile(info_+"\n====="+links.get(i).text());
            }

        }
    }

    public void copyTofile(String data )  {
        String file = Constant.INITINFO;
        try {
            writeData.WriteData(data,file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
