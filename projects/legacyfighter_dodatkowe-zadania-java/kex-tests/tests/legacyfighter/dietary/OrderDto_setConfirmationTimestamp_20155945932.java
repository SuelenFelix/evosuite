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

public class OrderDto_setConfirmationTimestamp_20155945932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14309;
     Object term14347;

    public OrderDto_setConfirmationTimestamp_20155945932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14310 = new Long(4337555582321907177L);
        Class<? extends Object> term14351 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term14350 = ((Class) term14351).getDeclaredField((String) "Phone");
        ((Field) term14350).setAccessible(true);
        Object enum46 = ((Field) term14350).get((Object) null);
        Class<? extends Object> term14558 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term14557 = ((Class) term14558).getDeclaredField((String) "Paid");
        ((Field) term14557).setAccessible(true);
        Object enum47 = ((Field) term14557).get((Object) null);
        Long term14345 = new Long(-6367418587326372844L);
        term14309 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        Object term14312 = newInstance(Class.forName("java.time.Instant"));
        Object term14332 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term14309, term14309.getClass(), "orderId", term14310);
        setLongField(term14312, term14312.getClass(), "seconds", 1458419201L);
        setIntField(term14312, term14312.getClass(), "nanos", 638000000);
        setField(term14309, term14309.getClass(), "confirmationTimestamp", term14312);
        setField(term14309, term14309.getClass(), "orderType", enum46);
        setField(term14309, term14309.getClass(), "orderState", enum47);
        setField(term14332, term14332.getClass(), "name", "pdSvedKgPq");
        setField(term14332, term14332.getClass(), "id", term14345);
        setField(term14309, term14309.getClass(), "customerDto", term14332);
        term14347 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term14347, term14347.getClass(), "seconds", 1378006520L);
        setIntField(term14347, term14347.getClass(), "nanos", 445000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term14347;
        callMethod(klass, "setConfirmationTimestamp", argTypes, term14309, args);
    }

};


