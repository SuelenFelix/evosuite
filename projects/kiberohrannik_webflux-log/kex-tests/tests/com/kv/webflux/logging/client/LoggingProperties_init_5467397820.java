package com.kv.webflux.logging.client;

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
import static com.kv.webflux.logging.client.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;

public class LoggingProperties_init_5467397820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2722;
     Object term2724;
     Object term2809;
     Object term2811;
     Object term2836;
     Object term2838;

    public LoggingProperties_init_5467397820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2722 = new Boolean(true);
        term2724 = (Object[]) newArray("java.lang.String", 7);
        setElement(term2724, 0, "iNwOJRBEjp");
        setElement(term2724, 1, "XylxrMBraH");
        setElement(term2724, 2, "pORebkoRdD");
        setElement(term2724, 3, "mXGCWJDOqA");
        setElement(term2724, 4, "dpNsDgfPso");
        setElement(term2724, 5, "hCWPJQKpdc");
        setElement(term2724, 6, "WzMEhMXkKx");
        term2809 = new Boolean(false);
        term2811 = (Object[]) newArray("java.lang.String", 2);
        setElement(term2811, 0, "XOiDvlDhdc");
        setElement(term2811, 1, "AdxvLJhNLe");
        term2836 = new Boolean(true);
        term2838 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.kv.webflux.logging.client.LoggingProperties");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = boolean.class;
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        argTypes[3] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[4] = boolean.class;
        argTypes[5] = boolean.class;
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = term2722;
        args[1] = term2724;
        args[2] = term2809;
        args[3] = term2811;
        args[4] = term2836;
        args[5] = term2838;
        args[6] = "lHfTrWKMPk";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


