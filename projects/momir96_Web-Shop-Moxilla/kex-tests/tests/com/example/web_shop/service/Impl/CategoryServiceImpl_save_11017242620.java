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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class CategoryServiceImpl_save_11017242620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term552;

    public CategoryServiceImpl_save_11017242620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term567 = new HashMap();
        Set<Object> term582 =  ((Map) term567).keySet();
        HashSet term566 = new HashSet((Collection<? extends Object>) term582);
        term552 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        setLongField(term552, term552.getClass(), "id", -4325723315152823407L);
        setField(term552, term552.getClass(), "categoryName", "ZiaGIbnzTs");
        setField(term552, term552.getClass(), "books", term566);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.service.Impl.CategoryServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.web_shop.entity.Category");
        Object[] args = new Object[1];
        args[0] = term552;
        callMethod(klass, "save", argTypes, null, args);
    }

};


