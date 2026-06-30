package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DatePair_init_2387202108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1001;
     Object term1011;

    public DatePair_init_2387202108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1006 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1002, term1002.getClass(), "year", 2021);
        setShortField(term1002, term1002.getClass(), "month", (short) 3);
        setShortField(term1002, term1002.getClass(), "day", (short) 13);
        setField(term1001, term1001.getClass(), "date", term1002);
        setByteField(term1006, term1006.getClass(), "hour", (byte) 6);
        setByteField(term1006, term1006.getClass(), "minute", (byte) 25);
        setByteField(term1006, term1006.getClass(), "second", (byte) 42);
        setIntField(term1006, term1006.getClass(), "nano", 282924199);
        setField(term1001, term1001.getClass(), "time", term1006);
        term1011 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1012 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1016 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1012, term1012.getClass(), "year", 2020);
        setShortField(term1012, term1012.getClass(), "month", (short) 10);
        setShortField(term1012, term1012.getClass(), "day", (short) 25);
        setField(term1011, term1011.getClass(), "date", term1012);
        setByteField(term1016, term1016.getClass(), "hour", (byte) 18);
        setByteField(term1016, term1016.getClass(), "minute", (byte) 22);
        setByteField(term1016, term1016.getClass(), "second", (byte) 30);
        setIntField(term1016, term1016.getClass(), "nano", 948592965);
        setField(term1011, term1011.getClass(), "time", term1016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[2];
        args[0] = term1001;
        args[1] = term1011;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


