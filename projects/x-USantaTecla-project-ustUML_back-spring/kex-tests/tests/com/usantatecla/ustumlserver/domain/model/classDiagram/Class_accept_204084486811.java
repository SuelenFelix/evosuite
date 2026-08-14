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

public class Class_accept_204084486811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17626;

    public Class_accept_204084486811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17711 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term17710 = ((Class) term17711).getDeclaredField((String) "NULL");
        ((Field) term17710).setAccessible(true);
        Object enum43 =  ((Field) term17710).get((Object) null);
        Class<? extends Object> term18045 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term18044 = ((Class) term18045).getDeclaredField((String) "NULL");
        ((Field) term18044).setAccessible(true);
        Object enum44 =  ((Field) term18044).get((Object) null);
        Class<? extends Object> term18379 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term18378 = ((Class) term18379).getDeclaredField((String) "PACKAGE");
        ((Field) term18378).setAccessible(true);
        Object enum45 =  ((Field) term18378).get((Object) null);
        Class<? extends Object> term18722 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term18721 = ((Class) term18722).getDeclaredField((String) "PUBLIC");
        ((Field) term18721).setAccessible(true);
        Object enum46 =  ((Field) term18721).get((Object) null);
        Class<? extends Object> term19062 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term19061 = ((Class) term19062).getDeclaredField((String) "NULL");
        ((Field) term19061).setAccessible(true);
        Object enum47 =  ((Field) term19061).get((Object) null);
        ArrayList term17627 = new ArrayList();
        ((ArrayList) term17627).add(enum43);
        ((ArrayList) term17627).add(enum44);
        ((ArrayList) term17627).add(enum45);
        ((ArrayList) term17627).add(enum45);
        ((ArrayList) term17627).add(enum46);
        ((ArrayList) term17627).add(enum47);
        ArrayList term17661 = new ArrayList();
        Object term17658 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term17658, term17658.getClass(), "name", "");
        setField(term17658, term17658.getClass(), "type", "");
        setField(term17658, term17658.getClass(), "modifiers", term17661);
        ArrayList term17667 = new ArrayList();
        Object term17664 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term17664, term17664.getClass(), "name", "");
        setField(term17664, term17664.getClass(), "type", "");
        setField(term17664, term17664.getClass(), "modifiers", term17667);
        ArrayList term17673 = new ArrayList();
        ((ArrayList) term17673).add((Object)null);
        ((ArrayList) term17673).add((Object)null);
        ((ArrayList) term17673).add((Object)null);
        ((ArrayList) term17673).add((Object)null);
        ((ArrayList) term17673).add((Object)null);
        ((ArrayList) term17673).add((Object)null);
        Object term17670 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term17670, term17670.getClass(), "name", "");
        setField(term17670, term17670.getClass(), "type", "");
        setField(term17670, term17670.getClass(), "modifiers", term17673);
        ArrayList term17656 = new ArrayList();
        ((ArrayList) term17656).add(term17658);
        ((ArrayList) term17656).add(term17664);
        ((ArrayList) term17656).add(term17670);
        ArrayList term17678 = new ArrayList();
        ArrayList term17706 = new ArrayList();
        term17626 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term17626, term17626.getClass(), "modifiers", term17627);
        setField(term17626, term17626.getClass(), "attributes", term17656);
        setField(term17626, term17626.getClass(), "methods", term17678);
        setField(term17626, term17626.getClass(), "id", "DNOtiLPAIY");
        setField(term17626, term17626.getClass(), "name", "FnEkAHBfyV");
        setField(term17626, term17626.getClass(), "relations", term17706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.Generator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accept", argTypes, term17626, args);
    }

};


