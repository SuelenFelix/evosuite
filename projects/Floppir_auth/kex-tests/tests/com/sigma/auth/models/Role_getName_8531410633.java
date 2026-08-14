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

public class Role_getName_8531410633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1799;

    public Role_getName_8531410633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1837 = Class.forName((String) "com.sigma.auth.models.ERole");
        Field term1836 = ((Class) term1837).getDeclaredField((String) "ROLE_ADMIN");
        ((Field) term1836).setAccessible(true);
        Object enum2 = ((Field) term1836).get((Object) null);
        term1799 = newInstance(Class.forName("com.sigma.auth.models.Role"));
        setField(term1799, term1799.getClass(), "id", "eqJfYWRaEL");
        setField(term1799, term1799.getClass(), "name", enum2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sigma.auth.models.Role");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1799, args);
    }

};


