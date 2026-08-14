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

public class TopUpProcessor_journalAndProduce_633769101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term562;
     Object term616;
     Object term618;

    public TopUpProcessor_journalAndProduce_633769101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term562 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest"));
        Object term599 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term600 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term602 = (int[]) newIntArray(6);
        setField(term562, term562.getClass(), "currency", "RkybSrpybU");
        setField(term562, term562.getClass(), "topUpAccount", "xOEqzGAmDU");
        setField(term562, term562.getClass(), "settlementAccount", "eZFUvlxvGV");
        setIntField(term600, term600.getClass(), "signum", 1);
        setIntElement(term602, 0, 3726);
        setIntElement(term602, 1, 1561510548);
        setIntElement(term602, 2, 756973629);
        setIntElement(term602, 3, -1169068666);
        setIntElement(term602, 4, -1772498162);
        setIntElement(term602, 5, -1207241473);
        setField(term600, term600.getClass(), "mag", term602);
        setIntField(term600, term600.getClass(), "bitCountPlusOne", 0);
        setIntField(term600, term600.getClass(), "bitLengthPlusOne", 0);
        setIntField(term600, term600.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term600, term600.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term599, term599.getClass(), "intVal", term600);
        setIntField(term599, term599.getClass(), "scale", 52);
        setIntField(term599, term599.getClass(), "precision", 0);
        setField(term599, term599.getClass(), "stringCache", null);
        setLongField(term599, term599.getClass(), "intCompact", -9223372036854775808L);
        setField(term562, term562.getClass(), "amount", term599);
        term616 = new Long(-8257434502486459194L);
        term618 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.consumer.impl.TopUpProcessor");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest");
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("java.lang.Integer");
        Object[] args = new Object[4];
        args[0] = "hNxWaHcfhY";
        args[1] = term562;
        args[2] = term616;
        args[3] = term618;
        callMethod(klass, "journalAndProduce", argTypes, null, args);
    }

};


