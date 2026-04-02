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

public class Product_equals_17529148550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term76;

    public Product_equals_17529148550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term30 = new HashMap();
        Set<Object> term97 =  ((Map) term30).keySet();
        HashSet term29 = new HashSet((Collection<? extends Object>) term97);
        term1 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term15 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term59 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term60 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term62 = (int[]) newIntArray(6);
        setLongField(term1, term1.getClass(), "id", 2442117782898005296L);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setLongField(term15, term15.getClass(), "id", 6375119433582206027L);
        setField(term15, term15.getClass(), "categoryName", "sjlJAEtRrb");
        setField(term15, term15.getClass(), "books", term29);
        setField(term1, term1.getClass(), "category", term15);
        setField(term1, term1.getClass(), "description", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "imageUrl", "xxtlPwDYFs");
        setIntField(term60, term60.getClass(), "signum", 1);
        setIntElement(term62, 0, 9058);
        setIntElement(term62, 1, 1365043541);
        setIntElement(term62, 2, 1239861896);
        setIntElement(term62, 3, -1338148297);
        setIntElement(term62, 4, -418263970);
        setIntElement(term62, 5, -265097411);
        setField(term60, term60.getClass(), "mag", term62);
        setIntField(term60, term60.getClass(), "bitCountPlusOne", 0);
        setIntField(term60, term60.getClass(), "bitLengthPlusOne", 0);
        setIntField(term60, term60.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term60, term60.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term59, term59.getClass(), "intVal", term60);
        setIntField(term59, term59.getClass(), "scale", 53);
        setIntField(term59, term59.getClass(), "precision", 0);
        setField(term59, term59.getClass(), "stringCache", null);
        setLongField(term59, term59.getClass(), "intCompact", -9223372036854775808L);
        setField(term1, term1.getClass(), "price", term59);
        term76 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term76;
        callMethod(klass, "equals", argTypes, term1, args);
    }

};


