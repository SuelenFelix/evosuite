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
import java.lang.Boolean;

public class NewsEntity_setSoftDeleted_189979443129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2363;
     Object term2365;

    public NewsEntity_setSoftDeleted_189979443129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2363 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity"));
        setField(term2363, term2363.getClass(), "newsId", null);
        setField(term2363, term2363.getClass(), "name", null);
        setField(term2363, term2363.getClass(), "content", null);
        setField(term2363, term2363.getClass(), "imageUrl", null);
        setField(term2363, term2363.getClass(), "category", null);
        setField(term2363, term2363.getClass(), "createTimestamp", null);
        setBooleanField(term2363, term2363.getClass(), "softDeleted", false);
        term2365 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.entity.NewsEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2365;
        callMethod(klass, "setSoftDeleted", argTypes, term2363, args);
    }

};


