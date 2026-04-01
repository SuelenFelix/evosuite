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

public class Movie_hashCode_185071961023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22085;

    public Movie_hashCode_185071961023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22240 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term22239 = ((Class) term22240).getDeclaredField((String) "MYSTERY");
        ((Field) term22239).setAccessible(true);
        Object enum87 =  ((Field) term22239).get((Object) null);
        Class<? extends Object> term22443 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term22442 = ((Class) term22443).getDeclaredField((String) "SCI_FI");
        ((Field) term22442).setAccessible(true);
        Object enum88 =  ((Field) term22442).get((Object) null);
        Class<? extends Object> term22643 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term22642 = ((Class) term22643).getDeclaredField((String) "FANTASY");
        ((Field) term22642).setAccessible(true);
        Object enum89 =  ((Field) term22642).get((Object) null);
        Class<? extends Object> term22846 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term22845 = ((Class) term22846).getDeclaredField((String) "ACTION");
        ((Field) term22845).setAccessible(true);
        Object enum90 =  ((Field) term22845).get((Object) null);
        Class<? extends Object> term23046 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term23045 = ((Class) term23046).getDeclaredField((String) "ACTION");
        ((Field) term23045).setAccessible(true);
        Object enum91 =  ((Field) term23045).get((Object) null);
        ArrayList term22136 = new ArrayList();
        ((ArrayList) term22136).add(enum87);
        ((ArrayList) term22136).add(enum88);
        ((ArrayList) term22136).add(enum89);
        ((ArrayList) term22136).add(enum90);
        ((ArrayList) term22136).add(enum87);
        ((ArrayList) term22136).add(enum91);
        ((ArrayList) term22136).add(enum88);
        ((ArrayList) term22136).add(enum90);
        ((ArrayList) term22136).add(enum88);
        HashMap term22156 = new HashMap();
        Set<Object> term23245 =  ((Map) term22156).keySet();
        HashSet term22155 = new HashSet((Collection<? extends Object>) term23245);
        term22085 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term22161 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term22198 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term22085, term22085.getClass(), "id", "OZGyrUPedG");
        setField(term22085, term22085.getClass(), "title", "GAxMzRqmXU");
        setField(term22085, term22085.getClass(), "description", "XMhUDGKSWO");
        setField(term22085, term22085.getClass(), "imdbUrl", "jLgzxtuvVo");
        setIntField(term22085, term22085.getClass(), "duration", -1133405894);
        setIntField(term22085, term22085.getClass(), "featuredYear", 1289741214);
        setField(term22085, term22085.getClass(), "genresTypes", term22136);
        setField(term22085, term22085.getClass(), "actors", term22155);
        setField(term22161, term22161.getClass(), "id", "wmmxjOkPnH");
        setField(term22161, term22161.getClass(), "name", "jgRohUQWxJ");
        setField(term22161, term22161.getClass(), "lastName", "CJlAiZDIQO");
        setField(term22161, term22161.getClass(), "movies", null);
        setField(term22085, term22085.getClass(), "director", term22161);
        setField(term22198, term22198.getClass(), "id", null);
        setField(term22198, term22198.getClass(), "name", null);
        setField(term22085, term22085.getClass(), "publisher", term22198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term22085, args);
    }

};


