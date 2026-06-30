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

public class Actor_equals_17567184126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31521;
     Object term31560;

    public Actor_equals_17567184126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31582 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term31581 = ((Class) term31582).getDeclaredField((String) "FEMALE");
        ((Field) term31581).setAccessible(true);
        Object enum105 = ((Field) term31581).get((Object) null);
        term31521 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term31546 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31521, term31521.getClass(), "id", "oGDeaReDRG");
        setField(term31521, term31521.getClass(), "name", "DjDquUkDJf");
        setIntField(term31546, term31546.getClass(), "year", 2019);
        setShortField(term31546, term31546.getClass(), "month", (short) 3);
        setShortField(term31546, term31546.getClass(), "day", (short) 25);
        setField(term31521, term31521.getClass(), "dateOfBirth", term31546);
        setField(term31521, term31521.getClass(), "gender", enum105);
        setField(term31521, term31521.getClass(), "movies", null);
        term31560 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31560;
        callMethod(klass, "equals", argTypes, term31521, args);
    }

};


