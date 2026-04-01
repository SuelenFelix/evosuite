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
     Object term5789;

    public TransactionalEntity_getUpdatedAt_175002390413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5790 = new Long(-5786861555969446503L);
        Integer term5830 = new Integer(-1210583429);
        term5789 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5844 = newInstance(Class.forName("java.time.Instant"));
        Object term5859 = newInstance(Class.forName("java.time.Instant"));
        setField(term5789, term5789.getClass(), "id", term5790);
        setField(term5789, term5789.getClass(), "referenceId", "e1e7d7d6-64ef-4163-bf32-6d102044dea1");
        setField(term5789, term5789.getClass(), "version", term5830);
        setField(term5789, term5789.getClass(), "createdBy", "SIODFGaQhr");
        setLongField(term5844, term5844.getClass(), "seconds", 1603415189L);
        setIntField(term5844, term5844.getClass(), "nanos", 333000000);
        setField(term5789, term5789.getClass(), "createdAt", term5844);
        setField(term5789, term5789.getClass(), "updatedBy", "qYzsiuXOgS");
        setLongField(term5859, term5859.getClass(), "seconds", 1841230035L);
        setIntField(term5859, term5859.getClass(), "nanos", 815000000);
        setField(term5789, term5789.getClass(), "updatedAt", term5859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term5789, args);
    }

};


