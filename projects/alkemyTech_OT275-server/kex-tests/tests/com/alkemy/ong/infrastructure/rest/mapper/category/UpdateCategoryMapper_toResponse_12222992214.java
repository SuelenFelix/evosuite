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

public class UpdateCategoryMapper_toResponse_12222992214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;

    public UpdateCategoryMapper_toResponse_12222992214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.UpdateCategoryMapper"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.UpdateCategoryMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Category");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "toResponse", argTypes, term141, args);
    }

};


