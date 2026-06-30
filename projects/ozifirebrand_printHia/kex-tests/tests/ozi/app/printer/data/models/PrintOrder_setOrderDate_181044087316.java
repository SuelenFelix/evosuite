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

public class PrintOrder_setOrderDate_181044087316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28512;
     Object term28586;

    public PrintOrder_setOrderDate_181044087316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28627 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term28626 = ((Class) term28627).getDeclaredField((String) "DELIVERED");
        ((Field) term28626).setAccessible(true);
        Object enum98 = ((Field) term28626).get((Object) null);
        term28512 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term28540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28545 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28555 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term28512, term28512.getClass(), "id", "vqnBkkxoIa");
        setField(term28512, term28512.getClass(), "imageUrl", "bycpZjxXFn");
        setDoubleField(term28512, term28512.getClass(), "size", 0.1849998667663698);
        setIntField(term28512, term28512.getClass(), "quantity", -344842608);
        setDoubleField(term28512, term28512.getClass(), "price", 0.36312400202399575);
        setIntField(term28541, term28541.getClass(), "year", 2023);
        setShortField(term28541, term28541.getClass(), "month", (short) 12);
        setShortField(term28541, term28541.getClass(), "day", (short) 12);
        setField(term28540, term28540.getClass(), "date", term28541);
        setByteField(term28545, term28545.getClass(), "hour", (byte) 0);
        setByteField(term28545, term28545.getClass(), "minute", (byte) 12);
        setByteField(term28545, term28545.getClass(), "second", (byte) 38);
        setIntField(term28545, term28545.getClass(), "nano", 430999236);
        setField(term28540, term28540.getClass(), "time", term28545);
        setField(term28512, term28512.getClass(), "orderDate", term28540);
        setIntField(term28551, term28551.getClass(), "year", 2018);
        setShortField(term28551, term28551.getClass(), "month", (short) 6);
        setShortField(term28551, term28551.getClass(), "day", (short) 17);
        setField(term28550, term28550.getClass(), "date", term28551);
        setByteField(term28555, term28555.getClass(), "hour", (byte) 1);
        setByteField(term28555, term28555.getClass(), "minute", (byte) 3);
        setByteField(term28555, term28555.getClass(), "second", (byte) 5);
        setIntField(term28555, term28555.getClass(), "nano", 914834044);
        setField(term28550, term28550.getClass(), "time", term28555);
        setField(term28512, term28512.getClass(), "deliveryDate", term28550);
        setBooleanField(term28512, term28512.getClass(), "ordered", true);
        setField(term28512, term28512.getClass(), "userId", "jQWttOAiwL");
        setField(term28512, term28512.getClass(), "orderStatus", enum98);
        term28586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28591 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28587, term28587.getClass(), "year", 2021);
        setShortField(term28587, term28587.getClass(), "month", (short) 5);
        setShortField(term28587, term28587.getClass(), "day", (short) 6);
        setField(term28586, term28586.getClass(), "date", term28587);
        setByteField(term28591, term28591.getClass(), "hour", (byte) 21);
        setByteField(term28591, term28591.getClass(), "minute", (byte) 10);
        setByteField(term28591, term28591.getClass(), "second", (byte) 43);
        setIntField(term28591, term28591.getClass(), "nano", 123313014);
        setField(term28586, term28586.getClass(), "time", term28591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term28586;
        callMethod(klass, "setOrderDate", argTypes, term28512, args);
    }

};


