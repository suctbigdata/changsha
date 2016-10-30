# changsha
该项目只要解析 mvn-one的代码
该程序执行分为三步：
1. 将长沙统计局的数据下载到本地
执行 DownStatistic 类，就会将长沙统计局的经济数据下载到本地
2. 将长沙的数据进行整理
执行 ChangSha 类，会读取已经下载好的本地数据，进行规整。
3. 形成一个可以被echart 识别的格式，然后展示
最后打开 model-dist 项目，在binary\webapp 目录下有 index.html 打开就可以看到规整的结果
