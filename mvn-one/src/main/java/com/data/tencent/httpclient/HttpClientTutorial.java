package com.data.tencent.httpclient;

import com.data.tencent.utils.Constant;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.*;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

public class HttpClientTutorial {

    private static String url = Constant.page1;

    public static void main(String[] args) {
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

            Document doc= Jsoup.parse(new String(responseBody));

            Element body = doc.select("div.c1-body").first();
            // 找出定义了 class=masthead 的元素
            Elements contents = body.select("div.c1-bline");
            for (Element content : contents) {
                Element link = content.select("div").select("a").get(1);
                String linkHref = link.attr("href");
                String linkText = link.text();
                System.out.println("-------------------------");
                System.out.println(linkHref+","+linkText);
//                copyTofile("------------------------------");
//                copyTofile(linkHref+","+linkText +"\n");
//                readStatics(linkHref);
            }
            // Deal with the response.
            // Use caution: ensure correct character encoding and is not binary data
//            System.out.println(new String(responseBody));

        } catch (HttpException e) {
            System.err.println("Fatal protocol violation: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Fatal transport error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Release the connection.
            method.releaseConnection();
        }
    }
}
