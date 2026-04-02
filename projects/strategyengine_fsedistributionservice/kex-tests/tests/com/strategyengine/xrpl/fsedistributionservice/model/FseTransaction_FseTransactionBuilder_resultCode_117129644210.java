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

public class FseTransaction_FseTransactionBuilder_resultCode_117129644210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565816;

    public FseTransaction_FseTransactionBuilder_resultCode_117129644210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term565896 = new Long(-1403100578084357233L);
        term565816 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term565817 = newInstance(Class.forName("java.util.Date"));
        Object term565819 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term565820 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term565822 = (int[]) newIntArray(6);
        setLongField(term565817, term565817.getClass(), "fastTime", 1607535156470L);
        setField(term565817, term565817.getClass(), "cdate", null);
        setField(term565816, term565816.getClass(), "transactionDate", term565817);
        setIntField(term565820, term565820.getClass(), "signum", 1);
        setIntElement(term565822, 0, 11530);
        setIntElement(term565822, 1, -19752134);
        setIntElement(term565822, 2, -315007366);
        setIntElement(term565822, 3, 2072257474);
        setIntElement(term565822, 4, 361292190);
        setIntElement(term565822, 5, -1272793527);
        setField(term565820, term565820.getClass(), "mag", term565822);
        setIntField(term565820, term565820.getClass(), "bitCountPlusOne", 0);
        setIntField(term565820, term565820.getClass(), "bitLengthPlusOne", 0);
        setIntField(term565820, term565820.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term565820, term565820.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term565819, term565819.getClass(), "intVal", term565820);
        setIntField(term565819, term565819.getClass(), "scale", 53);
        setIntField(term565819, term565819.getClass(), "precision", 0);
        setField(term565819, term565819.getClass(), "stringCache", null);
        setLongField(term565819, term565819.getClass(), "intCompact", -9223372036854775808L);
        setField(term565816, term565816.getClass(), "amount", term565819);
        setField(term565816, term565816.getClass(), "toAddress", "cqJKvoyWgQ");
        setField(term565816, term565816.getClass(), "fromAddress", "xyptaaXbVH");
        setField(term565816, term565816.getClass(), "currency", "eoCqwPrMUZ");
        setField(term565816, term565816.getClass(), "issuerAddress", "MwsrXwgDaj");
        setField(term565816, term565816.getClass(), "transactionType", "sIqQcJerOj");
        setField(term565816, term565816.getClass(), "ledgerIndex", term565896);
        setField(term565816, term565816.getClass(), "transactionHash", "RBAiZRRtZi");
        setField(term565816, term565816.getClass(), "resultCode", "kKupIWONuC");
        setField(term565816, term565816.getClass(), "reason", "FKrOhKRrun");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vZwGfsmNQs";
        callMethod(klass, "resultCode", argTypes, term565816, args);
    }

};


