package com.syqu.shop.service.impl;

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
import static com.syqu.shop.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ShoppingCartServiceImpl_removeProduct_8653051849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288;

    public ShoppingCartServiceImpl_removeProduct_8653051849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288 = newInstance(Class.forName("com.syqu.shop.service.impl.ShoppingCartServiceImpl"));
        setField(term288, term288.getClass(), "cart", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.service.impl.ShoppingCartServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.syqu.shop.domain.Product");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeProduct", argTypes, term288, args);
    }

};


