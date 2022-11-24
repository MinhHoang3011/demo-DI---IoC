package com.example.demodiioc;

import javax.management.InstanceNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Injector {
    private static final String IOC_CONFIGURATION_FILE_NAME = "application.properties";
    private Injector(){
        throw new UnsupportedOperationException();
    }
    static Object getInstance(String key) throws InstanceNotFoundException{
        try(InputStream inputStream = new FileInputStream(IOC_CONFIGURATION_FILE_NAME)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            String className = properties.getProperty(key);
            return Class.forName(className).newInstance();
        }
        catch (IOException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new InstanceNotFoundException(
                    "Can't create instance of " + key + " base on the configuration of " + IOC_CONFIGURATION_FILE_NAME);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}
