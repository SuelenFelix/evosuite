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

public class Actor_component3_145232809610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32472;

    public Actor_component3_145232809610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32533 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term32532 = ((Class) term32533).getDeclaredField((String) "UNKNOWN");
        ((Field) term32532).setAccessible(true);
        Object enum109 = ((Field) term32532).get((Object) null);
        term32472 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term32497 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32472, term32472.getClass(), "id", "bIZNWEzBTe");
        setField(term32472, term32472.getClass(), "name", "CVhsNqYDrO");
        setIntField(term32497, term32497.getClass(), "year", 2010);
        setShortField(term32497, term32497.getClass(), "month", (short) 7);
        setShortField(term32497, term32497.getClass(), "day", (short) 5);
        setField(term32472, term32472.getClass(), "dateOfBirth", term32497);
        setField(term32472, term32472.getClass(), "gender", enum109);
        setField(term32472, term32472.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component3", argTypes, term32472, args);
    }

};


