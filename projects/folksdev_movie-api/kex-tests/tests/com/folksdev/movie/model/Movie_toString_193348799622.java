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
     Object term21788;

    public Movie_toString_193348799622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21887 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term21886 = ((Class) term21887).getDeclaredField((String) "COMEDY");
        ((Field) term21886).setAccessible(true);
        Object enum86 =  ((Field) term21886).get((Object) null);
        ArrayList term21839 = new ArrayList();
        ((ArrayList) term21839).add(enum86);
        term21788 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term21788, term21788.getClass(), "id", "SEldZGJyvX");
        setField(term21788, term21788.getClass(), "title", "vyvpqcHTQN");
        setField(term21788, term21788.getClass(), "description", "QQcpNMSHvA");
        setField(term21788, term21788.getClass(), "imdbUrl", "FLLklaMZvg");
        setIntField(term21788, term21788.getClass(), "duration", -1840305774);
        setIntField(term21788, term21788.getClass(), "featuredYear", 1365087144);
        setField(term21788, term21788.getClass(), "genresTypes", term21839);
        setField(term21788, term21788.getClass(), "actors", null);
        setField(term21788, term21788.getClass(), "director", null);
        setField(term21788, term21788.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term21788, args);
    }

};


