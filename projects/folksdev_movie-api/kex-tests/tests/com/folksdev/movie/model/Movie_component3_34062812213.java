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

public class Movie_component3_34062812213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12049;

    public Movie_component3_34062812213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12160 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term12159 = ((Class) term12160).getDeclaredField((String) "COMEDY");
        ((Field) term12159).setAccessible(true);
        Object enum45 =  ((Field) term12159).get((Object) null);
        Class<? extends Object> term12360 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term12359 = ((Class) term12360).getDeclaredField((String) "ACTION");
        ((Field) term12359).setAccessible(true);
        Object enum46 =  ((Field) term12359).get((Object) null);
        Class<? extends Object> term12560 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term12559 = ((Class) term12560).getDeclaredField((String) "HORROR");
        ((Field) term12559).setAccessible(true);
        Object enum47 =  ((Field) term12559).get((Object) null);
        Class<? extends Object> term12760 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term12759 = ((Class) term12760).getDeclaredField((String) "DRAMA");
        ((Field) term12759).setAccessible(true);
        Object enum48 =  ((Field) term12759).get((Object) null);
        Class<? extends Object> term12957 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term12956 = ((Class) term12957).getDeclaredField((String) "DRAMA");
        ((Field) term12956).setAccessible(true);
        Object enum49 =  ((Field) term12956).get((Object) null);
        ArrayList term12100 = new ArrayList();
        ((ArrayList) term12100).add(enum45);
        ((ArrayList) term12100).add(enum46);
        ((ArrayList) term12100).add(enum45);
        ((ArrayList) term12100).add(enum45);
        ((ArrayList) term12100).add(enum47);
        ((ArrayList) term12100).add(enum48);
        ((ArrayList) term12100).add(enum46);
        ((ArrayList) term12100).add(enum49);
        term12049 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term12049, term12049.getClass(), "id", "gVnDVbSyKa");
        setField(term12049, term12049.getClass(), "title", "kdCYNMSuoD");
        setField(term12049, term12049.getClass(), "description", "eRYlSLwtvV");
        setField(term12049, term12049.getClass(), "imdbUrl", "duOyJsARTD");
        setIntField(term12049, term12049.getClass(), "duration", -1656687479);
        setIntField(term12049, term12049.getClass(), "featuredYear", -249614216);
        setField(term12049, term12049.getClass(), "genresTypes", term12100);
        setField(term12049, term12049.getClass(), "actors", null);
        setField(term12049, term12049.getClass(), "director", null);
        setField(term12049, term12049.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term12049, args);
    }

};


