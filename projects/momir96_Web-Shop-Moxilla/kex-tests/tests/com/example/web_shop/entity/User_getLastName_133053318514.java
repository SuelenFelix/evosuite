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

public class User_getLastName_133053318514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5086;

    public User_getLastName_133053318514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5086 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term5185 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5186 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5188 = (int[]) newIntArray(6);
        setLongField(term5086, term5086.getClass(), "id", -7291743527973326814L);
        setField(term5086, term5086.getClass(), "username", "TwfWVQGiIj");
        setField(term5086, term5086.getClass(), "email", "gUvcueTURF");
        setField(term5086, term5086.getClass(), "password", "EwQBhZjCIT");
        setField(term5086, term5086.getClass(), "confirmPassword", "aSkmSwTnEw");
        setField(term5086, term5086.getClass(), "firstName", "xvkbvaEGYd");
        setField(term5086, term5086.getClass(), "lastName", "HBGNxdNURv");
        setIntField(term5086, term5086.getClass(), "age", -883034806);
        setField(term5086, term5086.getClass(), "city", "mfCpTPPQQm");
        setField(term5086, term5086.getClass(), "gender", "OcJCIDNIXA");
        setIntField(term5186, term5186.getClass(), "signum", 1);
        setIntElement(term5188, 0, 15498);
        setIntElement(term5188, 1, -1390712929);
        setIntElement(term5188, 2, 1617799219);
        setIntElement(term5188, 3, -903553597);
        setIntElement(term5188, 4, -1997977581);
        setIntElement(term5188, 5, -2052139129);
        setField(term5186, term5186.getClass(), "mag", term5188);
        setIntField(term5186, term5186.getClass(), "bitCountPlusOne", 0);
        setIntField(term5186, term5186.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5186, term5186.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5186, term5186.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5185, term5185.getClass(), "intVal", term5186);
        setIntField(term5185, term5185.getClass(), "scale", 53);
        setIntField(term5185, term5185.getClass(), "precision", 0);
        setField(term5185, term5185.getClass(), "stringCache", null);
        setLongField(term5185, term5185.getClass(), "intCompact", -9223372036854775808L);
        setField(term5086, term5086.getClass(), "balance", term5185);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term5086, args);
    }

};


