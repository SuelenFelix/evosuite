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

public class OrderDto_setOrderType_179252044015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19174;

    public OrderDto_setOrderType_179252044015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19174 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        setField(term19174, term19174.getClass(), "orderId", null);
        setField(term19174, term19174.getClass(), "confirmationTimestamp", null);
        setField(term19174, term19174.getClass(), "orderType", null);
        setField(term19174, term19174.getClass(), "orderState", null);
        setField(term19174, term19174.getClass(), "customerDto", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.Order$OrderType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOrderType", argTypes, term19174, args);
    }

};


