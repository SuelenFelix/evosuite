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
     Object term30800;

    public Actor_getDateOfBirth_15830111543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30860 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term30859 = ((Class) term30860).getDeclaredField((String) "FEMALE");
        ((Field) term30859).setAccessible(true);
        Object enum102 = ((Field) term30859).get((Object) null);
        term30800 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term30825 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term30800, term30800.getClass(), "id", "xhjqWwsjmc");
        setField(term30800, term30800.getClass(), "name", "GmFORCKDuz");
        setIntField(term30825, term30825.getClass(), "year", 2024);
        setShortField(term30825, term30825.getClass(), "month", (short) 4);
        setShortField(term30825, term30825.getClass(), "day", (short) 19);
        setField(term30800, term30800.getClass(), "dateOfBirth", term30825);
        setField(term30800, term30800.getClass(), "gender", enum102);
        setField(term30800, term30800.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDateOfBirth", argTypes, term30800, args);
    }

};


