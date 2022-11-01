package StartAtGoogle.Week3.BehavioralPatterns;

public class Group implements Appliance{
    private int id;
    private int size;

    public Group(int id, int size) {
        this.id = id;
        this.size = size;
    }


    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }
}
