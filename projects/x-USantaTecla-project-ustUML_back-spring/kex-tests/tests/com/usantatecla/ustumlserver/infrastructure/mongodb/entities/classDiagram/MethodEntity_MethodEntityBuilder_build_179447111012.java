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

public class MethodEntity_MethodEntityBuilder_build_179447111012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91540;

    public MethodEntity_MethodEntityBuilder_build_179447111012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91540 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder"));
        setField(term91540, term91540.getClass(), "name", null);
        setField(term91540, term91540.getClass(), "type", null);
        setField(term91540, term91540.getClass(), "modifiers", null);
        setField(term91540, term91540.getClass(), "parametersEntities", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term91540, args);
    }

};


