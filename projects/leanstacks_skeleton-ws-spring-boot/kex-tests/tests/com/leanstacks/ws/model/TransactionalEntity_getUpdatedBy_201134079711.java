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
     Object term5509;

    public TransactionalEntity_getUpdatedBy_201134079711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5510 = new Long(-9040825890007374809L);
        Integer term5550 = new Integer(1596213415);
        term5509 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term5564 = newInstance(Class.forName("java.time.Instant"));
        Object term5579 = newInstance(Class.forName("java.time.Instant"));
        setField(term5509, term5509.getClass(), "id", term5510);
        setField(term5509, term5509.getClass(), "referenceId", "1d98cd7e-a807-4bd4-9c7b-638f06aa912f");
        setField(term5509, term5509.getClass(), "version", term5550);
        setField(term5509, term5509.getClass(), "createdBy", "rYbtIDVdnd");
        setLongField(term5564, term5564.getClass(), "seconds", 1469019341L);
        setIntField(term5564, term5564.getClass(), "nanos", 287000000);
        setField(term5509, term5509.getClass(), "createdAt", term5564);
        setField(term5509, term5509.getClass(), "updatedBy", "UKAReurpHG");
        setLongField(term5579, term5579.getClass(), "seconds", 1349082575L);
        setIntField(term5579, term5579.getClass(), "nanos", 966000000);
        setField(term5509, term5509.getClass(), "updatedAt", term5579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedBy", argTypes, term5509, args);
    }

};


