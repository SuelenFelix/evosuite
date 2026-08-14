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

public class Account_setId_5315508856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1797;

    public Account_setId_5315508856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1866 = new Long(0L);
        Integer term1868 = new Integer(0);
        term1797 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term1810 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1849 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1850 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1852 = (int[]) newIntArray(6);
        setField(term1797, term1797.getClass(), "id", "TJmVBGfTML");
        setIntField(term1810, term1810.getClass(), "nanos", 689000000);
        setLongField(term1810, term1810.getClass(), "fastTime", 1550688194000L);
        setField(term1810, term1810.getClass(), "cdate", null);
        setField(term1797, term1797.getClass(), "createTime", term1810);
        setField(term1797, term1797.getClass(), "currency", "tPlsykYBqO");
        setField(term1797, term1797.getClass(), "accountName", "bLPjGVBhlX");
        setField(term1797, term1797.getClass(), "accountGroup", "whBvTVIIlC");
        setIntField(term1850, term1850.getClass(), "signum", 1);
        setIntElement(term1852, 0, 27489);
        setIntElement(term1852, 1, -274433180);
        setIntElement(term1852, 2, 698548608);
        setIntElement(term1852, 3, -1143703655);
        setIntElement(term1852, 4, 1619765041);
        setIntElement(term1852, 5, -418227111);
        setField(term1850, term1850.getClass(), "mag", term1852);
        setIntField(term1850, term1850.getClass(), "bitCountPlusOne", 0);
        setIntField(term1850, term1850.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1850, term1850.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1850, term1850.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1849, term1849.getClass(), "intVal", term1850);
        setIntField(term1849, term1849.getClass(), "scale", 53);
        setIntField(term1849, term1849.getClass(), "precision", 0);
        setField(term1849, term1849.getClass(), "stringCache", null);
        setLongField(term1849, term1849.getClass(), "intCompact", -9223372036854775808L);
        setField(term1797, term1797.getClass(), "balance", term1849);
        setField(term1797, term1797.getClass(), "kafkaOffset", term1866);
        setField(term1797, term1797.getClass(), "kafkaPartition", term1868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IgRJUzaCwW";
        callMethod(klass, "setId", argTypes, term1797, args);
    }

};


