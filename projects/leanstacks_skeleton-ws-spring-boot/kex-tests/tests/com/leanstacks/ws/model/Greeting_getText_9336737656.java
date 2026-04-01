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

public class Greeting_getText_9336737656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4946;

    public Greeting_getText_9336737656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4946 = newInstance(Class.forName("com.leanstacks.ws.model.Greeting"));
        setField(term4946, term4946.getClass(), "text", null);
        setField(term4946, term4946.getClass(), "id", null);
        setField(term4946, term4946.getClass(), "referenceId", null);
        setField(term4946, term4946.getClass(), "version", null);
        setField(term4946, term4946.getClass(), "createdBy", null);
        setField(term4946, term4946.getClass(), "createdAt", null);
        setField(term4946, term4946.getClass(), "updatedBy", null);
        setField(term4946, term4946.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.Greeting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term4946, args);
    }

};


