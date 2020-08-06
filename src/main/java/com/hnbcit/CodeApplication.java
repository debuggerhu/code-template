package com.hnbcit;

import com.hnbcit.code.build.TemplateBuilder;

/****
 * @Author:debuggerhu
 * @Description:main方法入口
 * @Date 2020/8/06 5:17
 *****/
public class CodeApplication {

    public static void main(String[] args) {
        //调用该方法即可
        TemplateBuilder.builder();
        System.out.println("叮咚,代码大礼包生成完毕,请注意查收!");
    }
}
