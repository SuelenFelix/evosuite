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

public class Product_getCategory_10787027566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1006;

    public Product_getCategory_10787027566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1035 = new HashMap();
        Set<Object> term1101 =  ((Map) term1035).keySet();
        HashSet term1034 = new HashSet((Collection<? extends Object>) term1101);
        term1006 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term1020 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term1064 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1065 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1067 = (int[]) newIntArray(6);
        setLongField(term1006, term1006.getClass(), "id", -2068172595987555756L);
        setField(term1006, term1006.getClass(), "name", "MAcUBcBckh");
        setLongField(term1020, term1020.getClass(), "id", -6292278961887936280L);
        setField(term1020, term1020.getClass(), "categoryName", "oVgzLbrsFr");
        setField(term1020, term1020.getClass(), "books", term1034);
        setField(term1006, term1006.getClass(), "category", term1020);
        setField(term1006, term1006.getClass(), "description", "vQVyKLdtaz");
        setField(term1006, term1006.getClass(), "image_url", "OWKQODBLzb");
        setIntField(term1065, term1065.getClass(), "signum", 1);
        setIntElement(term1067, 0, 6724);
        setIntElement(term1067, 1, -459858691);
        setIntElement(term1067, 2, -950374219);
        setIntElement(term1067, 3, -1430160029);
        setIntElement(term1067, 4, 1532735250);
        setIntElement(term1067, 5, 890914777);
        setField(term1065, term1065.getClass(), "mag", term1067);
        setIntField(term1065, term1065.getClass(), "bitCountPlusOne", 0);
        setIntField(term1065, term1065.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1065, term1065.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1065, term1065.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1064, term1064.getClass(), "intVal", term1065);
        setIntField(term1064, term1064.getClass(), "scale", 52);
        setIntField(term1064, term1064.getClass(), "precision", 0);
        setField(term1064, term1064.getClass(), "stringCache", null);
        setLongField(term1064, term1064.getClass(), "intCompact", -9223372036854775808L);
        setField(term1006, term1006.getClass(), "price", term1064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term1006, args);
    }

};


