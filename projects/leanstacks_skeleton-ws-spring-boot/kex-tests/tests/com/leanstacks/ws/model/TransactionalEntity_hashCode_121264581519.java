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

public class TransactionalEntity_hashCode_121264581519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10214;

    public TransactionalEntity_hashCode_121264581519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10215 = new Long(8313800941204938919L);
        Integer term10255 = new Integer(1045657203);
        term10214 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term10269 = newInstance(Class.forName("java.time.Instant"));
        Object term10284 = newInstance(Class.forName("java.time.Instant"));
        setField(term10214, term10214.getClass(), "id", term10215);
        setField(term10214, term10214.getClass(), "referenceId", "be6a57cf-e968-4ad9-a761-eeeead78d7fd");
        setField(term10214, term10214.getClass(), "version", term10255);
        setField(term10214, term10214.getClass(), "createdBy", "JkgoRtImdE");
        setLongField(term10269, term10269.getClass(), "seconds", 1367935077L);
        setIntField(term10269, term10269.getClass(), "nanos", 317000000);
        setField(term10214, term10214.getClass(), "createdAt", term10269);
        setField(term10214, term10214.getClass(), "updatedBy", "qFGKIJjlmV");
        setLongField(term10284, term10284.getClass(), "seconds", 1875231796L);
        setIntField(term10284, term10284.getClass(), "nanos", 50000000);
        setField(term10214, term10214.getClass(), "updatedAt", term10284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10214, args);
    }

};


