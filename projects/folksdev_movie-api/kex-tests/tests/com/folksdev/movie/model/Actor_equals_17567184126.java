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
     Object term31520;
     Object term31559;

    public Actor_equals_17567184126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31581 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term31580 = ((Class) term31581).getDeclaredField((String) "FEMALE");
        ((Field) term31580).setAccessible(true);
        Object enum105 = ((Field) term31580).get((Object) null);
        term31520 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term31545 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31520, term31520.getClass(), "id", "oGDeaReDRG");
        setField(term31520, term31520.getClass(), "name", "DjDquUkDJf");
        setIntField(term31545, term31545.getClass(), "year", 2019);
        setShortField(term31545, term31545.getClass(), "month", (short) 3);
        setShortField(term31545, term31545.getClass(), "day", (short) 25);
        setField(term31520, term31520.getClass(), "dateOfBirth", term31545);
        setField(term31520, term31520.getClass(), "gender", enum105);
        setField(term31520, term31520.getClass(), "movies", null);
        term31559 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31559;
        callMethod(klass, "equals", argTypes, term31520, args);
    }

};


