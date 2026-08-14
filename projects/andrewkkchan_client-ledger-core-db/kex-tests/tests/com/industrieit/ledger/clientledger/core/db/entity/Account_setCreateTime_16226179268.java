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

public class Account_setCreateTime_16226179268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2057;
     Object term2130;

    public Account_setCreateTime_16226179268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2126 = new Long(0L);
        Integer term2128 = new Integer(0);
        term2057 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2070 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2109 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2110 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2112 = (int[]) newIntArray(6);
        setField(term2057, term2057.getClass(), "id", "oVgzLbrsFr");
        setIntField(term2070, term2070.getClass(), "nanos", 394000000);
        setLongField(term2070, term2070.getClass(), "fastTime", 1538068116000L);
        setField(term2070, term2070.getClass(), "cdate", null);
        setField(term2057, term2057.getClass(), "createTime", term2070);
        setField(term2057, term2057.getClass(), "currency", "vQVyKLdtaz");
        setField(term2057, term2057.getClass(), "accountName", "OWKQODBLzb");
        setField(term2057, term2057.getClass(), "accountGroup", "wGmYcqUkgE");
        setIntField(term2110, term2110.getClass(), "signum", 1);
        setIntElement(term2112, 0, 25264);
        setIntElement(term2112, 1, 13306318);
        setIntElement(term2112, 2, 145344007);
        setIntElement(term2112, 3, -1015263393);
        setIntElement(term2112, 4, -1366378930);
        setIntElement(term2112, 5, 983206517);
        setField(term2110, term2110.getClass(), "mag", term2112);
        setIntField(term2110, term2110.getClass(), "bitCountPlusOne", 0);
        setIntField(term2110, term2110.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2110, term2110.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2110, term2110.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2109, term2109.getClass(), "intVal", term2110);
        setIntField(term2109, term2109.getClass(), "scale", 53);
        setIntField(term2109, term2109.getClass(), "precision", 0);
        setField(term2109, term2109.getClass(), "stringCache", null);
        setLongField(term2109, term2109.getClass(), "intCompact", -9223372036854775808L);
        setField(term2057, term2057.getClass(), "balance", term2109);
        setField(term2057, term2057.getClass(), "kafkaOffset", term2126);
        setField(term2057, term2057.getClass(), "kafkaPartition", term2128);
        term2130 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term2130, term2130.getClass(), "nanos", 937000000);
        setLongField(term2130, term2130.getClass(), "fastTime", 1744079265000L);
        setField(term2130, term2130.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term2130;
        callMethod(klass, "setCreateTime", argTypes, term2057, args);
    }

};


