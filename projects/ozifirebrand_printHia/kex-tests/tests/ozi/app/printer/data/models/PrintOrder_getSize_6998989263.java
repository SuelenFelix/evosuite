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

public class PrintOrder_getSize_6998989263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24221;

    public PrintOrder_getSize_6998989263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24324 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term24323 = ((Class) term24324).getDeclaredField((String) "ORDERED");
        ((Field) term24323).setAccessible(true);
        Object enum85 = ((Field) term24323).get((Object) null);
        term24221 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term24249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24264 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24221, term24221.getClass(), "id", "ckQLZGFjMX");
        setField(term24221, term24221.getClass(), "imageUrl", "qphdrqUtNx");
        setDoubleField(term24221, term24221.getClass(), "size", 0.9165240441138934);
        setIntField(term24221, term24221.getClass(), "quantity", -478195677);
        setDoubleField(term24221, term24221.getClass(), "price", 0.22227423914231126);
        setIntField(term24250, term24250.getClass(), "year", 2026);
        setShortField(term24250, term24250.getClass(), "month", (short) 2);
        setShortField(term24250, term24250.getClass(), "day", (short) 5);
        setField(term24249, term24249.getClass(), "date", term24250);
        setByteField(term24254, term24254.getClass(), "hour", (byte) 1);
        setByteField(term24254, term24254.getClass(), "minute", (byte) 38);
        setByteField(term24254, term24254.getClass(), "second", (byte) 15);
        setIntField(term24254, term24254.getClass(), "nano", 167345230);
        setField(term24249, term24249.getClass(), "time", term24254);
        setField(term24221, term24221.getClass(), "orderDate", term24249);
        setIntField(term24260, term24260.getClass(), "year", 2029);
        setShortField(term24260, term24260.getClass(), "month", (short) 6);
        setShortField(term24260, term24260.getClass(), "day", (short) 4);
        setField(term24259, term24259.getClass(), "date", term24260);
        setByteField(term24264, term24264.getClass(), "hour", (byte) 22);
        setByteField(term24264, term24264.getClass(), "minute", (byte) 1);
        setByteField(term24264, term24264.getClass(), "second", (byte) 38);
        setIntField(term24264, term24264.getClass(), "nano", 329228491);
        setField(term24259, term24259.getClass(), "time", term24264);
        setField(term24221, term24221.getClass(), "deliveryDate", term24259);
        setBooleanField(term24221, term24221.getClass(), "ordered", true);
        setField(term24221, term24221.getClass(), "userId", "bwlLFAfNWx");
        setField(term24221, term24221.getClass(), "orderStatus", enum85);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term24221, args);
    }

};


