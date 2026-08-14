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

public class AttributeEntity_AttributeEntityBuilder_modifiers_4620093433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61625;
     Object term61674;

    public AttributeEntity_AttributeEntityBuilder_modifiers_4620093433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61698 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term61697 = ((Class) term61698).getDeclaredField((String) "STATIC");
        ((Field) term61697).setAccessible(true);
        Object enum158 =  ((Field) term61697).get((Object) null);
        Class<? extends Object> term62038 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term62037 = ((Class) term62038).getDeclaredField((String) "STATIC");
        ((Field) term62037).setAccessible(true);
        Object enum159 =  ((Field) term62037).get((Object) null);
        Class<? extends Object> term62378 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term62377 = ((Class) term62378).getDeclaredField((String) "ABSTRACT");
        ((Field) term62377).setAccessible(true);
        Object enum160 =  ((Field) term62377).get((Object) null);
        Class<? extends Object> term62724 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term62723 = ((Class) term62724).getDeclaredField((String) "ABSTRACT");
        ((Field) term62723).setAccessible(true);
        Object enum161 =  ((Field) term62723).get((Object) null);
        ArrayList term61650 = new ArrayList();
        ((ArrayList) term61650).add(enum158);
        ((ArrayList) term61650).add(enum159);
        ((ArrayList) term61650).add(enum160);
        ((ArrayList) term61650).add(enum161);
        ((ArrayList) term61650).add(enum160);
        term61625 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity$AttributeEntityBuilder"));
        setField(term61625, term61625.getClass(), "name", "LnNRVsjmxw");
        setField(term61625, term61625.getClass(), "type", "PlOnDkNrvX");
        setField(term61625, term61625.getClass(), "modifiers", term61650);
        term61674 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity$AttributeEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term61674;
        callMethod(klass, "modifiers", argTypes, term61625, args);
    }

};


