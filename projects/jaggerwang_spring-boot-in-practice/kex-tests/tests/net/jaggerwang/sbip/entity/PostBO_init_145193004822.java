package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class PostBO_init_145193004822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19192;
     Object term19194;
     Object enum54;
     Object term19216;
     Object term19219;
     Object term19221;
     Object term19231;

    public PostBO_init_145193004822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19192 = new Long(-8692119547314358088L);
        term19194 = new Long(-2083524977884307536L);
        Class<? extends Object> term19242 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term19241 = ((Class) term19242).getDeclaredField((String) "TEXT");
        ((Field) term19241).setAccessible(true);
        enum54 = ((Field) term19241).get((Object) null);
        term19216 = new LinkedList();
        term19219 = new Long(-2691996476200751382L);
        term19221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19226 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19222, term19222.getClass(), "year", 2022);
        setShortField(term19222, term19222.getClass(), "month", (short) 12);
        setShortField(term19222, term19222.getClass(), "day", (short) 19);
        setField(term19221, term19221.getClass(), "date", term19222);
        setByteField(term19226, term19226.getClass(), "hour", (byte) 11);
        setByteField(term19226, term19226.getClass(), "minute", (byte) 25);
        setByteField(term19226, term19226.getClass(), "second", (byte) 6);
        setIntField(term19226, term19226.getClass(), "nano", 620469872);
        setField(term19221, term19221.getClass(), "time", term19226);
        term19231 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19232 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19236 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term19232, term19232.getClass(), "year", 2013);
        setShortField(term19232, term19232.getClass(), "month", (short) 5);
        setShortField(term19232, term19232.getClass(), "day", (short) 3);
        setField(term19231, term19231.getClass(), "date", term19232);
        setByteField(term19236, term19236.getClass(), "hour", (byte) 18);
        setByteField(term19236, term19236.getClass(), "minute", (byte) 52);
        setByteField(term19236, term19236.getClass(), "second", (byte) 15);
        setIntField(term19236, term19236.getClass(), "nano", 241685081);
        setField(term19231, term19231.getClass(), "time", term19236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("net.jaggerwang.sbip.entity.PostBO$Type");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[8];
        args[0] = term19192;
        args[1] = term19194;
        args[2] = enum54;
        args[3] = "jXzmYyrnnT";
        args[4] = term19216;
        args[5] = term19219;
        args[6] = term19221;
        args[7] = term19231;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


