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

public class Account_getBalance_133535139411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2439;

    public Account_getBalance_133535139411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2508 = new Long(0L);
        Integer term2510 = new Integer(0);
        term2439 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2452 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2491 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2492 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2494 = (int[]) newIntArray(6);
        setField(term2439, term2439.getClass(), "id", "jSpAteRute");
        setIntField(term2452, term2452.getClass(), "nanos", 759000000);
        setLongField(term2452, term2452.getClass(), "fastTime", 1630941844000L);
        setField(term2452, term2452.getClass(), "cdate", null);
        setField(term2439, term2439.getClass(), "createTime", term2452);
        setField(term2439, term2439.getClass(), "currency", "swZVeJAxjt");
        setField(term2439, term2439.getClass(), "accountName", "xOcJIiQQDu");
        setField(term2439, term2439.getClass(), "accountGroup", "GVizqqzXpy");
        setIntField(term2492, term2492.getClass(), "signum", 1);
        setIntElement(term2494, 0, 579);
        setIntElement(term2494, 1, -560540333);
        setIntElement(term2494, 2, 1014435409);
        setIntElement(term2494, 3, -1248929007);
        setIntElement(term2494, 4, -42206956);
        setIntElement(term2494, 5, 1817231305);
        setField(term2492, term2492.getClass(), "mag", term2494);
        setIntField(term2492, term2492.getClass(), "bitCountPlusOne", 0);
        setIntField(term2492, term2492.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2492, term2492.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2492, term2492.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2491, term2491.getClass(), "intVal", term2492);
        setIntField(term2491, term2491.getClass(), "scale", 51);
        setIntField(term2491, term2491.getClass(), "precision", 0);
        setField(term2491, term2491.getClass(), "stringCache", null);
        setLongField(term2491, term2491.getClass(), "intCompact", -9223372036854775808L);
        setField(term2439, term2439.getClass(), "balance", term2491);
        setField(term2439, term2439.getClass(), "kafkaOffset", term2508);
        setField(term2439, term2439.getClass(), "kafkaPartition", term2510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBalance", argTypes, term2439, args);
    }

};


