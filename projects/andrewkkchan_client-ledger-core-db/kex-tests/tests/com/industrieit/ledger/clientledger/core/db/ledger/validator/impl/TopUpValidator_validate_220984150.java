package com.industrieit.ledger.clientledger.core.db.ledger.validator.impl;

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
import static com.industrieit.ledger.clientledger.core.db.ledger.validator.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TopUpValidator_validate_220984150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216;

    public TopUpValidator_validate_220984150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest"));
        Object term253 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term254 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term256 = (int[]) newIntArray(6);
        setField(term216, term216.getClass(), "currency", "MjGYSRKTNF");
        setField(term216, term216.getClass(), "topUpAccount", "hRNSzYYIrc");
        setField(term216, term216.getClass(), "settlementAccount", "RMFIsYGgne");
        setIntField(term254, term254.getClass(), "signum", 1);
        setIntElement(term256, 0, 3726);
        setIntElement(term256, 1, 1561510548);
        setIntElement(term256, 2, 756973629);
        setIntElement(term256, 3, -1169068666);
        setIntElement(term256, 4, -1772498162);
        setIntElement(term256, 5, -1207241473);
        setField(term254, term254.getClass(), "mag", term256);
        setIntField(term254, term254.getClass(), "bitCountPlusOne", 0);
        setIntField(term254, term254.getClass(), "bitLengthPlusOne", 0);
        setIntField(term254, term254.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term254, term254.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term253, term253.getClass(), "intVal", term254);
        setIntField(term253, term253.getClass(), "scale", 52);
        setIntField(term253, term253.getClass(), "precision", 0);
        setField(term253, term253.getClass(), "stringCache", null);
        setLongField(term253, term253.getClass(), "intCompact", -9223372036854775808L);
        setField(term216, term216.getClass(), "amount", term253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.ledger.validator.impl.TopUpValidator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest");
        Object[] args = new Object[2];
        args[0] = "SzjVpOQTyS";
        args[1] = term216;
        callMethod(klass, "validate", argTypes, null, args);
    }

};


