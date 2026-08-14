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

public class JournalEntry_setRequestId_4380287021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4381;

    public JournalEntry_setRequestId_4380287021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4475 = new Long(0L);
        Integer term4477 = new Integer(0);
        term4381 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term4406 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term4419 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4458 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4459 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4461 = (int[]) newIntArray(6);
        Object term4491 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4494 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4495 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4497 = (int[]) newIntArray(6);
        setField(term4381, term4381.getClass(), "id", "hMmaoREuCK");
        setField(term4381, term4381.getClass(), "requestId", "VeDtgDzGAN");
        setField(term4406, term4406.getClass(), "id", "aWYOWZFyaX");
        setIntField(term4419, term4419.getClass(), "nanos", 698000000);
        setLongField(term4419, term4419.getClass(), "fastTime", 1400680978000L);
        setField(term4419, term4419.getClass(), "cdate", null);
        setField(term4406, term4406.getClass(), "createTime", term4419);
        setField(term4406, term4406.getClass(), "currency", "BRIVNtfUWU");
        setField(term4406, term4406.getClass(), "accountName", "DbiCVtPPCT");
        setField(term4406, term4406.getClass(), "accountGroup", "WzFopsaDuG");
        setIntField(term4459, term4459.getClass(), "signum", 1);
        setIntElement(term4461, 0, 5017);
        setIntElement(term4461, 1, 1138264108);
        setIntElement(term4461, 2, 138609451);
        setIntElement(term4461, 3, -559929925);
        setIntElement(term4461, 4, -1000035065);
        setIntElement(term4461, 5, 1199074337);
        setField(term4459, term4459.getClass(), "mag", term4461);
        setIntField(term4459, term4459.getClass(), "bitCountPlusOne", 0);
        setIntField(term4459, term4459.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4459, term4459.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4459, term4459.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4458, term4458.getClass(), "intVal", term4459);
        setIntField(term4458, term4458.getClass(), "scale", 52);
        setIntField(term4458, term4458.getClass(), "precision", 0);
        setField(term4458, term4458.getClass(), "stringCache", null);
        setLongField(term4458, term4458.getClass(), "intCompact", -9223372036854775808L);
        setField(term4406, term4406.getClass(), "balance", term4458);
        setField(term4406, term4406.getClass(), "kafkaOffset", term4475);
        setField(term4406, term4406.getClass(), "kafkaPartition", term4477);
        setField(term4381, term4381.getClass(), "account", term4406);
        setField(term4381, term4381.getClass(), "currency", "PapWxkhEWe");
        setIntField(term4491, term4491.getClass(), "nanos", 811000000);
        setLongField(term4491, term4491.getClass(), "fastTime", 1741433763000L);
        setField(term4491, term4491.getClass(), "cdate", null);
        setField(term4381, term4381.getClass(), "createTime", term4491);
        setIntField(term4495, term4495.getClass(), "signum", 1);
        setIntElement(term4497, 0, 31263);
        setIntElement(term4497, 1, -1965314916);
        setIntElement(term4497, 2, -443046697);
        setIntElement(term4497, 3, -1268253260);
        setIntElement(term4497, 4, -877110081);
        setIntElement(term4497, 5, -1376525969);
        setField(term4495, term4495.getClass(), "mag", term4497);
        setIntField(term4495, term4495.getClass(), "bitCountPlusOne", 0);
        setIntField(term4495, term4495.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4495, term4495.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4495, term4495.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4494, term4494.getClass(), "intVal", term4495);
        setIntField(term4494, term4494.getClass(), "scale", 53);
        setIntField(term4494, term4494.getClass(), "precision", 0);
        setField(term4494, term4494.getClass(), "stringCache", null);
        setLongField(term4494, term4494.getClass(), "intCompact", -9223372036854775808L);
        setField(term4381, term4381.getClass(), "amount", term4494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "smnHEqRFRx";
        callMethod(klass, "setRequestId", argTypes, term4381, args);
    }

};


