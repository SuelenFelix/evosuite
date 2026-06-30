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

public class UpdateCategoryResponse_getImageUrl_186172473317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1598;

    public UpdateCategoryResponse_getImageUrl_186172473317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1598 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.UpdateCategoryResponse"));
        setField(term1598, term1598.getClass(), "id", null);
        setField(term1598, term1598.getClass(), "name", null);
        setField(term1598, term1598.getClass(), "description", null);
        setField(term1598, term1598.getClass(), "imageUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.category.UpdateCategoryResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term1598, args);
    }

};


