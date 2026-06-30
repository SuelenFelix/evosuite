package ozi.app.printer.data.dtos.responses;

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
import static ozi.app.printer.data.dtos.responses.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class OrderCreationResponse_getSize_12524283203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term650;

    public OrderCreationResponse_getSize_12524283203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term731 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term730 = ((Class) term731).getDeclaredField((String) "PENDING");
        ((Field) term730).setAccessible(true);
        Object enum2 = ((Field) term730).get((Object) null);
        term650 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term678 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term679 = newInstance(Class.forName("java.time.LocalDate"));
        Object term683 = newInstance(Class.forName("java.time.LocalTime"));
        Object term688 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term689 = newInstance(Class.forName("java.time.LocalDate"));
        Object term693 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term650, term650.getClass(), "id", "jJCZpVmanW");
        setField(term650, term650.getClass(), "imageUrl", "EGtDIRbSSb");
        setDoubleField(term650, term650.getClass(), "size", 0.28570734989730284);
        setIntField(term650, term650.getClass(), "quantity", 1484323161);
        setDoubleField(term650, term650.getClass(), "price", 0.40176586625454525);
        setIntField(term679, term679.getClass(), "year", 2022);
        setShortField(term679, term679.getClass(), "month", (short) 2);
        setShortField(term679, term679.getClass(), "day", (short) 26);
        setField(term678, term678.getClass(), "date", term679);
        setByteField(term683, term683.getClass(), "hour", (byte) 11);
        setByteField(term683, term683.getClass(), "minute", (byte) 42);
        setByteField(term683, term683.getClass(), "second", (byte) 15);
        setIntField(term683, term683.getClass(), "nano", 377731937);
        setField(term678, term678.getClass(), "time", term683);
        setField(term650, term650.getClass(), "orderDate", term678);
        setIntField(term689, term689.getClass(), "year", 2026);
        setShortField(term689, term689.getClass(), "month", (short) 12);
        setShortField(term689, term689.getClass(), "day", (short) 14);
        setField(term688, term688.getClass(), "date", term689);
        setByteField(term693, term693.getClass(), "hour", (byte) 16);
        setByteField(term693, term693.getClass(), "minute", (byte) 34);
        setByteField(term693, term693.getClass(), "second", (byte) 9);
        setIntField(term693, term693.getClass(), "nano", 518326996);
        setField(term688, term688.getClass(), "time", term693);
        setField(term650, term650.getClass(), "deliveryDate", term688);
        setBooleanField(term650, term650.getClass(), "ordered", true);
        setField(term650, term650.getClass(), "orderStatus", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSize", argTypes, term650, args);
    }

};


