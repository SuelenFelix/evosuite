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

public class OrderDto_equals_14058692109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18178;
     Object term18220;

    public OrderDto_equals_14058692109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18179 = new Long(4665980239039735158L);
        Class<? extends Object> term18222 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term18221 = ((Class) term18222).getDeclaredField((String) "Phone");
        ((Field) term18221).setAccessible(true);
        Object enum62 = ((Field) term18221).get((Object) null);
        Class<? extends Object> term18429 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term18428 = ((Class) term18429).getDeclaredField((String) "Returned");
        ((Field) term18428).setAccessible(true);
        Object enum63 = ((Field) term18428).get((Object) null);
        Long term18218 = new Long(7429946509853918683L);
        term18178 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        Object term18181 = newInstance(Class.forName("java.time.Instant"));
        Object term18205 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term18178, term18178.getClass(), "orderId", term18179);
        setLongField(term18181, term18181.getClass(), "seconds", 1482204276L);
        setIntField(term18181, term18181.getClass(), "nanos", 107000000);
        setField(term18178, term18178.getClass(), "confirmationTimestamp", term18181);
        setField(term18178, term18178.getClass(), "orderType", enum62);
        setField(term18178, term18178.getClass(), "orderState", enum63);
        setField(term18205, term18205.getClass(), "name", "ZDhASPHjDG");
        setField(term18205, term18205.getClass(), "id", term18218);
        setField(term18178, term18178.getClass(), "customerDto", term18205);
        term18220 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18220;
        callMethod(klass, "equals", argTypes, term18178, args);
    }

};


