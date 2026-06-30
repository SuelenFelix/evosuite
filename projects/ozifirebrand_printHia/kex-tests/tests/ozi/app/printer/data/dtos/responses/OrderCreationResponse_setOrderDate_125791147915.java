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

public class OrderCreationResponse_setOrderDate_125791147915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4352;
     Object term4414;

    public OrderCreationResponse_setOrderDate_125791147915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4445 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term4444 = ((Class) term4445).getDeclaredField((String) "DELIVERED");
        ((Field) term4444).setAccessible(true);
        Object enum14 = ((Field) term4444).get((Object) null);
        term4352 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term4380 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4381 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4385 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4390 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4391 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4395 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4352, term4352.getClass(), "id", "OWDIEULEFu");
        setField(term4352, term4352.getClass(), "imageUrl", "dWRymuLBtr");
        setDoubleField(term4352, term4352.getClass(), "size", 0.37161417339133307);
        setIntField(term4352, term4352.getClass(), "quantity", 597278769);
        setDoubleField(term4352, term4352.getClass(), "price", 0.6805867182029153);
        setIntField(term4381, term4381.getClass(), "year", 2021);
        setShortField(term4381, term4381.getClass(), "month", (short) 8);
        setShortField(term4381, term4381.getClass(), "day", (short) 12);
        setField(term4380, term4380.getClass(), "date", term4381);
        setByteField(term4385, term4385.getClass(), "hour", (byte) 2);
        setByteField(term4385, term4385.getClass(), "minute", (byte) 17);
        setByteField(term4385, term4385.getClass(), "second", (byte) 51);
        setIntField(term4385, term4385.getClass(), "nano", 207375141);
        setField(term4380, term4380.getClass(), "time", term4385);
        setField(term4352, term4352.getClass(), "orderDate", term4380);
        setIntField(term4391, term4391.getClass(), "year", 2025);
        setShortField(term4391, term4391.getClass(), "month", (short) 11);
        setShortField(term4391, term4391.getClass(), "day", (short) 3);
        setField(term4390, term4390.getClass(), "date", term4391);
        setByteField(term4395, term4395.getClass(), "hour", (byte) 21);
        setByteField(term4395, term4395.getClass(), "minute", (byte) 24);
        setByteField(term4395, term4395.getClass(), "second", (byte) 23);
        setIntField(term4395, term4395.getClass(), "nano", 210986721);
        setField(term4390, term4390.getClass(), "time", term4395);
        setField(term4352, term4352.getClass(), "deliveryDate", term4390);
        setBooleanField(term4352, term4352.getClass(), "ordered", true);
        setField(term4352, term4352.getClass(), "orderStatus", enum14);
        term4414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4419 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4415, term4415.getClass(), "year", 2016);
        setShortField(term4415, term4415.getClass(), "month", (short) 6);
        setShortField(term4415, term4415.getClass(), "day", (short) 15);
        setField(term4414, term4414.getClass(), "date", term4415);
        setByteField(term4419, term4419.getClass(), "hour", (byte) 21);
        setByteField(term4419, term4419.getClass(), "minute", (byte) 23);
        setByteField(term4419, term4419.getClass(), "second", (byte) 23);
        setIntField(term4419, term4419.getClass(), "nano", 433372070);
        setField(term4414, term4414.getClass(), "time", term4419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term4414;
        callMethod(klass, "setOrderDate", argTypes, term4352, args);
    }

};


