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

public class Movie_getPublisher_43601848110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9594;

    public Movie_getPublisher_43601848110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9696 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term9695 = ((Class) term9696).getDeclaredField((String) "ACTION");
        ((Field) term9695).setAccessible(true);
        Object enum35 =  ((Field) term9695).get((Object) null);
        Class<? extends Object> term9896 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term9895 = ((Class) term9896).getDeclaredField((String) "COMEDY");
        ((Field) term9895).setAccessible(true);
        Object enum36 =  ((Field) term9895).get((Object) null);
        ArrayList term9645 = new ArrayList();
        ((ArrayList) term9645).add(enum35);
        ((ArrayList) term9645).add(enum35);
        ((ArrayList) term9645).add(enum36);
        term9594 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term9594, term9594.getClass(), "id", "bkSgsDrkCN");
        setField(term9594, term9594.getClass(), "title", "hwjlcimgJH");
        setField(term9594, term9594.getClass(), "description", "TLxQzxvizR");
        setField(term9594, term9594.getClass(), "imdbUrl", "uUgJfKAzDM");
        setIntField(term9594, term9594.getClass(), "duration", 842904495);
        setIntField(term9594, term9594.getClass(), "featuredYear", 1008080511);
        setField(term9594, term9594.getClass(), "genresTypes", term9645);
        setField(term9594, term9594.getClass(), "actors", null);
        setField(term9594, term9594.getClass(), "director", null);
        setField(term9594, term9594.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPublisher", argTypes, term9594, args);
    }

};


