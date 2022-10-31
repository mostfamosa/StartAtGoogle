package StartAtGoogle.Week2.Enums;

public class Main {

    public enum Birds{
        BARN_OWL("Tyto alba"){
            @Override
            public void sing() {
                System.out.println("screeeeee");
            }
        },
        BALD_EAGLE("Mostafa"){
            @Override
            public void sing() {
                System.out.println("kleek kik ik ik ik");
            }
        },
        CARDINAL("cardinals cardinals"){
            @Override
            public void sing() {
                System.out.println("cheer-cheer-cheer");
            }
        },
        HORNE_DLARK("Haliacctus leucocephalus"){
            @Override
            public void sing() {
                System.out.println("aaa aaa aaaa");
            }
        },
        LOON("Gavia immer"){
            @Override
            public void sing() {
                System.out.println("coo Coo coo coo");
            }
        };

        Birds(String name){
            this.name=name;
        }

        public final String name;

        public abstract void sing();

    }


    public static void main(String[] args) {

        System.out.println(Birds.BALD_EAGLE);
        System.out.println(Birds.BALD_EAGLE.name);
        Birds.BALD_EAGLE.sing();

        System.out.println("\n");

        System.out.println(Birds.CARDINAL);
        System.out.println(Birds.CARDINAL.name);
        Birds.CARDINAL.sing();

    }

}

