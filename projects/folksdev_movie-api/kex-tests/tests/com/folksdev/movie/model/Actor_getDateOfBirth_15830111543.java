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

public class Actor_getDateOfBirth_15830111543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30798;

    public Actor_getDateOfBirth_15830111543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30858 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term30857 = ((Class) term30858).getDeclaredField((String) "FEMALE");
        ((Field) term30857).setAccessible(true);
        Object enum102 = ((Field) term30857).get((Object) null);
        term30798 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term30823 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term30798, term30798.getClass(), "id", "xhjqWwsjmc");
        setField(term30798, term30798.getClass(), "name", "GmFORCKDuz");
        setIntField(term30823, term30823.getClass(), "year", 2024);
        setShortField(term30823, term30823.getClass(), "month", (short) 4);
        setShortField(term30823, term30823.getClass(), "day", (short) 19);
        setField(term30798, term30798.getClass(), "dateOfBirth", term30823);
        setField(term30798, term30798.getClass(), "gender", enum102);
        setField(term30798, term30798.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateOfBirth", argTypes, term30798, args);
    }

};


