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

public class UpdateCategoryRequest_getName_18191247281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541;

    public UpdateCategoryRequest_getName_18191247281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.category.UpdateCategoryRequest"));
        setField(term541, term541.getClass(), "name", "BYqFIqCKAV");
        setField(term541, term541.getClass(), "description", "vrQLuWIDJX");
        setField(term541, term541.getClass(), "imageUrl", "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.category.UpdateCategoryRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term541, args);
    }

};


