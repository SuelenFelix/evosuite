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

public class Product_getDescription_9719918288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1281;

    public Product_getDescription_9719918288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1310 = new HashMap();
        Set<Object> term1376 =  ((Map) term1310).keySet();
        HashSet term1309 = new HashSet((Collection<? extends Object>) term1376);
        term1281 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term1295 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term1339 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1340 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1342 = (int[]) newIntArray(6);
        setLongField(term1281, term1281.getClass(), "id", -2170847986967241072L);
        setField(term1281, term1281.getClass(), "name", "cAPeiZHKGJ");
        setLongField(term1295, term1295.getClass(), "id", 4044358158040652353L);
        setField(term1295, term1295.getClass(), "categoryName", "LvJFtLBaxj");
        setField(term1295, term1295.getClass(), "books", term1309);
        setField(term1281, term1281.getClass(), "category", term1295);
        setField(term1281, term1281.getClass(), "description", "PHvxnGHptP");
        setField(term1281, term1281.getClass(), "image_url", "TimdotUuNC");
        setIntField(term1340, term1340.getClass(), "signum", 1);
        setIntElement(term1342, 0, 4404);
        setIntElement(term1342, 1, 763521092);
        setIntElement(term1342, 2, 665076742);
        setIntElement(term1342, 3, 66292673);
        setIntElement(term1342, 4, 275037375);
        setIntElement(term1342, 5, 1545486489);
        setField(term1340, term1340.getClass(), "mag", term1342);
        setIntField(term1340, term1340.getClass(), "bitCountPlusOne", 0);
        setIntField(term1340, term1340.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1340, term1340.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1340, term1340.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1339, term1339.getClass(), "intVal", term1340);
        setIntField(term1339, term1339.getClass(), "scale", 52);
        setIntField(term1339, term1339.getClass(), "precision", 0);
        setField(term1339, term1339.getClass(), "stringCache", null);
        setLongField(term1339, term1339.getClass(), "intCompact", -9223372036854775808L);
        setField(term1281, term1281.getClass(), "price", term1339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term1281, args);
    }

};


