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

public class ClassEntity_getAttributesEntities_91414399910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21865;

    public ClassEntity_getAttributesEntities_91414399910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21978 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term21977 = ((Class) term21978).getDeclaredField((String) "PUBLIC");
        ((Field) term21977).setAccessible(true);
        Object enum56 =  ((Field) term21977).get((Object) null);
        Class<? extends Object> term22318 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term22317 = ((Class) term22318).getDeclaredField((String) "STATIC");
        ((Field) term22317).setAccessible(true);
        Object enum57 =  ((Field) term22317).get((Object) null);
        Class<? extends Object> term22658 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term22657 = ((Class) term22658).getDeclaredField((String) "PACKAGE");
        ((Field) term22657).setAccessible(true);
        Object enum58 =  ((Field) term22657).get((Object) null);
        Class<? extends Object> term23001 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term23000 = ((Class) term23001).getDeclaredField((String) "NULL");
        ((Field) term23000).setAccessible(true);
        Object enum59 =  ((Field) term23000).get((Object) null);
        Class<? extends Object> term23335 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term23334 = ((Class) term23335).getDeclaredField((String) "PACKAGE");
        ((Field) term23334).setAccessible(true);
        Object enum60 =  ((Field) term23334).get((Object) null);
        ArrayList term21866 = new ArrayList();
        ((ArrayList) term21866).add(enum56);
        ((ArrayList) term21866).add(enum56);
        ((ArrayList) term21866).add(enum57);
        ((ArrayList) term21866).add(enum58);
        ((ArrayList) term21866).add(enum58);
        ((ArrayList) term21866).add(enum57);
        ((ArrayList) term21866).add(enum59);
        ((ArrayList) term21866).add(enum60);
        ArrayList term21898 = new ArrayList();
        ((ArrayList) term21898).add((Object)null);
        ((ArrayList) term21898).add((Object)null);
        ((ArrayList) term21898).add((Object)null);
        ((ArrayList) term21898).add((Object)null);
        ((ArrayList) term21898).add((Object)null);
        Object term21895 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term21895, term21895.getClass(), "name", "");
        setField(term21895, term21895.getClass(), "type", "");
        setField(term21895, term21895.getClass(), "modifiers", term21898);
        ArrayList term21904 = new ArrayList();
        ((ArrayList) term21904).add((Object)null);
        ((ArrayList) term21904).add((Object)null);
        ((ArrayList) term21904).add((Object)null);
        ((ArrayList) term21904).add((Object)null);
        ((ArrayList) term21904).add((Object)null);
        ((ArrayList) term21904).add((Object)null);
        ((ArrayList) term21904).add((Object)null);
        ((ArrayList) term21904).add((Object)null);
        Object term21901 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term21901, term21901.getClass(), "name", "");
        setField(term21901, term21901.getClass(), "type", "");
        setField(term21901, term21901.getClass(), "modifiers", term21904);
        ArrayList term21910 = new ArrayList();
        ((ArrayList) term21910).add((Object)null);
        ((ArrayList) term21910).add((Object)null);
        ((ArrayList) term21910).add((Object)null);
        ((ArrayList) term21910).add((Object)null);
        ((ArrayList) term21910).add((Object)null);
        ((ArrayList) term21910).add((Object)null);
        ((ArrayList) term21910).add((Object)null);
        ((ArrayList) term21910).add((Object)null);
        ((ArrayList) term21910).add((Object)null);
        Object term21907 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term21907, term21907.getClass(), "name", "");
        setField(term21907, term21907.getClass(), "type", "");
        setField(term21907, term21907.getClass(), "modifiers", term21910);
        ArrayList term21916 = new ArrayList();
        ((ArrayList) term21916).add((Object)null);
        ((ArrayList) term21916).add((Object)null);
        ((ArrayList) term21916).add((Object)null);
        ((ArrayList) term21916).add((Object)null);
        ((ArrayList) term21916).add((Object)null);
        ((ArrayList) term21916).add((Object)null);
        ((ArrayList) term21916).add((Object)null);
        Object term21913 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term21913, term21913.getClass(), "name", "");
        setField(term21913, term21913.getClass(), "type", "");
        setField(term21913, term21913.getClass(), "modifiers", term21916);
        ArrayList term21922 = new ArrayList();
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        ((ArrayList) term21922).add((Object)null);
        Object term21919 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term21919, term21919.getClass(), "name", "");
        setField(term21919, term21919.getClass(), "type", "");
        setField(term21919, term21919.getClass(), "modifiers", term21922);
        ArrayList term21928 = new ArrayList();
        ((ArrayList) term21928).add((Object)null);
        ((ArrayList) term21928).add((Object)null);
        ((ArrayList) term21928).add((Object)null);
        ((ArrayList) term21928).add((Object)null);
        ((ArrayList) term21928).add((Object)null);
        Object term21925 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term21925, term21925.getClass(), "name", "");
        setField(term21925, term21925.getClass(), "type", "");
        setField(term21925, term21925.getClass(), "modifiers", term21928);
        ArrayList term21934 = new ArrayList();
        ((ArrayList) term21934).add((Object)null);
        ((ArrayList) term21934).add((Object)null);
        Object term21931 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term21931, term21931.getClass(), "name", "");
        setField(term21931, term21931.getClass(), "type", "");
        setField(term21931, term21931.getClass(), "modifiers", term21934);
        ArrayList term21940 = new ArrayList();
        ((ArrayList) term21940).add((Object)null);
        ((ArrayList) term21940).add((Object)null);
        Object term21937 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term21937, term21937.getClass(), "name", "");
        setField(term21937, term21937.getClass(), "type", "");
        setField(term21937, term21937.getClass(), "modifiers", term21940);
        ArrayList term21893 = new ArrayList();
        ((ArrayList) term21893).add(term21895);
        ((ArrayList) term21893).add(term21901);
        ((ArrayList) term21893).add(term21907);
        ((ArrayList) term21893).add(term21913);
        ((ArrayList) term21893).add(term21919);
        ((ArrayList) term21893).add(term21925);
        ((ArrayList) term21893).add(term21931);
        ((ArrayList) term21893).add(term21937);
        ArrayList term21945 = new ArrayList();
        ArrayList term21973 = new ArrayList();
        term21865 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity"));
        setField(term21865, term21865.getClass(), "modifiers", term21866);
        setField(term21865, term21865.getClass(), "attributesEntities", term21893);
        setField(term21865, term21865.getClass(), "methodsEntities", term21945);
        setField(term21865, term21865.getClass(), "id", "EusenEbIoF");
        setField(term21865, term21865.getClass(), "name", "SScVQYSvWH");
        setField(term21865, term21865.getClass(), "relationEntities", term21973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttributesEntities", argTypes, term21865, args);
    }

};


