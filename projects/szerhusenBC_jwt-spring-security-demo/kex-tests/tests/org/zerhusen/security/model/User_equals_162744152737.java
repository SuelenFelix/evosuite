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

public class User_equals_162744152737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2615;

    public User_equals_162744152737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2615 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2615, term2615.getClass(), "id", null);
        setField(term2615, term2615.getClass(), "username", null);
        setField(term2615, term2615.getClass(), "password", null);
        setField(term2615, term2615.getClass(), "firstname", null);
        setField(term2615, term2615.getClass(), "lastname", null);
        setField(term2615, term2615.getClass(), "email", null);
        setBooleanField(term2615, term2615.getClass(), "activated", false);
        setField(term2615, term2615.getClass(), "authorities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term2615, args);
    }

};


