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

public class User_getFirstName_16333230196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3349;

    public User_getFirstName_16333230196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3349 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term3448 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3449 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3451 = (int[]) newIntArray(6);
        setLongField(term3349, term3349.getClass(), "id", 3825396310311739952L);
        setField(term3349, term3349.getClass(), "username", "gCWtLVKVVe");
        setField(term3349, term3349.getClass(), "email", "fWKJoSoCwE");
        setField(term3349, term3349.getClass(), "password", "wfaXBpWAUH");
        setField(term3349, term3349.getClass(), "passwordConfirm", "VMeAzAHwZj");
        setField(term3349, term3349.getClass(), "firstName", "PznxWXsZME");
        setField(term3349, term3349.getClass(), "lastName", "ZzIujlwVsw");
        setIntField(term3349, term3349.getClass(), "age", -616727354);
        setField(term3349, term3349.getClass(), "city", "LWyEaeIyAo");
        setField(term3349, term3349.getClass(), "gender", "yVMkkQhvmN");
        setIntField(term3449, term3449.getClass(), "signum", 1);
        setIntElement(term3451, 0, 3996);
        setIntElement(term3451, 1, 1627046923);
        setIntElement(term3451, 2, -1280614629);
        setIntElement(term3451, 3, 917260100);
        setIntElement(term3451, 4, -74841886);
        setIntElement(term3451, 5, 597293319);
        setField(term3449, term3449.getClass(), "mag", term3451);
        setIntField(term3449, term3449.getClass(), "bitCountPlusOne", 0);
        setIntField(term3449, term3449.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3449, term3449.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3449, term3449.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3448, term3448.getClass(), "intVal", term3449);
        setIntField(term3448, term3448.getClass(), "scale", 52);
        setIntField(term3448, term3448.getClass(), "precision", 0);
        setField(term3448, term3448.getClass(), "stringCache", null);
        setLongField(term3448, term3448.getClass(), "intCompact", -9223372036854775808L);
        setField(term3349, term3349.getClass(), "balance", term3448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term3349, args);
    }

};


