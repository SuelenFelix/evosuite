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

public class PrintOrder_setDeliveryDate_43131761317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28855;
     Object term28929;

    public PrintOrder_setDeliveryDate_43131761317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28970 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term28969 = ((Class) term28970).getDeclaredField((String) "DELIVERED");
        ((Field) term28969).setAccessible(true);
        Object enum99 = ((Field) term28969).get((Object) null);
        term28855 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term28883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28888 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28898 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28855, term28855.getClass(), "id", "DzKFxEuEEC");
        setField(term28855, term28855.getClass(), "imageUrl", "CAMnvfDLJL");
        setDoubleField(term28855, term28855.getClass(), "size", 0.5485690030548175);
        setIntField(term28855, term28855.getClass(), "quantity", 941650513);
        setDoubleField(term28855, term28855.getClass(), "price", 0.9765248027281291);
        setIntField(term28884, term28884.getClass(), "year", 2011);
        setShortField(term28884, term28884.getClass(), "month", (short) 6);
        setShortField(term28884, term28884.getClass(), "day", (short) 21);
        setField(term28883, term28883.getClass(), "date", term28884);
        setByteField(term28888, term28888.getClass(), "hour", (byte) 3);
        setByteField(term28888, term28888.getClass(), "minute", (byte) 19);
        setByteField(term28888, term28888.getClass(), "second", (byte) 41);
        setIntField(term28888, term28888.getClass(), "nano", 920537748);
        setField(term28883, term28883.getClass(), "time", term28888);
        setField(term28855, term28855.getClass(), "orderDate", term28883);
        setIntField(term28894, term28894.getClass(), "year", 2020);
        setShortField(term28894, term28894.getClass(), "month", (short) 12);
        setShortField(term28894, term28894.getClass(), "day", (short) 30);
        setField(term28893, term28893.getClass(), "date", term28894);
        setByteField(term28898, term28898.getClass(), "hour", (byte) 2);
        setByteField(term28898, term28898.getClass(), "minute", (byte) 11);
        setByteField(term28898, term28898.getClass(), "second", (byte) 8);
        setIntField(term28898, term28898.getClass(), "nano", 528799251);
        setField(term28893, term28893.getClass(), "time", term28898);
        setField(term28855, term28855.getClass(), "deliveryDate", term28893);
        setBooleanField(term28855, term28855.getClass(), "ordered", true);
        setField(term28855, term28855.getClass(), "userId", "mfHtgSbdjD");
        setField(term28855, term28855.getClass(), "orderStatus", enum99);
        term28929 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28930 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28934 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28930, term28930.getClass(), "year", 2027);
        setShortField(term28930, term28930.getClass(), "month", (short) 9);
        setShortField(term28930, term28930.getClass(), "day", (short) 29);
        setField(term28929, term28929.getClass(), "date", term28930);
        setByteField(term28934, term28934.getClass(), "hour", (byte) 19);
        setByteField(term28934, term28934.getClass(), "minute", (byte) 13);
        setByteField(term28934, term28934.getClass(), "second", (byte) 31);
        setIntField(term28934, term28934.getClass(), "nano", 854066575);
        setField(term28929, term28929.getClass(), "time", term28934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term28929;
        callMethod(klass, "setDeliveryDate", argTypes, term28855, args);
    }

};


