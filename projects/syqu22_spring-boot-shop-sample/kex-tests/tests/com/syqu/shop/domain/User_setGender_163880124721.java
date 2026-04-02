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

public class User_setGender_163880124721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6531;

    public User_setGender_163880124721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6531 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term6630 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6631 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6633 = (int[]) newIntArray(6);
        setLongField(term6531, term6531.getClass(), "id", 6682528376118987775L);
        setField(term6531, term6531.getClass(), "username", "WVbxuoDBcn");
        setField(term6531, term6531.getClass(), "email", "pvDEABOxLt");
        setField(term6531, term6531.getClass(), "password", "beAMpkroCQ");
        setField(term6531, term6531.getClass(), "passwordConfirm", "uSUvKAyuvd");
        setField(term6531, term6531.getClass(), "firstName", "onQLVONGuf");
        setField(term6531, term6531.getClass(), "lastName", "SOrEHbcbmn");
        setIntField(term6531, term6531.getClass(), "age", -6029667);
        setField(term6531, term6531.getClass(), "city", "bnsyeQXFdu");
        setField(term6531, term6531.getClass(), "gender", "BwtdjiefJn");
        setIntField(term6631, term6631.getClass(), "signum", 1);
        setIntElement(term6633, 0, 6075);
        setIntElement(term6633, 1, 643134713);
        setIntElement(term6633, 2, 1498303159);
        setIntElement(term6633, 3, 2100111685);
        setIntElement(term6633, 4, -716193830);
        setIntElement(term6633, 5, -101865319);
        setField(term6631, term6631.getClass(), "mag", term6633);
        setIntField(term6631, term6631.getClass(), "bitCountPlusOne", 0);
        setIntField(term6631, term6631.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6631, term6631.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6631, term6631.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6630, term6630.getClass(), "intVal", term6631);
        setIntField(term6630, term6630.getClass(), "scale", 52);
        setIntField(term6630, term6630.getClass(), "precision", 0);
        setField(term6630, term6630.getClass(), "stringCache", null);
        setLongField(term6630, term6630.getClass(), "intCompact", -9223372036854775808L);
        setField(term6531, term6531.getClass(), "balance", term6630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jDmhBrIoDa";
        callMethod(klass, "setGender", argTypes, term6531, args);
    }

};


