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

public class Product_getImageurl_145674553126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2343;

    public Product_getImageurl_145674553126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2343 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        setLongField(term2343, term2343.getClass(), "id", 0L);
        setField(term2343, term2343.getClass(), "name", null);
        setField(term2343, term2343.getClass(), "category", null);
        setField(term2343, term2343.getClass(), "description", null);
        setField(term2343, term2343.getClass(), "image_url", null);
        setField(term2343, term2343.getClass(), "price", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage_url", argTypes, term2343, args);
    }

};


