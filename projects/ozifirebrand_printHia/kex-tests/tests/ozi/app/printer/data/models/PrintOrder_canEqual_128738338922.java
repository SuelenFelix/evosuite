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

public class PrintOrder_canEqual_128738338922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30765;
     Object term30839;

    public PrintOrder_canEqual_128738338922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30871 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term30870 = ((Class) term30871).getDeclaredField((String) "DELIVERED");
        ((Field) term30870).setAccessible(true);
        Object enum105 = ((Field) term30870).get((Object) null);
        term30765 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term30793 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30794 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30798 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30803 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30804 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30808 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term30765, term30765.getClass(), "id", "EKpdCBubDE");
        setField(term30765, term30765.getClass(), "imageUrl", "zMsSLTfGhl");
        setDoubleField(term30765, term30765.getClass(), "size", 0.22767631814145395);
        setIntField(term30765, term30765.getClass(), "quantity", 304775596);
        setDoubleField(term30765, term30765.getClass(), "price", 0.4630082575704827);
        setIntField(term30794, term30794.getClass(), "year", 2029);
        setShortField(term30794, term30794.getClass(), "month", (short) 7);
        setShortField(term30794, term30794.getClass(), "day", (short) 19);
        setField(term30793, term30793.getClass(), "date", term30794);
        setByteField(term30798, term30798.getClass(), "hour", (byte) 4);
        setByteField(term30798, term30798.getClass(), "minute", (byte) 38);
        setByteField(term30798, term30798.getClass(), "second", (byte) 15);
        setIntField(term30798, term30798.getClass(), "nano", 260833456);
        setField(term30793, term30793.getClass(), "time", term30798);
        setField(term30765, term30765.getClass(), "orderDate", term30793);
        setIntField(term30804, term30804.getClass(), "year", 2019);
        setShortField(term30804, term30804.getClass(), "month", (short) 12);
        setShortField(term30804, term30804.getClass(), "day", (short) 13);
        setField(term30803, term30803.getClass(), "date", term30804);
        setByteField(term30808, term30808.getClass(), "hour", (byte) 17);
        setByteField(term30808, term30808.getClass(), "minute", (byte) 38);
        setByteField(term30808, term30808.getClass(), "second", (byte) 43);
        setIntField(term30808, term30808.getClass(), "nano", 435007801);
        setField(term30803, term30803.getClass(), "time", term30808);
        setField(term30765, term30765.getClass(), "deliveryDate", term30803);
        setBooleanField(term30765, term30765.getClass(), "ordered", false);
        setField(term30765, term30765.getClass(), "userId", "bEmHScVZaQ");
        setField(term30765, term30765.getClass(), "orderStatus", enum105);
        term30839 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30839;
        callMethod(klass, "canEqual", argTypes, term30765, args);
    }

};


