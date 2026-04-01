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
     Object term23861;
     Object term23898;

    public Movie_init_12380523426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23820 = new Integer(-1736183862);
        term23822 = new Integer(897010381);
        Class<? extends Object> term23954 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term23953 = ((Class) term23954).getDeclaredField((String) "ACTION");
        ((Field) term23953).setAccessible(true);
        Object enum94 =  ((Field) term23953).get((Object) null);
        Class<? extends Object> term24154 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term24153 = ((Class) term24154).getDeclaredField((String) "DRAMA");
        ((Field) term24153).setAccessible(true);
        Object enum95 =  ((Field) term24153).get((Object) null);
        Class<? extends Object> term24351 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term24350 = ((Class) term24351).getDeclaredField((String) "HORROR");
        ((Field) term24350).setAccessible(true);
        Object enum96 =  ((Field) term24350).get((Object) null);
        term23824 = new LinkedList();
        ((LinkedList) term23824).add(enum94);
        ((LinkedList) term23824).add(enum95);
        ((LinkedList) term23824).add(enum96);
        HashMap term23846 = new HashMap();
        Set<Object> term24550 =  ((Map) term23846).keySet();
        term23845 = new HashSet((Collection<? extends Object>) term24550);
        term23861 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        setField(term23861, term23861.getClass(), "id", "oOrXvGaFwa");
        setField(term23861, term23861.getClass(), "name", "KJSTLGsSvO");
        setField(term23861, term23861.getClass(), "lastName", "kSkiIpaepq");
        setField(term23861, term23861.getClass(), "movies", null);
        term23898 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term23898, term23898.getClass(), "id", "kHtEHBrsFo");
        setField(term23898, term23898.getClass(), "name", "EmAvkhGlPV");
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
        args[7] = term23861;
        args[8] = term23898;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


