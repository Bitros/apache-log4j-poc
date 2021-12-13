package server;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import java.util.Hashtable;

/**
 * Remote
 */
public class PersonFactory implements ObjectFactory {

    public PersonFactory() {
        System.out.println("in remote constructor");
    }

    static {
        System.out.println("in remote static");
    }

    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        return new Person();
    }
}
