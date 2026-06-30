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

public class UpdateCategoryMapper_toDomain_20889408200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2;
     Object term3;

    public UpdateCategoryMapper_toDomain_20889408200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.UpdateCategoryMapper"));
        term3 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.category.UpdateCategoryRequest"));
        setField(term3, term3.getClass(), "name", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "description", "sjlJAEtRrb");
        setField(term3, term3.getClass(), "imageUrl", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.UpdateCategoryMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Identifiable");
        argTypes[1] = Class.forName("com.alkemy.ong.infrastructure.rest.request.category.UpdateCategoryRequest");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3;
        callMethod(klass, "toDomain", argTypes, term2, args);
    }

};


