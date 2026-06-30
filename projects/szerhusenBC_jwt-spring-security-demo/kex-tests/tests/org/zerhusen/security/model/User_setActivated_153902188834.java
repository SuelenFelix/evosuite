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
import java.lang.Boolean;

public class User_setActivated_153902188834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2607;
     Object term2609;

    public User_setActivated_153902188834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2607 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2607, term2607.getClass(), "id", null);
        setField(term2607, term2607.getClass(), "username", null);
        setField(term2607, term2607.getClass(), "password", null);
        setField(term2607, term2607.getClass(), "firstname", null);
        setField(term2607, term2607.getClass(), "lastname", null);
        setField(term2607, term2607.getClass(), "email", null);
        setBooleanField(term2607, term2607.getClass(), "activated", false);
        setField(term2607, term2607.getClass(), "authorities", null);
        term2609 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term2609;
        callMethod(klass, "setActivated", argTypes, term2607, args);
    }

};


