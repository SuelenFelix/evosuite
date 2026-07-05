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

public class NewsEntity_getImageUrl_152668039519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2343;

    public NewsEntity_getImageUrl_152668039519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2343 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        setField(term2343, term2343.getClass(), "newsId", null);
        setField(term2343, term2343.getClass(), "name", null);
        setField(term2343, term2343.getClass(), "content", null);
        setField(term2343, term2343.getClass(), "imageUrl", null);
        setField(term2343, term2343.getClass(), "category", null);
        setField(term2343, term2343.getClass(), "createTimestamp", null);
        setBooleanField(term2343, term2343.getClass(), "softDeleted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term2343, args);
    }

};


