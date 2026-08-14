package com.industrieit.ledger.clientledger.core.db.model.request.impl;

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
import static com.industrieit.ledger.clientledger.core.db.model.request.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class P2PRequest_init_1196249549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1954;
     Object term1971;
     Object term1988;

    public P2PRequest_init_1196249549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1954 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1955 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1957 = (int[]) newIntArray(6);
        setIntField(term1955, term1955.getClass(), "signum", 1);
        setIntElement(term1957, 0, 786);
        setIntElement(term1957, 1, 1645098337);
        setIntElement(term1957, 2, -1661047007);
        setIntElement(term1957, 3, 638909622);
        setIntElement(term1957, 4, 5733837);
        setIntElement(term1957, 5, 1325345559);
        setField(term1955, term1955.getClass(), "mag", term1957);
        setIntField(term1955, term1955.getClass(), "bitCountPlusOne", 0);
        setIntField(term1955, term1955.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1955, term1955.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1955, term1955.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1954, term1954.getClass(), "intVal", term1955);
        setIntField(term1954, term1954.getClass(), "scale", 52);
        setIntField(term1954, term1954.getClass(), "precision", 0);
        setField(term1954, term1954.getClass(), "stringCache", null);
        setLongField(term1954, term1954.getClass(), "intCompact", -9223372036854775808L);
        term1971 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1972 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1974 = (int[]) newIntArray(6);
        setIntField(term1972, term1972.getClass(), "signum", 1);
        setIntElement(term1974, 0, 25426);
        setIntElement(term1974, 1, -543058641);
        setIntElement(term1974, 2, -2089171980);
        setIntElement(term1974, 3, -1455996494);
        setIntElement(term1974, 4, 401076257);
        setIntElement(term1974, 5, 615822889);
        setField(term1972, term1972.getClass(), "mag", term1974);
        setIntField(term1972, term1972.getClass(), "bitCountPlusOne", 0);
        setIntField(term1972, term1972.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1972, term1972.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1972, term1972.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1971, term1971.getClass(), "intVal", term1972);
        setIntField(term1971, term1971.getClass(), "scale", 53);
        setIntField(term1971, term1971.getClass(), "precision", 0);
        setField(term1971, term1971.getClass(), "stringCache", null);
        setLongField(term1971, term1971.getClass(), "intCompact", -9223372036854775808L);
        term1988 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1989 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1991 = (int[]) newIntArray(6);
        setIntField(term1989, term1989.getClass(), "signum", 1);
        setIntElement(term1991, 0, 465);
        setIntElement(term1991, 1, -1390153706);
        setIntElement(term1991, 2, -2072151250);
        setIntElement(term1991, 3, -351773634);
        setIntElement(term1991, 4, -2080264737);
        setIntElement(term1991, 5, -362538513);
        setField(term1989, term1989.getClass(), "mag", term1991);
        setIntField(term1989, term1989.getClass(), "bitCountPlusOne", 0);
        setIntField(term1989, term1989.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1989, term1989.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1989, term1989.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1988, term1988.getClass(), "intVal", term1989);
        setIntField(term1988, term1988.getClass(), "scale", 51);
        setIntField(term1988, term1988.getClass(), "precision", 0);
        setField(term1988, term1988.getClass(), "stringCache", null);
        setLongField(term1988, term1988.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.math.BigDecimal");
        argTypes[6] = Class.forName("java.math.BigDecimal");
        argTypes[7] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[8];
        args[0] = "YRHGsAkhxb";
        args[1] = "ffYhPOzlUs";
        args[2] = "MLqYREekMl";
        args[3] = "ytSBIKXogI";
        args[4] = "nHXjMycHlU";
        args[5] = term1954;
        args[6] = term1971;
        args[7] = term1988;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


