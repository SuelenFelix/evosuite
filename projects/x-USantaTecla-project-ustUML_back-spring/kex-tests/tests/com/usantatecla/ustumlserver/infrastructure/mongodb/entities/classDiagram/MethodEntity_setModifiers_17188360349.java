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
import java.util.LinkedList;

public class MethodEntity_setModifiers_17188360349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44552;
     Object term44601;

    public MethodEntity_setModifiers_17188360349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44660 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term44659 = ((Class) term44660).getDeclaredField((String) "PACKAGE");
        ((Field) term44659).setAccessible(true);
        Object enum116 =  ((Field) term44659).get((Object) null);
        Class<? extends Object> term45003 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term45002 = ((Class) term45003).getDeclaredField((String) "PROTECTED");
        ((Field) term45002).setAccessible(true);
        Object enum117 =  ((Field) term45002).get((Object) null);
        ArrayList term44577 = new ArrayList();
        ((ArrayList) term44577).add(enum116);
        ((ArrayList) term44577).add(enum117);
        ((ArrayList) term44577).add(enum116);
        Object term44593 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term44593, term44593.getClass(), "name", "");
        setField(term44593, term44593.getClass(), "type", "");
        Object term44596 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term44596, term44596.getClass(), "name", "");
        setField(term44596, term44596.getClass(), "type", "");
        ArrayList term44591 = new ArrayList();
        ((ArrayList) term44591).add(term44593);
        ((ArrayList) term44591).add(term44596);
        term44552 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term44552, term44552.getClass(), "name", "uXYojRmxrM");
        setField(term44552, term44552.getClass(), "type", "cxRwRcodud");
        setField(term44552, term44552.getClass(), "modifiers", term44577);
        setField(term44552, term44552.getClass(), "parametersEntities", term44591);
        Class<? extends Object> term45352 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term45351 = ((Class) term45352).getDeclaredField((String) "STATIC");
        ((Field) term45351).setAccessible(true);
        Object enum118 =  ((Field) term45351).get((Object) null);
        Class<? extends Object> term45692 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term45691 = ((Class) term45692).getDeclaredField((String) "PUBLIC");
        ((Field) term45691).setAccessible(true);
        Object enum119 =  ((Field) term45691).get((Object) null);
        term44601 = new LinkedList();
        ((LinkedList) term44601).add(enum118);
        ((LinkedList) term44601).add(enum119);
        ((LinkedList) term44601).add(enum117);
        ((LinkedList) term44601).add(enum118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term44601;
        callMethod(klass, "setModifiers", argTypes, term44552, args);
    }

};


