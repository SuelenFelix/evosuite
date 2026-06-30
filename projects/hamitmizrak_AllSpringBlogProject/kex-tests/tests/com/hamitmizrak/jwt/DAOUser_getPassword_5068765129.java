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

public class DAOUser_getPassword_5068765129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1362;

    public DAOUser_getPassword_5068765129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1362 = newInstance(Class.forName("com.hamitmizrak.jwt.DAOUser"));
        setField(term1362, term1362.getClass(), "username", null);
        setField(term1362, term1362.getClass(), "password", null);
        setField(term1362, term1362.getClass(), "date", null);
        setField(term1362, term1362.getClass(), "id", null);
        setField(term1362, term1362.getClass(), "createdBy", null);
        setField(term1362, term1362.getClass(), "createdDate", null);
        setField(term1362, term1362.getClass(), "updateBy", null);
        setField(term1362, term1362.getClass(), "updateDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.DAOUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term1362, args);
    }

};


