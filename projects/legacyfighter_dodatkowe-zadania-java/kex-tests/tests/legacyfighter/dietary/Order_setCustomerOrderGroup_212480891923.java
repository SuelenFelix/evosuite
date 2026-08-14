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

public class Order_setCustomerOrderGroup_212480891923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13012;

    public Order_setCustomerOrderGroup_212480891923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13012 = newInstance(Class.forName("legacyfighter.dietary.Order"));
        setField(term13012, term13012.getClass(), "id", null);
        setField(term13012, term13012.getClass(), "orderState", null);
        setField(term13012, term13012.getClass(), "orderType", null);
        setField(term13012, term13012.getClass(), "customerOrderGroup", null);
        setField(term13012, term13012.getClass(), "items", null);
        setField(term13012, term13012.getClass(), "taxRules", null);
        setField(term13012, term13012.getClass(), "confirmationTimestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCustomerOrderGroup", argTypes, term13012, args);
    }

};


