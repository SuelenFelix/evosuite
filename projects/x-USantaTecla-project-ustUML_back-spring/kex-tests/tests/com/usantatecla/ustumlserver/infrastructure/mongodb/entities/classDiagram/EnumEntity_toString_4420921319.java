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

public class EnumEntity_toString_4420921319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77600;

    public EnumEntity_toString_4420921319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term77601 = new ArrayList();
        ((ArrayList) term77601).add("aEZAnHuGSR");
        Class<? extends Object> term77707 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term77706 = ((Class) term77707).getDeclaredField((String) "NULL");
        ((Field) term77706).setAccessible(true);
        Object enum199 =  ((Field) term77706).get((Object) null);
        Class<? extends Object> term78041 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term78040 = ((Class) term78041).getDeclaredField((String) "PROTECTED");
        ((Field) term78040).setAccessible(true);
        Object enum200 =  ((Field) term78040).get((Object) null);
        Class<? extends Object> term78390 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term78389 = ((Class) term78390).getDeclaredField((String) "PROTECTED");
        ((Field) term78389).setAccessible(true);
        Object enum201 =  ((Field) term78389).get((Object) null);
        ArrayList term77617 = new ArrayList();
        ((ArrayList) term77617).add(enum199);
        ((ArrayList) term77617).add(enum200);
        ((ArrayList) term77617).add(enum201);
        ((ArrayList) term77617).add(enum201);
        ArrayList term77641 = new ArrayList();
        ((ArrayList) term77641).add((Object)null);
        ((ArrayList) term77641).add((Object)null);
        ((ArrayList) term77641).add((Object)null);
        ((ArrayList) term77641).add((Object)null);
        ((ArrayList) term77641).add((Object)null);
        ((ArrayList) term77641).add((Object)null);
        Object term77638 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term77638, term77638.getClass(), "name", "");
        setField(term77638, term77638.getClass(), "type", "");
        setField(term77638, term77638.getClass(), "modifiers", term77641);
        ArrayList term77636 = new ArrayList();
        ((ArrayList) term77636).add(term77638);
        ArrayList term77651 = new ArrayList();
        ((ArrayList) term77651).add((Object)null);
        ((ArrayList) term77651).add((Object)null);
        ((ArrayList) term77651).add((Object)null);
        ((ArrayList) term77651).add((Object)null);
        ((ArrayList) term77651).add((Object)null);
        ((ArrayList) term77651).add((Object)null);
        ((ArrayList) term77651).add((Object)null);
        ((ArrayList) term77651).add((Object)null);
        ((ArrayList) term77651).add((Object)null);
        ArrayList term77654 = new ArrayList();
        ((ArrayList) term77654).add((Object)null);
        ((ArrayList) term77654).add((Object)null);
        ((ArrayList) term77654).add((Object)null);
        ((ArrayList) term77654).add((Object)null);
        Object term77648 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term77648, term77648.getClass(), "name", "");
        setField(term77648, term77648.getClass(), "type", "");
        setField(term77648, term77648.getClass(), "modifiers", term77651);
        setField(term77648, term77648.getClass(), "parametersEntities", term77654);
        ArrayList term77660 = new ArrayList();
        ArrayList term77663 = new ArrayList();
        ((ArrayList) term77663).add((Object)null);
        ((ArrayList) term77663).add((Object)null);
        ((ArrayList) term77663).add((Object)null);
        ((ArrayList) term77663).add((Object)null);
        ((ArrayList) term77663).add((Object)null);
        ((ArrayList) term77663).add((Object)null);
        ((ArrayList) term77663).add((Object)null);
        ((ArrayList) term77663).add((Object)null);
        ((ArrayList) term77663).add((Object)null);
        Object term77657 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term77657, term77657.getClass(), "name", "");
        setField(term77657, term77657.getClass(), "type", "");
        setField(term77657, term77657.getClass(), "modifiers", term77660);
        setField(term77657, term77657.getClass(), "parametersEntities", term77663);
        ArrayList term77646 = new ArrayList();
        ((ArrayList) term77646).add(term77648);
        ((ArrayList) term77646).add(term77657);
        ArrayList term77692 = new ArrayList();
        ((ArrayList) term77692).add((Object)null);
        ((ArrayList) term77692).add((Object)null);
        ((ArrayList) term77692).add((Object)null);
        ((ArrayList) term77692).add((Object)null);
        ((ArrayList) term77692).add((Object)null);
        ((ArrayList) term77692).add((Object)null);
        ((ArrayList) term77692).add((Object)null);
        ((ArrayList) term77692).add((Object)null);
        ((ArrayList) term77692).add((Object)null);
        term77600 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.EnumEntity"));
        setField(term77600, term77600.getClass(), "objects", term77601);
        setField(term77600, term77600.getClass(), "modifiers", term77617);
        setField(term77600, term77600.getClass(), "attributesEntities", term77636);
        setField(term77600, term77600.getClass(), "methodsEntities", term77646);
        setField(term77600, term77600.getClass(), "id", "jkVaRrZHQX");
        setField(term77600, term77600.getClass(), "name", "gSFFUuJipG");
        setField(term77600, term77600.getClass(), "relationEntities", term77692);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.EnumEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term77600, args);
    }

};


