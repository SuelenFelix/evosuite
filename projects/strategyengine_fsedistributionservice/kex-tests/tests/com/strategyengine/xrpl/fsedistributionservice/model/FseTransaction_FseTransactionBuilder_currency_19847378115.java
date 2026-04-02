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

public class FseTransaction_FseTransactionBuilder_currency_19847378115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564706;

    public FseTransaction_FseTransactionBuilder_currency_19847378115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term564786 = new Long(-5557521111022569289L);
        term564706 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term564707 = newInstance(Class.forName("java.util.Date"));
        Object term564709 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term564710 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term564712 = (int[]) newIntArray(6);
        setLongField(term564707, term564707.getClass(), "fastTime", 1841494229089L);
        setField(term564707, term564707.getClass(), "cdate", null);
        setField(term564706, term564706.getClass(), "transactionDate", term564707);
        setIntField(term564710, term564710.getClass(), "signum", 1);
        setIntElement(term564712, 0, 40950);
        setIntElement(term564712, 1, 432804475);
        setIntElement(term564712, 2, 829548913);
        setIntElement(term564712, 3, -909343786);
        setIntElement(term564712, 4, 146380284);
        setIntElement(term564712, 5, -462703463);
        setField(term564710, term564710.getClass(), "mag", term564712);
        setIntField(term564710, term564710.getClass(), "bitCountPlusOne", 0);
        setIntField(term564710, term564710.getClass(), "bitLengthPlusOne", 0);
        setIntField(term564710, term564710.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term564710, term564710.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term564709, term564709.getClass(), "intVal", term564710);
        setIntField(term564709, term564709.getClass(), "scale", 53);
        setIntField(term564709, term564709.getClass(), "precision", 0);
        setField(term564709, term564709.getClass(), "stringCache", null);
        setLongField(term564709, term564709.getClass(), "intCompact", -9223372036854775808L);
        setField(term564706, term564706.getClass(), "amount", term564709);
        setField(term564706, term564706.getClass(), "toAddress", "xYtFJCbsbO");
        setField(term564706, term564706.getClass(), "fromAddress", "ZPCvymeQVU");
        setField(term564706, term564706.getClass(), "currency", "sLCvnzKIFo");
        setField(term564706, term564706.getClass(), "issuerAddress", "goGIsaCumE");
        setField(term564706, term564706.getClass(), "transactionType", "GiVMlvuShR");
        setField(term564706, term564706.getClass(), "ledgerIndex", term564786);
        setField(term564706, term564706.getClass(), "transactionHash", "ZPGcWKWutp");
        setField(term564706, term564706.getClass(), "resultCode", "gFgcyNetpo");
        setField(term564706, term564706.getClass(), "reason", "hHOpAcIbrX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tTVkENlDIG";
        callMethod(klass, "currency", argTypes, term564706, args);
    }

};


