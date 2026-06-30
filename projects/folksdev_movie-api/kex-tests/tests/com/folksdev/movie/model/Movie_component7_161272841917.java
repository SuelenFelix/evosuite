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
     Object term17008;

    public Movie_component7_161272841917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17166 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term17165 = ((Class) term17166).getDeclaredField((String) "ROMANCE");
        ((Field) term17165).setAccessible(true);
        Object enum67 =  ((Field) term17165).get((Object) null);
        Class<? extends Object> term17369 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term17368 = ((Class) term17369).getDeclaredField((String) "THRILLER");
        ((Field) term17368).setAccessible(true);
        Object enum68 =  ((Field) term17368).get((Object) null);
        Class<? extends Object> term17575 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term17574 = ((Class) term17575).getDeclaredField((String) "FANTASY");
        ((Field) term17574).setAccessible(true);
        Object enum69 =  ((Field) term17574).get((Object) null);
        Class<? extends Object> term17778 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term17777 = ((Class) term17778).getDeclaredField((String) "HORROR");
        ((Field) term17777).setAccessible(true);
        Object enum70 =  ((Field) term17777).get((Object) null);
        Class<? extends Object> term17978 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term17977 = ((Class) term17978).getDeclaredField((String) "COMEDY");
        ((Field) term17977).setAccessible(true);
        Object enum71 =  ((Field) term17977).get((Object) null);
        Class<? extends Object> term18178 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term18177 = ((Class) term18178).getDeclaredField((String) "ROMANCE");
        ((Field) term18177).setAccessible(true);
        Object enum72 =  ((Field) term18177).get((Object) null);
        ArrayList term17059 = new ArrayList();
        ((ArrayList) term17059).add(enum67);
        ((ArrayList) term17059).add(enum68);
        ((ArrayList) term17059).add(enum69);
        ((ArrayList) term17059).add(enum70);
        ((ArrayList) term17059).add(enum67);
        ((ArrayList) term17059).add(enum70);
        ((ArrayList) term17059).add(enum71);
        ((ArrayList) term17059).add(enum72);
        HashMap term17082 = new HashMap();
        Set<Object> term18380 =  ((Map) term17082).keySet();
        HashSet term17081 = new HashSet((Collection<? extends Object>) term18380);
        term17008 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term17087 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term17124 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term17008, term17008.getClass(), "id", "JayazbYDLK");
        setField(term17008, term17008.getClass(), "title", "ORDuSTrpNA");
        setField(term17008, term17008.getClass(), "description", "hysThIPoEJ");
        setField(term17008, term17008.getClass(), "imdbUrl", "dfZepHfGwh");
        setIntField(term17008, term17008.getClass(), "duration", 278355793);
        setIntField(term17008, term17008.getClass(), "featuredYear", -310648604);
        setField(term17008, term17008.getClass(), "genresTypes", term17059);
        setField(term17008, term17008.getClass(), "actors", term17081);
        setField(term17087, term17087.getClass(), "id", "zjfMxUERFZ");
        setField(term17087, term17087.getClass(), "name", "ooVlhmiOff");
        setField(term17087, term17087.getClass(), "lastName", "dUNzDLXJcj");
        setField(term17087, term17087.getClass(), "movies", null);
        setField(term17008, term17008.getClass(), "director", term17087);
        setField(term17124, term17124.getClass(), "id", null);
        setField(term17124, term17124.getClass(), "name", null);
        setField(term17008, term17008.getClass(), "publisher", term17124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component7", argTypes, term17008, args);
    }

};


