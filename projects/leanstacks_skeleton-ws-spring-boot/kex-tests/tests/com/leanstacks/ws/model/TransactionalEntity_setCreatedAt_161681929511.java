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

public class TransactionalEntity_setCreatedAt_161681929511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9153;
     Object term9226;

    public TransactionalEntity_setCreatedAt_161681929511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9154 = new Long(-5386201758403679145L);
        Integer term9194 = new Integer(1532716628);
        term9153 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term9208 = newInstance(Class.forName("java.time.Instant"));
        Object term9223 = newInstance(Class.forName("java.time.Instant"));
        setField(term9153, term9153.getClass(), "id", term9154);
        setField(term9153, term9153.getClass(), "referenceId", "5ec9468a-970f-45f6-8184-038d0676e3aa");
        setField(term9153, term9153.getClass(), "version", term9194);
        setField(term9153, term9153.getClass(), "createdBy", "PJcSNDruWd");
        setLongField(term9208, term9208.getClass(), "seconds", 1826251741L);
        setIntField(term9208, term9208.getClass(), "nanos", 593000000);
        setField(term9153, term9153.getClass(), "createdAt", term9208);
        setField(term9153, term9153.getClass(), "updatedBy", "VVNNlAePXF");
        setLongField(term9223, term9223.getClass(), "seconds", 1422779118L);
        setIntField(term9223, term9223.getClass(), "nanos", 265000000);
        setField(term9153, term9153.getClass(), "updatedAt", term9223);
        term9226 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term9226, term9226.getClass(), "seconds", 1553552205L);
        setIntField(term9226, term9226.getClass(), "nanos", 448000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term9226;
        callMethod(klass, "setCreatedAt", argTypes, term9153, args);
    }

};


