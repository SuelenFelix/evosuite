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

public class TransactionalEntity_getUpdatedAt_175002390413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5803;

    public TransactionalEntity_getUpdatedAt_175002390413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5804 = new Long(-5786861555969446503L);
        Integer term5844 = new Integer(-1210583429);
        term5803 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5858 = newInstance(Class.forName("java.time.Instant"));
        Object term5873 = newInstance(Class.forName("java.time.Instant"));
        setField(term5803, term5803.getClass(), "id", term5804);
        setField(term5803, term5803.getClass(), "referenceId", "342c879b-ad73-4993-80df-72e296aa7f6e");
        setField(term5803, term5803.getClass(), "version", term5844);
        setField(term5803, term5803.getClass(), "createdBy", "SIODFGaQhr");
        setLongField(term5858, term5858.getClass(), "seconds", 1603415189L);
        setIntField(term5858, term5858.getClass(), "nanos", 333000000);
        setField(term5803, term5803.getClass(), "createdAt", term5858);
        setField(term5803, term5803.getClass(), "updatedBy", "qYzsiuXOgS");
        setLongField(term5873, term5873.getClass(), "seconds", 1841230035L);
        setIntField(term5873, term5873.getClass(), "nanos", 815000000);
        setField(term5803, term5803.getClass(), "updatedAt", term5873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term5803, args);
    }

};


