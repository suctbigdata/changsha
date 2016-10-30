package com.data.tencent.servies.impl;

import com.data.tencent.logic.SplitLogic;
import com.data.tencent.pojo.ItemData;
import com.data.tencent.pojo.OrgData;
import com.data.tencent.pojo.ShowData;
import com.data.tencent.servies.DealService;
import com.data.tencent.utils.Constant;
import com.data.tencent.utils.NumberUtils;
import com.data.tencent.utils.StringFormater;
import com.data.tencent.utils.TitleFormater;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

/**
 * Created by Administrator on 2016/10/23.
 */
public class ChangShaDeal extends DealService {

    private static Log logger = LogFactory.getLog(ChangShaDeal.class);

    private SplitLogic sl;

    public ChangShaDeal() {
        sl = new SplitLogic();
    }


    @Override
    public List<ShowData> convertToShowData(List list) {

        List<ShowData> showDataList = new ArrayList<>();

        for (Object object : list) {
            OrgData orgData = (OrgData) object;

            String[] info = orgData.getData().split(Constant.symbol);
            for (int i = 0; i < info.length; i++) {
                info[i] = info[i].trim();
                if (!NumberUtils.isContainDouble(info[i])) {
                    continue;
                }
                if (!"".equals(info[i])) {
                    String key = sl.removeMo(info[i]);
                    // 根据字符特征 将数据转为 itemData 对象
                    ItemData itemData = sl.getKeyInfoAndSObject(key);
                    if (itemData != null) {
                        // item 数据 转 showData 三维
//                        logger.info("一个item 数据：" + itemData);
                        ShowData showData = item2show(orgData.getDate(), itemData);
//                        logger.info("一个show 数据：" + showData);
                        showDataList.add(showData);
                    }
                }
            }
        }
        return showDataList;
    }


    Set<String> showName_set = new TreeSet<>();

    private String showName = "";

    /**
     * 将item 数据中没有完整 title 添加完整信息
     * 如增长 修改为 **增长
     *
     * @param date
     * @param item
     * @return
     */
    private ShowData item2show(String date, ItemData item) {

        String showName_tpm = "";
        if (item.getType() == Constant.clear_type) {
            showName = item.getIndexName(); // 显示名称
            // 缓存一个 showname
            showName_tpm = showName;
        } else {
            showName_tpm = showName;  // 避免连续 趋势 叠加
            showName = showName + item.getIndexName(); // 显示名称 + 趋势
        }
        showName_set.add(showName);
        ShowData showData = new ShowData(date, showName, item.getDetail());
        showName = showName_tpm;
        return showData;
    }

    @Override
    public String showData(String xdata, Set<String> showname_set, List<ShowData> showDataList) {
        return formaterShowData(dealDataTileFormat(xdata, showDataList));
    }

    @Override
    public Set<String> getShowNameSet() {
        return showName_set;
    }

    /**
     * 获取每个分类，在每个时间刻度的数据
     *
     * @param xdata
     * @param showname_set
     * @param showDataList
     * @return
     */
    private Map<String, String> dealData(String xdata, Set<String> showname_set, List<ShowData> showDataList) {

        Map<String, String> result = new HashMap<>();
        Map<String,Integer> title_  = new HashMap<>();
        Map<String,Integer> time_ = new HashMap<>();

        int i = 0;
        for(String x_:xdata.split("\\,")){
            time_.put(x_,i++);
        }
        int j = 0;
        String[] titleArray = new String[showname_set.size()];
        for(String t_:showname_set){
            titleArray[j] = t_;
            title_.put(t_,j++);
        }

        logger.info("初始化一个 数组 大小是" + j +"*"+i);
        String[][] tmp_result = new String[j][i];


        for (ShowData showData : showDataList) {
            tmp_result[title_.get(showData.getShowName())][time_.get(showData.getdate())] = showData.getValues();
        }
        for(int jj=0;jj<j;jj++){
            String type = titleArray[jj];
            String value = "";
            for(int ii=0;ii<i;ii++){
                value += (StringUtils.isEmpty(tmp_result[jj][ii])?"0":tmp_result[jj][ii] )+",";
            }
            result.put(type,value);
        }

        return result;
    }

