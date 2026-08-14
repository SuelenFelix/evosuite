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

public class JournalEntry_getCurrency_17974974932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4615;

    public JournalEntry_getCurrency_17974974932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4709 = new Long(0L);
        Integer term4711 = new Integer(0);
        term4615 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry"));
        Object term4640 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term4653 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4692 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4693 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4695 = (int[]) newIntArray(6);
        Object term4725 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4728 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term4729 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term4731 = (int[]) newIntArray(6);
        setField(term4615, term4615.getClass(), "id", "XYtryyobou");
        setField(term4615, term4615.getClass(), "requestId", "OYbzXylRWW");
        setField(term4640, term4640.getClass(), "id", "DSNsTGYXDF");
        setIntField(term4653, term4653.getClass(), "nanos", 322000000);
        setLongField(term4653, term4653.getClass(), "fastTime", 1761983901000L);
        setField(term4653, term4653.getClass(), "cdate", null);
        setField(term4640, term4640.getClass(), "createTime", term4653);
        setField(term4640, term4640.getClass(), "currency", "sQvGcVjdEx");
        setField(term4640, term4640.getClass(), "accountName", "rLHAoqXgPh");
        setField(term4640, term4640.getClass(), "accountGroup", "zUlRdimJtU");
        setIntField(term4693, term4693.getClass(), "signum", 1);
        setIntElement(term4695, 0, 5883);
        setIntElement(term4695, 1, 833709085);
        setIntElement(term4695, 2, 749794735);
        setIntElement(term4695, 3, 825830368);
        setIntElement(term4695, 4, 935494074);
        setIntElement(term4695, 5, -2012885541);
        setField(term4693, term4693.getClass(), "mag", term4695);
        setIntField(term4693, term4693.getClass(), "bitCountPlusOne", 0);
        setIntField(term4693, term4693.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4693, term4693.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4693, term4693.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4692, term4692.getClass(), "intVal", term4693);
        setIntField(term4692, term4692.getClass(), "scale", 52);
        setIntField(term4692, term4692.getClass(), "precision", 0);
        setField(term4692, term4692.getClass(), "stringCache", null);
        setLongField(term4692, term4692.getClass(), "intCompact", -9223372036854775808L);
        setField(term4640, term4640.getClass(), "balance", term4692);
        setField(term4640, term4640.getClass(), "kafkaOffset", term4709);
        setField(term4640, term4640.getClass(), "kafkaPartition", term4711);
        setField(term4615, term4615.getClass(), "account", term4640);
        setField(term4615, term4615.getClass(), "currency", "vwbEQQNQrx");
        setIntField(term4725, term4725.getClass(), "nanos", 458000000);
        setLongField(term4725, term4725.getClass(), "fastTime", 1695414469000L);
        setField(term4725, term4725.getClass(), "cdate", null);
        setField(term4615, term4615.getClass(), "createTime", term4725);
        setIntField(term4729, term4729.getClass(), "signum", 1);
        setIntElement(term4731, 0, 29895);
        setIntElement(term4731, 1, 1752172477);
        setIntElement(term4731, 2, 1964732279);
        setIntElement(term4731, 3, 382594040);
        setIntElement(term4731, 4, 1485746598);
        setIntElement(term4731, 5, -1795307845);
        setField(term4729, term4729.getClass(), "mag", term4731);
        setIntField(term4729, term4729.getClass(), "bitCountPlusOne", 0);
        setIntField(term4729, term4729.getClass(), "bitLengthPlusOne", 0);
        setIntField(term4729, term4729.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term4729, term4729.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term4728, term4728.getClass(), "intVal", term4729);
        setIntField(term4728, term4728.getClass(), "scale", 53);
        setIntField(term4728, term4728.getClass(), "precision", 0);
        setField(term4728, term4728.getClass(), "stringCache", null);
        setLongField(term4728, term4728.getClass(), "intCompact", -9223372036854775808L);
        setField(term4615, term4615.getClass(), "amount", term4728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.JournalEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term4615, args);
    }

};


