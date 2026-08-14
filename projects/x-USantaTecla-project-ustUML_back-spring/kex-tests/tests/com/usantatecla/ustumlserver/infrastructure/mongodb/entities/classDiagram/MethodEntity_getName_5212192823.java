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

public class MethodEntity_getName_5212192823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37861;

    public MethodEntity_getName_5212192823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37969 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term37968 = ((Class) term37969).getDeclaredField((String) "ABSTRACT");
        ((Field) term37968).setAccessible(true);
        Object enum98 =  ((Field) term37968).get((Object) null);
        Class<? extends Object> term38315 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term38314 = ((Class) term38315).getDeclaredField((String) "PROTECTED");
        ((Field) term38314).setAccessible(true);
        Object enum99 =  ((Field) term38314).get((Object) null);
        Class<? extends Object> term38664 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term38663 = ((Class) term38664).getDeclaredField((String) "ABSTRACT");
        ((Field) term38663).setAccessible(true);
        Object enum100 =  ((Field) term38663).get((Object) null);
        Class<? extends Object> term39010 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term39009 = ((Class) term39010).getDeclaredField((String) "PROTECTED");
        ((Field) term39009).setAccessible(true);
        Object enum101 =  ((Field) term39009).get((Object) null);
        Class<? extends Object> term39359 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term39358 = ((Class) term39359).getDeclaredField((String) "ABSTRACT");
        ((Field) term39358).setAccessible(true);
        Object enum102 =  ((Field) term39358).get((Object) null);
        Class<? extends Object> term39705 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term39704 = ((Class) term39705).getDeclaredField((String) "STATIC");
        ((Field) term39704).setAccessible(true);
        Object enum103 =  ((Field) term39704).get((Object) null);
        ArrayList term37886 = new ArrayList();
        ((ArrayList) term37886).add(enum98);
        ((ArrayList) term37886).add(enum99);
        ((ArrayList) term37886).add(enum100);
        ((ArrayList) term37886).add(enum101);
        ((ArrayList) term37886).add(enum102);
        ((ArrayList) term37886).add(enum103);
        ((ArrayList) term37886).add(enum98);
        ((ArrayList) term37886).add(enum100);
        ((ArrayList) term37886).add(enum98);
        Object term37922 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term37922, term37922.getClass(), "name", "");
        setField(term37922, term37922.getClass(), "type", "");
        Object term37925 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term37925, term37925.getClass(), "name", "");
        setField(term37925, term37925.getClass(), "type", "");
        Object term37928 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term37928, term37928.getClass(), "name", "");
        setField(term37928, term37928.getClass(), "type", "");
        Object term37931 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term37931, term37931.getClass(), "name", "");
        setField(term37931, term37931.getClass(), "type", "");
        Object term37934 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term37934, term37934.getClass(), "name", "");
        setField(term37934, term37934.getClass(), "type", "");
        Object term37937 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term37937, term37937.getClass(), "name", "");
        setField(term37937, term37937.getClass(), "type", "");
        Object term37940 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term37940, term37940.getClass(), "name", "");
        setField(term37940, term37940.getClass(), "type", "");
        Object term37943 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term37943, term37943.getClass(), "name", "");
        setField(term37943, term37943.getClass(), "type", "");
        ArrayList term37920 = new ArrayList();
        ((ArrayList) term37920).add(term37922);
        ((ArrayList) term37920).add(term37925);
        ((ArrayList) term37920).add(term37928);
        ((ArrayList) term37920).add(term37931);
        ((ArrayList) term37920).add(term37934);
        ((ArrayList) term37920).add(term37937);
        ((ArrayList) term37920).add(term37940);
        ((ArrayList) term37920).add(term37943);
        term37861 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term37861, term37861.getClass(), "name", "DddqUYfomL");
        setField(term37861, term37861.getClass(), "type", "YQwoogpPyi");
        setField(term37861, term37861.getClass(), "modifiers", term37886);
        setField(term37861, term37861.getClass(), "parametersEntities", term37920);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term37861, args);
    }

};


