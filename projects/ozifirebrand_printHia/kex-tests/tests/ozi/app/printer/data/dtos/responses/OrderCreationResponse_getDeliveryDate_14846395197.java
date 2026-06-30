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

public class OrderCreationResponse_getDeliveryDate_14846395197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1870;

    public OrderCreationResponse_getDeliveryDate_14846395197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1953 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term1952 = ((Class) term1953).getDeclaredField((String) "DELIVERED");
        ((Field) term1952).setAccessible(true);
        Object enum6 = ((Field) term1952).get((Object) null);
        term1870 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term1898 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1899 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1903 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1913 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1870, term1870.getClass(), "id", "MxlszYVzRf");
        setField(term1870, term1870.getClass(), "imageUrl", "LQFpaHEwXR");
        setDoubleField(term1870, term1870.getClass(), "size", 0.7655020693602768);
        setIntField(term1870, term1870.getClass(), "quantity", -1955890973);
        setDoubleField(term1870, term1870.getClass(), "price", 0.1374549299694151);
        setIntField(term1899, term1899.getClass(), "year", 2012);
        setShortField(term1899, term1899.getClass(), "month", (short) 9);
        setShortField(term1899, term1899.getClass(), "day", (short) 11);
        setField(term1898, term1898.getClass(), "date", term1899);
        setByteField(term1903, term1903.getClass(), "hour", (byte) 22);
        setByteField(term1903, term1903.getClass(), "minute", (byte) 10);
        setByteField(term1903, term1903.getClass(), "second", (byte) 8);
        setIntField(term1903, term1903.getClass(), "nano", 380008862);
        setField(term1898, term1898.getClass(), "time", term1903);
        setField(term1870, term1870.getClass(), "orderDate", term1898);
        setIntField(term1909, term1909.getClass(), "year", 2021);
        setShortField(term1909, term1909.getClass(), "month", (short) 9);
        setShortField(term1909, term1909.getClass(), "day", (short) 7);
        setField(term1908, term1908.getClass(), "date", term1909);
        setByteField(term1913, term1913.getClass(), "hour", (byte) 5);
        setByteField(term1913, term1913.getClass(), "minute", (byte) 25);
        setByteField(term1913, term1913.getClass(), "second", (byte) 7);
        setIntField(term1913, term1913.getClass(), "nano", 755924076);
        setField(term1908, term1908.getClass(), "time", term1913);
        setField(term1870, term1870.getClass(), "deliveryDate", term1908);
        setBooleanField(term1870, term1870.getClass(), "ordered", true);
        setField(term1870, term1870.getClass(), "orderStatus", enum6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeliveryDate", argTypes, term1870, args);
    }

};


