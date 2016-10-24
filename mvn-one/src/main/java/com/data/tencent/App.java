package com.data.tencent;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new App().exe();
    }

    public void exe(){
        for(Double str:numberString("32423dsfdsaf-243kd-3243-2")){
            System.out.println(str);
        }
    }
    public ArrayList<Double> numberString(String str) {
        str = str.trim();
        //去除字符串首尾空格
        // 保存分割后的数字
        ArrayList<Double> array = new ArrayList<>();
        boolean start;
        //连续数字字符开始的标志

        start = false;
        boolean point = false;
        //浮点数标识
        boolean negative = false;
        double Num; //去除String中的其他字符，保留数字
        if (str != null && !"".equals(str))//str不为空，且不为空串（空格算字符）
        {
            StringBuilder number = new StringBuilder();//暂时保存数字 //遍历每个字符
            for (int i = 0; i < str.length(); i++) {
                //字符为数字
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                    start = true; //number+=str.charAt(i); //"-","."字符特殊处理
                    if (negative == true) {
                        number = number.append('-');
                        negative = false;
                    }
                    if (point == true) {
                        number.append('.');
                        point = false;
                    }
                    number = number.append(str.charAt(i));
                } //"-"字符
                else if (str.charAt(i) == '-') {
                    negative = true;
                } //"."字符
                else if (str.charAt(i) == '.') {
                    point = true;
                } //字符不为数字,"-","."
                else { //"-""."的特殊处理
                    if (negative == true) {
                        negative = false;
                    }
                    if (point == true) {
                        point = false;
                    }
                    start = false;
                    if (number.length() != 0) {
                        String temp = number.toString();//转换为String temp=ToNumber(temp);//去除首位可能的0
                        Num = Double.parseDouble(temp);//转换为数字 //
                        number = number.delete(0, number.length() - 1);//重新置null
                        number = new StringBuilder();
                        array.add(Num);
                    }
                } //最后一位字符为数字时，需要特殊处理
                if (i == str.length() - 1) {
                    if (number.length() != 0) {
                        String temp = number.toString();//转换为String temp=ToNumber(temp);//去除首位可能的0
                        Num = Double.parseDouble(temp);//转换为数字
                        number = number.delete(0, number.length() - 1);//重新置null
                        number = new StringBuilder();
                        array.add(Num);
                    }
                }
            }
            return array;
        } else {
            return null;
        }
    }
}
