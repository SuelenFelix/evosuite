package com.example.web_shop.service.Impl;

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
import static com.example.web_shop.service.Impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class ProductServiceImpl_edit_18544026871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415;
     Object term417;

    public ProductServiceImpl_edit_18544026871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term415 = new Long(4872422362414183754L);
        HashMap term446 = new HashMap();
        Set<Object> term512 =  ((Map) term446).keySet();
        HashSet term445 = new HashSet((Collection<? extends Object>) term512);
        term417 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        Object term431 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        Object term475 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term476 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term478 = (int[]) newIntArray(6);
        setLongField(term417, term417.getClass(), "id", 6811161968424632369L);
        setField(term417, term417.getClass(), "name", "MxlszYVzRf");
        setLongField(term431, term431.getClass(), "id", -7237588299778557629L);
        setField(term431, term431.getClass(), "categoryName", "LQFpaHEwXR");
        setField(term431, term431.getClass(), "books", term445);
        setField(term417, term417.getClass(), "category", term431);
        setField(term417, term417.getClass(), "description", "oVcInYnLWB");
        setField(term417, term417.getClass(), "image_url", "aJlieCFVtF");
        setIntField(term476, term476.getClass(), "signum", 1);
        setIntElement(term478, 0, 3726);
        setIntElement(term478, 1, 1561510548);
        setIntElement(term478, 2, 756973629);
        setIntElement(term478, 3, -1169068666);
        setIntElement(term478, 4, -1772498162);
        setIntElement(term478, 5, -1207241473);
        setField(term476, term476.getClass(), "mag", term478);
        setIntField(term476, term476.getClass(), "bitCountPlusOne", 0);
        setIntField(term476, term476.getClass(), "bitLengthPlusOne", 0);
        setIntField(term476, term476.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term476, term476.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term475, term475.getClass(), "intVal", term476);
        setIntField(term475, term475.getClass(), "scale", 52);
        setIntField(term475, term475.getClass(), "precision", 0);
        setField(term475, term475.getClass(), "stringCache", null);
        setLongField(term475, term475.getClass(), "intCompact", -9223372036854775808L);
        setField(term417, term417.getClass(), "price", term475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.service.Impl.ProductServiceImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("com.example.web_shop.entity.Product");
        Object[] args = new Object[2];
        args[0] = term415;
        args[1] = term417;
        callMethod(klass, "edit", argTypes, null, args);
    }

};


