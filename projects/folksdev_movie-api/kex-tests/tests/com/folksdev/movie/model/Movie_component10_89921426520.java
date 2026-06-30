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

public class Movie_component10_89921426520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20042;

    public Movie_component10_89921426520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20147 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term20146 = ((Class) term20147).getDeclaredField((String) "MYSTERY");
        ((Field) term20146).setAccessible(true);
        Object enum80 =  ((Field) term20146).get((Object) null);
        Class<? extends Object> term20350 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term20349 = ((Class) term20350).getDeclaredField((String) "ROMANCE");
        ((Field) term20349).setAccessible(true);
        Object enum81 =  ((Field) term20349).get((Object) null);
        Class<? extends Object> term20553 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term20552 = ((Class) term20553).getDeclaredField((String) "THRILLER");
        ((Field) term20552).setAccessible(true);
        Object enum82 =  ((Field) term20552).get((Object) null);
        ArrayList term20093 = new ArrayList();
        ((ArrayList) term20093).add(enum80);
        ((ArrayList) term20093).add(enum81);
        ((ArrayList) term20093).add(enum81);
        ((ArrayList) term20093).add(enum82);
        term20042 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term20042, term20042.getClass(), "id", "SNmHXwCiFY");
        setField(term20042, term20042.getClass(), "title", "HZfkWoqyUW");
        setField(term20042, term20042.getClass(), "description", "QRwANPSyfT");
        setField(term20042, term20042.getClass(), "imdbUrl", "DbZKLwYBgy");
        setIntField(term20042, term20042.getClass(), "duration", -1332748804);
        setIntField(term20042, term20042.getClass(), "featuredYear", 1774507971);
        setField(term20042, term20042.getClass(), "genresTypes", term20093);
        setField(term20042, term20042.getClass(), "actors", null);
        setField(term20042, term20042.getClass(), "director", null);
        setField(term20042, term20042.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component10", argTypes, term20042, args);
    }

};


