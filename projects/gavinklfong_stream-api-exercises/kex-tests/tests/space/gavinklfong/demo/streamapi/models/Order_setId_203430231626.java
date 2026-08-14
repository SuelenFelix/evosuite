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

public class Order_setId_203430231626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3351;

    public Order_setId_203430231626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3351 = newInstance(Class.forName("space.gavinklfong.demo.streamapi.models.Order"));
        setField(term3351, term3351.getClass(), "id", null);
        setField(term3351, term3351.getClass(), "orderDate", null);
        setField(term3351, term3351.getClass(), "deliveryDate", null);
        setField(term3351, term3351.getClass(), "status", null);
        setField(term3351, term3351.getClass(), "customer", null);
        setField(term3351, term3351.getClass(), "products", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("space.gavinklfong.demo.streamapi.models.Order");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term3351, args);
    }

};


