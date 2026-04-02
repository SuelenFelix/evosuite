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

public class Product_getDateCreated_108858130937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5375;

    public Product_getDateCreated_108858130937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5375 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Product"));
        setField(term5375, term5375.getClass(), "id", null);
        setField(term5375, term5375.getClass(), "category", null);
        setField(term5375, term5375.getClass(), "sku", null);
        setField(term5375, term5375.getClass(), "name", null);
        setField(term5375, term5375.getClass(), "description", null);
        setField(term5375, term5375.getClass(), "unitPrice", null);
        setField(term5375, term5375.getClass(), "imageUrl", null);
        setBooleanField(term5375, term5375.getClass(), "active", false);
        setIntField(term5375, term5375.getClass(), "unitsInStock", 0);
        setField(term5375, term5375.getClass(), "dateCreated", null);
        setField(term5375, term5375.getClass(), "lastUpdated", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateCreated", argTypes, term5375, args);
    }

};


