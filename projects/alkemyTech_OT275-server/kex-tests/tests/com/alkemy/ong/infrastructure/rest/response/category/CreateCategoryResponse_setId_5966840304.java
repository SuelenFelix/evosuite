package com.alkemy.ong.infrastructure.rest.response.category;

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
import static com.alkemy.ong.infrastructure.rest.response.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class CreateCategoryResponse_setId_5966840304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1875;
     Object term1914;

    public CreateCategoryResponse_setId_5966840304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1876 = new Long(-8708192233349544946L);
        term1875 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.CreateCategoryResponse"));
        setField(term1875, term1875.getClass(), "id", term1876);
        setField(term1875, term1875.getClass(), "name", "yGtHPyvYiQ");
        setField(term1875, term1875.getClass(), "description", "MvRIxilFMJ");
        setField(term1875, term1875.getClass(), "image", "iNwOJRBEjp");
        term1914 = new Long(5907001541142728739L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.category.CreateCategoryResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1914;
        callMethod(klass, "setId", argTypes, term1875, args);
    }

};


