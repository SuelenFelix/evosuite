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

public class Movie_getDirector_6875587099 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9093;

    public Movie_getDirector_6875587099() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9195 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term9194 = ((Class) term9195).getDeclaredField((String) "ACTION");
        ((Field) term9194).setAccessible(true);
        Object enum33 =  ((Field) term9194).get((Object) null);
        Class<? extends Object> term9395 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term9394 = ((Class) term9395).getDeclaredField((String) "ACTION");
        ((Field) term9394).setAccessible(true);
        Object enum34 =  ((Field) term9394).get((Object) null);
        ArrayList term9144 = new ArrayList();
        ((ArrayList) term9144).add(enum33);
        ((ArrayList) term9144).add(enum34);
        term9093 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term9093, term9093.getClass(), "id", "iptRXVDoYE");
        setField(term9093, term9093.getClass(), "title", "kucsxnvbES");
        setField(term9093, term9093.getClass(), "description", "IdGzDFfcZf");
        setField(term9093, term9093.getClass(), "imdbUrl", "KDdRNhZmnU");
        setIntField(term9093, term9093.getClass(), "duration", 1320570890);
        setIntField(term9093, term9093.getClass(), "featuredYear", -130649791);
        setField(term9093, term9093.getClass(), "genresTypes", term9144);
        setField(term9093, term9093.getClass(), "actors", null);
        setField(term9093, term9093.getClass(), "director", null);
        setField(term9093, term9093.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDirector", argTypes, term9093, args);
    }

};


