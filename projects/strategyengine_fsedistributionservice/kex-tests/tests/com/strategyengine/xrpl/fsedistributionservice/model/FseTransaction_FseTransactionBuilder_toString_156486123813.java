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

public class FseTransaction_FseTransactionBuilder_toString_156486123813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566472;

    public FseTransaction_FseTransactionBuilder_toString_156486123813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term566552 = new Long(7022012163884672746L);
        term566472 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term566473 = newInstance(Class.forName("java.util.Date"));
        Object term566475 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term566476 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term566478 = (int[]) newIntArray(6);
        setLongField(term566473, term566473.getClass(), "fastTime", 1720509419854L);
        setField(term566473, term566473.getClass(), "cdate", null);
        setField(term566472, term566472.getClass(), "transactionDate", term566473);
        setIntField(term566476, term566476.getClass(), "signum", 1);
        setIntElement(term566478, 0, 4076);
        setIntElement(term566478, 1, 1620046237);
        setIntElement(term566478, 2, -1583102373);
        setIntElement(term566478, 3, 2025688270);
        setIntElement(term566478, 4, 491008207);
        setIntElement(term566478, 5, 76478907);
        setField(term566476, term566476.getClass(), "mag", term566478);
        setIntField(term566476, term566476.getClass(), "bitCountPlusOne", 0);
        setIntField(term566476, term566476.getClass(), "bitLengthPlusOne", 0);
        setIntField(term566476, term566476.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term566476, term566476.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term566475, term566475.getClass(), "intVal", term566476);
        setIntField(term566475, term566475.getClass(), "scale", 52);
        setIntField(term566475, term566475.getClass(), "precision", 0);
        setField(term566475, term566475.getClass(), "stringCache", null);
        setLongField(term566475, term566475.getClass(), "intCompact", -9223372036854775808L);
        setField(term566472, term566472.getClass(), "amount", term566475);
        setField(term566472, term566472.getClass(), "toAddress", "DmaQuEDBEG");
        setField(term566472, term566472.getClass(), "fromAddress", "aaNzgFeDgm");
        setField(term566472, term566472.getClass(), "currency", "ytiHcLzHGW");
        setField(term566472, term566472.getClass(), "issuerAddress", "rmCPjphyKc");
        setField(term566472, term566472.getClass(), "transactionType", "utbzEJyvkT");
        setField(term566472, term566472.getClass(), "ledgerIndex", term566552);
        setField(term566472, term566472.getClass(), "transactionHash", "EGuWNBnXmf");
        setField(term566472, term566472.getClass(), "resultCode", "ZLrfDlvNrO");
        setField(term566472, term566472.getClass(), "reason", "qyHVBwYBiI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term566472, args);
    }

};


