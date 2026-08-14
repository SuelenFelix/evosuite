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

public class AttributeEntity_setModifiers_15679242558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9229;
     Object term9263;

    public AttributeEntity_setModifiers_15679242558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9293 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term9292 = ((Class) term9293).getDeclaredField((String) "ABSTRACT");
        ((Field) term9292).setAccessible(true);
        Object enum24 =  ((Field) term9292).get((Object) null);
        ArrayList term9254 = new ArrayList();
        ((ArrayList) term9254).add(enum24);
        term9229 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term9229, term9229.getClass(), "name", "IoAlmYsBwc");
        setField(term9229, term9229.getClass(), "type", "TEParAifyi");
        setField(term9229, term9229.getClass(), "modifiers", term9254);
        Class<? extends Object> term9639 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term9638 = ((Class) term9639).getDeclaredField((String) "ABSTRACT");
        ((Field) term9638).setAccessible(true);
        Object enum25 =  ((Field) term9638).get((Object) null);
        term9263 = new LinkedList();
        ((LinkedList) term9263).add(enum24);
        ((LinkedList) term9263).add(enum25);
        ((LinkedList) term9263).add(enum24);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term9263;
        callMethod(klass, "setModifiers", argTypes, term9229, args);
    }

};


