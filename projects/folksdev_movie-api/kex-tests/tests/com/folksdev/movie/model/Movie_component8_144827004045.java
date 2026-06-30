package com.folksdev.movie.model;

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
import static com.folksdev.movie.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Movie_component8_144827004045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24658;

    public Movie_component8_144827004045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24658 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term24658, term24658.getClass(), "id", null);
        setField(term24658, term24658.getClass(), "title", null);
        setField(term24658, term24658.getClass(), "description", null);
        setField(term24658, term24658.getClass(), "imdbUrl", null);
        setIntField(term24658, term24658.getClass(), "duration", 0);
        setIntField(term24658, term24658.getClass(), "featuredYear", 0);
        setField(term24658, term24658.getClass(), "genresTypes", null);
        setField(term24658, term24658.getClass(), "actors", null);
        setField(term24658, term24658.getClass(), "director", null);
        setField(term24658, term24658.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component8", argTypes, term24658, args);
    }

};


