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

public class Product_setDescription_8689410129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1403;

    public Product_setDescription_8689410129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1432 = new HashMap();
        Set<Object> term1510 =  ((Map) term1432).keySet();
        HashSet term1431 = new HashSet((Collection<? extends Object>) term1510);
        term1403 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term1417 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term1461 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1462 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1464 = (int[]) newIntArray(6);
        setLongField(term1403, term1403.getClass(), "id", -4443169559037975007L);
        setField(term1403, term1403.getClass(), "name", "PkWMRdJcBb");
        setLongField(term1417, term1417.getClass(), "id", -3842548265506930260L);
        setField(term1417, term1417.getClass(), "categoryName", "jSpAteRute");
        setField(term1417, term1417.getClass(), "books", term1431);
        setField(term1403, term1403.getClass(), "category", term1417);
        setField(term1403, term1403.getClass(), "description", "swZVeJAxjt");
        setField(term1403, term1403.getClass(), "image_url", "xOcJIiQQDu");
        setIntField(term1462, term1462.getClass(), "signum", 1);
        setIntElement(term1464, 0, 5017);
        setIntElement(term1464, 1, 1138264108);
        setIntElement(term1464, 2, 138609451);
        setIntElement(term1464, 3, -559929925);
        setIntElement(term1464, 4, -1000035065);
        setIntElement(term1464, 5, 1199074337);
        setField(term1462, term1462.getClass(), "mag", term1464);
        setIntField(term1462, term1462.getClass(), "bitCountPlusOne", 0);
        setIntField(term1462, term1462.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1462, term1462.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1462, term1462.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1461, term1461.getClass(), "intVal", term1462);
        setIntField(term1461, term1461.getClass(), "scale", 52);
        setIntField(term1461, term1461.getClass(), "precision", 0);
        setField(term1461, term1461.getClass(), "stringCache", null);
        setLongField(term1461, term1461.getClass(), "intCompact", -9223372036854775808L);
        setField(term1403, term1403.getClass(), "price", term1461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GVizqqzXpy";
        callMethod(klass, "setDescription", argTypes, term1403, args);
    }

};


