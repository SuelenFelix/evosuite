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

public class OrderDto_getOrderState_11395092485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15988;

    public OrderDto_getOrderState_11395092485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15989 = new Long(2155219577693802424L);
        Class<? extends Object> term16027 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term16026 = ((Class) term16027).getDeclaredField((String) "Phone");
        ((Field) term16026).setAccessible(true);
        Object enum53 = ((Field) term16026).get((Object) null);
        Class<? extends Object> term16234 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term16233 = ((Class) term16234).getDeclaredField((String) "Paid");
        ((Field) term16233).setAccessible(true);
        Object enum54 = ((Field) term16233).get((Object) null);
        Long term16024 = new Long(-4033544645261759750L);
        term15988 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        Object term15991 = newInstance(Class.forName("java.time.Instant"));
        Object term16011 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term15988, term15988.getClass(), "orderId", term15989);
        setLongField(term15991, term15991.getClass(), "seconds", 1758154207L);
        setIntField(term15991, term15991.getClass(), "nanos", 110000000);
        setField(term15988, term15988.getClass(), "confirmationTimestamp", term15991);
        setField(term15988, term15988.getClass(), "orderType", enum53);
        setField(term15988, term15988.getClass(), "orderState", enum54);
        setField(term16011, term16011.getClass(), "name", "IDJUVPgUJf");
        setField(term16011, term16011.getClass(), "id", term16024);
        setField(term15988, term15988.getClass(), "customerDto", term16011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderState", argTypes, term15988, args);
    }

};


