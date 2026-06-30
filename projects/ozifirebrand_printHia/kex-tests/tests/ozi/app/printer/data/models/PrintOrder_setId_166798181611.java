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

public class PrintOrder_setId_166798181611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26829;

    public PrintOrder_setId_166798181611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26946 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term26945 = ((Class) term26946).getDeclaredField((String) "DELIVERED");
        ((Field) term26945).setAccessible(true);
        Object enum93 = ((Field) term26945).get((Object) null);
        term26829 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term26857 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26858 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26862 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26867 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26868 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26872 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26829, term26829.getClass(), "id", "IlBhdrCvHq");
        setField(term26829, term26829.getClass(), "imageUrl", "OirVUQhauU");
        setDoubleField(term26829, term26829.getClass(), "size", 0.7046974927834232);
        setIntField(term26829, term26829.getClass(), "quantity", 1442160736);
        setDoubleField(term26829, term26829.getClass(), "price", 0.6896952303224777);
        setIntField(term26858, term26858.getClass(), "year", 2022);
        setShortField(term26858, term26858.getClass(), "month", (short) 12);
        setShortField(term26858, term26858.getClass(), "day", (short) 19);
        setField(term26857, term26857.getClass(), "date", term26858);
        setByteField(term26862, term26862.getClass(), "hour", (byte) 11);
        setByteField(term26862, term26862.getClass(), "minute", (byte) 25);
        setByteField(term26862, term26862.getClass(), "second", (byte) 6);
        setIntField(term26862, term26862.getClass(), "nano", 620469872);
        setField(term26857, term26857.getClass(), "time", term26862);
        setField(term26829, term26829.getClass(), "orderDate", term26857);
        setIntField(term26868, term26868.getClass(), "year", 2013);
        setShortField(term26868, term26868.getClass(), "month", (short) 5);
        setShortField(term26868, term26868.getClass(), "day", (short) 3);
        setField(term26867, term26867.getClass(), "date", term26868);
        setByteField(term26872, term26872.getClass(), "hour", (byte) 18);
        setByteField(term26872, term26872.getClass(), "minute", (byte) 52);
        setByteField(term26872, term26872.getClass(), "second", (byte) 15);
        setIntField(term26872, term26872.getClass(), "nano", 241685081);
        setField(term26867, term26867.getClass(), "time", term26872);
        setField(term26829, term26829.getClass(), "deliveryDate", term26867);
        setBooleanField(term26829, term26829.getClass(), "ordered", false);
        setField(term26829, term26829.getClass(), "userId", "GLbyDfbNZI");
        setField(term26829, term26829.getClass(), "orderStatus", enum93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oNLcCYDAsO";
        callMethod(klass, "setId", argTypes, term26829, args);
    }

};


