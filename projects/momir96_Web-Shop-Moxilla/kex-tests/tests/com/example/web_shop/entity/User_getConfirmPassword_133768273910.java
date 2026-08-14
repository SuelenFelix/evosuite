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

public class User_getConfirmPassword_133768273910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4238;

    public User_getConfirmPassword_133768273910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4238 = newInstance(Class.forName("com.example.web_shop.entity.User"));
        Object term4337 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4338 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4340 = (int[]) newIntArray(6);
        setLongField(term4238, term4238.getClass(), "id", -6723783499250797216L);
        setField(term4238, term4238.getClass(), "username", "tRxZafjqIx");
        setField(term4238, term4238.getClass(), "email", "DhjNLmRMCu");
        setField(term4238, term4238.getClass(), "password", "PgPzMSEjjX");
        setField(term4238, term4238.getClass(), "confirmPassword", "wzsPSPcRdj");
        setField(term4238, term4238.getClass(), "firstName", "kGMQdqJYyB");
        setField(term4238, term4238.getClass(), "lastName", "XJJNClzHRf");
        setIntField(term4238, term4238.getClass(), "age", -1339778481);
        setField(term4238, term4238.getClass(), "city", "HDaezxQfQR");
        setField(term4238, term4238.getClass(), "gender", "iikZEapDlu");
        setIntField(term4338, term4338.getClass(), "signum", 1);
        setIntElement(term4340, 0, 2454);
        setIntElement(term4340, 1, -2113177110);
        setIntElement(term4340, 2, 1797955482);
        setIntElement(term4340, 3, 2062976789);
        setIntElement(term4340, 4, -1123752995);
        setIntElement(term4340, 5, 1177879883);
        setField(term4338, term4338.getClass(), "mag", term4340);
        setIntField(term4338, term4338.getClass(), "bitCountPlusOne", 0);
        setIntField(term4338, term4338.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4338, term4338.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4338, term4338.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4337, term4337.getClass(), "intVal", term4338);
        setIntField(term4337, term4337.getClass(), "scale", 52);
        setIntField(term4337, term4337.getClass(), "precision", 0);
        setField(term4337, term4337.getClass(), "stringCache", null);
        setLongField(term4337, term4337.getClass(), "intCompact", -9223372036854775808L);
        setField(term4238, term4238.getClass(), "balance", term4337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfirmPassword", argTypes, term4238, args);
    }

};


