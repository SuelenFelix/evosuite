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

public class MemberEntityDeleter_visit_3899234392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6097;

    public MemberEntityDeleter_visit_3899234392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6192 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.Role");
        Field term6191 = ((Class) term6192).getDeclaredField((String) "AUTHENTICATED");
        ((Field) term6191).setAccessible(true);
        Object enum13 = ((Field) term6191).get((Object) null);
        ArrayList term6139 = new ArrayList();
        ArrayList term6167 = new ArrayList();
        ((ArrayList) term6167).add((Object)null);
        ((ArrayList) term6167).add((Object)null);
        ((ArrayList) term6167).add((Object)null);
        ((ArrayList) term6167).add((Object)null);
        ((ArrayList) term6167).add((Object)null);
        ((ArrayList) term6167).add((Object)null);
        ((ArrayList) term6167).add((Object)null);
        ((ArrayList) term6167).add((Object)null);
        ((ArrayList) term6167).add((Object)null);
        term6097 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Account"));
        setField(term6097, term6097.getClass(), "email", "HzqpegHiRq");
        setField(term6097, term6097.getClass(), "password", "jwsfVjMoJT");
        setField(term6097, term6097.getClass(), "role", enum13);
        setField(term6097, term6097.getClass(), "projects", term6139);
        setField(term6097, term6097.getClass(), "id", "ZfdXfCCFDf");
        setField(term6097, term6097.getClass(), "name", "MwwjNtdOFT");
        setField(term6097, term6097.getClass(), "relations", term6167);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityDeleter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Account");
        Object[] args = new Object[1];
        args[0] = term6097;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


