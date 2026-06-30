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

public class OrderServicesImpl_updateOrderStatus_9657946038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum2;

    public OrderServicesImpl_updateOrderStatus_9657946038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term891 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term890 = ((Class) term891).getDeclaredField((String) "PENDING");
        ((Field) term890).setAccessible(true);
        enum2 = ((Field) term890).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.services.orderService.OrderServicesImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("ozi.app.printer.data.models.OrderStatus");
        Object[] args = new Object[2];
        args[0] = "LQFpaHEwXR";
        args[1] = enum2;
        callMethod(klass, "updateOrderStatus", argTypes, null, args);
    }

};


