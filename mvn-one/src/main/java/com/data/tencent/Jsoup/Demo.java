package com.data.tencent.Jsoup;

import com.data.tencent.servies.impl.WriteData;
import com.data.tencent.utils.Constant;
import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
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
//            demo.indexInfo(Constant.page2);
//            demo.indexInfo(Constant.page3);
//            demo.indexInfo(Constant.page4);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private WriteData writeData;

    public Demo() {
        writeData = new WriteData();
    }

    public void indexInfo(String page) throws IOException {
        System.out.println(page);
        Document doc = Jsoup.parse(getHtmlContent(page));


        Element body = doc.select("div.c1-body").first();
        // 找出定义了 class=masthead 的元素
        Elements contents = body.select("div.c1-bline");
        for (Element content : contents) {
            Element link = content.select("div").select("a").get(1);
            String linkHref = link.attr("href");
            String linkText = link.text();
            System.out.println("-------------------------");
            System.out.println(linkHref + "," + linkText);
            copyTofile("------------------------------");
            copyTofile(linkHref + "," + linkText + "\n");

            new Thread(new SonThread(linkHref)).start();
        }

    }

    class SonThread extends Thread{

        private String url;
        private String file;
        public SonThread(String url){
            this.setName(url.substring(url.lastIndexOf("/")-6,url.lastIndexOf("/")));
            this.file = Constant.LOADFILE +  url.substring(url.lastIndexOf("/")-6,url.lastIndexOf("/"))+".txt";
            this.url = url;
        }
        @Override
        public void run() {
            try {
                readStatics(Constant.PageURL+url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void readStatics(String url) throws IOException {
            String connect = Constant.PageURL + url;
            System.out.println(connect);

            Document doc = Jsoup.parse(getHtmlContent(connect));

            Elements body_ = doc.select("div.content");
            // 找出定义了 class=masthead 的元素
            Elements contents_ = body_.select("div");

            for (Element content_ : contents_) {
                Elements links = content_.select("div");
                for (int i = 1; i < links.size(); i++) {

                    String info_ = "";
                    for (Element info : links.get(i).select("b")) {
                        info_ += info.text();
                    }

                    System.out.println(info_ + "\n=====" + links.get(i).text());
                    copyTofile(info_ + "\n=====" + links.get(i).text(),file);
                }

            }
        }
    }

    public void readStatics(String url,String file) throws IOException {
        String connect = Constant.PageURL + url;
        System.out.println(connect);
        Document doc = Jsoup.parse(getHtmlContent(connect));

        Elements body_ = doc.select("div.content");
        // 找出定义了 class=masthead 的元素
        Elements contents_ = body_.select("div");

        for (Element content_ : contents_) {
            Elements links = content_.select("div");
            for (int i = 1; i < links.size(); i++) {

                String info_ = "";
                for (Element info : links.get(i).select("b")) {
                    info_ += info.text();
                }

                System.out.println(info_ + "\n=====" + links.get(i).text());
                copyTofile(info_ + "\n=====" + links.get(i).text(),file);
            }

        }
    }

    public void copyTofile(String data) {
        String file = Constant.INITINFO;
        try {
            writeData.WriteData(data, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copyTofile(String data,String file) {
//        String file = Constant.INITINFO;
        try {
            writeData.WriteData(data, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getHtmlContent(String url) {

        // Create an instance of HttpClient.
        HttpClient client = new HttpClient();

        // Create a method instance.
        GetMethod method = new GetMethod(url);

        // Provide custom retry handler is necessary
        method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
                new DefaultHttpMethodRetryHandler(3, false));

        try {
            // Execute the method.
            int statusCode = client.executeMethod(method);

            if (statusCode != HttpStatus.SC_OK) {
                System.err.println("Method failed: " + method.getStatusLine());
            }

            // Read the response body.
            byte[] responseBody = method.getResponseBody();

            return new String(responseBody);
        } catch (HttpException e) {
            System.err.println("Fatal protocol violation: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Fatal transport error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Release the connection.
            method.releaseConnection();
            method = null;
            client = null;
        }

        return null;
    }
}
