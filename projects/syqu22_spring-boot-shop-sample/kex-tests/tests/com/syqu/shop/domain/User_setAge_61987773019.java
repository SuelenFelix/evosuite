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
import java.lang.Integer;

public class User_setAge_61987773019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6103;
     Object term6219;

    public User_setAge_61987773019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6103 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term6202 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6203 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6205 = (int[]) newIntArray(6);
        setLongField(term6103, term6103.getClass(), "id", -6723783499250797216L);
        setField(term6103, term6103.getClass(), "username", "rYbtIDVdnd");
        setField(term6103, term6103.getClass(), "email", "UKAReurpHG");
        setField(term6103, term6103.getClass(), "password", "WVRMUmrljA");
        setField(term6103, term6103.getClass(), "passwordConfirm", "NTlKJDDWlk");
        setField(term6103, term6103.getClass(), "firstName", "vOuMEpOQAg");
        setField(term6103, term6103.getClass(), "lastName", "SIODFGaQhr");
        setIntField(term6103, term6103.getClass(), "age", 1622346318);
        setField(term6103, term6103.getClass(), "city", "qYzsiuXOgS");
        setField(term6103, term6103.getClass(), "gender", "bxrCBbrrct");
        setIntField(term6203, term6203.getClass(), "signum", 1);
        setIntElement(term6205, 0, 21910);
        setIntElement(term6205, 1, 1232338756);
        setIntElement(term6205, 2, -1082493650);
        setIntElement(term6205, 3, 2096909910);
        setIntElement(term6205, 4, -386707863);
        setIntElement(term6205, 5, -1583619851);
        setField(term6203, term6203.getClass(), "mag", term6205);
        setIntField(term6203, term6203.getClass(), "bitCountPlusOne", 0);
        setIntField(term6203, term6203.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6203, term6203.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6203, term6203.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6202, term6202.getClass(), "intVal", term6203);
        setIntField(term6202, term6202.getClass(), "scale", 53);
        setIntField(term6202, term6202.getClass(), "precision", 0);
        setField(term6202, term6202.getClass(), "stringCache", null);
        setLongField(term6202, term6202.getClass(), "intCompact", -9223372036854775808L);
        setField(term6103, term6103.getClass(), "balance", term6202);
        term6219 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6219;
        callMethod(klass, "setAge", argTypes, term6103, args);
    }

};


