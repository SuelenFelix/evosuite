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
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;

public class TransactionalEntity_setCreatedAt_161681929510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5377;
     Object term5450;

    public TransactionalEntity_setCreatedAt_161681929510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5378 = new Long(-8033714905181142681L);
        Integer term5418 = new Integer(683666002);
        term5377 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5432 = newInstance(Class.forName("java.time.Instant"));
        Object term5447 = newInstance(Class.forName("java.time.Instant"));
        setField(term5377, term5377.getClass(), "id", term5378);
        setField(term5377, term5377.getClass(), "referenceId", "e85b095e-fc2b-4195-91d4-26e9999223e1");
        setField(term5377, term5377.getClass(), "version", term5418);
        setField(term5377, term5377.getClass(), "createdBy", "WBAOTqErtm");
        setLongField(term5432, term5432.getClass(), "seconds", 1472059591L);
        setIntField(term5432, term5432.getClass(), "nanos", 281000000);
        setField(term5377, term5377.getClass(), "createdAt", term5432);
        setField(term5377, term5377.getClass(), "updatedBy", "PqtVXXZMqK");
        setLongField(term5447, term5447.getClass(), "seconds", 1379465144L);
        setIntField(term5447, term5447.getClass(), "nanos", 272000000);
        setField(term5377, term5377.getClass(), "updatedAt", term5447);
        term5450 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term5450, term5450.getClass(), "seconds", 1873152234L);
        setIntField(term5450, term5450.getClass(), "nanos", 138000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term5450;
        callMethod(klass, "setCreatedAt", argTypes, term5377, args);
    }

};


