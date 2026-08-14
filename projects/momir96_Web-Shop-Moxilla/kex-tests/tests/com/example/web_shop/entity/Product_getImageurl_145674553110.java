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

public class Product_getImageurl_145674553110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1547;

    public Product_getImageurl_145674553110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1576 = new HashMap();
        Set<Object> term1642 =  ((Map) term1576).keySet();
        HashSet term1575 = new HashSet((Collection<? extends Object>) term1642);
        term1547 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term1561 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term1605 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1606 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1608 = (int[]) newIntArray(6);
        setLongField(term1547, term1547.getClass(), "id", -5788180182343976541L);
        setField(term1547, term1547.getClass(), "name", "JqXGgAhZPl");
        setLongField(term1561, term1561.getClass(), "id", 2936323121573284007L);
        setField(term1561, term1561.getClass(), "categoryName", "jiKYgYHqIS");
        setField(term1561, term1561.getClass(), "books", term1575);
        setField(term1547, term1547.getClass(), "category", term1561);
        setField(term1547, term1547.getClass(), "description", "DfISiziTgG");
        setField(term1547, term1547.getClass(), "image_url", "XqgfKFvPSD");
        setIntField(term1606, term1606.getClass(), "signum", 1);
        setIntElement(term1608, 0, 31263);
        setIntElement(term1608, 1, -1965314916);
        setIntElement(term1608, 2, -443046697);
        setIntElement(term1608, 3, -1268253260);
        setIntElement(term1608, 4, -877110081);
        setIntElement(term1608, 5, -1376525969);
        setField(term1606, term1606.getClass(), "mag", term1608);
        setIntField(term1606, term1606.getClass(), "bitCountPlusOne", 0);
        setIntField(term1606, term1606.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1606, term1606.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1606, term1606.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1605, term1605.getClass(), "intVal", term1606);
        setIntField(term1605, term1605.getClass(), "scale", 53);
        setIntField(term1605, term1605.getClass(), "precision", 0);
        setField(term1605, term1605.getClass(), "stringCache", null);
        setLongField(term1605, term1605.getClass(), "intCompact", -9223372036854775808L);
        setField(term1547, term1547.getClass(), "price", term1605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage_url", argTypes, term1547, args);
    }

};


