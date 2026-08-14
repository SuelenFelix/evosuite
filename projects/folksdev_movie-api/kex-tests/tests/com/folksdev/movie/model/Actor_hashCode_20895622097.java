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

public class Actor_hashCode_20895622097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31760;

    public Actor_hashCode_20895622097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31821 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term31820 = ((Class) term31821).getDeclaredField((String) "UNKNOWN");
        ((Field) term31820).setAccessible(true);
        Object enum106 = ((Field) term31820).get((Object) null);
        term31760 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term31785 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31760, term31760.getClass(), "id", "KxEBqnheIv");
        setField(term31760, term31760.getClass(), "name", "ExgxdQmpcx");
        setIntField(term31785, term31785.getClass(), "year", 2024);
        setShortField(term31785, term31785.getClass(), "month", (short) 3);
        setShortField(term31785, term31785.getClass(), "day", (short) 16);
        setField(term31760, term31760.getClass(), "dateOfBirth", term31785);
        setField(term31760, term31760.getClass(), "gender", enum106);
        setField(term31760, term31760.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term31760, args);
    }

};


