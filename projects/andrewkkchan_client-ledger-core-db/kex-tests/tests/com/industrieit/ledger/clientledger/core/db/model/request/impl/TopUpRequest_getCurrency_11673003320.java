package com.industrieit.ledger.clientledger.core.db.model.request.impl;

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
import static com.industrieit.ledger.clientledger.core.db.model.request.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TopUpRequest_getCurrency_11673003320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TopUpRequest_getCurrency_11673003320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest"));
        Object term38 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term39 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term41 = (int[]) newIntArray(6);
        setField(term1, term1.getClass(), "currency", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "topUpAccount", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "settlementAccount", "MuLcgQHgqz");
        setIntField(term39, term39.getClass(), "signum", 1);
        setIntElement(term41, 0, 9058);
        setIntElement(term41, 1, 1365043541);
        setIntElement(term41, 2, 1239861896);
        setIntElement(term41, 3, -1338148297);
        setIntElement(term41, 4, -418263970);
        setIntElement(term41, 5, -265097411);
        setField(term39, term39.getClass(), "mag", term41);
        setIntField(term39, term39.getClass(), "bitCountPlusOne", 0);
        setIntField(term39, term39.getClass(), "bitLengthPlusOne", 0);
        setIntField(term39, term39.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term39, term39.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term38, term38.getClass(), "intVal", term39);
        setIntField(term38, term38.getClass(), "scale", 53);
        setIntField(term38, term38.getClass(), "precision", 0);
        setField(term38, term38.getClass(), "stringCache", null);
        setLongField(term38, term38.getClass(), "intCompact", -9223372036854775808L);
        setField(term1, term1.getClass(), "amount", term38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term1, args);
    }

};


