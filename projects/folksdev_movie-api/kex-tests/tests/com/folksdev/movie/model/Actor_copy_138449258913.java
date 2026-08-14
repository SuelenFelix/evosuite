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
     Object term33186;
     Object term33247;
     Object enum113;
     Object term33261;

    public Actor_copy_138449258913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33288 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term33287 = ((Class) term33288).getDeclaredField((String) "MALE");
        ((Field) term33287).setAccessible(true);
        Object enum112 = ((Field) term33287).get((Object) null);
        term33186 = newInstance(Class.forName("com.folksdev.movie.model.Actor"));
        Object term33211 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term33186, term33186.getClass(), "id", "gGVmBWDOsX");
        setField(term33186, term33186.getClass(), "name", "NktLacflHU");
        setIntField(term33211, term33211.getClass(), "year", 2028);
        setShortField(term33211, term33211.getClass(), "month", (short) 9);
        setShortField(term33211, term33211.getClass(), "day", (short) 26);
        setField(term33186, term33186.getClass(), "dateOfBirth", term33211);
        setField(term33186, term33186.getClass(), "gender", enum112);
        setField(term33186, term33186.getClass(), "movies", null);
        term33247 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term33247, term33247.getClass(), "year", 2014);
        setShortField(term33247, term33247.getClass(), "month", (short) 11);
        setShortField(term33247, term33247.getClass(), "day", (short) 1);
        Class<? extends Object> term33482 = Class.forName((String) "com.folksdev.movie.model.Gender");
        Field term33481 = ((Class) term33482).getDeclaredField((String) "FEMALE");
        ((Field) term33481).setAccessible(true);
        enum113 = ((Field) term33481).get((Object) null);
        HashMap term33262 = new HashMap();
        Set<Object> term33661 =  ((Map) term33262).keySet();
        term33261 = new HashSet((Collection<? extends Object>) term33661);
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
        args[2] = term33247;
        args[3] = enum113;
        args[4] = term33261;
        callMethod(klass, "copy", argTypes, term33186, args);
    }

};


