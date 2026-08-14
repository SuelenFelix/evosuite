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
import java.util.ArrayList;
import java.lang.Object;

public class MemberEntityDeleter_visit_17968766483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6487;

    public MemberEntityDeleter_visit_17968766483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6488 = new ArrayList();
        ((ArrayList) term6488).add((Object)null);
        ((ArrayList) term6488).add((Object)null);
        ((ArrayList) term6488).add((Object)null);
        ((ArrayList) term6488).add((Object)null);
        ((ArrayList) term6488).add((Object)null);
        ((ArrayList) term6488).add((Object)null);
        ((ArrayList) term6488).add((Object)null);
        ArrayList term6516 = new ArrayList();
        ((ArrayList) term6516).add((Object)null);
        ((ArrayList) term6516).add((Object)null);
        ((ArrayList) term6516).add((Object)null);
        ((ArrayList) term6516).add((Object)null);
        ((ArrayList) term6516).add((Object)null);
        ((ArrayList) term6516).add((Object)null);
        term6487 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term6487, term6487.getClass(), "members", term6488);
        setField(term6487, term6487.getClass(), "id", "VYkqXKVlAJ");
        setField(term6487, term6487.getClass(), "name", "XkIoWJRNwN");
        setField(term6487, term6487.getClass(), "relations", term6516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityDeleter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Object[] args = new Object[1];
        args[0] = term6487;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


