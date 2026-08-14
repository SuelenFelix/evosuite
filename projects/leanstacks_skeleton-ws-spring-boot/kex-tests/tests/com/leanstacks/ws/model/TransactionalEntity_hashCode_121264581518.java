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

public class TransactionalEntity_hashCode_121264581518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6452;

    public TransactionalEntity_hashCode_121264581518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6453 = new Long(1597484336218508869L);
        Integer term6493 = new Integer(-341962980);
        term6452 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term6507 = newInstance(Class.forName("java.time.Instant"));
        Object term6522 = newInstance(Class.forName("java.time.Instant"));
        setField(term6452, term6452.getClass(), "id", term6453);
        setField(term6452, term6452.getClass(), "referenceId", "fe310768-0e07-4735-82b1-5b0f5c5edf51");
        setField(term6452, term6452.getClass(), "version", term6493);
        setField(term6452, term6452.getClass(), "createdBy", "sNQFlATEeQ");
        setLongField(term6507, term6507.getClass(), "seconds", 1535966665L);
        setIntField(term6507, term6507.getClass(), "nanos", 284000000);
        setField(term6452, term6452.getClass(), "createdAt", term6507);
        setField(term6452, term6452.getClass(), "updatedBy", "ZKMLioamsY");
        setLongField(term6522, term6522.getClass(), "seconds", 1842782087L);
        setIntField(term6522, term6522.getClass(), "nanos", 58000000);
        setField(term6452, term6452.getClass(), "updatedAt", term6522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6452, args);
    }

};


