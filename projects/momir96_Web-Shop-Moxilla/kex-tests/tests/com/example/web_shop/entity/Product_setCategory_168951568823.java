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

public class Product_setCategory_168951568823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2337;

    public Product_setCategory_168951568823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2337 = newInstance(Class.forName("com.example.web_shop.entity.Product"));
        setLongField(term2337, term2337.getClass(), "id", 0L);
        setField(term2337, term2337.getClass(), "name", null);
        setField(term2337, term2337.getClass(), "category", null);
        setField(term2337, term2337.getClass(), "description", null);
        setField(term2337, term2337.getClass(), "image_url", null);
        setField(term2337, term2337.getClass(), "price", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.entity.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.web_shop.entity.Category");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCategory", argTypes, term2337, args);
    }

};


