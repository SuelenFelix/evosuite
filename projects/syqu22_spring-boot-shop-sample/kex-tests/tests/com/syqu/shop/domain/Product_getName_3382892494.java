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

public class Product_getName_3382892494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term368;

    public Product_getName_3382892494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term397 = new HashMap();
        Set<Object> term463 =  ((Map) term397).keySet();
        HashSet term396 = new HashSet((Collection<? extends Object>) term463);
        term368 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        Object term382 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        Object term426 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term427 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term429 = (int[]) newIntArray(6);
        setLongField(term368, term368.getClass(), "id", 4872422362414183754L);
        setField(term368, term368.getClass(), "name", "MxlszYVzRf");
        setLongField(term382, term382.getClass(), "id", 6811161968424632369L);
        setField(term382, term382.getClass(), "categoryName", "LQFpaHEwXR");
        setField(term382, term382.getClass(), "books", term396);
        setField(term368, term368.getClass(), "category", term382);
        setField(term368, term368.getClass(), "description", "oVcInYnLWB");
        setField(term368, term368.getClass(), "imageUrl", "aJlieCFVtF");
        setIntField(term427, term427.getClass(), "signum", 1);
        setIntElement(term429, 0, 3726);
        setIntElement(term429, 1, 1561510548);
        setIntElement(term429, 2, 756973629);
        setIntElement(term429, 3, -1169068666);
        setIntElement(term429, 4, -1772498162);
        setIntElement(term429, 5, -1207241473);
        setField(term427, term427.getClass(), "mag", term429);
        setIntField(term427, term427.getClass(), "bitCountPlusOne", 0);
        setIntField(term427, term427.getClass(), "bitLengthPlusOne", 0);
        setIntField(term427, term427.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term427, term427.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term426, term426.getClass(), "intVal", term427);
        setIntField(term426, term426.getClass(), "scale", 52);
        setIntField(term426, term426.getClass(), "precision", 0);
        setField(term426, term426.getClass(), "stringCache", null);
        setLongField(term426, term426.getClass(), "intCompact", -9223372036854775808L);
        setField(term368, term368.getClass(), "price", term426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term368, args);
    }

};


