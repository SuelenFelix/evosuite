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

public class User_setLastName_137809167115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5288;

    public User_setLastName_137809167115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5288 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term5387 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5388 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5390 = (int[]) newIntArray(6);
        setLongField(term5288, term5288.getClass(), "id", -5963439350418910964L);
        setField(term5288, term5288.getClass(), "username", "XfRABIFVEp");
        setField(term5288, term5288.getClass(), "email", "MHGKyEnwKc");
        setField(term5288, term5288.getClass(), "password", "ShIELyuULw");
        setField(term5288, term5288.getClass(), "confirmPassword", "IpQuOGMgmj");
        setField(term5288, term5288.getClass(), "firstName", "pJbnHTYrxn");
        setField(term5288, term5288.getClass(), "lastName", "iIRsCSYqXH");
        setIntField(term5288, term5288.getClass(), "age", 1585847225);
        setField(term5288, term5288.getClass(), "city", "nghfqDXyCG");
        setField(term5288, term5288.getClass(), "gender", "WBAOTqErtm");
        setIntField(term5388, term5388.getClass(), "signum", 1);
        setIntElement(term5390, 0, 6075);
        setIntElement(term5390, 1, 643134713);
        setIntElement(term5390, 2, 1498303159);
        setIntElement(term5390, 3, 2100111685);
        setIntElement(term5390, 4, -716193830);
        setIntElement(term5390, 5, -101865319);
        setField(term5388, term5388.getClass(), "mag", term5390);
        setIntField(term5388, term5388.getClass(), "bitCountPlusOne", 0);
        setIntField(term5388, term5388.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5388, term5388.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5388, term5388.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5387, term5387.getClass(), "intVal", term5388);
        setIntField(term5387, term5387.getClass(), "scale", 52);
        setIntField(term5387, term5387.getClass(), "precision", 0);
        setField(term5387, term5387.getClass(), "stringCache", null);
        setLongField(term5387, term5387.getClass(), "intCompact", -9223372036854775808L);
        setField(term5288, term5288.getClass(), "balance", term5387);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PqtVXXZMqK";
        callMethod(klass, "setLastName", argTypes, term5288, args);
    }

};


