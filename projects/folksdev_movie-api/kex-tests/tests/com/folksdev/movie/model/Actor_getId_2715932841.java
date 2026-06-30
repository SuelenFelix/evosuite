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

public class Actor_getId_2715932841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30330;

    public Actor_getId_2715932841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30390 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term30389 = ((Class) term30390).getDeclaredField((String) "FEMALE");
        ((Field) term30389).setAccessible(true);
        Object enum100 = ((Field) term30389).get((Object) null);
        term30330 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term30355 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term30330, term30330.getClass(), "id", "uMLxdkYOdc");
        setField(term30330, term30330.getClass(), "name", "oRXjZDPrtE");
        setIntField(term30355, term30355.getClass(), "year", 2024);
        setShortField(term30355, term30355.getClass(), "month", (short) 1);
        setShortField(term30355, term30355.getClass(), "day", (short) 30);
        setField(term30330, term30330.getClass(), "dateOfBirth", term30355);
        setField(term30330, term30330.getClass(), "gender", enum100);
        setField(term30330, term30330.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term30330, args);
    }

};


