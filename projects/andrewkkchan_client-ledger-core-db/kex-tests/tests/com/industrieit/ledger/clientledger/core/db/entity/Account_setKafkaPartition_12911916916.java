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

public class Account_setKafkaPartition_12911916916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3059;
     Object term3132;

    public Account_setKafkaPartition_12911916916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3128 = new Long(0L);
        Integer term3130 = new Integer(0);
        term3059 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term3072 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term3111 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term3112 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term3114 = (int[]) newIntArray(6);
        setField(term3059, term3059.getClass(), "id", "fztQhjqwdP");
        setIntField(term3072, term3072.getClass(), "nanos", 367000000);
        setLongField(term3072, term3072.getClass(), "fastTime", 1691857668000L);
        setField(term3072, term3072.getClass(), "cdate", null);
        setField(term3059, term3059.getClass(), "createTime", term3072);
        setField(term3059, term3059.getClass(), "currency", "eVpkWxjuki");
        setField(term3059, term3059.getClass(), "accountName", "SJiQaLvSKv");
        setField(term3059, term3059.getClass(), "accountGroup", "OEXDRUKcFl");
        setIntField(term3112, term3112.getClass(), "signum", 1);
        setIntElement(term3114, 0, 6724);
        setIntElement(term3114, 1, -459858691);
        setIntElement(term3114, 2, -950374219);
        setIntElement(term3114, 3, -1430160029);
        setIntElement(term3114, 4, 1532735250);
        setIntElement(term3114, 5, 890914777);
        setField(term3112, term3112.getClass(), "mag", term3114);
        setIntField(term3112, term3112.getClass(), "bitCountPlusOne", 0);
        setIntField(term3112, term3112.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3112, term3112.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3112, term3112.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term3111, term3111.getClass(), "intVal", term3112);
        setIntField(term3111, term3111.getClass(), "scale", 52);
        setIntField(term3111, term3111.getClass(), "precision", 0);
        setField(term3111, term3111.getClass(), "stringCache", null);
        setLongField(term3111, term3111.getClass(), "intCompact", -9223372036854775808L);
        setField(term3059, term3059.getClass(), "balance", term3111);
        setField(term3059, term3059.getClass(), "kafkaOffset", term3128);
        setField(term3059, term3059.getClass(), "kafkaPartition", term3130);
        term3132 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term3132;
        callMethod(klass, "setKafkaPartition", argTypes, term3059, args);
    }

};


