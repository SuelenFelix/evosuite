package com.example.web_shop.entity;

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
import static com.example.web_shop.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Product_equals_198339572914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2080;
     Object term2155;

    public Product_equals_198339572914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2109 = new HashMap();
        Set<Object> term2176 =  ((Map) term2109).keySet();
        HashSet term2108 = new HashSet((Collection<? extends Object>) term2176);
        term2080 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term2094 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term2138 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2139 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2141 = (int[]) newIntArray(6);
        setLongField(term2080, term2080.getClass(), "id", -3838084482494604218L);
        setField(term2080, term2080.getClass(), "name", "eVpkWxjuki");
        setLongField(term2094, term2094.getClass(), "id", 3892018155439224435L);
        setField(term2094, term2094.getClass(), "categoryName", "SJiQaLvSKv");
        setField(term2094, term2094.getClass(), "books", term2108);
        setField(term2080, term2080.getClass(), "category", term2094);
        setField(term2080, term2080.getClass(), "description", "OEXDRUKcFl");
        setField(term2080, term2080.getClass(), "image_url", "RYdKCNNMBR");
        setIntField(term2139, term2139.getClass(), "signum", 1);
        setIntElement(term2141, 0, 26001);
        setIntElement(term2141, 1, 1123266030);
        setIntElement(term2141, 2, 1277036849);
        setIntElement(term2141, 3, 2128028609);
        setIntElement(term2141, 4, -171954480);
        setIntElement(term2141, 5, -1359520521);
        setField(term2139, term2139.getClass(), "mag", term2141);
        setIntField(term2139, term2139.getClass(), "bitCountPlusOne", 0);
        setIntField(term2139, term2139.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2139, term2139.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2139, term2139.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2138, term2138.getClass(), "intVal", term2139);
        setIntField(term2138, term2138.getClass(), "scale", 53);
        setIntField(term2138, term2138.getClass(), "precision", 0);
        setField(term2138, term2138.getClass(), "stringCache", null);
        setLongField(term2138, term2138.getClass(), "intCompact", -9223372036854775808L);
        setField(term2080, term2080.getClass(), "price", term2138);
        term2155 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2155;
        callMethod(klass, "equals", argTypes, term2080, args);
    }

};


