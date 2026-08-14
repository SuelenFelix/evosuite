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

public class MethodEntity_hashCode_213123058513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49373;

    public MethodEntity_hashCode_213123058513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49451 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term49450 = ((Class) term49451).getDeclaredField((String) "FINAL");
        ((Field) term49450).setAccessible(true);
        Object enum129 =  ((Field) term49450).get((Object) null);
        Class<? extends Object> term49788 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term49787 = ((Class) term49788).getDeclaredField((String) "STATIC");
        ((Field) term49787).setAccessible(true);
        Object enum130 =  ((Field) term49787).get((Object) null);
        Class<? extends Object> term50128 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term50127 = ((Class) term50128).getDeclaredField((String) "PRIVATE");
        ((Field) term50127).setAccessible(true);
        Object enum131 =  ((Field) term50127).get((Object) null);
        ArrayList term49398 = new ArrayList();
        ((ArrayList) term49398).add(enum129);
        ((ArrayList) term49398).add(enum130);
        ((ArrayList) term49398).add(enum129);
        ((ArrayList) term49398).add(enum131);
        Object term49419 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term49419, term49419.getClass(), "name", "");
        setField(term49419, term49419.getClass(), "type", "");
        Object term49422 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term49422, term49422.getClass(), "name", "");
        setField(term49422, term49422.getClass(), "type", "");
        Object term49425 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term49425, term49425.getClass(), "name", "");
        setField(term49425, term49425.getClass(), "type", "");
        ArrayList term49417 = new ArrayList();
        ((ArrayList) term49417).add(term49419);
        ((ArrayList) term49417).add(term49422);
        ((ArrayList) term49417).add(term49425);
        term49373 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term49373, term49373.getClass(), "name", "XmLHcnVsch");
        setField(term49373, term49373.getClass(), "type", "Yrvtdcltri");
        setField(term49373, term49373.getClass(), "modifiers", term49398);
        setField(term49373, term49373.getClass(), "parametersEntities", term49417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term49373, args);
    }

};


