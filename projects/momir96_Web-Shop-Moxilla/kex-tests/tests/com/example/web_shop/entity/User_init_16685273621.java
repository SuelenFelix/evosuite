package com.example.web_shop.entity;

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
import static com.example.web_shop.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class User_init_16685273621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2427;
     Object term2453;

    public User_init_16685273621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2427 = new Integer(568599855);
        term2453 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2454 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2456 = (int[]) newIntArray(6);
        setIntField(term2454, term2454.getClass(), "signum", 1);
        setIntElement(term2456, 0, 51722);
        setIntElement(term2456, 1, 1822015379);
        setIntElement(term2456, 2, 1030733959);
        setIntElement(term2456, 3, 1299891196);
        setIntElement(term2456, 4, 1679751767);
        setIntElement(term2456, 5, -572989409);
        setField(term2454, term2454.getClass(), "mag", term2456);
        setIntField(term2454, term2454.getClass(), "bitCountPlusOne", 0);
        setIntField(term2454, term2454.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2454, term2454.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2454, term2454.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2453, term2453.getClass(), "intVal", term2454);
        setIntField(term2453, term2453.getClass(), "scale", 53);
        setIntField(term2453, term2453.getClass(), "precision", 0);
        setField(term2453, term2453.getClass(), "stringCache", null);
        setLongField(term2453, term2453.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[10];
        args[0] = "pORebkoRdD";
        args[1] = "mXGCWJDOqA";
        args[2] = "dpNsDgfPso";
        args[3] = "hCWPJQKpdc";
        args[4] = "WzMEhMXkKx";
        args[5] = "XOiDvlDhdc";
        args[6] = term2427;
        args[7] = "AdxvLJhNLe";
        args[8] = "lHfTrWKMPk";
        args[9] = term2453;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


