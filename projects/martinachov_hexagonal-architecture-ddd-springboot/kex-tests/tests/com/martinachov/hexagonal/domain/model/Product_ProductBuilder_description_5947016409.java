package com.martinachov.hexagonal.domain.model;

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
import static com.martinachov.hexagonal.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Product_ProductBuilder_description_5947016409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term284;

    public Product_ProductBuilder_description_5947016409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term284 = newInstance(Class.forName("com.martinachov.hexagonal.domain.model.Product$ProductBuilder"));
        setField(term284, term284.getClass(), "id", null);
        setField(term284, term284.getClass(), "name", null);
        setField(term284, term284.getClass(), "description", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.domain.model.Product$ProductBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "description", argTypes, term284, args);
    }

};


