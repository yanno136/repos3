package com.lpy.utils;


import java.io.InputStream;
import java.util.Properties;

/**
 * @author 李鹏阳
 * @date 2019.8
 */
public class ImgUtils {
    static Properties properties = null;
    static {

        properties = new Properties();
        InputStream in = ImgUtils.class.getClassLoader().getResourceAsStream("imgInfo.properties");
        try {
            properties.load(in);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static String getParameter(String name) {

        return properties.getProperty(name);
    }
}
