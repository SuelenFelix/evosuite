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

public class Enum_accept_58528833123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79671;

    public Enum_accept_58528833123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79671 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term79671, term79671.getClass(), "objects", null);
        setField(term79671, term79671.getClass(), "modifiers", null);
        setField(term79671, term79671.getClass(), "attributes", null);
        setField(term79671, term79671.getClass(), "methods", null);
        setField(term79671, term79671.getClass(), "id", null);
        setField(term79671, term79671.getClass(), "name", null);
        setField(term79671, term79671.getClass(), "relations", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.Generator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accept", argTypes, term79671, args);
    }

};


