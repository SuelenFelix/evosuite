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

public class Product_getId_15848508662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494;

    public Product_getId_15848508662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term523 = new HashMap();
        Set<Object> term589 =  ((Map) term523).keySet();
        HashSet term522 = new HashSet((Collection<? extends Object>) term589);
        term494 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term508 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term552 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term553 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term555 = (int[]) newIntArray(6);
        setLongField(term494, term494.getClass(), "id", 5262507301787091109L);
        setField(term494, term494.getClass(), "name", "ytSBIKXogI");
        setLongField(term508, term508.getClass(), "id", -6823727938421990489L);
        setField(term508, term508.getClass(), "categoryName", "nHXjMycHlU");
        setField(term508, term508.getClass(), "books", term522);
        setField(term494, term494.getClass(), "category", term508);
        setField(term494, term494.getClass(), "description", "ieCtQFdkii");
        setField(term494, term494.getClass(), "image_url", "dEnhdmILtU");
        setIntField(term553, term553.getClass(), "signum", 1);
        setIntElement(term555, 0, 523);
        setIntElement(term555, 1, -954467915);
        setIntElement(term555, 2, 1892307494);
        setIntElement(term555, 3, -1066736592);
        setIntElement(term555, 4, 433326655);
        setIntElement(term555, 5, -242716133);
        setField(term553, term553.getClass(), "mag", term555);
        setIntField(term553, term553.getClass(), "bitCountPlusOne", 0);
        setIntField(term553, term553.getClass(), "bitLengthPlusOne", 0);
        setIntField(term553, term553.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term553, term553.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term552, term552.getClass(), "intVal", term553);
        setIntField(term552, term552.getClass(), "scale", 51);
        setIntField(term552, term552.getClass(), "precision", 0);
        setField(term552, term552.getClass(), "stringCache", null);
        setLongField(term552, term552.getClass(), "intCompact", -9223372036854775808L);
        setField(term494, term494.getClass(), "price", term552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term494, args);
    }

};


