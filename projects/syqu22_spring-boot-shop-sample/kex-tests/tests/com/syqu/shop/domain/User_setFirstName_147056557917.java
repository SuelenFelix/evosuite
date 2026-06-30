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

public class User_setFirstName_147056557917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5659;

    public User_setFirstName_147056557917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5659 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term5758 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5759 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5761 = (int[]) newIntArray(5);
        setLongField(term5659, term5659.getClass(), "id", -8654565919063661957L);
        setField(term5659, term5659.getClass(), "username", "AHbZyFOmlo");
        setField(term5659, term5659.getClass(), "email", "TwfWVQGiIj");
        setField(term5659, term5659.getClass(), "password", "gUvcueTURF");
        setField(term5659, term5659.getClass(), "passwordConfirm", "EwQBhZjCIT");
        setField(term5659, term5659.getClass(), "firstName", "aSkmSwTnEw");
        setField(term5659, term5659.getClass(), "lastName", "xvkbvaEGYd");
        setIntField(term5659, term5659.getClass(), "age", -1685132342);
        setField(term5659, term5659.getClass(), "city", "HBGNxdNURv");
        setField(term5659, term5659.getClass(), "gender", "mfCpTPPQQm");
        setIntField(term5759, term5759.getClass(), "signum", 1);
        setIntElement(term5761, 0, -2002033409);
        setIntElement(term5761, 1, -1386179650);
        setIntElement(term5761, 2, -1729534613);
        setIntElement(term5761, 3, 1100074383);
        setIntElement(term5761, 4, -1610460545);
        setField(term5759, term5759.getClass(), "mag", term5761);
        setIntField(term5759, term5759.getClass(), "bitCountPlusOne", 0);
        setIntField(term5759, term5759.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5759, term5759.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5759, term5759.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5758, term5758.getClass(), "intVal", term5759);
        setIntField(term5758, term5758.getClass(), "scale", 49);
        setIntField(term5758, term5758.getClass(), "precision", 0);
        setField(term5758, term5758.getClass(), "stringCache", null);
        setLongField(term5758, term5758.getClass(), "intCompact", -9223372036854775808L);
        setField(term5659, term5659.getClass(), "balance", term5758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OcJCIDNIXA";
        callMethod(klass, "setFirstName", argTypes, term5659, args);
    }

};


