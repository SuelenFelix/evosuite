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

public class TopUpRequest_getSettlementAccount_18034129552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;

    public TopUpRequest_getSettlementAccount_18034129552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest"));
        Object term218 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term219 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term221 = (int[]) newIntArray(6);
        setField(term181, term181.getClass(), "currency", "SzjVpOQTyS");
        setField(term181, term181.getClass(), "topUpAccount", "MjGYSRKTNF");
        setField(term181, term181.getClass(), "settlementAccount", "hRNSzYYIrc");
        setIntField(term219, term219.getClass(), "signum", 1);
        setIntElement(term221, 0, 3779);
        setIntElement(term221, 1, 1825499203);
        setIntElement(term221, 2, 189827582);
        setIntElement(term221, 3, 731025545);
        setIntElement(term221, 4, -475097163);
        setIntElement(term221, 5, 890127363);
        setField(term219, term219.getClass(), "mag", term221);
        setIntField(term219, term219.getClass(), "bitCountPlusOne", 0);
        setIntField(term219, term219.getClass(), "bitLengthPlusOne", 0);
        setIntField(term219, term219.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term219, term219.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term218, term218.getClass(), "intVal", term219);
        setIntField(term218, term218.getClass(), "scale", 52);
        setIntField(term218, term218.getClass(), "precision", 0);
        setField(term218, term218.getClass(), "stringCache", null);
        setLongField(term218, term218.getClass(), "intCompact", -9223372036854775808L);
        setField(term181, term181.getClass(), "amount", term218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSettlementAccount", argTypes, term181, args);
    }

};


