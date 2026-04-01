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

public class TransactionalEntity_getUpdatedBy_201134079712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9285;

    public TransactionalEntity_getUpdatedBy_201134079712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9286 = new Long(-7268507582722666254L);
        Integer term9326 = new Integer(-1801760683);
        term9285 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term9340 = newInstance(Class.forName("java.time.Instant"));
        Object term9355 = newInstance(Class.forName("java.time.Instant"));
        setField(term9285, term9285.getClass(), "id", term9286);
        setField(term9285, term9285.getClass(), "referenceId", "72cbf022-f9f9-4138-ae31-fdb5fe1e07c6");
        setField(term9285, term9285.getClass(), "version", term9326);
        setField(term9285, term9285.getClass(), "createdBy", "jnwVnmKAFv");
        setLongField(term9340, term9340.getClass(), "seconds", 1331513661L);
        setIntField(term9340, term9340.getClass(), "nanos", 676000000);
        setField(term9285, term9285.getClass(), "createdAt", term9340);
        setField(term9285, term9285.getClass(), "updatedBy", "TXyHhqeCjR");
        setLongField(term9355, term9355.getClass(), "seconds", 1478384856L);
        setIntField(term9355, term9355.getClass(), "nanos", 375000000);
        setField(term9285, term9285.getClass(), "updatedAt", term9355);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedBy", argTypes, term9285, args);
    }

};


