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
     Object term6438;

    public TransactionalEntity_hashCode_121264581518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6439 = new Long(1597484336218508869L);
        Integer term6479 = new Integer(-341962980);
        term6438 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term6493 = newInstance(Class.forName("java.time.Instant"));
        Object term6508 = newInstance(Class.forName("java.time.Instant"));
        setField(term6438, term6438.getClass(), "id", term6439);
        setField(term6438, term6438.getClass(), "referenceId", "3e12e353-d4ee-4587-b61a-6dfc78fc001b");
        setField(term6438, term6438.getClass(), "version", term6479);
        setField(term6438, term6438.getClass(), "createdBy", "sNQFlATEeQ");
        setLongField(term6493, term6493.getClass(), "seconds", 1535966665L);
        setIntField(term6493, term6493.getClass(), "nanos", 284000000);
        setField(term6438, term6438.getClass(), "createdAt", term6493);
        setField(term6438, term6438.getClass(), "updatedBy", "ZKMLioamsY");
        setLongField(term6508, term6508.getClass(), "seconds", 1842782087L);
        setIntField(term6508, term6508.getClass(), "nanos", 58000000);
        setField(term6438, term6438.getClass(), "updatedAt", term6508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6438, args);
    }

};


