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

public class FseTransaction_FseTransactionBuilder_issuerAddress_1372829856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564932;

    public FseTransaction_FseTransactionBuilder_issuerAddress_1372829856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term565012 = new Long(508795580601675574L);
        term564932 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term564933 = newInstance(Class.forName("java.util.Date"));
        Object term564935 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term564936 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term564938 = (int[]) newIntArray(6);
        setLongField(term564933, term564933.getClass(), "fastTime", 1792016200915L);
        setField(term564933, term564933.getClass(), "cdate", null);
        setField(term564932, term564932.getClass(), "transactionDate", term564933);
        setIntField(term564936, term564936.getClass(), "signum", 1);
        setIntElement(term564938, 0, 3221);
        setIntElement(term564938, 1, 1960729726);
        setIntElement(term564938, 2, 821600379);
        setIntElement(term564938, 3, 819896198);
        setIntElement(term564938, 4, 1472488157);
        setIntElement(term564938, 5, -549940207);
        setField(term564936, term564936.getClass(), "mag", term564938);
        setIntField(term564936, term564936.getClass(), "bitCountPlusOne", 0);
        setIntField(term564936, term564936.getClass(), "bitLengthPlusOne", 0);
        setIntField(term564936, term564936.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term564936, term564936.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term564935, term564935.getClass(), "intVal", term564936);
        setIntField(term564935, term564935.getClass(), "scale", 53);
        setIntField(term564935, term564935.getClass(), "precision", 0);
        setField(term564935, term564935.getClass(), "stringCache", null);
        setLongField(term564935, term564935.getClass(), "intCompact", -9223372036854775808L);
        setField(term564932, term564932.getClass(), "amount", term564935);
        setField(term564932, term564932.getClass(), "toAddress", "FvTMHvjoRU");
        setField(term564932, term564932.getClass(), "fromAddress", "EJpmCzuBBK");
        setField(term564932, term564932.getClass(), "currency", "yIrQZlXeDl");
        setField(term564932, term564932.getClass(), "issuerAddress", "IXSfYobkAg");
        setField(term564932, term564932.getClass(), "transactionType", "TpYMxcIQzy");
        setField(term564932, term564932.getClass(), "ledgerIndex", term565012);
        setField(term564932, term564932.getClass(), "transactionHash", "ywfCzJJUCY");
        setField(term564932, term564932.getClass(), "resultCode", "TsARcdrqyk");
        setField(term564932, term564932.getClass(), "reason", "wreFfKvmjb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LLTyGZZqRf";
        callMethod(klass, "issuerAddress", argTypes, term564932, args);
    }

};


