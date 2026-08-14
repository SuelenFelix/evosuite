package com.sigma.auth.models;

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
import static com.sigma.auth.models.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Role_setName_20678544815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2235;
     Object enum5;

    public Role_setName_20678544815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2286 = Class.forName((String) "com.sigma.auth.models.ERole");
        Field term2285 = ((Class) term2286).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term2285).setAccessible(true);
        Object enum4 = ((Field) term2285).get((Object) null);
        term2235 = newInstance(Class.forName("com.sigma.auth.models.Role"));
        setField(term2235, term2235.getClass(), "id", "kBdSllIBVz");
        setField(term2235, term2235.getClass(), "name", enum4);
        Class<? extends Object> term2458 = Class.forName((String) "com.sigma.auth.models.ERole");
        Field term2457 = ((Class) term2458).getDeclaredField((String) "ROLE_USER");
        ((Field) term2457).setAccessible(true);
        enum5 = ((Field) term2457).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.Role");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.sigma.auth.models.ERole");
        Object[] args = new Object[1];
        args[0] = enum5;
        callMethod(klass, "setName", argTypes, term2235, args);
    }

};


