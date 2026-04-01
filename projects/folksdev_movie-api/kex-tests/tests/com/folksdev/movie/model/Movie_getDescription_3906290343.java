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

public class Movie_getDescription_3906290343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4695;

    public Movie_getDescription_3906290343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4850 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term4849 = ((Class) term4850).getDeclaredField((String) "DRAMA");
        ((Field) term4849).setAccessible(true);
        Object enum15 =  ((Field) term4849).get((Object) null);
        Class<? extends Object> term5047 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term5046 = ((Class) term5047).getDeclaredField((String) "DRAMA");
        ((Field) term5046).setAccessible(true);
        Object enum16 =  ((Field) term5046).get((Object) null);
        Class<? extends Object> term5244 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term5243 = ((Class) term5244).getDeclaredField((String) "ACTION");
        ((Field) term5243).setAccessible(true);
        Object enum17 =  ((Field) term5243).get((Object) null);
        Class<? extends Object> term5444 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term5443 = ((Class) term5444).getDeclaredField((String) "SCI_FI");
        ((Field) term5443).setAccessible(true);
        Object enum18 =  ((Field) term5443).get((Object) null);
        Class<? extends Object> term5644 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term5643 = ((Class) term5644).getDeclaredField((String) "ROMANCE");
        ((Field) term5643).setAccessible(true);
        Object enum19 =  ((Field) term5643).get((Object) null);
        ArrayList term4746 = new ArrayList();
        ((ArrayList) term4746).add(enum15);
        ((ArrayList) term4746).add(enum16);
        ((ArrayList) term4746).add(enum17);
        ((ArrayList) term4746).add(enum18);
        ((ArrayList) term4746).add(enum17);
        ((ArrayList) term4746).add(enum19);
        ((ArrayList) term4746).add(enum18);
        ((ArrayList) term4746).add(enum18);
        HashMap term4766 = new HashMap();
        Set<Object> term5846 =  ((Map) term4766).keySet();
        HashSet term4765 = new HashSet((Collection<? extends Object>) term5846);
        term4695 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term4771 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term4808 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term4695, term4695.getClass(), "id", "SrWMUlbtWV");
        setField(term4695, term4695.getClass(), "title", "VePIumgrrU");
        setField(term4695, term4695.getClass(), "description", "DPwIqlszZo");
        setField(term4695, term4695.getClass(), "imdbUrl", "mNgDshwZNc");
        setIntField(term4695, term4695.getClass(), "duration", 1557431527);
        setIntField(term4695, term4695.getClass(), "featuredYear", -1504890659);
        setField(term4695, term4695.getClass(), "genresTypes", term4746);
        setField(term4695, term4695.getClass(), "actors", term4765);
        setField(term4771, term4771.getClass(), "id", "pDqgDbJoFw");
        setField(term4771, term4771.getClass(), "name", "iVOvTzOxwt");
        setField(term4771, term4771.getClass(), "lastName", "BjZQdecXvB");
        setField(term4771, term4771.getClass(), "movies", null);
        setField(term4695, term4695.getClass(), "director", term4771);
        setField(term4808, term4808.getClass(), "id", null);
        setField(term4808, term4808.getClass(), "name", null);
        setField(term4695, term4695.getClass(), "publisher", term4808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term4695, args);
    }

};


