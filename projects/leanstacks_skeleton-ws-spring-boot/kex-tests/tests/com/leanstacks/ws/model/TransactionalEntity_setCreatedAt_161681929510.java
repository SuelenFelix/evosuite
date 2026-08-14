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
     Object term5391;
     Object term5464;

    public TransactionalEntity_setCreatedAt_161681929510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5392 = new Long(-8033714905181142681L);
        Integer term5432 = new Integer(683666002);
        term5391 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5446 = newInstance(Class.forName("java.time.Instant"));
        Object term5461 = newInstance(Class.forName("java.time.Instant"));
        setField(term5391, term5391.getClass(), "id", term5392);
        setField(term5391, term5391.getClass(), "referenceId", "933995c0-866c-42a8-b495-0c3306375610");
        setField(term5391, term5391.getClass(), "version", term5432);
        setField(term5391, term5391.getClass(), "createdBy", "WBAOTqErtm");
        setLongField(term5446, term5446.getClass(), "seconds", 1472059591L);
        setIntField(term5446, term5446.getClass(), "nanos", 281000000);
        setField(term5391, term5391.getClass(), "createdAt", term5446);
        setField(term5391, term5391.getClass(), "updatedBy", "PqtVXXZMqK");
        setLongField(term5461, term5461.getClass(), "seconds", 1379465144L);
        setIntField(term5461, term5461.getClass(), "nanos", 272000000);
        setField(term5391, term5391.getClass(), "updatedAt", term5461);
        term5464 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term5464, term5464.getClass(), "seconds", 1873152234L);
        setIntField(term5464, term5464.getClass(), "nanos", 138000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term5464;
        callMethod(klass, "setCreatedAt", argTypes, term5391, args);
    }

};


