package com.usantatecla.ustumlserver.infrastructure.mongodb.entities;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SessionEntity_canEqual_143648828629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72995;

    public SessionEntity_canEqual_143648828629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72995 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity"));
        setField(term72995, term72995.getClass(), "id", null);
        setField(term72995, term72995.getClass(), "sessionId", null);
        setField(term72995, term72995.getClass(), "memberEntities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term72995, args);
    }

};


