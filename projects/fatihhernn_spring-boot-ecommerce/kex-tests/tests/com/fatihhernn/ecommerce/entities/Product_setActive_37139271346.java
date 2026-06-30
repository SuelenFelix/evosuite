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
import java.lang.Boolean;

public class Product_setActive_37139271346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5402;
     Object term5405;

    public Product_setActive_37139271346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5402 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        setField(term5402, term5402.getClass(), "id", null);
        setField(term5402, term5402.getClass(), "category", null);
        setField(term5402, term5402.getClass(), "sku", null);
        setField(term5402, term5402.getClass(), "name", null);
        setField(term5402, term5402.getClass(), "description", null);
        setField(term5402, term5402.getClass(), "unitPrice", null);
        setField(term5402, term5402.getClass(), "imageUrl", null);
        setBooleanField(term5402, term5402.getClass(), "active", false);
        setIntField(term5402, term5402.getClass(), "unitsInStock", 0);
        setField(term5402, term5402.getClass(), "dateCreated", null);
        setField(term5402, term5402.getClass(), "lastUpdated", null);
        term5405 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5405;
        callMethod(klass, "setActive", argTypes, term5402, args);
    }

};


