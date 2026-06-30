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
     Object term18411;

    public Movie_component8_144827004018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18528 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term18527 = ((Class) term18528).getDeclaredField((String) "DRAMA");
        ((Field) term18527).setAccessible(true);
        Object enum73 =  ((Field) term18527).get((Object) null);
        Class<? extends Object> term18725 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term18724 = ((Class) term18725).getDeclaredField((String) "COMEDY");
        ((Field) term18724).setAccessible(true);
        Object enum74 =  ((Field) term18724).get((Object) null);
        Class<? extends Object> term18925 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term18924 = ((Class) term18925).getDeclaredField((String) "THRILLER");
        ((Field) term18924).setAccessible(true);
        Object enum75 =  ((Field) term18924).get((Object) null);
        Class<? extends Object> term19131 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term19130 = ((Class) term19131).getDeclaredField((String) "HORROR");
        ((Field) term19130).setAccessible(true);
        Object enum76 =  ((Field) term19130).get((Object) null);
        Class<? extends Object> term19331 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term19330 = ((Class) term19331).getDeclaredField((String) "COMEDY");
        ((Field) term19330).setAccessible(true);
        Object enum77 =  ((Field) term19330).get((Object) null);
        Class<? extends Object> term19531 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term19530 = ((Class) term19531).getDeclaredField((String) "ROMANCE");
        ((Field) term19530).setAccessible(true);
        Object enum78 =  ((Field) term19530).get((Object) null);
        Class<? extends Object> term19734 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term19733 = ((Class) term19734).getDeclaredField((String) "HORROR");
        ((Field) term19733).setAccessible(true);
        Object enum79 =  ((Field) term19733).get((Object) null);
        ArrayList term18462 = new ArrayList();
        ((ArrayList) term18462).add(enum73);
        ((ArrayList) term18462).add(enum74);
        ((ArrayList) term18462).add(enum75);
        ((ArrayList) term18462).add(enum76);
        ((ArrayList) term18462).add(enum77);
        ((ArrayList) term18462).add(enum77);
        ((ArrayList) term18462).add(enum78);
        ((ArrayList) term18462).add(enum74);
        ((ArrayList) term18462).add(enum79);
        term18411 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term18411, term18411.getClass(), "id", "igruEzTbBE");
        setField(term18411, term18411.getClass(), "title", "LFjgROsRUV");
        setField(term18411, term18411.getClass(), "description", "kHxujKiCsr");
        setField(term18411, term18411.getClass(), "imdbUrl", "cseZveWowm");
        setIntField(term18411, term18411.getClass(), "duration", 1215150180);
        setIntField(term18411, term18411.getClass(), "featuredYear", -1422859977);
        setField(term18411, term18411.getClass(), "genresTypes", term18462);
        setField(term18411, term18411.getClass(), "actors", null);
        setField(term18411, term18411.getClass(), "director", null);
        setField(term18411, term18411.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component8", argTypes, term18411, args);
    }

};


