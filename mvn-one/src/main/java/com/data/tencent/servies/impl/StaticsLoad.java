package com.data.tencent.servies.impl;

import com.data.tencent.ChangSha;
import com.data.tencent.dao.Dao;
import com.data.tencent.dao.impl.ReadFile;
import com.data.tencent.pojo.OrgData;
import com.data.tencent.servies.AccessService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Administrator on 2016/10/23.
 */
public class StaticsLoad extends AccessService {


    private static Log logger = LogFactory.getLog(StaticsLoad.class);

    private Dao loadData;
    private String time = "";

    public StaticsLoad(){
        this.loadData = new ReadFile();
    }

    /**
     * 读取已经下载到本地的长沙经济数据
     * @param path
     * @return
     * @throws Exception
     */
    public List<OrgData> loadData(String path) throws Exception {

        File father = new File(path);
        File[] sons = null;
        if (father.exists()) {
            sons = father.listFiles();
        }
        if(sons == null||sons.length == 0){
            throw new Exception("文件夹为空");
        }
        List<OrgData> result = new ArrayList<OrgData>();
        int num = 0;
        for(File son:sons){
            if (son.exists() && son.length() > 1l) {
                logger.info("fileName="+son.getAbsolutePath());
                String resultData;
                if ((resultData = loadData.loadMatchData(son.getAbsolutePath())) != null) {
                    time += getFileValue(son.getName()) +",";
                    logger.info("原始地产数据-----"+getFileValue(son.getName()) +" ," + resultData);
                    result.add(new OrgData(getFileValue(son.getName()),resultData));
                }
            }
//            if(num++>2)
//                break;
        }
        return result;
    }

    private String getFileValue(String fileName){
        return fileName.split("\\.")[0];
    }

    @Override
    public String getXdata() {
        return time.endsWith(",")?time.substring(0,time.length()-1):time;
    }
}
