package com.industrieit.ledger.clientledger.core.db.consumer.impl;

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
import static com.industrieit.ledger.clientledger.core.db.consumer.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class P2PProcessor_journalAndProduce_12720437021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;
     Object term391;
     Object term393;

    public P2PProcessor_journalAndProduce_12720437021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term340 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term341 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term343 = (int[]) newIntArray(6);
        Object term357 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term358 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term360 = (int[]) newIntArray(6);
        Object term374 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term375 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term377 = (int[]) newIntArray(6);
        setField(term279, term279.getClass(), "currency", "MxlszYVzRf");
        setField(term279, term279.getClass(), "fromCustomerAccount", "LQFpaHEwXR");
        setField(term279, term279.getClass(), "toCustomerAccount", "oVcInYnLWB");
        setField(term279, term279.getClass(), "feeAccount", "aJlieCFVtF");
        setField(term279, term279.getClass(), "taxAccount", "ZiaGIbnzTs");
        setIntField(term341, term341.getClass(), "signum", 1);
        setIntElement(term343, 0, 9058);
        setIntElement(term343, 1, 1365043541);
        setIntElement(term343, 2, 1239861896);
        setIntElement(term343, 3, -1338148297);
        setIntElement(term343, 4, -418263970);
        setIntElement(term343, 5, -265097411);
        setField(term341, term341.getClass(), "mag", term343);
        setIntField(term341, term341.getClass(), "bitCountPlusOne", 0);
        setIntField(term341, term341.getClass(), "bitLengthPlusOne", 0);
        setIntField(term341, term341.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term341, term341.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term340, term340.getClass(), "intVal", term341);
        setIntField(term340, term340.getClass(), "scale", 53);
        setIntField(term340, term340.getClass(), "precision", 0);
        setField(term340, term340.getClass(), "stringCache", null);
        setLongField(term340, term340.getClass(), "intCompact", -9223372036854775808L);
        setField(term279, term279.getClass(), "amount", term340);
        setIntField(term358, term358.getClass(), "signum", 1);
        setIntElement(term360, 0, 2364);
        setIntElement(term360, 1, -1446584625);
        setIntElement(term360, 2, 1957600567);
        setIntElement(term360, 3, -336418707);
        setIntElement(term360, 4, -1905211145);
        setIntElement(term360, 5, 86968353);
        setField(term358, term358.getClass(), "mag", term360);
        setIntField(term358, term358.getClass(), "bitCountPlusOne", 0);
        setIntField(term358, term358.getClass(), "bitLengthPlusOne", 0);
        setIntField(term358, term358.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term358, term358.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term357, term357.getClass(), "intVal", term358);
        setIntField(term357, term357.getClass(), "scale", 52);
        setIntField(term357, term357.getClass(), "precision", 0);
        setField(term357, term357.getClass(), "stringCache", null);
        setLongField(term357, term357.getClass(), "intCompact", -9223372036854775808L);
        setField(term279, term279.getClass(), "fee", term357);
        setIntField(term375, term375.getClass(), "signum", 1);
        setIntElement(term377, 0, 3779);
        setIntElement(term377, 1, 1825499203);
        setIntElement(term377, 2, 189827582);
        setIntElement(term377, 3, 731025545);
        setIntElement(term377, 4, -475097163);
        setIntElement(term377, 5, 890127363);
        setField(term375, term375.getClass(), "mag", term377);
        setIntField(term375, term375.getClass(), "bitCountPlusOne", 0);
        setIntField(term375, term375.getClass(), "bitLengthPlusOne", 0);
        setIntField(term375, term375.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term375, term375.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term374, term374.getClass(), "intVal", term375);
        setIntField(term374, term374.getClass(), "scale", 52);
        setIntField(term374, term374.getClass(), "precision", 0);
        setField(term374, term374.getClass(), "stringCache", null);
        setLongField(term374, term374.getClass(), "intCompact", -9223372036854775808L);
        setField(term279, term279.getClass(), "tax", term374);
        term391 = new Long(6375119433582206027L);
        term393 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.consumer.impl.P2PProcessor");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = "uuaPigETmJ";
        args[1] = term279;
        args[2] = term391;
        args[3] = term393;
        callMethod(klass, "journalAndProduce", argTypes, null, args);
    }

};


