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

public class FseTransaction_FseTransactionBuilder_transactionDate_16265914551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563823;
     Object term563941;

    public FseTransaction_FseTransactionBuilder_transactionDate_16265914551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term563903 = new Long(9070668522488722105L);
        term563823 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term563824 = newInstance(Class.forName("java.util.Date"));
        Object term563826 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term563827 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term563829 = (int[]) newIntArray(6);
        setLongField(term563824, term563824.getClass(), "fastTime", 1299736103383L);
        setField(term563824, term563824.getClass(), "cdate", null);
        setField(term563823, term563823.getClass(), "transactionDate", term563824);
        setIntField(term563827, term563827.getClass(), "signum", 1);
        setIntElement(term563829, 0, 7);
        setIntElement(term563829, 1, -829859144);
        setIntElement(term563829, 2, 1620434072);
        setIntElement(term563829, 3, -1570372859);
        setIntElement(term563829, 4, 591465212);
        setIntElement(term563829, 5, 786035345);
        setField(term563827, term563827.getClass(), "mag", term563829);
        setIntField(term563827, term563827.getClass(), "bitCountPlusOne", 0);
        setIntField(term563827, term563827.getClass(), "bitLengthPlusOne", 0);
        setIntField(term563827, term563827.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term563827, term563827.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term563826, term563826.getClass(), "intVal", term563827);
        setIntField(term563826, term563826.getClass(), "scale", 52);
        setIntField(term563826, term563826.getClass(), "precision", 0);
        setField(term563826, term563826.getClass(), "stringCache", null);
        setLongField(term563826, term563826.getClass(), "intCompact", -9223372036854775808L);
        setField(term563823, term563823.getClass(), "amount", term563826);
        setField(term563823, term563823.getClass(), "toAddress", "iyKXXnfbdP");
        setField(term563823, term563823.getClass(), "fromAddress", "GrnLzQSLgP");
        setField(term563823, term563823.getClass(), "currency", "rSNlwQrRPz");
        setField(term563823, term563823.getClass(), "issuerAddress", "xKEzbRMPpP");
        setField(term563823, term563823.getClass(), "transactionType", "mxNOSqFuhi");
        setField(term563823, term563823.getClass(), "ledgerIndex", term563903);
        setField(term563823, term563823.getClass(), "transactionHash", "PAZrXfKSSy");
        setField(term563823, term563823.getClass(), "resultCode", "tsZmZiLwvf");
        setField(term563823, term563823.getClass(), "reason", "PcMXaJAFsa");
        term563941 = newInstance(Class.forName("java.util.Date"));
        setLongField(term563941, term563941.getClass(), "fastTime", 1396365178799L);
        setField(term563941, term563941.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term563941;
        callMethod(klass, "transactionDate", argTypes, term563823, args);
    }

};


