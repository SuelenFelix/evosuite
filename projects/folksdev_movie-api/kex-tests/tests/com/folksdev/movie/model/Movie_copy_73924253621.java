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
     Object term20758;
     Object term20917;
     Object term20919;
     Object term20921;
     Object term20924;
     Object term20955;
     Object term20992;

    public Movie_copy_73924253621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21058 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term21057 = ((Class) term21058).getDeclaredField((String) "THRILLER");
        ((Field) term21057).setAccessible(true);
        Object enum83 =  ((Field) term21057).get((Object) null);
        Class<? extends Object> term21264 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term21263 = ((Class) term21264).getDeclaredField((String) "SCI_FI");
        ((Field) term21263).setAccessible(true);
        Object enum84 =  ((Field) term21263).get((Object) null);
        Class<? extends Object> term21464 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term21463 = ((Class) term21464).getDeclaredField((String) "ROMANCE");
        ((Field) term21463).setAccessible(true);
        Object enum85 =  ((Field) term21463).get((Object) null);
        ArrayList term20809 = new ArrayList();
        ((ArrayList) term20809).add(enum83);
        ((ArrayList) term20809).add(enum84);
        ((ArrayList) term20809).add(enum83);
        ((ArrayList) term20809).add(enum85);
        ((ArrayList) term20809).add(enum85);
        HashMap term20823 = new HashMap();
        Set<Object> term21666 =  ((Map) term20823).keySet();
        HashSet term20822 = new HashSet((Collection<? extends Object>) term21666);
        term20758 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term20831 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term20868 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term20758, term20758.getClass(), "id", "cNoFvpHBHw");
        setField(term20758, term20758.getClass(), "title", "DoSWbCtsBg");
        setField(term20758, term20758.getClass(), "description", "NrXtkbXwDc");
        setField(term20758, term20758.getClass(), "imdbUrl", "EUapSrAmOe");
        setIntField(term20758, term20758.getClass(), "duration", 719656595);
        setIntField(term20758, term20758.getClass(), "featuredYear", -1516995753);
        setField(term20758, term20758.getClass(), "genresTypes", term20809);
        setField(term20758, term20758.getClass(), "actors", term20822);
        setField(term20831, term20831.getClass(), "id", "mIRMQIxHUD");
        setField(term20831, term20831.getClass(), "name", "FbBMtntDbw");
        setField(term20831, term20831.getClass(), "lastName", "zRnpRGaHlI");
        setField(term20831, term20831.getClass(), "movies", null);
        setField(term20758, term20758.getClass(), "director", term20831);
        setField(term20868, term20868.getClass(), "id", null);
        setField(term20868, term20868.getClass(), "name", null);
        setField(term20758, term20758.getClass(), "publisher", term20868);
        term20917 = new Integer(-1553893255);
        term20919 = new Integer(1303442927);
        term20921 = new LinkedList();
        HashMap term20925 = new HashMap();
        Set<Object> term21737 =  ((Map) term20925).keySet();
        term20924 = new HashSet((Collection<? extends Object>) term21737);
        term20955 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        setField(term20955, term20955.getClass(), "id", "lcCEhCpiZM");
        setField(term20955, term20955.getClass(), "name", "OPJlqMJxdq");
        setField(term20955, term20955.getClass(), "lastName", "COhzwXcfds");
        setField(term20955, term20955.getClass(), "movies", null);
        term20992 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term20992, term20992.getClass(), "id", "GiNZRBZjgO");
        setField(term20992, term20992.getClass(), "name", "ceGAKcClsG");
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
        args[4] = term20917;
        args[5] = term20919;
        args[6] = term20921;
        args[7] = term20924;
        args[8] = term20955;
        args[9] = term20992;
        callMethod(klass, "copy", argTypes, term20758, args);
    }

};


