package com.data.tencent.thread;

import com.data.tencent.Jsoup.Demo;
import com.data.tencent.utils.Constant;
import com.data.tencent.utils.FileOption;
import com.data.tencent.utils.HtmlContentUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Administrator on 2016/10/29.
 */
public class SonThread  {

    private static Log logger = LogFactory.getLog(SonThread.class);

    private String url;
    private String file;
    private String page;

    public SonThread(String url,String file,String page){

        this.file = Constant.LOADFILE  + getFileName(file)+".txt";
        this.url = url;
        this.page =page;
    }

    public void execute() {
        try {
            sonpageContent(url);
        } catch (IOException e) {
            logger.error(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String getFileName(String file){
        String month = "";
        if(file.indexOf("-") == -1){
            month = file.substring(file.indexOf("年")+1,file.indexOf("月"));
            if(month.length() == 1){
                month = "0"+month;
            }
            return file.substring(0,4) + "-"+ month;
        }else {
            month = file.substring(file.indexOf("-"), file.indexOf("月"));
            if(month.length() == 1){
                month = "0"+month;
            }
            return file.substring(0, 4) + month;
        }
    }

    private void sonpageContent(String linkHref) throws Exception {
        String connect = Constant.PageURL + url;

        logger.info("-connect son page "+connect);

        String info_ = "";
        Document doc = Jsoup.parse(HtmlContentUtil.getHtmlContent(connect));
        Elements body_ = doc.select("div.content");
        if (body_ == null) {
            throw new Exception("无数据");
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
                logger.info(str.replaceAll(" ", ""));
                info_ += str.replaceAll(" ", "") +"\n";
            }
        }
        if(!StringUtils.isEmpty(info_.trim())){
            saveSonPageContent(info_ ,file,true);
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
