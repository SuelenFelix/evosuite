package com.alkemy.ong.infrastructure.rest.mapper.category;

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
import static com.alkemy.ong.infrastructure.rest.mapper.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateCategoryMapper_toDomain_9771400360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142;
     Object term143;

    public CreateCategoryMapper_toDomain_9771400360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.CreateCategoryMapper"));
        term143 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.category.CreateCategoryRequest"));
        setField(term143, term143.getClass(), "name", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "description", "MjGYSRKTNF");
        setField(term143, term143.getClass(), "image", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.CreateCategoryMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.category.CreateCategoryRequest");
        Object[] args = new Object[1];
        args[0] = term143;
        callMethod(klass, "toDomain", argTypes, term142, args);
    }

};


