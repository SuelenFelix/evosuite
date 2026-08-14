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

public class JournalEntry_getAccount_9995104506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5507;

    public JournalEntry_getAccount_9995104506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5601 = new Long(0L);
        Integer term5603 = new Integer(0);
        term5507 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term5532 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term5545 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5584 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5585 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5587 = (int[]) newIntArray(6);
        Object term5617 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5620 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5621 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5623 = (int[]) newIntArray(6);
        setField(term5507, term5507.getClass(), "id", "kGMQdqJYyB");
        setField(term5507, term5507.getClass(), "requestId", "XJJNClzHRf");
        setField(term5532, term5532.getClass(), "id", "HDaezxQfQR");
        setIntField(term5545, term5545.getClass(), "nanos", 243000000);
        setLongField(term5545, term5545.getClass(), "fastTime", 1393189235000L);
        setField(term5545, term5545.getClass(), "cdate", null);
        setField(term5532, term5532.getClass(), "createTime", term5545);
        setField(term5532, term5532.getClass(), "currency", "iikZEapDlu");
        setField(term5532, term5532.getClass(), "accountName", "nhoHrZfnIN");
        setField(term5532, term5532.getClass(), "accountGroup", "ZkMALXpEAZ");
        setIntField(term5585, term5585.getClass(), "signum", 1);
        setIntElement(term5587, 0, 786);
        setIntElement(term5587, 1, 1645098337);
        setIntElement(term5587, 2, -1661047007);
        setIntElement(term5587, 3, 638909622);
        setIntElement(term5587, 4, 5733837);
        setIntElement(term5587, 5, 1325345559);
        setField(term5585, term5585.getClass(), "mag", term5587);
        setIntField(term5585, term5585.getClass(), "bitCountPlusOne", 0);
        setIntField(term5585, term5585.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5585, term5585.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5585, term5585.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5584, term5584.getClass(), "intVal", term5585);
        setIntField(term5584, term5584.getClass(), "scale", 52);
        setIntField(term5584, term5584.getClass(), "precision", 0);
        setField(term5584, term5584.getClass(), "stringCache", null);
        setLongField(term5584, term5584.getClass(), "intCompact", -9223372036854775808L);
        setField(term5532, term5532.getClass(), "balance", term5584);
        setField(term5532, term5532.getClass(), "kafkaOffset", term5601);
        setField(term5532, term5532.getClass(), "kafkaPartition", term5603);
        setField(term5507, term5507.getClass(), "account", term5532);
        setField(term5507, term5507.getClass(), "currency", "tXfQjSqDzN");
        setIntField(term5617, term5617.getClass(), "nanos", 299000000);
        setLongField(term5617, term5617.getClass(), "fastTime", 1762136641000L);
        setField(term5617, term5617.getClass(), "cdate", null);
        setField(term5507, term5507.getClass(), "createTime", term5617);
        setIntField(term5621, term5621.getClass(), "signum", 1);
        setIntElement(term5623, 0, 25426);
        setIntElement(term5623, 1, -543058641);
        setIntElement(term5623, 2, -2089171980);
        setIntElement(term5623, 3, -1455996494);
        setIntElement(term5623, 4, 401076257);
        setIntElement(term5623, 5, 615822889);
        setField(term5621, term5621.getClass(), "mag", term5623);
        setIntField(term5621, term5621.getClass(), "bitCountPlusOne", 0);
        setIntField(term5621, term5621.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5621, term5621.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5621, term5621.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5620, term5620.getClass(), "intVal", term5621);
        setIntField(term5620, term5620.getClass(), "scale", 53);
        setIntField(term5620, term5620.getClass(), "precision", 0);
        setField(term5620, term5620.getClass(), "stringCache", null);
        setLongField(term5620, term5620.getClass(), "intCompact", -9223372036854775808L);
        setField(term5507, term5507.getClass(), "amount", term5620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccount", argTypes, term5507, args);
    }

};


