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

public class TransactionalEntity_getCreatedAt_16701519879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5262;

    public TransactionalEntity_getCreatedAt_16701519879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5263 = new Long(-1832940336320585644L);
        Integer term5303 = new Integer(-1888585309);
        term5262 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5317 = newInstance(Class.forName("java.time.Instant"));
        Object term5332 = newInstance(Class.forName("java.time.Instant"));
        setField(term5262, term5262.getClass(), "id", term5263);
        setField(term5262, term5262.getClass(), "referenceId", "7e0f7107-be78-4a59-922e-e6b32c5c3779");
        setField(term5262, term5262.getClass(), "version", term5303);
        setField(term5262, term5262.getClass(), "createdBy", "iIRsCSYqXH");
        setLongField(term5317, term5317.getClass(), "seconds", 1268276869L);
        setIntField(term5317, term5317.getClass(), "nanos", 683000000);
        setField(term5262, term5262.getClass(), "createdAt", term5317);
        setField(term5262, term5262.getClass(), "updatedBy", "nghfqDXyCG");
        setLongField(term5332, term5332.getClass(), "seconds", 1389375796L);
        setIntField(term5332, term5332.getClass(), "nanos", 32000000);
        setField(term5262, term5262.getClass(), "updatedAt", term5332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term5262, args);
    }

};


