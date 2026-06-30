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
import java.lang.Integer;
import java.util.ArrayList;

public class BaseMovieRequest_getDescription_4997713481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3309;

    public BaseMovieRequest_getDescription_4997713481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term3314 = new Integer(0);
        Integer term3316 = new Integer(0);
        ArrayList term3318 = new ArrayList();
        ArrayList term3322 = new ArrayList();
        term3309 = newInstance(Class.forName("com.folksdev.movie.dto.BaseMovieRequest"));
        setField(term3309, term3309.getClass(), "description", "");
        setField(term3309, term3309.getClass(), "imdbUrl", "");
        setField(term3309, term3309.getClass(), "duration", term3314);
        setField(term3309, term3309.getClass(), "featuredYear", term3316);
        setField(term3309, term3309.getClass(), "genresType", term3318);
        setField(term3309, term3309.getClass(), "actorIds", term3322);
        setField(term3309, term3309.getClass(), "publisherId", "");
        setField(term3309, term3309.getClass(), "directorId", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.dto.BaseMovieRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term3309, args);
    }

};


