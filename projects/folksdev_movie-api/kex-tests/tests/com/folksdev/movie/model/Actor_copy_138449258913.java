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
     Object term33185;
     Object term33246;
     Object enum113;
     Object term33260;

    public Actor_copy_138449258913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33287 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term33286 = ((Class) term33287).getDeclaredField((String) "MALE");
        ((Field) term33286).setAccessible(true);
        Object enum112 = ((Field) term33286).get((Object) null);
        term33185 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term33210 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33185, term33185.getClass(), "id", "gGVmBWDOsX");
        setField(term33185, term33185.getClass(), "name", "NktLacflHU");
        setIntField(term33210, term33210.getClass(), "year", 2028);
        setShortField(term33210, term33210.getClass(), "month", (short) 9);
        setShortField(term33210, term33210.getClass(), "day", (short) 26);
        setField(term33185, term33185.getClass(), "dateOfBirth", term33210);
        setField(term33185, term33185.getClass(), "gender", enum112);
        setField(term33185, term33185.getClass(), "movies", null);
        term33246 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term33246, term33246.getClass(), "year", 2014);
        setShortField(term33246, term33246.getClass(), "month", (short) 11);
        setShortField(term33246, term33246.getClass(), "day", (short) 1);
        Class<? extends Object> term33481 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term33480 = ((Class) term33481).getDeclaredField((String) "FEMALE");
        ((Field) term33480).setAccessible(true);
        enum113 = ((Field) term33480).get((Object) null);
        HashMap term33261 = new HashMap();
        Set<Object> term33660 =  ((Map) term33261).keySet();
        term33260 = new HashSet((Collection<? extends Object>) term33660);
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
        args[2] = term33246;
        args[3] = enum113;
        args[4] = term33260;
        callMethod(klass, "copy", argTypes, term33185, args);
    }

};


