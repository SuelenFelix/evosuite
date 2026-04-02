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

public class FseTransaction_hashCode_9833706513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600673;

    public FseTransaction_hashCode_9833706513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term600753 = new Long(7536418221491626978L);
        term600673 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term600674 = newInstance(Class.forName("java.util.Date"));
        Object term600676 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term600677 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term600679 = (int[]) newIntArray(6);
        setLongField(term600674, term600674.getClass(), "fastTime", 1647631003197L);
        setField(term600674, term600674.getClass(), "cdate", null);
        setField(term600673, term600673.getClass(), "transactionDate", term600674);
        setIntField(term600677, term600677.getClass(), "signum", 1);
        setIntElement(term600679, 0, 16975);
        setIntElement(term600679, 1, -343091361);
        setIntElement(term600679, 2, -43364877);
        setIntElement(term600679, 3, 1881660174);
        setIntElement(term600679, 4, -1406132039);
        setIntElement(term600679, 5, -1131564671);
        setField(term600677, term600677.getClass(), "mag", term600679);
        setIntField(term600677, term600677.getClass(), "bitCountPlusOne", 0);
        setIntField(term600677, term600677.getClass(), "bitLengthPlusOne", 0);
        setIntField(term600677, term600677.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term600677, term600677.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term600676, term600676.getClass(), "intVal", term600677);
        setIntField(term600676, term600676.getClass(), "scale", 53);
        setIntField(term600676, term600676.getClass(), "precision", 0);
        setField(term600676, term600676.getClass(), "stringCache", null);
        setLongField(term600676, term600676.getClass(), "intCompact", -9223372036854775808L);
        setField(term600673, term600673.getClass(), "amount", term600676);
        setField(term600673, term600673.getClass(), "toAddress", "CldhEgXvQf");
        setField(term600673, term600673.getClass(), "fromAddress", "WgctHDcsib");
        setField(term600673, term600673.getClass(), "currency", "gIhnDwhYPA");
        setField(term600673, term600673.getClass(), "issuerAddress", "CHKxCaDYeL");
        setField(term600673, term600673.getClass(), "transactionType", "pltMgQSnCb");
        setField(term600673, term600673.getClass(), "ledgerIndex", term600753);
        setField(term600673, term600673.getClass(), "transactionHash", "RiGoJoBvZO");
        setField(term600673, term600673.getClass(), "resultCode", "xjNArFEvAJ");
        setField(term600673, term600673.getClass(), "reason", "cNAlXBcuBR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term600673, args);
    }

};


