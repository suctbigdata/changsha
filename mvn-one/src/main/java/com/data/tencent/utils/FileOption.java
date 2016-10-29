package com.data.tencent.utils;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by Administrator on 2016/10/29.
 */
public class FileOption {


    public static final void WriteData(String data,String file,boolean append) throws IOException {

        FileOutputStream fos = new FileOutputStream(file,append);
        BufferedWriter o = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8" ));
        o.write(data+"\n");
        o.close();
    }
}
