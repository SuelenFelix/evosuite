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
import java.lang.Integer;

public class Movie_copy_73924253648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24665;
     Object term24668;
     Object term24670;

    public Movie_copy_73924253648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24665 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term24665, term24665.getClass(), "id", null);
        setField(term24665, term24665.getClass(), "title", null);
        setField(term24665, term24665.getClass(), "description", null);
        setField(term24665, term24665.getClass(), "imdbUrl", null);
        setIntField(term24665, term24665.getClass(), "duration", 0);
        setIntField(term24665, term24665.getClass(), "featuredYear", 0);
        setField(term24665, term24665.getClass(), "genresTypes", null);
        setField(term24665, term24665.getClass(), "actors", null);
        setField(term24665, term24665.getClass(), "director", null);
        setField(term24665, term24665.getClass(), "publisher", null);
        term24668 = new Integer(0);
        term24670 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.util.List");
        argTypes[7] = Class.forName("java.util.Set");
        argTypes[8] = Class.forName("com.folksdev.movie.model.Director");
        argTypes[9] = Class.forName("com.folksdev.movie.model.Publisher");
        Object[] args = new Object[10];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term24668;
        args[5] = term24670;
        args[6] = null;
        args[7] = null;
        args[8] = null;
        args[9] = null;
        callMethod(klass, "copy", argTypes, term24665, args);
    }

};


