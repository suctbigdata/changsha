package com.data.tencent;

import com.data.tencent.utils.Constant;
import com.data.tencent.utils.FileOption;
import com.data.tencent.utils.TitleFormater;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Unit test for simple App.
 */
public class  AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
         final  String rootPath = (new File("")).getAbsolutePath();
        System.out.println(rootPath);
    }


    public void testFile(){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        StringBuffer sb = new StringBuffer();
        sb.append("-----------" + sdf.format(new Date()) + "------------\n");
        try {
            FileOption.WriteData(sb.toString(),
                    "E:\\project\\github\\changsha\\mvn-one\\src\\main\\resources\\echart.txt",
                    false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("ok");
    }
    public void testWriteF(){
        String file = Constant.INITINFO;

    }

    public void testString(){
        String la = "/static/ydkb/20150324/28178.html";
        System.out.println(la.substring(la.lastIndexOf("/")-6,la.lastIndexOf("/")));
    }

    public void testGet(){
        String la = " '住宅销售面积','住宅销售面积增长','住宅销面积','住宅销面积增长','全社会固定资产投资','全社会固定资产投资增长','商品房销售面积','商品房销售面积下降','商品房销售面积增幅回落','商品房销售面积增长','固定资产投资','固定资产投资下降','固定资产投资同比回落','固定资产投资同比提升','固定资产投资增幅回升','固定资产投资增幅回落','固定资产投资增长','工业投资','工业投资增长','房地产开发投资','房地产开发投资下降','房地产开发投资增幅回落','房地产开发投资增幅提升','房地产开发投资增长','技改投资','技改投资下降','技改投资增长','更新改造投资','更新改造投资增幅回落','更新改造投资增幅提升','更新改造投资增长','民生投资','民生投资增长'";
        for(String str:la.split(",")){
            System.out.println(str.trim().substring(1,str.trim().length()-1));
        }
    }

    public void testLine() {
        String line = "完成固定资产投资406.01亿元，同比增长4.2%，增幅回落 21.3个百分点。技改投资112.79亿元，增长2.1%，房地产开发投资132.49亿元，下降12.0%。商品房销售面积127.04万平方米，下降28.4%；住宅销售额61.82亿元，下降29.9%。";
//        dealString(line);
        String la = "2015年1-11月长沙经济运行快报";
        String time = la.substring(0,4) + la.substring(la.indexOf("-"),la.indexOf("月"));
        System.out.println(time);

        String new_time = "";
        for(TitleFormater titleFormater:TitleFormater.values()){
            if(titleFormater.isShow())
                ;
            else
                new_time += "'" + titleFormater.getTlKey() + "':false,";
        }
        new_time = new_time.endsWith(",")?new_time.substring(0,new_time.length()-1):new_time;
        System.out.println(new_time);

    }

    public void testRegix() {
        String s = "s558.1zxv-85w558kkk -1!@2";
        String line = "完成固定资产投资406.01亿元，同比增长4.2%，增幅回落 21.3个百分点。技改投资112.79亿元，增长2.1%，房地产开发投资132.49亿元，下降12.0%。商品房销售面积127.04万平方米，下降28.4%；住宅销售额61.82亿元，下降29.9%。";
        for (String ss : line.split("[^-?0-9.]")) {
            if (!ss.equals("")) {
                System.out.println(ss);
//                d[i++]=Double.valueOf(ss);
            }
        }
        System.out.println("ok");
    }


    public void createFlie() {

        try {
            String path_tmp = "E:\\tmp\\chanshadata";
            for (int i = 15; i <= 16; i++) {
                for (int j = 2; j <= 12; j++) {
                    String path = path_tmp + "\\" + i + "-" + j + ".txt";
                    File file = new File(path);
                    if (!file.exists()) {
                        System.out.println(file.getAbsoluteFile());
                        file.createNewFile();
                    }
                }
            }

        } catch (Exception e) {

        }
    }

    //写文件，支持中文字符，在linux redhad下测试过

    public void testWriteLog(String str) {

    }

}
