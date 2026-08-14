package com.industrieit.ledger.clientledger.core.db.entity;

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
import static com.industrieit.ledger.clientledger.core.db.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class Account_setAccountGroup_15579228984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1537;

    public Account_setAccountGroup_15579228984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1606 = new Long(0L);
        Integer term1608 = new Integer(0);
        term1537 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term1550 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1589 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1590 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1592 = (int[]) newIntArray(6);
        setField(term1537, term1537.getClass(), "id", "ytSBIKXogI");
        setIntField(term1550, term1550.getClass(), "nanos", 825000000);
        setLongField(term1550, term1550.getClass(), "fastTime", 1668558429000L);
        setField(term1550, term1550.getClass(), "cdate", null);
        setField(term1537, term1537.getClass(), "createTime", term1550);
        setField(term1537, term1537.getClass(), "currency", "nHXjMycHlU");
        setField(term1537, term1537.getClass(), "accountName", "ieCtQFdkii");
        setField(term1537, term1537.getClass(), "accountGroup", "dEnhdmILtU");
        setIntField(term1590, term1590.getClass(), "signum", 1);
        setIntElement(term1592, 0, 3726);
        setIntElement(term1592, 1, 1561510548);
        setIntElement(term1592, 2, 756973629);
        setIntElement(term1592, 3, -1169068666);
        setIntElement(term1592, 4, -1772498162);
        setIntElement(term1592, 5, -1207241473);
        setField(term1590, term1590.getClass(), "mag", term1592);
        setIntField(term1590, term1590.getClass(), "bitCountPlusOne", 0);
        setIntField(term1590, term1590.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1590, term1590.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1590, term1590.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1589, term1589.getClass(), "intVal", term1590);
        setIntField(term1589, term1589.getClass(), "scale", 52);
        setIntField(term1589, term1589.getClass(), "precision", 0);
        setField(term1589, term1589.getClass(), "stringCache", null);
        setLongField(term1589, term1589.getClass(), "intCompact", -9223372036854775808L);
        setField(term1537, term1537.getClass(), "balance", term1589);
        setField(term1537, term1537.getClass(), "kafkaOffset", term1606);
        setField(term1537, term1537.getClass(), "kafkaPartition", term1608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hoicvmsovO";
        callMethod(klass, "setAccountGroup", argTypes, term1537, args);
    }

};


