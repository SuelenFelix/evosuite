package space.gavinklfong.demo.streamapi.models;

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
import static space.gavinklfong.demo.streamapi.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Order_getOrderDate_135047396521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3346;

    public Order_getOrderDate_135047396521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3346 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        setField(term3346, term3346.getClass(), "id", null);
        setField(term3346, term3346.getClass(), "orderDate", null);
        setField(term3346, term3346.getClass(), "deliveryDate", null);
        setField(term3346, term3346.getClass(), "status", null);
        setField(term3346, term3346.getClass(), "customer", null);
        setField(term3346, term3346.getClass(), "products", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderDate", argTypes, term3346, args);
    }

};


