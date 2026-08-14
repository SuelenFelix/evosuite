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
     Object term23276;
     Object term23337;

    public Movie_equals_140203293524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23379 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term23378 = ((Class) term23379).getDeclaredField((String) "ACTION");
        ((Field) term23378).setAccessible(true);
        Object enum92 =  ((Field) term23378).get((Object) null);
        Class<? extends Object> term23579 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term23578 = ((Class) term23579).getDeclaredField((String) "THRILLER");
        ((Field) term23578).setAccessible(true);
        Object enum93 =  ((Field) term23578).get((Object) null);
        ArrayList term23327 = new ArrayList();
        ((ArrayList) term23327).add(enum92);
        ((ArrayList) term23327).add(enum93);
        ((ArrayList) term23327).add(enum92);
        term23276 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term23276, term23276.getClass(), "id", "ffKeJGEXBT");
        setField(term23276, term23276.getClass(), "title", "rsnXTpfhqf");
        setField(term23276, term23276.getClass(), "description", "gzvlGZVfnZ");
        setField(term23276, term23276.getClass(), "imdbUrl", "rmSqCaXWHi");
        setIntField(term23276, term23276.getClass(), "duration", 291864719);
        setIntField(term23276, term23276.getClass(), "featuredYear", -1549607466);
        setField(term23276, term23276.getClass(), "genresTypes", term23327);
        setField(term23276, term23276.getClass(), "actors", null);
        setField(term23276, term23276.getClass(), "director", null);
        setField(term23276, term23276.getClass(), "publisher", null);
        term23337 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23337;
        callMethod(klass, "equals", argTypes, term23276, args);
    }

};


