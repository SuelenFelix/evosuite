package com.alkemy.ong.infrastructure.rest.request.category;

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
import static com.alkemy.ong.infrastructure.rest.request.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateCategoryRequest_getDescription_6723315843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;

    public CreateCategoryRequest_getDescription_6723315843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.category.CreateCategoryRequest"));
        setField(term134, term134.getClass(), "name", "SzjVpOQTyS");
        setField(term134, term134.getClass(), "description", "MjGYSRKTNF");
        setField(term134, term134.getClass(), "image", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.category.CreateCategoryRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term134, args);
    }

};


