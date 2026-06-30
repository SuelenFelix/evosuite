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

public class UpdateNewsMapper_toDomain_2484492171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term527;
     Object term529;

    public UpdateNewsMapper_toDomain_2484492171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term527 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.UpdateNewsMapper"));
        Object term528 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.category.GetCategoryMapper"));
        setField(term527, term527.getClass(), "getCategoryMapper", term528);
        term529 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.news.UpdateNewsRequest"));
        setField(term529, term529.getClass(), "name", "hgFbWAUtsu");
        setField(term529, term529.getClass(), "content", "HqoTWlkbwF");
        setField(term529, term529.getClass(), "image", "CwNELDTAPP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.news.UpdateNewsMapper");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Identifiable");
        argTypes[1] = Class.forName("com.alkemy.ong.infrastructure.rest.request.news.UpdateNewsRequest");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term529;
        callMethod(klass, "toDomain", argTypes, term527, args);
    }

};


