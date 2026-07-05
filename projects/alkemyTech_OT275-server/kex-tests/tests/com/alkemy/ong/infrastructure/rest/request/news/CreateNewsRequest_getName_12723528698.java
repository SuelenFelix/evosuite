package com.alkemy.ong.infrastructure.rest.request.news;

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
import static com.alkemy.ong.infrastructure.rest.request.news.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CreateNewsRequest_getName_12723528698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term943;

    public CreateNewsRequest_getName_12723528698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term943 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.news.CreateNewsRequest"));
        setField(term943, term943.getClass(), "name", null);
        setField(term943, term943.getClass(), "text", null);
        setField(term943, term943.getClass(), "image", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.news.CreateNewsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term943, args);
    }

};


