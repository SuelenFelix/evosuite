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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Movie_component9_26150183919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19933;

    public Movie_component9_26150183919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19984 = new ArrayList();
        HashMap term19989 = new HashMap();
        Set<Object> term20041 =  ((Map) term19989).keySet();
        HashSet term19988 = new HashSet((Collection<? extends Object>) term20041);
        term19933 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term19999 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term20000 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term19933, term19933.getClass(), "id", "WBrpvMhmsz");
        setField(term19933, term19933.getClass(), "title", "ZzqRHVEXcM");
        setField(term19933, term19933.getClass(), "description", "YYwIEARNxi");
        setField(term19933, term19933.getClass(), "imdbUrl", "rblXBUdTFc");
        setIntField(term19933, term19933.getClass(), "duration", 798043553);
        setIntField(term19933, term19933.getClass(), "featuredYear", 533197381);
        setField(term19933, term19933.getClass(), "genresTypes", term19984);
        setField(term19933, term19933.getClass(), "actors", term19988);
        setField(term19999, term19999.getClass(), "id", null);
        setField(term19999, term19999.getClass(), "name", null);
        setField(term19999, term19999.getClass(), "lastName", null);
        setField(term19999, term19999.getClass(), "movies", null);
        setField(term19933, term19933.getClass(), "director", term19999);
        setField(term20000, term20000.getClass(), "id", null);
        setField(term20000, term20000.getClass(), "name", null);
        setField(term19933, term19933.getClass(), "publisher", term20000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component9", argTypes, term19933, args);
    }

};


