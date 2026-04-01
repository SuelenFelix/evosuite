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

public class Movie_toString_193348799622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21787;

    public Movie_toString_193348799622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21886 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term21885 = ((Class) term21886).getDeclaredField((String) "COMEDY");
        ((Field) term21885).setAccessible(true);
        Object enum86 =  ((Field) term21885).get((Object) null);
        ArrayList term21838 = new ArrayList();
        ((ArrayList) term21838).add(enum86);
        term21787 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term21787, term21787.getClass(), "id", "SEldZGJyvX");
        setField(term21787, term21787.getClass(), "title", "vyvpqcHTQN");
        setField(term21787, term21787.getClass(), "description", "QQcpNMSHvA");
        setField(term21787, term21787.getClass(), "imdbUrl", "FLLklaMZvg");
        setIntField(term21787, term21787.getClass(), "duration", -1840305774);
        setIntField(term21787, term21787.getClass(), "featuredYear", 1365087144);
        setField(term21787, term21787.getClass(), "genresTypes", term21838);
        setField(term21787, term21787.getClass(), "actors", null);
        setField(term21787, term21787.getClass(), "director", null);
        setField(term21787, term21787.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term21787, args);
    }

};


