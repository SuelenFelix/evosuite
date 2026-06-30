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

public class Movie_component2_34062908312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10599;

    public Movie_component2_34062908312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10781 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term10780 = ((Class) term10781).getDeclaredField((String) "ACTION");
        ((Field) term10780).setAccessible(true);
        Object enum39 =  ((Field) term10780).get((Object) null);
        Class<? extends Object> term10981 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term10980 = ((Class) term10981).getDeclaredField((String) "ROMANCE");
        ((Field) term10980).setAccessible(true);
        Object enum40 =  ((Field) term10980).get((Object) null);
        Class<? extends Object> term11184 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term11183 = ((Class) term11184).getDeclaredField((String) "THRILLER");
        ((Field) term11183).setAccessible(true);
        Object enum41 =  ((Field) term11183).get((Object) null);
        Class<? extends Object> term11390 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term11389 = ((Class) term11390).getDeclaredField((String) "SCI_FI");
        ((Field) term11389).setAccessible(true);
        Object enum42 =  ((Field) term11389).get((Object) null);
        Class<? extends Object> term11590 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term11589 = ((Class) term11590).getDeclaredField((String) "FANTASY");
        ((Field) term11589).setAccessible(true);
        Object enum43 =  ((Field) term11589).get((Object) null);
        Class<? extends Object> term11793 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term11792 = ((Class) term11793).getDeclaredField((String) "THRILLER");
        ((Field) term11792).setAccessible(true);
        Object enum44 =  ((Field) term11792).get((Object) null);
        ArrayList term10650 = new ArrayList();
        ((ArrayList) term10650).add(enum39);
        ((ArrayList) term10650).add(enum40);
        ((ArrayList) term10650).add(enum41);
        ((ArrayList) term10650).add(enum42);
        ((ArrayList) term10650).add(enum43);
        ((ArrayList) term10650).add(enum43);
        ((ArrayList) term10650).add(enum44);
        ((ArrayList) term10650).add(enum42);
        HashMap term10673 = new HashMap();
        Set<Object> term11998 =  ((Map) term10673).keySet();
        HashSet term10672 = new HashSet((Collection<? extends Object>) term11998);
        term10599 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term10678 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term10715 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term10599, term10599.getClass(), "id", "WQnMpDlSfA");
        setField(term10599, term10599.getClass(), "title", "aOIvTQtXiv");
        setField(term10599, term10599.getClass(), "description", "IyjDiknqhA");
        setField(term10599, term10599.getClass(), "imdbUrl", "IHsXSAFYKi");
        setIntField(term10599, term10599.getClass(), "duration", 199287428);
        setIntField(term10599, term10599.getClass(), "featuredYear", -1195339592);
        setField(term10599, term10599.getClass(), "genresTypes", term10650);
        setField(term10599, term10599.getClass(), "actors", term10672);
        setField(term10678, term10678.getClass(), "id", "KyGbLglqbW");
        setField(term10678, term10678.getClass(), "name", "ZKVeStsSNT");
        setField(term10678, term10678.getClass(), "lastName", "cqCXYaAnFB");
        setField(term10678, term10678.getClass(), "movies", null);
        setField(term10599, term10599.getClass(), "director", term10678);
        setField(term10715, term10715.getClass(), "id", "JlgLIHPabR");
        setField(term10715, term10715.getClass(), "name", "LHnkeoNwHq");
        setField(term10599, term10599.getClass(), "publisher", term10715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term10599, args);
    }

};


