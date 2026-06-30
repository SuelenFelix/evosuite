package ozi.app.printer.data.models;

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
import static ozi.app.printer.data.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class PrintOrder_setOrderStatus_82797438220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29872;
     Object enum103;

    public PrintOrder_setOrderStatus_82797438220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29988 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term29987 = ((Class) term29988).getDeclaredField((String) "PENDING");
        ((Field) term29987).setAccessible(true);
        Object enum102 = ((Field) term29987).get((Object) null);
        term29872 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term29900 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29901 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29905 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29910 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29911 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29915 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29872, term29872.getClass(), "id", "bHHjfDCntT");
        setField(term29872, term29872.getClass(), "imageUrl", "sEphiduvkv");
        setDoubleField(term29872, term29872.getClass(), "size", 0.2382345237223229);
        setIntField(term29872, term29872.getClass(), "quantity", -1263114719);
        setDoubleField(term29872, term29872.getClass(), "price", 0.6037093070161561);
        setIntField(term29901, term29901.getClass(), "year", 2021);
        setShortField(term29901, term29901.getClass(), "month", (short) 12);
        setShortField(term29901, term29901.getClass(), "day", (short) 23);
        setField(term29900, term29900.getClass(), "date", term29901);
        setByteField(term29905, term29905.getClass(), "hour", (byte) 18);
        setByteField(term29905, term29905.getClass(), "minute", (byte) 52);
        setByteField(term29905, term29905.getClass(), "second", (byte) 27);
        setIntField(term29905, term29905.getClass(), "nano", 512484524);
        setField(term29900, term29900.getClass(), "time", term29905);
        setField(term29872, term29872.getClass(), "orderDate", term29900);
        setIntField(term29911, term29911.getClass(), "year", 2012);
        setShortField(term29911, term29911.getClass(), "month", (short) 6);
        setShortField(term29911, term29911.getClass(), "day", (short) 25);
        setField(term29910, term29910.getClass(), "date", term29911);
        setByteField(term29915, term29915.getClass(), "hour", (byte) 2);
        setByteField(term29915, term29915.getClass(), "minute", (byte) 21);
        setByteField(term29915, term29915.getClass(), "second", (byte) 28);
        setIntField(term29915, term29915.getClass(), "nano", 605177282);
        setField(term29910, term29910.getClass(), "time", term29915);
        setField(term29872, term29872.getClass(), "deliveryDate", term29910);
        setBooleanField(term29872, term29872.getClass(), "ordered", true);
        setField(term29872, term29872.getClass(), "userId", "PbLgCSAHce");
        setField(term29872, term29872.getClass(), "orderStatus", enum102);
        Class<? extends Object> term30211 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term30210 = ((Class) term30211).getDeclaredField((String) "DELIVERED");
        ((Field) term30210).setAccessible(true);
        enum103 = ((Field) term30210).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.OrderStatus");
        Object[] args = new Object[1];
        args[0] = enum103;
        callMethod(klass, "setOrderStatus", argTypes, term29872, args);
    }

};


