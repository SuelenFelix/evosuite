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

public class JournalEntry_getAmount_212961622610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6473;

    public JournalEntry_getAmount_212961622610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6566 = new Long(0L);
        Integer term6568 = new Integer(0);
        term6473 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term6498 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term6511 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6550 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6551 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6553 = (int[]) newIntArray(5);
        Object term6582 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6585 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6586 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6588 = (int[]) newIntArray(6);
        setField(term6473, term6473.getClass(), "id", "EwQBhZjCIT");
        setField(term6473, term6473.getClass(), "requestId", "aSkmSwTnEw");
        setField(term6498, term6498.getClass(), "id", "xvkbvaEGYd");
        setIntField(term6511, term6511.getClass(), "nanos", 793000000);
        setLongField(term6511, term6511.getClass(), "fastTime", 1278166775000L);
        setField(term6511, term6511.getClass(), "cdate", null);
        setField(term6498, term6498.getClass(), "createTime", term6511);
        setField(term6498, term6498.getClass(), "currency", "HBGNxdNURv");
        setField(term6498, term6498.getClass(), "accountName", "mfCpTPPQQm");
        setField(term6498, term6498.getClass(), "accountGroup", "OcJCIDNIXA");
        setIntField(term6551, term6551.getClass(), "signum", 1);
        setIntElement(term6553, 0, 1551440818);
        setIntElement(term6553, 1, 344453067);
        setIntElement(term6553, 2, 133967669);
        setIntElement(term6553, 3, 381677751);
        setIntElement(term6553, 4, -305602591);
        setField(term6551, term6551.getClass(), "mag", term6553);
        setIntField(term6551, term6551.getClass(), "bitCountPlusOne", 0);
        setIntField(term6551, term6551.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6551, term6551.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6551, term6551.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6550, term6550.getClass(), "intVal", term6551);
        setIntField(term6550, term6550.getClass(), "scale", 48);
        setIntField(term6550, term6550.getClass(), "precision", 0);
        setField(term6550, term6550.getClass(), "stringCache", null);
        setLongField(term6550, term6550.getClass(), "intCompact", -9223372036854775808L);
        setField(term6498, term6498.getClass(), "balance", term6550);
        setField(term6498, term6498.getClass(), "kafkaOffset", term6566);
        setField(term6498, term6498.getClass(), "kafkaPartition", term6568);
        setField(term6473, term6473.getClass(), "account", term6498);
        setField(term6473, term6473.getClass(), "currency", "XfRABIFVEp");
        setIntField(term6582, term6582.getClass(), "nanos", 768000000);
        setLongField(term6582, term6582.getClass(), "fastTime", 1272765521000L);
        setField(term6582, term6582.getClass(), "cdate", null);
        setField(term6473, term6473.getClass(), "createTime", term6582);
        setIntField(term6586, term6586.getClass(), "signum", 1);
        setIntElement(term6588, 0, 21910);
        setIntElement(term6588, 1, 1232338756);
        setIntElement(term6588, 2, -1082493650);
        setIntElement(term6588, 3, 2096909910);
        setIntElement(term6588, 4, -386707863);
        setIntElement(term6588, 5, -1583619851);
        setField(term6586, term6586.getClass(), "mag", term6588);
        setIntField(term6586, term6586.getClass(), "bitCountPlusOne", 0);
        setIntField(term6586, term6586.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6586, term6586.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6586, term6586.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6585, term6585.getClass(), "intVal", term6586);
        setIntField(term6585, term6585.getClass(), "scale", 53);
        setIntField(term6585, term6585.getClass(), "precision", 0);
        setField(term6585, term6585.getClass(), "stringCache", null);
        setLongField(term6585, term6585.getClass(), "intCompact", -9223372036854775808L);
        setField(term6473, term6473.getClass(), "amount", term6585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term6473, args);
    }

};


