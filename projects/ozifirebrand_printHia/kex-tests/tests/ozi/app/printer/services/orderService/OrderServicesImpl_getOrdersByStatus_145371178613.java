package ozi.app.printer.services.orderService;

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
import static ozi.app.printer.services.orderService.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class OrderServicesImpl_getOrdersByStatus_145371178613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum3;

    public OrderServicesImpl_getOrdersByStatus_145371178613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1191 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term1190 = ((Class) term1191).getDeclaredField((String) "DELIVERED");
        ((Field) term1190).setAccessible(true);
        enum3 = ((Field) term1190).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.services.orderService.OrderServicesImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.OrderStatus");
        Object[] args = new Object[1];
        args[0] = enum3;
        callMethod(klass, "getOrdersByStatus", argTypes, null, args);
    }

};


