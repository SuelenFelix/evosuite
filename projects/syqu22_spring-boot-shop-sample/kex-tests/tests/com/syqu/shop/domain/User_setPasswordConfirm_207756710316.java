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

public class User_setPasswordConfirm_207756710316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5435;

    public User_setPasswordConfirm_207756710316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5435 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term5534 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5535 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5537 = (int[]) newIntArray(6);
        setLongField(term5435, term5435.getClass(), "id", 305759998609888272L);
        setField(term5435, term5435.getClass(), "username", "GrqozDKFOk");
        setField(term5435, term5435.getClass(), "email", "CFyoseFGLF");
        setField(term5435, term5435.getClass(), "password", "SFqCrhEWLm");
        setField(term5435, term5435.getClass(), "passwordConfirm", "GZdcJyZntS");
        setField(term5435, term5435.getClass(), "firstName", "OIHoJeysUi");
        setField(term5435, term5435.getClass(), "lastName", "WXMWFDGcLB");
        setIntField(term5435, term5435.getClass(), "age", 597278769);
        setField(term5435, term5435.getClass(), "city", "wKWbJssZuG");
        setField(term5435, term5435.getClass(), "gender", "NzBMMhkhpT");
        setIntField(term5535, term5535.getClass(), "signum", 1);
        setIntElement(term5537, 0, 2454);
        setIntElement(term5537, 1, -2113177110);
        setIntElement(term5537, 2, 1797955482);
        setIntElement(term5537, 3, 2062976789);
        setIntElement(term5537, 4, -1123752995);
        setIntElement(term5537, 5, 1177879883);
        setField(term5535, term5535.getClass(), "mag", term5537);
        setIntField(term5535, term5535.getClass(), "bitCountPlusOne", 0);
        setIntField(term5535, term5535.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5535, term5535.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5535, term5535.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5534, term5534.getClass(), "intVal", term5535);
        setIntField(term5534, term5534.getClass(), "scale", 52);
        setIntField(term5534, term5534.getClass(), "precision", 0);
        setField(term5534, term5534.getClass(), "stringCache", null);
        setLongField(term5534, term5534.getClass(), "intCompact", -9223372036854775808L);
        setField(term5435, term5435.getClass(), "balance", term5534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qCpEbQDHdF";
        callMethod(klass, "setPasswordConfirm", argTypes, term5435, args);
    }

};


