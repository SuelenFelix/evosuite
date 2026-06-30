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

public class Product_setName_138158731910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1102;

    public Product_setName_138158731910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1131 = new HashMap();
        Set<Object> term1209 =  ((Map) term1131).keySet();
        HashSet term1130 = new HashSet((Collection<? extends Object>) term1209);
        term1102 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term1116 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term1160 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1161 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1163 = (int[]) newIntArray(6);
        setLongField(term1102, term1102.getClass(), "id", -4920224193275732920L);
        setField(term1102, term1102.getClass(), "name", "xrwlQZdwCp");
        setLongField(term1116, term1116.getClass(), "id", 8428634514691209827L);
        setField(term1116, term1116.getClass(), "categoryName", "IDCWpPLRkE");
        setField(term1116, term1116.getClass(), "books", term1130);
        setField(term1102, term1102.getClass(), "category", term1116);
        setField(term1102, term1102.getClass(), "description", "nyiiPDVjAc");
        setField(term1102, term1102.getClass(), "imageUrl", "aKnKipADSo");
        setIntField(term1161, term1161.getClass(), "signum", 1);
        setIntElement(term1163, 0, 2584);
        setIntElement(term1163, 1, -1946484122);
        setIntElement(term1163, 2, 1992026795);
        setIntElement(term1163, 3, 1045205752);
        setIntElement(term1163, 4, 613377469);
        setIntElement(term1163, 5, -1848020175);
        setField(term1161, term1161.getClass(), "mag", term1163);
        setIntField(term1161, term1161.getClass(), "bitCountPlusOne", 0);
        setIntField(term1161, term1161.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1161, term1161.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1161, term1161.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1160, term1160.getClass(), "intVal", term1161);
        setIntField(term1160, term1160.getClass(), "scale", 52);
        setIntField(term1160, term1160.getClass(), "precision", 0);
        setField(term1160, term1160.getClass(), "stringCache", null);
        setLongField(term1160, term1160.getClass(), "intCompact", -9223372036854775808L);
        setField(term1102, term1102.getClass(), "price", term1160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wSQxaModmm";
        callMethod(klass, "setName", argTypes, term1102, args);
    }

};


