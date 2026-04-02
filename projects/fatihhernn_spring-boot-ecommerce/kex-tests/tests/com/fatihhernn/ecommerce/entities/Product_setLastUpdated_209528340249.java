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

public class Product_setLastUpdated_209528340249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5415;

    public Product_setLastUpdated_209528340249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5415 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        setField(term5415, term5415.getClass(), "id", null);
        setField(term5415, term5415.getClass(), "category", null);
        setField(term5415, term5415.getClass(), "sku", null);
        setField(term5415, term5415.getClass(), "name", null);
        setField(term5415, term5415.getClass(), "description", null);
        setField(term5415, term5415.getClass(), "unitPrice", null);
        setField(term5415, term5415.getClass(), "imageUrl", null);
        setBooleanField(term5415, term5415.getClass(), "active", false);
        setIntField(term5415, term5415.getClass(), "unitsInStock", 0);
        setField(term5415, term5415.getClass(), "dateCreated", null);
        setField(term5415, term5415.getClass(), "lastUpdated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastUpdated", argTypes, term5415, args);
    }

};


