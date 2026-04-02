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

public class User_getId_20864228841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2339;

    public User_getId_20864228841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2339 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term2438 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2439 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2441 = (int[]) newIntArray(6);
        setLongField(term2339, term2339.getClass(), "id", -1154553077993834885L);
        setField(term2339, term2339.getClass(), "username", "jiKYgYHqIS");
        setField(term2339, term2339.getClass(), "email", "DfISiziTgG");
        setField(term2339, term2339.getClass(), "password", "XqgfKFvPSD");
        setField(term2339, term2339.getClass(), "passwordConfirm", "JiVRgTZvKc");
        setField(term2339, term2339.getClass(), "firstName", "XPKmummaqg");
        setField(term2339, term2339.getClass(), "lastName", "BKLfkLiZTH");
        setIntField(term2339, term2339.getClass(), "age", 568599855);
        setField(term2339, term2339.getClass(), "city", "SPpkrGcPRr");
        setField(term2339, term2339.getClass(), "gender", "sEccwbJKYE");
        setIntField(term2439, term2439.getClass(), "signum", 1);
        setIntElement(term2441, 0, 5883);
        setIntElement(term2441, 1, 833709085);
        setIntElement(term2441, 2, 749794735);
        setIntElement(term2441, 3, 825830368);
        setIntElement(term2441, 4, 935494074);
        setIntElement(term2441, 5, -2012885541);
        setField(term2439, term2439.getClass(), "mag", term2441);
        setIntField(term2439, term2439.getClass(), "bitCountPlusOne", 0);
        setIntField(term2439, term2439.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2439, term2439.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2439, term2439.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2438, term2438.getClass(), "intVal", term2439);
        setIntField(term2438, term2438.getClass(), "scale", 52);
        setIntField(term2438, term2438.getClass(), "precision", 0);
        setField(term2438, term2438.getClass(), "stringCache", null);
        setLongField(term2438, term2438.getClass(), "intCompact", -9223372036854775808L);
        setField(term2339, term2339.getClass(), "balance", term2438);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2339, args);
    }

};


