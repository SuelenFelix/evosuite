package com.alkemy.ong.application.service.news;

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
import static com.alkemy.ong.application.service.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetNewsUseCaseService_get_11841997372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371;

    public GetNewsUseCaseService_get_11841997372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371 = newInstance(Class.forName("com.alkemy.ong.application.service.news.GetNewsUseCaseService"));
        setField(term371, term371.getClass(), "newsRepository", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.news.GetNewsUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Identifiable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "get", argTypes, term371, args);
    }

};


