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

public class EuropeanSwallowDelegate_init_21349053420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676;

    public EuropeanSwallowDelegate_init_21349053420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Data"));
        setBooleanField(term676, term676.getClass(), "isNailed", true);
        setIntField(term676, term676.getClass(), "voltage", -1339778481);
        setIntField(term676, term676.getClass(), "numberOfCounts", 1725571209);
        setField(term676, term676.getClass(), "type", "TEParAifyi");
        setField(term676, term676.getClass(), "name", "OWDIEULEFu");
        setField(term676, term676.getClass(), "plumage", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.EuropeanSwallowDelegate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.multiSubClass.Data");
        Object[] args = new Object[1];
        args[0] = term676;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


