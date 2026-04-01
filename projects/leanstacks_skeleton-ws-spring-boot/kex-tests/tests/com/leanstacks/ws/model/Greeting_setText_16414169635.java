package com.leanstacks.ws.model;

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
import static com.leanstacks.ws.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Greeting_setText_16414169635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1230;

    public Greeting_setText_16414169635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1230 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        setField(term1230, term1230.getClass(), "text", null);
        setField(term1230, term1230.getClass(), "id", null);
        setField(term1230, term1230.getClass(), "referenceId", null);
        setField(term1230, term1230.getClass(), "version", null);
        setField(term1230, term1230.getClass(), "createdBy", null);
        setField(term1230, term1230.getClass(), "createdAt", null);
        setField(term1230, term1230.getClass(), "updatedBy", null);
        setField(term1230, term1230.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Greeting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term1230, args);
    }

};


