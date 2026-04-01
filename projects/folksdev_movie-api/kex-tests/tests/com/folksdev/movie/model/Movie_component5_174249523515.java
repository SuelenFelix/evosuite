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

public class Movie_component5_174249523515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14475;

    public Movie_component5_174249523515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14597 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term14596 = ((Class) term14597).getDeclaredField((String) "ROMANCE");
        ((Field) term14596).setAccessible(true);
        Object enum56 =  ((Field) term14596).get((Object) null);
        Class<? extends Object> term14800 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term14799 = ((Class) term14800).getDeclaredField((String) "MYSTERY");
        ((Field) term14799).setAccessible(true);
        Object enum57 =  ((Field) term14799).get((Object) null);
        Class<? extends Object> term15003 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term15002 = ((Class) term15003).getDeclaredField((String) "THRILLER");
        ((Field) term15002).setAccessible(true);
        Object enum58 =  ((Field) term15002).get((Object) null);
        Class<? extends Object> term15209 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term15208 = ((Class) term15209).getDeclaredField((String) "ACTION");
        ((Field) term15208).setAccessible(true);
        Object enum59 =  ((Field) term15208).get((Object) null);
        Class<? extends Object> term15409 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term15408 = ((Class) term15409).getDeclaredField((String) "MYSTERY");
        ((Field) term15408).setAccessible(true);
        Object enum60 =  ((Field) term15408).get((Object) null);
        ArrayList term14526 = new ArrayList();
        ((ArrayList) term14526).add(enum56);
        ((ArrayList) term14526).add(enum57);
        ((ArrayList) term14526).add(enum58);
        ((ArrayList) term14526).add(enum59);
        ((ArrayList) term14526).add(enum59);
        ((ArrayList) term14526).add(enum60);
        HashMap term14546 = new HashMap();
        Set<Object> term15611 =  ((Map) term14546).keySet();
        HashSet term14545 = new HashSet((Collection<? extends Object>) term15611);
        term14475 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term14554 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term14555 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term14475, term14475.getClass(), "id", "kEehLMZcOU");
        setField(term14475, term14475.getClass(), "title", "RhLliqMiOF");
        setField(term14475, term14475.getClass(), "description", "jlhonEGrJH");
        setField(term14475, term14475.getClass(), "imdbUrl", "RKcKwlEYZb");
        setIntField(term14475, term14475.getClass(), "duration", -310528004);
        setIntField(term14475, term14475.getClass(), "featuredYear", -634976996);
        setField(term14475, term14475.getClass(), "genresTypes", term14526);
        setField(term14475, term14475.getClass(), "actors", term14545);
        setField(term14554, term14554.getClass(), "id", null);
        setField(term14554, term14554.getClass(), "name", null);
        setField(term14554, term14554.getClass(), "lastName", null);
        setField(term14554, term14554.getClass(), "movies", null);
        setField(term14475, term14475.getClass(), "director", term14554);
        setField(term14555, term14555.getClass(), "id", null);
        setField(term14555, term14555.getClass(), "name", null);
        setField(term14475, term14475.getClass(), "publisher", term14555);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component5", argTypes, term14475, args);
    }

};


