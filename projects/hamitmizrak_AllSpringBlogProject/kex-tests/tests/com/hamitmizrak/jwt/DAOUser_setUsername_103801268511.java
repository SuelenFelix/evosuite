package com.hamitmizrak.jwt;

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
import static com.hamitmizrak.jwt.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DAOUser_setUsername_103801268511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1364;

    public DAOUser_setUsername_103801268511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1364 = newInstance(Class.forName("com.hamitmizrak.jwt.DAOUser"));
        setField(term1364, term1364.getClass(), "username", null);
        setField(term1364, term1364.getClass(), "password", null);
        setField(term1364, term1364.getClass(), "date", null);
        setField(term1364, term1364.getClass(), "id", null);
        setField(term1364, term1364.getClass(), "createdBy", null);
        setField(term1364, term1364.getClass(), "createdDate", null);
        setField(term1364, term1364.getClass(), "updateBy", null);
        setField(term1364, term1364.getClass(), "updateDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.DAOUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUsername", argTypes, term1364, args);
    }

};


