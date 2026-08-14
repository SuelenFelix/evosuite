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

public class OrderDto_setCustomerDto_3128765788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17645;
     Object term17694;

    public OrderDto_setCustomerDto_3128765788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17646 = new Long(-6339531459447942677L);
        Class<? extends Object> term17710 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term17709 = ((Class) term17710).getDeclaredField((String) "Wire_One_Item");
        ((Field) term17709).setAccessible(true);
        Object enum60 = ((Field) term17709).get((Object) null);
        Class<? extends Object> term17941 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term17940 = ((Class) term17941).getDeclaredField((String) "Initial");
        ((Field) term17940).setAccessible(true);
        Object enum61 = ((Field) term17940).get((Object) null);
        Long term17692 = new Long(2014229530618878786L);
        term17645 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        Object term17648 = newInstance(Class.forName("java.time.Instant"));
        Object term17679 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term17645, term17645.getClass(), "orderId", term17646);
        setLongField(term17648, term17648.getClass(), "seconds", 1608183479L);
        setIntField(term17648, term17648.getClass(), "nanos", 74000000);
        setField(term17645, term17645.getClass(), "confirmationTimestamp", term17648);
        setField(term17645, term17645.getClass(), "orderType", enum60);
        setField(term17645, term17645.getClass(), "orderState", enum61);
        setField(term17679, term17679.getClass(), "name", "FIdNVptZpW");
        setField(term17679, term17679.getClass(), "id", term17692);
        setField(term17645, term17645.getClass(), "customerDto", term17679);
        Long term17707 = new Long(-3684549603148553700L);
        term17694 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term17694, term17694.getClass(), "name", "rQjxAhisjm");
        setField(term17694, term17694.getClass(), "id", term17707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.CustomerDto");
        Object[] args = new Object[1];
        args[0] = term17694;
        callMethod(klass, "setCustomerDto", argTypes, term17645, args);
    }

};


