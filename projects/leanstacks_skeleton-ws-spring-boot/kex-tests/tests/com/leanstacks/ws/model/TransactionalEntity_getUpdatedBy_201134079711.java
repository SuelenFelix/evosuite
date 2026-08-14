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

public class TransactionalEntity_getUpdatedBy_201134079711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5523;

    public TransactionalEntity_getUpdatedBy_201134079711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5524 = new Long(-9040825890007374809L);
        Integer term5564 = new Integer(1596213415);
        term5523 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5578 = newInstance(Class.forName("java.time.Instant"));
        Object term5593 = newInstance(Class.forName("java.time.Instant"));
        setField(term5523, term5523.getClass(), "id", term5524);
        setField(term5523, term5523.getClass(), "referenceId", "dbe97690-7955-4ab7-9492-4d8d1cf0ae49");
        setField(term5523, term5523.getClass(), "version", term5564);
        setField(term5523, term5523.getClass(), "createdBy", "rYbtIDVdnd");
        setLongField(term5578, term5578.getClass(), "seconds", 1469019341L);
        setIntField(term5578, term5578.getClass(), "nanos", 287000000);
        setField(term5523, term5523.getClass(), "createdAt", term5578);
        setField(term5523, term5523.getClass(), "updatedBy", "UKAReurpHG");
        setLongField(term5593, term5593.getClass(), "seconds", 1349082575L);
        setIntField(term5593, term5593.getClass(), "nanos", 966000000);
        setField(term5523, term5523.getClass(), "updatedAt", term5593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedBy", argTypes, term5523, args);
    }

};


