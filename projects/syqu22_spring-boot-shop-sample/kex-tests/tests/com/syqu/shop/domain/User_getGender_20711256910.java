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

public class User_getGender_20711256910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4157;

    public User_getGender_20711256910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4157 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term4256 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4257 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4259 = (int[]) newIntArray(6);
        setLongField(term4157, term4157.getClass(), "id", 7994303628307559416L);
        setField(term4157, term4157.getClass(), "username", "smnHEqRFRx");
        setField(term4157, term4157.getClass(), "email", "XYtryyobou");
        setField(term4157, term4157.getClass(), "password", "OYbzXylRWW");
        setField(term4157, term4157.getClass(), "passwordConfirm", "DSNsTGYXDF");
        setField(term4157, term4157.getClass(), "firstName", "sQvGcVjdEx");
        setField(term4157, term4157.getClass(), "lastName", "rLHAoqXgPh");
        setIntField(term4157, term4157.getClass(), "age", -1339778481);
        setField(term4157, term4157.getClass(), "city", "zUlRdimJtU");
        setField(term4157, term4157.getClass(), "gender", "vwbEQQNQrx");
        setIntField(term4257, term4257.getClass(), "signum", 1);
        setIntElement(term4259, 0, 25426);
        setIntElement(term4259, 1, -543058641);
        setIntElement(term4259, 2, -2089171980);
        setIntElement(term4259, 3, -1455996494);
        setIntElement(term4259, 4, 401076257);
        setIntElement(term4259, 5, 615822889);
        setField(term4257, term4257.getClass(), "mag", term4259);
        setIntField(term4257, term4257.getClass(), "bitCountPlusOne", 0);
        setIntField(term4257, term4257.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4257, term4257.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4257, term4257.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4256, term4256.getClass(), "intVal", term4257);
        setIntField(term4256, term4256.getClass(), "scale", 53);
        setIntField(term4256, term4256.getClass(), "precision", 0);
        setField(term4256, term4256.getClass(), "stringCache", null);
        setLongField(term4256, term4256.getClass(), "intCompact", -9223372036854775808L);
        setField(term4157, term4157.getClass(), "balance", term4256);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGender", argTypes, term4157, args);
    }

};


