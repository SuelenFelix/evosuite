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

public class AttributeEntity_init_16933376660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1213;

    public AttributeEntity_init_16933376660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1278 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term1277 = ((Class) term1278).getDeclaredField((String) "PRIVATE");
        ((Field) term1277).setAccessible(true);
        Object enum2 =  ((Field) term1277).get((Object) null);
        Class<? extends Object> term1621 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term1620 = ((Class) term1621).getDeclaredField((String) "STATIC");
        ((Field) term1620).setAccessible(true);
        Object enum3 =  ((Field) term1620).get((Object) null);
        Class<? extends Object> term1961 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term1960 = ((Class) term1961).getDeclaredField((String) "PROTECTED");
        ((Field) term1960).setAccessible(true);
        Object enum4 =  ((Field) term1960).get((Object) null);
        ArrayList term1238 = new ArrayList();
        ((ArrayList) term1238).add(enum2);
        ((ArrayList) term1238).add(enum3);
        ((ArrayList) term1238).add(enum3);
        ((ArrayList) term1238).add(enum4);
        term1213 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term1213, term1213.getClass(), "name", "MxlszYVzRf");
        setField(term1213, term1213.getClass(), "type", "LQFpaHEwXR");
        setField(term1213, term1213.getClass(), "modifiers", term1238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute");
        Object[] args = new Object[1];
        args[0] = term1213;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


