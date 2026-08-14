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

public class Category_getId_18227884794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;

    public Category_getId_18227884794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term130 = new HashMap();
        Set<Object> term145 =  ((Map) term130).keySet();
        HashSet term129 = new HashSet((Collection<? extends Object>) term145);
        term115 = newInstance(Class.forName("com.example.web_shop.entity.Category"));
        setLongField(term115, term115.getClass(), "id", -4325723315152823407L);
        setField(term115, term115.getClass(), "categoryName", "eZFUvlxvGV");
        setField(term115, term115.getClass(), "books", term129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Category");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term115, args);
    }

};


