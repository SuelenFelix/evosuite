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
     Object term19931;

    public Movie_component9_26150183919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term19982 = new ArrayList();
        HashMap term19987 = new HashMap();
        Set<Object> term20039 =  ((Map) term19987).keySet();
        HashSet term19986 = new HashSet((Collection<? extends Object>) term20039);
        term19931 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        Object term19997 = newInstance(Class.forName("com.folksdev.movie.model.Director"));
        Object term19998 = newInstance(Class.forName("com.folksdev.movie.model.Publisher"));
        setField(term19931, term19931.getClass(), "id", "WBrpvMhmsz");
        setField(term19931, term19931.getClass(), "title", "ZzqRHVEXcM");
        setField(term19931, term19931.getClass(), "description", "YYwIEARNxi");
        setField(term19931, term19931.getClass(), "imdbUrl", "rblXBUdTFc");
        setIntField(term19931, term19931.getClass(), "duration", 798043553);
        setIntField(term19931, term19931.getClass(), "featuredYear", 533197381);
        setField(term19931, term19931.getClass(), "genresTypes", term19982);
        setField(term19931, term19931.getClass(), "actors", term19986);
        setField(term19997, term19997.getClass(), "id", null);
        setField(term19997, term19997.getClass(), "name", null);
        setField(term19997, term19997.getClass(), "lastName", null);
        setField(term19997, term19997.getClass(), "movies", null);
        setField(term19931, term19931.getClass(), "director", term19997);
        setField(term19998, term19998.getClass(), "id", null);
        setField(term19998, term19998.getClass(), "name", null);
        setField(term19931, term19931.getClass(), "publisher", term19998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component9", argTypes, term19931, args);
    }

};


