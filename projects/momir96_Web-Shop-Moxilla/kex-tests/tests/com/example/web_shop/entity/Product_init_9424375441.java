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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Product_init_9424375441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386;
     Object term430;

    public Product_init_9424375441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term401 = new HashMap();
        Set<Object> term467 =  ((Map) term401).keySet();
        HashSet term400 = new HashSet((Collection<? extends Object>) term467);
        term386 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        setLongField(term386, term386.getClass(), "id", -5892135042702373494L);
        setField(term386, term386.getClass(), "categoryName", "YRHGsAkhxb");
        setField(term386, term386.getClass(), "books", term400);
        term430 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term431 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term433 = (int[]) newIntArray(6);
        setIntField(term431, term431.getClass(), "signum", 1);
        setIntElement(term433, 0, 35465);
        setIntElement(term433, 1, 1599162976);
        setIntElement(term433, 2, -1427811280);
        setIntElement(term433, 3, -224241601);
        setIntElement(term433, 4, -1115150417);
        setIntElement(term433, 5, 212641299);
        setField(term431, term431.getClass(), "mag", term433);
        setIntField(term431, term431.getClass(), "bitCountPlusOne", 0);
        setIntField(term431, term431.getClass(), "bitLengthPlusOne", 0);
        setIntField(term431, term431.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term431, term431.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term430, term430.getClass(), "intVal", term431);
        setIntField(term430, term430.getClass(), "scale", 53);
        setIntField(term430, term430.getClass(), "precision", 0);
        setField(term430, term430.getClass(), "stringCache", null);
        setLongField(term430, term430.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.example.web_shop.entity.Category");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[5];
        args[0] = "onpbIeEKoi";
        args[1] = term386;
        args[2] = "ffYhPOzlUs";
        args[3] = "MLqYREekMl";
        args[4] = term430;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


