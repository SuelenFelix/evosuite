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

public class Account_getKafkaPartition_184155486315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2940;

    public Account_getKafkaPartition_184155486315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3009 = new Long(0L);
        Integer term3011 = new Integer(0);
        term2940 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term2953 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term2992 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2993 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2995 = (int[]) newIntArray(6);
        setField(term2940, term2940.getClass(), "id", "qxSDVejjiY");
        setIntField(term2953, term2953.getClass(), "nanos", 764000000);
        setLongField(term2953, term2953.getClass(), "fastTime", 1496849028000L);
        setField(term2953, term2953.getClass(), "cdate", null);
        setField(term2940, term2940.getClass(), "createTime", term2953);
        setField(term2940, term2940.getClass(), "currency", "xBsXSDjXYK");
        setField(term2940, term2940.getClass(), "accountName", "sEnIVFtZuQ");
        setField(term2940, term2940.getClass(), "accountGroup", "ZVecLZMLHF");
        setIntField(term2993, term2993.getClass(), "signum", 1);
        setIntElement(term2995, 0, 65188);
        setIntElement(term2995, 1, 1319681440);
        setIntElement(term2995, 2, -739534113);
        setIntElement(term2995, 3, -1337808284);
        setIntElement(term2995, 4, 786647436);
        setIntElement(term2995, 5, -1827169985);
        setField(term2993, term2993.getClass(), "mag", term2995);
        setIntField(term2993, term2993.getClass(), "bitCountPlusOne", 0);
        setIntField(term2993, term2993.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2993, term2993.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2993, term2993.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2992, term2992.getClass(), "intVal", term2993);
        setIntField(term2992, term2992.getClass(), "scale", 53);
        setIntField(term2992, term2992.getClass(), "precision", 0);
        setField(term2992, term2992.getClass(), "stringCache", null);
        setLongField(term2992, term2992.getClass(), "intCompact", -9223372036854775808L);
        setField(term2940, term2940.getClass(), "balance", term2992);
        setField(term2940, term2940.getClass(), "kafkaOffset", term3009);
        setField(term2940, term2940.getClass(), "kafkaPartition", term3011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKafkaPartition", argTypes, term2940, args);
    }

};


