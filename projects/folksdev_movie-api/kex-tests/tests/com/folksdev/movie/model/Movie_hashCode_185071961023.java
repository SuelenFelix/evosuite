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
     Object term22086;

    public Movie_hashCode_185071961023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22241 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term22240 = ((Class) term22241).getDeclaredField((String) "MYSTERY");
        ((Field) term22240).setAccessible(true);
        Object enum87 =  ((Field) term22240).get((Object) null);
        Class<? extends Object> term22444 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term22443 = ((Class) term22444).getDeclaredField((String) "SCI_FI");
        ((Field) term22443).setAccessible(true);
        Object enum88 =  ((Field) term22443).get((Object) null);
        Class<? extends Object> term22644 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term22643 = ((Class) term22644).getDeclaredField((String) "FANTASY");
        ((Field) term22643).setAccessible(true);
        Object enum89 =  ((Field) term22643).get((Object) null);
        Class<? extends Object> term22847 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term22846 = ((Class) term22847).getDeclaredField((String) "ACTION");
        ((Field) term22846).setAccessible(true);
        Object enum90 =  ((Field) term22846).get((Object) null);
        Class<? extends Object> term23047 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term23046 = ((Class) term23047).getDeclaredField((String) "ACTION");
        ((Field) term23046).setAccessible(true);
        Object enum91 =  ((Field) term23046).get((Object) null);
        ArrayList term22137 = new ArrayList();
        ((ArrayList) term22137).add(enum87);
        ((ArrayList) term22137).add(enum88);
        ((ArrayList) term22137).add(enum89);
        ((ArrayList) term22137).add(enum90);
        ((ArrayList) term22137).add(enum87);
        ((ArrayList) term22137).add(enum91);
        ((ArrayList) term22137).add(enum88);
        ((ArrayList) term22137).add(enum90);
        ((ArrayList) term22137).add(enum88);
        HashMap term22157 = new HashMap();
        Set<Object> term23246 =  ((Map) term22157).keySet();
        HashSet term22156 = new HashSet((Collection<? extends Object>) term23246);
        term22086 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term22162 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term22199 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term22086, term22086.getClass(), "id", "OZGyrUPedG");
        setField(term22086, term22086.getClass(), "title", "GAxMzRqmXU");
        setField(term22086, term22086.getClass(), "description", "XMhUDGKSWO");
        setField(term22086, term22086.getClass(), "imdbUrl", "jLgzxtuvVo");
        setIntField(term22086, term22086.getClass(), "duration", -1133405894);
        setIntField(term22086, term22086.getClass(), "featuredYear", 1289741214);
        setField(term22086, term22086.getClass(), "genresTypes", term22137);
        setField(term22086, term22086.getClass(), "actors", term22156);
        setField(term22162, term22162.getClass(), "id", "wmmxjOkPnH");
        setField(term22162, term22162.getClass(), "name", "jgRohUQWxJ");
        setField(term22162, term22162.getClass(), "lastName", "CJlAiZDIQO");
        setField(term22162, term22162.getClass(), "movies", null);
        setField(term22086, term22086.getClass(), "director", term22162);
        setField(term22199, term22199.getClass(), "id", null);
        setField(term22199, term22199.getClass(), "name", null);
        setField(term22086, term22086.getClass(), "publisher", term22199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term22086, args);
    }

};


