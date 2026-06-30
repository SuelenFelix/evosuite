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

public class PrintOrder_getPrice_7722035385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24871;

    public PrintOrder_getPrice_7722035385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24976 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term24975 = ((Class) term24976).getDeclaredField((String) "DELIVERED");
        ((Field) term24975).setAccessible(true);
        Object enum87 = ((Field) term24975).get((Object) null);
        term24871 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term24899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24904 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24914 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24871, term24871.getClass(), "id", "BWxJSgKHRT");
        setField(term24871, term24871.getClass(), "imageUrl", "AGXoIndFnm");
        setDoubleField(term24871, term24871.getClass(), "size", 0.23129126164078717);
        setIntField(term24871, term24871.getClass(), "quantity", 1655935355);
        setDoubleField(term24871, term24871.getClass(), "price", 0.6047138318674447);
        setIntField(term24900, term24900.getClass(), "year", 2014);
        setShortField(term24900, term24900.getClass(), "month", (short) 6);
        setShortField(term24900, term24900.getClass(), "day", (short) 28);
        setField(term24899, term24899.getClass(), "date", term24900);
        setByteField(term24904, term24904.getClass(), "hour", (byte) 7);
        setByteField(term24904, term24904.getClass(), "minute", (byte) 14);
        setByteField(term24904, term24904.getClass(), "second", (byte) 59);
        setIntField(term24904, term24904.getClass(), "nano", 314278386);
        setField(term24899, term24899.getClass(), "time", term24904);
        setField(term24871, term24871.getClass(), "orderDate", term24899);
        setIntField(term24910, term24910.getClass(), "year", 2015);
        setShortField(term24910, term24910.getClass(), "month", (short) 10);
        setShortField(term24910, term24910.getClass(), "day", (short) 8);
        setField(term24909, term24909.getClass(), "date", term24910);
        setByteField(term24914, term24914.getClass(), "hour", (byte) 22);
        setByteField(term24914, term24914.getClass(), "minute", (byte) 20);
        setByteField(term24914, term24914.getClass(), "second", (byte) 59);
        setIntField(term24914, term24914.getClass(), "nano", 350521903);
        setField(term24909, term24909.getClass(), "time", term24914);
        setField(term24871, term24871.getClass(), "deliveryDate", term24909);
        setBooleanField(term24871, term24871.getClass(), "ordered", false);
        setField(term24871, term24871.getClass(), "userId", "mwmFMNEzkK");
        setField(term24871, term24871.getClass(), "orderStatus", enum87);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term24871, args);
    }

};


