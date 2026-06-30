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
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Movie_init_12380523426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23821;
     Object term23823;
     Object term23825;
     Object term23846;
     Object term23863;
     Object term23900;

    public Movie_init_12380523426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23821 = new Integer(-1736183862);
        term23823 = new Integer(897010381);
        Class<? extends Object> term23956 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term23955 = ((Class) term23956).getDeclaredField((String) "ACTION");
        ((Field) term23955).setAccessible(true);
        Object enum94 =  ((Field) term23955).get((Object) null);
        Class<? extends Object> term24156 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term24155 = ((Class) term24156).getDeclaredField((String) "DRAMA");
        ((Field) term24155).setAccessible(true);
        Object enum95 =  ((Field) term24155).get((Object) null);
        Class<? extends Object> term24353 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term24352 = ((Class) term24353).getDeclaredField((String) "HORROR");
        ((Field) term24352).setAccessible(true);
        Object enum96 =  ((Field) term24352).get((Object) null);
        term23825 = new LinkedList();
        ((LinkedList) term23825).add(enum94);
        ((LinkedList) term23825).add(enum95);
        ((LinkedList) term23825).add(enum96);
        HashMap term23847 = new HashMap();
        Set<Object> term24552 =  ((Map) term23847).keySet();
        term23846 = new HashSet((Collection<? extends Object>) term24552);
        term23863 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        setField(term23863, term23863.getClass(), "id", "oOrXvGaFwa");
        setField(term23863, term23863.getClass(), "name", "KJSTLGsSvO");
        setField(term23863, term23863.getClass(), "lastName", "kSkiIpaepq");
        setField(term23863, term23863.getClass(), "movies", null);
        term23900 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term23900, term23900.getClass(), "id", "kHtEHBrsFo");
        setField(term23900, term23900.getClass(), "name", "EmAvkhGlPV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.util.Set");
        argTypes[7] = Class.forName("com.folksdev.movie.model.Director");
        argTypes[8] = Class.forName("com.folksdev.movie.model.Publisher");
        Object[] args = new Object[9];
        args[0] = "mKgLwPdYbY";
        args[1] = "zqykonsLIo";
        args[2] = "KoPzTuvIeK";
        args[3] = term23821;
        args[4] = term23823;
        args[5] = term23825;
        args[6] = term23846;
        args[7] = term23863;
        args[8] = term23900;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


