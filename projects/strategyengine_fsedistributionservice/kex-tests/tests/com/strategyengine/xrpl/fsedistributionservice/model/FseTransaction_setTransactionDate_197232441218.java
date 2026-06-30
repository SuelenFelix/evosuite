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

public class FseTransaction_setTransactionDate_197232441218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603528;
     Object term603646;

    public FseTransaction_setTransactionDate_197232441218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term603608 = new Long(4554910377138538493L);
        term603528 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term603529 = newInstance(Class.forName("java.util.Date"));
        Object term603531 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term603532 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term603534 = (int[]) newIntArray(6);
        setLongField(term603529, term603529.getClass(), "fastTime", 1518686364971L);
        setField(term603529, term603529.getClass(), "cdate", null);
        setField(term603528, term603528.getClass(), "transactionDate", term603529);
        setIntField(term603532, term603532.getClass(), "signum", 1);
        setIntElement(term603534, 0, 29676);
        setIntElement(term603534, 1, -929086921);
        setIntElement(term603534, 2, 371249424);
        setIntElement(term603534, 3, -647321170);
        setIntElement(term603534, 4, 57635581);
        setIntElement(term603534, 5, -1122857253);
        setField(term603532, term603532.getClass(), "mag", term603534);
        setIntField(term603532, term603532.getClass(), "bitCountPlusOne", 0);
        setIntField(term603532, term603532.getClass(), "bitLengthPlusOne", 0);
        setIntField(term603532, term603532.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term603532, term603532.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term603531, term603531.getClass(), "intVal", term603532);
        setIntField(term603531, term603531.getClass(), "scale", 53);
        setIntField(term603531, term603531.getClass(), "precision", 0);
        setField(term603531, term603531.getClass(), "stringCache", null);
        setLongField(term603531, term603531.getClass(), "intCompact", -9223372036854775808L);
        setField(term603528, term603528.getClass(), "amount", term603531);
        setField(term603528, term603528.getClass(), "toAddress", "gJQaBkFONi");
        setField(term603528, term603528.getClass(), "fromAddress", "hvCurjbKKA");
        setField(term603528, term603528.getClass(), "currency", "KPDBuTWYxh");
        setField(term603528, term603528.getClass(), "issuerAddress", "hHasDCgpXm");
        setField(term603528, term603528.getClass(), "transactionType", "YIGgyxbBJX");
        setField(term603528, term603528.getClass(), "ledgerIndex", term603608);
        setField(term603528, term603528.getClass(), "transactionHash", "yXWvbiyfBN");
        setField(term603528, term603528.getClass(), "resultCode", "pzjAIwjtmM");
        setField(term603528, term603528.getClass(), "reason", "PPTHZyWzja");
        term603646 = newInstance(Class.forName("java.util.Date"));
        setLongField(term603646, term603646.getClass(), "fastTime", 1601953124012L);
        setField(term603646, term603646.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term603646;
        callMethod(klass, "setTransactionDate", argTypes, term603528, args);
    }

};


