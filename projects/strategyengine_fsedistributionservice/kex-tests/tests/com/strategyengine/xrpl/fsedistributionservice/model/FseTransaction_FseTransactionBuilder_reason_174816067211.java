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

public class FseTransaction_FseTransactionBuilder_reason_174816067211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566042;

    public FseTransaction_FseTransactionBuilder_reason_174816067211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term566122 = new Long(-5878958370799790472L);
        term566042 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term566043 = newInstance(Class.forName("java.util.Date"));
        Object term566045 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term566046 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term566048 = (int[]) newIntArray(6);
        setLongField(term566043, term566043.getClass(), "fastTime", 1817715247718L);
        setField(term566043, term566043.getClass(), "cdate", null);
        setField(term566042, term566042.getClass(), "transactionDate", term566043);
        setIntField(term566046, term566046.getClass(), "signum", 1);
        setIntElement(term566048, 0, 139);
        setIntElement(term566048, 1, 781374589);
        setIntElement(term566048, 2, 793202055);
        setIntElement(term566048, 3, -616345974);
        setIntElement(term566048, 4, 520616883);
        setIntElement(term566048, 5, -897303369);
        setField(term566046, term566046.getClass(), "mag", term566048);
        setIntField(term566046, term566046.getClass(), "bitCountPlusOne", 0);
        setIntField(term566046, term566046.getClass(), "bitLengthPlusOne", 0);
        setIntField(term566046, term566046.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term566046, term566046.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term566045, term566045.getClass(), "intVal", term566046);
        setIntField(term566045, term566045.getClass(), "scale", 51);
        setIntField(term566045, term566045.getClass(), "precision", 0);
        setField(term566045, term566045.getClass(), "stringCache", null);
        setLongField(term566045, term566045.getClass(), "intCompact", -9223372036854775808L);
        setField(term566042, term566042.getClass(), "amount", term566045);
        setField(term566042, term566042.getClass(), "toAddress", "vhETuHWQWg");
        setField(term566042, term566042.getClass(), "fromAddress", "dzcsjKTHpQ");
        setField(term566042, term566042.getClass(), "currency", "nkYFOngZAC");
        setField(term566042, term566042.getClass(), "issuerAddress", "dWlFYgFiIc");
        setField(term566042, term566042.getClass(), "transactionType", "noKFXgekjv");
        setField(term566042, term566042.getClass(), "ledgerIndex", term566122);
        setField(term566042, term566042.getClass(), "transactionHash", "DDVjHRnQxN");
        setField(term566042, term566042.getClass(), "resultCode", "cPwsHWZyan");
        setField(term566042, term566042.getClass(), "reason", "sVJDEsxIBv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wCkJXDKrUp";
        callMethod(klass, "reason", argTypes, term566042, args);
    }

};


