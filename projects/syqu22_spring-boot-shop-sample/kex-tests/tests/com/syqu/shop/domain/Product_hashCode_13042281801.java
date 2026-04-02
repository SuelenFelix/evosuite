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

public class Product_hashCode_13042281801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124;

    public Product_hashCode_13042281801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term153 = new HashMap();
        Set<Object> term219 =  ((Map) term153).keySet();
        HashSet term152 = new HashSet((Collection<? extends Object>) term219);
        term124 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term138 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term182 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term183 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term185 = (int[]) newIntArray(6);
        setLongField(term124, term124.getClass(), "id", -8257434502486459194L);
        setField(term124, term124.getClass(), "name", "jJCZpVmanW");
        setLongField(term138, term138.getClass(), "id", -8400487765614892086L);
        setField(term138, term138.getClass(), "categoryName", "EGtDIRbSSb");
        setField(term138, term138.getClass(), "books", term152);
        setField(term124, term124.getClass(), "category", term138);
        setField(term124, term124.getClass(), "description", "SzjVpOQTyS");
        setField(term124, term124.getClass(), "imageUrl", "MjGYSRKTNF");
        setIntField(term183, term183.getClass(), "signum", 1);
        setIntElement(term185, 0, 2364);
        setIntElement(term185, 1, -1446584625);
        setIntElement(term185, 2, 1957600567);
        setIntElement(term185, 3, -336418707);
        setIntElement(term185, 4, -1905211145);
        setIntElement(term185, 5, 86968353);
        setField(term183, term183.getClass(), "mag", term185);
        setIntField(term183, term183.getClass(), "bitCountPlusOne", 0);
        setIntField(term183, term183.getClass(), "bitLengthPlusOne", 0);
        setIntField(term183, term183.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term183, term183.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term182, term182.getClass(), "intVal", term183);
        setIntField(term182, term182.getClass(), "scale", 52);
        setIntField(term182, term182.getClass(), "precision", 0);
        setField(term182, term182.getClass(), "stringCache", null);
        setLongField(term182, term182.getClass(), "intCompact", -9223372036854775808L);
        setField(term124, term124.getClass(), "price", term182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term124, args);
    }

};


