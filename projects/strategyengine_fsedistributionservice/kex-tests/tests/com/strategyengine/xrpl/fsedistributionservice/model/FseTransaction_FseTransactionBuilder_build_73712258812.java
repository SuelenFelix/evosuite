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

public class FseTransaction_FseTransactionBuilder_build_73712258812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566268;

    public FseTransaction_FseTransactionBuilder_build_73712258812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term566348 = new Long(1801020535033823321L);
        term566268 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term566269 = newInstance(Class.forName("java.util.Date"));
        Object term566271 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term566272 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term566274 = (int[]) newIntArray(6);
        setLongField(term566269, term566269.getClass(), "fastTime", 1270065014189L);
        setField(term566269, term566269.getClass(), "cdate", null);
        setField(term566268, term566268.getClass(), "transactionDate", term566269);
        setIntField(term566272, term566272.getClass(), "signum", 1);
        setIntElement(term566274, 0, 6902);
        setIntElement(term566274, 1, 223239890);
        setIntElement(term566274, 2, 1752174217);
        setIntElement(term566274, 3, 128008369);
        setIntElement(term566274, 4, -1600442410);
        setIntElement(term566274, 5, 2077988461);
        setField(term566272, term566272.getClass(), "mag", term566274);
        setIntField(term566272, term566272.getClass(), "bitCountPlusOne", 0);
        setIntField(term566272, term566272.getClass(), "bitLengthPlusOne", 0);
        setIntField(term566272, term566272.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term566272, term566272.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term566271, term566271.getClass(), "intVal", term566272);
        setIntField(term566271, term566271.getClass(), "scale", 53);
        setIntField(term566271, term566271.getClass(), "precision", 0);
        setField(term566271, term566271.getClass(), "stringCache", null);
        setLongField(term566271, term566271.getClass(), "intCompact", -9223372036854775808L);
        setField(term566268, term566268.getClass(), "amount", term566271);
        setField(term566268, term566268.getClass(), "toAddress", "NgJJQVugOQ");
        setField(term566268, term566268.getClass(), "fromAddress", "yavShYfpzp");
        setField(term566268, term566268.getClass(), "currency", "wMZoTYqRWV");
        setField(term566268, term566268.getClass(), "issuerAddress", "IPZjpMvLsa");
        setField(term566268, term566268.getClass(), "transactionType", "MOtWhQGbIj");
        setField(term566268, term566268.getClass(), "ledgerIndex", term566348);
        setField(term566268, term566268.getClass(), "transactionHash", "VdjPvREeyI");
        setField(term566268, term566268.getClass(), "resultCode", "nNqIIVCGzo");
        setField(term566268, term566268.getClass(), "reason", "nWaFLoaXIX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term566268, args);
    }

};


