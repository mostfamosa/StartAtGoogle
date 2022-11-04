package StartAtGoogle.Week3.StructionalPatternFacade;

import com.google.gson.Gson;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws IOException {
        HttpFacade httpFacade = new HttpFacade();
        Gson gson = new Gson();
        //get request
//        System.out.println(httpFacade.getReq("https://reqres.in/api/users?page=2"));


        //post request
//        User u = new User(2, "moose@sds.com", "Mostfa", "Mosa", "https://reqres.in/img/faces/2-image.jpg");
//        System.out.println(httpFacade.postReq("https://httpbin.org/post", u.toString()));

        //put request
//        User u = new User(2,"moose@sds.com","Mostfa","Mosa","https://reqres.in/img/faces/2-image.jpg");
//        String data = new Gson().toJson(u);
//        System.out.println(httpFacade.putReq("https://reqres.in/api/users/2",data));


        //delete request
//        System.out.println(httpFacade.deleteReq("https://reqres.in/api/users/2"));

        //patch request
//        User u = new User(2,"moose@sds.com","Mostfa","Mosa","https://reqres.in/img/faces/2-image.jpg");
//        String u2 = gson.toJson(u);
//        System.out.println(u2);
//        System.out.println(httpFacade.patchReq("https://reqres.in/api/users/2", u2));
    }
}
