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

public class Account_setCurrency_116568916910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2298;

    public Account_setCurrency_116568916910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2367 = new Long(0L);
        Integer term2369 = new Integer(0);
        term2298 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2311 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2350 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2351 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2353 = (int[]) newIntArray(6);
        setField(term2298, term2298.getClass(), "id", "cAPeiZHKGJ");
        setIntField(term2311, term2311.getClass(), "nanos", 899000000);
        setLongField(term2311, term2311.getClass(), "fastTime", 1502147353000L);
        setField(term2311, term2311.getClass(), "cdate", null);
        setField(term2298, term2298.getClass(), "createTime", term2311);
        setField(term2298, term2298.getClass(), "currency", "LvJFtLBaxj");
        setField(term2298, term2298.getClass(), "accountName", "PHvxnGHptP");
        setField(term2298, term2298.getClass(), "accountGroup", "TimdotUuNC");
        setIntField(term2351, term2351.getClass(), "signum", 1);
        setIntElement(term2353, 0, 2584);
        setIntElement(term2353, 1, -1946484122);
        setIntElement(term2353, 2, 1992026795);
        setIntElement(term2353, 3, 1045205752);
        setIntElement(term2353, 4, 613377469);
        setIntElement(term2353, 5, -1848020175);
        setField(term2351, term2351.getClass(), "mag", term2353);
        setIntField(term2351, term2351.getClass(), "bitCountPlusOne", 0);
        setIntField(term2351, term2351.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2351, term2351.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2351, term2351.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2350, term2350.getClass(), "intVal", term2351);
        setIntField(term2350, term2350.getClass(), "scale", 52);
        setIntField(term2350, term2350.getClass(), "precision", 0);
        setField(term2350, term2350.getClass(), "stringCache", null);
        setLongField(term2350, term2350.getClass(), "intCompact", -9223372036854775808L);
        setField(term2298, term2298.getClass(), "balance", term2350);
        setField(term2298, term2298.getClass(), "kafkaOffset", term2367);
        setField(term2298, term2298.getClass(), "kafkaPartition", term2369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PkWMRdJcBb";
        callMethod(klass, "setCurrency", argTypes, term2298, args);
    }

};


