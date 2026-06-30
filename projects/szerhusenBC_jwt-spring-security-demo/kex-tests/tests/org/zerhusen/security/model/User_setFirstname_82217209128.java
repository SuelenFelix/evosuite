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

public class User_setFirstname_82217209128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2595;

    public User_setFirstname_82217209128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2595 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2595, term2595.getClass(), "id", null);
        setField(term2595, term2595.getClass(), "username", null);
        setField(term2595, term2595.getClass(), "password", null);
        setField(term2595, term2595.getClass(), "firstname", null);
        setField(term2595, term2595.getClass(), "lastname", null);
        setField(term2595, term2595.getClass(), "email", null);
        setBooleanField(term2595, term2595.getClass(), "activated", false);
        setField(term2595, term2595.getClass(), "authorities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstname", argTypes, term2595, args);
    }

};