    /**
     * 获取每个分类，在每个时间刻度的数据
     *
     */
    private Map<String, String> dealDataTileFormat(String xdata, List<ShowData> showDataList) {

        Map<String, String> result = new HashMap<>();
        Map<String,Integer> title_  = new HashMap<>();
        Map<String,Integer> time_ = new HashMap<>();

        int i = 0;
        for(String x_:xdata.split("\\,")){
            time_.put(x_,i++);
        }
        int j = 0;
        String[] titleArray = StringFormater.getTitleFormaterArray();
        for(String t_:titleArray){
            title_.put(t_,j++);
        }

        logger.info("初始化一个 数组 大小是" + j +"*"+i);
        String[][] tmp_result = new String[j][i];


        for (ShowData showData : showDataList) {
            if(!StringUtils.isEmpty(showData.getValues())) {
                // 非空添加到数据
                String realTitle = "";
                if(!StringUtils.isEmpty(realTitle = StringFormater.titleFormaterMatch(showData.getShowName()))){
                    if(!StringUtils.isEmpty(tmp_result[title_.get(realTitle)][time_.get(showData.getdate())])){
                        logger.error("覆盖了一个非零数据 原title " + showData.getShowName());
                        logger.error("原来数据:" + realTitle + "," + showData.getdate() +"," + tmp_result[title_.get(realTitle)][time_.get(showData.getdate())]);
                        logger.error("新数据:" + realTitle + "," + showData.getdate() +"," + showData.getValues());
                    }
                    tmp_result[title_.get(realTitle)][time_.get(showData.getdate())] = showData.getValues();
                }else{
                    logger.error("有一个没有匹配的数据 ：" + showData );
                }
            }
        }
        // 将数组中是数据 按照title 类型组合
        for(int jj=0;jj<j;jj++){
            String type = titleArray[jj];
            String value = "";
            for(int ii=0;ii<i;ii++){
                value += (StringUtils.isEmpty(tmp_result[jj][ii])?"0":tmp_result[jj][ii] )+",";
            }
            result.put(type,value);
        }

        return result;
    }

    /**
     * 将数据整理为echart 可以识别的格式
     * 只有 series
     *
     * @param showData
     * @return
     */
    private String formaterShowData(Map<String, String> showData) {


        String sumYdata = "";
        String key = "";
        String value = "";

        Iterator it = showData.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            key = entry.getKey().toString();
            value = entry.getValue().toString();
            String ydata = "";
            ydata += "{ name:'" + key + "',\n" + " type:'bar',\n";
            ydata += "data:[";
            ydata += value.endsWith(",") ? value.substring(0, value.length() - 1) : value;
            ydata += "]},";
            sumYdata += ydata;
        }
        sumYdata = sumYdata.endsWith(",") ? sumYdata.substring(0, sumYdata.length() - 1) : sumYdata;
        return sumYdata;
    }


    @Override
    public Map<String, String> showData(String[][] show) {
        if (show == null) {
            return null;
        }
        String title = "";
        String sumydata = "";
        String ydata = "";
        Map result = new HashMap<String, String>();
        for (int m = 0; m < show[0].length - 1; m++) {
            title += "\"" + Constant.TITLE_name[m] + "\"" + ",";
            StringBuffer ydata1 = new StringBuffer();
            System.out.println("-----------------------------------");
            sumydata += "{ name:'" + Constant.TITLE_name[m] + "',\n" + " type:'bar',\n";
            sumydata += "data:[";
            for (int l = 0; l < show.length; l++) {
                System.out.print(show[l][m]);
                ydata1.append(show[l][m]);
            }
            sumydata += ydata1.toString().endsWith(",") ? ydata1.toString().substring(0, ydata1.toString().length() - 1) : ydata1.toString();
            sumydata += "]},";
            System.out.println();
        }
        ydata += sumydata.trim();
        title = title.endsWith(",") ? title.substring(0, title.length() - 1) : title;
        ydata = ydata.endsWith(",") ? ydata.substring(0, ydata.length() - 1) : ydata;
        result.put("title", title);
        result.put("ydata", ydata);
        return result;
    }

}
