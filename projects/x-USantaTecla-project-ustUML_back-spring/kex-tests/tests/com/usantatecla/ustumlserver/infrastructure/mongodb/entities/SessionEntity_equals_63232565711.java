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
import java.util.ArrayList;
import java.lang.Object;

public class SessionEntity_equals_63232565711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72732;
     Object term72761;

    public SessionEntity_equals_63232565711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72757 = new ArrayList();
        ((ArrayList) term72757).add((Object)null);
        ((ArrayList) term72757).add((Object)null);
        ((ArrayList) term72757).add((Object)null);
        ((ArrayList) term72757).add((Object)null);
        ((ArrayList) term72757).add((Object)null);
        ((ArrayList) term72757).add((Object)null);
        term72732 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity"));
        setField(term72732, term72732.getClass(), "id", "tXsfWIqIPn");
        setField(term72732, term72732.getClass(), "sessionId", "tDmfqEyHaN");
        setField(term72732, term72732.getClass(), "memberEntities", term72757);
        term72761 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term72761;
        callMethod(klass, "equals", argTypes, term72732, args);
    }

};


