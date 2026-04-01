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
import java.lang.Integer;
import java.util.LinkedList;

public class Movie_copy_73924253621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20756;
     Object term20915;
     Object term20917;
     Object term20919;
     Object term20922;
     Object term20954;
     Object term20991;

    public Movie_copy_73924253621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21057 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term21056 = ((Class) term21057).getDeclaredField((String) "THRILLER");
        ((Field) term21056).setAccessible(true);
        Object enum83 =  ((Field) term21056).get((Object) null);
        Class<? extends Object> term21263 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term21262 = ((Class) term21263).getDeclaredField((String) "SCI_FI");
        ((Field) term21262).setAccessible(true);
        Object enum84 =  ((Field) term21262).get((Object) null);
        Class<? extends Object> term21463 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term21462 = ((Class) term21463).getDeclaredField((String) "ROMANCE");
        ((Field) term21462).setAccessible(true);
        Object enum85 =  ((Field) term21462).get((Object) null);
        ArrayList term20807 = new ArrayList();
        ((ArrayList) term20807).add(enum83);
        ((ArrayList) term20807).add(enum84);
        ((ArrayList) term20807).add(enum83);
        ((ArrayList) term20807).add(enum85);
        ((ArrayList) term20807).add(enum85);
        HashMap term20821 = new HashMap();
        Set<Object> term21665 =  ((Map) term20821).keySet();
        HashSet term20820 = new HashSet((Collection<? extends Object>) term21665);
        term20756 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term20829 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term20866 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term20756, term20756.getClass(), "id", "cNoFvpHBHw");
        setField(term20756, term20756.getClass(), "title", "DoSWbCtsBg");
        setField(term20756, term20756.getClass(), "description", "NrXtkbXwDc");
        setField(term20756, term20756.getClass(), "imdbUrl", "EUapSrAmOe");
        setIntField(term20756, term20756.getClass(), "duration", 719656595);
        setIntField(term20756, term20756.getClass(), "featuredYear", -1516995753);
        setField(term20756, term20756.getClass(), "genresTypes", term20807);
        setField(term20756, term20756.getClass(), "actors", term20820);
        setField(term20829, term20829.getClass(), "id", "mIRMQIxHUD");
        setField(term20829, term20829.getClass(), "name", "FbBMtntDbw");
        setField(term20829, term20829.getClass(), "lastName", "zRnpRGaHlI");
        setField(term20829, term20829.getClass(), "movies", null);
        setField(term20756, term20756.getClass(), "director", term20829);
        setField(term20866, term20866.getClass(), "id", null);
        setField(term20866, term20866.getClass(), "name", null);
        setField(term20756, term20756.getClass(), "publisher", term20866);
        term20915 = new Integer(-1553893255);
        term20917 = new Integer(1303442927);
        term20919 = new LinkedList();
        HashMap term20923 = new HashMap();
        Set<Object> term21736 =  ((Map) term20923).keySet();
        term20922 = new HashSet((Collection<? extends Object>) term21736);
        term20954 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        setField(term20954, term20954.getClass(), "id", "lcCEhCpiZM");
        setField(term20954, term20954.getClass(), "name", "OPJlqMJxdq");
        setField(term20954, term20954.getClass(), "lastName", "COhzwXcfds");
        setField(term20954, term20954.getClass(), "movies", null);
        term20991 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term20991, term20991.getClass(), "id", "GiNZRBZjgO");
        setField(term20991, term20991.getClass(), "name", "ceGAKcClsG");
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
        args[0] = "KKEcpYXNZV";
        args[1] = "shLHFznysy";
        args[2] = "YCKIloBHLj";
        args[3] = "qUWDhAeFJY";
        args[4] = term20915;
        args[5] = term20917;
        args[6] = term20919;
        args[7] = term20922;
        args[8] = term20954;
        args[9] = term20991;
        callMethod(klass, "copy", argTypes, term20756, args);
    }

};


