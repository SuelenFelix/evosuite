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

public class Product_setImageUrl_2266272013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1543;

    public Product_setImageUrl_2266272013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1572 = new HashMap();
        Set<Object> term1650 =  ((Map) term1572).keySet();
        HashSet term1571 = new HashSet((Collection<? extends Object>) term1650);
        term1543 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term1557 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term1601 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1602 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1604 = (int[]) newIntArray(6);
        setLongField(term1543, term1543.getClass(), "id", -7672528020740371001L);
        setField(term1543, term1543.getClass(), "name", "UiUYnPrcCi");
        setLongField(term1557, term1557.getClass(), "id", -4502405999831680926L);
        setField(term1557, term1557.getClass(), "categoryName", "UoYtihxVaS");
        setField(term1557, term1557.getClass(), "books", term1571);
        setField(term1543, term1543.getClass(), "category", term1557);
        setField(term1543, term1543.getClass(), "description", "JDswTTCZHV");
        setField(term1543, term1543.getClass(), "imageUrl", "onpbIeEKoi");
        setIntField(term1602, term1602.getClass(), "signum", 1);
        setIntElement(term1604, 0, 523);
        setIntElement(term1604, 1, -954467915);
        setIntElement(term1604, 2, 1892307494);
        setIntElement(term1604, 3, -1066736592);
        setIntElement(term1604, 4, 433326655);
        setIntElement(term1604, 5, -242716133);
        setField(term1602, term1602.getClass(), "mag", term1604);
        setIntField(term1602, term1602.getClass(), "bitCountPlusOne", 0);
        setIntField(term1602, term1602.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1602, term1602.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1602, term1602.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1601, term1601.getClass(), "intVal", term1602);
        setIntField(term1601, term1601.getClass(), "scale", 51);
        setIntField(term1601, term1601.getClass(), "precision", 0);
        setField(term1601, term1601.getClass(), "stringCache", null);
        setLongField(term1601, term1601.getClass(), "intCompact", -9223372036854775808L);
        setField(term1543, term1543.getClass(), "price", term1601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YRHGsAkhxb";
        callMethod(klass, "setImageUrl", argTypes, term1543, args);
    }

};


