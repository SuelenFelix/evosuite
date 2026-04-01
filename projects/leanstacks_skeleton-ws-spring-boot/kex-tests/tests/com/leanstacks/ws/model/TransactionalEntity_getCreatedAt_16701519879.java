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
     Object term5248;

    public TransactionalEntity_getCreatedAt_16701519879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5249 = new Long(-1832940336320585644L);
        Integer term5289 = new Integer(-1888585309);
        term5248 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5303 = newInstance(Class.forName("java.time.Instant"));
        Object term5318 = newInstance(Class.forName("java.time.Instant"));
        setField(term5248, term5248.getClass(), "id", term5249);
        setField(term5248, term5248.getClass(), "referenceId", "d1447b8d-ff26-47c6-a1ec-fa73766fccea");
        setField(term5248, term5248.getClass(), "version", term5289);
        setField(term5248, term5248.getClass(), "createdBy", "iIRsCSYqXH");
        setLongField(term5303, term5303.getClass(), "seconds", 1268276869L);
        setIntField(term5303, term5303.getClass(), "nanos", 683000000);
        setField(term5248, term5248.getClass(), "createdAt", term5303);
        setField(term5248, term5248.getClass(), "updatedBy", "nghfqDXyCG");
        setLongField(term5318, term5318.getClass(), "seconds", 1389375796L);
        setIntField(term5318, term5318.getClass(), "nanos", 32000000);
        setField(term5248, term5248.getClass(), "updatedAt", term5318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term5248, args);
    }

};


