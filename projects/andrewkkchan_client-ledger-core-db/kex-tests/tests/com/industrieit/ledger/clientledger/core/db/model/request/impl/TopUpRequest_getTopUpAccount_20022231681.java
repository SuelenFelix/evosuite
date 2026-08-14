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

public class TopUpRequest_getTopUpAccount_20022231681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91;

    public TopUpRequest_getTopUpAccount_20022231681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest"));
        Object term128 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term129 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term131 = (int[]) newIntArray(6);
        setField(term91, term91.getClass(), "currency", "xxtlPwDYFs");
        setField(term91, term91.getClass(), "topUpAccount", "jJCZpVmanW");
        setField(term91, term91.getClass(), "settlementAccount", "EGtDIRbSSb");
        setIntField(term129, term129.getClass(), "signum", 1);
        setIntElement(term131, 0, 2364);
        setIntElement(term131, 1, -1446584625);
        setIntElement(term131, 2, 1957600567);
        setIntElement(term131, 3, -336418707);
        setIntElement(term131, 4, -1905211145);
        setIntElement(term131, 5, 86968353);
        setField(term129, term129.getClass(), "mag", term131);
        setIntField(term129, term129.getClass(), "bitCountPlusOne", 0);
        setIntField(term129, term129.getClass(), "bitLengthPlusOne", 0);
        setIntField(term129, term129.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term129, term129.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term128, term128.getClass(), "intVal", term129);
        setIntField(term128, term128.getClass(), "scale", 52);
        setIntField(term128, term128.getClass(), "precision", 0);
        setField(term128, term128.getClass(), "stringCache", null);
        setLongField(term128, term128.getClass(), "intCompact", -9223372036854775808L);
        setField(term91, term91.getClass(), "amount", term128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTopUpAccount", argTypes, term91, args);
    }

};


