package com.alkemy.ong.infrastructure.rest.response.slide;

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
import static com.alkemy.ong.infrastructure.rest.response.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GetSlideResponse_getImageUrl_212738795613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term730;

    public GetSlideResponse_getImageUrl_212738795613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term730 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.GetSlideResponse"));
        setField(term730, term730.getClass(), "id", null);
        setField(term730, term730.getClass(), "imageUrl", null);
        setField(term730, term730.getClass(), "text", null);
        setField(term730, term730.getClass(), "position", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.GetSlideResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term730, args);
    }

};


