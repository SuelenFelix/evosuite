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

public class User_getBalance_30366891622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6770;

    public User_getBalance_30366891622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6770 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term6869 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6870 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6872 = (int[]) newIntArray(6);
        setLongField(term6770, term6770.getClass(), "id", 5946780097489996391L);
        setField(term6770, term6770.getClass(), "username", "DIbeDHICho");
        setField(term6770, term6770.getClass(), "email", "dJGPlmSRnz");
        setField(term6770, term6770.getClass(), "password", "DPskuFUobI");
        setField(term6770, term6770.getClass(), "confirmPassword", "wBGfLpNNiZ");
        setField(term6770, term6770.getClass(), "firstName", "yUGCjlqgJE");
        setField(term6770, term6770.getClass(), "lastName", "PXdVZyoJyC");
        setIntField(term6770, term6770.getClass(), "age", -2068769794);
        setField(term6770, term6770.getClass(), "city", "vLerpqavFM");
        setField(term6770, term6770.getClass(), "gender", "qnvxzwuGKX");
        setIntField(term6870, term6870.getClass(), "signum", 1);
        setIntElement(term6872, 0, 51942);
        setIntElement(term6872, 1, 623316686);
        setIntElement(term6872, 2, 758747438);
        setIntElement(term6872, 3, 2029636074);
        setIntElement(term6872, 4, -1602927345);
        setIntElement(term6872, 5, -449705627);
        setField(term6870, term6870.getClass(), "mag", term6872);
        setIntField(term6870, term6870.getClass(), "bitCountPlusOne", 0);
        setIntField(term6870, term6870.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6870, term6870.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6870, term6870.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6869, term6869.getClass(), "intVal", term6870);
        setIntField(term6869, term6869.getClass(), "scale", 53);
        setIntField(term6869, term6869.getClass(), "precision", 0);
        setField(term6869, term6869.getClass(), "stringCache", null);
        setLongField(term6869, term6869.getClass(), "intCompact", -9223372036854775808L);
        setField(term6770, term6770.getClass(), "balance", term6869);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBalance", argTypes, term6770, args);
    }

};


