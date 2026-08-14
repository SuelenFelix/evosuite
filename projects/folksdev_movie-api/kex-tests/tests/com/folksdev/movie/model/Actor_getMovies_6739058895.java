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
import java.lang.Object;
import java.lang.String;

public class Actor_getMovies_6739058895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31281;

    public Actor_getMovies_6739058895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31341 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term31340 = ((Class) term31341).getDeclaredField((String) "FEMALE");
        ((Field) term31340).setAccessible(true);
        Object enum104 = ((Field) term31340).get((Object) null);
        term31281 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term31306 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31281, term31281.getClass(), "id", "lbuoMbJEmY");
        setField(term31281, term31281.getClass(), "name", "mlYqXpLxYN");
        setIntField(term31306, term31306.getClass(), "year", 2011);
        setShortField(term31306, term31306.getClass(), "month", (short) 6);
        setShortField(term31306, term31306.getClass(), "day", (short) 18);
        setField(term31281, term31281.getClass(), "dateOfBirth", term31306);
        setField(term31281, term31281.getClass(), "gender", enum104);
        setField(term31281, term31281.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovies", argTypes, term31281, args);
    }

};


