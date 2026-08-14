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

public class SessionEntity_getMembersToStack_13148122113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72338;

    public SessionEntity_getMembersToStack_13148122113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72363 = new ArrayList();
        ((ArrayList) term72363).add((Object)null);
        term72338 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity"));
        setField(term72338, term72338.getClass(), "id", "KJkWSFFnmR");
        setField(term72338, term72338.getClass(), "sessionId", "FBYRIDZvmW");
        setField(term72338, term72338.getClass(), "memberEntities", term72363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMembersToStack", argTypes, term72338, args);
    }

};


