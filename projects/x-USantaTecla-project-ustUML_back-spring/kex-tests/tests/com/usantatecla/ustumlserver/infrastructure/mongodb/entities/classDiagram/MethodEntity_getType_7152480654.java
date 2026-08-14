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

public class MethodEntity_getType_7152480654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40044;

    public MethodEntity_getType_7152480654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40128 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term40127 = ((Class) term40128).getDeclaredField((String) "PROTECTED");
        ((Field) term40127).setAccessible(true);
        Object enum104 =  ((Field) term40127).get((Object) null);
        Class<? extends Object> term40477 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term40476 = ((Class) term40477).getDeclaredField((String) "FINAL");
        ((Field) term40476).setAccessible(true);
        Object enum105 =  ((Field) term40476).get((Object) null);
        Class<? extends Object> term40814 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term40813 = ((Class) term40814).getDeclaredField((String) "PUBLIC");
        ((Field) term40813).setAccessible(true);
        Object enum106 =  ((Field) term40813).get((Object) null);
        Class<? extends Object> term41154 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term41153 = ((Class) term41154).getDeclaredField((String) "FINAL");
        ((Field) term41153).setAccessible(true);
        Object enum107 =  ((Field) term41153).get((Object) null);
        ArrayList term40069 = new ArrayList();
        ((ArrayList) term40069).add(enum104);
        ((ArrayList) term40069).add(enum105);
        ((ArrayList) term40069).add(enum106);
        ((ArrayList) term40069).add(enum104);
        ((ArrayList) term40069).add(enum104);
        ((ArrayList) term40069).add(enum107);
        ((ArrayList) term40069).add(enum105);
        ((ArrayList) term40069).add(enum106);
        Object term40093 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term40093, term40093.getClass(), "name", "");
        setField(term40093, term40093.getClass(), "type", "");
        Object term40096 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term40096, term40096.getClass(), "name", "");
        setField(term40096, term40096.getClass(), "type", "");
        Object term40099 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term40099, term40099.getClass(), "name", "");
        setField(term40099, term40099.getClass(), "type", "");
        Object term40102 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term40102, term40102.getClass(), "name", "");
        setField(term40102, term40102.getClass(), "type", "");
        ArrayList term40091 = new ArrayList();
        ((ArrayList) term40091).add(term40093);
        ((ArrayList) term40091).add(term40096);
        ((ArrayList) term40091).add(term40099);
        ((ArrayList) term40091).add(term40102);
        term40044 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term40044, term40044.getClass(), "name", "nDCcyhiTnS");
        setField(term40044, term40044.getClass(), "type", "Bcivwcjece");
        setField(term40044, term40044.getClass(), "modifiers", term40069);
        setField(term40044, term40044.getClass(), "parametersEntities", term40091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term40044, args);
    }

};


