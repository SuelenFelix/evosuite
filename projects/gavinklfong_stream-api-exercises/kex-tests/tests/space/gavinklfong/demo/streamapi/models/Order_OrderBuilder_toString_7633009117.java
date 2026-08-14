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

public class Order_OrderBuilder_toString_7633009117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1824;

    public Order_OrderBuilder_toString_7633009117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1824 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder"));
        setField(term1824, term1824.getClass(), "id", null);
        setField(term1824, term1824.getClass(), "orderDate", null);
        setField(term1824, term1824.getClass(), "deliveryDate", null);
        setField(term1824, term1824.getClass(), "status", null);
        setField(term1824, term1824.getClass(), "customer", null);
        setField(term1824, term1824.getClass(), "products", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order$OrderBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1824, args);
    }

};


