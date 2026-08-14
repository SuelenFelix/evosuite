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

public class TransactionalEntity_setId_7077751992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4311;
     Object term4384;

    public TransactionalEntity_setId_7077751992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4312 = new Long(-8463029266761149071L);
        Integer term4352 = new Integer(-344842608);
        term4311 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4366 = newInstance(Class.forName("java.time.Instant"));
        Object term4381 = newInstance(Class.forName("java.time.Instant"));
        setField(term4311, term4311.getClass(), "id", term4312);
        setField(term4311, term4311.getClass(), "referenceId", "7ebc7f80-c204-47ab-a494-6dbcd5991bd3");
        setField(term4311, term4311.getClass(), "version", term4352);
        setField(term4311, term4311.getClass(), "createdBy", "NzBMMhkhpT");
        setLongField(term4366, term4366.getClass(), "seconds", 1407926618L);
        setIntField(term4366, term4366.getClass(), "nanos", 924000000);
        setField(term4311, term4311.getClass(), "createdAt", term4366);
        setField(term4311, term4311.getClass(), "updatedBy", "qCpEbQDHdF");
        setLongField(term4381, term4381.getClass(), "seconds", 1536062261L);
        setIntField(term4381, term4381.getClass(), "nanos", 151000000);
        setField(term4311, term4311.getClass(), "updatedAt", term4381);
        term4384 = new Long(3133860696238261492L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4384;
        callMethod(klass, "setId", argTypes, term4311, args);
    }

};


