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

public class Class_ClassBuilderImpl_self_6941248851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49039;

    public Class_ClassBuilderImpl_self_6941248851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49152 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term49151 = ((Class) term49152).getDeclaredField((String) "FINAL");
        ((Field) term49151).setAccessible(true);
        Object enum127 =  ((Field) term49151).get((Object) null);
        Class<? extends Object> term49489 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term49488 = ((Class) term49489).getDeclaredField((String) "NULL");
        ((Field) term49488).setAccessible(true);
        Object enum128 =  ((Field) term49488).get((Object) null);
        Class<? extends Object> term49823 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term49822 = ((Class) term49823).getDeclaredField((String) "STATIC");
        ((Field) term49822).setAccessible(true);
        Object enum129 =  ((Field) term49822).get((Object) null);
        Class<? extends Object> term50163 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term50162 = ((Class) term50163).getDeclaredField((String) "NULL");
        ((Field) term50162).setAccessible(true);
        Object enum130 =  ((Field) term50162).get((Object) null);
        ArrayList term49040 = new ArrayList();
        ((ArrayList) term49040).add(enum127);
        ((ArrayList) term49040).add(enum128);
        ((ArrayList) term49040).add(enum129);
        ((ArrayList) term49040).add(enum130);
        ArrayList term49069 = new ArrayList();
        ((ArrayList) term49069).add((Object)null);
        ((ArrayList) term49069).add((Object)null);
        ((ArrayList) term49069).add((Object)null);
        Object term49066 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term49066, term49066.getClass(), "name", "");
        setField(term49066, term49066.getClass(), "type", "");
        setField(term49066, term49066.getClass(), "modifiers", term49069);
        ArrayList term49075 = new ArrayList();
        ((ArrayList) term49075).add((Object)null);
        ((ArrayList) term49075).add((Object)null);
        Object term49072 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term49072, term49072.getClass(), "name", "");
        setField(term49072, term49072.getClass(), "type", "");
        setField(term49072, term49072.getClass(), "modifiers", term49075);
        ArrayList term49081 = new ArrayList();
        ((ArrayList) term49081).add((Object)null);
        ((ArrayList) term49081).add((Object)null);
        ((ArrayList) term49081).add((Object)null);
        Object term49078 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term49078, term49078.getClass(), "name", "");
        setField(term49078, term49078.getClass(), "type", "");
        setField(term49078, term49078.getClass(), "modifiers", term49081);
        ArrayList term49087 = new ArrayList();
        ((ArrayList) term49087).add((Object)null);
        ((ArrayList) term49087).add((Object)null);
        ((ArrayList) term49087).add((Object)null);
        ((ArrayList) term49087).add((Object)null);
        ((ArrayList) term49087).add((Object)null);
        ((ArrayList) term49087).add((Object)null);
        ((ArrayList) term49087).add((Object)null);
        ((ArrayList) term49087).add((Object)null);
        ((ArrayList) term49087).add((Object)null);
        Object term49084 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term49084, term49084.getClass(), "name", "");
        setField(term49084, term49084.getClass(), "type", "");
        setField(term49084, term49084.getClass(), "modifiers", term49087);
        ArrayList term49093 = new ArrayList();
        ((ArrayList) term49093).add((Object)null);
        ((ArrayList) term49093).add((Object)null);
        ((ArrayList) term49093).add((Object)null);
        ((ArrayList) term49093).add((Object)null);
        ((ArrayList) term49093).add((Object)null);
        Object term49090 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term49090, term49090.getClass(), "name", "");
        setField(term49090, term49090.getClass(), "type", "");
        setField(term49090, term49090.getClass(), "modifiers", term49093);
        ArrayList term49099 = new ArrayList();
        ((ArrayList) term49099).add((Object)null);
        ((ArrayList) term49099).add((Object)null);
        ((ArrayList) term49099).add((Object)null);
        Object term49096 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term49096, term49096.getClass(), "name", "");
        setField(term49096, term49096.getClass(), "type", "");
        setField(term49096, term49096.getClass(), "modifiers", term49099);
        ArrayList term49105 = new ArrayList();
        ((ArrayList) term49105).add((Object)null);
        ((ArrayList) term49105).add((Object)null);
        ((ArrayList) term49105).add((Object)null);
        ((ArrayList) term49105).add((Object)null);
        ((ArrayList) term49105).add((Object)null);
        ((ArrayList) term49105).add((Object)null);
        ((ArrayList) term49105).add((Object)null);
        ((ArrayList) term49105).add((Object)null);
        ((ArrayList) term49105).add((Object)null);
        Object term49102 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term49102, term49102.getClass(), "name", "");
        setField(term49102, term49102.getClass(), "type", "");
        setField(term49102, term49102.getClass(), "modifiers", term49105);
        ArrayList term49064 = new ArrayList();
        ((ArrayList) term49064).add(term49066);
        ((ArrayList) term49064).add(term49072);
        ((ArrayList) term49064).add(term49078);
        ((ArrayList) term49064).add(term49084);
        ((ArrayList) term49064).add(term49090);
        ((ArrayList) term49064).add(term49096);
        ((ArrayList) term49064).add(term49102);
        ArrayList term49113 = new ArrayList();
        ((ArrayList) term49113).add((Object)null);
        ((ArrayList) term49113).add((Object)null);
        ((ArrayList) term49113).add((Object)null);
        ((ArrayList) term49113).add((Object)null);
        ((ArrayList) term49113).add((Object)null);
        ((ArrayList) term49113).add((Object)null);
        ((ArrayList) term49113).add((Object)null);
        ((ArrayList) term49113).add((Object)null);
        ((ArrayList) term49113).add((Object)null);
        ArrayList term49118 = new ArrayList();
        ((ArrayList) term49118).add((Object)null);
        ((ArrayList) term49118).add((Object)null);
        ((ArrayList) term49118).add((Object)null);
        ((ArrayList) term49118).add((Object)null);
        Object term49112 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term49112, term49112.getClass(), "parameters", term49113);
        setField(term49112, term49112.getClass(), "name", "");
        setField(term49112, term49112.getClass(), "type", "");
        setField(term49112, term49112.getClass(), "modifiers", term49118);
        ArrayList term49110 = new ArrayList();
        ((ArrayList) term49110).add(term49112);
        ArrayList term49147 = new ArrayList();
        ((ArrayList) term49147).add((Object)null);
        ((ArrayList) term49147).add((Object)null);
        term49039 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class$ClassBuilderImpl"));
        setField(term49039, term49039.getClass(), "modifiers", term49040);
        setField(term49039, term49039.getClass(), "attributes", term49064);
        setField(term49039, term49039.getClass(), "methods", term49110);
        setField(term49039, term49039.getClass(), "id", "ouesGIsvuG");
        setField(term49039, term49039.getClass(), "name", "pHBHlmLIZQ");
        setField(term49039, term49039.getClass(), "relations", term49147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class$ClassBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "self", argTypes, term49039, args);
    }

};


