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

public class FseTransaction_FseTransactionBuilder_transactionHash_13243156889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565590;

    public FseTransaction_FseTransactionBuilder_transactionHash_13243156889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term565670 = new Long(4366106993552057355L);
        term565590 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term565591 = newInstance(Class.forName("java.util.Date"));
        Object term565593 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term565594 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term565596 = (int[]) newIntArray(6);
        setLongField(term565591, term565591.getClass(), "fastTime", 1719044610697L);
        setField(term565591, term565591.getClass(), "cdate", null);
        setField(term565590, term565590.getClass(), "transactionDate", term565591);
        setIntField(term565594, term565594.getClass(), "signum", 1);
        setIntElement(term565596, 0, 135);
        setIntElement(term565596, 1, -52033442);
        setIntElement(term565596, 2, 971988049);
        setIntElement(term565596, 3, -463021702);
        setIntElement(term565596, 4, -569899797);
        setIntElement(term565596, 5, 118855369);
        setField(term565594, term565594.getClass(), "mag", term565596);
        setIntField(term565594, term565594.getClass(), "bitCountPlusOne", 0);
        setIntField(term565594, term565594.getClass(), "bitLengthPlusOne", 0);
        setIntField(term565594, term565594.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term565594, term565594.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term565593, term565593.getClass(), "intVal", term565594);
        setIntField(term565593, term565593.getClass(), "scale", 51);
        setIntField(term565593, term565593.getClass(), "precision", 0);
        setField(term565593, term565593.getClass(), "stringCache", null);
        setLongField(term565593, term565593.getClass(), "intCompact", -9223372036854775808L);
        setField(term565590, term565590.getClass(), "amount", term565593);
        setField(term565590, term565590.getClass(), "toAddress", "BOZOuwzOXv");
        setField(term565590, term565590.getClass(), "fromAddress", "FeQMOQDSJC");
        setField(term565590, term565590.getClass(), "currency", "qpEcsAfmwm");
        setField(term565590, term565590.getClass(), "issuerAddress", "bkirFxxFur");
        setField(term565590, term565590.getClass(), "transactionType", "lOSFadXpVo");
        setField(term565590, term565590.getClass(), "ledgerIndex", term565670);
        setField(term565590, term565590.getClass(), "transactionHash", "IdUgmUtgOh");
        setField(term565590, term565590.getClass(), "resultCode", "stsLmPJmam");
        setField(term565590, term565590.getClass(), "reason", "lDjAwfcizJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RuBstopwlK";
        callMethod(klass, "transactionHash", argTypes, term565590, args);
    }

};


