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

public class SessionEntity_SessionEntityBuilder_sessionId_15799783232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71989;

    public SessionEntity_SessionEntityBuilder_sessionId_15799783232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72014 = new ArrayList();
        ((ArrayList) term72014).add((Object)null);
        ((ArrayList) term72014).add((Object)null);
        ((ArrayList) term72014).add((Object)null);
        term71989 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity$SessionEntityBuilder"));
        setField(term71989, term71989.getClass(), "id", "sKnuhmcjCC");
        setField(term71989, term71989.getClass(), "sessionId", "oCBbVNwMnb");
        setField(term71989, term71989.getClass(), "memberEntities", term72014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity$SessionEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "miJxAzOVJy";
        callMethod(klass, "sessionId", argTypes, term71989, args);
    }

};


