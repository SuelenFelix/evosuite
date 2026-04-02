package com.alkemy.ong.infrastructure.rest.response.news;

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
import static com.alkemy.ong.infrastructure.rest.response.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class GetNewsResponse_getName_14946098712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586;

    public GetNewsResponse_getName_14946098712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term587 = new Long(6855071767938501807L);
        Long term626 = new Long(-5892135042702373494L);
        term586 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        Object term625 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.category.GetCategoryResponse"));
        setField(term586, term586.getClass(), "id", term587);
        setField(term586, term586.getClass(), "name", "MvRIxilFMJ");
        setField(term586, term586.getClass(), "content", "iNwOJRBEjp");
        setField(term586, term586.getClass(), "imageUrl", "XylxrMBraH");
        setField(term625, term625.getClass(), "id", term626);
        setField(term625, term625.getClass(), "description", "pORebkoRdD");
        setField(term625, term625.getClass(), "imageUrl", "mXGCWJDOqA");
        setField(term625, term625.getClass(), "name", "dpNsDgfPso");
        setField(term586, term586.getClass(), "category", term625);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term586, args);
    }

};


