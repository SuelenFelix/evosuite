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

public class FseTransaction_getTransactionType_71210046511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602305;

    public FseTransaction_getTransactionType_71210046511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term602385 = new Long(5705211845607271062L);
        term602305 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term602306 = newInstance(Class.forName("java.util.Date"));
        Object term602308 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term602309 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term602311 = (int[]) newIntArray(6);
        setLongField(term602306, term602306.getClass(), "fastTime", 1773114642439L);
        setField(term602306, term602306.getClass(), "cdate", null);
        setField(term602305, term602305.getClass(), "transactionDate", term602306);
        setIntField(term602309, term602309.getClass(), "signum", 1);
        setIntElement(term602311, 0, 19230);
        setIntElement(term602311, 1, -508503843);
        setIntElement(term602311, 2, 1140884810);
        setIntElement(term602311, 3, 695245502);
        setIntElement(term602311, 4, 1860632268);
        setIntElement(term602311, 5, 119578607);
        setField(term602309, term602309.getClass(), "mag", term602311);
        setIntField(term602309, term602309.getClass(), "bitCountPlusOne", 0);
        setIntField(term602309, term602309.getClass(), "bitLengthPlusOne", 0);
        setIntField(term602309, term602309.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term602309, term602309.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term602308, term602308.getClass(), "intVal", term602309);
        setIntField(term602308, term602308.getClass(), "scale", 53);
        setIntField(term602308, term602308.getClass(), "precision", 0);
        setField(term602308, term602308.getClass(), "stringCache", null);
        setLongField(term602308, term602308.getClass(), "intCompact", -9223372036854775808L);
        setField(term602305, term602305.getClass(), "amount", term602308);
        setField(term602305, term602305.getClass(), "toAddress", "WsgiRfUyFt");
        setField(term602305, term602305.getClass(), "fromAddress", "UeuvnYQTzK");
        setField(term602305, term602305.getClass(), "currency", "WIRsSxDEcQ");
        setField(term602305, term602305.getClass(), "issuerAddress", "gktMmpIJGy");
        setField(term602305, term602305.getClass(), "transactionType", "yEUvvkNsJL");
        setField(term602305, term602305.getClass(), "ledgerIndex", term602385);
        setField(term602305, term602305.getClass(), "transactionHash", "LeUPMkvgXk");
        setField(term602305, term602305.getClass(), "resultCode", "fiZsddQQDN");
        setField(term602305, term602305.getClass(), "reason", "qngJBSwcWS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTransactionType", argTypes, term602305, args);
    }

};


