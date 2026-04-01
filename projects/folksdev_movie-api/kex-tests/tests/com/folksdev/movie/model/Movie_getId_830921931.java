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

public class Movie_getId_830921931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2457;

    public Movie_getId_830921931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2565 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term2564 = ((Class) term2565).getDeclaredField((String) "FANTASY");
        ((Field) term2564).setAccessible(true);
        Object enum5 =  ((Field) term2564).get((Object) null);
        Class<? extends Object> term2768 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term2767 = ((Class) term2768).getDeclaredField((String) "COMEDY");
        ((Field) term2767).setAccessible(true);
        Object enum6 =  ((Field) term2767).get((Object) null);
        Class<? extends Object> term2968 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term2967 = ((Class) term2968).getDeclaredField((String) "ACTION");
        ((Field) term2967).setAccessible(true);
        Object enum7 =  ((Field) term2967).get((Object) null);
        Class<? extends Object> term3168 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term3167 = ((Class) term3168).getDeclaredField((String) "HORROR");
        ((Field) term3167).setAccessible(true);
        Object enum8 =  ((Field) term3167).get((Object) null);
        ArrayList term2508 = new ArrayList();
        ((ArrayList) term2508).add(enum5);
        ((ArrayList) term2508).add(enum6);
        ((ArrayList) term2508).add(enum7);
        ((ArrayList) term2508).add(enum8);
        term2457 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term2457, term2457.getClass(), "id", "PaCpFXGzdX");
        setField(term2457, term2457.getClass(), "title", "FftYCNbnks");
        setField(term2457, term2457.getClass(), "description", "lJoltmsadS");
        setField(term2457, term2457.getClass(), "imdbUrl", "mvfDtZNEHr");
        setIntField(term2457, term2457.getClass(), "duration", 1283079251);
        setIntField(term2457, term2457.getClass(), "featuredYear", -523949691);
        setField(term2457, term2457.getClass(), "genresTypes", term2508);
        setField(term2457, term2457.getClass(), "actors", null);
        setField(term2457, term2457.getClass(), "director", null);
        setField(term2457, term2457.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term2457, args);
    }

};


