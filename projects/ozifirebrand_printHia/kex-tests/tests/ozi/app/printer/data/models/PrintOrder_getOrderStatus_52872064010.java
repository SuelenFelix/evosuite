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

public class PrintOrder_getOrderStatus_52872064010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26504;

    public PrintOrder_getOrderStatus_52872064010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26607 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term26606 = ((Class) term26607).getDeclaredField((String) "ORDERED");
        ((Field) term26606).setAccessible(true);
        Object enum92 = ((Field) term26606).get((Object) null);
        term26504 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term26532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26537 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26542 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26543 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26547 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26504, term26504.getClass(), "id", "mNHyqmOAFy");
        setField(term26504, term26504.getClass(), "imageUrl", "UxgSdhxPCH");
        setDoubleField(term26504, term26504.getClass(), "size", 0.7977455176064363);
        setIntField(term26504, term26504.getClass(), "quantity", -1547384488);
        setDoubleField(term26504, term26504.getClass(), "price", 0.5329919447422633);
        setIntField(term26533, term26533.getClass(), "year", 2026);
        setShortField(term26533, term26533.getClass(), "month", (short) 7);
        setShortField(term26533, term26533.getClass(), "day", (short) 4);
        setField(term26532, term26532.getClass(), "date", term26533);
        setByteField(term26537, term26537.getClass(), "hour", (byte) 8);
        setByteField(term26537, term26537.getClass(), "minute", (byte) 51);
        setByteField(term26537, term26537.getClass(), "second", (byte) 9);
        setIntField(term26537, term26537.getClass(), "nano", 936880887);
        setField(term26532, term26532.getClass(), "time", term26537);
        setField(term26504, term26504.getClass(), "orderDate", term26532);
        setIntField(term26543, term26543.getClass(), "year", 2022);
        setShortField(term26543, term26543.getClass(), "month", (short) 5);
        setShortField(term26543, term26543.getClass(), "day", (short) 26);
        setField(term26542, term26542.getClass(), "date", term26543);
        setByteField(term26547, term26547.getClass(), "hour", (byte) 6);
        setByteField(term26547, term26547.getClass(), "minute", (byte) 54);
        setByteField(term26547, term26547.getClass(), "second", (byte) 49);
        setIntField(term26547, term26547.getClass(), "nano", 822216068);
        setField(term26542, term26542.getClass(), "time", term26547);
        setField(term26504, term26504.getClass(), "deliveryDate", term26542);
        setBooleanField(term26504, term26504.getClass(), "ordered", true);
        setField(term26504, term26504.getClass(), "userId", "DAujxZPHJC");
        setField(term26504, term26504.getClass(), "orderStatus", enum92);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderStatus", argTypes, term26504, args);
    }

};


