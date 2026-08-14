package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_init_176197721527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30982;
     Object term31032;
     Object term31046;
     Object term31056;

    public User_init_176197721527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30982 = new Long(-7163612258041042650L);
        term31032 = new Long(-7186158121023817313L);
        term31046 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31047 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31051 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31047, term31047.getClass(), "year", 2024);
        setShortField(term31047, term31047.getClass(), "month", (short) 3);
        setShortField(term31047, term31047.getClass(), "day", (short) 30);
        setField(term31046, term31046.getClass(), "date", term31047);
        setByteField(term31051, term31051.getClass(), "hour", (byte) 7);
        setByteField(term31051, term31051.getClass(), "minute", (byte) 18);
        setByteField(term31051, term31051.getClass(), "second", (byte) 30);
        setIntField(term31051, term31051.getClass(), "nano", 930626265);
        setField(term31046, term31046.getClass(), "time", term31051);
        term31056 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term31057 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31061 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term31057, term31057.getClass(), "year", 2017);
        setShortField(term31057, term31057.getClass(), "month", (short) 10);
        setShortField(term31057, term31057.getClass(), "day", (short) 18);
        setField(term31056, term31056.getClass(), "date", term31057);
        setByteField(term31061, term31061.getClass(), "hour", (byte) 20);
        setByteField(term31061, term31061.getClass(), "minute", (byte) 35);
        setByteField(term31061, term31061.getClass(), "second", (byte) 5);
        setIntField(term31061, term31061.getClass(), "nano", 697625538);
        setField(term31056, term31056.getClass(), "time", term31061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.Long");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.time.LocalDateTime");
        argTypes[8] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[9];
        args[0] = term30982;
        args[1] = "boSSpezHeU";
        args[2] = "OUeBWNTQDh";
        args[3] = "gltJarNuUk";
        args[4] = "ZwZIDwYcSW";
        args[5] = term31032;
        args[6] = "sOdkipUKRu";
        args[7] = term31046;
        args[8] = term31056;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


