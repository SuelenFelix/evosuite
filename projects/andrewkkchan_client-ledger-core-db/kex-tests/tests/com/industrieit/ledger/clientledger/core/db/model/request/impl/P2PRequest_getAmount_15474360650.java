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

public class P2PRequest_getAmount_15474360650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454;

    public P2PRequest_getAmount_15474360650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term454 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term515 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term516 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term518 = (int[]) newIntArray(6);
        Object term532 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term533 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term535 = (int[]) newIntArray(6);
        Object term549 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term550 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term552 = (int[]) newIntArray(6);
        setField(term454, term454.getClass(), "currency", "aJlieCFVtF");
        setField(term454, term454.getClass(), "fromCustomerAccount", "ZiaGIbnzTs");
        setField(term454, term454.getClass(), "toCustomerAccount", "tbcdzjIfER");
        setField(term454, term454.getClass(), "feeAccount", "HyxfbSQYBe");
        setField(term454, term454.getClass(), "taxAccount", "pCTimMblYc");
        setIntField(term516, term516.getClass(), "signum", 1);
        setIntElement(term518, 0, 27489);
        setIntElement(term518, 1, -274433180);
        setIntElement(term518, 2, 698548608);
        setIntElement(term518, 3, -1143703655);
        setIntElement(term518, 4, 1619765041);
        setIntElement(term518, 5, -418227111);
        setField(term516, term516.getClass(), "mag", term518);
        setIntField(term516, term516.getClass(), "bitCountPlusOne", 0);
        setIntField(term516, term516.getClass(), "bitLengthPlusOne", 0);
        setIntField(term516, term516.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term516, term516.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term515, term515.getClass(), "intVal", term516);
        setIntField(term515, term515.getClass(), "scale", 53);
        setIntField(term515, term515.getClass(), "precision", 0);
        setField(term515, term515.getClass(), "stringCache", null);
        setLongField(term515, term515.getClass(), "intCompact", -9223372036854775808L);
        setField(term454, term454.getClass(), "amount", term515);
        setIntField(term533, term533.getClass(), "signum", 1);
        setIntElement(term535, 0, 1807);
        setIntElement(term535, 1, 1210968587);
        setIntElement(term535, 2, -857410878);
        setIntElement(term535, 3, 520383771);
        setIntElement(term535, 4, 2106706510);
        setIntElement(term535, 5, 1731185477);
        setField(term533, term533.getClass(), "mag", term535);
        setIntField(term533, term533.getClass(), "bitCountPlusOne", 0);
        setIntField(term533, term533.getClass(), "bitLengthPlusOne", 0);
        setIntField(term533, term533.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term533, term533.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term532, term532.getClass(), "intVal", term533);
        setIntField(term532, term532.getClass(), "scale", 52);
        setIntField(term532, term532.getClass(), "precision", 0);
        setField(term532, term532.getClass(), "stringCache", null);
        setLongField(term532, term532.getClass(), "intCompact", -9223372036854775808L);
        setField(term454, term454.getClass(), "fee", term532);
        setIntField(term550, term550.getClass(), "signum", 1);
        setIntElement(term552, 0, 25264);
        setIntElement(term552, 1, 13306318);
        setIntElement(term552, 2, 145344007);
        setIntElement(term552, 3, -1015263393);
        setIntElement(term552, 4, -1366378930);
        setIntElement(term552, 5, 983206517);
        setField(term550, term550.getClass(), "mag", term552);
        setIntField(term550, term550.getClass(), "bitCountPlusOne", 0);
        setIntField(term550, term550.getClass(), "bitLengthPlusOne", 0);
        setIntField(term550, term550.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term550, term550.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term549, term549.getClass(), "intVal", term550);
        setIntField(term549, term549.getClass(), "scale", 53);
        setIntField(term549, term549.getClass(), "precision", 0);
        setField(term549, term549.getClass(), "stringCache", null);
        setLongField(term549, term549.getClass(), "intCompact", -9223372036854775808L);
        setField(term454, term454.getClass(), "tax", term549);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term454, args);
    }

};


