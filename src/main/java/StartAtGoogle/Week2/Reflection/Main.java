package StartAtGoogle.Week2.Reflection;

import StartAtGoogle.Week2.Generator;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Optional<Object> test = newInstanceSingleString(new Team("TestTeam"));
        System.out.println(test.isPresent());

        Optional<Object> test2 = newInstanceSingleString(new Player(1,2));
        System.out.println(test2.isPresent());

    }

    public static Optional<Object> newInstanceSingleString(Object o) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = o.getClass();
        Constructor[] constructors = aClass.getDeclaredConstructors();

        for (Constructor c : constructors) {
            if (c.getParameterCount() == 1) {
                if (c.getParameterTypes()[0].equals(String.class)) {
                    Object newObject =constructors[0].newInstance("New Random String");
                    return Optional.of(newObject);
                }
            }
        }

        return Optional.empty();
    }
}
