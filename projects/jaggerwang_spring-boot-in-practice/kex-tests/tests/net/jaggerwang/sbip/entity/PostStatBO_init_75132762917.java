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
import java.lang.Object;

public class PostStatBO_init_75132762917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24870;
     Object term24872;
     Object term24874;
     Object term24876;
     Object term24886;

    public PostStatBO_init_75132762917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24870 = new Long(-8928717808154338062L);
        term24872 = new Long(4628458998884457238L);
        term24874 = new Long(-6806576523000182981L);
        term24876 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24877 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24881 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24877, term24877.getClass(), "year", 2013);
        setShortField(term24877, term24877.getClass(), "month", (short) 9);
        setShortField(term24877, term24877.getClass(), "day", (short) 27);
        setField(term24876, term24876.getClass(), "date", term24877);
        setByteField(term24881, term24881.getClass(), "hour", (byte) 9);
        setByteField(term24881, term24881.getClass(), "minute", (byte) 30);
        setByteField(term24881, term24881.getClass(), "second", (byte) 6);
        setIntField(term24881, term24881.getClass(), "nano", 647438502);
        setField(term24876, term24876.getClass(), "time", term24881);
        term24886 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24887 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24891 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term24887, term24887.getClass(), "year", 2021);
        setShortField(term24887, term24887.getClass(), "month", (short) 10);
        setShortField(term24887, term24887.getClass(), "day", (short) 16);
        setField(term24886, term24886.getClass(), "date", term24887);
        setByteField(term24891, term24891.getClass(), "hour", (byte) 5);
        setByteField(term24891, term24891.getClass(), "minute", (byte) 6);
        setByteField(term24891, term24891.getClass(), "second", (byte) 17);
        setIntField(term24891, term24891.getClass(), "nano", 631786532);
        setField(term24886, term24886.getClass(), "time", term24891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[5];
        args[0] = term24870;
        args[1] = term24872;
        args[2] = term24874;
        args[3] = term24876;
        args[4] = term24886;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


