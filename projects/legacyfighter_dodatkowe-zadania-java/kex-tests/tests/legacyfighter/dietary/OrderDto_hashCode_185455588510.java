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

public class OrderDto_hashCode_185455588510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18659;

    public OrderDto_hashCode_185455588510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18660 = new Long(-7148236042086608592L);
        Class<? extends Object> term18710 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term18709 = ((Class) term18710).getDeclaredField((String) "Wire_One_Item");
        ((Field) term18709).setAccessible(true);
        Object enum64 = ((Field) term18709).get((Object) null);
        Class<? extends Object> term18941 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term18940 = ((Class) term18941).getDeclaredField((String) "Returned");
        ((Field) term18940).setAccessible(true);
        Object enum65 = ((Field) term18940).get((Object) null);
        Long term18707 = new Long(7716258711075652753L);
        term18659 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        Object term18662 = newInstance(Class.forName("java.time.Instant"));
        Object term18694 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term18659, term18659.getClass(), "orderId", term18660);
        setLongField(term18662, term18662.getClass(), "seconds", 1268671677L);
        setIntField(term18662, term18662.getClass(), "nanos", 540000000);
        setField(term18659, term18659.getClass(), "confirmationTimestamp", term18662);
        setField(term18659, term18659.getClass(), "orderType", enum64);
        setField(term18659, term18659.getClass(), "orderState", enum65);
        setField(term18694, term18694.getClass(), "name", "HNVOAXYNEZ");
        setField(term18694, term18694.getClass(), "id", term18707);
        setField(term18659, term18659.getClass(), "customerDto", term18694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term18659, args);
    }

};


