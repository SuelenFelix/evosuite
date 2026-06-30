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
import java.util.ArrayList;

public class Movie_getDuration_11195428595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6793;

    public Movie_getDuration_11195428595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6844 = new ArrayList();
        term6793 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term6793, term6793.getClass(), "id", "MlPtwXnJOJ");
        setField(term6793, term6793.getClass(), "title", "DbfiyFeaTe");
        setField(term6793, term6793.getClass(), "description", "dQxXGBtDLZ");
        setField(term6793, term6793.getClass(), "imdbUrl", "EgSgEFIyyN");
        setIntField(term6793, term6793.getClass(), "duration", -1214628358);
        setIntField(term6793, term6793.getClass(), "featuredYear", 1102721075);
        setField(term6793, term6793.getClass(), "genresTypes", term6844);
        setField(term6793, term6793.getClass(), "actors", null);
        setField(term6793, term6793.getClass(), "director", null);
        setField(term6793, term6793.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDuration", argTypes, term6793, args);
    }

};


