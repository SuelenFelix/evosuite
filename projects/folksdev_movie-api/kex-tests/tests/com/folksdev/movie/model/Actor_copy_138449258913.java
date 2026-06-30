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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Actor_copy_138449258913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33187;
     Object term33248;
     Object enum113;
     Object term33262;

    public Actor_copy_138449258913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33289 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term33288 = ((Class) term33289).getDeclaredField((String) "MALE");
        ((Field) term33288).setAccessible(true);
        Object enum112 = ((Field) term33288).get((Object) null);
        term33187 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term33212 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33187, term33187.getClass(), "id", "gGVmBWDOsX");
        setField(term33187, term33187.getClass(), "name", "NktLacflHU");
        setIntField(term33212, term33212.getClass(), "year", 2028);
        setShortField(term33212, term33212.getClass(), "month", (short) 9);
        setShortField(term33212, term33212.getClass(), "day", (short) 26);
        setField(term33187, term33187.getClass(), "dateOfBirth", term33212);
        setField(term33187, term33187.getClass(), "gender", enum112);
        setField(term33187, term33187.getClass(), "movies", null);
        term33248 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term33248, term33248.getClass(), "year", 2014);
        setShortField(term33248, term33248.getClass(), "month", (short) 11);
        setShortField(term33248, term33248.getClass(), "day", (short) 1);
        Class<? extends Object> term33483 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term33482 = ((Class) term33483).getDeclaredField((String) "FEMALE");
        ((Field) term33482).setAccessible(true);
        enum113 = ((Field) term33482).get((Object) null);
        HashMap term33263 = new HashMap();
        Set<Object> term33662 =  ((Map) term33263).keySet();
        term33262 = new HashSet((Collection<? extends Object>) term33662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.folksdev.movie.model.Actor");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.time.LocalDate");
        argTypes[3] = Class.forName("com.folksdev.movie.model.Gender");
        argTypes[4] = Class.forName("java.util.Set");
        Object[] args = new Object[5];
        args[0] = "aTdLOvYsQE";
        args[1] = "AavZwxppSr";
        args[2] = term33248;
        args[3] = enum113;
        args[4] = term33262;
        callMethod(klass, "copy", argTypes, term33187, args);
    }

};


