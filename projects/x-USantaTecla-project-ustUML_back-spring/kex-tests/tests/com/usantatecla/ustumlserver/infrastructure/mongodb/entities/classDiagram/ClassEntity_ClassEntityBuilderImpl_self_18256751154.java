package com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClassEntity_ClassEntityBuilderImpl_self_18256751154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56444;

    public ClassEntity_ClassEntityBuilderImpl_self_18256751154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56444 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity$ClassEntityBuilderImpl"));
        setField(term56444, term56444.getClass(), "modifiers", null);
        setField(term56444, term56444.getClass(), "attributesEntities", null);
        setField(term56444, term56444.getClass(), "methodsEntities", null);
        setField(term56444, term56444.getClass(), "id", null);
        setField(term56444, term56444.getClass(), "name", null);
        setField(term56444, term56444.getClass(), "relationEntities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity$ClassEntityBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term56444, args);
    }

};


