package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class User_getRole_68326026624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22734;

    public User_getRole_68326026624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22734 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        setField(term22734, term22734.getClass(), "id", null);
        setField(term22734, term22734.getClass(), "firstName", null);
        setField(term22734, term22734.getClass(), "lastName", null);
        setField(term22734, term22734.getClass(), "email", null);
        setField(term22734, term22734.getClass(), "password", null);
        setField(term22734, term22734.getClass(), "imageUrl", null);
        setField(term22734, term22734.getClass(), "role", null);
        setField(term22734, term22734.getClass(), "token", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.User");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term22734, args);
    }

};


