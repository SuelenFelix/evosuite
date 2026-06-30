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
import java.lang.Long;

public class Product_setId_120503534825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1970;
     Object term1972;

    public Product_setId_120503534825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1970 = newInstance(Class.forName("com.syqu.shop.domain.Product"));
        setLongField(term1970, term1970.getClass(), "id", 0L);
        setField(term1970, term1970.getClass(), "name", null);
        setField(term1970, term1970.getClass(), "category", null);
        setField(term1970, term1970.getClass(), "description", null);
        setField(term1970, term1970.getClass(), "imageUrl", null);
        setField(term1970, term1970.getClass(), "price", null);
        term1972 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.syqu.shop.domain.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1972;
        callMethod(klass, "setId", argTypes, term1970, args);
    }

};


