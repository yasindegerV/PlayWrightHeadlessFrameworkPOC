package com.virgosol.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProp {
    private static Properties prop = new Properties();

    static {
        try{
            FileInputStream file = new FileInputStream("management/configuration.properties");
            prop.load(file);
            file.close();
        }catch (IOException e){
            System.out.println("ConfigurationReader problem check it!");
        }
    }

    public static String getProperty(String keyword){
        return prop.getProperty(keyword);
    }
}
