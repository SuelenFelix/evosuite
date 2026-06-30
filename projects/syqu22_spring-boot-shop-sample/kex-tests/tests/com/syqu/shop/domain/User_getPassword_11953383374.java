package com.syqu.shop.domain;

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
import static com.syqu.shop.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class User_getPassword_11953383374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2945;

    public User_getPassword_11953383374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2945 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term3044 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3045 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3047 = (int[]) newIntArray(6);
        setLongField(term2945, term2945.getClass(), "id", -1468719814009985452L);
        setField(term2945, term2945.getClass(), "username", "pORebkoRdD");
        setField(term2945, term2945.getClass(), "email", "mXGCWJDOqA");
        setField(term2945, term2945.getClass(), "password", "dpNsDgfPso");
        setField(term2945, term2945.getClass(), "passwordConfirm", "hCWPJQKpdc");
        setField(term2945, term2945.getClass(), "firstName", "WzMEhMXkKx");
        setField(term2945, term2945.getClass(), "lastName", "XOiDvlDhdc");
        setIntField(term2945, term2945.getClass(), "age", 391863371);
        setField(term2945, term2945.getClass(), "city", "AdxvLJhNLe");
        setField(term2945, term2945.getClass(), "gender", "lHfTrWKMPk");
        setIntField(term3045, term3045.getClass(), "signum", 1);
        setIntElement(term3047, 0, 92);
        setIntElement(term3047, 1, 1034738575);
        setIntElement(term3047, 2, -1456630577);
        setIntElement(term3047, 3, -1449292938);
        setIntElement(term3047, 4, -1319116780);
        setIntElement(term3047, 5, 1851590535);
        setField(term3045, term3045.getClass(), "mag", term3047);
        setIntField(term3045, term3045.getClass(), "bitCountPlusOne", 0);
        setIntField(term3045, term3045.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3045, term3045.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3045, term3045.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3044, term3044.getClass(), "intVal", term3045);
        setIntField(term3044, term3044.getClass(), "scale", 51);
        setIntField(term3044, term3044.getClass(), "precision", 0);
        setField(term3044, term3044.getClass(), "stringCache", null);
        setLongField(term3044, term3044.getClass(), "intCompact", -9223372036854775808L);
        setField(term2945, term2945.getClass(), "balance", term3044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term2945, args);
    }

};


