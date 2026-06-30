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

public class CreateCategoryResponse_getId_10267257880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1599;

    public CreateCategoryResponse_getId_10267257880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1600 = new Long(-484994522244390100L);
        term1599 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.CreateCategoryResponse"));
        setField(term1599, term1599.getClass(), "id", term1600);
        setField(term1599, term1599.getClass(), "name", "AWRooQKkdW");
        setField(term1599, term1599.getClass(), "description", "vjxIhXHxGR");
        setField(term1599, term1599.getClass(), "image", "QXzGXbEXMu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.category.CreateCategoryResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1599, args);
    }

};


