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

public class JournalEntry_getCreateTime_4093108968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6050;

    public JournalEntry_getCreateTime_4093108968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6144 = new Long(0L);
        Integer term6146 = new Integer(0);
        term6050 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term6075 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term6088 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6127 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6128 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6130 = (int[]) newIntArray(6);
        Object term6160 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6163 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term6164 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term6166 = (int[]) newIntArray(5);
        setField(term6050, term6050.getClass(), "id", "PCipZnmBOF");
        setField(term6050, term6050.getClass(), "requestId", "zcorEihhLK");
        setField(term6075, term6075.getClass(), "id", "GrqozDKFOk");
        setIntField(term6088, term6088.getClass(), "nanos", 543000000);
        setLongField(term6088, term6088.getClass(), "fastTime", 1345912703000L);
        setField(term6088, term6088.getClass(), "cdate", null);
        setField(term6075, term6075.getClass(), "createTime", term6088);
        setField(term6075, term6075.getClass(), "currency", "CFyoseFGLF");
        setField(term6075, term6075.getClass(), "accountName", "SFqCrhEWLm");
        setField(term6075, term6075.getClass(), "accountGroup", "GZdcJyZntS");
        setIntField(term6128, term6128.getClass(), "signum", 1);
        setIntElement(term6130, 0, 66623);
        setIntElement(term6130, 1, -721879507);
        setIntElement(term6130, 2, 685392094);
        setIntElement(term6130, 3, -309014712);
        setIntElement(term6130, 4, -2143218141);
        setIntElement(term6130, 5, -724344211);
        setField(term6128, term6128.getClass(), "mag", term6130);
        setIntField(term6128, term6128.getClass(), "bitCountPlusOne", 0);
        setIntField(term6128, term6128.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6128, term6128.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6128, term6128.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6127, term6127.getClass(), "intVal", term6128);
        setIntField(term6127, term6127.getClass(), "scale", 53);
        setIntField(term6127, term6127.getClass(), "precision", 0);
        setField(term6127, term6127.getClass(), "stringCache", null);
        setLongField(term6127, term6127.getClass(), "intCompact", -9223372036854775808L);
        setField(term6075, term6075.getClass(), "balance", term6127);
        setField(term6075, term6075.getClass(), "kafkaOffset", term6144);
        setField(term6075, term6075.getClass(), "kafkaPartition", term6146);
        setField(term6050, term6050.getClass(), "account", term6075);
        setField(term6050, term6050.getClass(), "currency", "OIHoJeysUi");
        setIntField(term6160, term6160.getClass(), "nanos", 277000000);
        setLongField(term6160, term6160.getClass(), "fastTime", 1838346979000L);
        setField(term6160, term6160.getClass(), "cdate", null);
        setField(term6050, term6050.getClass(), "createTime", term6160);
        setIntField(term6164, term6164.getClass(), "signum", 1);
        setIntElement(term6166, 0, 1965699107);
        setIntElement(term6166, 1, 276112590);
        setIntElement(term6166, 2, 1355446503);
        setIntElement(term6166, 3, 1278820088);
        setIntElement(term6166, 4, -472848849);
        setField(term6164, term6164.getClass(), "mag", term6166);
        setIntField(term6164, term6164.getClass(), "bitCountPlusOne", 0);
        setIntField(term6164, term6164.getClass(), "bitLengthPlusOne", 0);
        setIntField(term6164, term6164.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term6164, term6164.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term6163, term6163.getClass(), "intVal", term6164);
        setIntField(term6163, term6163.getClass(), "scale", 49);
        setIntField(term6163, term6163.getClass(), "precision", 0);
        setField(term6163, term6163.getClass(), "stringCache", null);
        setLongField(term6163, term6163.getClass(), "intCompact", -9223372036854775808L);
        setField(term6050, term6050.getClass(), "amount", term6163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateTime", argTypes, term6050, args);
    }

};


