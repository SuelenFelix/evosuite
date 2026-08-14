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
import java.lang.Long;

public class User_setId_12597254623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2758;
     Object term2874;

    public User_setId_12597254623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2758 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term2857 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2858 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2860 = (int[]) newIntArray(6);
        setLongField(term2758, term2758.getClass(), "id", -1610676979013636850L);
        setField(term2758, term2758.getClass(), "username", "gCWtLVKVVe");
        setField(term2758, term2758.getClass(), "email", "fWKJoSoCwE");
        setField(term2758, term2758.getClass(), "password", "wfaXBpWAUH");
        setField(term2758, term2758.getClass(), "confirmPassword", "VMeAzAHwZj");
        setField(term2758, term2758.getClass(), "firstName", "PznxWXsZME");
        setField(term2758, term2758.getClass(), "lastName", "ZzIujlwVsw");
        setIntField(term2758, term2758.getClass(), "age", 1484323161);
        setField(term2758, term2758.getClass(), "city", "LWyEaeIyAo");
        setField(term2758, term2758.getClass(), "gender", "yVMkkQhvmN");
        setIntField(term2858, term2858.getClass(), "signum", 1);
        setIntElement(term2860, 0, 786);
        setIntElement(term2860, 1, 1645098337);
        setIntElement(term2860, 2, -1661047007);
        setIntElement(term2860, 3, 638909622);
        setIntElement(term2860, 4, 5733837);
        setIntElement(term2860, 5, 1325345559);
        setField(term2858, term2858.getClass(), "mag", term2860);
        setIntField(term2858, term2858.getClass(), "bitCountPlusOne", 0);
        setIntField(term2858, term2858.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2858, term2858.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2858, term2858.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2857, term2857.getClass(), "intVal", term2858);
        setIntField(term2857, term2857.getClass(), "scale", 52);
        setIntField(term2857, term2857.getClass(), "precision", 0);
        setField(term2857, term2857.getClass(), "stringCache", null);
        setLongField(term2857, term2857.getClass(), "intCompact", -9223372036854775808L);
        setField(term2758, term2758.getClass(), "balance", term2857);
        term2874 = new Long(2062173786000223358L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2874;
        callMethod(klass, "setId", argTypes, term2758, args);
    }

};


