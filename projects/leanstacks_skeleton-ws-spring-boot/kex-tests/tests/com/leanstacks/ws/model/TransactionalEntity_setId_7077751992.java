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
     Object term4297;
     Object term4370;

    public TransactionalEntity_setId_7077751992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4298 = new Long(-8463029266761149071L);
        Integer term4338 = new Integer(-344842608);
        term4297 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4352 = newInstance(Class.forName("java.time.Instant"));
        Object term4367 = newInstance(Class.forName("java.time.Instant"));
        setField(term4297, term4297.getClass(), "id", term4298);
        setField(term4297, term4297.getClass(), "referenceId", "c7a0b912-3643-40ce-9b43-d2f5c7dbb78d");
        setField(term4297, term4297.getClass(), "version", term4338);
        setField(term4297, term4297.getClass(), "createdBy", "NzBMMhkhpT");
        setLongField(term4352, term4352.getClass(), "seconds", 1407926618L);
        setIntField(term4352, term4352.getClass(), "nanos", 924000000);
        setField(term4297, term4297.getClass(), "createdAt", term4352);
        setField(term4297, term4297.getClass(), "updatedBy", "qCpEbQDHdF");
        setLongField(term4367, term4367.getClass(), "seconds", 1536062261L);
        setIntField(term4367, term4367.getClass(), "nanos", 151000000);
        setField(term4297, term4297.getClass(), "updatedAt", term4367);
        term4370 = new Long(3133860696238261492L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term4370;
        callMethod(klass, "setId", argTypes, term4297, args);
    }

};


