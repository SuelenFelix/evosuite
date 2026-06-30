package com.stock.spider.service.impl;

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
import static com.stock.spider.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IndustryServiceImpl_1_init_12167882020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;

    public IndustryServiceImpl_1_init_12167882020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term14 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term16 = (int[]) newIntArray(6);
        setIntField(term14, term14.getClass(), "signum", 1);
        setIntElement(term16, 0, 9058);
        setIntElement(term16, 1, 1365043541);
        setIntElement(term16, 2, 1239861896);
        setIntElement(term16, 3, -1338148297);
        setIntElement(term16, 4, -418263970);
        setIntElement(term16, 5, -265097411);
        setField(term14, term14.getClass(), "mag", term16);
        setIntField(term14, term14.getClass(), "bitCountPlusOne", 0);
        setIntField(term14, term14.getClass(), "bitLengthPlusOne", 0);
        setIntField(term14, term14.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term14, term14.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term13, term13.getClass(), "intVal", term14);
        setIntField(term13, term13.getClass(), "scale", 53);
        setIntField(term13, term13.getClass(), "precision", 0);
        setField(term13, term13.getClass(), "stringCache", null);
        setLongField(term13, term13.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.stock.spider.service.impl.IndustryServiceImpl$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.stock.spider.service.impl.IndustryServiceImpl");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        args[2] = term13;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


