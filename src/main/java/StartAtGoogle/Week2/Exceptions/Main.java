package StartAtGoogle.Week2.Exceptions;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        configService myService = new configService();
        Map<String,String> myData;

        myData = myService.loadDataFromFile();
        System.out.println(myData);

        

    }
}
