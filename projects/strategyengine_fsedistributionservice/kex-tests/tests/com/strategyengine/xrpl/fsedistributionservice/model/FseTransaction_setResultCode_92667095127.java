package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class FseTransaction_setResultCode_92667095127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605523;

    public FseTransaction_setResultCode_92667095127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term605603 = new Long(-992220562260824979L);
        term605523 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term605524 = newInstance(Class.forName("java.util.Date"));
        Object term605526 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term605527 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term605529 = (int[]) newIntArray(6);
        setLongField(term605524, term605524.getClass(), "fastTime", 1300710543095L);
        setField(term605524, term605524.getClass(), "cdate", null);
        setField(term605523, term605523.getClass(), "transactionDate", term605524);
        setIntField(term605527, term605527.getClass(), "signum", 1);
        setIntElement(term605529, 0, 48168);
        setIntElement(term605529, 1, -1749295857);
        setIntElement(term605529, 2, 1015367755);
        setIntElement(term605529, 3, -520713164);
        setIntElement(term605529, 4, -2096811176);
        setIntElement(term605529, 5, -2014950585);
        setField(term605527, term605527.getClass(), "mag", term605529);
        setIntField(term605527, term605527.getClass(), "bitCountPlusOne", 0);
        setIntField(term605527, term605527.getClass(), "bitLengthPlusOne", 0);
        setIntField(term605527, term605527.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term605527, term605527.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term605526, term605526.getClass(), "intVal", term605527);
        setIntField(term605526, term605526.getClass(), "scale", 53);
        setIntField(term605526, term605526.getClass(), "precision", 0);
        setField(term605526, term605526.getClass(), "stringCache", null);
        setLongField(term605526, term605526.getClass(), "intCompact", -9223372036854775808L);
        setField(term605523, term605523.getClass(), "amount", term605526);
        setField(term605523, term605523.getClass(), "toAddress", "GWyDJhNjHO");
        setField(term605523, term605523.getClass(), "fromAddress", "wGLXibmokg");
        setField(term605523, term605523.getClass(), "currency", "pjzfuurpjQ");
        setField(term605523, term605523.getClass(), "issuerAddress", "ruWiEcqbKE");
        setField(term605523, term605523.getClass(), "transactionType", "fOazzEjCJK");
        setField(term605523, term605523.getClass(), "ledgerIndex", term605603);
        setField(term605523, term605523.getClass(), "transactionHash", "rQvktJLyNp");
        setField(term605523, term605523.getClass(), "resultCode", "agrDiNiIaA");
        setField(term605523, term605523.getClass(), "reason", "WUUmlOfErB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OacYqyvsgP";
        callMethod(klass, "setResultCode", argTypes, term605523, args);
    }

};


