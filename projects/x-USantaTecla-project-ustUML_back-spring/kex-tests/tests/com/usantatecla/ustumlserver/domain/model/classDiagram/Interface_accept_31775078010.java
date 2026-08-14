package com.usantatecla.ustumlserver.domain.model.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Interface_accept_31775078010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62179;

    public Interface_accept_31775078010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62179 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Interface"));
        setField(term62179, term62179.getClass(), "modifiers", null);
        setField(term62179, term62179.getClass(), "attributes", null);
        setField(term62179, term62179.getClass(), "methods", null);
        setField(term62179, term62179.getClass(), "id", null);
        setField(term62179, term62179.getClass(), "name", null);
        setField(term62179, term62179.getClass(), "relations", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Interface");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.MemberVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accept", argTypes, term62179, args);
    }

};


