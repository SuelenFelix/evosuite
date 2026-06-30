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

public class Category_getCategoryName_14448741404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2080;

    public Category_getCategoryName_14448741404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2095 = new HashMap();
        Set<Object> term2110 =  ((Map) term2095).keySet();
        HashSet term2094 = new HashSet((Collection<? extends Object>) term2110);
        term2080 = newInstance(Class.forName("com.syqu.shop.domain.Category"));
        setLongField(term2080, term2080.getClass(), "id", 1233889271256172047L);
        setField(term2080, term2080.getClass(), "categoryName", "TJmVBGfTML");
        setField(term2080, term2080.getClass(), "books", term2094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Category");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryName", argTypes, term2080, args);
    }

};


