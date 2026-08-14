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
import java.util.ArrayList;
import java.lang.Object;

public class MethodEntity_getModifiers_3526322405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41490;

    public MethodEntity_getModifiers_3526322405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term41515 = new ArrayList();
        Object term41521 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41521, term41521.getClass(), "name", "");
        setField(term41521, term41521.getClass(), "type", "");
        Object term41524 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41524, term41524.getClass(), "name", "");
        setField(term41524, term41524.getClass(), "type", "");
        Object term41527 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41527, term41527.getClass(), "name", "");
        setField(term41527, term41527.getClass(), "type", "");
        ArrayList term41519 = new ArrayList();
        ((ArrayList) term41519).add(term41521);
        ((ArrayList) term41519).add(term41524);
        ((ArrayList) term41519).add(term41527);
        term41490 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term41490, term41490.getClass(), "name", "vydWXHfFTw");
        setField(term41490, term41490.getClass(), "type", "DRhkpDneCC");
        setField(term41490, term41490.getClass(), "modifiers", term41515);
        setField(term41490, term41490.getClass(), "parametersEntities", term41519);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModifiers", argTypes, term41490, args);
    }

};


