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
     Object term32716;

    public Actor_component4_84674026211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32776 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term32775 = ((Class) term32776).getDeclaredField((String) "FEMALE");
        ((Field) term32775).setAccessible(true);
        Object enum110 = ((Field) term32775).get((Object) null);
        term32716 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term32741 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32716, term32716.getClass(), "id", "ZPnUGVLyiF");
        setField(term32716, term32716.getClass(), "name", "iGWKoojIzf");
        setIntField(term32741, term32741.getClass(), "year", 2021);
        setShortField(term32741, term32741.getClass(), "month", (short) 9);
        setShortField(term32741, term32741.getClass(), "day", (short) 22);
        setField(term32716, term32716.getClass(), "dateOfBirth", term32741);
        setField(term32716, term32716.getClass(), "gender", enum110);
        setField(term32716, term32716.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component4", argTypes, term32716, args);
    }

};


