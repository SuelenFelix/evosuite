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

public class OrderDto_setOrderState_1315575086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16452;
     Object enum57;

    public OrderDto_setOrderState_1315575086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16453 = new Long(593230449611047187L);
        Class<? extends Object> term16511 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term16510 = ((Class) term16511).getDeclaredField((String) "Wire_One_Item");
        ((Field) term16510).setAccessible(true);
        Object enum55 = ((Field) term16510).get((Object) null);
        Class<? extends Object> term16742 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term16741 = ((Class) term16742).getDeclaredField((String) "Paid");
        ((Field) term16741).setAccessible(true);
        Object enum56 = ((Field) term16741).get((Object) null);
        Long term16496 = new Long(-3355167737637002830L);
        term16452 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        Object term16455 = newInstance(Class.forName("java.time.Instant"));
        Object term16483 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term16452, term16452.getClass(), "orderId", term16453);
        setLongField(term16455, term16455.getClass(), "seconds", 1374840193L);
        setIntField(term16455, term16455.getClass(), "nanos", 140000000);
        setField(term16452, term16452.getClass(), "confirmationTimestamp", term16455);
        setField(term16452, term16452.getClass(), "orderType", enum55);
        setField(term16452, term16452.getClass(), "orderState", enum56);
        setField(term16483, term16483.getClass(), "name", "JmnWRJUxGr");
        setField(term16483, term16483.getClass(), "id", term16496);
        setField(term16452, term16452.getClass(), "customerDto", term16483);
        Class<? extends Object> term16961 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term16960 = ((Class) term16961).getDeclaredField((String) "Returned");
        ((Field) term16960).setAccessible(true);
        enum57 = ((Field) term16960).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.Order$OrderState");
        Object[] args = new Object[1];
        args[0] = enum57;
        callMethod(klass, "setOrderState", argTypes, term16452, args);
    }

};


