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

public class Enum_equals_45445930514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76727;
     Object term76920;

    public Enum_equals_45445930514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term76728 = new ArrayList();
        ((ArrayList) term76728).add("SOJpgWUZCf");
        ((ArrayList) term76728).add("jgywFOzBDw");
        ((ArrayList) term76728).add("yKIXLtCWYi");
        ((ArrayList) term76728).add("EhuyRKrUJu");
        ((ArrayList) term76728).add("UlBxuoBXcJ");
        ((ArrayList) term76728).add("PqduvNFXXw");
        ((ArrayList) term76728).add("bMQrxvaBAI");
        ((ArrayList) term76728).add("StFtysZlWm");
        ((ArrayList) term76728).add("CoqUcmjnkF");
        Class<? extends Object> term77012 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term77011 = ((Class) term77012).getDeclaredField((String) "PUBLIC");
        ((Field) term77011).setAccessible(true);
        Object enum195 =  ((Field) term77011).get((Object) null);
        Class<? extends Object> term77352 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term77351 = ((Class) term77352).getDeclaredField((String) "PRIVATE");
        ((Field) term77351).setAccessible(true);
        Object enum196 =  ((Field) term77351).get((Object) null);
        Class<? extends Object> term77695 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term77694 = ((Class) term77695).getDeclaredField((String) "ABSTRACT");
        ((Field) term77694).setAccessible(true);
        Object enum197 =  ((Field) term77694).get((Object) null);
        Class<? extends Object> term78041 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term78040 = ((Class) term78041).getDeclaredField((String) "PRIVATE");
        ((Field) term78040).setAccessible(true);
        Object enum198 =  ((Field) term78040).get((Object) null);
        Class<? extends Object> term78384 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term78383 = ((Class) term78384).getDeclaredField((String) "PUBLIC");
        ((Field) term78383).setAccessible(true);
        Object enum199 =  ((Field) term78383).get((Object) null);
        Class<? extends Object> term78724 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term78723 = ((Class) term78724).getDeclaredField((String) "FINAL");
        ((Field) term78723).setAccessible(true);
        Object enum200 =  ((Field) term78723).get((Object) null);
        ArrayList term76840 = new ArrayList();
        ((ArrayList) term76840).add(enum195);
        ((ArrayList) term76840).add(enum195);
        ((ArrayList) term76840).add(enum196);
        ((ArrayList) term76840).add(enum197);
        ((ArrayList) term76840).add(enum198);
        ((ArrayList) term76840).add(enum199);
        ((ArrayList) term76840).add(enum200);
        ArrayList term76877 = new ArrayList();
        Object term76874 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term76874, term76874.getClass(), "name", "");
        setField(term76874, term76874.getClass(), "type", "");
        setField(term76874, term76874.getClass(), "modifiers", term76877);
        ArrayList term76883 = new ArrayList();
        ((ArrayList) term76883).add((Object)null);
        ((ArrayList) term76883).add((Object)null);
        ((ArrayList) term76883).add((Object)null);
        Object term76880 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term76880, term76880.getClass(), "name", "");
        setField(term76880, term76880.getClass(), "type", "");
        setField(term76880, term76880.getClass(), "modifiers", term76883);
        ArrayList term76872 = new ArrayList();
        ((ArrayList) term76872).add(term76874);
        ((ArrayList) term76872).add(term76880);
        ArrayList term76888 = new ArrayList();
        ArrayList term76916 = new ArrayList();
        ((ArrayList) term76916).add((Object)null);
        term76727 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term76727, term76727.getClass(), "objects", term76728);
        setField(term76727, term76727.getClass(), "modifiers", term76840);
        setField(term76727, term76727.getClass(), "attributes", term76872);
        setField(term76727, term76727.getClass(), "methods", term76888);
        setField(term76727, term76727.getClass(), "id", "zOxseYMSdY");
        setField(term76727, term76727.getClass(), "name", "jEKlkqpHMQ");
        setField(term76727, term76727.getClass(), "relations", term76916);
        term76920 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term76920;
        callMethod(klass, "equals", argTypes, term76727, args);
    }

};


