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

public class DAOUser_getDate_80886988410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1363;

    public DAOUser_getDate_80886988410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1363 = newInstance(Class.forName("com.hamitmizrak.jwt.DAOUser"));
        setField(term1363, term1363.getClass(), "username", null);
        setField(term1363, term1363.getClass(), "password", null);
        setField(term1363, term1363.getClass(), "date", null);
        setField(term1363, term1363.getClass(), "id", null);
        setField(term1363, term1363.getClass(), "createdBy", null);
        setField(term1363, term1363.getClass(), "createdDate", null);
        setField(term1363, term1363.getClass(), "updateBy", null);
        setField(term1363, term1363.getClass(), "updateDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.hamitmizrak.jwt.DAOUser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term1363, args);
    }

};


