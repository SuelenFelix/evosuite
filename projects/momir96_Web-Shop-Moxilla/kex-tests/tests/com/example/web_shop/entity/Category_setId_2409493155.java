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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Long;

public class Category_setId_2409493155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;
     Object term166;

    public Category_setId_2409493155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term161 = new HashMap();
        Set<Object> term178 =  ((Map) term161).keySet();
        HashSet term160 = new HashSet((Collection<? extends Object>) term178);
        term146 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        setLongField(term146, term146.getClass(), "id", 2535595959091595249L);
        setField(term146, term146.getClass(), "categoryName", "BYqFIqCKAV");
        setField(term146, term146.getClass(), "books", term160);
        term166 = new Long(-5476826692763582090L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Category");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term166;
        callMethod(klass, "setId", argTypes, term146, args);
    }

};


