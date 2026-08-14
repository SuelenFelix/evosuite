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

public class Account_getKafkaOffset_124124889613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2700;

    public Account_getKafkaOffset_124124889613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2769 = new Long(0L);
        Integer term2771 = new Integer(0);
        term2700 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2713 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2752 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2753 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2755 = (int[]) newIntArray(6);
        setField(term2700, term2700.getClass(), "id", "JiVRgTZvKc");
        setIntField(term2713, term2713.getClass(), "nanos", 573000000);
        setLongField(term2713, term2713.getClass(), "fastTime", 1329629467000L);
        setField(term2713, term2713.getClass(), "cdate", null);
        setField(term2700, term2700.getClass(), "createTime", term2713);
        setField(term2700, term2700.getClass(), "currency", "XPKmummaqg");
        setField(term2700, term2700.getClass(), "accountName", "BKLfkLiZTH");
        setField(term2700, term2700.getClass(), "accountGroup", "SPpkrGcPRr");
        setIntField(term2753, term2753.getClass(), "signum", 1);
        setIntElement(term2755, 0, 9405);
        setIntElement(term2755, 1, 205999050);
        setIntElement(term2755, 2, 647637684);
        setIntElement(term2755, 3, -896420066);
        setIntElement(term2755, 4, 1280002914);
        setIntElement(term2755, 5, 183404747);
        setField(term2753, term2753.getClass(), "mag", term2755);
        setIntField(term2753, term2753.getClass(), "bitCountPlusOne", 0);
        setIntField(term2753, term2753.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2753, term2753.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2753, term2753.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2752, term2752.getClass(), "intVal", term2753);
        setIntField(term2752, term2752.getClass(), "scale", 53);
        setIntField(term2752, term2752.getClass(), "precision", 0);
        setField(term2752, term2752.getClass(), "stringCache", null);
        setLongField(term2752, term2752.getClass(), "intCompact", -9223372036854775808L);
        setField(term2700, term2700.getClass(), "balance", term2752);
        setField(term2700, term2700.getClass(), "kafkaOffset", term2769);
        setField(term2700, term2700.getClass(), "kafkaPartition", term2771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKafkaOffset", argTypes, term2700, args);
    }

};


