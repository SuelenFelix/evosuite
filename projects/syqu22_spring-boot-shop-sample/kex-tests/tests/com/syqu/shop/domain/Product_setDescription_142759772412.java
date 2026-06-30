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

public class Product_setDescription_142759772412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1399;

    public Product_setDescription_142759772412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1428 = new HashMap();
        Set<Object> term1506 =  ((Map) term1428).keySet();
        HashSet term1427 = new HashSet((Collection<? extends Object>) term1506);
        term1399 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term1413 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term1457 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1458 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1460 = (int[]) newIntArray(6);
        setLongField(term1399, term1399.getClass(), "id", 2486810210675247493L);
        setField(term1399, term1399.getClass(), "name", "tShwQLRGNe");
        setLongField(term1413, term1413.getClass(), "id", 7009926388951271268L);
        setField(term1413, term1413.getClass(), "categoryName", "LvtrsXUliU");
        setField(term1413, term1413.getClass(), "books", term1427);
        setField(term1399, term1399.getClass(), "category", term1413);
        setField(term1399, term1399.getClass(), "description", "xLbjWUgOIL");
        setField(term1399, term1399.getClass(), "imageUrl", "jDtqGUpnZN");
        setIntField(term1458, term1458.getClass(), "signum", 1);
        setIntElement(term1460, 0, 35465);
        setIntElement(term1460, 1, 1599162976);
        setIntElement(term1460, 2, -1427811280);
        setIntElement(term1460, 3, -224241601);
        setIntElement(term1460, 4, -1115150417);
        setIntElement(term1460, 5, 212641299);
        setField(term1458, term1458.getClass(), "mag", term1460);
        setIntField(term1458, term1458.getClass(), "bitCountPlusOne", 0);
        setIntField(term1458, term1458.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1458, term1458.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1458, term1458.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1457, term1457.getClass(), "intVal", term1458);
        setIntField(term1457, term1457.getClass(), "scale", 53);
        setIntField(term1457, term1457.getClass(), "precision", 0);
        setField(term1457, term1457.getClass(), "stringCache", null);
        setLongField(term1457, term1457.getClass(), "intCompact", -9223372036854775808L);
        setField(term1399, term1399.getClass(), "price", term1457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nGKItKLYNC";
        callMethod(klass, "setDescription", argTypes, term1399, args);
    }

};


