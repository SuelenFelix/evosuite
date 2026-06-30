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
import java.lang.Double;

public class PrintOrder_setSize_203492977413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27531;
     Object term27603;

    public PrintOrder_setSize_203492977413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27636 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term27635 = ((Class) term27636).getDeclaredField((String) "PENDING");
        ((Field) term27635).setAccessible(true);
        Object enum95 = ((Field) term27635).get((Object) null);
        term27531 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term27559 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27560 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27564 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27569 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27570 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27574 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27531, term27531.getClass(), "id", "iiHBhsNFgk");
        setField(term27531, term27531.getClass(), "imageUrl", "HknsTajwxJ");
        setDoubleField(term27531, term27531.getClass(), "size", 0.25474180574060834);
        setIntField(term27531, term27531.getClass(), "quantity", -556405712);
        setDoubleField(term27531, term27531.getClass(), "price", 0.9957585718901875);
        setIntField(term27560, term27560.getClass(), "year", 2019);
        setShortField(term27560, term27560.getClass(), "month", (short) 7);
        setShortField(term27560, term27560.getClass(), "day", (short) 4);
        setField(term27559, term27559.getClass(), "date", term27560);
        setByteField(term27564, term27564.getClass(), "hour", (byte) 19);
        setByteField(term27564, term27564.getClass(), "minute", (byte) 20);
        setByteField(term27564, term27564.getClass(), "second", (byte) 59);
        setIntField(term27564, term27564.getClass(), "nano", 246784352);
        setField(term27559, term27559.getClass(), "time", term27564);
        setField(term27531, term27531.getClass(), "orderDate", term27559);
        setIntField(term27570, term27570.getClass(), "year", 2023);
        setShortField(term27570, term27570.getClass(), "month", (short) 7);
        setShortField(term27570, term27570.getClass(), "day", (short) 1);
        setField(term27569, term27569.getClass(), "date", term27570);
        setByteField(term27574, term27574.getClass(), "hour", (byte) 4);
        setByteField(term27574, term27574.getClass(), "minute", (byte) 33);
        setByteField(term27574, term27574.getClass(), "second", (byte) 9);
        setIntField(term27574, term27574.getClass(), "nano", 94365310);
        setField(term27569, term27569.getClass(), "time", term27574);
        setField(term27531, term27531.getClass(), "deliveryDate", term27569);
        setBooleanField(term27531, term27531.getClass(), "ordered", true);
        setField(term27531, term27531.getClass(), "userId", "XtiurrVYKw");
        setField(term27531, term27531.getClass(), "orderStatus", enum95);
        term27603 = new Double(0.16755811343784477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term27603;
        callMethod(klass, "setSize", argTypes, term27531, args);
    }

};


