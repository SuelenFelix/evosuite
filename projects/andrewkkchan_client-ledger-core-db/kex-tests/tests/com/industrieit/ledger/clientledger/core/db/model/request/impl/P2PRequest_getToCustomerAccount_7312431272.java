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

public class P2PRequest_getToCustomerAccount_7312431272 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814;

    public P2PRequest_getToCustomerAccount_7312431272() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term814 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term875 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term876 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term878 = (int[]) newIntArray(6);
        Object term892 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term893 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term895 = (int[]) newIntArray(6);
        Object term909 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term910 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term912 = (int[]) newIntArray(6);
        setField(term814, term814.getClass(), "currency", "vrQLuWIDJX");
        setField(term814, term814.getClass(), "fromCustomerAccount", "flxyYxBRtu");
        setField(term814, term814.getClass(), "toCustomerAccount", "OclPbYPkcH");
        setField(term814, term814.getClass(), "feeAccount", "IoAlmYsBwc");
        setField(term814, term814.getClass(), "taxAccount", "TEParAifyi");
        setIntField(term876, term876.getClass(), "signum", 1);
        setIntElement(term878, 0, 35465);
        setIntElement(term878, 1, 1599162976);
        setIntElement(term878, 2, -1427811280);
        setIntElement(term878, 3, -224241601);
        setIntElement(term878, 4, -1115150417);
        setIntElement(term878, 5, 212641299);
        setField(term876, term876.getClass(), "mag", term878);
        setIntField(term876, term876.getClass(), "bitCountPlusOne", 0);
        setIntField(term876, term876.getClass(), "bitLengthPlusOne", 0);
        setIntField(term876, term876.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term876, term876.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term875, term875.getClass(), "intVal", term876);
        setIntField(term875, term875.getClass(), "scale", 53);
        setIntField(term875, term875.getClass(), "precision", 0);
        setField(term875, term875.getClass(), "stringCache", null);
        setLongField(term875, term875.getClass(), "intCompact", -9223372036854775808L);
        setField(term814, term814.getClass(), "amount", term875);
        setIntField(term893, term893.getClass(), "signum", 1);
        setIntElement(term895, 0, 523);
        setIntElement(term895, 1, -954467915);
        setIntElement(term895, 2, 1892307494);
        setIntElement(term895, 3, -1066736592);
        setIntElement(term895, 4, 433326655);
        setIntElement(term895, 5, -242716133);
        setField(term893, term893.getClass(), "mag", term895);
        setIntField(term893, term893.getClass(), "bitCountPlusOne", 0);
        setIntField(term893, term893.getClass(), "bitLengthPlusOne", 0);
        setIntField(term893, term893.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term893, term893.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term892, term892.getClass(), "intVal", term893);
        setIntField(term892, term892.getClass(), "scale", 51);
        setIntField(term892, term892.getClass(), "precision", 0);
        setField(term892, term892.getClass(), "stringCache", null);
        setLongField(term892, term892.getClass(), "intCompact", -9223372036854775808L);
        setField(term814, term814.getClass(), "fee", term892);
        setIntField(term910, term910.getClass(), "signum", 1);
        setIntElement(term912, 0, 9405);
        setIntElement(term912, 1, 205999050);
        setIntElement(term912, 2, 647637684);
        setIntElement(term912, 3, -896420066);
        setIntElement(term912, 4, 1280002914);
        setIntElement(term912, 5, 183404747);
        setField(term910, term910.getClass(), "mag", term912);
        setIntField(term910, term910.getClass(), "bitCountPlusOne", 0);
        setIntField(term910, term910.getClass(), "bitLengthPlusOne", 0);
        setIntField(term910, term910.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term910, term910.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term909, term909.getClass(), "intVal", term910);
        setIntField(term909, term909.getClass(), "scale", 53);
        setIntField(term909, term909.getClass(), "precision", 0);
        setField(term909, term909.getClass(), "stringCache", null);
        setLongField(term909, term909.getClass(), "intCompact", -9223372036854775808L);
        setField(term814, term814.getClass(), "tax", term909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToCustomerAccount", argTypes, term814, args);
    }

};


