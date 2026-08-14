package com.usantatecla.ustumlserver.domain.model.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;

public class Class_modifyAttributes_10180228655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7994;
     Object term8117;
     Object term8200;

    public Class_modifyAttributes_10180228655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8204 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term8203 = ((Class) term8204).getDeclaredField((String) "PUBLIC");
        ((Field) term8203).setAccessible(true);
        Object enum19 =  ((Field) term8203).get((Object) null);
        Class<? extends Object> term8544 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term8543 = ((Class) term8544).getDeclaredField((String) "NULL");
        ((Field) term8543).setAccessible(true);
        Object enum20 =  ((Field) term8543).get((Object) null);
        Class<? extends Object> term8878 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term8877 = ((Class) term8878).getDeclaredField((String) "PROTECTED");
        ((Field) term8877).setAccessible(true);
        Object enum21 =  ((Field) term8877).get((Object) null);
        Class<? extends Object> term9227 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term9226 = ((Class) term9227).getDeclaredField((String) "FINAL");
        ((Field) term9226).setAccessible(true);
        Object enum22 =  ((Field) term9226).get((Object) null);
        Class<? extends Object> term9564 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term9563 = ((Class) term9564).getDeclaredField((String) "STATIC");
        ((Field) term9563).setAccessible(true);
        Object enum23 =  ((Field) term9563).get((Object) null);
        Class<? extends Object> term9904 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term9903 = ((Class) term9904).getDeclaredField((String) "PRIVATE");
        ((Field) term9903).setAccessible(true);
        Object enum24 =  ((Field) term9903).get((Object) null);
        ArrayList term7995 = new ArrayList();
        ((ArrayList) term7995).add(enum19);
        ((ArrayList) term7995).add(enum20);
        ((ArrayList) term7995).add(enum21);
        ((ArrayList) term7995).add(enum22);
        ((ArrayList) term7995).add(enum20);
        ((ArrayList) term7995).add(enum23);
        ((ArrayList) term7995).add(enum24);
        ArrayList term8032 = new ArrayList();
        ((ArrayList) term8032).add((Object)null);
        ((ArrayList) term8032).add((Object)null);
        ((ArrayList) term8032).add((Object)null);
        ((ArrayList) term8032).add((Object)null);
        ((ArrayList) term8032).add((Object)null);
        Object term8029 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8029, term8029.getClass(), "name", "");
        setField(term8029, term8029.getClass(), "type", "");
        setField(term8029, term8029.getClass(), "modifiers", term8032);
        ArrayList term8038 = new ArrayList();
        ((ArrayList) term8038).add((Object)null);
        Object term8035 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8035, term8035.getClass(), "name", "");
        setField(term8035, term8035.getClass(), "type", "");
        setField(term8035, term8035.getClass(), "modifiers", term8038);
        ArrayList term8044 = new ArrayList();
        ((ArrayList) term8044).add((Object)null);
        Object term8041 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8041, term8041.getClass(), "name", "");
        setField(term8041, term8041.getClass(), "type", "");
        setField(term8041, term8041.getClass(), "modifiers", term8044);
        ArrayList term8050 = new ArrayList();
        ((ArrayList) term8050).add((Object)null);
        ((ArrayList) term8050).add((Object)null);
        ((ArrayList) term8050).add((Object)null);
        ((ArrayList) term8050).add((Object)null);
        ((ArrayList) term8050).add((Object)null);
        ((ArrayList) term8050).add((Object)null);
        ((ArrayList) term8050).add((Object)null);
        Object term8047 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8047, term8047.getClass(), "name", "");
        setField(term8047, term8047.getClass(), "type", "");
        setField(term8047, term8047.getClass(), "modifiers", term8050);
        ArrayList term8056 = new ArrayList();
        ((ArrayList) term8056).add((Object)null);
        ((ArrayList) term8056).add((Object)null);
        ((ArrayList) term8056).add((Object)null);
        ((ArrayList) term8056).add((Object)null);
        ((ArrayList) term8056).add((Object)null);
        ((ArrayList) term8056).add((Object)null);
        ((ArrayList) term8056).add((Object)null);
        ((ArrayList) term8056).add((Object)null);
        Object term8053 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8053, term8053.getClass(), "name", "");
        setField(term8053, term8053.getClass(), "type", "");
        setField(term8053, term8053.getClass(), "modifiers", term8056);
        ArrayList term8062 = new ArrayList();
        ((ArrayList) term8062).add((Object)null);
        ((ArrayList) term8062).add((Object)null);
        Object term8059 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8059, term8059.getClass(), "name", "");
        setField(term8059, term8059.getClass(), "type", "");
        setField(term8059, term8059.getClass(), "modifiers", term8062);
        ArrayList term8068 = new ArrayList();
        Object term8065 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8065, term8065.getClass(), "name", "");
        setField(term8065, term8065.getClass(), "type", "");
        setField(term8065, term8065.getClass(), "modifiers", term8068);
        ArrayList term8074 = new ArrayList();
        ((ArrayList) term8074).add((Object)null);
        ((ArrayList) term8074).add((Object)null);
        ((ArrayList) term8074).add((Object)null);
        Object term8071 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8071, term8071.getClass(), "name", "");
        setField(term8071, term8071.getClass(), "type", "");
        setField(term8071, term8071.getClass(), "modifiers", term8074);
        ArrayList term8080 = new ArrayList();
        Object term8077 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8077, term8077.getClass(), "name", "");
        setField(term8077, term8077.getClass(), "type", "");
        setField(term8077, term8077.getClass(), "modifiers", term8080);
        ArrayList term8027 = new ArrayList();
        ((ArrayList) term8027).add(term8029);
        ((ArrayList) term8027).add(term8035);
        ((ArrayList) term8027).add(term8041);
        ((ArrayList) term8027).add(term8047);
        ((ArrayList) term8027).add(term8053);
        ((ArrayList) term8027).add(term8059);
        ((ArrayList) term8027).add(term8065);
        ((ArrayList) term8027).add(term8071);
        ((ArrayList) term8027).add(term8077);
        ArrayList term8085 = new ArrayList();
        ArrayList term8113 = new ArrayList();
        ((ArrayList) term8113).add((Object)null);
        ((ArrayList) term8113).add((Object)null);
        term7994 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term7994, term7994.getClass(), "modifiers", term7995);
        setField(term7994, term7994.getClass(), "attributes", term8027);
        setField(term7994, term7994.getClass(), "methods", term8085);
        setField(term7994, term7994.getClass(), "id", "SPBstwKFVr");
        setField(term7994, term7994.getClass(), "name", "WxYUTuqmIq");
        setField(term7994, term7994.getClass(), "relations", term8113);
        ArrayList term8145 = new ArrayList();
        ((ArrayList) term8145).add(enum24);
        Object term8120 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8120, term8120.getClass(), "name", "OeQLvhVERT");
        setField(term8120, term8120.getClass(), "type", "IlvgFINwIa");
        setField(term8120, term8120.getClass(), "modifiers", term8145);
        ArrayList term8153 = new ArrayList();
        ((ArrayList) term8153).add((Object)null);
        ((ArrayList) term8153).add((Object)null);
        Object term8150 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8150, term8150.getClass(), "name", "");
        setField(term8150, term8150.getClass(), "type", "");
        setField(term8150, term8150.getClass(), "modifiers", term8153);
        Object term8157 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term8157, term8157.getClass(), "name", null);
        setField(term8157, term8157.getClass(), "type", null);
        setField(term8157, term8157.getClass(), "modifiers", null);
        term8117 = new LinkedList();
        ((LinkedList) term8117).add(term8120);
        ((LinkedList) term8117).add(term8150);
        ((LinkedList) term8117).add(term8157);
        ((LinkedList) term8117).add((Object)null);
        ((LinkedList) term8117).add((Object)null);
        ((LinkedList) term8117).add((Object)null);
        ((LinkedList) term8117).add((Object)null);
        ((LinkedList) term8117).add((Object)null);
        term8200 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term8117;
        args[1] = term8200;
        callMethod(klass, "modifyAttributes", argTypes, term7994, args);
    }

};


