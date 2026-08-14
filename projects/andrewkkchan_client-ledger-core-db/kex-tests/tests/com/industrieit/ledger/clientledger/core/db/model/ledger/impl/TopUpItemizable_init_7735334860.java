package com.industrieit.ledger.clientledger.core.db.model.ledger.impl;

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
import static com.industrieit.ledger.clientledger.core.db.model.ledger.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class TopUpItemizable_init_7735334860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1772;
     Object term1845;
     Object term1918;

    public TopUpItemizable_init_7735334860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1841 = new Long(0L);
        Integer term1843 = new Integer(0);
        term1772 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term1785 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1824 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1825 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1827 = (int[]) newIntArray(6);
        setField(term1772, term1772.getClass(), "id", "onpbIeEKoi");
        setIntField(term1785, term1785.getClass(), "nanos", 80000000);
        setLongField(term1785, term1785.getClass(), "fastTime", 1745452162000L);
        setField(term1785, term1785.getClass(), "cdate", null);
        setField(term1772, term1772.getClass(), "createTime", term1785);
        setField(term1772, term1772.getClass(), "currency", "YRHGsAkhxb");
        setField(term1772, term1772.getClass(), "accountName", "ffYhPOzlUs");
        setField(term1772, term1772.getClass(), "accountGroup", "MLqYREekMl");
        setIntField(term1825, term1825.getClass(), "signum", 1);
        setIntElement(term1827, 0, 5883);
        setIntElement(term1827, 1, 833709085);
        setIntElement(term1827, 2, 749794735);
        setIntElement(term1827, 3, 825830368);
        setIntElement(term1827, 4, 935494074);
        setIntElement(term1827, 5, -2012885541);
        setField(term1825, term1825.getClass(), "mag", term1827);
        setIntField(term1825, term1825.getClass(), "bitCountPlusOne", 0);
        setIntField(term1825, term1825.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1825, term1825.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1825, term1825.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1824, term1824.getClass(), "intVal", term1825);
        setIntField(term1824, term1824.getClass(), "scale", 52);
        setIntField(term1824, term1824.getClass(), "precision", 0);
        setField(term1824, term1824.getClass(), "stringCache", null);
        setLongField(term1824, term1824.getClass(), "intCompact", -9223372036854775808L);
        setField(term1772, term1772.getClass(), "balance", term1824);
        setField(term1772, term1772.getClass(), "kafkaOffset", term1841);
        setField(term1772, term1772.getClass(), "kafkaPartition", term1843);
        Long term1914 = new Long(0L);
        Integer term1916 = new Integer(0);
        term1845 = newInstance(Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account"));
        Object term1858 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term1897 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1898 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1900 = (int[]) newIntArray(6);
        setField(term1845, term1845.getClass(), "id", "ytSBIKXogI");
        setIntField(term1858, term1858.getClass(), "nanos", 960000000);
        setLongField(term1858, term1858.getClass(), "fastTime", 1349058953000L);
        setField(term1858, term1858.getClass(), "cdate", null);
        setField(term1845, term1845.getClass(), "createTime", term1858);
        setField(term1845, term1845.getClass(), "currency", "nHXjMycHlU");
        setField(term1845, term1845.getClass(), "accountName", "ieCtQFdkii");
        setField(term1845, term1845.getClass(), "accountGroup", "dEnhdmILtU");
        setIntField(term1898, term1898.getClass(), "signum", 1);
        setIntElement(term1900, 0, 29895);
        setIntElement(term1900, 1, 1752172477);
        setIntElement(term1900, 2, 1964732279);
        setIntElement(term1900, 3, 382594040);
        setIntElement(term1900, 4, 1485746598);
        setIntElement(term1900, 5, -1795307845);
        setField(term1898, term1898.getClass(), "mag", term1900);
        setIntField(term1898, term1898.getClass(), "bitCountPlusOne", 0);
        setIntField(term1898, term1898.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1898, term1898.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1898, term1898.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1897, term1897.getClass(), "intVal", term1898);
        setIntField(term1897, term1897.getClass(), "scale", 53);
        setIntField(term1897, term1897.getClass(), "precision", 0);
        setField(term1897, term1897.getClass(), "stringCache", null);
        setLongField(term1897, term1897.getClass(), "intCompact", -9223372036854775808L);
        setField(term1845, term1845.getClass(), "balance", term1897);
        setField(term1845, term1845.getClass(), "kafkaOffset", term1914);
        setField(term1845, term1845.getClass(), "kafkaPartition", term1916);
        term1918 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1919 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1921 = (int[]) newIntArray(6);
        setIntField(term1919, term1919.getClass(), "signum", 1);
        setIntElement(term1921, 0, 5222);
        setIntElement(term1921, 1, -454284340);
        setIntElement(term1921, 2, -1412298361);
        setIntElement(term1921, 3, -225970664);
        setIntElement(term1921, 4, -1354448185);
        setIntElement(term1921, 5, -1168679607);
        setField(term1919, term1919.getClass(), "mag", term1921);
        setIntField(term1919, term1919.getClass(), "bitCountPlusOne", 0);
        setIntField(term1919, term1919.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1919, term1919.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1919, term1919.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1918, term1918.getClass(), "intVal", term1919);
        setIntField(term1918, term1918.getClass(), "scale", 52);
        setIntField(term1918, term1918.getClass(), "precision", 0);
        setField(term1918, term1918.getClass(), "stringCache", null);
        setLongField(term1918, term1918.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.ledger.impl.TopUpItemizable");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        argTypes[1] = Class.forName("com.industrieit.ledger.clientledger.core.db.entity.Account");
        argTypes[2] = Class.forName("java.math.BigDecimal");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term1772;
        args[1] = term1845;
        args[2] = term1918;
        args[3] = "hoicvmsovO";
        args[4] = "eqJfYWRaEL";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


