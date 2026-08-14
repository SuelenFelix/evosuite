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

public class InterfaceEntity_toString_3553578537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84518;

    public InterfaceEntity_toString_3553578537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84578 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term84577 = ((Class) term84578).getDeclaredField((String) "PRIVATE");
        ((Field) term84577).setAccessible(true);
        Object enum217 =  ((Field) term84577).get((Object) null);
        Class<? extends Object> term84921 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term84920 = ((Class) term84921).getDeclaredField((String) "STATIC");
        ((Field) term84920).setAccessible(true);
        Object enum218 =  ((Field) term84920).get((Object) null);
        Class<? extends Object> term85261 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term85260 = ((Class) term85261).getDeclaredField((String) "NULL");
        ((Field) term85260).setAccessible(true);
        Object enum219 =  ((Field) term85260).get((Object) null);
        Class<? extends Object> term85595 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term85594 = ((Class) term85595).getDeclaredField((String) "PRIVATE");
        ((Field) term85594).setAccessible(true);
        Object enum220 =  ((Field) term85594).get((Object) null);
        ArrayList term84519 = new ArrayList();
        ((ArrayList) term84519).add(enum217);
        ((ArrayList) term84519).add(enum218);
        ((ArrayList) term84519).add(enum219);
        ((ArrayList) term84519).add(enum220);
        ArrayList term84541 = new ArrayList();
        ArrayList term84545 = new ArrayList();
        ArrayList term84573 = new ArrayList();
        ((ArrayList) term84573).add((Object)null);
        ((ArrayList) term84573).add((Object)null);
        ((ArrayList) term84573).add((Object)null);
        ((ArrayList) term84573).add((Object)null);
        ((ArrayList) term84573).add((Object)null);
        ((ArrayList) term84573).add((Object)null);
        ((ArrayList) term84573).add((Object)null);
        term84518 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.InterfaceEntity"));
        setField(term84518, term84518.getClass(), "modifiers", term84519);
        setField(term84518, term84518.getClass(), "attributesEntities", term84541);
        setField(term84518, term84518.getClass(), "methodsEntities", term84545);
        setField(term84518, term84518.getClass(), "id", "fzzIOVxKdF");
        setField(term84518, term84518.getClass(), "name", "cdvmxZaBEK");
        setField(term84518, term84518.getClass(), "relationEntities", term84573);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.InterfaceEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term84518, args);
    }

};


