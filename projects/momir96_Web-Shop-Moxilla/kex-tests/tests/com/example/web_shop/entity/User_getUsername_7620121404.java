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

public class User_getUsername_7620121404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2962;

    public User_getUsername_7620121404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2962 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term3061 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3062 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3064 = (int[]) newIntArray(6);
        setLongField(term2962, term2962.getClass(), "id", -8658027316505137504L);
        setField(term2962, term2962.getClass(), "username", "mvrkADEgpp");
        setField(term2962, term2962.getClass(), "email", "pXOkjyeIRb");
        setField(term2962, term2962.getClass(), "password", "GgZWSjxjyE");
        setField(term2962, term2962.getClass(), "confirmPassword", "EeBVbzjcCI");
        setField(term2962, term2962.getClass(), "firstName", "UfQtPRyWRC");
        setField(term2962, term2962.getClass(), "lastName", "FPvxVzzSvD");
        setIntField(term2962, term2962.getClass(), "age", 391863371);
        setField(term2962, term2962.getClass(), "city", "WHcwFgsGFC");
        setField(term2962, term2962.getClass(), "gender", "HzqpegHiRq");
        setIntField(term3062, term3062.getClass(), "signum", 1);
        setIntElement(term3064, 0, 25426);
        setIntElement(term3064, 1, -543058641);
        setIntElement(term3064, 2, -2089171980);
        setIntElement(term3064, 3, -1455996494);
        setIntElement(term3064, 4, 401076257);
        setIntElement(term3064, 5, 615822889);
        setField(term3062, term3062.getClass(), "mag", term3064);
        setIntField(term3062, term3062.getClass(), "bitCountPlusOne", 0);
        setIntField(term3062, term3062.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3062, term3062.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3062, term3062.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3061, term3061.getClass(), "intVal", term3062);
        setIntField(term3061, term3061.getClass(), "scale", 53);
        setIntField(term3061, term3061.getClass(), "precision", 0);
        setField(term3061, term3061.getClass(), "stringCache", null);
        setLongField(term3061, term3061.getClass(), "intCompact", -9223372036854775808L);
        setField(term2962, term2962.getClass(), "balance", term3061);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term2962, args);
    }

};


