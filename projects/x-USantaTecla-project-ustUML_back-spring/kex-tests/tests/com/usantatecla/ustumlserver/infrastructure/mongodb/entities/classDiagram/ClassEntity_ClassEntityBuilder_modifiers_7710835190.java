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
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class ClassEntity_ClassEntityBuilder_modifiers_7710835190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;

    public ClassEntity_ClassEntityBuilder_modifiers_7710835190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term472 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term471 = ((Class) term472).getDeclaredField((String) "PACKAGE");
        ((Field) term471).setAccessible(true);
        Object enum0 =  ((Field) term471).get((Object) null);
        Class<? extends Object> term815 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term814 = ((Class) term815).getDeclaredField((String) "PRIVATE");
        ((Field) term814).setAccessible(true);
        Object enum1 =  ((Field) term814).get((Object) null);
        term229 = new LinkedList();
        ((LinkedList) term229).add(enum0);
        ((LinkedList) term229).add(enum1);
        ((LinkedList) term229).add(enum1);
        ((LinkedList) term229).add((Object)null);
        ((LinkedList) term229).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity$ClassEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term229;
        callMethod(klass, "modifiers", argTypes, null, args);
    }

};


