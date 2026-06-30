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
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Movie_init_5208078290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1647;
     Object term1649;
     Object term1651;
     Object term1692;
     Object term1698;
     Object term1735;

    public Movie_init_5208078290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1647 = new Integer(158873461);
        term1649 = new Integer(-430151637);
        Class<? extends Object> term1801 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term1800 = ((Class) term1801).getDeclaredField((String) "ROMANCE");
        ((Field) term1800).setAccessible(true);
        Object enum2 =  ((Field) term1800).get((Object) null);
        Class<? extends Object> term2004 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term2003 = ((Class) term2004).getDeclaredField((String) "ACTION");
        ((Field) term2003).setAccessible(true);
        Object enum3 =  ((Field) term2003).get((Object) null);
        Class<? extends Object> term2204 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term2203 = ((Class) term2204).getDeclaredField((String) "MYSTERY");
        ((Field) term2203).setAccessible(true);
        Object enum4 =  ((Field) term2203).get((Object) null);
        term1651 = new LinkedList();
        ((LinkedList) term1651).add(enum2);
        ((LinkedList) term1651).add(enum3);
        ((LinkedList) term1651).add(enum4);
        ((LinkedList) term1651).add((Object)null);
        ((LinkedList) term1651).add((Object)null);
        ((LinkedList) term1651).add((Object)null);
        ((LinkedList) term1651).add((Object)null);
        HashMap term1693 = new HashMap();
        Set<Object> term2406 =  ((Map) term1693).keySet();
        term1692 = new HashSet((Collection<? extends Object>) term2406);
        term1698 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        setField(term1698, term1698.getClass(), "id", "uzmqjnOUXu");
        setField(term1698, term1698.getClass(), "name", "xeyjTOCOJb");
        setField(term1698, term1698.getClass(), "lastName", "DGRqjjdhzy");
        setField(term1698, term1698.getClass(), "movies", null);
        term1735 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term1735, term1735.getClass(), "id", "AobDaplFLl");
        setField(term1735, term1735.getClass(), "name", "pDkMNnAGgv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.util.List");
        argTypes[7] = Class.forName("java.util.Set");
        argTypes[8] = Class.forName("com.folksdev.movie.model.Director");
        argTypes[9] = Class.forName("com.folksdev.movie.model.Publisher");
        Object[] args = new Object[10];
        args[0] = "CAMnvfDLJL";
        args[1] = "mfHtgSbdjD";
        args[2] = "cmuaUiHMVL";
        args[3] = "xjoSGPWUgu";
        args[4] = term1647;
        args[5] = term1649;
        args[6] = term1651;
        args[7] = term1692;
        args[8] = term1698;
        args[9] = term1735;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


