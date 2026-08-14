package com.karankumar.booksapi.model.genre;

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
import static com.karankumar.booksapi.model.genre.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class Genre_getName_20210831714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2931;

    public Genre_getName_20210831714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2932 = new Long(-8400487765614892086L);
        term2931 = newInstance(Class.forName("com.karankumar.booksapi.model.genre.Genre"));
        setField(term2931, term2931.getClass(), "id", term2932);
        setField(term2931, term2931.getClass(), "name", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.genre.Genre");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term2931, args);
    }

};


