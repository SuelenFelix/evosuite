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

public class FseTransaction_FseTransactionBuilder_amount_13835124662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564029;
     Object term564147;

    public FseTransaction_FseTransactionBuilder_amount_13835124662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term564109 = new Long(1784073150606702821L);
        term564029 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term564030 = newInstance(Class.forName("java.util.Date"));
        Object term564032 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term564033 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term564035 = (int[]) newIntArray(6);
        setLongField(term564030, term564030.getClass(), "fastTime", 1799507332089L);
        setField(term564030, term564030.getClass(), "cdate", null);
        setField(term564029, term564029.getClass(), "transactionDate", term564030);
        setIntField(term564033, term564033.getClass(), "signum", 1);
        setIntElement(term564035, 0, 3555);
        setIntElement(term564035, 1, 630866062);
        setIntElement(term564035, 2, 508551341);
        setIntElement(term564035, 3, 1442339847);
        setIntElement(term564035, 4, -535674981);
        setIntElement(term564035, 5, 1983074855);
        setField(term564033, term564033.getClass(), "mag", term564035);
        setIntField(term564033, term564033.getClass(), "bitCountPlusOne", 0);
        setIntField(term564033, term564033.getClass(), "bitLengthPlusOne", 0);
        setIntField(term564033, term564033.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term564033, term564033.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term564032, term564032.getClass(), "intVal", term564033);
        setIntField(term564032, term564032.getClass(), "scale", 52);
        setIntField(term564032, term564032.getClass(), "precision", 0);
        setField(term564032, term564032.getClass(), "stringCache", null);
        setLongField(term564032, term564032.getClass(), "intCompact", -9223372036854775808L);
        setField(term564029, term564029.getClass(), "amount", term564032);
        setField(term564029, term564029.getClass(), "toAddress", "prPCXDaclm");
        setField(term564029, term564029.getClass(), "fromAddress", "HpYrZqtpjz");
        setField(term564029, term564029.getClass(), "currency", "dHWPzCnTgu");
        setField(term564029, term564029.getClass(), "issuerAddress", "ZsLVOMoUYo");
        setField(term564029, term564029.getClass(), "transactionType", "TwUxYxbDNT");
        setField(term564029, term564029.getClass(), "ledgerIndex", term564109);
        setField(term564029, term564029.getClass(), "transactionHash", "GTMmkmtsqp");
        setField(term564029, term564029.getClass(), "resultCode", "kbGYeAFzCC");
        setField(term564029, term564029.getClass(), "reason", "IXQAKAMGZv");
        term564147 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term564148 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term564150 = (int[]) newIntArray(6);
        setIntField(term564148, term564148.getClass(), "signum", 1);
        setIntElement(term564150, 0, 44702);
        setIntElement(term564150, 1, -1670077580);
        setIntElement(term564150, 2, 295071290);
        setIntElement(term564150, 3, -593188655);
        setIntElement(term564150, 4, 432561569);
        setIntElement(term564150, 5, 1686475007);
        setField(term564148, term564148.getClass(), "mag", term564150);
        setIntField(term564148, term564148.getClass(), "bitCountPlusOne", 0);
        setIntField(term564148, term564148.getClass(), "bitLengthPlusOne", 0);
        setIntField(term564148, term564148.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term564148, term564148.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term564147, term564147.getClass(), "intVal", term564148);
        setIntField(term564147, term564147.getClass(), "scale", 53);
        setIntField(term564147, term564147.getClass(), "precision", 0);
        setField(term564147, term564147.getClass(), "stringCache", null);
        setLongField(term564147, term564147.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term564147;
        callMethod(klass, "amount", argTypes, term564029, args);
    }

};


