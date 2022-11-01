package StartAtGoogle.Week3.BehavioralPatterns;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

public class Utility implements Visitor{

    @Override
    public String visit(Asset asset) {
        return new Gson().toJson(asset);
    }

    @Override
    public String visit(Group group) {
        return new Gson().toJson(group);
    }

    @Override
    public String visit(User user) {
        return new Gson().toJson(user);
    }
}
