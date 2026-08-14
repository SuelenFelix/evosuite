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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class Class_canEqual_41021216325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35131;
     Object term35237;

    public Class_canEqual_41021216325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35239 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term35238 = ((Class) term35239).getDeclaredField((String) "FINAL");
        ((Field) term35238).setAccessible(true);
        Object enum90 =  ((Field) term35238).get((Object) null);
        Class<? extends Object> term35576 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term35575 = ((Class) term35576).getDeclaredField((String) "FINAL");
        ((Field) term35575).setAccessible(true);
        Object enum91 =  ((Field) term35575).get((Object) null);
        Class<? extends Object> term35913 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term35912 = ((Class) term35913).getDeclaredField((String) "ABSTRACT");
        ((Field) term35912).setAccessible(true);
        Object enum92 =  ((Field) term35912).get((Object) null);
        Class<? extends Object> term36259 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term36258 = ((Class) term36259).getDeclaredField((String) "PACKAGE");
        ((Field) term36258).setAccessible(true);
        Object enum93 =  ((Field) term36258).get((Object) null);
        ArrayList term35132 = new ArrayList();
        ((ArrayList) term35132).add(enum90);
        ((ArrayList) term35132).add(enum91);
        ((ArrayList) term35132).add(enum92);
        ((ArrayList) term35132).add(enum90);
        ((ArrayList) term35132).add(enum93);
        ((ArrayList) term35132).add(enum91);
        ((ArrayList) term35132).add(enum92);
        ((ArrayList) term35132).add(enum91);
        ArrayList term35161 = new ArrayList();
        ((ArrayList) term35161).add((Object)null);
        ((ArrayList) term35161).add((Object)null);
        ((ArrayList) term35161).add((Object)null);
        ((ArrayList) term35161).add((Object)null);
        ((ArrayList) term35161).add((Object)null);
        ((ArrayList) term35161).add((Object)null);
        ((ArrayList) term35161).add((Object)null);
        ((ArrayList) term35161).add((Object)null);
        Object term35158 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term35158, term35158.getClass(), "name", "");
        setField(term35158, term35158.getClass(), "type", "");
        setField(term35158, term35158.getClass(), "modifiers", term35161);
        ArrayList term35167 = new ArrayList();
        ((ArrayList) term35167).add((Object)null);
        ((ArrayList) term35167).add((Object)null);
        ((ArrayList) term35167).add((Object)null);
        ((ArrayList) term35167).add((Object)null);
        ((ArrayList) term35167).add((Object)null);
        ((ArrayList) term35167).add((Object)null);
        ((ArrayList) term35167).add((Object)null);
        ((ArrayList) term35167).add((Object)null);
        Object term35164 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term35164, term35164.getClass(), "name", "");
        setField(term35164, term35164.getClass(), "type", "");
        setField(term35164, term35164.getClass(), "modifiers", term35167);
        ArrayList term35173 = new ArrayList();
        ((ArrayList) term35173).add((Object)null);
        ((ArrayList) term35173).add((Object)null);
        ((ArrayList) term35173).add((Object)null);
        ((ArrayList) term35173).add((Object)null);
        ((ArrayList) term35173).add((Object)null);
        ((ArrayList) term35173).add((Object)null);
        Object term35170 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term35170, term35170.getClass(), "name", "");
        setField(term35170, term35170.getClass(), "type", "");
        setField(term35170, term35170.getClass(), "modifiers", term35173);
        ArrayList term35179 = new ArrayList();
        ((ArrayList) term35179).add((Object)null);
        Object term35176 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term35176, term35176.getClass(), "name", "");
        setField(term35176, term35176.getClass(), "type", "");
        setField(term35176, term35176.getClass(), "modifiers", term35179);
        ArrayList term35185 = new ArrayList();
        ((ArrayList) term35185).add((Object)null);
        Object term35182 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term35182, term35182.getClass(), "name", "");
        setField(term35182, term35182.getClass(), "type", "");
        setField(term35182, term35182.getClass(), "modifiers", term35185);
        ArrayList term35191 = new ArrayList();
        ((ArrayList) term35191).add((Object)null);
        ((ArrayList) term35191).add((Object)null);
        ((ArrayList) term35191).add((Object)null);
        ((ArrayList) term35191).add((Object)null);
        Object term35188 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term35188, term35188.getClass(), "name", "");
        setField(term35188, term35188.getClass(), "type", "");
        setField(term35188, term35188.getClass(), "modifiers", term35191);
        ArrayList term35156 = new ArrayList();
        ((ArrayList) term35156).add(term35158);
        ((ArrayList) term35156).add(term35164);
        ((ArrayList) term35156).add(term35170);
        ((ArrayList) term35156).add(term35176);
        ((ArrayList) term35156).add(term35182);
        ((ArrayList) term35156).add(term35188);
        ArrayList term35199 = new ArrayList();
        ((ArrayList) term35199).add((Object)null);
        ((ArrayList) term35199).add((Object)null);
        ((ArrayList) term35199).add((Object)null);
        ((ArrayList) term35199).add((Object)null);
        ((ArrayList) term35199).add((Object)null);
        ArrayList term35204 = new ArrayList();
        Object term35198 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term35198, term35198.getClass(), "parameters", term35199);
        setField(term35198, term35198.getClass(), "name", "");
        setField(term35198, term35198.getClass(), "type", "");
        setField(term35198, term35198.getClass(), "modifiers", term35204);
        ArrayList term35196 = new ArrayList();
        ((ArrayList) term35196).add(term35198);
        ArrayList term35233 = new ArrayList();
        term35131 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term35131, term35131.getClass(), "modifiers", term35132);
        setField(term35131, term35131.getClass(), "attributes", term35156);
        setField(term35131, term35131.getClass(), "methods", term35196);
        setField(term35131, term35131.getClass(), "id", "MaeokjEfWD");
        setField(term35131, term35131.getClass(), "name", "ocZcumnXEz");
        setField(term35131, term35131.getClass(), "relations", term35233);
        term35237 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term35237;
        callMethod(klass, "canEqual", argTypes, term35131, args);
    }

};


