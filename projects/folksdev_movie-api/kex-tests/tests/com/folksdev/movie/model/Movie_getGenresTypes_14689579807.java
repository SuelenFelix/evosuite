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

public class Movie_getGenresTypes_14689579807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7595;

    public Movie_getGenresTypes_14689579807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7753 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term7752 = ((Class) term7753).getDeclaredField((String) "ACTION");
        ((Field) term7752).setAccessible(true);
        Object enum27 =  ((Field) term7752).get((Object) null);
        Class<? extends Object> term7953 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term7952 = ((Class) term7953).getDeclaredField((String) "THRILLER");
        ((Field) term7952).setAccessible(true);
        Object enum28 =  ((Field) term7952).get((Object) null);
        Class<? extends Object> term8159 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term8158 = ((Class) term8159).getDeclaredField((String) "SCI_FI");
        ((Field) term8158).setAccessible(true);
        Object enum29 =  ((Field) term8158).get((Object) null);
        Class<? extends Object> term8359 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term8358 = ((Class) term8359).getDeclaredField((String) "HORROR");
        ((Field) term8358).setAccessible(true);
        Object enum30 =  ((Field) term8358).get((Object) null);
        Class<? extends Object> term8559 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term8558 = ((Class) term8559).getDeclaredField((String) "COMEDY");
        ((Field) term8558).setAccessible(true);
        Object enum31 =  ((Field) term8558).get((Object) null);
        ArrayList term7646 = new ArrayList();
        ((ArrayList) term7646).add(enum27);
        ((ArrayList) term7646).add(enum28);
        ((ArrayList) term7646).add(enum29);
        ((ArrayList) term7646).add(enum30);
        ((ArrayList) term7646).add(enum31);
        ((ArrayList) term7646).add(enum28);
        ((ArrayList) term7646).add(enum30);
        HashMap term7666 = new HashMap();
        Set<Object> term8758 =  ((Map) term7666).keySet();
        HashSet term7665 = new HashSet((Collection<? extends Object>) term8758);
        term7595 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term7674 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term7711 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term7595, term7595.getClass(), "id", "eoEvZbdLjL");
        setField(term7595, term7595.getClass(), "title", "BkIxsyPkGy");
        setField(term7595, term7595.getClass(), "description", "mrMGwoRgVY");
        setField(term7595, term7595.getClass(), "imdbUrl", "mxVLTgCwki");
        setIntField(term7595, term7595.getClass(), "duration", 371943306);
        setIntField(term7595, term7595.getClass(), "featuredYear", 982388293);
        setField(term7595, term7595.getClass(), "genresTypes", term7646);
        setField(term7595, term7595.getClass(), "actors", term7665);
        setField(term7674, term7674.getClass(), "id", "dWVwcwFGNo");
        setField(term7674, term7674.getClass(), "name", "PNdLRrSAIY");
        setField(term7674, term7674.getClass(), "lastName", "nJnRIRiLZK");
        setField(term7674, term7674.getClass(), "movies", null);
        setField(term7595, term7595.getClass(), "director", term7674);
        setField(term7711, term7711.getClass(), "id", null);
        setField(term7711, term7711.getClass(), "name", null);
        setField(term7595, term7595.getClass(), "publisher", term7711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenresTypes", argTypes, term7595, args);
    }

};


