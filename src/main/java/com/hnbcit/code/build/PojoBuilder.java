package com.hnbcit.code.build;

import java.util.Map;

/****
 * @Author:debuggerhu
 * @Description:Pojo构建
 * @Date 2020/8/06 8:57
 *****/
public class PojoBuilder {


    /***
     * 构建Pojo
     * @param dataModel
     */
    public static void builder(Map<String,Object> dataModel){
        //生成Pojo层文件
        BuilderFactory.builder(dataModel,
                "/template/pojo",
                "Pojo.java",
                TemplateBuilder.PACKAGE_POJO,
                ".java");
    }

}
