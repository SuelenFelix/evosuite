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

public class FseTransaction_FseTransactionBuilder_toAddress_6428608433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564256;

    public FseTransaction_FseTransactionBuilder_toAddress_6428608433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term564336 = new Long(-3116269489103564104L);
        term564256 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term564257 = newInstance(Class.forName("java.util.Date"));
        Object term564259 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term564260 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term564262 = (int[]) newIntArray(6);
        setLongField(term564257, term564257.getClass(), "fastTime", 1706439441656L);
        setField(term564257, term564257.getClass(), "cdate", null);
        setField(term564256, term564256.getClass(), "transactionDate", term564257);
        setIntField(term564260, term564260.getClass(), "signum", 1);
        setIntElement(term564262, 0, 503);
        setIntElement(term564262, 1, -1435449242);
        setIntElement(term564262, 2, -643353894);
        setIntElement(term564262, 3, -633324501);
        setIntElement(term564262, 4, 1844249412);
        setIntElement(term564262, 5, 1164313579);
        setField(term564260, term564260.getClass(), "mag", term564262);
        setIntField(term564260, term564260.getClass(), "bitCountPlusOne", 0);
        setIntField(term564260, term564260.getClass(), "bitLengthPlusOne", 0);
        setIntField(term564260, term564260.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term564260, term564260.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term564259, term564259.getClass(), "intVal", term564260);
        setIntField(term564259, term564259.getClass(), "scale", 51);
        setIntField(term564259, term564259.getClass(), "precision", 0);
        setField(term564259, term564259.getClass(), "stringCache", null);
        setLongField(term564259, term564259.getClass(), "intCompact", -9223372036854775808L);
        setField(term564256, term564256.getClass(), "amount", term564259);
        setField(term564256, term564256.getClass(), "toAddress", "gNywlVTWoX");
        setField(term564256, term564256.getClass(), "fromAddress", "YurkNSyZwK");
        setField(term564256, term564256.getClass(), "currency", "nHiRqjNeSG");
        setField(term564256, term564256.getClass(), "issuerAddress", "iMKGcdwoFr");
        setField(term564256, term564256.getClass(), "transactionType", "IegHsntisv");
        setField(term564256, term564256.getClass(), "ledgerIndex", term564336);
        setField(term564256, term564256.getClass(), "transactionHash", "ayYZrbEzcd");
        setField(term564256, term564256.getClass(), "resultCode", "UUGIomkSIL");
        setField(term564256, term564256.getClass(), "reason", "wNECXXAaeY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "HmwyatxXfH";
        callMethod(klass, "toAddress", argTypes, term564256, args);
    }

};


