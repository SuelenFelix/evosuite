package com.industrieit.ledger.clientledger.core.db.service.impl;

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
import static com.industrieit.ledger.clientledger.core.db.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class P2PServiceImpl_journal_18588294371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;
     Object term132;
     Object term244;
     Object term246;

    public P2PServiceImpl_journal_18588294371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.service.impl.P2PServiceImpl"));
        setField(term119, term119.getClass(), "validator", null);
        setField(term119, term119.getClass(), "committer", null);
        term132 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest"));
        Object term193 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term194 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term196 = (int[]) newIntArray(6);
        Object term210 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term211 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term213 = (int[]) newIntArray(6);
        Object term227 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term228 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term230 = (int[]) newIntArray(6);
        setField(term132, term132.getClass(), "currency", "EGtDIRbSSb");
        setField(term132, term132.getClass(), "fromCustomerAccount", "SzjVpOQTyS");
        setField(term132, term132.getClass(), "toCustomerAccount", "MjGYSRKTNF");
        setField(term132, term132.getClass(), "feeAccount", "hRNSzYYIrc");
        setField(term132, term132.getClass(), "taxAccount", "RMFIsYGgne");
        setIntField(term194, term194.getClass(), "signum", 1);
        setIntElement(term196, 0, 2364);
        setIntElement(term196, 1, -1446584625);
        setIntElement(term196, 2, 1957600567);
        setIntElement(term196, 3, -336418707);
        setIntElement(term196, 4, -1905211145);
        setIntElement(term196, 5, 86968353);
        setField(term194, term194.getClass(), "mag", term196);
        setIntField(term194, term194.getClass(), "bitCountPlusOne", 0);
        setIntField(term194, term194.getClass(), "bitLengthPlusOne", 0);
        setIntField(term194, term194.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term194, term194.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term193, term193.getClass(), "intVal", term194);
        setIntField(term193, term193.getClass(), "scale", 52);
        setIntField(term193, term193.getClass(), "precision", 0);
        setField(term193, term193.getClass(), "stringCache", null);
        setLongField(term193, term193.getClass(), "intCompact", -9223372036854775808L);
        setField(term132, term132.getClass(), "amount", term193);
        setIntField(term211, term211.getClass(), "signum", 1);
        setIntElement(term213, 0, 3779);
        setIntElement(term213, 1, 1825499203);
        setIntElement(term213, 2, 189827582);
        setIntElement(term213, 3, 731025545);
        setIntElement(term213, 4, -475097163);
        setIntElement(term213, 5, 890127363);
        setField(term211, term211.getClass(), "mag", term213);
        setIntField(term211, term211.getClass(), "bitCountPlusOne", 0);
        setIntField(term211, term211.getClass(), "bitLengthPlusOne", 0);
        setIntField(term211, term211.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term211, term211.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term210, term210.getClass(), "intVal", term211);
        setIntField(term210, term210.getClass(), "scale", 52);
        setIntField(term210, term210.getClass(), "precision", 0);
        setField(term210, term210.getClass(), "stringCache", null);
        setLongField(term210, term210.getClass(), "intCompact", -9223372036854775808L);
        setField(term132, term132.getClass(), "fee", term210);
        setIntField(term228, term228.getClass(), "signum", 1);
        setIntElement(term230, 0, 3726);
        setIntElement(term230, 1, 1561510548);
        setIntElement(term230, 2, 756973629);
        setIntElement(term230, 3, -1169068666);
        setIntElement(term230, 4, -1772498162);
        setIntElement(term230, 5, -1207241473);
        setField(term228, term228.getClass(), "mag", term230);
        setIntField(term228, term228.getClass(), "bitCountPlusOne", 0);
        setIntField(term228, term228.getClass(), "bitLengthPlusOne", 0);
        setIntField(term228, term228.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term228, term228.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term227, term227.getClass(), "intVal", term228);
        setIntField(term227, term227.getClass(), "scale", 52);
        setIntField(term227, term227.getClass(), "precision", 0);
        setField(term227, term227.getClass(), "stringCache", null);
        setLongField(term227, term227.getClass(), "intCompact", -9223372036854775808L);
        setField(term132, term132.getClass(), "tax", term227);
        term244 = new Long(6375119433582206027L);
        term246 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.service.impl.P2PServiceImpl");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.P2PRequest");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = "jJCZpVmanW";
        args[1] = term132;
        args[2] = term244;
        args[3] = term246;
        callMethod(klass, "journal", argTypes, term119, args);
    }

};


