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

public class User_setEmail_109168450632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2603;

    public User_setEmail_109168450632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2603 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2603, term2603.getClass(), "id", null);
        setField(term2603, term2603.getClass(), "username", null);
        setField(term2603, term2603.getClass(), "password", null);
        setField(term2603, term2603.getClass(), "firstname", null);
        setField(term2603, term2603.getClass(), "lastname", null);
        setField(term2603, term2603.getClass(), "email", null);
        setBooleanField(term2603, term2603.getClass(), "activated", false);
        setField(term2603, term2603.getClass(), "authorities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmail", argTypes, term2603, args);
    }

};


