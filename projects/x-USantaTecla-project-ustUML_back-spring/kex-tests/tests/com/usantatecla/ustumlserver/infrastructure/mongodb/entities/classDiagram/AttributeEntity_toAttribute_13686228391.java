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

public class AttributeEntity_toAttribute_13686228391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2309;

    public AttributeEntity_toAttribute_13686228391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2392 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term2391 = ((Class) term2392).getDeclaredField((String) "ABSTRACT");
        ((Field) term2391).setAccessible(true);
        Object enum5 =  ((Field) term2391).get((Object) null);
        Class<? extends Object> term2738 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term2737 = ((Class) term2738).getDeclaredField((String) "PRIVATE");
        ((Field) term2737).setAccessible(true);
        Object enum6 =  ((Field) term2737).get((Object) null);
        Class<? extends Object> term3081 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term3080 = ((Class) term3081).getDeclaredField((String) "PACKAGE");
        ((Field) term3080).setAccessible(true);
        Object enum7 =  ((Field) term3080).get((Object) null);
        Class<? extends Object> term3424 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term3423 = ((Class) term3424).getDeclaredField((String) "FINAL");
        ((Field) term3423).setAccessible(true);
        Object enum8 =  ((Field) term3423).get((Object) null);
        Class<? extends Object> term3761 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term3760 = ((Class) term3761).getDeclaredField((String) "STATIC");
        ((Field) term3760).setAccessible(true);
        Object enum9 =  ((Field) term3760).get((Object) null);
        Class<? extends Object> term4101 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term4100 = ((Class) term4101).getDeclaredField((String) "PROTECTED");
        ((Field) term4100).setAccessible(true);
        Object enum10 =  ((Field) term4100).get((Object) null);
        Class<? extends Object> term4450 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term4449 = ((Class) term4450).getDeclaredField((String) "PACKAGE");
        ((Field) term4449).setAccessible(true);
        Object enum11 =  ((Field) term4449).get((Object) null);
        ArrayList term2334 = new ArrayList();
        ((ArrayList) term2334).add(enum5);
        ((ArrayList) term2334).add(enum6);
        ((ArrayList) term2334).add(enum7);
        ((ArrayList) term2334).add(enum8);
        ((ArrayList) term2334).add(enum9);
        ((ArrayList) term2334).add(enum8);
        ((ArrayList) term2334).add(enum10);
        ((ArrayList) term2334).add(enum11);
        ((ArrayList) term2334).add(enum5);
        term2309 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term2309, term2309.getClass(), "name", "oVcInYnLWB");
        setField(term2309, term2309.getClass(), "type", "aJlieCFVtF");
        setField(term2309, term2309.getClass(), "modifiers", term2334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toAttribute", argTypes, term2309, args);
    }

};


