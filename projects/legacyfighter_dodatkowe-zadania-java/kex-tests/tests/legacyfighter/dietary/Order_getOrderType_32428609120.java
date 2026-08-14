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

public class Order_getOrderType_32428609120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13009;

    public Order_getOrderType_32428609120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13009 = newInstance(Class.forName("legacyfighter.dietary.Order"));
        setField(term13009, term13009.getClass(), "id", null);
        setField(term13009, term13009.getClass(), "orderState", null);
        setField(term13009, term13009.getClass(), "orderType", null);
        setField(term13009, term13009.getClass(), "customerOrderGroup", null);
        setField(term13009, term13009.getClass(), "items", null);
        setField(term13009, term13009.getClass(), "taxRules", null);
        setField(term13009, term13009.getClass(), "confirmationTimestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderType", argTypes, term13009, args);
    }

};


