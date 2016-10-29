var option_self = {    title : {        text: '长沙地区',        subtext: '来源长沙统计局'    },    tooltip : {        trigger: 'axis'    },    legend: {        data:['住宅销售面积','住宅销售面积增长','住宅销面积','住宅销面积增长','全社会固定资产投资','全社会固定资产投资增长','商品房销售面积','商品房销售面积下降','商品房销售面积增幅回落','商品房销售面积增长','固定资产投资','固定资产投资下降','固定资产投资同比回落','固定资产投资同比提升','固定资产投资增幅回升','固定资产投资增幅回落','固定资产投资增长','工业投资','工业投资增长','房地产开发投资','房地产开发投资下降','房地产开发投资增幅回落','房地产开发投资增幅提升','房地产开发投资增长','技改投资','技改投资下降','技改投资增长','更新改造投资','更新改造投资增幅回落','更新改造投资增幅提升','更新改造投资增长','民生投资','民生投资增长']    },    toolbox: {        show : true,        feature : {            mark : {show: true},            dataView : {show: true, readOnly: false},            magicType : {show: true, type: ['line', 'bar']},            restore : {show: true},            saveAsImage : {show: true}        }    },    calculable : true,    xAxis : [        {            type : 'category',            data : ['2010-07','2010-08','2010-09','2010-10','2010-11','2010-12','2011-01','2011-10','2011-11','2011-12','2011-2','2011-3','2011-5','2011-7','2011-8','2011-9','2012-10','2012-11','2012-12','2012-2','2012-3','2012-4','2012-5','2012-6','2012-7','2012-8','2012-9','2013-10','2013-11','2013-12','2013-2','2013-3','2013-4','2013-5','2013-6','2013-7','2013-8','2013-9','2014-10','2014-11','2014-12','2014-2','2014-3','2014-4','2014-5','2014-6','2014-7','2014-8','2014-9','2015-10','2015-11','2015-12','2015-2','2015-3','2015-4','2015-5','2015-6','2015-7','2015-8','2015-9','2016-2','2016-3','2016-4','2016-5','2016-6','2016-7','2016-8','2016-9']        }    ],    yAxis : [        {            type : 'value'        }    ],    series : [        { name:'住宅销面积',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1341.82,1500.14,1684.11,0,287.29,0,0,772.43,908.37,1021.95,1181.18,146.45,345.81,539.31,758.07,969.48,0,0,1552.63]},{ name:'固定资产投资同比提升',
    type:'bar',
    data:[9.2,5.7,4.7,2.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6.8,0.9,0.8,0,22.9,18.5,7.2,0,0,1.4,0,0,0,0,0,0,3.8,9.5,7.6,0.1,2.1,1.1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资',
    type:'bar',
    data:[418.58,498.59,574.84,654.47,697.78,753.14,0,903.5,949.3,961.4,55.27,158.87,348.4,586.2,659.4,748.7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资增幅提升',
    type:'bar',
    data:[0,0,0,0,0,2.8,0,0,0,5.8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'房地产开发投资下降',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2.2,-5.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-21.7,-24.6,-24.0,-12.0,0,-0.2,-1.6,-8.7,-11.4,-16.9,-19.9,-11.0,0,0,0,0,0,0,0]},{ name:'工业投资',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,126.77,0,0,0,0,0,0,0]},{ name:'技改投资下降',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-6.8,-7.3,0,0,0,0,0,0,0,0,0,0,0,-1.8,-3.4]},{ name:'住宅销面积增长',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,40.1,34.1,26.4,0,14.5,0,0,48.8,46.0,43.5,43.4,33.1,20.4,23.8,28.6,25.5,0,0,31.4]},{ name:'技改投资',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1117.67,1210.09,1302.85,78.48,200.87,325.95,478.11,693.11,798.59,928.5,1042.79,1365.09,1551.46,1635.62,75.83,238.64,401.09,537.2,766.69,887.48,1047.27,1206.22,1595.82,1729.84,1816.57,110.51,302.78,497.96,678.74,946.04,1098.65,1274.49,1446.99,1812.58,2061.78,2179.94,112.79,282.06,461.56,680.39,951.22,1151.85,1366.89,1558.62,0,237.52,387.6,547.33,714.11,804.96,950.08,1039.38]},{ name:'房地产开发投资增长',
    type:'bar',
    data:[40.4,37.1,32.6,39.9,36.5,37.5,0,26.6,31.3,29.6,38.4,35.1,29.8,34.3,33.7,40.1,15.0,14.8,16.4,65.2,28.1,26.5,20.9,23.9,18.7,21.1,16.4,11.1,13.5,11.8,19.7,0,0,2.2,7.7,10.1,11.8,10.2,17.0,17.4,13.6,23.5,13.5,14.4,10.3,11.8,12.6,15.1,16.4,0,0,0,0,1.5,0,0,0,0,0,0,0,2.6,2.5,4.2,9.6,10.6,14.1,19.5]},{ name:'商品房销售面积',
    type:'bar',
    data:[17.6,15.9,11.2,15.1,16.0,19.5,0,5.3,6.0,10.7,22.8,25.6,15.4,6.7,3.3,0.3,5.0,3.6,1.8,51.1,41.6,43.5,38.4,24.0,20.1,15.5,10.7,19.2,21.5,20.5,79.0,42.8,46.7,40.1,31.3,26.4,25.3,24.3,22.4,20.8,17.5,6.1,10.6,15.3,17.4,24.2,25.2,25.4,25.5,1517.74,1702.53,1904.89,127.04,314.24,476.63,653.6,861.59,1013.94,1150.97,1331.2,172.57,393.01,608.01,868.25,1103.17,1271.31,1461.62,1734.9]},{ name:'固定资产投资增幅回升',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3.9,3.8,0.1,0,0,0,0]},{ name:'房地产开发投资增幅回落',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,-7.9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'技改投资增长',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,23.7,18.6,17.5,34.2,23.0,26.1,31.9,39.2,36.2,40.8,39.3,22.1,28.2,25.5,2.5,18.8,23.1,12.4,10.6,11.1,12.8,15.7,16.9,11.5,11.1,32.0,26.9,24.2,26.6,23.4,23.8,21.7,20.0,13.6,19.2,20.0,2.1,0,0,0.2,0.5,4.8,7.2,7.7,0,14.6,7.5,7.4,13.9,9.2,0,0]},{ name:'固定资产投资增长',
    type:'bar',
    data:[33.6,32.2,32.1,30.6,26.6,28.6,0,14.2,17.4,20.2,24.3,29.0,24.2,22.5,12.0,9.9,19.7,19.4,20.8,8.1,1.5,4.6,15.9,21.7,17.8,20.2,23.2,18.1,18.9,19.6,29.0,20.2,12.8,13.8,17.4,17.5,17.6,17.8,18.7,18.3,18.3,25.5,24.0,22.3,21.4,18.2,21.0,20.3,19.0,16.8,17.0,17.1,4.2,10.1,10.3,15.1,16.6,16.3,16.3,16.7,14.0,14.0,14.1,15.2,15.2,14.4,13.6,13.7]},{ name:'民生投资增长',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,71.9,0,0,0,0,0,0,0]},{ name:'固定资产投资下降',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-18.7,-30.4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'民生投资',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,36.37,0,0,0,0,0,0,0]},{ name:'住宅销售面积增长',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,32.3,38.4,0,0,0,0,0,0,0,0,0,23.5,26.7,0]},{ name:'全社会固定资产投资',
    type:'bar',
    data:[1702.86,2029.8,2384.51,2745.69,3055.37,3192.57,164.73,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'全社会固定资产投资增长',
    type:'bar',
    data:[30.2,30.2,32.6,32.2,32.1,30.7,28.8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'固定资产投资同比回落',
    type:'bar',
    data:[0,0,0,0,-1.5,-2.1,0,0,0,-8.4,0,0,0,0,0,0,0,0,0,0,0,0,0,-5.5,0,0,0,0,0,-0.2,0,0,0,-1.7,-3.8,0,-1.9,-2.9,0,0,0,-4.9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资增幅回落',
    type:'bar',
    data:[-6.1,-3.5,-3.4,-5.0,-1.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'固定资产投资增幅回落',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1.1,-1.7,-1.8,0,0,0,0,0,0,0,-0.6,-1.9,-1.3,-1.2,-21.3,-13.9,-12.0,-6.3,-1.6,-4.7,-4.0,-2.3,0,0,0,0,-1.4,-1.9,-2.7,-3.0]},{ name:'固定资产投资',
    type:'bar',
    data:[1560.37,1857.86,2181.15,2469.22,2651.58,2878.77,0,2647.7,2986.5,3197.4,238.92,544.39,1147.3,1859.5,2020.1,2326.7,3148.98,3482.06,3742.32,258.2,552.31,883.65,1301.97,1792.51,2045.87,2410.9,2737.55,3616.3,4038.66,4254.57,295.89,642.94,996.79,1403.16,2039.53,2321.88,2727.56,3149.97,4635.07,5166.3,5435.75,389.67,842.72,1297.33,1796.78,2573.04,3012.81,3530.74,4044.81,5414.93,6042.64,6363.29,406.01,927.45,1430.76,2067.7,3000.75,3503.93,4106.58,4718.59,443.01,983.27,1568.75,2291.7,3110.72,3603.57,4324.01,4903.99]},{ name:'住宅销售面积',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,435.64,589.39,0,0,0,0,0,0,0,0,0,1121.48,1294.54,0]},{ name:'商品房销售面积下降',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3.9,-3.3,0,-54.9,-37.1,-40.2,-33.7,-21.2,-16.3,-11.2,-11.0,0,0,0,0,0,0,0,0,0,0,0,-27.3,-25.2,-23.2,-4.2,-18.6,-22.9,-23.7,-28.6,-28.9,-31.2,-30.5,0,0,0,-29.9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'商品房销售面积增长',
    type:'bar',
    data:[39.6,37.1,32.8,37.5,39.4,46.3,0,18.9,17.2,8.3,57.3,55.6,42.7,40.2,34.8,28.4,0,0,2.1,0,0,0,0,0,0,0,0,21.8,22.3,22.0,115.6,54.3,60.3,47.2,31.4,25.0,24.4,27.3,0,0,0,0,0,0,0,0,0,0,0,39.0,33.5,25.4,0,13.1,30.5,37.9,45.7,44.1,40.8,40.7,35.8,25.1,27.6,32.8,28.0,25.4,27.0,30.3]},{ name:'房地产开发投资增幅提升',
    type:'bar',
    data:[44.6,38.3,32.4,38.0,32.1,31.5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'工业投资增长',
    type:'bar',
    data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,27.1,0,0,0,0,0,0,0]},{ name:'房地产开发投资',
    type:'bar',
    data:[365.57,425.09,480.99,575.26,624.31,684.15,0,728.0,817.0,886.9,79.06,161.27,306.7,484.3,568.2,673.8,837.55,926.4,1032.0,130.62,206.51,288.01,370.78,486.7,562.97,670.2,752.76,930.49,1051.68,1153.61,121.82,199.55,273.1,379.11,524.12,619.98,721.6,829.77,1088.37,1234.61,1310.5,150.5,226.57,312.3,418.33,586.19,698.22,830.89,966.26,852.15,930.5,996.6,132.49,229.87,311.66,411.84,535.47,618.58,690.82,773.9,117.98,235.9,319.38,429.1,586.91,684.29,788.16,924.43]},{ name:'商品房销售面积增幅回落',
    type:'bar',
    data:[-36.5,-46.0,-65.6,-56.0,-55.9,-51.5,0,0,0,-30.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资增长',
    type:'bar',
    data:[41.6,40.3,39.5,39.7,36.8,38.1,0,38.0,36.1,43.9,31.2,40.4,35.9,40.1,32.2,30.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]}    ]};
option = {    title : {        text: '长沙地区',        subtext: '来源长沙统计局'    },    tooltip : {        trigger: 'axis'    },    legend: {        data:['住宅销售面积','住宅销售面积增长','住宅销面积','住宅销面积增长','全社会固定资产投资','全社会固定资产投资增长','商品房销售面积','商品房销售面积下降','商品房销售面积增幅回落','商品房销售面积增长','固定资产投资','固定资产投资下降','固定资产投资同比回落','固定资产投资同比提升','固定资产投资增幅回升','固定资产投资增幅回落','固定资产投资增长','工业投资','工业投资增长','房地产开发投资','房地产开发投资下降','房地产开发投资增幅回落','房地产开发投资增幅提升','房地产开发投资增长','技改投资','技改投资下降','技改投资增长','更新改造投资','更新改造投资增幅回落','更新改造投资增幅提升','更新改造投资增长','民生投资','民生投资增长']    },    toolbox: {        show : true,        feature : {            mark : {show: true},            dataView : {show: true, readOnly: false},            magicType : {show: true, type: ['line', 'bar']},            restore : {show: true},            saveAsImage : {show: true}        }    },    calculable : true,    xAxis : [        {            type : 'category',            data : ['2010-07','2010-08','2010-09','2010-10','2010-11','2010-12','2011-01','2011-10','2011-11','2011-12','2011-2','2011-3','2011-5','2011-7','2011-8','2011-9','2012-10','2012-11','2012-12','2012-2','2012-3','2012-4','2012-5','2012-6','2012-7','2012-8','2012-9','2013-10','2013-11','2013-12','2013-2','2013-3','2013-4','2013-5','2013-6','2013-7','2013-8','2013-9','2014-10','2014-11','2014-12','2014-2','2014-3','2014-4','2014-5','2014-6','2014-7','2014-8','2014-9','2015-10','2015-11','2015-12','2015-2','2015-3','2015-4','2015-5','2015-6','2015-7','2015-8','2015-9','2016-2','2016-3','2016-4','2016-5','2016-6','2016-7','2016-8','2016-9']        }    ],    yAxis : [        {            type : 'value'        }    ],    series : [        { name:'住宅销面积', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1341.82,1500.14,1684.11,0,287.29,0,0,772.43,908.37,1021.95,1181.18,146.45,345.81,539.31,758.07,969.48,0,0,1552.63]},{ name:'固定资产投资同比提升', type:'bar',data:[9.2,5.7,4.7,2.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6.8,0.9,0.8,0,22.9,18.5,7.2,0,0,1.4,0,0,0,0,0,0,3.8,9.5,7.6,0.1,2.1,1.1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资', type:'bar',data:[418.58,498.59,574.84,654.47,697.78,753.14,0,903.5,949.3,961.4,55.27,158.87,348.4,586.2,659.4,748.7,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资增幅提升', type:'bar',data:[0,0,0,0,0,2.8,0,0,0,5.8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'房地产开发投资下降', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2.2,-5.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-21.7,-24.6,-24.0,-12.0,0,-0.2,-1.6,-8.7,-11.4,-16.9,-19.9,-11.0,0,0,0,0,0,0,0]},{ name:'工业投资', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,126.77,0,0,0,0,0,0,0]},{ name:'技改投资下降', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-6.8,-7.3,0,0,0,0,0,0,0,0,0,0,0,-1.8,-3.4]},{ name:'住宅销面积增长', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,40.1,34.1,26.4,0,14.5,0,0,48.8,46.0,43.5,43.4,33.1,20.4,23.8,28.6,25.5,0,0,31.4]},{ name:'技改投资', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1117.67,1210.09,1302.85,78.48,200.87,325.95,478.11,693.11,798.59,928.5,1042.79,1365.09,1551.46,1635.62,75.83,238.64,401.09,537.2,766.69,887.48,1047.27,1206.22,1595.82,1729.84,1816.57,110.51,302.78,497.96,678.74,946.04,1098.65,1274.49,1446.99,1812.58,2061.78,2179.94,112.79,282.06,461.56,680.39,951.22,1151.85,1366.89,1558.62,0,237.52,387.6,547.33,714.11,804.96,950.08,1039.38]},{ name:'房地产开发投资增长', type:'bar',data:[40.4,37.1,32.6,39.9,36.5,37.5,0,26.6,31.3,29.6,38.4,35.1,29.8,34.3,33.7,40.1,15.0,14.8,16.4,65.2,28.1,26.5,20.9,23.9,18.7,21.1,16.4,11.1,13.5,11.8,19.7,0,0,2.2,7.7,10.1,11.8,10.2,17.0,17.4,13.6,23.5,13.5,14.4,10.3,11.8,12.6,15.1,16.4,0,0,0,0,1.5,0,0,0,0,0,0,0,2.6,2.5,4.2,9.6,10.6,14.1,19.5]},{ name:'商品房销售面积', type:'bar',data:[17.6,15.9,11.2,15.1,16.0,19.5,0,5.3,6.0,10.7,22.8,25.6,15.4,6.7,3.3,0.3,5.0,3.6,1.8,51.1,41.6,43.5,38.4,24.0,20.1,15.5,10.7,19.2,21.5,20.5,79.0,42.8,46.7,40.1,31.3,26.4,25.3,24.3,22.4,20.8,17.5,6.1,10.6,15.3,17.4,24.2,25.2,25.4,25.5,1517.74,1702.53,1904.89,127.04,314.24,476.63,653.6,861.59,1013.94,1150.97,1331.2,172.57,393.01,608.01,868.25,1103.17,1271.31,1461.62,1734.9]},{ name:'固定资产投资增幅回升', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3.9,3.8,0.1,0,0,0,0]},{ name:'房地产开发投资增幅回落', type:'bar',data:[0,0,0,0,0,0,0,0,0,-7.9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'技改投资增长', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,23.7,18.6,17.5,34.2,23.0,26.1,31.9,39.2,36.2,40.8,39.3,22.1,28.2,25.5,2.5,18.8,23.1,12.4,10.6,11.1,12.8,15.7,16.9,11.5,11.1,32.0,26.9,24.2,26.6,23.4,23.8,21.7,20.0,13.6,19.2,20.0,2.1,0,0,0.2,0.5,4.8,7.2,7.7,0,14.6,7.5,7.4,13.9,9.2,0,0]},{ name:'固定资产投资增长', type:'bar',data:[33.6,32.2,32.1,30.6,26.6,28.6,0,14.2,17.4,20.2,24.3,29.0,24.2,22.5,12.0,9.9,19.7,19.4,20.8,8.1,1.5,4.6,15.9,21.7,17.8,20.2,23.2,18.1,18.9,19.6,29.0,20.2,12.8,13.8,17.4,17.5,17.6,17.8,18.7,18.3,18.3,25.5,24.0,22.3,21.4,18.2,21.0,20.3,19.0,16.8,17.0,17.1,4.2,10.1,10.3,15.1,16.6,16.3,16.3,16.7,14.0,14.0,14.1,15.2,15.2,14.4,13.6,13.7]},{ name:'民生投资增长', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,71.9,0,0,0,0,0,0,0]},{ name:'固定资产投资下降', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-18.7,-30.4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'民生投资', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,36.37,0,0,0,0,0,0,0]},{ name:'住宅销售面积增长', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,32.3,38.4,0,0,0,0,0,0,0,0,0,23.5,26.7,0]},{ name:'全社会固定资产投资', type:'bar',data:[1702.86,2029.8,2384.51,2745.69,3055.37,3192.57,164.73,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'全社会固定资产投资增长', type:'bar',data:[30.2,30.2,32.6,32.2,32.1,30.7,28.8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'固定资产投资同比回落', type:'bar',data:[0,0,0,0,-1.5,-2.1,0,0,0,-8.4,0,0,0,0,0,0,0,0,0,0,0,0,0,-5.5,0,0,0,0,0,-0.2,0,0,0,-1.7,-3.8,0,-1.9,-2.9,0,0,0,-4.9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资增幅回落', type:'bar',data:[-6.1,-3.5,-3.4,-5.0,-1.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'固定资产投资增幅回落', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1.1,-1.7,-1.8,0,0,0,0,0,0,0,-0.6,-1.9,-1.3,-1.2,-21.3,-13.9,-12.0,-6.3,-1.6,-4.7,-4.0,-2.3,0,0,0,0,-1.4,-1.9,-2.7,-3.0]},{ name:'固定资产投资', type:'bar',data:[1560.37,1857.86,2181.15,2469.22,2651.58,2878.77,0,2647.7,2986.5,3197.4,238.92,544.39,1147.3,1859.5,2020.1,2326.7,3148.98,3482.06,3742.32,258.2,552.31,883.65,1301.97,1792.51,2045.87,2410.9,2737.55,3616.3,4038.66,4254.57,295.89,642.94,996.79,1403.16,2039.53,2321.88,2727.56,3149.97,4635.07,5166.3,5435.75,389.67,842.72,1297.33,1796.78,2573.04,3012.81,3530.74,4044.81,5414.93,6042.64,6363.29,406.01,927.45,1430.76,2067.7,3000.75,3503.93,4106.58,4718.59,443.01,983.27,1568.75,2291.7,3110.72,3603.57,4324.01,4903.99]},{ name:'住宅销售面积', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,435.64,589.39,0,0,0,0,0,0,0,0,0,1121.48,1294.54,0]},{ name:'商品房销售面积下降', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-3.9,-3.3,0,-54.9,-37.1,-40.2,-33.7,-21.2,-16.3,-11.2,-11.0,0,0,0,0,0,0,0,0,0,0,0,-27.3,-25.2,-23.2,-4.2,-18.6,-22.9,-23.7,-28.6,-28.9,-31.2,-30.5,0,0,0,-29.9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'商品房销售面积增长', type:'bar',data:[39.6,37.1,32.8,37.5,39.4,46.3,0,18.9,17.2,8.3,57.3,55.6,42.7,40.2,34.8,28.4,0,0,2.1,0,0,0,0,0,0,0,0,21.8,22.3,22.0,115.6,54.3,60.3,47.2,31.4,25.0,24.4,27.3,0,0,0,0,0,0,0,0,0,0,0,39.0,33.5,25.4,0,13.1,30.5,37.9,45.7,44.1,40.8,40.7,35.8,25.1,27.6,32.8,28.0,25.4,27.0,30.3]},{ name:'房地产开发投资增幅提升', type:'bar',data:[44.6,38.3,32.4,38.0,32.1,31.5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'工业投资增长', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,27.1,0,0,0,0,0,0,0]},{ name:'房地产开发投资', type:'bar',data:[365.57,425.09,480.99,575.26,624.31,684.15,0,728.0,817.0,886.9,79.06,161.27,306.7,484.3,568.2,673.8,837.55,926.4,1032.0,130.62,206.51,288.01,370.78,486.7,562.97,670.2,752.76,930.49,1051.68,1153.61,121.82,199.55,273.1,379.11,524.12,619.98,721.6,829.77,1088.37,1234.61,1310.5,150.5,226.57,312.3,418.33,586.19,698.22,830.89,966.26,852.15,930.5,996.6,132.49,229.87,311.66,411.84,535.47,618.58,690.82,773.9,117.98,235.9,319.38,429.1,586.91,684.29,788.16,924.43]},{ name:'商品房销售面积增幅回落', type:'bar',data:[-36.5,-46.0,-65.6,-56.0,-55.9,-51.5,0,0,0,-30.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资增长', type:'bar',data:[41.6,40.3,39.5,39.7,36.8,38.1,0,38.0,36.1,43.9,31.2,40.4,35.9,40.1,32.2,30.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]}    ]};var option_self = {    title : {        text: '长沙地区',        subtext: '来源长沙统计局'    },    tooltip : {        trigger: 'axis'    },    legend: {        data:['住宅销售面积','住宅销售面积增长','住宅销面积','住宅销面积增长','全社会固定资产投资','全社会固定资产投资增长','商品房销售面积','商品房销售面积下降','商品房销售面积增幅回落','商品房销售面积增长','固定资产投资','固定资产投资下降','固定资产投资同比回落','固定资产投资同比提升','固定资产投资增幅回升','固定资产投资增幅回落','固定资产投资增长','工业投资','工业投资增长','房地产开发投资','房地产开发投资下降','房地产开发投资增幅回落','房地产开发投资增幅提升','房地产开发投资增长','技改投资','技改投资下降','技改投资增长','更新改造投资','更新改造投资增幅回落','更新改造投资增幅提升','更新改造投资增长','民生投资','民生投资增长']    },    toolbox: {        show : true,        feature : {            mark : {show: true},            dataView : {show: true, readOnly: false},            magicType : {show: true, type: ['line', 'bar']},            restore : {show: true},            saveAsImage : {show: true}        }    },    calculable : true,    xAxis : [        {            type : 'category',            data : ['2010-07','2010-08','2010-09','2010-10','2010-11','2010-12','2011-01','2011-02','2011-03','2011-05','2011-07','2011-08','2011-09','2011-10','2011-11','2011-12','2012-02','2012-03','2012-04','2012-05','2012-06','2012-07','2012-08','2012-09','2012-10','2012-11','2012-12','2013-02','2013-03','2013-04','2013-05','2013-06','2013-07','2013-08','2013-09','2013-10','2013-11','2013-12','2014-02','2014-03','2014-04','2014-05','2014-06','2014-07','2014-08','2014-09','2014-10','2014-11','2014-12','2015-02','2015-03','2015-04','2015-05','2015-06','2015-07','2015-08','2015-09','2015-10','2015-11','2015-12','2016-02','2016-03','2016-04','2016-05','2016-06','2016-07','2016-08','2016-09']        }    ],    yAxis : [        {            type : 'value'        }    ],    series : [        { name:'住宅销面积', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,287.29,0,0,772.43,908.37,1021.95,1181.18,1341.82,1500.14,1684.11,146.45,345.81,539.31,758.07,969.48,0,0,1552.63]},{ name:'固定资产投资同比提升', type:'bar',data:[9.2,5.7,4.7,2.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6.8,0,0,0,22.9,18.5,7.2,0,0,1.4,0,0,0.9,0.8,0,0,3.8,9.5,7.6,0.1,2.1,1.1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资', type:'bar',data:[418.58,498.59,574.84,654.47,697.78,753.14,0,55.27,158.87,348.4,586.2,659.4,748.7,903.5,949.3,961.4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资增幅提升', type:'bar',data:[0,0,0,0,0,2.8,0,0,0,0,0,0,0,0,0,5.8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'房地产开发投资下降', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-2.2,-5.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-12.0,0,-0.2,-1.6,-8.7,-11.4,-16.9,-19.9,-21.7,-24.6,-24.0,-11.0,0,0,0,0,0,0,0]},{ name:'工业投资', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,126.77,0,0,0,0,0,0,0]},{ name:'技改投资下降', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-6.8,-7.3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-1.8,-3.4]},{ name:'住宅销面积增长', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,14.5,0,0,48.8,46.0,43.5,43.4,40.1,34.1,26.4,33.1,20.4,23.8,28.6,25.5,0,0,31.4]},{ name:'技改投资', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,78.48,200.87,325.95,478.11,693.11,798.59,928.5,1042.79,1117.67,1210.09,1302.85,75.83,238.64,401.09,537.2,766.69,887.48,1047.27,1206.22,1365.09,1551.46,1635.62,110.51,302.78,497.96,678.74,946.04,1098.65,1274.49,1446.99,1595.82,1729.84,1816.57,112.79,282.06,461.56,680.39,951.22,1151.85,1366.89,1558.62,1812.58,2061.78,2179.94,0,237.52,387.6,547.33,714.11,804.96,950.08,1039.38]},{ name:'房地产开发投资增长', type:'bar',data:[40.4,37.1,32.6,39.9,36.5,37.5,0,38.4,35.1,29.8,34.3,33.7,40.1,26.6,31.3,29.6,65.2,28.1,26.5,20.9,23.9,18.7,21.1,16.4,15.0,14.8,16.4,19.7,0,0,2.2,7.7,10.1,11.8,10.2,11.1,13.5,11.8,23.5,13.5,14.4,10.3,11.8,12.6,15.1,16.4,17.0,17.4,13.6,0,1.5,0,0,0,0,0,0,0,0,0,0,2.6,2.5,4.2,9.6,10.6,14.1,19.5]},{ name:'商品房销售面积', type:'bar',data:[17.6,15.9,11.2,15.1,16.0,19.5,0,22.8,25.6,15.4,6.7,3.3,0.3,5.3,6.0,10.7,51.1,41.6,43.5,38.4,24.0,20.1,15.5,10.7,5.0,3.6,1.8,79.0,42.8,46.7,40.1,31.3,26.4,25.3,24.3,19.2,21.5,20.5,6.1,10.6,15.3,17.4,24.2,25.2,25.4,25.5,22.4,20.8,17.5,127.04,314.24,476.63,653.6,861.59,1013.94,1150.97,1331.2,1517.74,1702.53,1904.89,172.57,393.01,608.01,868.25,1103.17,1271.31,1461.62,1734.9]},{ name:'固定资产投资增幅回升', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,3.9,3.8,0.1,0,0,0,0]},{ name:'房地产开发投资增幅回落', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-7.9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'技改投资增长', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,34.2,23.0,26.1,31.9,39.2,36.2,40.8,39.3,23.7,18.6,17.5,2.5,18.8,23.1,12.4,10.6,11.1,12.8,15.7,22.1,28.2,25.5,32.0,26.9,24.2,26.6,23.4,23.8,21.7,20.0,16.9,11.5,11.1,2.1,0,0,0.2,0.5,4.8,7.2,7.7,13.6,19.2,20.0,0,14.6,7.5,7.4,13.9,9.2,0,0]},{ name:'固定资产投资增长', type:'bar',data:[33.6,32.2,32.1,30.6,26.6,28.6,0,24.3,29.0,24.2,22.5,12.0,9.9,14.2,17.4,20.2,8.1,1.5,4.6,15.9,21.7,17.8,20.2,23.2,19.7,19.4,20.8,29.0,20.2,12.8,13.8,17.4,17.5,17.6,17.8,18.1,18.9,19.6,25.5,24.0,22.3,21.4,18.2,21.0,20.3,19.0,18.7,18.3,18.3,4.2,10.1,10.3,15.1,16.6,16.3,16.3,16.7,16.8,17.0,17.1,14.0,14.0,14.1,15.2,15.2,14.4,13.6,13.7]},{ name:'民生投资增长', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,71.9,0,0,0,0,0,0,0]},{ name:'固定资产投资下降', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-18.7,-30.4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'民生投资', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,36.37,0,0,0,0,0,0,0]},{ name:'住宅销售面积增长', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,32.3,38.4,0,0,0,0,0,0,0,0,0,0,0,0,23.5,26.7,0]},{ name:'全社会固定资产投资', type:'bar',data:[1702.86,2029.8,2384.51,2745.69,3055.37,3192.57,164.73,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'全社会固定资产投资增长', type:'bar',data:[30.2,30.2,32.6,32.2,32.1,30.7,28.8,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'固定资产投资同比回落', type:'bar',data:[0,0,0,0,-1.5,-2.1,0,0,0,0,0,0,0,0,0,-8.4,0,0,0,0,-5.5,0,0,0,0,0,0,0,0,0,-1.7,-3.8,0,-1.9,-2.9,0,0,-0.2,-4.9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资增幅回落', type:'bar',data:[-6.1,-3.5,-3.4,-5.0,-1.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'固定资产投资增幅回落', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-0.6,-1.1,-1.7,-1.8,-21.3,-13.9,-12.0,-6.3,-1.6,-4.7,-4.0,-2.3,-1.9,-1.3,-1.2,0,0,0,0,-1.4,-1.9,-2.7,-3.0]},{ name:'固定资产投资', type:'bar',data:[1560.37,1857.86,2181.15,2469.22,2651.58,2878.77,0,238.92,544.39,1147.3,1859.5,2020.1,2326.7,2647.7,2986.5,3197.4,258.2,552.31,883.65,1301.97,1792.51,2045.87,2410.9,2737.55,3148.98,3482.06,3742.32,295.89,642.94,996.79,1403.16,2039.53,2321.88,2727.56,3149.97,3616.3,4038.66,4254.57,389.67,842.72,1297.33,1796.78,2573.04,3012.81,3530.74,4044.81,4635.07,5166.3,5435.75,406.01,927.45,1430.76,2067.7,3000.75,3503.93,4106.58,4718.59,5414.93,6042.64,6363.29,443.01,983.27,1568.75,2291.7,3110.72,3603.57,4324.01,4903.99]},{ name:'住宅销售面积', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,435.64,589.39,0,0,0,0,0,0,0,0,0,0,0,0,1121.48,1294.54,0]},{ name:'商品房销售面积下降', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-54.9,-37.1,-40.2,-33.7,-21.2,-16.3,-11.2,-11.0,-3.9,-3.3,0,0,0,0,0,0,0,0,0,0,0,0,-4.2,-18.6,-22.9,-23.7,-28.6,-28.9,-31.2,-30.5,-27.3,-25.2,-23.2,-29.9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'商品房销售面积增长', type:'bar',data:[39.6,37.1,32.8,37.5,39.4,46.3,0,57.3,55.6,42.7,40.2,34.8,28.4,18.9,17.2,8.3,0,0,0,0,0,0,0,0,0,0,2.1,115.6,54.3,60.3,47.2,31.4,25.0,24.4,27.3,21.8,22.3,22.0,0,0,0,0,0,0,0,0,0,0,0,0,13.1,30.5,37.9,45.7,44.1,40.8,40.7,39.0,33.5,25.4,35.8,25.1,27.6,32.8,28.0,25.4,27.0,30.3]},{ name:'房地产开发投资增幅提升', type:'bar',data:[44.6,38.3,32.4,38.0,32.1,31.5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'工业投资增长', type:'bar',data:[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,27.1,0,0,0,0,0,0,0]},{ name:'房地产开发投资', type:'bar',data:[365.57,425.09,480.99,575.26,624.31,684.15,0,79.06,161.27,306.7,484.3,568.2,673.8,728.0,817.0,886.9,130.62,206.51,288.01,370.78,486.7,562.97,670.2,752.76,837.55,926.4,1032.0,121.82,199.55,273.1,379.11,524.12,619.98,721.6,829.77,930.49,1051.68,1153.61,150.5,226.57,312.3,418.33,586.19,698.22,830.89,966.26,1088.37,1234.61,1310.5,132.49,229.87,311.66,411.84,535.47,618.58,690.82,773.9,852.15,930.5,996.6,117.98,235.9,319.38,429.1,586.91,684.29,788.16,924.43]},{ name:'商品房销售面积增幅回落', type:'bar',data:[-36.5,-46.0,-65.6,-56.0,-55.9,-51.5,0,0,0,0,0,0,0,0,0,-30.2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},{ name:'更新改造投资增长', type:'bar',data:[41.6,40.3,39.5,39.7,36.8,38.1,0,31.2,40.4,35.9,40.1,32.2,30.2,38.0,36.1,43.9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]}    ]};
