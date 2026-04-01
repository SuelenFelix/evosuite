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
     Object term31759;

    public Actor_hashCode_20895622097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31820 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term31819 = ((Class) term31820).getDeclaredField((String) "UNKNOWN");
        ((Field) term31819).setAccessible(true);
        Object enum106 = ((Field) term31819).get((Object) null);
        term31759 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term31784 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31759, term31759.getClass(), "id", "KxEBqnheIv");
        setField(term31759, term31759.getClass(), "name", "ExgxdQmpcx");
        setIntField(term31784, term31784.getClass(), "year", 2024);
        setShortField(term31784, term31784.getClass(), "month", (short) 3);
        setShortField(term31784, term31784.getClass(), "day", (short) 16);
        setField(term31759, term31759.getClass(), "dateOfBirth", term31784);
        setField(term31759, term31759.getClass(), "gender", enum106);
        setField(term31759, term31759.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term31759, args);
    }

};


