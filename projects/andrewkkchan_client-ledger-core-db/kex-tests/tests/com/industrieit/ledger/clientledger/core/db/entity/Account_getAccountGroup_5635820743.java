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

public class Account_getAccountGroup_5635820743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1418;

    public Account_getAccountGroup_5635820743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1487 = new Long(0L);
        Integer term1489 = new Integer(0);
        term1418 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term1431 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1470 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1471 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1473 = (int[]) newIntArray(6);
        setField(term1418, term1418.getClass(), "id", "onpbIeEKoi");
        setIntField(term1431, term1431.getClass(), "nanos", 580000000);
        setLongField(term1431, term1431.getClass(), "fastTime", 1437746523000L);
        setField(term1431, term1431.getClass(), "cdate", null);
        setField(term1418, term1418.getClass(), "createTime", term1431);
        setField(term1418, term1418.getClass(), "currency", "YRHGsAkhxb");
        setField(term1418, term1418.getClass(), "accountName", "ffYhPOzlUs");
        setField(term1418, term1418.getClass(), "accountGroup", "MLqYREekMl");
        setIntField(term1471, term1471.getClass(), "signum", 1);
        setIntElement(term1473, 0, 3779);
        setIntElement(term1473, 1, 1825499203);
        setIntElement(term1473, 2, 189827582);
        setIntElement(term1473, 3, 731025545);
        setIntElement(term1473, 4, -475097163);
        setIntElement(term1473, 5, 890127363);
        setField(term1471, term1471.getClass(), "mag", term1473);
        setIntField(term1471, term1471.getClass(), "bitCountPlusOne", 0);
        setIntField(term1471, term1471.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1471, term1471.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1471, term1471.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1470, term1470.getClass(), "intVal", term1471);
        setIntField(term1470, term1470.getClass(), "scale", 52);
        setIntField(term1470, term1470.getClass(), "precision", 0);
        setField(term1470, term1470.getClass(), "stringCache", null);
        setLongField(term1470, term1470.getClass(), "intCompact", -9223372036854775808L);
        setField(term1418, term1418.getClass(), "balance", term1470);
        setField(term1418, term1418.getClass(), "kafkaOffset", term1487);
        setField(term1418, term1418.getClass(), "kafkaPartition", term1489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountGroup", argTypes, term1418, args);
    }

};


