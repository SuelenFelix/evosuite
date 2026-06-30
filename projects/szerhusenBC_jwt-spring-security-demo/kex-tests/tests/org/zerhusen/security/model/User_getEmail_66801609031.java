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

public class User_getEmail_66801609031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2601;

    public User_getEmail_66801609031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2601 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2601, term2601.getClass(), "id", null);
        setField(term2601, term2601.getClass(), "username", null);
        setField(term2601, term2601.getClass(), "password", null);
        setField(term2601, term2601.getClass(), "firstname", null);
        setField(term2601, term2601.getClass(), "lastname", null);
        setField(term2601, term2601.getClass(), "email", null);
        setBooleanField(term2601, term2601.getClass(), "activated", false);
        setField(term2601, term2601.getClass(), "authorities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term2601, args);
    }

};


