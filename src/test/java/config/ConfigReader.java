package config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    Properties properties;

    public ConfigReader() {

        try {

            FileInputStream fis =
                    new FileInputStream(
                            "src/test/resources/config.properties");

            properties =
                    new Properties();

            properties.load(fis);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public String getProperty(
            String key) {

        return properties.getProperty(key);
    }
}