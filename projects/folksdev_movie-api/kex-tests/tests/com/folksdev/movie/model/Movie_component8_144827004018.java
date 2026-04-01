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

public class Movie_component8_144827004018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18409;

    public Movie_component8_144827004018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18526 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term18525 = ((Class) term18526).getDeclaredField((String) "DRAMA");
        ((Field) term18525).setAccessible(true);
        Object enum73 =  ((Field) term18525).get((Object) null);
        Class<? extends Object> term18723 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term18722 = ((Class) term18723).getDeclaredField((String) "COMEDY");
        ((Field) term18722).setAccessible(true);
        Object enum74 =  ((Field) term18722).get((Object) null);
        Class<? extends Object> term18923 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term18922 = ((Class) term18923).getDeclaredField((String) "THRILLER");
        ((Field) term18922).setAccessible(true);
        Object enum75 =  ((Field) term18922).get((Object) null);
        Class<? extends Object> term19129 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term19128 = ((Class) term19129).getDeclaredField((String) "HORROR");
        ((Field) term19128).setAccessible(true);
        Object enum76 =  ((Field) term19128).get((Object) null);
        Class<? extends Object> term19329 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term19328 = ((Class) term19329).getDeclaredField((String) "COMEDY");
        ((Field) term19328).setAccessible(true);
        Object enum77 =  ((Field) term19328).get((Object) null);
        Class<? extends Object> term19529 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term19528 = ((Class) term19529).getDeclaredField((String) "ROMANCE");
        ((Field) term19528).setAccessible(true);
        Object enum78 =  ((Field) term19528).get((Object) null);
        Class<? extends Object> term19732 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term19731 = ((Class) term19732).getDeclaredField((String) "HORROR");
        ((Field) term19731).setAccessible(true);
        Object enum79 =  ((Field) term19731).get((Object) null);
        ArrayList term18460 = new ArrayList();
        ((ArrayList) term18460).add(enum73);
        ((ArrayList) term18460).add(enum74);
        ((ArrayList) term18460).add(enum75);
        ((ArrayList) term18460).add(enum76);
        ((ArrayList) term18460).add(enum77);
        ((ArrayList) term18460).add(enum77);
        ((ArrayList) term18460).add(enum78);
        ((ArrayList) term18460).add(enum74);
        ((ArrayList) term18460).add(enum79);
        term18409 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term18409, term18409.getClass(), "id", "igruEzTbBE");
        setField(term18409, term18409.getClass(), "title", "LFjgROsRUV");
        setField(term18409, term18409.getClass(), "description", "kHxujKiCsr");
        setField(term18409, term18409.getClass(), "imdbUrl", "cseZveWowm");
        setIntField(term18409, term18409.getClass(), "duration", 1215150180);
        setIntField(term18409, term18409.getClass(), "featuredYear", -1422859977);
        setField(term18409, term18409.getClass(), "genresTypes", term18460);
        setField(term18409, term18409.getClass(), "actors", null);
        setField(term18409, term18409.getClass(), "director", null);
        setField(term18409, term18409.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component8", argTypes, term18409, args);
    }

};


