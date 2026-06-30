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

public class User_getBalance_97874163611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4359;

    public User_getBalance_97874163611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4359 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term4458 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4459 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4461 = (int[]) newIntArray(6);
        setLongField(term4359, term4359.getClass(), "id", 2443640364875054177L);
        setField(term4359, term4359.getClass(), "username", "xtftXXMbem");
        setField(term4359, term4359.getClass(), "email", "cudZvLMQon");
        setField(term4359, term4359.getClass(), "password", "lihXWlGDxk");
        setField(term4359, term4359.getClass(), "passwordConfirm", "JmcmxoGhIK");
        setField(term4359, term4359.getClass(), "firstName", "jXzmYyrnnT");
        setField(term4359, term4359.getClass(), "lastName", "igCAtimmYB");
        setIntField(term4359, term4359.getClass(), "age", 1725571209);
        setField(term4359, term4359.getClass(), "city", "DyiXbeYIaN");
        setField(term4359, term4359.getClass(), "gender", "VGizxZnyHX");
        setIntField(term4459, term4459.getClass(), "signum", 1);
        setIntElement(term4461, 0, 465);
        setIntElement(term4461, 1, -1390153706);
        setIntElement(term4461, 2, -2072151250);
        setIntElement(term4461, 3, -351773634);
        setIntElement(term4461, 4, -2080264737);
        setIntElement(term4461, 5, -362538513);
        setField(term4459, term4459.getClass(), "mag", term4461);
        setIntField(term4459, term4459.getClass(), "bitCountPlusOne", 0);
        setIntField(term4459, term4459.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4459, term4459.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4459, term4459.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4458, term4458.getClass(), "intVal", term4459);
        setIntField(term4458, term4458.getClass(), "scale", 51);
        setIntField(term4458, term4458.getClass(), "precision", 0);
        setField(term4458, term4458.getClass(), "stringCache", null);
        setLongField(term4458, term4458.getClass(), "intCompact", -9223372036854775808L);
        setField(term4359, term4359.getClass(), "balance", term4458);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBalance", argTypes, term4359, args);
    }

};


