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
     Object term31280;

    public Actor_getMovies_6739058895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31340 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term31339 = ((Class) term31340).getDeclaredField((String) "FEMALE");
        ((Field) term31339).setAccessible(true);
        Object enum104 = ((Field) term31339).get((Object) null);
        term31280 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term31305 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31280, term31280.getClass(), "id", "lbuoMbJEmY");
        setField(term31280, term31280.getClass(), "name", "mlYqXpLxYN");
        setIntField(term31305, term31305.getClass(), "year", 2011);
        setShortField(term31305, term31305.getClass(), "month", (short) 6);
        setShortField(term31305, term31305.getClass(), "day", (short) 18);
        setField(term31280, term31280.getClass(), "dateOfBirth", term31305);
        setField(term31280, term31280.getClass(), "gender", enum104);
        setField(term31280, term31280.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovies", argTypes, term31280, args);
    }

};


