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

public class Enum_setObjects_12876790930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79677;

    public Enum_setObjects_12876790930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79677 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term79677, term79677.getClass(), "objects", null);
        setField(term79677, term79677.getClass(), "modifiers", null);
        setField(term79677, term79677.getClass(), "attributes", null);
        setField(term79677, term79677.getClass(), "methods", null);
        setField(term79677, term79677.getClass(), "id", null);
        setField(term79677, term79677.getClass(), "name", null);
        setField(term79677, term79677.getClass(), "relations", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setObjects", argTypes, term79677, args);
    }

};


