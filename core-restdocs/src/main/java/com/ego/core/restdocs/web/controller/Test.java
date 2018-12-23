package com.ego.core.restdocs.web.controller;

import java.util.Random;

/**
 * @author ego
 * @since 2018-12-01 16:31
 **/
public class Test {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 需求：
         * 生成随机数
         * 1秒1个
         * 输入需要随机数据个数
         * 输入完后隐藏该数字
         *
         */
        int total = 10; //总计生成

        for(int i = 0 ; i < total; i++){
            Random random = new Random();
            int number = random.nextInt(10);
            System.out.print(number);
            Thread.sleep(1000);
        }


        for (int i = 0; i < 40; i++){
            System.out.println("");
        }
    }
}
