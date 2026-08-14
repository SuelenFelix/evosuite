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
import java.lang.String;
import java.lang.Object;

public class MethodEntity_setType_18598426638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43430;

    public MethodEntity_setType_18598426638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43520 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term43519 = ((Class) term43520).getDeclaredField((String) "NULL");
        ((Field) term43519).setAccessible(true);
        Object enum113 =  ((Field) term43519).get((Object) null);
        Class<? extends Object> term43854 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term43853 = ((Class) term43854).getDeclaredField((String) "PROTECTED");
        ((Field) term43853).setAccessible(true);
        Object enum114 =  ((Field) term43853).get((Object) null);
        Class<? extends Object> term44203 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term44202 = ((Class) term44203).getDeclaredField((String) "PUBLIC");
        ((Field) term44202).setAccessible(true);
        Object enum115 =  ((Field) term44202).get((Object) null);
        ArrayList term43455 = new ArrayList();
        ((ArrayList) term43455).add(enum113);
        ((ArrayList) term43455).add(enum114);
        ((ArrayList) term43455).add(enum115);
        Object term43476 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term43476, term43476.getClass(), "name", "");
        setField(term43476, term43476.getClass(), "type", "");
        Object term43479 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term43479, term43479.getClass(), "name", "");
        setField(term43479, term43479.getClass(), "type", "");
        Object term43482 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term43482, term43482.getClass(), "name", "");
        setField(term43482, term43482.getClass(), "type", "");
        ArrayList term43474 = new ArrayList();
        ((ArrayList) term43474).add(term43476);
        ((ArrayList) term43474).add(term43479);
        ((ArrayList) term43474).add(term43482);
        term43430 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term43430, term43430.getClass(), "name", "YaDWphDOSz");
        setField(term43430, term43430.getClass(), "type", "nnnmCgFBLw");
        setField(term43430, term43430.getClass(), "modifiers", term43455);
        setField(term43430, term43430.getClass(), "parametersEntities", term43474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "gwTUlYNpjM";
        callMethod(klass, "setType", argTypes, term43430, args);
    }

};


