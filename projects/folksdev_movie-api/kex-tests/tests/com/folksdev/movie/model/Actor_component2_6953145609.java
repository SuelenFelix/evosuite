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

public class Actor_component2_6953145609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32234;

    public Actor_component2_6953145609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32294 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term32293 = ((Class) term32294).getDeclaredField((String) "FEMALE");
        ((Field) term32293).setAccessible(true);
        Object enum108 = ((Field) term32293).get((Object) null);
        term32234 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term32259 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32234, term32234.getClass(), "id", "igRVOATJPd");
        setField(term32234, term32234.getClass(), "name", "DYaMGxxqDk");
        setIntField(term32259, term32259.getClass(), "year", 2029);
        setShortField(term32259, term32259.getClass(), "month", (short) 6);
        setShortField(term32259, term32259.getClass(), "day", (short) 3);
        setField(term32234, term32234.getClass(), "dateOfBirth", term32259);
        setField(term32234, term32234.getClass(), "gender", enum108);
        setField(term32234, term32234.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component2", argTypes, term32234, args);
    }

};


