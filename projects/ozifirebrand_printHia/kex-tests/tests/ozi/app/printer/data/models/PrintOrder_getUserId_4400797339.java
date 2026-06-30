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

public class PrintOrder_getUserId_4400797339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26179;

    public PrintOrder_getUserId_4400797339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26282 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term26281 = ((Class) term26282).getDeclaredField((String) "ORDERED");
        ((Field) term26281).setAccessible(true);
        Object enum91 = ((Field) term26281).get((Object) null);
        term26179 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term26207 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26208 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26212 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26222 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term26179, term26179.getClass(), "id", "vLTbaoAxBm");
        setField(term26179, term26179.getClass(), "imageUrl", "BXTjEyEZxD");
        setDoubleField(term26179, term26179.getClass(), "size", 0.1858089882752998);
        setIntField(term26179, term26179.getClass(), "quantity", 1090617576);
        setDoubleField(term26179, term26179.getClass(), "price", 0.2440697646709713);
        setIntField(term26208, term26208.getClass(), "year", 2020);
        setShortField(term26208, term26208.getClass(), "month", (short) 2);
        setShortField(term26208, term26208.getClass(), "day", (short) 1);
        setField(term26207, term26207.getClass(), "date", term26208);
        setByteField(term26212, term26212.getClass(), "hour", (byte) 0);
        setByteField(term26212, term26212.getClass(), "minute", (byte) 46);
        setByteField(term26212, term26212.getClass(), "second", (byte) 1);
        setIntField(term26212, term26212.getClass(), "nano", 544722812);
        setField(term26207, term26207.getClass(), "time", term26212);
        setField(term26179, term26179.getClass(), "orderDate", term26207);
        setIntField(term26218, term26218.getClass(), "year", 2027);
        setShortField(term26218, term26218.getClass(), "month", (short) 8);
        setShortField(term26218, term26218.getClass(), "day", (short) 16);
        setField(term26217, term26217.getClass(), "date", term26218);
        setByteField(term26222, term26222.getClass(), "hour", (byte) 15);
        setByteField(term26222, term26222.getClass(), "minute", (byte) 1);
        setByteField(term26222, term26222.getClass(), "second", (byte) 18);
        setIntField(term26222, term26222.getClass(), "nano", 245350825);
        setField(term26217, term26217.getClass(), "time", term26222);
        setField(term26179, term26179.getClass(), "deliveryDate", term26217);
        setBooleanField(term26179, term26179.getClass(), "ordered", false);
        setField(term26179, term26179.getClass(), "userId", "oKhVzOKUFW");
        setField(term26179, term26179.getClass(), "orderStatus", enum91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserId", argTypes, term26179, args);
    }

};


