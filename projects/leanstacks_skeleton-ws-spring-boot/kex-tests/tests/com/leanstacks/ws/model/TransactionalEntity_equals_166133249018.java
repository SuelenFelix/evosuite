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

public class TransactionalEntity_equals_166133249018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10084;
     Object term10157;

    public TransactionalEntity_equals_166133249018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10085 = new Long(3620247240684476031L);
        Integer term10125 = new Integer(906181092);
        term10084 = newInstance(Class.forName("com.leanstacks.ws.model.TransactionalEntity"));
        Object term10139 = newInstance(Class.forName("java.time.Instant"));
        Object term10154 = newInstance(Class.forName("java.time.Instant"));
        setField(term10084, term10084.getClass(), "id", term10085);
        setField(term10084, term10084.getClass(), "referenceId", "dc36fe9d-a932-4b41-93c0-be560f36ddeb");
        setField(term10084, term10084.getClass(), "version", term10125);
        setField(term10084, term10084.getClass(), "createdBy", "xClUIcPECX");
        setLongField(term10139, term10139.getClass(), "seconds", 1842237600L);
        setIntField(term10139, term10139.getClass(), "nanos", 959000000);
        setField(term10084, term10084.getClass(), "createdAt", term10139);
        setField(term10084, term10084.getClass(), "updatedBy", "avhRaGZaBF");
        setLongField(term10154, term10154.getClass(), "seconds", 1770196770L);
        setIntField(term10154, term10154.getClass(), "nanos", 908000000);
        setField(term10084, term10084.getClass(), "updatedAt", term10154);
        term10157 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leanstacks.ws.model.TransactionalEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10157;
        callMethod(klass, "equals", argTypes, term10084, args);
    }

};


