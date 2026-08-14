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

public class ClassEntity_equals_211365295915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30478;
     Object term30559;

    public ClassEntity_equals_211365295915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30561 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term30560 = ((Class) term30561).getDeclaredField((String) "PACKAGE");
        ((Field) term30560).setAccessible(true);
        Object enum79 =  ((Field) term30560).get((Object) null);
        Class<? extends Object> term30904 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term30903 = ((Class) term30904).getDeclaredField((String) "PUBLIC");
        ((Field) term30903).setAccessible(true);
        Object enum80 =  ((Field) term30903).get((Object) null);
        Class<? extends Object> term31244 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term31243 = ((Class) term31244).getDeclaredField((String) "PACKAGE");
        ((Field) term31243).setAccessible(true);
        Object enum81 =  ((Field) term31243).get((Object) null);
        ArrayList term30479 = new ArrayList();
        ((ArrayList) term30479).add(enum79);
        ((ArrayList) term30479).add(enum80);
        ((ArrayList) term30479).add(enum81);
        ((ArrayList) term30479).add(enum81);
        ArrayList term30496 = new ArrayList();
        ArrayList term30505 = new ArrayList();
        ((ArrayList) term30505).add((Object)null);
        ((ArrayList) term30505).add((Object)null);
        ((ArrayList) term30505).add((Object)null);
        ((ArrayList) term30505).add((Object)null);
        ArrayList term30508 = new ArrayList();
        ((ArrayList) term30508).add((Object)null);
        ((ArrayList) term30508).add((Object)null);
        ((ArrayList) term30508).add((Object)null);
        ((ArrayList) term30508).add((Object)null);
        ((ArrayList) term30508).add((Object)null);
        ((ArrayList) term30508).add((Object)null);
        ((ArrayList) term30508).add((Object)null);
        ((ArrayList) term30508).add((Object)null);
        ((ArrayList) term30508).add((Object)null);
        Object term30502 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term30502, term30502.getClass(), "name", "");
        setField(term30502, term30502.getClass(), "type", "");
        setField(term30502, term30502.getClass(), "modifiers", term30505);
        setField(term30502, term30502.getClass(), "parametersEntities", term30508);
        ArrayList term30514 = new ArrayList();
        ((ArrayList) term30514).add((Object)null);
        ((ArrayList) term30514).add((Object)null);
        ((ArrayList) term30514).add((Object)null);
        ((ArrayList) term30514).add((Object)null);
        ArrayList term30517 = new ArrayList();
        ((ArrayList) term30517).add((Object)null);
        ((ArrayList) term30517).add((Object)null);
        ((ArrayList) term30517).add((Object)null);
        ((ArrayList) term30517).add((Object)null);
        ((ArrayList) term30517).add((Object)null);
        ((ArrayList) term30517).add((Object)null);
        Object term30511 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term30511, term30511.getClass(), "name", "");
        setField(term30511, term30511.getClass(), "type", "");
        setField(term30511, term30511.getClass(), "modifiers", term30514);
        setField(term30511, term30511.getClass(), "parametersEntities", term30517);
        ArrayList term30523 = new ArrayList();
        ((ArrayList) term30523).add((Object)null);
        ((ArrayList) term30523).add((Object)null);
        ((ArrayList) term30523).add((Object)null);
        ((ArrayList) term30523).add((Object)null);
        ArrayList term30526 = new ArrayList();
        ((ArrayList) term30526).add((Object)null);
        ((ArrayList) term30526).add((Object)null);
        ((ArrayList) term30526).add((Object)null);
        ((ArrayList) term30526).add((Object)null);
        ((ArrayList) term30526).add((Object)null);
        Object term30520 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term30520, term30520.getClass(), "name", "");
        setField(term30520, term30520.getClass(), "type", "");
        setField(term30520, term30520.getClass(), "modifiers", term30523);
        setField(term30520, term30520.getClass(), "parametersEntities", term30526);
        ArrayList term30500 = new ArrayList();
        ((ArrayList) term30500).add(term30502);
        ((ArrayList) term30500).add(term30511);
        ((ArrayList) term30500).add(term30520);
        ArrayList term30555 = new ArrayList();
        term30478 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity"));
        setField(term30478, term30478.getClass(), "modifiers", term30479);
        setField(term30478, term30478.getClass(), "attributesEntities", term30496);
        setField(term30478, term30478.getClass(), "methodsEntities", term30500);
        setField(term30478, term30478.getClass(), "id", "KHtaDOIcJZ");
        setField(term30478, term30478.getClass(), "name", "vgdwrCZczl");
        setField(term30478, term30478.getClass(), "relationEntities", term30555);
        term30559 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term30559;
        callMethod(klass, "equals", argTypes, term30478, args);
    }

};


