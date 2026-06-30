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

public class User_hashCode_207612820238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2617;

    public User_hashCode_207612820238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2617 = newInstance(Class.forName("org.zerhusen.security.model.User"));
        setField(term2617, term2617.getClass(), "id", null);
        setField(term2617, term2617.getClass(), "username", null);
        setField(term2617, term2617.getClass(), "password", null);
        setField(term2617, term2617.getClass(), "firstname", null);
        setField(term2617, term2617.getClass(), "lastname", null);
        setField(term2617, term2617.getClass(), "email", null);
        setBooleanField(term2617, term2617.getClass(), "activated", false);
        setField(term2617, term2617.getClass(), "authorities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.zerhusen.security.model.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2617, args);
    }

};


