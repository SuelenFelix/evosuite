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

public class Enum_accept_5852883315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67807;

    public Enum_accept_5852883315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term67808 = new ArrayList();
        ((ArrayList) term67808).add("qrmUWIxufo");
        ((ArrayList) term67808).add("SeWCUkXfZv");
        ((ArrayList) term67808).add("woQcQRYwNH");
        ((ArrayList) term67808).add("uQjzusifTg");
        ((ArrayList) term67808).add("mOulGkUjOk");
        ((ArrayList) term67808).add("hNWRuNEgOf");
        Class<? extends Object> term68031 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term68030 = ((Class) term68031).getDeclaredField((String) "PRIVATE");
        ((Field) term68030).setAccessible(true);
        Object enum174 =  ((Field) term68030).get((Object) null);
        Class<? extends Object> term68374 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term68373 = ((Class) term68374).getDeclaredField((String) "ABSTRACT");
        ((Field) term68373).setAccessible(true);
        Object enum175 =  ((Field) term68373).get((Object) null);
        ArrayList term67884 = new ArrayList();
        ((ArrayList) term67884).add(enum174);
        ((ArrayList) term67884).add(enum175);
        ArrayList term67903 = new ArrayList();
        Object term67900 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term67900, term67900.getClass(), "name", "");
        setField(term67900, term67900.getClass(), "type", "");
        setField(term67900, term67900.getClass(), "modifiers", term67903);
        ArrayList term67909 = new ArrayList();
        ((ArrayList) term67909).add((Object)null);
        ((ArrayList) term67909).add((Object)null);
        ((ArrayList) term67909).add((Object)null);
        ((ArrayList) term67909).add((Object)null);
        ((ArrayList) term67909).add((Object)null);
        ((ArrayList) term67909).add((Object)null);
        ((ArrayList) term67909).add((Object)null);
        ((ArrayList) term67909).add((Object)null);
        Object term67906 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term67906, term67906.getClass(), "name", "");
        setField(term67906, term67906.getClass(), "type", "");
        setField(term67906, term67906.getClass(), "modifiers", term67909);
        ArrayList term67915 = new ArrayList();
        ((ArrayList) term67915).add((Object)null);
        ((ArrayList) term67915).add((Object)null);
        ((ArrayList) term67915).add((Object)null);
        ((ArrayList) term67915).add((Object)null);
        Object term67912 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term67912, term67912.getClass(), "name", "");
        setField(term67912, term67912.getClass(), "type", "");
        setField(term67912, term67912.getClass(), "modifiers", term67915);
        ArrayList term67921 = new ArrayList();
        ((ArrayList) term67921).add((Object)null);
        ((ArrayList) term67921).add((Object)null);
        Object term67918 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term67918, term67918.getClass(), "name", "");
        setField(term67918, term67918.getClass(), "type", "");
        setField(term67918, term67918.getClass(), "modifiers", term67921);
        ArrayList term67927 = new ArrayList();
        ((ArrayList) term67927).add((Object)null);
        ((ArrayList) term67927).add((Object)null);
        ((ArrayList) term67927).add((Object)null);
        ((ArrayList) term67927).add((Object)null);
        ((ArrayList) term67927).add((Object)null);
        Object term67924 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term67924, term67924.getClass(), "name", "");
        setField(term67924, term67924.getClass(), "type", "");
        setField(term67924, term67924.getClass(), "modifiers", term67927);
        ArrayList term67933 = new ArrayList();
        ((ArrayList) term67933).add((Object)null);
        ((ArrayList) term67933).add((Object)null);
        ((ArrayList) term67933).add((Object)null);
        ((ArrayList) term67933).add((Object)null);
        ((ArrayList) term67933).add((Object)null);
        Object term67930 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term67930, term67930.getClass(), "name", "");
        setField(term67930, term67930.getClass(), "type", "");
        setField(term67930, term67930.getClass(), "modifiers", term67933);
        ArrayList term67898 = new ArrayList();
        ((ArrayList) term67898).add(term67900);
        ((ArrayList) term67898).add(term67906);
        ((ArrayList) term67898).add(term67912);
        ((ArrayList) term67898).add(term67918);
        ((ArrayList) term67898).add(term67924);
        ((ArrayList) term67898).add(term67930);
        ArrayList term67938 = new ArrayList();
        ArrayList term67966 = new ArrayList();
        ((ArrayList) term67966).add((Object)null);
        ((ArrayList) term67966).add((Object)null);
        ((ArrayList) term67966).add((Object)null);
        ((ArrayList) term67966).add((Object)null);
        ((ArrayList) term67966).add((Object)null);
        term67807 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term67807, term67807.getClass(), "objects", term67808);
        setField(term67807, term67807.getClass(), "modifiers", term67884);
        setField(term67807, term67807.getClass(), "attributes", term67898);
        setField(term67807, term67807.getClass(), "methods", term67938);
        setField(term67807, term67807.getClass(), "id", "vHxsVQImjS");
        setField(term67807, term67807.getClass(), "name", "jkVaRrZHQX");
        setField(term67807, term67807.getClass(), "relations", term67966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.Generator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accept", argTypes, term67807, args);
    }

};


