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

public class JournalEntry_init_21053849812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6918;
     Object term7003;

    public JournalEntry_init_21053849812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6987 = new Long(0L);
        Integer term6989 = new Integer(0);
        term6918 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term6931 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6970 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6971 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6973 = (int[]) newIntArray(6);
        setField(term6918, term6918.getClass(), "id", "PqtVXXZMqK");
        setIntField(term6931, term6931.getClass(), "nanos", 651000000);
        setLongField(term6931, term6931.getClass(), "fastTime", 1663402967000L);
        setField(term6931, term6931.getClass(), "cdate", null);
        setField(term6918, term6918.getClass(), "createTime", term6931);
        setField(term6918, term6918.getClass(), "currency", "rYbtIDVdnd");
        setField(term6918, term6918.getClass(), "accountName", "UKAReurpHG");
        setField(term6918, term6918.getClass(), "accountGroup", "WVRMUmrljA");
        setIntField(term6971, term6971.getClass(), "signum", 1);
        setIntElement(term6973, 0, 43771);
        setIntElement(term6973, 1, -2064049935);
        setIntElement(term6973, 2, 2069770836);
        setIntElement(term6973, 3, 478634100);
        setIntElement(term6973, 4, -643849105);
        setIntElement(term6973, 5, -507036065);
        setField(term6971, term6971.getClass(), "mag", term6973);
        setIntField(term6971, term6971.getClass(), "bitCountPlusOne", 0);
        setIntField(term6971, term6971.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6971, term6971.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6971, term6971.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6970, term6970.getClass(), "intVal", term6971);
        setIntField(term6970, term6970.getClass(), "scale", 53);
        setIntField(term6970, term6970.getClass(), "precision", 0);
        setField(term6970, term6970.getClass(), "stringCache", null);
        setLongField(term6970, term6970.getClass(), "intCompact", -9223372036854775808L);
        setField(term6918, term6918.getClass(), "balance", term6970);
        setField(term6918, term6918.getClass(), "kafkaOffset", term6987);
        setField(term6918, term6918.getClass(), "kafkaPartition", term6989);
        term7003 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term7004 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term7006 = (int[]) newIntArray(6);
        setIntField(term7004, term7004.getClass(), "signum", 1);
        setIntElement(term7006, 0, 17747);
        setIntElement(term7006, 1, 222971343);
        setIntElement(term7006, 2, 1645407127);
        setIntElement(term7006, 3, 211829796);
        setIntElement(term7006, 4, 1665135280);
        setIntElement(term7006, 5, -264762539);
        setField(term7004, term7004.getClass(), "mag", term7006);
        setIntField(term7004, term7004.getClass(), "bitCountPlusOne", 0);
        setIntField(term7004, term7004.getClass(), "bitLengthPlusOne", 0);
        setIntField(term7004, term7004.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term7004, term7004.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term7003, term7003.getClass(), "intVal", term7004);
        setIntField(term7003, term7003.getClass(), "scale", 53);
        setIntField(term7003, term7003.getClass(), "precision", 0);
        setField(term7003, term7003.getClass(), "stringCache", null);
        setLongField(term7003, term7003.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.math.BigDecimal");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term6918;
        args[1] = "NTlKJDDWlk";
        args[2] = term7003;
        args[3] = "vOuMEpOQAg";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


