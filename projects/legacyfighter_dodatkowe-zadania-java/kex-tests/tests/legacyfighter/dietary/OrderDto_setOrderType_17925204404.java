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
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

public class OrderDto_setOrderType_17925204404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15252;
     Object enum52;

    public OrderDto_setOrderType_17925204404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15253 = new Long(-5133307284441518726L);
        Class<? extends Object> term15314 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term15313 = ((Class) term15314).getDeclaredField((String) "Special_Discount");
        ((Field) term15313).setAccessible(true);
        Object enum50 = ((Field) term15313).get((Object) null);
        Class<? extends Object> term15554 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term15553 = ((Class) term15554).getDeclaredField((String) "Initial");
        ((Field) term15553).setAccessible(true);
        Object enum51 = ((Field) term15553).get((Object) null);
        Long term15302 = new Long(7921404547326630089L);
        term15252 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        Object term15255 = newInstance(Class.forName("java.time.Instant"));
        Object term15289 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term15252, term15252.getClass(), "orderId", term15253);
        setLongField(term15255, term15255.getClass(), "seconds", 1444705856L);
        setIntField(term15255, term15255.getClass(), "nanos", 246000000);
        setField(term15252, term15252.getClass(), "confirmationTimestamp", term15255);
        setField(term15252, term15252.getClass(), "orderType", enum50);
        setField(term15252, term15252.getClass(), "orderState", enum51);
        setField(term15289, term15289.getClass(), "name", "UBPHmOICBs");
        setField(term15289, term15289.getClass(), "id", term15302);
        setField(term15252, term15252.getClass(), "customerDto", term15289);
        Class<? extends Object> term15782 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term15781 = ((Class) term15782).getDeclaredField((String) "Phone");
        ((Field) term15781).setAccessible(true);
        enum52 = ((Field) term15781).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.Order$OrderType");
        Object[] args = new Object[1];
        args[0] = enum52;
        callMethod(klass, "setOrderType", argTypes, term15252, args);
    }

};


