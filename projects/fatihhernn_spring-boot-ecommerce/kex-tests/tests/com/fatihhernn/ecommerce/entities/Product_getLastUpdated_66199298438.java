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

public class Product_getLastUpdated_66199298438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5378;

    public Product_getLastUpdated_66199298438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5378 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        setField(term5378, term5378.getClass(), "id", null);
        setField(term5378, term5378.getClass(), "category", null);
        setField(term5378, term5378.getClass(), "sku", null);
        setField(term5378, term5378.getClass(), "name", null);
        setField(term5378, term5378.getClass(), "description", null);
        setField(term5378, term5378.getClass(), "unitPrice", null);
        setField(term5378, term5378.getClass(), "imageUrl", null);
        setBooleanField(term5378, term5378.getClass(), "active", false);
        setIntField(term5378, term5378.getClass(), "unitsInStock", 0);
        setField(term5378, term5378.getClass(), "dateCreated", null);
        setField(term5378, term5378.getClass(), "lastUpdated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastUpdated", argTypes, term5378, args);
    }

};


