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
     Object term23820;
     Object term23822;
     Object term23824;
     Object term23845;
     Object term23862;
     Object term23899;

    public Movie_init_12380523426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23820 = new Integer(-1736183862);
        term23822 = new Integer(897010381);
        Class<? extends Object> term23955 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term23954 = ((Class) term23955).getDeclaredField((String) "ACTION");
        ((Field) term23954).setAccessible(true);
        Object enum94 =  ((Field) term23954).get((Object) null);
        Class<? extends Object> term24155 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term24154 = ((Class) term24155).getDeclaredField((String) "DRAMA");
        ((Field) term24154).setAccessible(true);
        Object enum95 =  ((Field) term24154).get((Object) null);
        Class<? extends Object> term24352 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term24351 = ((Class) term24352).getDeclaredField((String) "HORROR");
        ((Field) term24351).setAccessible(true);
        Object enum96 =  ((Field) term24351).get((Object) null);
        term23824 = new LinkedList();
        ((LinkedList) term23824).add(enum94);
        ((LinkedList) term23824).add(enum95);
        ((LinkedList) term23824).add(enum96);
        HashMap term23846 = new HashMap();
        Set<Object> term24551 =  ((Map) term23846).keySet();
        term23845 = new HashSet((Collection<? extends Object>) term24551);
        term23862 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        setField(term23862, term23862.getClass(), "id", "oOrXvGaFwa");
        setField(term23862, term23862.getClass(), "name", "KJSTLGsSvO");
        setField(term23862, term23862.getClass(), "lastName", "kSkiIpaepq");
        setField(term23862, term23862.getClass(), "movies", null);
        term23899 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term23899, term23899.getClass(), "id", "kHtEHBrsFo");
        setField(term23899, term23899.getClass(), "name", "EmAvkhGlPV");
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
        args[3] = term23820;
        args[4] = term23822;
        args[5] = term23824;
        args[6] = term23845;
        args[7] = term23862;
        args[8] = term23899;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


