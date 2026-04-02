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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Long;

public class Category_setId_1024604276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2142;
     Object term2162;

    public Category_setId_1024604276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2157 = new HashMap();
        Set<Object> term2174 =  ((Map) term2157).keySet();
        HashSet term2156 = new HashSet((Collection<? extends Object>) term2174);
        term2142 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        setLongField(term2142, term2142.getClass(), "id", 1439298019805881866L);
        setField(term2142, term2142.getClass(), "categoryName", "bLPjGVBhlX");
        setField(term2142, term2142.getClass(), "books", term2156);
        term2162 = new Long(-8708192233349544946L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2162;
        callMethod(klass, "setId", argTypes, term2142, args);
    }

};


