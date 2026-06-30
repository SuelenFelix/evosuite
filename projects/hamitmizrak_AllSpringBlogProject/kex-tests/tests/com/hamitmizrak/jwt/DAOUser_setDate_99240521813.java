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

public class DAOUser_setDate_99240521813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1366;

    public DAOUser_setDate_99240521813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1366 = newInstance(Class.forName("com.hamitmizrak.jwt.DAOUser"));
        setField(term1366, term1366.getClass(), "username", null);
        setField(term1366, term1366.getClass(), "password", null);
        setField(term1366, term1366.getClass(), "date", null);
        setField(term1366, term1366.getClass(), "id", null);
        setField(term1366, term1366.getClass(), "createdBy", null);
        setField(term1366, term1366.getClass(), "createdDate", null);
        setField(term1366, term1366.getClass(), "updateBy", null);
        setField(term1366, term1366.getClass(), "updateDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.DAOUser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDate", argTypes, term1366, args);
    }

};


