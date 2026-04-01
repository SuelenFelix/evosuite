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

public class Actor_component4_84674026211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32715;

    public Actor_component4_84674026211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32775 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term32774 = ((Class) term32775).getDeclaredField((String) "FEMALE");
        ((Field) term32774).setAccessible(true);
        Object enum110 = ((Field) term32774).get((Object) null);
        term32715 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term32740 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32715, term32715.getClass(), "id", "ZPnUGVLyiF");
        setField(term32715, term32715.getClass(), "name", "iGWKoojIzf");
        setIntField(term32740, term32740.getClass(), "year", 2021);
        setShortField(term32740, term32740.getClass(), "month", (short) 9);
        setShortField(term32740, term32740.getClass(), "day", (short) 22);
        setField(term32715, term32715.getClass(), "dateOfBirth", term32740);
        setField(term32715, term32715.getClass(), "gender", enum110);
        setField(term32715, term32715.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component4", argTypes, term32715, args);
    }

};


