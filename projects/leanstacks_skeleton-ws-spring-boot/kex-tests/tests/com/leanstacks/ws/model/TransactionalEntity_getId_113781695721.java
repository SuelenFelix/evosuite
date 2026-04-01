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

public class TransactionalEntity_getId_113781695721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10343;

    public TransactionalEntity_getId_113781695721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10343 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        setField(term10343, term10343.getClass(), "id", null);
        setField(term10343, term10343.getClass(), "referenceId", null);
        setField(term10343, term10343.getClass(), "version", null);
        setField(term10343, term10343.getClass(), "createdBy", null);
        setField(term10343, term10343.getClass(), "createdAt", null);
        setField(term10343, term10343.getClass(), "updatedBy", null);
        setField(term10343, term10343.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term10343, args);
    }

};


