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

public class SessionEntity_getMemberEntities_1971400907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72485;

    public SessionEntity_getMemberEntities_1971400907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term72510 = new ArrayList();
        ((ArrayList) term72510).add((Object)null);
        ((ArrayList) term72510).add((Object)null);
        ((ArrayList) term72510).add((Object)null);
        ((ArrayList) term72510).add((Object)null);
        ((ArrayList) term72510).add((Object)null);
        ((ArrayList) term72510).add((Object)null);
        ((ArrayList) term72510).add((Object)null);
        ((ArrayList) term72510).add((Object)null);
        ((ArrayList) term72510).add((Object)null);
        term72485 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity"));
        setField(term72485, term72485.getClass(), "id", "ZjqXyUmAJY");
        setField(term72485, term72485.getClass(), "sessionId", "pjEERkBbYo");
        setField(term72485, term72485.getClass(), "memberEntities", term72510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.SessionEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMemberEntities", argTypes, term72485, args);
    }

};


