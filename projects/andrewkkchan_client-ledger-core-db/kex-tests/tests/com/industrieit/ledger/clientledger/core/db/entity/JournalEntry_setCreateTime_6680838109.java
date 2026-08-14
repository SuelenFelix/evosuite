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

public class JournalEntry_setCreateTime_6680838109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6260;
     Object term6389;

    public JournalEntry_setCreateTime_6680838109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6354 = new Long(0L);
        Integer term6356 = new Integer(0);
        term6260 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term6285 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term6298 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6337 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6338 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6340 = (int[]) newIntArray(6);
        Object term6370 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6373 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6374 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6376 = (int[]) newIntArray(5);
        setField(term6260, term6260.getClass(), "id", "WXMWFDGcLB");
        setField(term6260, term6260.getClass(), "requestId", "wKWbJssZuG");
        setField(term6285, term6285.getClass(), "id", "NzBMMhkhpT");
        setIntField(term6298, term6298.getClass(), "nanos", 432000000);
        setLongField(term6298, term6298.getClass(), "fastTime", 1332860905000L);
        setField(term6298, term6298.getClass(), "cdate", null);
        setField(term6285, term6285.getClass(), "createTime", term6298);
        setField(term6285, term6285.getClass(), "currency", "qCpEbQDHdF");
        setField(term6285, term6285.getClass(), "accountName", "AHbZyFOmlo");
        setField(term6285, term6285.getClass(), "accountGroup", "TwfWVQGiIj");
        setIntField(term6338, term6338.getClass(), "signum", 1);
        setIntElement(term6340, 0, 2454);
        setIntElement(term6340, 1, -2113177110);
        setIntElement(term6340, 2, 1797955482);
        setIntElement(term6340, 3, 2062976789);
        setIntElement(term6340, 4, -1123752995);
        setIntElement(term6340, 5, 1177879883);
        setField(term6338, term6338.getClass(), "mag", term6340);
        setIntField(term6338, term6338.getClass(), "bitCountPlusOne", 0);
        setIntField(term6338, term6338.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6338, term6338.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6338, term6338.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6337, term6337.getClass(), "intVal", term6338);
        setIntField(term6337, term6337.getClass(), "scale", 52);
        setIntField(term6337, term6337.getClass(), "precision", 0);
        setField(term6337, term6337.getClass(), "stringCache", null);
        setLongField(term6337, term6337.getClass(), "intCompact", -9223372036854775808L);
        setField(term6285, term6285.getClass(), "balance", term6337);
        setField(term6285, term6285.getClass(), "kafkaOffset", term6354);
        setField(term6285, term6285.getClass(), "kafkaPartition", term6356);
        setField(term6260, term6260.getClass(), "account", term6285);
        setField(term6260, term6260.getClass(), "currency", "gUvcueTURF");
        setIntField(term6370, term6370.getClass(), "nanos", 116000000);
        setLongField(term6370, term6370.getClass(), "fastTime", 1597223167000L);
        setField(term6370, term6370.getClass(), "cdate", null);
        setField(term6260, term6260.getClass(), "createTime", term6370);
        setIntField(term6374, term6374.getClass(), "signum", 1);
        setIntElement(term6376, 0, -2002033409);
        setIntElement(term6376, 1, -1386179650);
        setIntElement(term6376, 2, -1729534613);
        setIntElement(term6376, 3, 1100074383);
        setIntElement(term6376, 4, -1610460545);
        setField(term6374, term6374.getClass(), "mag", term6376);
        setIntField(term6374, term6374.getClass(), "bitCountPlusOne", 0);
        setIntField(term6374, term6374.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6374, term6374.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6374, term6374.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6373, term6373.getClass(), "intVal", term6374);
        setIntField(term6373, term6373.getClass(), "scale", 49);
        setIntField(term6373, term6373.getClass(), "precision", 0);
        setField(term6373, term6373.getClass(), "stringCache", null);
        setLongField(term6373, term6373.getClass(), "intCompact", -9223372036854775808L);
        setField(term6260, term6260.getClass(), "amount", term6373);
        term6389 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term6389, term6389.getClass(), "nanos", 937000000);
        setLongField(term6389, term6389.getClass(), "fastTime", 1276494597000L);
        setField(term6389, term6389.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term6389;
        callMethod(klass, "setCreateTime", argTypes, term6260, args);
    }

};


