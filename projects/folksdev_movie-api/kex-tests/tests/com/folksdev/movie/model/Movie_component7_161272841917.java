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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Movie_component7_161272841917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17006;

    public Movie_component7_161272841917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17164 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term17163 = ((Class) term17164).getDeclaredField((String) "ROMANCE");
        ((Field) term17163).setAccessible(true);
        Object enum67 =  ((Field) term17163).get((Object) null);
        Class<? extends Object> term17367 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term17366 = ((Class) term17367).getDeclaredField((String) "THRILLER");
        ((Field) term17366).setAccessible(true);
        Object enum68 =  ((Field) term17366).get((Object) null);
        Class<? extends Object> term17573 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term17572 = ((Class) term17573).getDeclaredField((String) "FANTASY");
        ((Field) term17572).setAccessible(true);
        Object enum69 =  ((Field) term17572).get((Object) null);
        Class<? extends Object> term17776 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term17775 = ((Class) term17776).getDeclaredField((String) "HORROR");
        ((Field) term17775).setAccessible(true);
        Object enum70 =  ((Field) term17775).get((Object) null);
        Class<? extends Object> term17976 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term17975 = ((Class) term17976).getDeclaredField((String) "COMEDY");
        ((Field) term17975).setAccessible(true);
        Object enum71 =  ((Field) term17975).get((Object) null);
        Class<? extends Object> term18176 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term18175 = ((Class) term18176).getDeclaredField((String) "ROMANCE");
        ((Field) term18175).setAccessible(true);
        Object enum72 =  ((Field) term18175).get((Object) null);
        ArrayList term17057 = new ArrayList();
        ((ArrayList) term17057).add(enum67);
        ((ArrayList) term17057).add(enum68);
        ((ArrayList) term17057).add(enum69);
        ((ArrayList) term17057).add(enum70);
        ((ArrayList) term17057).add(enum67);
        ((ArrayList) term17057).add(enum70);
        ((ArrayList) term17057).add(enum71);
        ((ArrayList) term17057).add(enum72);
        HashMap term17080 = new HashMap();
        Set<Object> term18378 =  ((Map) term17080).keySet();
        HashSet term17079 = new HashSet((Collection<? extends Object>) term18378);
        term17006 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term17085 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term17122 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term17006, term17006.getClass(), "id", "JayazbYDLK");
        setField(term17006, term17006.getClass(), "title", "ORDuSTrpNA");
        setField(term17006, term17006.getClass(), "description", "hysThIPoEJ");
        setField(term17006, term17006.getClass(), "imdbUrl", "dfZepHfGwh");
        setIntField(term17006, term17006.getClass(), "duration", 278355793);
        setIntField(term17006, term17006.getClass(), "featuredYear", -310648604);
        setField(term17006, term17006.getClass(), "genresTypes", term17057);
        setField(term17006, term17006.getClass(), "actors", term17079);
        setField(term17085, term17085.getClass(), "id", "zjfMxUERFZ");
        setField(term17085, term17085.getClass(), "name", "ooVlhmiOff");
        setField(term17085, term17085.getClass(), "lastName", "dUNzDLXJcj");
        setField(term17085, term17085.getClass(), "movies", null);
        setField(term17006, term17006.getClass(), "director", term17085);
        setField(term17122, term17122.getClass(), "id", null);
        setField(term17122, term17122.getClass(), "name", null);
        setField(term17006, term17006.getClass(), "publisher", term17122);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component7", argTypes, term17006, args);
    }

};


