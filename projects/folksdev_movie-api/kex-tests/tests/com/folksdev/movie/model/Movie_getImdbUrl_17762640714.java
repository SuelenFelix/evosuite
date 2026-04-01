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

public class Movie_getImdbUrl_17762640714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5877;

    public Movie_getImdbUrl_17762640714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5985 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term5984 = ((Class) term5985).getDeclaredField((String) "MYSTERY");
        ((Field) term5984).setAccessible(true);
        Object enum20 =  ((Field) term5984).get((Object) null);
        Class<? extends Object> term6188 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term6187 = ((Class) term6188).getDeclaredField((String) "THRILLER");
        ((Field) term6187).setAccessible(true);
        Object enum21 =  ((Field) term6187).get((Object) null);
        Class<? extends Object> term6394 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term6393 = ((Class) term6394).getDeclaredField((String) "ACTION");
        ((Field) term6393).setAccessible(true);
        Object enum22 =  ((Field) term6393).get((Object) null);
        Class<? extends Object> term6594 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term6593 = ((Class) term6594).getDeclaredField((String) "SCI_FI");
        ((Field) term6593).setAccessible(true);
        Object enum23 =  ((Field) term6593).get((Object) null);
        ArrayList term5928 = new ArrayList();
        ((ArrayList) term5928).add(enum20);
        ((ArrayList) term5928).add(enum21);
        ((ArrayList) term5928).add(enum22);
        ((ArrayList) term5928).add(enum23);
        ((ArrayList) term5928).add(enum23);
        ((ArrayList) term5928).add(enum21);
        term5877 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term5877, term5877.getClass(), "id", "UqgLPaaAHi");
        setField(term5877, term5877.getClass(), "title", "xypryEkUPF");
        setField(term5877, term5877.getClass(), "description", "zyZTzHNjQr");
        setField(term5877, term5877.getClass(), "imdbUrl", "YSrFKQQwXE");
        setIntField(term5877, term5877.getClass(), "duration", 1687361082);
        setIntField(term5877, term5877.getClass(), "featuredYear", 584893196);
        setField(term5877, term5877.getClass(), "genresTypes", term5928);
        setField(term5877, term5877.getClass(), "actors", null);
        setField(term5877, term5877.getClass(), "director", null);
        setField(term5877, term5877.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImdbUrl", argTypes, term5877, args);
    }

};


