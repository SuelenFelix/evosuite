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

public class User_getCity_5367562739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3955;

    public User_getCity_5367562739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3955 = newInstance(Class.forName("com.syqu.shop.domain.User"));
        Object term4054 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4055 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4057 = (int[]) newIntArray(6);
        setLongField(term3955, term3955.getClass(), "id", 5953383087795962419L);
        setField(term3955, term3955.getClass(), "username", "HWkpTmtlrc");
        setField(term3955, term3955.getClass(), "email", "hMmaoREuCK");
        setField(term3955, term3955.getClass(), "password", "VeDtgDzGAN");
        setField(term3955, term3955.getClass(), "passwordConfirm", "aWYOWZFyaX");
        setField(term3955, term3955.getClass(), "firstName", "BRIVNtfUWU");
        setField(term3955, term3955.getClass(), "lastName", "DbiCVtPPCT");
        setIntField(term3955, term3955.getClass(), "age", 1227103734);
        setField(term3955, term3955.getClass(), "city", "WzFopsaDuG");
        setField(term3955, term3955.getClass(), "gender", "PapWxkhEWe");
        setIntField(term4055, term4055.getClass(), "signum", 1);
        setIntElement(term4057, 0, 786);
        setIntElement(term4057, 1, 1645098337);
        setIntElement(term4057, 2, -1661047007);
        setIntElement(term4057, 3, 638909622);
        setIntElement(term4057, 4, 5733837);
        setIntElement(term4057, 5, 1325345559);
        setField(term4055, term4055.getClass(), "mag", term4057);
        setIntField(term4055, term4055.getClass(), "bitCountPlusOne", 0);
        setIntField(term4055, term4055.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4055, term4055.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4055, term4055.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4054, term4054.getClass(), "intVal", term4055);
        setIntField(term4054, term4054.getClass(), "scale", 52);
        setIntField(term4054, term4054.getClass(), "precision", 0);
        setField(term4054, term4054.getClass(), "stringCache", null);
        setLongField(term4054, term4054.getClass(), "intCompact", -9223372036854775808L);
        setField(term3955, term3955.getClass(), "balance", term4054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCity", argTypes, term3955, args);
    }

};


