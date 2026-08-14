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

public class P2PRequest_getTax_1562175304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1174;

    public P2PRequest_getTax_1562175304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1174 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term1235 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1236 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1238 = (int[]) newIntArray(6);
        Object term1252 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1253 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1255 = (int[]) newIntArray(6);
        Object term1269 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1270 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1272 = (int[]) newIntArray(6);
        setField(term1174, term1174.getClass(), "currency", "Ghbwtircqb");
        setField(term1174, term1174.getClass(), "fromCustomerAccount", "xrwlQZdwCp");
        setField(term1174, term1174.getClass(), "toCustomerAccount", "IDCWpPLRkE");
        setField(term1174, term1174.getClass(), "feeAccount", "nyiiPDVjAc");
        setField(term1174, term1174.getClass(), "taxAccount", "aKnKipADSo");
        setIntField(term1236, term1236.getClass(), "signum", 1);
        setIntElement(term1238, 0, 190);
        setIntElement(term1238, 1, 842222845);
        setIntElement(term1238, 2, 1366336864);
        setIntElement(term1238, 3, -295316729);
        setIntElement(term1238, 4, 1173791667);
        setIntElement(term1238, 5, -522535689);
        setField(term1236, term1236.getClass(), "mag", term1238);
        setIntField(term1236, term1236.getClass(), "bitCountPlusOne", 0);
        setIntField(term1236, term1236.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1236, term1236.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1236, term1236.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1235, term1235.getClass(), "intVal", term1236);
        setIntField(term1235, term1235.getClass(), "scale", 51);
        setIntField(term1235, term1235.getClass(), "precision", 0);
        setField(term1235, term1235.getClass(), "stringCache", null);
        setLongField(term1235, term1235.getClass(), "intCompact", -9223372036854775808L);
        setField(term1174, term1174.getClass(), "amount", term1235);
        setIntField(term1253, term1253.getClass(), "signum", 1);
        setIntElement(term1255, 0, 4404);
        setIntElement(term1255, 1, 763521092);
        setIntElement(term1255, 2, 665076742);
        setIntElement(term1255, 3, 66292673);
        setIntElement(term1255, 4, 275037375);
        setIntElement(term1255, 5, 1545486489);
        setField(term1253, term1253.getClass(), "mag", term1255);
        setIntField(term1253, term1253.getClass(), "bitCountPlusOne", 0);
        setIntField(term1253, term1253.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1253, term1253.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1253, term1253.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1252, term1252.getClass(), "intVal", term1253);
        setIntField(term1252, term1252.getClass(), "scale", 52);
        setIntField(term1252, term1252.getClass(), "precision", 0);
        setField(term1252, term1252.getClass(), "stringCache", null);
        setLongField(term1252, term1252.getClass(), "intCompact", -9223372036854775808L);
        setField(term1174, term1174.getClass(), "fee", term1252);
        setIntField(term1270, term1270.getClass(), "signum", 1);
        setIntElement(term1272, 0, 5017);
        setIntElement(term1272, 1, 1138264108);
        setIntElement(term1272, 2, 138609451);
        setIntElement(term1272, 3, -559929925);
        setIntElement(term1272, 4, -1000035065);
        setIntElement(term1272, 5, 1199074337);
        setField(term1270, term1270.getClass(), "mag", term1272);
        setIntField(term1270, term1270.getClass(), "bitCountPlusOne", 0);
        setIntField(term1270, term1270.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1270, term1270.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1270, term1270.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1269, term1269.getClass(), "intVal", term1270);
        setIntField(term1269, term1269.getClass(), "scale", 52);
        setIntField(term1269, term1269.getClass(), "precision", 0);
        setField(term1269, term1269.getClass(), "stringCache", null);
        setLongField(term1269, term1269.getClass(), "intCompact", -9223372036854775808L);
        setField(term1174, term1174.getClass(), "tax", term1269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTax", argTypes, term1174, args);
    }

};


