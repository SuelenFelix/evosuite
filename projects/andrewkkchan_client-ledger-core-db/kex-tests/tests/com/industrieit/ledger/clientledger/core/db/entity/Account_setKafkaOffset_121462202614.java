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

public class Account_setKafkaOffset_121462202614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2819;
     Object term2892;

    public Account_setKafkaOffset_121462202614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2888 = new Long(0L);
        Integer term2890 = new Integer(0);
        term2819 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2832 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2871 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2872 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2874 = (int[]) newIntArray(6);
        setField(term2819, term2819.getClass(), "id", "sEccwbJKYE");
        setIntField(term2832, term2832.getClass(), "nanos", 718000000);
        setLongField(term2832, term2832.getClass(), "fastTime", 1334842304000L);
        setField(term2832, term2832.getClass(), "cdate", null);
        setField(term2819, term2819.getClass(), "createTime", term2832);
        setField(term2819, term2819.getClass(), "currency", "AWRooQKkdW");
        setField(term2819, term2819.getClass(), "accountName", "vjxIhXHxGR");
        setField(term2819, term2819.getClass(), "accountGroup", "QXzGXbEXMu");
        setIntField(term2872, term2872.getClass(), "signum", 1);
        setIntElement(term2874, 0, 48108);
        setIntElement(term2874, 1, 419671270);
        setIntElement(term2874, 2, 909082732);
        setIntElement(term2874, 3, 2078883588);
        setIntElement(term2874, 4, 1670017529);
        setIntElement(term2874, 5, -2116499193);
        setField(term2872, term2872.getClass(), "mag", term2874);
        setIntField(term2872, term2872.getClass(), "bitCountPlusOne", 0);
        setIntField(term2872, term2872.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2872, term2872.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2872, term2872.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2871, term2871.getClass(), "intVal", term2872);
        setIntField(term2871, term2871.getClass(), "scale", 53);
        setIntField(term2871, term2871.getClass(), "precision", 0);
        setField(term2871, term2871.getClass(), "stringCache", null);
        setLongField(term2871, term2871.getClass(), "intCompact", -9223372036854775808L);
        setField(term2819, term2819.getClass(), "balance", term2871);
        setField(term2819, term2819.getClass(), "kafkaOffset", term2888);
        setField(term2819, term2819.getClass(), "kafkaPartition", term2890);
        term2892 = new Long(2442117782898005296L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term2892;
        callMethod(klass, "setKafkaOffset", argTypes, term2819, args);
    }

};


