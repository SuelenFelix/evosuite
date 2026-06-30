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
import java.lang.Integer;

public class PrintOrder_setQuantity_192140539514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27858;
     Object term27930;

    public PrintOrder_setQuantity_192140539514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27963 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term27962 = ((Class) term27963).getDeclaredField((String) "ORDERED");
        ((Field) term27962).setAccessible(true);
        Object enum96 = ((Field) term27962).get((Object) null);
        term27858 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term27886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27891 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27901 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term27858, term27858.getClass(), "id", "rsumfoDNHa");
        setField(term27858, term27858.getClass(), "imageUrl", "ceCWHUTQUM");
        setDoubleField(term27858, term27858.getClass(), "size", 0.9090793968999221);
        setIntField(term27858, term27858.getClass(), "quantity", -1772434990);
        setDoubleField(term27858, term27858.getClass(), "price", 0.25997329921466494);
        setIntField(term27887, term27887.getClass(), "year", 2013);
        setShortField(term27887, term27887.getClass(), "month", (short) 10);
        setShortField(term27887, term27887.getClass(), "day", (short) 7);
        setField(term27886, term27886.getClass(), "date", term27887);
        setByteField(term27891, term27891.getClass(), "hour", (byte) 12);
        setByteField(term27891, term27891.getClass(), "minute", (byte) 2);
        setByteField(term27891, term27891.getClass(), "second", (byte) 42);
        setIntField(term27891, term27891.getClass(), "nano", 202308437);
        setField(term27886, term27886.getClass(), "time", term27891);
        setField(term27858, term27858.getClass(), "orderDate", term27886);
        setIntField(term27897, term27897.getClass(), "year", 2019);
        setShortField(term27897, term27897.getClass(), "month", (short) 12);
        setShortField(term27897, term27897.getClass(), "day", (short) 29);
        setField(term27896, term27896.getClass(), "date", term27897);
        setByteField(term27901, term27901.getClass(), "hour", (byte) 16);
        setByteField(term27901, term27901.getClass(), "minute", (byte) 10);
        setByteField(term27901, term27901.getClass(), "second", (byte) 1);
        setIntField(term27901, term27901.getClass(), "nano", 198559584);
        setField(term27896, term27896.getClass(), "time", term27901);
        setField(term27858, term27858.getClass(), "deliveryDate", term27896);
        setBooleanField(term27858, term27858.getClass(), "ordered", true);
        setField(term27858, term27858.getClass(), "userId", "LrqwfrKKtS");
        setField(term27858, term27858.getClass(), "orderStatus", enum96);
        term27930 = new Integer(-1845499264);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term27930;
        callMethod(klass, "setQuantity", argTypes, term27858, args);
    }

};


