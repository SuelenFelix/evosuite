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

public class Actor_getGender_7555564224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31037;

    public Actor_getGender_7555564224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31098 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term31097 = ((Class) term31098).getDeclaredField((String) "UNKNOWN");
        ((Field) term31097).setAccessible(true);
        Object enum103 = ((Field) term31097).get((Object) null);
        term31037 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term31062 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31037, term31037.getClass(), "id", "YvYPXzCrcU");
        setField(term31037, term31037.getClass(), "name", "KESrHnsKCa");
        setIntField(term31062, term31062.getClass(), "year", 2023);
        setShortField(term31062, term31062.getClass(), "month", (short) 5);
        setShortField(term31062, term31062.getClass(), "day", (short) 30);
        setField(term31037, term31037.getClass(), "dateOfBirth", term31062);
        setField(term31037, term31037.getClass(), "gender", enum103);
        setField(term31037, term31037.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGender", argTypes, term31037, args);
    }

};


