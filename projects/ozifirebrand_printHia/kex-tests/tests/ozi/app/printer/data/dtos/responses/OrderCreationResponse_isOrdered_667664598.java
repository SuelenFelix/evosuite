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

public class OrderCreationResponse_isOrdered_667664598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2181;

    public OrderCreationResponse_isOrdered_667664598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2262 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term2261 = ((Class) term2262).getDeclaredField((String) "ORDERED");
        ((Field) term2261).setAccessible(true);
        Object enum7 = ((Field) term2261).get((Object) null);
        term2181 = newInstance(Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse"));
        Object term2209 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2210 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2214 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2219 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2220 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2224 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2181, term2181.getClass(), "id", "oVcInYnLWB");
        setField(term2181, term2181.getClass(), "imageUrl", "aJlieCFVtF");
        setDoubleField(term2181, term2181.getClass(), "size", 0.7031006357544823);
        setIntField(term2181, term2181.getClass(), "quantity", -2038273078);
        setDoubleField(term2181, term2181.getClass(), "price", 0.9527281779865117);
        setIntField(term2210, term2210.getClass(), "year", 2012);
        setShortField(term2210, term2210.getClass(), "month", (short) 2);
        setShortField(term2210, term2210.getClass(), "day", (short) 19);
        setField(term2209, term2209.getClass(), "date", term2210);
        setByteField(term2214, term2214.getClass(), "hour", (byte) 8);
        setByteField(term2214, term2214.getClass(), "minute", (byte) 4);
        setByteField(term2214, term2214.getClass(), "second", (byte) 43);
        setIntField(term2214, term2214.getClass(), "nano", 114930008);
        setField(term2209, term2209.getClass(), "time", term2214);
        setField(term2181, term2181.getClass(), "orderDate", term2209);
        setIntField(term2220, term2220.getClass(), "year", 2017);
        setShortField(term2220, term2220.getClass(), "month", (short) 6);
        setShortField(term2220, term2220.getClass(), "day", (short) 8);
        setField(term2219, term2219.getClass(), "date", term2220);
        setByteField(term2224, term2224.getClass(), "hour", (byte) 0);
        setByteField(term2224, term2224.getClass(), "minute", (byte) 18);
        setByteField(term2224, term2224.getClass(), "second", (byte) 55);
        setIntField(term2224, term2224.getClass(), "nano", 680586717);
        setField(term2219, term2219.getClass(), "time", term2224);
        setField(term2181, term2181.getClass(), "deliveryDate", term2219);
        setBooleanField(term2181, term2181.getClass(), "ordered", true);
        setField(term2181, term2181.getClass(), "orderStatus", enum7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.data.dtos.responses.OrderCreationResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOrdered", argTypes, term2181, args);
    }

};


