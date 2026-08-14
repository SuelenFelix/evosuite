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

public class Product_setCategory_16895156887 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1128;
     Object term1203;

    public Product_setCategory_16895156887() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1157 = new HashMap();
        Set<Object> term1243 =  ((Map) term1157).keySet();
        HashSet term1156 = new HashSet((Collection<? extends Object>) term1243);
        term1128 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term1142 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term1186 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1187 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1189 = (int[]) newIntArray(6);
        setLongField(term1128, term1128.getClass(), "id", -6645965768855543712L);
        setField(term1128, term1128.getClass(), "name", "wGmYcqUkgE");
        setLongField(term1142, term1142.getClass(), "id", 4784595517102746672L);
        setField(term1142, term1142.getClass(), "categoryName", "idgaQsnJpQ");
        setField(term1142, term1142.getClass(), "books", term1156);
        setField(term1128, term1128.getClass(), "category", term1142);
        setField(term1128, term1128.getClass(), "description", "VgZnGoIFwQ");
        setField(term1128, term1128.getClass(), "image_url", "jUbSRrkrYZ");
        setIntField(term1187, term1187.getClass(), "signum", 1);
        setIntElement(term1189, 0, 190);
        setIntElement(term1189, 1, 842222845);
        setIntElement(term1189, 2, 1366336864);
        setIntElement(term1189, 3, -295316729);
        setIntElement(term1189, 4, 1173791667);
        setIntElement(term1189, 5, -522535689);
        setField(term1187, term1187.getClass(), "mag", term1189);
        setIntField(term1187, term1187.getClass(), "bitCountPlusOne", 0);
        setIntField(term1187, term1187.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1187, term1187.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1187, term1187.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1186, term1186.getClass(), "intVal", term1187);
        setIntField(term1186, term1186.getClass(), "scale", 51);
        setIntField(term1186, term1186.getClass(), "precision", 0);
        setField(term1186, term1186.getClass(), "stringCache", null);
        setLongField(term1186, term1186.getClass(), "intCompact", -9223372036854775808L);
        setField(term1128, term1128.getClass(), "price", term1186);
        HashMap term1218 = new HashMap();
        Set<Object> term1280 =  ((Map) term1218).keySet();
        HashSet term1217 = new HashSet((Collection<? extends Object>) term1280);
        term1203 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        setLongField(term1203, term1203.getClass(), "id", -7612550318181586304L);
        setField(term1203, term1203.getClass(), "categoryName", "bWWfajKbEX");
        setField(term1203, term1203.getClass(), "books", term1217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.web_shop.entity.Category");
        Object[] args = new Object[1];
        args[0] = term1203;
        callMethod(klass, "setCategory", argTypes, term1128, args);
    }

};


