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
import java.lang.Object;
import java.lang.String;

public class OrderServicesImpl_save_17082624294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455;

    public OrderServicesImpl_save_17082624294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term560 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term559 = ((Class) term560).getDeclaredField((String) "DELIVERED");
        ((Field) term559).setAccessible(true);
        Object enum1 = ((Field) term559).get((Object) null);
        term455 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term483 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term484 = newInstance(Class.forName("java.time.LocalDate"));
        Object term488 = newInstance(Class.forName("java.time.LocalTime"));
        Object term493 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term494 = newInstance(Class.forName("java.time.LocalDate"));
        Object term498 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term455, term455.getClass(), "id", "MjGYSRKTNF");
        setField(term455, term455.getClass(), "imageUrl", "hRNSzYYIrc");
        setDoubleField(term455, term455.getClass(), "size", 0.28570734989730284);
        setIntField(term455, term455.getClass(), "quantity", 391863371);
        setDoubleField(term455, term455.getClass(), "price", 0.40176586625454525);
        setIntField(term484, term484.getClass(), "year", 2015);
        setShortField(term484, term484.getClass(), "month", (short) 9);
        setShortField(term484, term484.getClass(), "day", (short) 19);
        setField(term483, term483.getClass(), "date", term484);
        setByteField(term488, term488.getClass(), "hour", (byte) 9);
        setByteField(term488, term488.getClass(), "minute", (byte) 4);
        setByteField(term488, term488.getClass(), "second", (byte) 10);
        setIntField(term488, term488.getClass(), "nano", 401765865);
        setField(term483, term483.getClass(), "time", term488);
        setField(term455, term455.getClass(), "orderDate", term483);
        setIntField(term494, term494.getClass(), "year", 2015);
        setShortField(term494, term494.getClass(), "month", (short) 4);
        setShortField(term494, term494.getClass(), "day", (short) 14);
        setField(term493, term493.getClass(), "date", term494);
        setByteField(term498, term498.getClass(), "hour", (byte) 18);
        setByteField(term498, term498.getClass(), "minute", (byte) 24);
        setByteField(term498, term498.getClass(), "second", (byte) 32);
        setIntField(term498, term498.getClass(), "nano", 369233818);
        setField(term493, term493.getClass(), "time", term498);
        setField(term455, term455.getClass(), "deliveryDate", term493);
        setBooleanField(term455, term455.getClass(), "ordered", false);
        setField(term455, term455.getClass(), "userId", "RMFIsYGgne");
        setField(term455, term455.getClass(), "orderStatus", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.services.orderService.OrderServicesImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Object[] args = new Object[1];
        args[0] = term455;
        callMethod(klass, "save", argTypes, null, args);
    }

};


