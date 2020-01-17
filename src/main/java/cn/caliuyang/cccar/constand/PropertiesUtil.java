/*
* Copyright @ 2020 Sotos Inc.
* cccar 下午3:38:16
* All right reserved.
*
*/

package cn.caliuyang.cccar.constand;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
* @description: cccar
* @author: xianglin.xie
* @createTime: 2020年1月17日 下午3:38:16
* @version: v1.0
*/

public class PropertiesUtil {
  private static Properties property;
  static {
    // 配置文件路径
    String filename = "car.properties";
    property = new Properties();
    try {
      // 加载配置文件
      property.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(filename)));
    } catch (IOException e) {
    	System.err.println("加载配置文件" + e.getMessage());
    }
  }
 
  // trim()方法=>去掉字符串两边到空格
  public static String getProperty(String key) {
    String value = property.getProperty(key.trim());
    if (value == null || value == "" ) {
      return null;
    }
    return value.trim();
  }
  
  // 默认值
  public static String getProperty(String key, String defaultValue) {
    String value = property.getProperty(key.trim());
    if (value == null || value == "" ) {
      value = defaultValue;
    }
    return value.trim();
  }
}