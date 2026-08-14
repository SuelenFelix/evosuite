package com.skyg0d.spring.jwt.model;

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
import static com.skyg0d.spring.jwt.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BaseEntity_BaseEntityBuilderImpl_build_14091834665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3837;

    public BaseEntity_BaseEntityBuilderImpl_build_14091834665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3837 = newInstance(Class.forName("com.skyg0d.spring.jwt.model.BaseEntity$BaseEntityBuilderImpl"));
        setField(term3837, term3837.getClass(), "id", null);
        setField(term3837, term3837.getClass(), "createdAt", null);
        setField(term3837, term3837.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.model.BaseEntity$BaseEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term3837, args);
    }

};


