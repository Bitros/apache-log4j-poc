package server;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMI {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099);
        Reference ref = new Reference("Person","PersonFactory", "http://127.0.0.1:8000/");
        registry.bind("hello", new ReferenceWrapper(ref));
        Thread.currentThread().join();
    }
}

