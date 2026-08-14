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

public class TransactionalEntity_getId_113781695720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6581;

    public TransactionalEntity_getId_113781695720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6581 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        setField(term6581, term6581.getClass(), "id", null);
        setField(term6581, term6581.getClass(), "referenceId", null);
        setField(term6581, term6581.getClass(), "version", null);
        setField(term6581, term6581.getClass(), "createdBy", null);
        setField(term6581, term6581.getClass(), "createdAt", null);
        setField(term6581, term6581.getClass(), "updatedBy", null);
        setField(term6581, term6581.getClass(), "updatedAt", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6581, args);
    }

};


