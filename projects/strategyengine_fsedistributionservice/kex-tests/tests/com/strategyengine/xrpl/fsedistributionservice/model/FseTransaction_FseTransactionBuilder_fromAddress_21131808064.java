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

public class FseTransaction_FseTransactionBuilder_fromAddress_21131808064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564482;

    public FseTransaction_FseTransactionBuilder_fromAddress_21131808064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term564561 = new Long(8240231262183296861L);
        term564482 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term564483 = newInstance(Class.forName("java.util.Date"));
        Object term564485 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term564486 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term564488 = (int[]) newIntArray(5);
        setLongField(term564483, term564483.getClass(), "fastTime", 1401437812594L);
        setField(term564483, term564483.getClass(), "cdate", null);
        setField(term564482, term564482.getClass(), "transactionDate", term564483);
        setIntField(term564486, term564486.getClass(), "signum", 1);
        setIntElement(term564488, 0, 1664595803);
        setIntElement(term564488, 1, 403872211);
        setIntElement(term564488, 2, -2034612604);
        setIntElement(term564488, 3, 767965502);
        setIntElement(term564488, 4, -762463599);
        setField(term564486, term564486.getClass(), "mag", term564488);
        setIntField(term564486, term564486.getClass(), "bitCountPlusOne", 0);
        setIntField(term564486, term564486.getClass(), "bitLengthPlusOne", 0);
        setIntField(term564486, term564486.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term564486, term564486.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term564485, term564485.getClass(), "intVal", term564486);
        setIntField(term564485, term564485.getClass(), "scale", 49);
        setIntField(term564485, term564485.getClass(), "precision", 0);
        setField(term564485, term564485.getClass(), "stringCache", null);
        setLongField(term564485, term564485.getClass(), "intCompact", -9223372036854775808L);
        setField(term564482, term564482.getClass(), "amount", term564485);
        setField(term564482, term564482.getClass(), "toAddress", "kCzNtZKBxJ");
        setField(term564482, term564482.getClass(), "fromAddress", "TZvkoSdfcy");
        setField(term564482, term564482.getClass(), "currency", "AQLfRkbDCq");
        setField(term564482, term564482.getClass(), "issuerAddress", "psEjMhzuKg");
        setField(term564482, term564482.getClass(), "transactionType", "gPwMKIBKVa");
        setField(term564482, term564482.getClass(), "ledgerIndex", term564561);
        setField(term564482, term564482.getClass(), "transactionHash", "KPgCBUCwkT");
        setField(term564482, term564482.getClass(), "resultCode", "oIuYGsJcJK");
        setField(term564482, term564482.getClass(), "reason", "zekWayuKWe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ECrlgCZHjb";
        callMethod(klass, "fromAddress", argTypes, term564482, args);
    }

};


