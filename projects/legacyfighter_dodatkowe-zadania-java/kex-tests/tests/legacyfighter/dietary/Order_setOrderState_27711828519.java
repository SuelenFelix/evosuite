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

public class Order_setOrderState_27711828519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13008;

    public Order_setOrderState_27711828519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13008 = newInstance(Class.forName("legacyfighter.dietary.Order"));
        setField(term13008, term13008.getClass(), "id", null);
        setField(term13008, term13008.getClass(), "orderState", null);
        setField(term13008, term13008.getClass(), "orderType", null);
        setField(term13008, term13008.getClass(), "customerOrderGroup", null);
        setField(term13008, term13008.getClass(), "items", null);
        setField(term13008, term13008.getClass(), "taxRules", null);
        setField(term13008, term13008.getClass(), "confirmationTimestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.Order$OrderState");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOrderState", argTypes, term13008, args);
    }

};


