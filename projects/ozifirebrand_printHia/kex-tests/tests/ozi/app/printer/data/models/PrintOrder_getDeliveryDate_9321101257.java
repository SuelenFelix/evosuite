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

public class PrintOrder_getDeliveryDate_9321101257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25529;

    public PrintOrder_getDeliveryDate_9321101257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25632 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term25631 = ((Class) term25632).getDeclaredField((String) "ORDERED");
        ((Field) term25631).setAccessible(true);
        Object enum89 = ((Field) term25631).get((Object) null);
        term25529 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term25557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25562 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25572 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25529, term25529.getClass(), "id", "jiCGTTzKGB");
        setField(term25529, term25529.getClass(), "imageUrl", "MqICFYzDJj");
        setDoubleField(term25529, term25529.getClass(), "size", 0.5407563152320285);
        setIntField(term25529, term25529.getClass(), "quantity", 1240914516);
        setDoubleField(term25529, term25529.getClass(), "price", 0.9485929668765458);
        setIntField(term25558, term25558.getClass(), "year", 2023);
        setShortField(term25558, term25558.getClass(), "month", (short) 8);
        setShortField(term25558, term25558.getClass(), "day", (short) 21);
        setField(term25557, term25557.getClass(), "date", term25558);
        setByteField(term25562, term25562.getClass(), "hour", (byte) 10);
        setByteField(term25562, term25562.getClass(), "minute", (byte) 36);
        setByteField(term25562, term25562.getClass(), "second", (byte) 15);
        setIntField(term25562, term25562.getClass(), "nano", 257070204);
        setField(term25557, term25557.getClass(), "time", term25562);
        setField(term25529, term25529.getClass(), "orderDate", term25557);
        setIntField(term25568, term25568.getClass(), "year", 2012);
        setShortField(term25568, term25568.getClass(), "month", (short) 12);
        setShortField(term25568, term25568.getClass(), "day", (short) 14);
        setField(term25567, term25567.getClass(), "date", term25568);
        setByteField(term25572, term25572.getClass(), "hour", (byte) 1);
        setByteField(term25572, term25572.getClass(), "minute", (byte) 47);
        setByteField(term25572, term25572.getClass(), "second", (byte) 3);
        setIntField(term25572, term25572.getClass(), "nano", 359751066);
        setField(term25567, term25567.getClass(), "time", term25572);
        setField(term25529, term25529.getClass(), "deliveryDate", term25567);
        setBooleanField(term25529, term25529.getClass(), "ordered", false);
        setField(term25529, term25529.getClass(), "userId", "YgQvdcBQKw");
        setField(term25529, term25529.getClass(), "orderStatus", enum89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeliveryDate", argTypes, term25529, args);
    }

};


