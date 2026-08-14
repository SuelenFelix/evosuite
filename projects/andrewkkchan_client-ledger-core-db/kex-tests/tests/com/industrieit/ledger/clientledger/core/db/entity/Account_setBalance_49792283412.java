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

public class Account_setBalance_49792283412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2558;
     Object term2631;

    public Account_setBalance_49792283412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2627 = new Long(0L);
        Integer term2629 = new Integer(0);
        term2558 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2571 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2610 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2611 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2613 = (int[]) newIntArray(6);
        setField(term2558, term2558.getClass(), "id", "JqXGgAhZPl");
        setIntField(term2571, term2571.getClass(), "nanos", 956000000);
        setLongField(term2571, term2571.getClass(), "fastTime", 1739406992000L);
        setField(term2571, term2571.getClass(), "cdate", null);
        setField(term2558, term2558.getClass(), "createTime", term2571);
        setField(term2558, term2558.getClass(), "currency", "jiKYgYHqIS");
        setField(term2558, term2558.getClass(), "accountName", "DfISiziTgG");
        setField(term2558, term2558.getClass(), "accountGroup", "XqgfKFvPSD");
        setIntField(term2611, term2611.getClass(), "signum", 1);
        setIntElement(term2613, 0, 35465);
        setIntElement(term2613, 1, 1599162976);
        setIntElement(term2613, 2, -1427811280);
        setIntElement(term2613, 3, -224241601);
        setIntElement(term2613, 4, -1115150417);
        setIntElement(term2613, 5, 212641299);
        setField(term2611, term2611.getClass(), "mag", term2613);
        setIntField(term2611, term2611.getClass(), "bitCountPlusOne", 0);
        setIntField(term2611, term2611.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2611, term2611.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2611, term2611.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2610, term2610.getClass(), "intVal", term2611);
        setIntField(term2610, term2610.getClass(), "scale", 53);
        setIntField(term2610, term2610.getClass(), "precision", 0);
        setField(term2610, term2610.getClass(), "stringCache", null);
        setLongField(term2610, term2610.getClass(), "intCompact", -9223372036854775808L);
        setField(term2558, term2558.getClass(), "balance", term2610);
        setField(term2558, term2558.getClass(), "kafkaOffset", term2627);
        setField(term2558, term2558.getClass(), "kafkaPartition", term2629);
        term2631 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2632 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2634 = (int[]) newIntArray(6);
        setIntField(term2632, term2632.getClass(), "signum", 1);
        setIntElement(term2634, 0, 523);
        setIntElement(term2634, 1, -954467915);
        setIntElement(term2634, 2, 1892307494);
        setIntElement(term2634, 3, -1066736592);
        setIntElement(term2634, 4, 433326655);
        setIntElement(term2634, 5, -242716133);
        setField(term2632, term2632.getClass(), "mag", term2634);
        setIntField(term2632, term2632.getClass(), "bitCountPlusOne", 0);
        setIntField(term2632, term2632.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2632, term2632.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2632, term2632.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2631, term2631.getClass(), "intVal", term2632);
        setIntField(term2631, term2631.getClass(), "scale", 51);
        setIntField(term2631, term2631.getClass(), "precision", 0);
        setField(term2631, term2631.getClass(), "stringCache", null);
        setLongField(term2631, term2631.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term2631;
        callMethod(klass, "setBalance", argTypes, term2558, args);
    }

};


