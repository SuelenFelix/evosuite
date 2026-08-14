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

public class Product_getPrice_133084435312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1813;

    public Product_getPrice_133084435312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1842 = new HashMap();
        Set<Object> term1908 =  ((Map) term1842).keySet();
        HashSet term1841 = new HashSet((Collection<? extends Object>) term1908);
        term1813 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term1827 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term1871 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1872 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1874 = (int[]) newIntArray(6);
        setLongField(term1813, term1813.getClass(), "id", -2644215923136513282L);
        setField(term1813, term1813.getClass(), "name", "AWRooQKkdW");
        setLongField(term1827, term1827.getClass(), "id", -1468719814009985452L);
        setField(term1827, term1827.getClass(), "categoryName", "vjxIhXHxGR");
        setField(term1827, term1827.getClass(), "books", term1841);
        setField(term1813, term1813.getClass(), "category", term1827);
        setField(term1813, term1813.getClass(), "description", "QXzGXbEXMu");
        setField(term1813, term1813.getClass(), "image_url", "qxSDVejjiY");
        setIntField(term1872, term1872.getClass(), "signum", 1);
        setIntElement(term1874, 0, 29895);
        setIntElement(term1874, 1, 1752172477);
        setIntElement(term1874, 2, 1964732279);
        setIntElement(term1874, 3, 382594040);
        setIntElement(term1874, 4, 1485746598);
        setIntElement(term1874, 5, -1795307845);
        setField(term1872, term1872.getClass(), "mag", term1874);
        setIntField(term1872, term1872.getClass(), "bitCountPlusOne", 0);
        setIntField(term1872, term1872.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1872, term1872.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1872, term1872.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1871, term1871.getClass(), "intVal", term1872);
        setIntField(term1871, term1871.getClass(), "scale", 53);
        setIntField(term1871, term1871.getClass(), "precision", 0);
        setField(term1871, term1871.getClass(), "stringCache", null);
        setLongField(term1871, term1871.getClass(), "intCompact", -9223372036854775808L);
        setField(term1813, term1813.getClass(), "price", term1871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term1813, args);
    }

};


