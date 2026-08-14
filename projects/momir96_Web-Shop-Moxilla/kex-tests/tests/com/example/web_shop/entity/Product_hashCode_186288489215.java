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

public class Product_hashCode_186288489215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2203;

    public Product_hashCode_186288489215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2232 = new HashMap();
        Set<Object> term2298 =  ((Map) term2232).keySet();
        HashSet term2231 = new HashSet((Collection<? extends Object>) term2298);
        term2203 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term2217 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term2261 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2262 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2264 = (int[]) newIntArray(6);
        setLongField(term2203, term2203.getClass(), "id", 5953383087795962419L);
        setField(term2203, term2203.getClass(), "name", "yGtHPyvYiQ");
        setLongField(term2217, term2217.getClass(), "id", 7994303628307559416L);
        setField(term2217, term2217.getClass(), "categoryName", "MvRIxilFMJ");
        setField(term2217, term2217.getClass(), "books", term2231);
        setField(term2203, term2203.getClass(), "category", term2217);
        setField(term2203, term2203.getClass(), "description", "iNwOJRBEjp");
        setField(term2203, term2203.getClass(), "image_url", "XylxrMBraH");
        setIntField(term2262, term2262.getClass(), "signum", 1);
        setIntElement(term2264, 0, 3996);
        setIntElement(term2264, 1, 1627046923);
        setIntElement(term2264, 2, -1280614629);
        setIntElement(term2264, 3, 917260100);
        setIntElement(term2264, 4, -74841886);
        setIntElement(term2264, 5, 597293319);
        setField(term2262, term2262.getClass(), "mag", term2264);
        setIntField(term2262, term2262.getClass(), "bitCountPlusOne", 0);
        setIntField(term2262, term2262.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2262, term2262.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2262, term2262.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2261, term2261.getClass(), "intVal", term2262);
        setIntField(term2261, term2261.getClass(), "scale", 52);
        setIntField(term2261, term2261.getClass(), "precision", 0);
        setField(term2261, term2261.getClass(), "stringCache", null);
        setLongField(term2261, term2261.getClass(), "intCompact", -9223372036854775808L);
        setField(term2203, term2203.getClass(), "price", term2261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2203, args);
    }

};


