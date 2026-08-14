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

public class MethodEntity_MethodEntityBuilder_parametersEntities_13403017464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89650;
     Object term89694;

    public MethodEntity_MethodEntityBuilder_parametersEntities_13403017464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term89718 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term89717 = ((Class) term89718).getDeclaredField((String) "FINAL");
        ((Field) term89717).setAccessible(true);
        Object enum231 =  ((Field) term89717).get((Object) null);
        Class<? extends Object> term90055 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term90054 = ((Class) term90055).getDeclaredField((String) "PUBLIC");
        ((Field) term90054).setAccessible(true);
        Object enum232 =  ((Field) term90054).get((Object) null);
        ArrayList term89675 = new ArrayList();
        ((ArrayList) term89675).add(enum231);
        ((ArrayList) term89675).add(enum232);
        ((ArrayList) term89675).add(enum232);
        Object term89689 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term89689, term89689.getClass(), "name", "");
        setField(term89689, term89689.getClass(), "type", "");
        ArrayList term89687 = new ArrayList();
        ((ArrayList) term89687).add(term89689);
        term89650 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder"));
        setField(term89650, term89650.getClass(), "name", "TIaFKUJELS");
        setField(term89650, term89650.getClass(), "type", "IPmndzGjtG");
        setField(term89650, term89650.getClass(), "modifiers", term89675);
        setField(term89650, term89650.getClass(), "parametersEntities", term89687);
        term89694 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term89694;
        callMethod(klass, "parametersEntities", argTypes, term89650, args);
    }

};


