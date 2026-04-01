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

public class Movie_component6_174249619616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15612;

    public Movie_component6_174249619616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15770 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term15769 = ((Class) term15770).getDeclaredField((String) "SCI_FI");
        ((Field) term15769).setAccessible(true);
        Object enum61 =  ((Field) term15769).get((Object) null);
        Class<? extends Object> term15970 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term15969 = ((Class) term15970).getDeclaredField((String) "FANTASY");
        ((Field) term15969).setAccessible(true);
        Object enum62 =  ((Field) term15969).get((Object) null);
        Class<? extends Object> term16173 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term16172 = ((Class) term16173).getDeclaredField((String) "ACTION");
        ((Field) term16172).setAccessible(true);
        Object enum63 =  ((Field) term16172).get((Object) null);
        Class<? extends Object> term16373 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term16372 = ((Class) term16373).getDeclaredField((String) "DRAMA");
        ((Field) term16372).setAccessible(true);
        Object enum64 =  ((Field) term16372).get((Object) null);
        Class<? extends Object> term16570 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term16569 = ((Class) term16570).getDeclaredField((String) "ACTION");
        ((Field) term16569).setAccessible(true);
        Object enum65 =  ((Field) term16569).get((Object) null);
        Class<? extends Object> term16770 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term16769 = ((Class) term16770).getDeclaredField((String) "THRILLER");
        ((Field) term16769).setAccessible(true);
        Object enum66 =  ((Field) term16769).get((Object) null);
        ArrayList term15663 = new ArrayList();
        ((ArrayList) term15663).add(enum61);
        ((ArrayList) term15663).add(enum62);
        ((ArrayList) term15663).add(enum63);
        ((ArrayList) term15663).add(enum64);
        ((ArrayList) term15663).add(enum65);
        ((ArrayList) term15663).add(enum66);
        ((ArrayList) term15663).add(enum65);
        HashMap term15686 = new HashMap();
        Set<Object> term16975 =  ((Map) term15686).keySet();
        HashSet term15685 = new HashSet((Collection<? extends Object>) term16975);
        term15612 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term15691 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term15728 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term15612, term15612.getClass(), "id", "olmFxfIVeh");
        setField(term15612, term15612.getClass(), "title", "iSPirUEhXs");
        setField(term15612, term15612.getClass(), "description", "WWyLFmYpAy");
        setField(term15612, term15612.getClass(), "imdbUrl", "vbSWeJWOQh");
        setIntField(term15612, term15612.getClass(), "duration", -1835839814);
        setIntField(term15612, term15612.getClass(), "featuredYear", -1404350380);
        setField(term15612, term15612.getClass(), "genresTypes", term15663);
        setField(term15612, term15612.getClass(), "actors", term15685);
        setField(term15691, term15691.getClass(), "id", "hyvFdAvkOr");
        setField(term15691, term15691.getClass(), "name", "ewbQRtustW");
        setField(term15691, term15691.getClass(), "lastName", "cABEHYBnys");
        setField(term15691, term15691.getClass(), "movies", null);
        setField(term15612, term15612.getClass(), "director", term15691);
        setField(term15728, term15728.getClass(), "id", null);
        setField(term15728, term15728.getClass(), "name", null);
        setField(term15612, term15612.getClass(), "publisher", term15728);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component6", argTypes, term15612, args);
    }

};


