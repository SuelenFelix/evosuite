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

public class P2PRequest_getCurrency_18795547985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1354;

    public P2PRequest_getCurrency_18795547985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1354 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term1415 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1416 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1418 = (int[]) newIntArray(6);
        Object term1432 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1433 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1435 = (int[]) newIntArray(6);
        Object term1449 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1450 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1452 = (int[]) newIntArray(6);
        setField(term1354, term1354.getClass(), "currency", "wSQxaModmm");
        setField(term1354, term1354.getClass(), "fromCustomerAccount", "UlajhuVLaP");
        setField(term1354, term1354.getClass(), "toCustomerAccount", "gGSMzuGICf");
        setField(term1354, term1354.getClass(), "feeAccount", "hxCBltsObl");
        setField(term1354, term1354.getClass(), "taxAccount", "BndsHwAFMv");
        setIntField(term1416, term1416.getClass(), "signum", 1);
        setIntElement(term1418, 0, 31263);
        setIntElement(term1418, 1, -1965314916);
        setIntElement(term1418, 2, -443046697);
        setIntElement(term1418, 3, -1268253260);
        setIntElement(term1418, 4, -877110081);
        setIntElement(term1418, 5, -1376525969);
        setField(term1416, term1416.getClass(), "mag", term1418);
        setIntField(term1416, term1416.getClass(), "bitCountPlusOne", 0);
        setIntField(term1416, term1416.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1416, term1416.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1416, term1416.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1415, term1415.getClass(), "intVal", term1416);
        setIntField(term1415, term1415.getClass(), "scale", 53);
        setIntField(term1415, term1415.getClass(), "precision", 0);
        setField(term1415, term1415.getClass(), "stringCache", null);
        setLongField(term1415, term1415.getClass(), "intCompact", -9223372036854775808L);
        setField(term1354, term1354.getClass(), "amount", term1415);
        setIntField(term1433, term1433.getClass(), "signum", 1);
        setIntElement(term1435, 0, 5883);
        setIntElement(term1435, 1, 833709085);
        setIntElement(term1435, 2, 749794735);
        setIntElement(term1435, 3, 825830368);
        setIntElement(term1435, 4, 935494074);
        setIntElement(term1435, 5, -2012885541);
        setField(term1433, term1433.getClass(), "mag", term1435);
        setIntField(term1433, term1433.getClass(), "bitCountPlusOne", 0);
        setIntField(term1433, term1433.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1433, term1433.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1433, term1433.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1432, term1432.getClass(), "intVal", term1433);
        setIntField(term1432, term1432.getClass(), "scale", 52);
        setIntField(term1432, term1432.getClass(), "precision", 0);
        setField(term1432, term1432.getClass(), "stringCache", null);
        setLongField(term1432, term1432.getClass(), "intCompact", -9223372036854775808L);
        setField(term1354, term1354.getClass(), "fee", term1432);
        setIntField(term1450, term1450.getClass(), "signum", 1);
        setIntElement(term1452, 0, 29895);
        setIntElement(term1452, 1, 1752172477);
        setIntElement(term1452, 2, 1964732279);
        setIntElement(term1452, 3, 382594040);
        setIntElement(term1452, 4, 1485746598);
        setIntElement(term1452, 5, -1795307845);
        setField(term1450, term1450.getClass(), "mag", term1452);
        setIntField(term1450, term1450.getClass(), "bitCountPlusOne", 0);
        setIntField(term1450, term1450.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1450, term1450.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1450, term1450.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1449, term1449.getClass(), "intVal", term1450);
        setIntField(term1449, term1449.getClass(), "scale", 53);
        setIntField(term1449, term1449.getClass(), "precision", 0);
        setField(term1449, term1449.getClass(), "stringCache", null);
        setLongField(term1449, term1449.getClass(), "intCompact", -9223372036854775808L);
        setField(term1354, term1354.getClass(), "tax", term1449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term1354, args);
    }

};


