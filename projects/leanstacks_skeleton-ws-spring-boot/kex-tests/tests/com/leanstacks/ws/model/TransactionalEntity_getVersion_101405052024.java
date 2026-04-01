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

public class TransactionalEntity_getVersion_101405052024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6571;

    public TransactionalEntity_getVersion_101405052024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6571 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        setField(term6571, term6571.getClass(), "id", null);
        setField(term6571, term6571.getClass(), "referenceId", null);
        setField(term6571, term6571.getClass(), "version", null);
        setField(term6571, term6571.getClass(), "createdBy", null);
        setField(term6571, term6571.getClass(), "createdAt", null);
        setField(term6571, term6571.getClass(), "updatedBy", null);
        setField(term6571, term6571.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term6571, args);
    }

};


