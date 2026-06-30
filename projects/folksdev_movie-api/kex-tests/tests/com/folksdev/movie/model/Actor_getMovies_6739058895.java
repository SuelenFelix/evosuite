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
     Object term31282;

    public Actor_getMovies_6739058895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31342 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term31341 = ((Class) term31342).getDeclaredField((String) "FEMALE");
        ((Field) term31341).setAccessible(true);
        Object enum104 = ((Field) term31341).get((Object) null);
        term31282 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term31307 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31282, term31282.getClass(), "id", "lbuoMbJEmY");
        setField(term31282, term31282.getClass(), "name", "mlYqXpLxYN");
        setIntField(term31307, term31307.getClass(), "year", 2011);
        setShortField(term31307, term31307.getClass(), "month", (short) 6);
        setShortField(term31307, term31307.getClass(), "day", (short) 18);
        setField(term31282, term31282.getClass(), "dateOfBirth", term31307);
        setField(term31282, term31282.getClass(), "gender", enum104);
        setField(term31282, term31282.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovies", argTypes, term31282, args);
    }

};


