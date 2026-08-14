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

public class Order_getItems_55750459114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13004;

    public Order_getItems_55750459114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13004 = newInstance(Class.forName("legacyfighter.dietary.Order"));
        setField(term13004, term13004.getClass(), "id", null);
        setField(term13004, term13004.getClass(), "orderState", null);
        setField(term13004, term13004.getClass(), "orderType", null);
        setField(term13004, term13004.getClass(), "customerOrderGroup", null);
        setField(term13004, term13004.getClass(), "items", null);
        setField(term13004, term13004.getClass(), "taxRules", null);
        setField(term13004, term13004.getClass(), "confirmationTimestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term13004, args);
    }

};


