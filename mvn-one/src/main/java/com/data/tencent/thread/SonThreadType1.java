package com.data.tencent.thread;

import com.data.tencent.utils.Constant;
import com.data.tencent.utils.FileOption;
import com.data.tencent.utils.HtmlContentUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Administrator on 2016/10/29.
 */
public class SonThreadType1  {

    private static Log logger = LogFactory.getLog(SonThreadType1.class);

    private String url;
    private String file;


    public SonThreadType1(String url,String file){
        this.file = Constant.LOADFILE  + getFileName(file)+".txt";
        this.url = url;
    }

    public SonThreadType1() {

    }

    public SonThreadType1(String url) {
        this.url = url;
    }

    public void execute() {
        try {
            sonpageContent(url);
        } catch (IOException e) {
            logger.error(e);
        }
    }
    private String getFileName(String file){
        if(file.indexOf("-") == -1){
            return file.substring(0,4) + file.substring(file.indexOf("年")+1,file.indexOf("月"));
        }else {
            return file.substring(0, 4) + file.substring(file.indexOf("-"), file.indexOf("月"));
        }
    }

    private void sonpageContent(String url) throws IOException {
        String connect = Constant.PageURL + url;
        logger.info( "-connect son page "+connect);

        Document doc = Jsoup.parse(HtmlContentUtil.getHtmlContent(connect));

        Elements body_ = doc.select("div.content");
        if(body_ == null){

        }
        // 找出定义了 class=masthead 的元素
        Elements contents_ = body_.select("div");

        if(contents_ == null){

        }

        for (Element content_ : contents_) {
            Elements links = content_.select("span");
            for (int i = 1; i < links.size(); i++) {
                String info_ = "";

                for (Node info : links.get(i).childNodes()) {
                    try {
                        info_ += ((TextNode) info).text();
                    }catch (Exception e){
                        info_ += "\n";
                    }
                }
                logger.info(info_);
                saveSonPageContent(info_ ,file,true);
            }

        }
    }


    /**
     *
     * @param data
     * @param file
     * @param append
     */
    private void saveSonPageContent(String data,String file,boolean append) {

        try {
            FileOption.WriteData(data, file,append);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
