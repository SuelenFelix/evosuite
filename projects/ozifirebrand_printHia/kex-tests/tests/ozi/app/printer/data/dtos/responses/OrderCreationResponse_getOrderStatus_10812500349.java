package ozi.app.printer.data.dtos.responses;

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
import static ozi.app.printer.data.dtos.responses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class OrderCreationResponse_getOrderStatus_10812500349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2484;

    public OrderCreationResponse_getOrderStatus_10812500349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2565 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term2564 = ((Class) term2565).getDeclaredField((String) "ORDERED");
        ((Field) term2564).setAccessible(true);
        Object enum8 = ((Field) term2564).get((Object) null);
        term2484 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term2512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2517 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2527 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2484, term2484.getClass(), "id", "ZiaGIbnzTs");
        setField(term2484, term2484.getClass(), "imageUrl", "tbcdzjIfER");
        setDoubleField(term2484, term2484.getClass(), "size", 0.9828442029246764);
        setIntField(term2484, term2484.getClass(), "quantity", 1227103734);
        setDoubleField(term2484, term2484.getClass(), "price", 0.2779719046761513);
        setIntField(term2513, term2513.getClass(), "year", 2015);
        setShortField(term2513, term2513.getClass(), "month", (short) 9);
        setShortField(term2513, term2513.getClass(), "day", (short) 16);
        setField(term2512, term2512.getClass(), "date", term2513);
        setByteField(term2517, term2517.getClass(), "hour", (byte) 6);
        setByteField(term2517, term2517.getClass(), "minute", (byte) 19);
        setByteField(term2517, term2517.getClass(), "second", (byte) 42);
        setIntField(term2517, term2517.getClass(), "nano", 630084975);
        setField(term2512, term2512.getClass(), "time", term2517);
        setField(term2484, term2484.getClass(), "orderDate", term2512);
        setIntField(term2523, term2523.getClass(), "year", 2029);
        setShortField(term2523, term2523.getClass(), "month", (short) 6);
        setShortField(term2523, term2523.getClass(), "day", (short) 23);
        setField(term2522, term2522.getClass(), "date", term2523);
        setByteField(term2527, term2527.getClass(), "hour", (byte) 21);
        setByteField(term2527, term2527.getClass(), "minute", (byte) 55);
        setByteField(term2527, term2527.getClass(), "second", (byte) 27);
        setIntField(term2527, term2527.getClass(), "nano", 66889274);
        setField(term2522, term2522.getClass(), "time", term2527);
        setField(term2484, term2484.getClass(), "deliveryDate", term2522);
        setBooleanField(term2484, term2484.getClass(), "ordered", true);
        setField(term2484, term2484.getClass(), "orderStatus", enum8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderStatus", argTypes, term2484, args);
    }

};


