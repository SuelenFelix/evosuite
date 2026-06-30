package refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Client_createBird_14005345981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term986;
     Object term987;

    public Client_createBird_14005345981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term986 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Client"));
        term987 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Data"));
        setBooleanField(term987, term987.getClass(), "isNailed", false);
        setIntField(term987, term987.getClass(), "voltage", 597278769);
        setIntField(term987, term987.getClass(), "numberOfCounts", -1685132342);
        setField(term987, term987.getClass(), "type", "gGSMzuGICf");
        setField(term987, term987.getClass(), "name", "hxCBltsObl");
        setField(term987, term987.getClass(), "plumage", "BndsHwAFMv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Client");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Data");
        Object[] args = new Object[1];
        args[0] = term987;
        callMethod(klass, "createBird", argTypes, term986, args);
    }

};


