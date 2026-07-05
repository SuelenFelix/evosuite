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

public class ListNewsMapper_init_5412976210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597;

    public ListNewsMapper_init_5412976210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsMapper"));
        Object term598 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper"));
        setField(term597, term597.getClass(), "getCategoryMapper", term598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.ListNewsMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.GetNewsMapper");
        Object[] args = new Object[1];
        args[0] = term597;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


