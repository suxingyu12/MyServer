package com.bdqn.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//属性配置文件类
public class ConfigManager {
    private  static Properties prop=null;

    static {
        prop=new Properties();
        InputStream is=ConfigManager.class.getClassLoader().getResourceAsStream("db.properties");
        if (is != null) {
            try {
                prop.load(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  static  String getProperty(String pname){
        return  prop.getProperty(pname);
    }
}
