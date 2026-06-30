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

public class User_canEqual_55553955424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7183;
     Object term7299;

    public User_canEqual_55553955424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7183 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term7282 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7283 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7285 = (int[]) newIntArray(6);
        setLongField(term7183, term7183.getClass(), "id", -5963439350418910964L);
        setField(term7183, term7183.getClass(), "username", "TtGbVmKcnX");
        setField(term7183, term7183.getClass(), "email", "GJVkUrCVdD");
        setField(term7183, term7183.getClass(), "password", "zNdorvdUgu");
        setField(term7183, term7183.getClass(), "passwordConfirm", "oPxuZbkYio");
        setField(term7183, term7183.getClass(), "firstName", "vKitydDVnM");
        setField(term7183, term7183.getClass(), "lastName", "urCiQnUFBM");
        setIntField(term7183, term7183.getClass(), "age", -1007160944);
        setField(term7183, term7183.getClass(), "city", "EKjQdtKxAM");
        setField(term7183, term7183.getClass(), "gender", "TXZAIPQJHt");
        setIntField(term7283, term7283.getClass(), "signum", 1);
        setIntElement(term7285, 0, 401);
        setIntElement(term7285, 1, -590196483);
        setIntElement(term7285, 2, 2126931709);
        setIntElement(term7285, 3, 1543000854);
        setIntElement(term7285, 4, 1590753847);
        setIntElement(term7285, 5, 1431251521);
        setField(term7283, term7283.getClass(), "mag", term7285);
        setIntField(term7283, term7283.getClass(), "bitCountPlusOne", 0);
        setIntField(term7283, term7283.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7283, term7283.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7283, term7283.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7282, term7282.getClass(), "intVal", term7283);
        setIntField(term7282, term7282.getClass(), "scale", 51);
        setIntField(term7282, term7282.getClass(), "precision", 0);
        setField(term7282, term7282.getClass(), "stringCache", null);
        setLongField(term7282, term7282.getClass(), "intCompact", -9223372036854775808L);
        setField(term7183, term7183.getClass(), "balance", term7282);
        term7299 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7299;
        callMethod(klass, "canEqual", argTypes, term7183, args);
    }

};


