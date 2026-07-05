package com.alkemy.ong.infrastructure.rest.mapper.news;

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
import static com.alkemy.ong.infrastructure.rest.mapper.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CreateNewsMapper_toDomain_15828564231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600;
     Object term602;

    public CreateNewsMapper_toDomain_15828564231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.CreateNewsMapper"));
        Object term601 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper"));
        setField(term600, term600.getClass(), "getCategoryMapper", term601);
        term602 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.news.CreateNewsRequest"));
        setField(term602, term602.getClass(), "name", "GSzQdbHLHw");
        setField(term602, term602.getClass(), "text", "IkfarsYNJO");
        setField(term602, term602.getClass(), "image", "aZKOWhHMEh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.CreateNewsMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.news.CreateNewsRequest");
        Object[] args = new Object[1];
        args[0] = term602;
        callMethod(klass, "toDomain", argTypes, term600, args);
    }

};


