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

public class JournalEntry_getRequestId_6007861420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4169;

    public JournalEntry_getRequestId_6007861420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4263 = new Long(0L);
        Integer term4265 = new Integer(0);
        term4169 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term4194 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term4207 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4246 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4247 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4249 = (int[]) newIntArray(6);
        Object term4279 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4282 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4283 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4285 = (int[]) newIntArray(6);
        setField(term4169, term4169.getClass(), "id", "MwwjNtdOFT");
        setField(term4169, term4169.getClass(), "requestId", "VYkqXKVlAJ");
        setField(term4194, term4194.getClass(), "id", "XkIoWJRNwN");
        setIntField(term4207, term4207.getClass(), "nanos", 487000000);
        setLongField(term4207, term4207.getClass(), "fastTime", 1632993975000L);
        setField(term4207, term4207.getClass(), "cdate", null);
        setField(term4194, term4194.getClass(), "createTime", term4207);
        setField(term4194, term4194.getClass(), "currency", "aNWLJdrZMq");
        setField(term4194, term4194.getClass(), "accountName", "HHmNoYxIGj");
        setField(term4194, term4194.getClass(), "accountGroup", "PtirvZmsGt");
        setIntField(term4247, term4247.getClass(), "signum", 1);
        setIntElement(term4249, 0, 190);
        setIntElement(term4249, 1, 842222845);
        setIntElement(term4249, 2, 1366336864);
        setIntElement(term4249, 3, -295316729);
        setIntElement(term4249, 4, 1173791667);
        setIntElement(term4249, 5, -522535689);
        setField(term4247, term4247.getClass(), "mag", term4249);
        setIntField(term4247, term4247.getClass(), "bitCountPlusOne", 0);
        setIntField(term4247, term4247.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4247, term4247.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4247, term4247.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4246, term4246.getClass(), "intVal", term4247);
        setIntField(term4246, term4246.getClass(), "scale", 51);
        setIntField(term4246, term4246.getClass(), "precision", 0);
        setField(term4246, term4246.getClass(), "stringCache", null);
        setLongField(term4246, term4246.getClass(), "intCompact", -9223372036854775808L);
        setField(term4194, term4194.getClass(), "balance", term4246);
        setField(term4194, term4194.getClass(), "kafkaOffset", term4263);
        setField(term4194, term4194.getClass(), "kafkaPartition", term4265);
        setField(term4169, term4169.getClass(), "account", term4194);
        setField(term4169, term4169.getClass(), "currency", "HWkpTmtlrc");
        setIntField(term4279, term4279.getClass(), "nanos", 549000000);
        setLongField(term4279, term4279.getClass(), "fastTime", 1819180838000L);
        setField(term4279, term4279.getClass(), "cdate", null);
        setField(term4169, term4169.getClass(), "createTime", term4279);
        setIntField(term4283, term4283.getClass(), "signum", 1);
        setIntElement(term4285, 0, 4404);
        setIntElement(term4285, 1, 763521092);
        setIntElement(term4285, 2, 665076742);
        setIntElement(term4285, 3, 66292673);
        setIntElement(term4285, 4, 275037375);
        setIntElement(term4285, 5, 1545486489);
        setField(term4283, term4283.getClass(), "mag", term4285);
        setIntField(term4283, term4283.getClass(), "bitCountPlusOne", 0);
        setIntField(term4283, term4283.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4283, term4283.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4283, term4283.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4282, term4282.getClass(), "intVal", term4283);
        setIntField(term4282, term4282.getClass(), "scale", 52);
        setIntField(term4282, term4282.getClass(), "precision", 0);
        setField(term4282, term4282.getClass(), "stringCache", null);
        setLongField(term4282, term4282.getClass(), "intCompact", -9223372036854775808L);
        setField(term4169, term4169.getClass(), "amount", term4282);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestId", argTypes, term4169, args);
    }

};


