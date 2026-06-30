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

public class User_getAge_623925248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3753;

    public User_getAge_623925248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3753 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term3852 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3853 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3855 = (int[]) newIntArray(6);
        setLongField(term3753, term3753.getClass(), "id", 3892018155439224435L);
        setField(term3753, term3753.getClass(), "username", "jwsfVjMoJT");
        setField(term3753, term3753.getClass(), "email", "ZfdXfCCFDf");
        setField(term3753, term3753.getClass(), "password", "MwwjNtdOFT");
        setField(term3753, term3753.getClass(), "passwordConfirm", "VYkqXKVlAJ");
        setField(term3753, term3753.getClass(), "firstName", "XkIoWJRNwN");
        setField(term3753, term3753.getClass(), "lastName", "aNWLJdrZMq");
        setIntField(term3753, term3753.getClass(), "age", -2038273078);
        setField(term3753, term3753.getClass(), "city", "HHmNoYxIGj");
        setField(term3753, term3753.getClass(), "gender", "PtirvZmsGt");
        setIntField(term3853, term3853.getClass(), "signum", 1);
        setIntElement(term3855, 0, 7298);
        setIntElement(term3855, 1, -1245459431);
        setIntElement(term3855, 2, 154872706);
        setIntElement(term3855, 3, -869635639);
        setIntElement(term3855, 4, 1023248111);
        setIntElement(term3855, 5, 1345698053);
        setField(term3853, term3853.getClass(), "mag", term3855);
        setIntField(term3853, term3853.getClass(), "bitCountPlusOne", 0);
        setIntField(term3853, term3853.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3853, term3853.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3853, term3853.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3852, term3852.getClass(), "intVal", term3853);
        setIntField(term3852, term3852.getClass(), "scale", 53);
        setIntField(term3852, term3852.getClass(), "precision", 0);
        setField(term3852, term3852.getClass(), "stringCache", null);
        setLongField(term3852, term3852.getClass(), "intCompact", -9223372036854775808L);
        setField(term3753, term3753.getClass(), "balance", term3852);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAge", argTypes, term3753, args);
    }

};


