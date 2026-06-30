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

public class Movie_getFeaturedYear_5765936846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6888;

    public Movie_getFeaturedYear_5765936846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6993 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term6992 = ((Class) term6993).getDeclaredField((String) "SCI_FI");
        ((Field) term6992).setAccessible(true);
        Object enum24 =  ((Field) term6992).get((Object) null);
        Class<? extends Object> term7193 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term7192 = ((Class) term7193).getDeclaredField((String) "THRILLER");
        ((Field) term7192).setAccessible(true);
        Object enum25 =  ((Field) term7192).get((Object) null);
        Class<? extends Object> term7399 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term7398 = ((Class) term7399).getDeclaredField((String) "DRAMA");
        ((Field) term7398).setAccessible(true);
        Object enum26 =  ((Field) term7398).get((Object) null);
        ArrayList term6939 = new ArrayList();
        ((ArrayList) term6939).add(enum24);
        ((ArrayList) term6939).add(enum25);
        ((ArrayList) term6939).add(enum26);
        ((ArrayList) term6939).add(enum25);
        term6888 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term6888, term6888.getClass(), "id", "aJQuCOCvZs");
        setField(term6888, term6888.getClass(), "title", "lHYNCJRiOv");
        setField(term6888, term6888.getClass(), "description", "QVLresHoaP");
        setField(term6888, term6888.getClass(), "imdbUrl", "IbxeAMwLVt");
        setIntField(term6888, term6888.getClass(), "duration", -1347358701);
        setIntField(term6888, term6888.getClass(), "featuredYear", 806595993);
        setField(term6888, term6888.getClass(), "genresTypes", term6939);
        setField(term6888, term6888.getClass(), "actors", null);
        setField(term6888, term6888.getClass(), "director", null);
        setField(term6888, term6888.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeaturedYear", argTypes, term6888, args);
    }

};


