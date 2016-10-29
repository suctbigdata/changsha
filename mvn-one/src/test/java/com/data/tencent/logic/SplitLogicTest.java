package com.data.tencent.logic;

import com.data.tencent.pojo.ItemData;
import com.data.tencent.pojo.ShowData;
import com.data.tencent.utils.Constant;
import com.data.tencent.utils.InfoKey;
import com.data.tencent.utils.NumberUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * SplitLogic Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>2016</pre>
 */
public class SplitLogicTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: splitMul()
     */
    @Test
    public void testSplitMul() throws Exception {
//TODO: Test goes here...
        List<ItemData> list = new ArrayList<ItemData>();

        String str1 = "固定资产投资  7月止完成全社会固定资产投资802.38亿元，同比增长31.97%，增幅提升1.95个百分点。城镇以上固定资产投资734.67亿元，增长34.99%。更新改造投资141.45亿元，增长56.37%，房地产开发投资221.85亿元，增长43.03%。";
        String str0 = " 固定资产投资  2月止完成固定资产投资248.26亿元，同比增长26.2%。城镇以上固定资产投资238.92亿元，增长24.3%。更新改造投资55.27亿元，增长31.2%，房地产开发投资79.06亿元，增长38.4%。商品房销售面积增长22.8%；住宅销售额增长57.3%。";
        String str2 = "固定资产投资  1-7月份，完成固定资产投资3603.57亿元，同比增长14.4%，增幅回落1.9个百分点。技改投资804.96亿元，增长9.2%，房地产开发投资684.29亿元，增长10.6%。商品房销售面积1271.31万平方米，增长25.4%；其中住宅销售面积1121.48万平方米，增长23.5%。";
        String str3 = "完成固定资产投资4903.99亿元，同比增长13.7%，增幅回落3.0个百分点。技改投资1039.38亿元，下降3.4%，房地产开发投资924.43亿元，增长19.5%。商品房销售面积1734.90万平方米，增长30.3%；其中住宅销面积1552.63万平方米，增长31.4%。";
        String[] strs = {str0, str1, str2,str3};
        SplitLogic sl = new SplitLogic();
        for (String str : strs) {
            String[] info = str.split(Constant.symbol);
            for (int i=0;i<info.length;i++) {
                info[i] = info[i].trim();
                if(!NumberUtils.isContainDouble(info[i])){
                    continue;
                }
                if (!"".equals(info[i])) {
                  System.out.println("==========="+info[i]);
                    String key = sl.removeMo(info[i]);
//                    System.out.println(sl.getKeyInfoAndSObject(key));
                    list.add(sl.getKeyInfoAndSObject(key));
                }
            }
            System.out.println("---------------------");
        }

        Map<String,List> show = new HashMap<>();

        System.out.println("---------------------------------------------------------------");
        String menu_show = "";
        for(ItemData itemData:list){
            if(itemData.getType() == Constant.clear_type){
                menu_show = itemData.getIndexName(); // 显示名称
            }else{
                menu_show = menu_show+itemData.getIndexName();
            }
            for(InfoKey index : InfoKey.values()){
                if(index.getInfo().equals(itemData.getIndexName())){

                }
            }
        }

    }

    @Test
    public void testPl(){

        System.out.println(NumberUtils.isContainDouble("城镇以上固定资产投资亿元"));
        String str3 = "完成固定资产投资4903.99亿元，同比增长13.7%，增幅回落3.0个百分点。技改投资1039.38亿元，下降3.4%，房地产开发投资924.43亿元，增长19.5%。商品房销售面积1734.90万平方米，增长30.3%；其中住宅销面积1552.63万平方米，增长31.4%。";
        String[] info = str3.split(Constant.symbol);
        SplitLogic sl = new SplitLogic();
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
                    System.out.println("一个item 数据：" + itemData);
                }
            }
        }
    }

}
