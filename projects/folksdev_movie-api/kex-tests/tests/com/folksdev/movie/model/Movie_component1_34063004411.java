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

public class Movie_component1_34063004411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10095;

    public Movie_component1_34063004411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10197 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term10196 = ((Class) term10197).getDeclaredField((String) "ROMANCE");
        ((Field) term10196).setAccessible(true);
        Object enum37 =  ((Field) term10196).get((Object) null);
        Class<? extends Object> term10400 = Class.forName((String) "com.folksdev.movie.model.GenresType");
        Field term10399 = ((Class) term10400).getDeclaredField((String) "ACTION");
        ((Field) term10399).setAccessible(true);
        Object enum38 =  ((Field) term10399).get((Object) null);
        ArrayList term10146 = new ArrayList();
        ((ArrayList) term10146).add(enum37);
        ((ArrayList) term10146).add(enum38);
        term10095 = newInstance(Class.forName("com.folksdev.movie.model.Movie"));
        setField(term10095, term10095.getClass(), "id", "RxrsjXRVcT");
        setField(term10095, term10095.getClass(), "title", "cfRimmJxqA");
        setField(term10095, term10095.getClass(), "description", "oOnRVGqFmy");
        setField(term10095, term10095.getClass(), "imdbUrl", "LaXzFIlWMk");
        setIntField(term10095, term10095.getClass(), "duration", -525257914);
        setIntField(term10095, term10095.getClass(), "featuredYear", 147209682);
        setField(term10095, term10095.getClass(), "genresTypes", term10146);
        setField(term10095, term10095.getClass(), "actors", null);
        setField(term10095, term10095.getClass(), "director", null);
        setField(term10095, term10095.getClass(), "publisher", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Movie");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component1", argTypes, term10095, args);
    }

};


