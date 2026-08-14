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

public class OrderDto_getCustomerDto_9456505787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17181;

    public OrderDto_getCustomerDto_9456505787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17182 = new Long(-8854988339892073229L);
        Class<? extends Object> term17220 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term17219 = ((Class) term17220).getDeclaredField((String) "Phone");
        ((Field) term17219).setAccessible(true);
        Object enum58 = ((Field) term17219).get((Object) null);
        Class<? extends Object> term17427 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term17426 = ((Class) term17427).getDeclaredField((String) "Paid");
        ((Field) term17426).setAccessible(true);
        Object enum59 = ((Field) term17426).get((Object) null);
        Long term17217 = new Long(2769081086274438111L);
        term17181 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        Object term17184 = newInstance(Class.forName("java.time.Instant"));
        Object term17204 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term17181, term17181.getClass(), "orderId", term17182);
        setLongField(term17184, term17184.getClass(), "seconds", 1374845329L);
        setIntField(term17184, term17184.getClass(), "nanos", 130000000);
        setField(term17181, term17181.getClass(), "confirmationTimestamp", term17184);
        setField(term17181, term17181.getClass(), "orderType", enum58);
        setField(term17181, term17181.getClass(), "orderState", enum59);
        setField(term17204, term17204.getClass(), "name", "wgRGBNrTGP");
        setField(term17204, term17204.getClass(), "id", term17217);
        setField(term17181, term17181.getClass(), "customerDto", term17204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerDto", argTypes, term17181, args);
    }

};


