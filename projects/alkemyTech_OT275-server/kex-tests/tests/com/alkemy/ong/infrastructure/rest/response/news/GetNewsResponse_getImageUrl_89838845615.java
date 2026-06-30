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

public class GetNewsResponse_getImageUrl_89838845615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1968;

    public GetNewsResponse_getImageUrl_89838845615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1968 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse"));
        setField(term1968, term1968.getClass(), "id", null);
        setField(term1968, term1968.getClass(), "name", null);
        setField(term1968, term1968.getClass(), "content", null);
        setField(term1968, term1968.getClass(), "imageUrl", null);
        setField(term1968, term1968.getClass(), "category", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.news.GetNewsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term1968, args);
    }

};


