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

public class Class_getAttributes_138544596318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27137;

    public Class_getAttributes_138544596318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term27204 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term27203 = ((Class) term27204).getDeclaredField((String) "PROTECTED");
        ((Field) term27203).setAccessible(true);
        Object enum69 =  ((Field) term27203).get((Object) null);
        Class<? extends Object> term27553 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term27552 = ((Class) term27553).getDeclaredField((String) "PRIVATE");
        ((Field) term27552).setAccessible(true);
        Object enum70 =  ((Field) term27552).get((Object) null);
        Class<? extends Object> term27896 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term27895 = ((Class) term27896).getDeclaredField((String) "STATIC");
        ((Field) term27895).setAccessible(true);
        Object enum71 =  ((Field) term27895).get((Object) null);
        Class<? extends Object> term28236 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term28235 = ((Class) term28236).getDeclaredField((String) "STATIC");
        ((Field) term28235).setAccessible(true);
        Object enum72 =  ((Field) term28235).get((Object) null);
        Class<? extends Object> term28576 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term28575 = ((Class) term28576).getDeclaredField((String) "PROTECTED");
        ((Field) term28575).setAccessible(true);
        Object enum73 =  ((Field) term28575).get((Object) null);
        ArrayList term27138 = new ArrayList();
        ((ArrayList) term27138).add(enum69);
        ((ArrayList) term27138).add(enum69);
        ((ArrayList) term27138).add(enum70);
        ((ArrayList) term27138).add(enum71);
        ((ArrayList) term27138).add(enum72);
        ((ArrayList) term27138).add(enum69);
        ((ArrayList) term27138).add(enum69);
        ((ArrayList) term27138).add(enum73);
        ArrayList term27167 = new ArrayList();
        ArrayList term27171 = new ArrayList();
        ArrayList term27199 = new ArrayList();
        ((ArrayList) term27199).add((Object)null);
        ((ArrayList) term27199).add((Object)null);
        ((ArrayList) term27199).add((Object)null);
        term27137 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term27137, term27137.getClass(), "modifiers", term27138);
        setField(term27137, term27137.getClass(), "attributes", term27167);
        setField(term27137, term27137.getClass(), "methods", term27171);
        setField(term27137, term27137.getClass(), "id", "uMsWXqNhln");
        setField(term27137, term27137.getClass(), "name", "MAnhIPOtHL");
        setField(term27137, term27137.getClass(), "relations", term27199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttributes", argTypes, term27137, args);
    }

};


