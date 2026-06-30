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

public class Product_getPrice_18895010658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term856;

    public Product_getPrice_18895010658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term885 = new HashMap();
        Set<Object> term951 =  ((Map) term885).keySet();
        HashSet term884 = new HashSet((Collection<? extends Object>) term951);
        term856 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term870 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term914 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term915 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term917 = (int[]) newIntArray(6);
        setLongField(term856, term856.getClass(), "id", -5476826692763582090L);
        setField(term856, term856.getClass(), "name", "IoAlmYsBwc");
        setLongField(term870, term870.getClass(), "id", -872011222785455006L);
        setField(term870, term870.getClass(), "categoryName", "TEParAifyi");
        setField(term870, term870.getClass(), "books", term884);
        setField(term856, term856.getClass(), "category", term870);
        setField(term856, term856.getClass(), "description", "OWDIEULEFu");
        setField(term856, term856.getClass(), "imageUrl", "dWRymuLBtr");
        setIntField(term915, term915.getClass(), "signum", 1);
        setIntElement(term917, 0, 25264);
        setIntElement(term917, 1, 13306318);
        setIntElement(term917, 2, 145344007);
        setIntElement(term917, 3, -1015263393);
        setIntElement(term917, 4, -1366378930);
        setIntElement(term917, 5, 983206517);
        setField(term915, term915.getClass(), "mag", term917);
        setIntField(term915, term915.getClass(), "bitCountPlusOne", 0);
        setIntField(term915, term915.getClass(), "bitLengthPlusOne", 0);
        setIntField(term915, term915.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term915, term915.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term914, term914.getClass(), "intVal", term915);
        setIntField(term914, term914.getClass(), "scale", 53);
        setIntField(term914, term914.getClass(), "precision", 0);
        setField(term914, term914.getClass(), "stringCache", null);
        setLongField(term914, term914.getClass(), "intCompact", -9223372036854775808L);
        setField(term856, term856.getClass(), "price", term914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term856, args);
    }

};


