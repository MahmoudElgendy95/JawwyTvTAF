package com.website.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigProperties {

    private Properties properties;
    private final String configFilePath;

    public ConfigProperties(String configFilePath) throws IOException {
        this.configFilePath = configFilePath;
        setConfigProperties();
    }

    private void setConfigProperties() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(configFilePath));
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public void updateConfigFilePath() throws IOException {
        properties.store(new FileOutputStream(configFilePath), null);
    }
}
