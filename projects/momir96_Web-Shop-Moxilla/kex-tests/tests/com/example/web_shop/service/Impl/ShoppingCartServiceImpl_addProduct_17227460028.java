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

public class ShoppingCartServiceImpl_addProduct_17227460028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287;

    public ShoppingCartServiceImpl_addProduct_17227460028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287 = newInstance(Class.forName("com.example.web_shop.service.Impl.ShoppingCartServiceImpl"));
        setField(term287, term287.getClass(), "cart", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.example.web_shop.service.Impl.ShoppingCartServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.example.web_shop.entity.Product");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addProduct", argTypes, term287, args);
    }

};


