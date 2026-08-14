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

public class Account_getId_2311868135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1678;

    public Account_getId_2311868135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1747 = new Long(0L);
        Integer term1749 = new Integer(0);
        term1678 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term1691 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1730 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1731 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1733 = (int[]) newIntArray(6);
        setField(term1678, term1678.getClass(), "id", "eqJfYWRaEL");
        setIntField(term1691, term1691.getClass(), "nanos", 647000000);
        setLongField(term1691, term1691.getClass(), "fastTime", 1725111417000L);
        setField(term1691, term1691.getClass(), "cdate", null);
        setField(term1678, term1678.getClass(), "createTime", term1691);
        setField(term1678, term1678.getClass(), "currency", "fhkbdRViHi");
        setField(term1678, term1678.getClass(), "accountName", "uWHnvSvaPl");
        setField(term1678, term1678.getClass(), "accountGroup", "kBdSllIBVz");
        setIntField(term1731, term1731.getClass(), "signum", 1);
        setIntElement(term1733, 0, 1954);
        setIntElement(term1733, 1, -476668863);
        setIntElement(term1733, 2, 661030673);
        setIntElement(term1733, 3, 328061253);
        setIntElement(term1733, 4, -431156338);
        setIntElement(term1733, 5, 791621529);
        setField(term1731, term1731.getClass(), "mag", term1733);
        setIntField(term1731, term1731.getClass(), "bitCountPlusOne", 0);
        setIntField(term1731, term1731.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1731, term1731.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1731, term1731.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1730, term1730.getClass(), "intVal", term1731);
        setIntField(term1730, term1730.getClass(), "scale", 52);
        setIntField(term1730, term1730.getClass(), "precision", 0);
        setField(term1730, term1730.getClass(), "stringCache", null);
        setLongField(term1730, term1730.getClass(), "intCompact", -9223372036854775808L);
        setField(term1678, term1678.getClass(), "balance", term1730);
        setField(term1678, term1678.getClass(), "kafkaOffset", term1747);
        setField(term1678, term1678.getClass(), "kafkaPartition", term1749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1678, args);
    }

};


