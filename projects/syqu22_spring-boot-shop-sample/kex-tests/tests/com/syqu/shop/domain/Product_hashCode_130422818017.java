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

public class Product_hashCode_130422818017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1956;

    public Product_hashCode_130422818017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1956 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        setLongField(term1956, term1956.getClass(), "id", 0L);
        setField(term1956, term1956.getClass(), "name", null);
        setField(term1956, term1956.getClass(), "category", null);
        setField(term1956, term1956.getClass(), "description", null);
        setField(term1956, term1956.getClass(), "imageUrl", null);
        setField(term1956, term1956.getClass(), "price", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1956, args);
    }

};


