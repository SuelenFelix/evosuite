package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Product_setDescription_180013826243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5393;

    public Product_setDescription_180013826243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5393 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        setField(term5393, term5393.getClass(), "id", null);
        setField(term5393, term5393.getClass(), "category", null);
        setField(term5393, term5393.getClass(), "sku", null);
        setField(term5393, term5393.getClass(), "name", null);
        setField(term5393, term5393.getClass(), "description", null);
        setField(term5393, term5393.getClass(), "unitPrice", null);
        setField(term5393, term5393.getClass(), "imageUrl", null);
        setBooleanField(term5393, term5393.getClass(), "active", false);
        setIntField(term5393, term5393.getClass(), "unitsInStock", 0);
        setField(term5393, term5393.getClass(), "dateCreated", null);
        setField(term5393, term5393.getClass(), "lastUpdated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDescription", argTypes, term5393, args);
    }

};


