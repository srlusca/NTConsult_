package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ArchiveUtils {

    public static String getProperties(String prop) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/resources/application.properties"));
        return properties.getProperty(prop);
    }

}
