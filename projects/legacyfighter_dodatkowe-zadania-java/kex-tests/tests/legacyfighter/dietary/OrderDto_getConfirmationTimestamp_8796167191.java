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

public class OrderDto_getConfirmationTimestamp_8796167191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13849;

    public OrderDto_getConfirmationTimestamp_8796167191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13850 = new Long(-4821516944173509228L);
        Class<? extends Object> term13887 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term13886 = ((Class) term13887).getDeclaredField((String) "Wire");
        ((Field) term13886).setAccessible(true);
        Object enum44 = ((Field) term13886).get((Object) null);
        Class<? extends Object> term14091 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term14090 = ((Class) term14091).getDeclaredField((String) "Paid");
        ((Field) term14090).setAccessible(true);
        Object enum45 = ((Field) term14090).get((Object) null);
        Long term13884 = new Long(2315395988604904502L);
        term13849 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        Object term13852 = newInstance(Class.forName("java.time.Instant"));
        Object term13871 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term13849, term13849.getClass(), "orderId", term13850);
        setLongField(term13852, term13852.getClass(), "seconds", 1828947956L);
        setIntField(term13852, term13852.getClass(), "nanos", 352000000);
        setField(term13849, term13849.getClass(), "confirmationTimestamp", term13852);
        setField(term13849, term13849.getClass(), "orderType", enum44);
        setField(term13849, term13849.getClass(), "orderState", enum45);
        setField(term13871, term13871.getClass(), "name", "xmzSoVgiED");
        setField(term13871, term13871.getClass(), "id", term13884);
        setField(term13849, term13849.getClass(), "customerDto", term13871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfirmationTimestamp", argTypes, term13849, args);
    }

};


