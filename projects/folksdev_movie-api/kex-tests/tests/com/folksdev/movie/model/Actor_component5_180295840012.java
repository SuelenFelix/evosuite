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

public class Actor_component5_180295840012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32955;

    public Actor_component5_180295840012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33013 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term33012 = ((Class) term33013).getDeclaredField((String) "MALE");
        ((Field) term33012).setAccessible(true);
        Object enum111 = ((Field) term33012).get((Object) null);
        term32955 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term32980 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32955, term32955.getClass(), "id", "XiytdmxGYa");
        setField(term32955, term32955.getClass(), "name", "xuWbTDWaJN");
        setIntField(term32980, term32980.getClass(), "year", 2010);
        setShortField(term32980, term32980.getClass(), "month", (short) 2);
        setShortField(term32980, term32980.getClass(), "day", (short) 28);
        setField(term32955, term32955.getClass(), "dateOfBirth", term32980);
        setField(term32955, term32955.getClass(), "gender", enum111);
        setField(term32955, term32955.getClass(), "movies", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "component5", argTypes, term32955, args);
    }

};


