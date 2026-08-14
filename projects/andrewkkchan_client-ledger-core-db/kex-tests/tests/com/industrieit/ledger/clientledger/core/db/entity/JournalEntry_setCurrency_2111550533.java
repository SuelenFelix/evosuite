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

public class JournalEntry_setCurrency_2111550533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4827;

    public JournalEntry_setCurrency_2111550533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4921 = new Long(0L);
        Integer term4923 = new Integer(0);
        term4827 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term4852 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term4865 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4904 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4905 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4907 = (int[]) newIntArray(6);
        Object term4937 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4940 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4941 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4943 = (int[]) newIntArray(6);
        setField(term4827, term4827.getClass(), "id", "xtftXXMbem");
        setField(term4827, term4827.getClass(), "requestId", "cudZvLMQon");
        setField(term4852, term4852.getClass(), "id", "lihXWlGDxk");
        setIntField(term4865, term4865.getClass(), "nanos", 394000000);
        setLongField(term4865, term4865.getClass(), "fastTime", 1362769763000L);
        setField(term4865, term4865.getClass(), "cdate", null);
        setField(term4852, term4852.getClass(), "createTime", term4865);
        setField(term4852, term4852.getClass(), "currency", "JmcmxoGhIK");
        setField(term4852, term4852.getClass(), "accountName", "jXzmYyrnnT");
        setField(term4852, term4852.getClass(), "accountGroup", "igCAtimmYB");
        setIntField(term4905, term4905.getClass(), "signum", 1);
        setIntElement(term4907, 0, 5222);
        setIntElement(term4907, 1, -454284340);
        setIntElement(term4907, 2, -1412298361);
        setIntElement(term4907, 3, -225970664);
        setIntElement(term4907, 4, -1354448185);
        setIntElement(term4907, 5, -1168679607);
        setField(term4905, term4905.getClass(), "mag", term4907);
        setIntField(term4905, term4905.getClass(), "bitCountPlusOne", 0);
        setIntField(term4905, term4905.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4905, term4905.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4905, term4905.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4904, term4904.getClass(), "intVal", term4905);
        setIntField(term4904, term4904.getClass(), "scale", 52);
        setIntField(term4904, term4904.getClass(), "precision", 0);
        setField(term4904, term4904.getClass(), "stringCache", null);
        setLongField(term4904, term4904.getClass(), "intCompact", -9223372036854775808L);
        setField(term4852, term4852.getClass(), "balance", term4904);
        setField(term4852, term4852.getClass(), "kafkaOffset", term4921);
        setField(term4852, term4852.getClass(), "kafkaPartition", term4923);
        setField(term4827, term4827.getClass(), "account", term4852);
        setField(term4827, term4827.getClass(), "currency", "DyiXbeYIaN");
        setIntField(term4937, term4937.getClass(), "nanos", 281000000);
        setLongField(term4937, term4937.getClass(), "fastTime", 1853953179000L);
        setField(term4937, term4937.getClass(), "cdate", null);
        setField(term4827, term4827.getClass(), "createTime", term4937);
        setIntField(term4941, term4941.getClass(), "signum", 1);
        setIntElement(term4943, 0, 92);
        setIntElement(term4943, 1, 1034738575);
        setIntElement(term4943, 2, -1456630577);
        setIntElement(term4943, 3, -1449292938);
        setIntElement(term4943, 4, -1319116780);
        setIntElement(term4943, 5, 1851590535);
        setField(term4941, term4941.getClass(), "mag", term4943);
        setIntField(term4941, term4941.getClass(), "bitCountPlusOne", 0);
        setIntField(term4941, term4941.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4941, term4941.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4941, term4941.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4940, term4940.getClass(), "intVal", term4941);
        setIntField(term4940, term4940.getClass(), "scale", 51);
        setIntField(term4940, term4940.getClass(), "precision", 0);
        setField(term4940, term4940.getClass(), "stringCache", null);
        setLongField(term4940, term4940.getClass(), "intCompact", -9223372036854775808L);
        setField(term4827, term4827.getClass(), "amount", term4940);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VGizxZnyHX";
        callMethod(klass, "setCurrency", argTypes, term4827, args);
    }

};


