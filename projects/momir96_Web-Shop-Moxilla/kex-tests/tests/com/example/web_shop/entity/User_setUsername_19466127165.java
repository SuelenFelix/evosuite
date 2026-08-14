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
import java.lang.Object;

public class User_setUsername_19466127165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3164;

    public User_setUsername_19466127165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3164 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term3263 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3264 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3266 = (int[]) newIntArray(6);
        setLongField(term3164, term3164.getClass(), "id", 414749984815662075L);
        setField(term3164, term3164.getClass(), "username", "jwsfVjMoJT");
        setField(term3164, term3164.getClass(), "email", "ZfdXfCCFDf");
        setField(term3164, term3164.getClass(), "password", "MwwjNtdOFT");
        setField(term3164, term3164.getClass(), "confirmPassword", "VYkqXKVlAJ");
        setField(term3164, term3164.getClass(), "firstName", "XkIoWJRNwN");
        setField(term3164, term3164.getClass(), "lastName", "aNWLJdrZMq");
        setIntField(term3164, term3164.getClass(), "age", -1922583790);
        setField(term3164, term3164.getClass(), "city", "HHmNoYxIGj");
        setField(term3164, term3164.getClass(), "gender", "PtirvZmsGt");
        setIntField(term3264, term3264.getClass(), "signum", 1);
        setIntElement(term3266, 0, 465);
        setIntElement(term3266, 1, -1390153706);
        setIntElement(term3266, 2, -2072151250);
        setIntElement(term3266, 3, -351773634);
        setIntElement(term3266, 4, -2080264737);
        setIntElement(term3266, 5, -362538513);
        setField(term3264, term3264.getClass(), "mag", term3266);
        setIntField(term3264, term3264.getClass(), "bitCountPlusOne", 0);
        setIntField(term3264, term3264.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3264, term3264.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3264, term3264.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3263, term3263.getClass(), "intVal", term3264);
        setIntField(term3263, term3263.getClass(), "scale", 51);
        setIntField(term3263, term3263.getClass(), "precision", 0);
        setField(term3263, term3263.getClass(), "stringCache", null);
        setLongField(term3263, term3263.getClass(), "intCompact", -9223372036854775808L);
        setField(term3164, term3164.getClass(), "balance", term3263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HWkpTmtlrc";
        callMethod(klass, "setUsername", argTypes, term3164, args);
    }

};


