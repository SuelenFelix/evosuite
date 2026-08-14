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
     Object term6064;

    public TransactionalEntity_beforePersist_197880778115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6065 = new Long(7276637106827860087L);
        Integer term6105 = new Integer(339854490);
        term6064 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term6119 = newInstance(Class.forName("java.time.Instant"));
        Object term6134 = newInstance(Class.forName("java.time.Instant"));
        setField(term6064, term6064.getClass(), "id", term6065);
        setField(term6064, term6064.getClass(), "referenceId", "44f01826-a32d-47ad-9ffa-9dbcde38e41e");
        setField(term6064, term6064.getClass(), "version", term6105);
        setField(term6064, term6064.getClass(), "createdBy", "UBRmXJmfrt");
        setLongField(term6119, term6119.getClass(), "seconds", 1603673487L);
        setIntField(term6119, term6119.getClass(), "nanos", 779000000);
        setField(term6064, term6064.getClass(), "createdAt", term6119);
        setField(term6064, term6064.getClass(), "updatedBy", "WZzvmIHhzZ");
        setLongField(term6134, term6134.getClass(), "seconds", 1262701967L);
        setIntField(term6134, term6134.getClass(), "nanos", 235000000);
        setField(term6064, term6064.getClass(), "updatedAt", term6134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beforePersist", argTypes, term6064, args);
    }

};


