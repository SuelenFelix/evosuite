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

public class PrintOrder_getImageUrl_2939856252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23896;

    public PrintOrder_getImageUrl_2939856252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23999 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term23998 = ((Class) term23999).getDeclaredField((String) "PENDING");
        ((Field) term23998).setAccessible(true);
        Object enum84 = ((Field) term23998).get((Object) null);
        term23896 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term23924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term23934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23939 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23896, term23896.getClass(), "id", "nHpMKOmlpQ");
        setField(term23896, term23896.getClass(), "imageUrl", "fKhrQsJToZ");
        setDoubleField(term23896, term23896.getClass(), "size", 0.5310967137636303);
        setIntField(term23896, term23896.getClass(), "quantity", 1375330971);
        setDoubleField(term23896, term23896.getClass(), "price", 0.6054109236809134);
        setIntField(term23925, term23925.getClass(), "year", 2020);
        setShortField(term23925, term23925.getClass(), "month", (short) 5);
        setShortField(term23925, term23925.getClass(), "day", (short) 12);
        setField(term23924, term23924.getClass(), "date", term23925);
        setByteField(term23929, term23929.getClass(), "hour", (byte) 22);
        setByteField(term23929, term23929.getClass(), "minute", (byte) 7);
        setByteField(term23929, term23929.getClass(), "second", (byte) 49);
        setIntField(term23929, term23929.getClass(), "nano", 677355362);
        setField(term23924, term23924.getClass(), "time", term23929);
        setField(term23896, term23896.getClass(), "orderDate", term23924);
        setIntField(term23935, term23935.getClass(), "year", 2010);
        setShortField(term23935, term23935.getClass(), "month", (short) 11);
        setShortField(term23935, term23935.getClass(), "day", (short) 1);
        setField(term23934, term23934.getClass(), "date", term23935);
        setByteField(term23939, term23939.getClass(), "hour", (byte) 5);
        setByteField(term23939, term23939.getClass(), "minute", (byte) 32);
        setByteField(term23939, term23939.getClass(), "second", (byte) 8);
        setIntField(term23939, term23939.getClass(), "nano", 918832231);
        setField(term23934, term23934.getClass(), "time", term23939);
        setField(term23896, term23896.getClass(), "deliveryDate", term23934);
        setBooleanField(term23896, term23896.getClass(), "ordered", false);
        setField(term23896, term23896.getClass(), "userId", "wsysQLGFnl");
        setField(term23896, term23896.getClass(), "orderStatus", enum84);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term23896, args);
    }

};


