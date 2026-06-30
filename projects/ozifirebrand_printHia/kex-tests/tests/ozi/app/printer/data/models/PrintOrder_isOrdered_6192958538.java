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

public class PrintOrder_isOrdered_6192958538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25854;

    public PrintOrder_isOrdered_6192958538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25957 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term25956 = ((Class) term25957).getDeclaredField((String) "PENDING");
        ((Field) term25956).setAccessible(true);
        Object enum90 = ((Field) term25956).get((Object) null);
        term25854 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term25882 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25883 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25887 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25892 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25893 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25897 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term25854, term25854.getClass(), "id", "FiYYLuailz");
        setField(term25854, term25854.getClass(), "imageUrl", "XebAeSnCKZ");
        setDoubleField(term25854, term25854.getClass(), "size", 0.5179319342588155);
        setIntField(term25854, term25854.getClass(), "quantity", -1465035361);
        setDoubleField(term25854, term25854.getClass(), "price", 0.25025774487844066);
        setIntField(term25883, term25883.getClass(), "year", 2010);
        setShortField(term25883, term25883.getClass(), "month", (short) 2);
        setShortField(term25883, term25883.getClass(), "day", (short) 28);
        setField(term25882, term25882.getClass(), "date", term25883);
        setByteField(term25887, term25887.getClass(), "hour", (byte) 2);
        setByteField(term25887, term25887.getClass(), "minute", (byte) 54);
        setByteField(term25887, term25887.getClass(), "second", (byte) 48);
        setIntField(term25887, term25887.getClass(), "nano", 930628940);
        setField(term25882, term25882.getClass(), "time", term25887);
        setField(term25854, term25854.getClass(), "orderDate", term25882);
        setIntField(term25893, term25893.getClass(), "year", 2022);
        setShortField(term25893, term25893.getClass(), "month", (short) 3);
        setShortField(term25893, term25893.getClass(), "day", (short) 11);
        setField(term25892, term25892.getClass(), "date", term25893);
        setByteField(term25897, term25897.getClass(), "hour", (byte) 7);
        setByteField(term25897, term25897.getClass(), "minute", (byte) 12);
        setByteField(term25897, term25897.getClass(), "second", (byte) 56);
        setIntField(term25897, term25897.getClass(), "nano", 884158779);
        setField(term25892, term25892.getClass(), "time", term25897);
        setField(term25854, term25854.getClass(), "deliveryDate", term25892);
        setBooleanField(term25854, term25854.getClass(), "ordered", true);
        setField(term25854, term25854.getClass(), "userId", "GeddnXjHGy");
        setField(term25854, term25854.getClass(), "orderStatus", enum90);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOrdered", argTypes, term25854, args);
    }

};


