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

public class Product_getCategory_3861066821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1962;

    public Product_getCategory_3861066821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1962 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        setLongField(term1962, term1962.getClass(), "id", 0L);
        setField(term1962, term1962.getClass(), "name", null);
        setField(term1962, term1962.getClass(), "category", null);
        setField(term1962, term1962.getClass(), "description", null);
        setField(term1962, term1962.getClass(), "imageUrl", null);
        setField(term1962, term1962.getClass(), "price", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term1962, args);
    }

};


