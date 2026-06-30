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

public class PrintOrder_setUserId_140583408319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29525;

    public PrintOrder_setUserId_140583408319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29640 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term29639 = ((Class) term29640).getDeclaredField((String) "PENDING");
        ((Field) term29639).setAccessible(true);
        Object enum101 = ((Field) term29639).get((Object) null);
        term29525 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term29553 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29554 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29558 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29568 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29525, term29525.getClass(), "id", "xeyjTOCOJb");
        setField(term29525, term29525.getClass(), "imageUrl", "DGRqjjdhzy");
        setDoubleField(term29525, term29525.getClass(), "size", 0.3238255203811462);
        setIntField(term29525, term29525.getClass(), "quantity", -1034506028);
        setDoubleField(term29525, term29525.getClass(), "price", 0.2843894095932772);
        setIntField(term29554, term29554.getClass(), "year", 2017);
        setShortField(term29554, term29554.getClass(), "month", (short) 6);
        setShortField(term29554, term29554.getClass(), "day", (short) 7);
        setField(term29553, term29553.getClass(), "date", term29554);
        setByteField(term29558, term29558.getClass(), "hour", (byte) 13);
        setByteField(term29558, term29558.getClass(), "minute", (byte) 52);
        setByteField(term29558, term29558.getClass(), "second", (byte) 17);
        setIntField(term29558, term29558.getClass(), "nano", 78180039);
        setField(term29553, term29553.getClass(), "time", term29558);
        setField(term29525, term29525.getClass(), "orderDate", term29553);
        setIntField(term29564, term29564.getClass(), "year", 2017);
        setShortField(term29564, term29564.getClass(), "month", (short) 6);
        setShortField(term29564, term29564.getClass(), "day", (short) 23);
        setField(term29563, term29563.getClass(), "date", term29564);
        setByteField(term29568, term29568.getClass(), "hour", (byte) 23);
        setByteField(term29568, term29568.getClass(), "minute", (byte) 29);
        setByteField(term29568, term29568.getClass(), "second", (byte) 17);
        setIntField(term29568, term29568.getClass(), "nano", 491252353);
        setField(term29563, term29563.getClass(), "time", term29568);
        setField(term29525, term29525.getClass(), "deliveryDate", term29563);
        setBooleanField(term29525, term29525.getClass(), "ordered", true);
        setField(term29525, term29525.getClass(), "userId", "lQFkjJUPAR");
        setField(term29525, term29525.getClass(), "orderStatus", enum101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BsuVlGUUjV";
        callMethod(klass, "setUserId", argTypes, term29525, args);
    }

};


