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

public class Actor_getName_4470447802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30567;

    public Actor_getName_4470447802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30625 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term30624 = ((Class) term30625).getDeclaredField((String) "MALE");
        ((Field) term30624).setAccessible(true);
        Object enum101 = ((Field) term30624).get((Object) null);
        term30567 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term30592 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term30567, term30567.getClass(), "id", "cyqgSKerVH");
        setField(term30567, term30567.getClass(), "name", "KMFbAPDgQN");
        setIntField(term30592, term30592.getClass(), "year", 2016);
        setShortField(term30592, term30592.getClass(), "month", (short) 8);
        setShortField(term30592, term30592.getClass(), "day", (short) 24);
        setField(term30567, term30567.getClass(), "dateOfBirth", term30592);
        setField(term30567, term30567.getClass(), "gender", enum101);
        setField(term30567, term30567.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term30567, args);
    }

};


