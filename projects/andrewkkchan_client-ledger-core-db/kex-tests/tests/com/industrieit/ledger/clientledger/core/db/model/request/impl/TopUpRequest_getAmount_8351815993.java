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

public class TopUpRequest_getAmount_8351815993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;

    public TopUpRequest_getAmount_8351815993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest"));
        Object term308 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term309 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term311 = (int[]) newIntArray(6);
        setField(term271, term271.getClass(), "currency", "RMFIsYGgne");
        setField(term271, term271.getClass(), "topUpAccount", "NRdvgJlhkX");
        setField(term271, term271.getClass(), "settlementAccount", "uuaPigETmJ");
        setIntField(term309, term309.getClass(), "signum", 1);
        setIntElement(term311, 0, 3726);
        setIntElement(term311, 1, 1561510548);
        setIntElement(term311, 2, 756973629);
        setIntElement(term311, 3, -1169068666);
        setIntElement(term311, 4, -1772498162);
        setIntElement(term311, 5, -1207241473);
        setField(term309, term309.getClass(), "mag", term311);
        setIntField(term309, term309.getClass(), "bitCountPlusOne", 0);
        setIntField(term309, term309.getClass(), "bitLengthPlusOne", 0);
        setIntField(term309, term309.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term309, term309.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term308, term308.getClass(), "intVal", term309);
        setIntField(term308, term308.getClass(), "scale", 52);
        setIntField(term308, term308.getClass(), "precision", 0);
        setField(term308, term308.getClass(), "stringCache", null);
        setLongField(term308, term308.getClass(), "intCompact", -9223372036854775808L);
        setField(term271, term271.getClass(), "amount", term308);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term271, args);
    }

};


