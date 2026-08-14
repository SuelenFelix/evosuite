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

public class EnumEntity_hashCode_686675598 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76457;

    public EnumEntity_hashCode_686675598() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term76458 = new ArrayList();
        Class<? extends Object> term76558 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term76557 = ((Class) term76558).getDeclaredField((String) "PROTECTED");
        ((Field) term76557).setAccessible(true);
        Object enum196 =  ((Field) term76557).get((Object) null);
        Class<? extends Object> term76907 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term76906 = ((Class) term76907).getDeclaredField((String) "NULL");
        ((Field) term76906).setAccessible(true);
        Object enum197 =  ((Field) term76906).get((Object) null);
        Class<? extends Object> term77241 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term77240 = ((Class) term77241).getDeclaredField((String) "STATIC");
        ((Field) term77240).setAccessible(true);
        Object enum198 =  ((Field) term77240).get((Object) null);
        ArrayList term76462 = new ArrayList();
        ((ArrayList) term76462).add(enum196);
        ((ArrayList) term76462).add(enum196);
        ((ArrayList) term76462).add(enum197);
        ((ArrayList) term76462).add(enum197);
        ((ArrayList) term76462).add(enum197);
        ((ArrayList) term76462).add(enum196);
        ((ArrayList) term76462).add(enum198);
        ArrayList term76484 = new ArrayList();
        ((ArrayList) term76484).add((Object)null);
        Object term76481 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term76481, term76481.getClass(), "name", "");
        setField(term76481, term76481.getClass(), "type", "");
        setField(term76481, term76481.getClass(), "modifiers", term76484);
        ArrayList term76490 = new ArrayList();
        Object term76487 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term76487, term76487.getClass(), "name", "");
        setField(term76487, term76487.getClass(), "type", "");
        setField(term76487, term76487.getClass(), "modifiers", term76490);
        ArrayList term76496 = new ArrayList();
        Object term76493 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term76493, term76493.getClass(), "name", "");
        setField(term76493, term76493.getClass(), "type", "");
        setField(term76493, term76493.getClass(), "modifiers", term76496);
        ArrayList term76502 = new ArrayList();
        ((ArrayList) term76502).add((Object)null);
        Object term76499 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term76499, term76499.getClass(), "name", "");
        setField(term76499, term76499.getClass(), "type", "");
        setField(term76499, term76499.getClass(), "modifiers", term76502);
        ArrayList term76508 = new ArrayList();
        ((ArrayList) term76508).add((Object)null);
        ((ArrayList) term76508).add((Object)null);
        ((ArrayList) term76508).add((Object)null);
        ((ArrayList) term76508).add((Object)null);
        ((ArrayList) term76508).add((Object)null);
        ((ArrayList) term76508).add((Object)null);
        ((ArrayList) term76508).add((Object)null);
        Object term76505 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term76505, term76505.getClass(), "name", "");
        setField(term76505, term76505.getClass(), "type", "");
        setField(term76505, term76505.getClass(), "modifiers", term76508);
        ArrayList term76514 = new ArrayList();
        Object term76511 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term76511, term76511.getClass(), "name", "");
        setField(term76511, term76511.getClass(), "type", "");
        setField(term76511, term76511.getClass(), "modifiers", term76514);
        ArrayList term76520 = new ArrayList();
        ((ArrayList) term76520).add((Object)null);
        ((ArrayList) term76520).add((Object)null);
        ((ArrayList) term76520).add((Object)null);
        ((ArrayList) term76520).add((Object)null);
        ((ArrayList) term76520).add((Object)null);
        Object term76517 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term76517, term76517.getClass(), "name", "");
        setField(term76517, term76517.getClass(), "type", "");
        setField(term76517, term76517.getClass(), "modifiers", term76520);
        ArrayList term76479 = new ArrayList();
        ((ArrayList) term76479).add(term76481);
        ((ArrayList) term76479).add(term76487);
        ((ArrayList) term76479).add(term76493);
        ((ArrayList) term76479).add(term76499);
        ((ArrayList) term76479).add(term76505);
        ((ArrayList) term76479).add(term76511);
        ((ArrayList) term76479).add(term76517);
        ArrayList term76525 = new ArrayList();
        ArrayList term76553 = new ArrayList();
        ((ArrayList) term76553).add((Object)null);
        ((ArrayList) term76553).add((Object)null);
        ((ArrayList) term76553).add((Object)null);
        ((ArrayList) term76553).add((Object)null);
        ((ArrayList) term76553).add((Object)null);
        term76457 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.EnumEntity"));
        setField(term76457, term76457.getClass(), "objects", term76458);
        setField(term76457, term76457.getClass(), "modifiers", term76462);
        setField(term76457, term76457.getClass(), "attributesEntities", term76479);
        setField(term76457, term76457.getClass(), "methodsEntities", term76525);
        setField(term76457, term76457.getClass(), "id", "KgfsAwTFFn");
        setField(term76457, term76457.getClass(), "name", "hFnFlgThhp");
        setField(term76457, term76457.getClass(), "relationEntities", term76553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.EnumEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term76457, args);
    }

};


