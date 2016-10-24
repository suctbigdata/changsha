package com.data.tencent;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.File;
import java.io.FileOutputStream;
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
        assertTrue( true );
    }



    public void testLine() {
        String line = "完成固定资产投资406.01亿元，同比增长4.2%，增幅回落 21.3个百分点。技改投资112.79亿元，增长2.1%，房地产开发投资132.49亿元，下降12.0%。商品房销售面积127.04万平方米，下降28.4%；住宅销售额61.82亿元，下降29.9%。";
//        dealString(line);
    }

    public void testRegix() {
        String s = "s558.1zxv-85w558kkk -1!@2";
        for (String ss : s.split("[^-?0-9.]")) {
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
    public void writeLog(String str) {
        try {
            String path = "/root/test/testfilelog.log";
            File file = new File(path);
            if (!file.exists())
                file.createNewFile();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            FileOutputStream out = new FileOutputStream(file, false); //如果追加方式用true
            StringBuffer sb = new StringBuffer();
            sb.append("-----------" + sdf.format(new Date()) + "------------\n");
            sb.append(str + "\n");
            out.write(sb.toString().getBytes("utf-8"));//注意需要转换对应的字符集
            out.close();
        } catch (IOException ex) {
            System.out.println(ex.getStackTrace());
        }
    }

}
