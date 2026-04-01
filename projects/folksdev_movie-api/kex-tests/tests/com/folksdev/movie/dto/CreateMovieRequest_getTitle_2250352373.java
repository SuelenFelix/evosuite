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

public class CreateMovieRequest_getTitle_2250352373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1911;

    public CreateMovieRequest_getTitle_2250352373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1911 = newInstance(Class.forName("com.folksdev.movie.dto.CreateMovieRequest"));
        setField(term1911, term1911.getClass(), "title", null);
        setField(term1911, term1911.getClass(), "description", null);
        setField(term1911, term1911.getClass(), "imdbUrl", null);
        setField(term1911, term1911.getClass(), "duration", null);
        setField(term1911, term1911.getClass(), "featuredYear", null);
        setField(term1911, term1911.getClass(), "genresType", null);
        setField(term1911, term1911.getClass(), "actorIds", null);
        setField(term1911, term1911.getClass(), "publisherId", null);
        setField(term1911, term1911.getClass(), "directorId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.CreateMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term1911, args);
    }

};


