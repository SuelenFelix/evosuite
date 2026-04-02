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

public class Product_setPrice_33158577114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1687;
     Object term1762;

    public Product_setPrice_33158577114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1716 = new HashMap();
        Set<Object> term1799 =  ((Map) term1716).keySet();
        HashSet term1715 = new HashSet((Collection<? extends Object>) term1799);
        term1687 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term1701 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term1745 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1746 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1748 = (int[]) newIntArray(6);
        setLongField(term1687, term1687.getClass(), "id", 1967728129628047933L);
        setField(term1687, term1687.getClass(), "name", "ffYhPOzlUs");
        setLongField(term1701, term1701.getClass(), "id", 2120084523938730454L);
        setField(term1701, term1701.getClass(), "categoryName", "MLqYREekMl");
        setField(term1701, term1701.getClass(), "books", term1715);
        setField(term1687, term1687.getClass(), "category", term1701);
        setField(term1687, term1687.getClass(), "description", "ytSBIKXogI");
        setField(term1687, term1687.getClass(), "imageUrl", "nHXjMycHlU");
        setIntField(term1746, term1746.getClass(), "signum", 1);
        setIntElement(term1748, 0, 9405);
        setIntElement(term1748, 1, 205999050);
        setIntElement(term1748, 2, 647637684);
        setIntElement(term1748, 3, -896420066);
        setIntElement(term1748, 4, 1280002914);
        setIntElement(term1748, 5, 183404747);
        setField(term1746, term1746.getClass(), "mag", term1748);
        setIntField(term1746, term1746.getClass(), "bitCountPlusOne", 0);
        setIntField(term1746, term1746.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1746, term1746.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1746, term1746.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1745, term1745.getClass(), "intVal", term1746);
        setIntField(term1745, term1745.getClass(), "scale", 53);
        setIntField(term1745, term1745.getClass(), "precision", 0);
        setField(term1745, term1745.getClass(), "stringCache", null);
        setLongField(term1745, term1745.getClass(), "intCompact", -9223372036854775808L);
        setField(term1687, term1687.getClass(), "price", term1745);
        term1762 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term1763 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1765 = (int[]) newIntArray(6);
        setIntField(term1763, term1763.getClass(), "signum", 1);
        setIntElement(term1765, 0, 48108);
        setIntElement(term1765, 1, 419671270);
        setIntElement(term1765, 2, 909082732);
        setIntElement(term1765, 3, 2078883588);
        setIntElement(term1765, 4, 1670017529);
        setIntElement(term1765, 5, -2116499193);
        setField(term1763, term1763.getClass(), "mag", term1765);
        setIntField(term1763, term1763.getClass(), "bitCountPlusOne", 0);
        setIntField(term1763, term1763.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1763, term1763.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1763, term1763.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1762, term1762.getClass(), "intVal", term1763);
        setIntField(term1762, term1762.getClass(), "scale", 53);
        setIntField(term1762, term1762.getClass(), "precision", 0);
        setField(term1762, term1762.getClass(), "stringCache", null);
        setLongField(term1762, term1762.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term1762;
        callMethod(klass, "setPrice", argTypes, term1687, args);
    }

};


