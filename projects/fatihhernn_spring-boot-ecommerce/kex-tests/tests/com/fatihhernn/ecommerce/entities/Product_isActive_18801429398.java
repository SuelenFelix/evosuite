package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Product_isActive_18801429398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2284;

    public Product_isActive_18801429398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2285 = new Long(-7884871963229073324L);
        Long term2288 = new Long(-8649738738252714180L);
        HashMap term2303 = new HashMap();
        Set<Object> term2390 =  ((Map) term2303).keySet();
        HashSet term2302 = new HashSet((Collection<? extends Object>) term2390);
        term2284 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        Object term2287 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.ProductCategory"));
        Object term2345 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term2346 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term2348 = (int[]) newIntArray(6);
        Object term2376 = newInstance(Class.forName("java.util.Date"));
        Object term2378 = newInstance(Class.forName("java.util.Date"));
        setField(term2284, term2284.getClass(), "id", term2285);
        setField(term2287, term2287.getClass(), "id", term2288);
        setField(term2287, term2287.getClass(), "categoryName", "GSzQdbHLHw");
        setField(term2287, term2287.getClass(), "products", term2302);
        setField(term2284, term2284.getClass(), "category", term2287);
        setField(term2284, term2284.getClass(), "sku", "mUNcKUxghj");
        setField(term2284, term2284.getClass(), "name", "lnvLKbtveE");
        setField(term2284, term2284.getClass(), "description", "FfrrEhTHzQ");
        setIntField(term2346, term2346.getClass(), "signum", 1);
        setIntElement(term2348, 0, 603);
        setIntElement(term2348, 1, 1995754179);
        setIntElement(term2348, 2, -1797675876);
        setIntElement(term2348, 3, -758791830);
        setIntElement(term2348, 4, 1650264963);
        setIntElement(term2348, 5, 1414474999);
        setField(term2346, term2346.getClass(), "mag", term2348);
        setIntField(term2346, term2346.getClass(), "bitCountPlusOne", 0);
        setIntField(term2346, term2346.getClass(), "bitLengthPlusOne", 0);
        setIntField(term2346, term2346.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term2346, term2346.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term2345, term2345.getClass(), "intVal", term2346);
        setIntField(term2345, term2345.getClass(), "scale", 51);
        setIntField(term2345, term2345.getClass(), "precision", 0);
        setField(term2345, term2345.getClass(), "stringCache", null);
        setLongField(term2345, term2345.getClass(), "intCompact", -9223372036854775808L);
        setField(term2284, term2284.getClass(), "unitPrice", term2345);
        setField(term2284, term2284.getClass(), "imageUrl", "LXnDNrMsqT");
        setBooleanField(term2284, term2284.getClass(), "active", true);
        setIntField(term2284, term2284.getClass(), "unitsInStock", -1618206977);
        setLongField(term2376, term2376.getClass(), "fastTime", 1619398774189L);
        setField(term2376, term2376.getClass(), "cdate", null);
        setField(term2284, term2284.getClass(), "dateCreated", term2376);
        setLongField(term2378, term2378.getClass(), "fastTime", 1665119808787L);
        setField(term2378, term2378.getClass(), "cdate", null);
        setField(term2284, term2284.getClass(), "lastUpdated", term2378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isActive", argTypes, term2284, args);
    }

};


