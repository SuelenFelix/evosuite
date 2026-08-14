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

public class AttributeEntity_AttributeEntityBuilder_type_7225671902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59135;

    public AttributeEntity_AttributeEntityBuilder_type_7225671902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59230 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term59229 = ((Class) term59230).getDeclaredField((String) "ABSTRACT");
        ((Field) term59229).setAccessible(true);
        Object enum151 =  ((Field) term59229).get((Object) null);
        Class<? extends Object> term59576 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term59575 = ((Class) term59576).getDeclaredField((String) "FINAL");
        ((Field) term59575).setAccessible(true);
        Object enum152 =  ((Field) term59575).get((Object) null);
        Class<? extends Object> term59913 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term59912 = ((Class) term59913).getDeclaredField((String) "PRIVATE");
        ((Field) term59912).setAccessible(true);
        Object enum153 =  ((Field) term59912).get((Object) null);
        Class<? extends Object> term60256 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term60255 = ((Class) term60256).getDeclaredField((String) "PACKAGE");
        ((Field) term60255).setAccessible(true);
        Object enum154 =  ((Field) term60255).get((Object) null);
        Class<? extends Object> term60599 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term60598 = ((Class) term60599).getDeclaredField((String) "NULL");
        ((Field) term60598).setAccessible(true);
        Object enum155 =  ((Field) term60598).get((Object) null);
        Class<? extends Object> term60933 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term60932 = ((Class) term60933).getDeclaredField((String) "PACKAGE");
        ((Field) term60932).setAccessible(true);
        Object enum156 =  ((Field) term60932).get((Object) null);
        Class<? extends Object> term61276 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term61275 = ((Class) term61276).getDeclaredField((String) "STATIC");
        ((Field) term61275).setAccessible(true);
        Object enum157 =  ((Field) term61275).get((Object) null);
        ArrayList term59160 = new ArrayList();
        ((ArrayList) term59160).add(enum151);
        ((ArrayList) term59160).add(enum152);
        ((ArrayList) term59160).add(enum153);
        ((ArrayList) term59160).add(enum154);
        ((ArrayList) term59160).add(enum155);
        ((ArrayList) term59160).add(enum155);
        ((ArrayList) term59160).add(enum156);
        ((ArrayList) term59160).add(enum156);
        ((ArrayList) term59160).add(enum157);
        term59135 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity$AttributeEntityBuilder"));
        setField(term59135, term59135.getClass(), "name", "HZfkWoqyUW");
        setField(term59135, term59135.getClass(), "type", "QRwANPSyfT");
        setField(term59135, term59135.getClass(), "modifiers", term59160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity$AttributeEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DbZKLwYBgy";
        callMethod(klass, "type", argTypes, term59135, args);
    }

};


