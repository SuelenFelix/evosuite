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

public class Product_getName_2203674634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740;

    public Product_getName_2203674634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term769 = new HashMap();
        Set<Object> term835 =  ((Map) term769).keySet();
        HashSet term768 = new HashSet((Collection<? extends Object>) term835);
        term740 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term754 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term798 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term799 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term801 = (int[]) newIntArray(6);
        setLongField(term740, term740.getClass(), "id", 1439298019805881866L);
        setField(term740, term740.getClass(), "name", "kBdSllIBVz");
        setLongField(term754, term754.getClass(), "id", -8708192233349544946L);
        setField(term754, term754.getClass(), "categoryName", "TJmVBGfTML");
        setField(term754, term754.getClass(), "books", term768);
        setField(term740, term740.getClass(), "category", term754);
        setField(term740, term740.getClass(), "description", "tPlsykYBqO");
        setField(term740, term740.getClass(), "image_url", "bLPjGVBhlX");
        setIntField(term799, term799.getClass(), "signum", 1);
        setIntElement(term801, 0, 48108);
        setIntElement(term801, 1, 419671270);
        setIntElement(term801, 2, 909082732);
        setIntElement(term801, 3, 2078883588);
        setIntElement(term801, 4, 1670017529);
        setIntElement(term801, 5, -2116499193);
        setField(term799, term799.getClass(), "mag", term801);
        setIntField(term799, term799.getClass(), "bitCountPlusOne", 0);
        setIntField(term799, term799.getClass(), "bitLengthPlusOne", 0);
        setIntField(term799, term799.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term799, term799.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term798, term798.getClass(), "intVal", term799);
        setIntField(term798, term798.getClass(), "scale", 53);
        setIntField(term798, term798.getClass(), "precision", 0);
        setField(term798, term798.getClass(), "stringCache", null);
        setLongField(term798, term798.getClass(), "intCompact", -9223372036854775808L);
        setField(term740, term740.getClass(), "price", term798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term740, args);
    }

};


