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

public class TransactionalEntity_beforePersist_197880778115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6050;

    public TransactionalEntity_beforePersist_197880778115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6051 = new Long(7276637106827860087L);
        Integer term6091 = new Integer(339854490);
        term6050 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term6105 = newInstance(Class.forName("java.time.Instant"));
        Object term6120 = newInstance(Class.forName("java.time.Instant"));
        setField(term6050, term6050.getClass(), "id", term6051);
        setField(term6050, term6050.getClass(), "referenceId", "c2e4d93e-c7ac-4a0c-be20-1d03e522cd3d");
        setField(term6050, term6050.getClass(), "version", term6091);
        setField(term6050, term6050.getClass(), "createdBy", "UBRmXJmfrt");
        setLongField(term6105, term6105.getClass(), "seconds", 1603673487L);
        setIntField(term6105, term6105.getClass(), "nanos", 779000000);
        setField(term6050, term6050.getClass(), "createdAt", term6105);
        setField(term6050, term6050.getClass(), "updatedBy", "WZzvmIHhzZ");
        setLongField(term6120, term6120.getClass(), "seconds", 1262701967L);
        setIntField(term6120, term6120.getClass(), "nanos", 235000000);
        setField(term6050, term6050.getClass(), "updatedAt", term6120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforePersist", argTypes, term6050, args);
    }

};


