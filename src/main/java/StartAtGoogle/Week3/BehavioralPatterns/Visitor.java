package StartAtGoogle.Week3.BehavioralPatterns;

public interface Visitor {
    String visit(Asset asset);
    String visit(Group group);
    String visit(User user);
}
