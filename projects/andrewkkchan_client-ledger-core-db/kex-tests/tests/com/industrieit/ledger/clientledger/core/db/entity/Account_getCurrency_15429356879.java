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

public class Account_getCurrency_15429356879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2179;

    public Account_getCurrency_15429356879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2248 = new Long(0L);
        Integer term2250 = new Integer(0);
        term2179 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2192 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2231 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2232 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2234 = (int[]) newIntArray(6);
        setField(term2179, term2179.getClass(), "id", "idgaQsnJpQ");
        setIntField(term2192, term2192.getClass(), "nanos", 385000000);
        setLongField(term2192, term2192.getClass(), "fastTime", 1347389761000L);
        setField(term2192, term2192.getClass(), "cdate", null);
        setField(term2179, term2179.getClass(), "createTime", term2192);
        setField(term2179, term2179.getClass(), "currency", "VgZnGoIFwQ");
        setField(term2179, term2179.getClass(), "accountName", "jUbSRrkrYZ");
        setField(term2179, term2179.getClass(), "accountGroup", "bWWfajKbEX");
        setIntField(term2232, term2232.getClass(), "signum", 1);
        setIntElement(term2234, 0, 4157);
        setIntElement(term2234, 1, -1258399411);
        setIntElement(term2234, 2, -1445096589);
        setIntElement(term2234, 3, 1602721280);
        setIntElement(term2234, 4, 1738795194);
        setIntElement(term2234, 5, -481877419);
        setField(term2232, term2232.getClass(), "mag", term2234);
        setIntField(term2232, term2232.getClass(), "bitCountPlusOne", 0);
        setIntField(term2232, term2232.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2232, term2232.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2232, term2232.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2231, term2231.getClass(), "intVal", term2232);
        setIntField(term2231, term2231.getClass(), "scale", 52);
        setIntField(term2231, term2231.getClass(), "precision", 0);
        setField(term2231, term2231.getClass(), "stringCache", null);
        setLongField(term2231, term2231.getClass(), "intCompact", -9223372036854775808L);
        setField(term2179, term2179.getClass(), "balance", term2231);
        setField(term2179, term2179.getClass(), "kafkaOffset", term2248);
        setField(term2179, term2179.getClass(), "kafkaPartition", term2250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term2179, args);
    }

};


