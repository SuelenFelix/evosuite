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

public class MethodEntity_equals_168254391011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47506;
     Object term47559;

    public MethodEntity_equals_168254391011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47581 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term47580 = ((Class) term47581).getDeclaredField((String) "PROTECTED");
        ((Field) term47580).setAccessible(true);
        Object enum124 =  ((Field) term47580).get((Object) null);
        ArrayList term47531 = new ArrayList();
        ((ArrayList) term47531).add(enum124);
        Object term47542 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47542, term47542.getClass(), "name", "");
        setField(term47542, term47542.getClass(), "type", "");
        Object term47545 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47545, term47545.getClass(), "name", "");
        setField(term47545, term47545.getClass(), "type", "");
        Object term47548 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47548, term47548.getClass(), "name", "");
        setField(term47548, term47548.getClass(), "type", "");
        Object term47551 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47551, term47551.getClass(), "name", "");
        setField(term47551, term47551.getClass(), "type", "");
        Object term47554 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47554, term47554.getClass(), "name", "");
        setField(term47554, term47554.getClass(), "type", "");
        ArrayList term47540 = new ArrayList();
        ((ArrayList) term47540).add(term47542);
        ((ArrayList) term47540).add(term47545);
        ((ArrayList) term47540).add(term47548);
        ((ArrayList) term47540).add(term47551);
        ((ArrayList) term47540).add(term47554);
        term47506 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term47506, term47506.getClass(), "name", "VWPFyrpmmb");
        setField(term47506, term47506.getClass(), "type", "gYYKrIeThw");
        setField(term47506, term47506.getClass(), "modifiers", term47531);
        setField(term47506, term47506.getClass(), "parametersEntities", term47540);
        term47559 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term47559;
        callMethod(klass, "equals", argTypes, term47506, args);
    }

};


