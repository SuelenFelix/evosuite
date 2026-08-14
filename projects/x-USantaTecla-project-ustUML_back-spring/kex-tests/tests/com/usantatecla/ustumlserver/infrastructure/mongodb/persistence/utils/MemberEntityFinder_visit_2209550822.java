package com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class MemberEntityFinder_visit_2209550822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342;

    public MemberEntityFinder_visit_2209550822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term454 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term453 = ((Class) term454).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term453).setAccessible(true);
        Object enum0 = ((Field) term453).get((Object) null);
        ArrayList term384 = new ArrayList();
        ArrayList term412 = new ArrayList();
        ((ArrayList) term412).add((Object)null);
        ((ArrayList) term412).add((Object)null);
        ((ArrayList) term412).add((Object)null);
        ((ArrayList) term412).add((Object)null);
        ((ArrayList) term412).add((Object)null);
        term342 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term342, term342.getClass(), "email", "aJlieCFVtF");
        setField(term342, term342.getClass(), "password", "ZiaGIbnzTs");
        setField(term342, term342.getClass(), "role", enum0);
        setField(term342, term342.getClass(), "projects", term384);
        setField(term342, term342.getClass(), "id", "tbcdzjIfER");
        setField(term342, term342.getClass(), "name", "HyxfbSQYBe");
        setField(term342, term342.getClass(), "relations", term412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term342;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


