package d.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class SampleProperties {
    public static void main(String[] args) {
        SampleProperties sample = new SampleProperties();
        // sample.saveAndLoadProperties();
        sample.saveAndLoadPropertiesXML();
    }

    public void saveAndLoadProperties() {
        try {
            String fileName = "test.properties";
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);

            Properties prop = new Properties();
            prop.setProperty("Writer", "truelightwater, Kim");
            prop.setProperty("WriterHome", "http://wwww.truelightwater.com");
            prop.store(fos, "Basic Properties file.");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
            propLoaded.load(fis);
            fis.close();

            System.out.println(propLoaded);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void saveAndLoadPropertiesXML() {
        try {
            String fileName = "test.xml";
            File propertiesFile = new File(fileName);
            FileOutputStream fos = new FileOutputStream(propertiesFile);

            Properties prop = new Properties();
            prop.setProperty("Writer", "truelightwater, Kim");
            prop.setProperty("WriterHome", "http://truelightwater.com");
            prop.storeToXML(fos, "Basic XML Property file.");
            fos.close();

            FileInputStream fis = new FileInputStream(propertiesFile);
            Properties propLoaded = new Properties();
            propLoaded.loadFromXML(fis);
            System.out.println(propLoaded);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
