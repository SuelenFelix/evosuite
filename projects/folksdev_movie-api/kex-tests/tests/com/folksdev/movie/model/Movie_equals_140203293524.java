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
import java.lang.String;
import java.lang.Object;

public class Movie_equals_140203293524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23277;
     Object term23338;

    public Movie_equals_140203293524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23380 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term23379 = ((Class) term23380).getDeclaredField((String) "ACTION");
        ((Field) term23379).setAccessible(true);
        Object enum92 =  ((Field) term23379).get((Object) null);
        Class<? extends Object> term23580 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term23579 = ((Class) term23580).getDeclaredField((String) "THRILLER");
        ((Field) term23579).setAccessible(true);
        Object enum93 =  ((Field) term23579).get((Object) null);
        ArrayList term23328 = new ArrayList();
        ((ArrayList) term23328).add(enum92);
        ((ArrayList) term23328).add(enum93);
        ((ArrayList) term23328).add(enum92);
        term23277 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term23277, term23277.getClass(), "id", "ffKeJGEXBT");
        setField(term23277, term23277.getClass(), "title", "rsnXTpfhqf");
        setField(term23277, term23277.getClass(), "description", "gzvlGZVfnZ");
        setField(term23277, term23277.getClass(), "imdbUrl", "rmSqCaXWHi");
        setIntField(term23277, term23277.getClass(), "duration", 291864719);
        setIntField(term23277, term23277.getClass(), "featuredYear", -1549607466);
        setField(term23277, term23277.getClass(), "genresTypes", term23328);
        setField(term23277, term23277.getClass(), "actors", null);
        setField(term23277, term23277.getClass(), "director", null);
        setField(term23277, term23277.getClass(), "publisher", null);
        term23338 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23338;
        callMethod(klass, "equals", argTypes, term23277, args);
    }

};


