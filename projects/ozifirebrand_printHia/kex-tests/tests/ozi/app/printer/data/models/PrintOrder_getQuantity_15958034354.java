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

public class PrintOrder_getQuantity_15958034354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24546;

    public PrintOrder_getQuantity_15958034354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24649 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term24648 = ((Class) term24649).getDeclaredField((String) "PENDING");
        ((Field) term24648).setAccessible(true);
        Object enum86 = ((Field) term24648).get((Object) null);
        term24546 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term24574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24579 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24584 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24585 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24589 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24546, term24546.getClass(), "id", "JWodNQzjjV");
        setField(term24546, term24546.getClass(), "imageUrl", "CAgxWjhxNf");
        setDoubleField(term24546, term24546.getClass(), "size", 0.06480976831423468);
        setIntField(term24546, term24546.getClass(), "quantity", 972867650);
        setDoubleField(term24546, term24546.getClass(), "price", 0.8490790645379176);
        setIntField(term24575, term24575.getClass(), "year", 2027);
        setShortField(term24575, term24575.getClass(), "month", (short) 5);
        setShortField(term24575, term24575.getClass(), "day", (short) 2);
        setField(term24574, term24574.getClass(), "date", term24575);
        setByteField(term24579, term24579.getClass(), "hour", (byte) 6);
        setByteField(term24579, term24579.getClass(), "minute", (byte) 10);
        setByteField(term24579, term24579.getClass(), "second", (byte) 19);
        setIntField(term24579, term24579.getClass(), "nano", 422884120);
        setField(term24574, term24574.getClass(), "time", term24579);
        setField(term24546, term24546.getClass(), "orderDate", term24574);
        setIntField(term24585, term24585.getClass(), "year", 2029);
        setShortField(term24585, term24585.getClass(), "month", (short) 10);
        setShortField(term24585, term24585.getClass(), "day", (short) 19);
        setField(term24584, term24584.getClass(), "date", term24585);
        setByteField(term24589, term24589.getClass(), "hour", (byte) 15);
        setByteField(term24589, term24589.getClass(), "minute", (byte) 8);
        setByteField(term24589, term24589.getClass(), "second", (byte) 15);
        setIntField(term24589, term24589.getClass(), "nano", 25396748);
        setField(term24584, term24584.getClass(), "time", term24589);
        setField(term24546, term24546.getClass(), "deliveryDate", term24584);
        setBooleanField(term24546, term24546.getClass(), "ordered", false);
        setField(term24546, term24546.getClass(), "userId", "goAoCMhKBu");
        setField(term24546, term24546.getClass(), "orderStatus", enum86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuantity", argTypes, term24546, args);
    }

};


