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

public class User_getCity_181916682518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5918;

    public User_getCity_181916682518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5918 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term6017 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6018 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6020 = (int[]) newIntArray(6);
        setLongField(term5918, term5918.getClass(), "id", 50358265865610362L);
        setField(term5918, term5918.getClass(), "username", "ZKMLioamsY");
        setField(term5918, term5918.getClass(), "email", "WVbxuoDBcn");
        setField(term5918, term5918.getClass(), "password", "pvDEABOxLt");
        setField(term5918, term5918.getClass(), "confirmPassword", "beAMpkroCQ");
        setField(term5918, term5918.getClass(), "firstName", "uSUvKAyuvd");
        setField(term5918, term5918.getClass(), "lastName", "onQLVONGuf");
        setIntField(term5918, term5918.getClass(), "age", 1622346318);
        setField(term5918, term5918.getClass(), "city", "SOrEHbcbmn");
        setField(term5918, term5918.getClass(), "gender", "bnsyeQXFdu");
        setIntField(term6018, term6018.getClass(), "signum", 1);
        setIntElement(term6020, 0, 17747);
        setIntElement(term6020, 1, 222971343);
        setIntElement(term6020, 2, 1645407127);
        setIntElement(term6020, 3, 211829796);
        setIntElement(term6020, 4, 1665135280);
        setIntElement(term6020, 5, -264762539);
        setField(term6018, term6018.getClass(), "mag", term6020);
        setIntField(term6018, term6018.getClass(), "bitCountPlusOne", 0);
        setIntField(term6018, term6018.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6018, term6018.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6018, term6018.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6017, term6017.getClass(), "intVal", term6018);
        setIntField(term6017, term6017.getClass(), "scale", 53);
        setIntField(term6017, term6017.getClass(), "precision", 0);
        setField(term6017, term6017.getClass(), "stringCache", null);
        setLongField(term6017, term6017.getClass(), "intCompact", -9223372036854775808L);
        setField(term5918, term5918.getClass(), "balance", term6017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCity", argTypes, term5918, args);
    }

};


