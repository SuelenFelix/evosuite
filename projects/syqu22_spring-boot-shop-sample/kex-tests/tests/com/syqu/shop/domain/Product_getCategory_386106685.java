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

public class Product_getCategory_386106685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term490;

    public Product_getCategory_386106685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term519 = new HashMap();
        Set<Object> term585 =  ((Map) term519).keySet();
        HashSet term518 = new HashSet((Collection<? extends Object>) term585);
        term490 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term504 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term548 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term549 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term551 = (int[]) newIntArray(6);
        setLongField(term490, term490.getClass(), "id", -7237588299778557629L);
        setField(term490, term490.getClass(), "name", "ZiaGIbnzTs");
        setLongField(term504, term504.getClass(), "id", 6967924379644551255L);
        setField(term504, term504.getClass(), "categoryName", "tbcdzjIfER");
        setField(term504, term504.getClass(), "books", term518);
        setField(term490, term490.getClass(), "category", term504);
        setField(term490, term490.getClass(), "description", "HyxfbSQYBe");
        setField(term490, term490.getClass(), "imageUrl", "pCTimMblYc");
        setIntField(term549, term549.getClass(), "signum", 1);
        setIntElement(term551, 0, 1954);
        setIntElement(term551, 1, -476668863);
        setIntElement(term551, 2, 661030673);
        setIntElement(term551, 3, 328061253);
        setIntElement(term551, 4, -431156338);
        setIntElement(term551, 5, 791621529);
        setField(term549, term549.getClass(), "mag", term551);
        setIntField(term549, term549.getClass(), "bitCountPlusOne", 0);
        setIntField(term549, term549.getClass(), "bitLengthPlusOne", 0);
        setIntField(term549, term549.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term549, term549.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term548, term548.getClass(), "intVal", term549);
        setIntField(term548, term548.getClass(), "scale", 52);
        setIntField(term548, term548.getClass(), "precision", 0);
        setField(term548, term548.getClass(), "stringCache", null);
        setLongField(term548, term548.getClass(), "intCompact", -9223372036854775808L);
        setField(term490, term490.getClass(), "price", term548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term490, args);
    }

};


