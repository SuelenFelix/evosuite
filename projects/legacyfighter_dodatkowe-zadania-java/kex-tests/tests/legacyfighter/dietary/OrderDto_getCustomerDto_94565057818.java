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

public class OrderDto_getCustomerDto_94565057818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19177;

    public OrderDto_getCustomerDto_94565057818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19177 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        setField(term19177, term19177.getClass(), "orderId", null);
        setField(term19177, term19177.getClass(), "confirmationTimestamp", null);
        setField(term19177, term19177.getClass(), "orderType", null);
        setField(term19177, term19177.getClass(), "orderState", null);
        setField(term19177, term19177.getClass(), "customerDto", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerDto", argTypes, term19177, args);
    }

};


