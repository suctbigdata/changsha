package com.data.tencent.utils;

import java.io.*;

/**
 * Created by Administrator on 2016/10/29.
 */
public class FileOption {


    public static final void WriteData(String data,String file,boolean append) throws IOException {
//        System.out.println(file);
        File file1 = new File(file);

        if(!file1.exists()){
            if (!createFile(file1))
            {
                throw new IOException("Error creating new file: " + new File(file).getAbsolutePath());
            }
        }
        FileOutputStream fos = new FileOutputStream(file,append);
        BufferedWriter o = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8" ));
        o.write(data+"\n");
        o.close();
    }

    public static final boolean createFile(File file) throws IOException {
        if(! file.exists()) {
            makeDir(file.getParentFile());
        }
        return file.createNewFile();
    }

    /**
     * Enhancement of java.io.File#mkdir()
     * Create the given directory . If the parent folders don't exists, we will create them all.
     * @see java.io.File#mkdir()
     * @param dir the directory to be created
     */
    public static final void makeDir(File dir) {
        if(! dir.getParentFile().exists()) {
            makeDir(dir.getParentFile());
        }
        dir.mkdir();
    }
}
