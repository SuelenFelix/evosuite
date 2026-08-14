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

public class Account_getCreateTime_13638450127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1938;

    public Account_getCreateTime_13638450127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2007 = new Long(0L);
        Integer term2009 = new Integer(0);
        term1938 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term1951 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1990 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1991 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1993 = (int[]) newIntArray(6);
        setField(term1938, term1938.getClass(), "id", "JUmudUmaaV");
        setIntField(term1951, term1951.getClass(), "nanos", 131000000);
        setLongField(term1951, term1951.getClass(), "fastTime", 1804987287000L);
        setField(term1951, term1951.getClass(), "cdate", null);
        setField(term1938, term1938.getClass(), "createTime", term1951);
        setField(term1938, term1938.getClass(), "currency", "KoyGrUJeJW");
        setField(term1938, term1938.getClass(), "accountName", "HqBOwkVqjD");
        setField(term1938, term1938.getClass(), "accountGroup", "MAcUBcBckh");
        setIntField(term1991, term1991.getClass(), "signum", 1);
        setIntElement(term1993, 0, 1807);
        setIntElement(term1993, 1, 1210968587);
        setIntElement(term1993, 2, -857410878);
        setIntElement(term1993, 3, 520383771);
        setIntElement(term1993, 4, 2106706510);
        setIntElement(term1993, 5, 1731185477);
        setField(term1991, term1991.getClass(), "mag", term1993);
        setIntField(term1991, term1991.getClass(), "bitCountPlusOne", 0);
        setIntField(term1991, term1991.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1991, term1991.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1991, term1991.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1990, term1990.getClass(), "intVal", term1991);
        setIntField(term1990, term1990.getClass(), "scale", 52);
        setIntField(term1990, term1990.getClass(), "precision", 0);
        setField(term1990, term1990.getClass(), "stringCache", null);
        setLongField(term1990, term1990.getClass(), "intCompact", -9223372036854775808L);
        setField(term1938, term1938.getClass(), "balance", term1990);
        setField(term1938, term1938.getClass(), "kafkaOffset", term2007);
        setField(term1938, term1938.getClass(), "kafkaPartition", term2009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term1938, args);
    }

};


