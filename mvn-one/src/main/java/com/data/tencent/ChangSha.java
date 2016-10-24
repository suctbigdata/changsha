package com.data.tencent;

import com.data.tencent.servies.AccessService;
import com.data.tencent.servies.DealService;
import com.data.tencent.servies.ExportService;
import com.data.tencent.servies.impl.ChangShaDeal;
import com.data.tencent.servies.impl.StaticsLoad;
import com.data.tencent.servies.impl.WriteData;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/10/23.
 */
public class ChangSha {


    /**
     * 主要逻辑
     * 接入数据
     * 处理数据
     * 导出数据
     * @throws Exception
     */
    public void exe() throws Exception{

        String path_tmp = "E:\\tmp\\chanshadata";
        List<String[]> statics = access.loadData(path_tmp);
        String Fileinfo = access.loadFileInfo();

        String [][] show = dealService.dealStatic(statics,Fileinfo);
        Map<String,String> out = dealService.showData(show);
        if(out == null){
            throw new Exception("数据为空");
        }
        String xdata = Fileinfo.endsWith(",")?Fileinfo.substring(0,Fileinfo.length()-1):Fileinfo;
        String[] outStr = {out.get("title"),xdata,out.get("ydata")};
        exportService.export(outStr);

    }

    private AccessService access;
    private DealService dealService;
    private ExportService exportService;

    public ChangSha(){
        access = new StaticsLoad();
        dealService = new ChangShaDeal();
        exportService = new WriteData();
    }

    public static void main(String[] args){
        try {
            new ChangSha().exe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
