package org.zerhusen.security.model;

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
import static org.zerhusen.security.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_setUsername_39646282024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2587;

    public User_setUsername_39646282024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2587 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2587, term2587.getClass(), "id", null);
        setField(term2587, term2587.getClass(), "username", null);
        setField(term2587, term2587.getClass(), "password", null);
        setField(term2587, term2587.getClass(), "firstname", null);
        setField(term2587, term2587.getClass(), "lastname", null);
        setField(term2587, term2587.getClass(), "email", null);
        setBooleanField(term2587, term2587.getClass(), "activated", false);
        setField(term2587, term2587.getClass(), "authorities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsername", argTypes, term2587, args);
    }

};


