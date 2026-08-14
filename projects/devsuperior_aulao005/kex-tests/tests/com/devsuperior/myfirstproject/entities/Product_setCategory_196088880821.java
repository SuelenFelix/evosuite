package com.devsuperior.myfirstproject.entities;

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
import static com.devsuperior.myfirstproject.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Product_setCategory_196088880821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938;

    public Product_setCategory_196088880821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term938 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        setField(term938, term938.getClass(), "id", null);
        setField(term938, term938.getClass(), "name", null);
        setField(term938, term938.getClass(), "price", null);
        setField(term938, term938.getClass(), "category", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.devsuperior.myfirstproject.entities.Category");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCategory", argTypes, term938, args);
    }

};


