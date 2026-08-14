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

public class InterfaceEntity_equals_6040885124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81123;
     Object term81193;

    public InterfaceEntity_equals_6040885124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81195 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term81194 = ((Class) term81195).getDeclaredField((String) "STATIC");
        ((Field) term81194).setAccessible(true);
        Object enum208 =  ((Field) term81194).get((Object) null);
        Class<? extends Object> term81535 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term81534 = ((Class) term81535).getDeclaredField((String) "PRIVATE");
        ((Field) term81534).setAccessible(true);
        Object enum209 =  ((Field) term81534).get((Object) null);
        Class<? extends Object> term81878 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term81877 = ((Class) term81878).getDeclaredField((String) "STATIC");
        ((Field) term81877).setAccessible(true);
        Object enum210 =  ((Field) term81877).get((Object) null);
        Class<? extends Object> term82218 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term82217 = ((Class) term82218).getDeclaredField((String) "PRIVATE");
        ((Field) term82217).setAccessible(true);
        Object enum211 =  ((Field) term82217).get((Object) null);
        ArrayList term81124 = new ArrayList();
        ((ArrayList) term81124).add(enum208);
        ((ArrayList) term81124).add(enum209);
        ((ArrayList) term81124).add(enum210);
        ((ArrayList) term81124).add(enum208);
        ((ArrayList) term81124).add(enum209);
        ((ArrayList) term81124).add(enum210);
        ((ArrayList) term81124).add(enum211);
        ArrayList term81148 = new ArrayList();
        ArrayList term81157 = new ArrayList();
        ((ArrayList) term81157).add((Object)null);
        ((ArrayList) term81157).add((Object)null);
        ((ArrayList) term81157).add((Object)null);
        ArrayList term81160 = new ArrayList();
        ((ArrayList) term81160).add((Object)null);
        Object term81154 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term81154, term81154.getClass(), "name", "");
        setField(term81154, term81154.getClass(), "type", "");
        setField(term81154, term81154.getClass(), "modifiers", term81157);
        setField(term81154, term81154.getClass(), "parametersEntities", term81160);
        ArrayList term81152 = new ArrayList();
        ((ArrayList) term81152).add(term81154);
        ArrayList term81189 = new ArrayList();
        ((ArrayList) term81189).add((Object)null);
        ((ArrayList) term81189).add((Object)null);
        ((ArrayList) term81189).add((Object)null);
        ((ArrayList) term81189).add((Object)null);
        ((ArrayList) term81189).add((Object)null);
        ((ArrayList) term81189).add((Object)null);
        ((ArrayList) term81189).add((Object)null);
        term81123 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.InterfaceEntity"));
        setField(term81123, term81123.getClass(), "modifiers", term81124);
        setField(term81123, term81123.getClass(), "attributesEntities", term81148);
        setField(term81123, term81123.getClass(), "methodsEntities", term81152);
        setField(term81123, term81123.getClass(), "id", "SQnbnBmbcf");
        setField(term81123, term81123.getClass(), "name", "jaNVteZrZi");
        setField(term81123, term81123.getClass(), "relationEntities", term81189);
        term81193 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.InterfaceEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term81193;
        callMethod(klass, "equals", argTypes, term81123, args);
    }

};


