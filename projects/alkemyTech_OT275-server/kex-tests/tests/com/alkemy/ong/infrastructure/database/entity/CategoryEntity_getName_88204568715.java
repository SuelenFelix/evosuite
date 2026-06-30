package com.alkemy.ong.infrastructure.database.entity;

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
import static com.alkemy.ong.infrastructure.database.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CategoryEntity_getName_88204568715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17133;

    public CategoryEntity_getName_88204568715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17133 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity"));
        setField(term17133, term17133.getClass(), "categoryId", null);
        setField(term17133, term17133.getClass(), "name", null);
        setField(term17133, term17133.getClass(), "description", null);
        setField(term17133, term17133.getClass(), "imageUrl", null);
        setField(term17133, term17133.getClass(), "createTimestamp", null);
        setBooleanField(term17133, term17133.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.CategoryEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term17133, args);
    }

};


