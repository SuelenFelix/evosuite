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

public class InterfaceEntity_hashCode_1554018376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84085;

    public InterfaceEntity_hashCode_1554018376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84150 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term84149 = ((Class) term84150).getDeclaredField((String) "PROTECTED");
        ((Field) term84149).setAccessible(true);
        Object enum216 =  ((Field) term84149).get((Object) null);
        ArrayList term84086 = new ArrayList();
        ((ArrayList) term84086).add(enum216);
        ArrayList term84095 = new ArrayList();
        ArrayList term84104 = new ArrayList();
        ((ArrayList) term84104).add((Object)null);
        ((ArrayList) term84104).add((Object)null);
        ((ArrayList) term84104).add((Object)null);
        ((ArrayList) term84104).add((Object)null);
        ((ArrayList) term84104).add((Object)null);
        ((ArrayList) term84104).add((Object)null);
        ((ArrayList) term84104).add((Object)null);
        ((ArrayList) term84104).add((Object)null);
        ArrayList term84107 = new ArrayList();
        ((ArrayList) term84107).add((Object)null);
        ((ArrayList) term84107).add((Object)null);
        ((ArrayList) term84107).add((Object)null);
        ((ArrayList) term84107).add((Object)null);
        Object term84101 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term84101, term84101.getClass(), "name", "");
        setField(term84101, term84101.getClass(), "type", "");
        setField(term84101, term84101.getClass(), "modifiers", term84104);
        setField(term84101, term84101.getClass(), "parametersEntities", term84107);
        ArrayList term84113 = new ArrayList();
        ArrayList term84116 = new ArrayList();
        ((ArrayList) term84116).add((Object)null);
        Object term84110 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term84110, term84110.getClass(), "name", "");
        setField(term84110, term84110.getClass(), "type", "");
        setField(term84110, term84110.getClass(), "modifiers", term84113);
        setField(term84110, term84110.getClass(), "parametersEntities", term84116);
        ArrayList term84099 = new ArrayList();
        ((ArrayList) term84099).add(term84101);
        ((ArrayList) term84099).add(term84110);
        ArrayList term84145 = new ArrayList();
        ((ArrayList) term84145).add((Object)null);
        ((ArrayList) term84145).add((Object)null);
        ((ArrayList) term84145).add((Object)null);
        ((ArrayList) term84145).add((Object)null);
        term84085 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.InterfaceEntity"));
        setField(term84085, term84085.getClass(), "modifiers", term84086);
        setField(term84085, term84085.getClass(), "attributesEntities", term84095);
        setField(term84085, term84085.getClass(), "methodsEntities", term84099);
        setField(term84085, term84085.getClass(), "id", "xdYuLllgpn");
        setField(term84085, term84085.getClass(), "name", "ayonlqalLA");
        setField(term84085, term84085.getClass(), "relationEntities", term84145);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.InterfaceEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term84085, args);
    }

};


