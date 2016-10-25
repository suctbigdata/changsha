package com.data.tencent.logic;

import com.data.tencent.utils.Constant;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

        String str1 = "固定资产投资  7月止完成全社会固定资产投资802.38亿元，同比增长31.97%，增幅提升1.95个百分点。城镇以上固定资产投资734.67亿元，增长34.99%。更新改造投资141.45亿元，增长56.37%，房地产开发投资221.85亿元，增长43.03%。";
        String str0 = " 固定资产投资  2月止完成固定资产投资248.26亿元，同比增长26.2%。城镇以上固定资产投资238.92亿元，增长24.3%。更新改造投资55.27亿元，增长31.2%，房地产开发投资79.06亿元，增长38.4%。商品房销售面积增长22.8%；住宅销售额增长57.3%。";
        String str2 = "固定资产投资  1-7月份，完成固定资产投资3603.57亿元，同比增长14.4%，增幅回落1.9个百分点。技改投资804.96亿元，增长9.2%，房地产开发投资684.29亿元，增长10.6%。商品房销售面积1271.31万平方米，增长25.4%；其中住宅销售面积1121.48万平方米，增长23.5%。";
        String[] strs = {str0, str1, str2};
        SplitLogic sl = new SplitLogic();
        for (String str : strs) {
            String[] info_ = str.split(" ");
            for (String index : info_) {
                index = index.trim();
                if (!"".equals(index)) {
                    for (String info : index.split(Constant.symbol)) {
                        System.out.println(info);
                        sl.getKeyInfo(sl.removeMo(info));
                    }
                }
            }
            System.out.println("---------------------");
        }

    }



}
