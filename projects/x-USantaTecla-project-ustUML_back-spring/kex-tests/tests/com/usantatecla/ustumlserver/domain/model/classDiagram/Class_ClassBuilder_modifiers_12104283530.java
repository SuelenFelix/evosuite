package com.usantatecla.ustumlserver.domain.model.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class Class_ClassBuilder_modifiers_12104283530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4021;

    public Class_ClassBuilder_modifiers_12104283530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4058 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term4057 = ((Class) term4058).getDeclaredField((String) "FINAL");
        ((Field) term4057).setAccessible(true);
        Object enum9 =  ((Field) term4057).get((Object) null);
        Class<? extends Object> term4395 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term4394 = ((Class) term4395).getDeclaredField((String) "PUBLIC");
        ((Field) term4394).setAccessible(true);
        Object enum10 =  ((Field) term4394).get((Object) null);
        Class<? extends Object> term4735 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term4734 = ((Class) term4735).getDeclaredField((String) "PUBLIC");
        ((Field) term4734).setAccessible(true);
        Object enum11 =  ((Field) term4734).get((Object) null);
        term4021 = new LinkedList();
        ((LinkedList) term4021).add(enum9);
        ((LinkedList) term4021).add(enum10);
        ((LinkedList) term4021).add(enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class$ClassBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term4021;
        callMethod(klass, "modifiers", argTypes, null, args);
    }

};


