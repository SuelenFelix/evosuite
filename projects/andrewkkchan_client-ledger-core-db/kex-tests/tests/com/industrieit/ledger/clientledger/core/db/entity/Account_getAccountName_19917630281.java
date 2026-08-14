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

public class Account_getAccountName_19917630281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1158;

    public Account_getAccountName_19917630281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1227 = new Long(0L);
        Integer term1229 = new Integer(0);
        term1158 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term1171 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1210 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1211 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1213 = (int[]) newIntArray(6);
        setField(term1158, term1158.getClass(), "id", "GzFkzHGYFt");
        setIntField(term1171, term1171.getClass(), "nanos", 992000000);
        setLongField(term1171, term1171.getClass(), "fastTime", 1863620294000L);
        setField(term1171, term1171.getClass(), "cdate", null);
        setField(term1158, term1158.getClass(), "createTime", term1171);
        setField(term1158, term1158.getClass(), "currency", "tShwQLRGNe");
        setField(term1158, term1158.getClass(), "accountName", "LvtrsXUliU");
        setField(term1158, term1158.getClass(), "accountGroup", "xLbjWUgOIL");
        setIntField(term1211, term1211.getClass(), "signum", 1);
        setIntElement(term1213, 0, 9058);
        setIntElement(term1213, 1, 1365043541);
        setIntElement(term1213, 2, 1239861896);
        setIntElement(term1213, 3, -1338148297);
        setIntElement(term1213, 4, -418263970);
        setIntElement(term1213, 5, -265097411);
        setField(term1211, term1211.getClass(), "mag", term1213);
        setIntField(term1211, term1211.getClass(), "bitCountPlusOne", 0);
        setIntField(term1211, term1211.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1211, term1211.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1211, term1211.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1210, term1210.getClass(), "intVal", term1211);
        setIntField(term1210, term1210.getClass(), "scale", 53);
        setIntField(term1210, term1210.getClass(), "precision", 0);
        setField(term1210, term1210.getClass(), "stringCache", null);
        setLongField(term1210, term1210.getClass(), "intCompact", -9223372036854775808L);
        setField(term1158, term1158.getClass(), "balance", term1210);
        setField(term1158, term1158.getClass(), "kafkaOffset", term1227);
        setField(term1158, term1158.getClass(), "kafkaPartition", term1229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountName", argTypes, term1158, args);
    }

};


