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
import java.lang.Long;

public class Product_setId_6463786363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616;
     Object term691;

    public Product_setId_6463786363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term645 = new HashMap();
        Set<Object> term713 =  ((Map) term645).keySet();
        HashSet term644 = new HashSet((Collection<? extends Object>) term713);
        term616 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term630 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term674 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term675 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term677 = (int[]) newIntArray(6);
        setLongField(term616, term616.getClass(), "id", -484994522244390100L);
        setField(term616, term616.getClass(), "name", "hoicvmsovO");
        setLongField(term630, term630.getClass(), "id", 1233889271256172047L);
        setField(term630, term630.getClass(), "categoryName", "eqJfYWRaEL");
        setField(term630, term630.getClass(), "books", term644);
        setField(term616, term616.getClass(), "category", term630);
        setField(term616, term616.getClass(), "description", "fhkbdRViHi");
        setField(term616, term616.getClass(), "image_url", "uWHnvSvaPl");
        setIntField(term675, term675.getClass(), "signum", 1);
        setIntElement(term677, 0, 9405);
        setIntElement(term677, 1, 205999050);
        setIntElement(term677, 2, 647637684);
        setIntElement(term677, 3, -896420066);
        setIntElement(term677, 4, 1280002914);
        setIntElement(term677, 5, 183404747);
        setField(term675, term675.getClass(), "mag", term677);
        setIntField(term675, term675.getClass(), "bitCountPlusOne", 0);
        setIntField(term675, term675.getClass(), "bitLengthPlusOne", 0);
        setIntField(term675, term675.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term675, term675.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term674, term674.getClass(), "intVal", term675);
        setIntField(term674, term674.getClass(), "scale", 53);
        setIntField(term674, term674.getClass(), "precision", 0);
        setField(term674, term674.getClass(), "stringCache", null);
        setLongField(term674, term674.getClass(), "intCompact", -9223372036854775808L);
        setField(term616, term616.getClass(), "price", term674);
        term691 = new Long(6617340557564669657L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term691;
        callMethod(klass, "setId", argTypes, term616, args);
    }

};


