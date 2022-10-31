package StartAtGoogle.Week2.Exceptions;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

class configService {

    private static final String configFilePath = "src/main/resources/dbInfo.properties";
    private Map<String,String> myData=new HashMap<>();

    public configService() {
    }

    public Map<String, String> getMyData() {
        if(myData.isEmpty())
            throw new RuntimeException("Data Not initialized!");
        return myData;
    }

    public String getDataByKey(String myKey) {

        if(myData.get(myKey).isEmpty())
            throw new NullPointerException("Key not found!");
        return myData.get(myKey);
    }

    public Map<String,String> loadDataFromFile(){

        Map<String,String> myData=new HashMap<>();


        try (FileReader propsInput = new FileReader(configFilePath)) {

            Properties prop = new Properties();
            prop.load(propsInput);

            Enumeration keys = prop.propertyNames();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                myData.put(key, prop.getProperty(key));
            }
            propsInput.close();
            this.myData =myData;
            return myData;
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!\nThe service will provide you with new file :)");


            try(FileWriter fileWriter=new FileWriter(configFilePath)){

                Properties prop = new Properties();

                prop.setProperty("DB_USER","Mostafa Mossa");
                prop.setProperty("DB_PASSWORD","Mostafa5748974");
                prop.setProperty("EMAIL","Mostafa@gmail.com");

                prop.store(fileWriter,"DataBase Properties Data");
                Enumeration keys = prop.propertyNames();

                while (keys.hasMoreElements()) {
                    String key = (String) keys.nextElement();
                    myData.put(key, prop.getProperty(key));
                }
                fileWriter.close();
                this.myData =myData;
                return myData;


            }catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
