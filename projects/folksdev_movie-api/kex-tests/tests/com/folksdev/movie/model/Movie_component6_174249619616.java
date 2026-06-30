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
     Object term15614;

    public Movie_component6_174249619616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15772 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term15771 = ((Class) term15772).getDeclaredField((String) "SCI_FI");
        ((Field) term15771).setAccessible(true);
        Object enum61 =  ((Field) term15771).get((Object) null);
        Class<? extends Object> term15972 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term15971 = ((Class) term15972).getDeclaredField((String) "FANTASY");
        ((Field) term15971).setAccessible(true);
        Object enum62 =  ((Field) term15971).get((Object) null);
        Class<? extends Object> term16175 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term16174 = ((Class) term16175).getDeclaredField((String) "ACTION");
        ((Field) term16174).setAccessible(true);
        Object enum63 =  ((Field) term16174).get((Object) null);
        Class<? extends Object> term16375 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term16374 = ((Class) term16375).getDeclaredField((String) "DRAMA");
        ((Field) term16374).setAccessible(true);
        Object enum64 =  ((Field) term16374).get((Object) null);
        Class<? extends Object> term16572 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term16571 = ((Class) term16572).getDeclaredField((String) "ACTION");
        ((Field) term16571).setAccessible(true);
        Object enum65 =  ((Field) term16571).get((Object) null);
        Class<? extends Object> term16772 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term16771 = ((Class) term16772).getDeclaredField((String) "THRILLER");
        ((Field) term16771).setAccessible(true);
        Object enum66 =  ((Field) term16771).get((Object) null);
        ArrayList term15665 = new ArrayList();
        ((ArrayList) term15665).add(enum61);
        ((ArrayList) term15665).add(enum62);
        ((ArrayList) term15665).add(enum63);
        ((ArrayList) term15665).add(enum64);
        ((ArrayList) term15665).add(enum65);
        ((ArrayList) term15665).add(enum66);
        ((ArrayList) term15665).add(enum65);
        HashMap term15688 = new HashMap();
        Set<Object> term16977 =  ((Map) term15688).keySet();
        HashSet term15687 = new HashSet((Collection<? extends Object>) term16977);
        term15614 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term15693 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term15730 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term15614, term15614.getClass(), "id", "olmFxfIVeh");
        setField(term15614, term15614.getClass(), "title", "iSPirUEhXs");
        setField(term15614, term15614.getClass(), "description", "WWyLFmYpAy");
        setField(term15614, term15614.getClass(), "imdbUrl", "vbSWeJWOQh");
        setIntField(term15614, term15614.getClass(), "duration", -1835839814);
        setIntField(term15614, term15614.getClass(), "featuredYear", -1404350380);
        setField(term15614, term15614.getClass(), "genresTypes", term15665);
        setField(term15614, term15614.getClass(), "actors", term15687);
        setField(term15693, term15693.getClass(), "id", "hyvFdAvkOr");
        setField(term15693, term15693.getClass(), "name", "ewbQRtustW");
        setField(term15693, term15693.getClass(), "lastName", "cABEHYBnys");
        setField(term15693, term15693.getClass(), "movies", null);
        setField(term15614, term15614.getClass(), "director", term15693);
        setField(term15730, term15730.getClass(), "id", null);
        setField(term15730, term15730.getClass(), "name", null);
        setField(term15614, term15614.getClass(), "publisher", term15730);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component6", argTypes, term15614, args);
    }

};


