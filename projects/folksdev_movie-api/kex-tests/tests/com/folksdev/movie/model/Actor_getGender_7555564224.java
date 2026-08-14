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
     Object term31038;

    public Actor_getGender_7555564224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31099 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term31098 = ((Class) term31099).getDeclaredField((String) "UNKNOWN");
        ((Field) term31098).setAccessible(true);
        Object enum103 = ((Field) term31098).get((Object) null);
        term31038 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term31063 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31038, term31038.getClass(), "id", "YvYPXzCrcU");
        setField(term31038, term31038.getClass(), "name", "KESrHnsKCa");
        setIntField(term31063, term31063.getClass(), "year", 2023);
        setShortField(term31063, term31063.getClass(), "month", (short) 5);
        setShortField(term31063, term31063.getClass(), "day", (short) 30);
        setField(term31038, term31038.getClass(), "dateOfBirth", term31063);
        setField(term31038, term31038.getClass(), "gender", enum103);
        setField(term31038, term31038.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGender", argTypes, term31038, args);
    }

};


