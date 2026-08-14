package com.usantatecla.ustumlserver.domain.model;

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
import static com.usantatecla.ustumlserver.domain.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Project_accept_7017493582 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85441;

    public Project_accept_7017493582() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term85442 = new ArrayList();
        ((ArrayList) term85442).add((Object)null);
        ((ArrayList) term85442).add((Object)null);
        ArrayList term85470 = new ArrayList();
        ((ArrayList) term85470).add((Object)null);
        ((ArrayList) term85470).add((Object)null);
        term85441 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Project"));
        setField(term85441, term85441.getClass(), "members", term85442);
        setField(term85441, term85441.getClass(), "id", "AQbnQoJwOO");
        setField(term85441, term85441.getClass(), "name", "NnicBPzNzw");
        setField(term85441, term85441.getClass(), "relations", term85470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.Project");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.MemberVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accept", argTypes, term85441, args);
    }

};


