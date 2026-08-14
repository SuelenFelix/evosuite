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
import java.lang.Integer;

public class User_setAge_66253282217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5714;
     Object term5830;

    public User_setAge_66253282217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5714 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term5813 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5814 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5816 = (int[]) newIntArray(6);
        setLongField(term5714, term5714.getClass(), "id", 7862575738391801707L);
        setField(term5714, term5714.getClass(), "username", "CKWpJaaaxX");
        setField(term5714, term5714.getClass(), "email", "UBRmXJmfrt");
        setField(term5714, term5714.getClass(), "password", "WZzvmIHhzZ");
        setField(term5714, term5714.getClass(), "confirmPassword", "doQLHkjpNm");
        setField(term5714, term5714.getClass(), "firstName", "lCyLIcSuom");
        setField(term5714, term5714.getClass(), "lastName", "CGOpQSZZwI");
        setIntField(term5714, term5714.getClass(), "age", -1685132342);
        setField(term5714, term5714.getClass(), "city", "ypEdrstygY");
        setField(term5714, term5714.getClass(), "gender", "sNQFlATEeQ");
        setIntField(term5814, term5814.getClass(), "signum", 1);
        setIntElement(term5816, 0, 43771);
        setIntElement(term5816, 1, -2064049935);
        setIntElement(term5816, 2, 2069770836);
        setIntElement(term5816, 3, 478634100);
        setIntElement(term5816, 4, -643849105);
        setIntElement(term5816, 5, -507036065);
        setField(term5814, term5814.getClass(), "mag", term5816);
        setIntField(term5814, term5814.getClass(), "bitCountPlusOne", 0);
        setIntField(term5814, term5814.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5814, term5814.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5814, term5814.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5813, term5813.getClass(), "intVal", term5814);
        setIntField(term5813, term5813.getClass(), "scale", 53);
        setIntField(term5813, term5813.getClass(), "precision", 0);
        setField(term5813, term5813.getClass(), "stringCache", null);
        setLongField(term5813, term5813.getClass(), "intCompact", -9223372036854775808L);
        setField(term5714, term5714.getClass(), "balance", term5813);
        term5830 = new Integer(-1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5830;
        callMethod(klass, "setAge", argTypes, term5714, args);
    }

};


