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

public class Role_getId_7528229672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1590;

    public Role_getId_7528229672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1628 = Class.forName((String) "com.sigma.auth.models.ERole");
        Field term1627 = ((Class) term1628).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term1627).setAccessible(true);
        Object enum1 = ((Field) term1627).get((Object) null);
        term1590 = newInstance(Class.forName("com.sigma.auth.models.Role"));
        setField(term1590, term1590.getClass(), "id", "hoicvmsovO");
        setField(term1590, term1590.getClass(), "name", enum1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1590, args);
    }

};


