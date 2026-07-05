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
import java.lang.Long;

public class Contact_setPhone_11627420648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11393;

    public Contact_setPhone_11627420648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term11394 = new Long(-421166328269063791L);
        term11393 = newInstance(Class.forName("com.alkemy.ong.domain.Contact"));
        setField(term11393, term11393.getClass(), "id", term11394);
        setField(term11393, term11393.getClass(), "name", "SxeKEdHXSl");
        setField(term11393, term11393.getClass(), "phone", "BCAlJpNjIX");
        setField(term11393, term11393.getClass(), "email", "PKClfBAwUr");
        setField(term11393, term11393.getClass(), "message", "JqbKrmVEMy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Contact");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VygCEWaefB";
        callMethod(klass, "setPhone", argTypes, term11393, args);
    }

};


