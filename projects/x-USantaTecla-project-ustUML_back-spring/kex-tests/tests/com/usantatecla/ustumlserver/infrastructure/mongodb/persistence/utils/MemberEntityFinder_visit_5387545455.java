package com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class MemberEntityFinder_visit_5387545455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855;

    public MemberEntityFinder_visit_5387545455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1126 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term1125 = ((Class) term1126).getDeclaredField((String) "PACKAGE");
        ((Field) term1125).setAccessible(true);
        Object enum1 =  ((Field) term1125).get((Object) null);
        Class<? extends Object> term1469 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term1468 = ((Class) term1469).getDeclaredField((String) "PACKAGE");
        ((Field) term1468).setAccessible(true);
        Object enum2 =  ((Field) term1468).get((Object) null);
        Class<? extends Object> term1812 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term1811 = ((Class) term1812).getDeclaredField((String) "STATIC");
        ((Field) term1811).setAccessible(true);
        Object enum3 =  ((Field) term1811).get((Object) null);
        Class<? extends Object> term2152 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term2151 = ((Class) term2152).getDeclaredField((String) "NULL");
        ((Field) term2151).setAccessible(true);
        Object enum4 =  ((Field) term2151).get((Object) null);
        Class<? extends Object> term2486 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term2485 = ((Class) term2486).getDeclaredField((String) "NULL");
        ((Field) term2485).setAccessible(true);
        Object enum5 =  ((Field) term2485).get((Object) null);
        ArrayList term856 = new ArrayList();
        ((ArrayList) term856).add(enum1);
        ((ArrayList) term856).add(enum2);
        ((ArrayList) term856).add(enum2);
        ((ArrayList) term856).add(enum3);
        ((ArrayList) term856).add(enum4);
        ((ArrayList) term856).add(enum5);
        ArrayList term890 = new ArrayList();
        ((ArrayList) term890).add((Object)null);
        ((ArrayList) term890).add((Object)null);
        ((ArrayList) term890).add((Object)null);
        ((ArrayList) term890).add((Object)null);
        ((ArrayList) term890).add((Object)null);
        ((ArrayList) term890).add((Object)null);
        Object term887 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term887, term887.getClass(), "name", "");
        setField(term887, term887.getClass(), "type", "");
        setField(term887, term887.getClass(), "modifiers", term890);
        ArrayList term896 = new ArrayList();
        ((ArrayList) term896).add((Object)null);
        ((ArrayList) term896).add((Object)null);
        ((ArrayList) term896).add((Object)null);
        ((ArrayList) term896).add((Object)null);
        ((ArrayList) term896).add((Object)null);
        ((ArrayList) term896).add((Object)null);
        ((ArrayList) term896).add((Object)null);
        Object term893 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term893, term893.getClass(), "name", "");
        setField(term893, term893.getClass(), "type", "");
        setField(term893, term893.getClass(), "modifiers", term896);
        ArrayList term885 = new ArrayList();
        ((ArrayList) term885).add(term887);
        ((ArrayList) term885).add(term893);
        ArrayList term904 = new ArrayList();
        ((ArrayList) term904).add((Object)null);
        ((ArrayList) term904).add((Object)null);
        ((ArrayList) term904).add((Object)null);
        ((ArrayList) term904).add((Object)null);
        ((ArrayList) term904).add((Object)null);
        ((ArrayList) term904).add((Object)null);
        ArrayList term909 = new ArrayList();
        ((ArrayList) term909).add((Object)null);
        ((ArrayList) term909).add((Object)null);
        ((ArrayList) term909).add((Object)null);
        ((ArrayList) term909).add((Object)null);
        ((ArrayList) term909).add((Object)null);
        Object term903 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term903, term903.getClass(), "parameters", term904);
        setField(term903, term903.getClass(), "name", "");
        setField(term903, term903.getClass(), "type", "");
        setField(term903, term903.getClass(), "modifiers", term909);
        ArrayList term901 = new ArrayList();
        ((ArrayList) term901).add(term903);
        ArrayList term938 = new ArrayList();
        ((ArrayList) term938).add((Object)null);
        ((ArrayList) term938).add((Object)null);
        ((ArrayList) term938).add((Object)null);
        ((ArrayList) term938).add((Object)null);
        ((ArrayList) term938).add((Object)null);
        term855 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term855, term855.getClass(), "modifiers", term856);
        setField(term855, term855.getClass(), "attributes", term885);
        setField(term855, term855.getClass(), "methods", term901);
        setField(term855, term855.getClass(), "id", "UlajhuVLaP");
        setField(term855, term855.getClass(), "name", "gGSMzuGICf");
        setField(term855, term855.getClass(), "relations", term938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Object[] args = new Object[1];
        args[0] = term855;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


