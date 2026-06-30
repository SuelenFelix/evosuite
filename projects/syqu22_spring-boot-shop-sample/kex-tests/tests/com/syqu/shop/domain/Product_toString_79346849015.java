package com.syqu.shop.domain;

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
import static com.syqu.shop.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Product_toString_79346849015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1832;

    public Product_toString_79346849015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1861 = new HashMap();
        Set<Object> term1927 =  ((Map) term1861).keySet();
        HashSet term1860 = new HashSet((Collection<? extends Object>) term1927);
        term1832 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term1846 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term1890 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1891 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1893 = (int[]) newIntArray(6);
        setLongField(term1832, term1832.getClass(), "id", 6855071767938501807L);
        setField(term1832, term1832.getClass(), "name", "ieCtQFdkii");
        setLongField(term1846, term1846.getClass(), "id", -5892135042702373494L);
        setField(term1846, term1846.getClass(), "categoryName", "dEnhdmILtU");
        setField(term1846, term1846.getClass(), "books", term1860);
        setField(term1832, term1832.getClass(), "category", term1846);
        setField(term1832, term1832.getClass(), "description", "hoicvmsovO");
        setField(term1832, term1832.getClass(), "imageUrl", "eqJfYWRaEL");
        setIntField(term1891, term1891.getClass(), "signum", 1);
        setIntElement(term1893, 0, 65188);
        setIntElement(term1893, 1, 1319681440);
        setIntElement(term1893, 2, -739534113);
        setIntElement(term1893, 3, -1337808284);
        setIntElement(term1893, 4, 786647436);
        setIntElement(term1893, 5, -1827169985);
        setField(term1891, term1891.getClass(), "mag", term1893);
        setIntField(term1891, term1891.getClass(), "bitCountPlusOne", 0);
        setIntField(term1891, term1891.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1891, term1891.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1891, term1891.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1890, term1890.getClass(), "intVal", term1891);
        setIntField(term1890, term1890.getClass(), "scale", 53);
        setIntField(term1890, term1890.getClass(), "precision", 0);
        setField(term1890, term1890.getClass(), "stringCache", null);
        setLongField(term1890, term1890.getClass(), "intCompact", -9223372036854775808L);
        setField(term1832, term1832.getClass(), "price", term1890);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1832, args);
    }

};


