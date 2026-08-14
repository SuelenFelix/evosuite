package legacyfighter.dietary;

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
import static legacyfighter.dietary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CustomerOrderGroup_equals_23499160817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38578;

    public CustomerOrderGroup_equals_23499160817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38578 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term38578, term38578.getClass(), "id", null);
        setField(term38578, term38578.getClass(), "orders", null);
        setField(term38578, term38578.getClass(), "description", null);
        setField(term38578, term38578.getClass(), "customer", null);
        setField(term38578, term38578.getClass(), "parent", null);
        setField(term38578, term38578.getClass(), "childs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term38578, args);
    }

};


