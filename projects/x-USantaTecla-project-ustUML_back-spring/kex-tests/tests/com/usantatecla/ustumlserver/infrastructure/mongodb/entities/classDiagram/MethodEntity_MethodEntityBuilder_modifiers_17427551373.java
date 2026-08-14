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
import java.util.LinkedList;

public class MethodEntity_MethodEntityBuilder_modifiers_17427551373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88193;
     Object term88261;

    public MethodEntity_MethodEntityBuilder_modifiers_17427551373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88285 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term88284 = ((Class) term88285).getDeclaredField((String) "PROTECTED");
        ((Field) term88284).setAccessible(true);
        Object enum227 =  ((Field) term88284).get((Object) null);
        Class<? extends Object> term88634 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term88633 = ((Class) term88634).getDeclaredField((String) "PUBLIC");
        ((Field) term88633).setAccessible(true);
        Object enum228 =  ((Field) term88633).get((Object) null);
        Class<? extends Object> term88974 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term88973 = ((Class) term88974).getDeclaredField((String) "FINAL");
        ((Field) term88973).setAccessible(true);
        Object enum229 =  ((Field) term88973).get((Object) null);
        Class<? extends Object> term89311 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term89310 = ((Class) term89311).getDeclaredField((String) "STATIC");
        ((Field) term89310).setAccessible(true);
        Object enum230 =  ((Field) term89310).get((Object) null);
        ArrayList term88218 = new ArrayList();
        ((ArrayList) term88218).add(enum227);
        ((ArrayList) term88218).add(enum228);
        ((ArrayList) term88218).add(enum229);
        ((ArrayList) term88218).add(enum230);
        ((ArrayList) term88218).add(enum228);
        ((ArrayList) term88218).add(enum227);
        ((ArrayList) term88218).add(enum227);
        ((ArrayList) term88218).add(enum229);
        Object term88244 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term88244, term88244.getClass(), "name", "");
        setField(term88244, term88244.getClass(), "type", "");
        Object term88247 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term88247, term88247.getClass(), "name", "");
        setField(term88247, term88247.getClass(), "type", "");
        Object term88250 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term88250, term88250.getClass(), "name", "");
        setField(term88250, term88250.getClass(), "type", "");
        Object term88253 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term88253, term88253.getClass(), "name", "");
        setField(term88253, term88253.getClass(), "type", "");
        Object term88256 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term88256, term88256.getClass(), "name", "");
        setField(term88256, term88256.getClass(), "type", "");
        ArrayList term88242 = new ArrayList();
        ((ArrayList) term88242).add(term88244);
        ((ArrayList) term88242).add(term88247);
        ((ArrayList) term88242).add(term88250);
        ((ArrayList) term88242).add(term88253);
        ((ArrayList) term88242).add(term88256);
        term88193 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder"));
        setField(term88193, term88193.getClass(), "name", "DvfOYWcNBN");
        setField(term88193, term88193.getClass(), "type", "cvbvwpPlNk");
        setField(term88193, term88193.getClass(), "modifiers", term88218);
        setField(term88193, term88193.getClass(), "parametersEntities", term88242);
        term88261 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term88261;
        callMethod(klass, "modifiers", argTypes, term88193, args);
    }

};


