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

public class OrderCreationResponse_setImageUrl_184488620911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3112;

    public OrderCreationResponse_setImageUrl_184488620911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3205 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term3204 = ((Class) term3205).getDeclaredField((String) "PENDING");
        ((Field) term3204).setAccessible(true);
        Object enum10 = ((Field) term3204).get((Object) null);
        term3112 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term3140 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3141 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3145 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3155 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term3112, term3112.getClass(), "id", "RkybSrpybU");
        setField(term3112, term3112.getClass(), "imageUrl", "xOEqzGAmDU");
        setDoubleField(term3112, term3112.getClass(), "size", 0.4569171842750229);
        setIntField(term3112, term3112.getClass(), "quantity", 1725571209);
        setDoubleField(term3112, term3112.getClass(), "price", 0.8598297828918529);
        setIntField(term3141, term3141.getClass(), "year", 2014);
        setShortField(term3141, term3141.getClass(), "month", (short) 7);
        setShortField(term3141, term3141.getClass(), "day", (short) 13);
        setField(term3140, term3140.getClass(), "date", term3141);
        setByteField(term3145, term3145.getClass(), "hour", (byte) 21);
        setByteField(term3145, term3145.getClass(), "minute", (byte) 46);
        setByteField(term3145, term3145.getClass(), "second", (byte) 0);
        setIntField(term3145, term3145.getClass(), "nano", 887884128);
        setField(term3140, term3140.getClass(), "time", term3145);
        setField(term3112, term3112.getClass(), "orderDate", term3140);
        setIntField(term3151, term3151.getClass(), "year", 2023);
        setShortField(term3151, term3151.getClass(), "month", (short) 3);
        setShortField(term3151, term3151.getClass(), "day", (short) 7);
        setField(term3150, term3150.getClass(), "date", term3151);
        setByteField(term3155, term3155.getClass(), "hour", (byte) 21);
        setByteField(term3155, term3155.getClass(), "minute", (byte) 15);
        setByteField(term3155, term3155.getClass(), "second", (byte) 43);
        setIntField(term3155, term3155.getClass(), "nano", 639721472);
        setField(term3150, term3150.getClass(), "time", term3155);
        setField(term3112, term3112.getClass(), "deliveryDate", term3150);
        setBooleanField(term3112, term3112.getClass(), "ordered", true);
        setField(term3112, term3112.getClass(), "orderStatus", enum10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "setImageUrl", argTypes, term3112, args);
    }

};


