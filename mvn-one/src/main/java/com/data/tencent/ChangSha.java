package com.data.tencent;

import com.data.tencent.pojo.OrgData;
import com.data.tencent.pojo.ShowData;
import com.data.tencent.servies.AccessService;
import com.data.tencent.servies.DealService;
import com.data.tencent.servies.ExportService;
import com.data.tencent.servies.impl.ChangShaDeal;
import com.data.tencent.servies.impl.StaticsLoad;
import com.data.tencent.servies.impl.WriteData;
import com.data.tencent.utils.Constant;
import com.data.tencent.utils.StringFormater;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2016/10/23.
 */
public class ChangSha {

    /**
     * 日志类.
     */
    private static Log logger = LogFactory.getLog(ChangSha.class);

    /**
     * 主要逻辑
     * 接入数据
     * 处理数据
     * 导出数据.
     * @throws Exception 无效.
     */
     public final void exe() throws Exception {

        String path_tmp = Constant.LOADFILE;

        // 从文件中获取 原始的地产数据  -一行
        List<OrgData> orgDataList = access.loadData(path_tmp);
        if (orgDataList == null || orgDataList.size() == 0) {
            throw new Exception("数据为空");
        }
        // 时间刻度
        String xdata = access.getXdata();

        // 将其变成有三个维度的数据  时间，显示名，值
        List<ShowData> show = dealService.convertToShowData(orgDataList);
        if (show == null || show.size() == 0) {
            throw new Exception("数据为空 -");
        }

       // 获取分类
        Set<String> showname_set = null;
        showname_set = dealService.getShowNameSet();
        // 生成 serveries
        String out = dealService.showData(xdata, showname_set, show);
        if (out == null) {
            throw new Exception("数据为空");
        }

//        String showTitle = StringUtils.join(showname_set,",");
        logger.info("xdata = " + StringFormater.formaterTime(xdata));
        logger.info("showtitle = " + StringFormater.titleFormater());
        String selectFalse = StringFormater.selectFalse();
        String[] outStr = {StringFormater.titleFormater(), StringFormater.formaterTime(xdata), out, selectFalse};
        exportService.export(outStr);
        exportService.writeTojs();

    }

    /**
     * 读取文件.
     */
    private AccessService access;
    /**
     * 处理数据.
     */
    private DealService dealService;
    /**
     * 导出成网页.
     */
    private ExportService exportService;

    /**
     * 函数入口.
     */
    public ChangSha() {
        // 初始化数据
        access = new StaticsLoad();
        dealService = new ChangShaDeal();
        exportService = new WriteData();
    }

    /**
     * 函数入口.
     * @param args 输入参数为空.
     *             .
     */
    public static void main(final String[] args) {
        try {
            new ChangSha().exe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
