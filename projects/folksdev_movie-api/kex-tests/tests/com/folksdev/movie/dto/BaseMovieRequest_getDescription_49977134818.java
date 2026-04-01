package com.folksdev.movie.dto;

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
import static com.folksdev.movie.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BaseMovieRequest_getDescription_49977134818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4569;

    public BaseMovieRequest_getDescription_49977134818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4569 = newInstance(Class.forName("com.folksdev.movie.dto.BaseMovieRequest"));
        setField(term4569, term4569.getClass(), "description", null);
        setField(term4569, term4569.getClass(), "imdbUrl", null);
        setField(term4569, term4569.getClass(), "duration", null);
        setField(term4569, term4569.getClass(), "featuredYear", null);
        setField(term4569, term4569.getClass(), "genresType", null);
        setField(term4569, term4569.getClass(), "actorIds", null);
        setField(term4569, term4569.getClass(), "publisherId", null);
        setField(term4569, term4569.getClass(), "directorId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term4569, args);
    }

};


