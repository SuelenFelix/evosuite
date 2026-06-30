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

public class Product_setCategory_99237008811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1246;
     Object term1321;

    public Product_setCategory_99237008811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1275 = new HashMap();
        Set<Object> term1361 =  ((Map) term1275).keySet();
        HashSet term1274 = new HashSet((Collection<? extends Object>) term1361);
        term1246 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term1260 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term1304 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1305 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1307 = (int[]) newIntArray(6);
        setLongField(term1246, term1246.getClass(), "id", -2585684163342970173L);
        setField(term1246, term1246.getClass(), "name", "UlajhuVLaP");
        setLongField(term1260, term1260.getClass(), "id", 8059786003080744426L);
        setField(term1260, term1260.getClass(), "categoryName", "gGSMzuGICf");
        setField(term1260, term1260.getClass(), "books", term1274);
        setField(term1246, term1246.getClass(), "category", term1260);
        setField(term1246, term1246.getClass(), "description", "hxCBltsObl");
        setField(term1246, term1246.getClass(), "imageUrl", "BndsHwAFMv");
        setIntField(term1305, term1305.getClass(), "signum", 1);
        setIntElement(term1307, 0, 579);
        setIntElement(term1307, 1, -560540333);
        setIntElement(term1307, 2, 1014435409);
        setIntElement(term1307, 3, -1248929007);
        setIntElement(term1307, 4, -42206956);
        setIntElement(term1307, 5, 1817231305);
        setField(term1305, term1305.getClass(), "mag", term1307);
        setIntField(term1305, term1305.getClass(), "bitCountPlusOne", 0);
        setIntField(term1305, term1305.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1305, term1305.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1305, term1305.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1304, term1304.getClass(), "intVal", term1305);
        setIntField(term1304, term1304.getClass(), "scale", 51);
        setIntField(term1304, term1304.getClass(), "precision", 0);
        setField(term1304, term1304.getClass(), "stringCache", null);
        setLongField(term1304, term1304.getClass(), "intCompact", -9223372036854775808L);
        setField(term1246, term1246.getClass(), "price", term1304);
        HashMap term1336 = new HashMap();
        Set<Object> term1398 =  ((Map) term1336).keySet();
        HashSet term1335 = new HashSet((Collection<? extends Object>) term1398);
        term1321 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        setLongField(term1321, term1321.getClass(), "id", -4365849114644724155L);
        setField(term1321, term1321.getClass(), "categoryName", "GzFkzHGYFt");
        setField(term1321, term1321.getClass(), "books", term1335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.syqu.shop.domain.Category");
        Object[] args = new Object[1];
        args[0] = term1321;
        callMethod(klass, "setCategory", argTypes, term1246, args);
    }

};


