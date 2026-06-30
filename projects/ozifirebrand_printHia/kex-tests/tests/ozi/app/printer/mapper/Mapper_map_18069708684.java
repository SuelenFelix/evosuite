package ozi.app.printer.mapper;

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
import static ozi.app.printer.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class Mapper_map_18069708684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1244;

    public Mapper_map_18069708684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1347 = Class.forName((String) "ozi.app.printer.data.models.OrderStatus");
        Field term1346 = ((Class) term1347).getDeclaredField((String) "PENDING");
        ((Field) term1346).setAccessible(true);
        Object enum4 = ((Field) term1346).get((Object) null);
        term1244 = newInstance(Class.forName("ozi.app.printer.data.models.PrintOrder"));
        Object term1272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1277 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1282 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1283 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1287 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1244, term1244.getClass(), "id", "OclPbYPkcH");
        setField(term1244, term1244.getClass(), "imageUrl", "IoAlmYsBwc");
        setDoubleField(term1244, term1244.getClass(), "size", 0.5183269973490326);
        setIntField(term1244, term1244.getClass(), "quantity", -1955890973);
        setDoubleField(term1244, term1244.getClass(), "price", 0.7655020693602768);
        setIntField(term1273, term1273.getClass(), "year", 2019);
        setShortField(term1273, term1273.getClass(), "month", (short) 2);
        setShortField(term1273, term1273.getClass(), "day", (short) 21);
        setField(term1272, term1272.getClass(), "date", term1273);
        setByteField(term1277, term1277.getClass(), "hour", (byte) 5);
        setByteField(term1277, term1277.getClass(), "minute", (byte) 41);
        setByteField(term1277, term1277.getClass(), "second", (byte) 11);
        setIntField(term1277, term1277.getClass(), "nano", 859829782);
        setField(term1272, term1272.getClass(), "time", term1277);
        setField(term1244, term1244.getClass(), "orderDate", term1272);
        setIntField(term1283, term1283.getClass(), "year", 2018);
        setShortField(term1283, term1283.getClass(), "month", (short) 9);
        setShortField(term1283, term1283.getClass(), "day", (short) 28);
        setField(term1282, term1282.getClass(), "date", term1283);
        setByteField(term1287, term1287.getClass(), "hour", (byte) 3);
        setByteField(term1287, term1287.getClass(), "minute", (byte) 37);
        setByteField(term1287, term1287.getClass(), "second", (byte) 46);
        setIntField(term1287, term1287.getClass(), "nano", 763326845);
        setField(term1282, term1282.getClass(), "time", term1287);
        setField(term1244, term1244.getClass(), "deliveryDate", term1282);
        setBooleanField(term1244, term1244.getClass(), "ordered", true);
        setField(term1244, term1244.getClass(), "userId", "TEParAifyi");
        setField(term1244, term1244.getClass(), "orderStatus", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ozi.app.printer.mapper.Mapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ozi.app.printer.data.models.PrintOrder");
        Object[] args = new Object[1];
        args[0] = term1244;
        callMethod(klass, "map", argTypes, null, args);
    }

};


