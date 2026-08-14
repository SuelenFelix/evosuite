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

public class JournalEntry_setId_14860850015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5273;

    public JournalEntry_setId_14860850015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5367 = new Long(0L);
        Integer term5369 = new Integer(0);
        term5273 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term5298 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term5311 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5350 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5351 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5353 = (int[]) newIntArray(6);
        Object term5383 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5386 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term5387 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5389 = (int[]) newIntArray(6);
        setField(term5273, term5273.getClass(), "id", "vKQukfbJUd");
        setField(term5273, term5273.getClass(), "requestId", "lFRJFUMVbx");
        setField(term5298, term5298.getClass(), "id", "sZdUNdggUW");
        setIntField(term5311, term5311.getClass(), "nanos", 357000000);
        setLongField(term5311, term5311.getClass(), "fastTime", 1843204017000L);
        setField(term5311, term5311.getClass(), "cdate", null);
        setField(term5298, term5298.getClass(), "createTime", term5311);
        setField(term5298, term5298.getClass(), "currency", "OqbwYQfvAe");
        setField(term5298, term5298.getClass(), "accountName", "tRxZafjqIx");
        setField(term5298, term5298.getClass(), "accountGroup", "DhjNLmRMCu");
        setIntField(term5351, term5351.getClass(), "signum", 1);
        setIntElement(term5353, 0, 51722);
        setIntElement(term5353, 1, 1822015379);
        setIntElement(term5353, 2, 1030733959);
        setIntElement(term5353, 3, 1299891196);
        setIntElement(term5353, 4, 1679751767);
        setIntElement(term5353, 5, -572989409);
        setField(term5351, term5351.getClass(), "mag", term5353);
        setIntField(term5351, term5351.getClass(), "bitCountPlusOne", 0);
        setIntField(term5351, term5351.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5351, term5351.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5351, term5351.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5350, term5350.getClass(), "intVal", term5351);
        setIntField(term5350, term5350.getClass(), "scale", 53);
        setIntField(term5350, term5350.getClass(), "precision", 0);
        setField(term5350, term5350.getClass(), "stringCache", null);
        setLongField(term5350, term5350.getClass(), "intCompact", -9223372036854775808L);
        setField(term5298, term5298.getClass(), "balance", term5350);
        setField(term5298, term5298.getClass(), "kafkaOffset", term5367);
        setField(term5298, term5298.getClass(), "kafkaPartition", term5369);
        setField(term5273, term5273.getClass(), "account", term5298);
        setField(term5273, term5273.getClass(), "currency", "PgPzMSEjjX");
        setIntField(term5383, term5383.getClass(), "nanos", 832000000);
        setLongField(term5383, term5383.getClass(), "fastTime", 1628684516000L);
        setField(term5383, term5383.getClass(), "cdate", null);
        setField(term5273, term5273.getClass(), "createTime", term5383);
        setIntField(term5387, term5387.getClass(), "signum", 1);
        setIntElement(term5389, 0, 7298);
        setIntElement(term5389, 1, -1245459431);
        setIntElement(term5389, 2, 154872706);
        setIntElement(term5389, 3, -869635639);
        setIntElement(term5389, 4, 1023248111);
        setIntElement(term5389, 5, 1345698053);
        setField(term5387, term5387.getClass(), "mag", term5389);
        setIntField(term5387, term5387.getClass(), "bitCountPlusOne", 0);
        setIntField(term5387, term5387.getClass(), "bitLengthPlusOne", 0);
        setIntField(term5387, term5387.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term5387, term5387.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term5386, term5386.getClass(), "intVal", term5387);
        setIntField(term5386, term5386.getClass(), "scale", 53);
        setIntField(term5386, term5386.getClass(), "precision", 0);
        setField(term5386, term5386.getClass(), "stringCache", null);
        setLongField(term5386, term5386.getClass(), "intCompact", -9223372036854775808L);
        setField(term5273, term5273.getClass(), "amount", term5386);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wzsPSPcRdj";
        callMethod(klass, "setId", argTypes, term5273, args);
    }

};


