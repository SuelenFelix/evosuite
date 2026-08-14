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

public class CustomerOrderGroup_getCustomer_208224003414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38575;

    public CustomerOrderGroup_getCustomer_208224003414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38575 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term38575, term38575.getClass(), "id", null);
        setField(term38575, term38575.getClass(), "orders", null);
        setField(term38575, term38575.getClass(), "description", null);
        setField(term38575, term38575.getClass(), "customer", null);
        setField(term38575, term38575.getClass(), "parent", null);
        setField(term38575, term38575.getClass(), "childs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomer", argTypes, term38575, args);
    }

};


