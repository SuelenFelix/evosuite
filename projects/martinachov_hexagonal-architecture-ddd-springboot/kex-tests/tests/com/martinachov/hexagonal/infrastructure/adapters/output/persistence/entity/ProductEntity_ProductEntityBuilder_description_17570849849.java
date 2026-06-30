package com.martinachov.hexagonal.infrastructure.adapters.output.persistence.entity;

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
import static com.martinachov.hexagonal.infrastructure.adapters.output.persistence.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProductEntity_ProductEntityBuilder_description_17570849849 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665;

    public ProductEntity_ProductEntityBuilder_description_17570849849() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665 = newInstance(Class.forName("com.martinachov.hexagonal.infrastructure.adapters.output.persistence.entity.ProductEntity$ProductEntityBuilder"));
        setField(term665, term665.getClass(), "id", null);
        setField(term665, term665.getClass(), "name", null);
        setField(term665, term665.getClass(), "description", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.martinachov.hexagonal.infrastructure.adapters.output.persistence.entity.ProductEntity$ProductEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "description", argTypes, term665, args);
    }

};


