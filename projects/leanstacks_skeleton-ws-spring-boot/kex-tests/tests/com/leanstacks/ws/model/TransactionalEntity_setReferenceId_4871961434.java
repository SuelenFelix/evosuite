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

public class TransactionalEntity_setReferenceId_4871961434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4571;

    public TransactionalEntity_setReferenceId_4871961434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4572 = new Long(2135754395358000892L);
        Integer term4612 = new Integer(444029505);
        term4571 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term4626 = newInstance(Class.forName("java.time.Instant"));
        Object term4641 = newInstance(Class.forName("java.time.Instant"));
        setField(term4571, term4571.getClass(), "id", term4572);
        setField(term4571, term4571.getClass(), "referenceId", "e13a899e-fe3b-4fe5-b31e-eb1a9ea7f47d");
        setField(term4571, term4571.getClass(), "version", term4612);
        setField(term4571, term4571.getClass(), "createdBy", "gUvcueTURF");
        setLongField(term4626, term4626.getClass(), "seconds", 1889599547L);
        setIntField(term4626, term4626.getClass(), "nanos", 447000000);
        setField(term4571, term4571.getClass(), "createdAt", term4626);
        setField(term4571, term4571.getClass(), "updatedBy", "EwQBhZjCIT");
        setLongField(term4641, term4641.getClass(), "seconds", 1511094598L);
        setIntField(term4641, term4641.getClass(), "nanos", 673000000);
        setField(term4571, term4571.getClass(), "updatedAt", term4641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aSkmSwTnEw";
        callMethod(klass, "setReferenceId", argTypes, term4571, args);
    }

};


