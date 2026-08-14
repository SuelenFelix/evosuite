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

public class ClassEntity_init_11892246980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14725;

    public ClassEntity_init_11892246980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14856 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term14855 = ((Class) term14856).getDeclaredField((String) "PRIVATE");
        ((Field) term14855).setAccessible(true);
        Object enum39 =  ((Field) term14855).get((Object) null);
        ArrayList term14726 = new ArrayList();
        ((ArrayList) term14726).add(enum39);
        ((ArrayList) term14726).add(enum39);
        ArrayList term14740 = new ArrayList();
        ((ArrayList) term14740).add((Object)null);
        Object term14737 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term14737, term14737.getClass(), "name", "");
        setField(term14737, term14737.getClass(), "type", "");
        setField(term14737, term14737.getClass(), "modifiers", term14740);
        ArrayList term14746 = new ArrayList();
        Object term14743 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term14743, term14743.getClass(), "name", "");
        setField(term14743, term14743.getClass(), "type", "");
        setField(term14743, term14743.getClass(), "modifiers", term14746);
        ArrayList term14735 = new ArrayList();
        ((ArrayList) term14735).add(term14737);
        ((ArrayList) term14735).add(term14743);
        ArrayList term14754 = new ArrayList();
        ArrayList term14759 = new ArrayList();
        Object term14753 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term14753, term14753.getClass(), "parameters", term14754);
        setField(term14753, term14753.getClass(), "name", "");
        setField(term14753, term14753.getClass(), "type", "");
        setField(term14753, term14753.getClass(), "modifiers", term14759);
        ArrayList term14763 = new ArrayList();
        ((ArrayList) term14763).add((Object)null);
        ArrayList term14768 = new ArrayList();
        ((ArrayList) term14768).add((Object)null);
        ((ArrayList) term14768).add((Object)null);
        ((ArrayList) term14768).add((Object)null);
        ((ArrayList) term14768).add((Object)null);
        ((ArrayList) term14768).add((Object)null);
        Object term14762 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term14762, term14762.getClass(), "parameters", term14763);
        setField(term14762, term14762.getClass(), "name", "");
        setField(term14762, term14762.getClass(), "type", "");
        setField(term14762, term14762.getClass(), "modifiers", term14768);
        ArrayList term14772 = new ArrayList();
        ((ArrayList) term14772).add((Object)null);
        ((ArrayList) term14772).add((Object)null);
        ((ArrayList) term14772).add((Object)null);
        ((ArrayList) term14772).add((Object)null);
        ArrayList term14777 = new ArrayList();
        ((ArrayList) term14777).add((Object)null);
        ((ArrayList) term14777).add((Object)null);
        ((ArrayList) term14777).add((Object)null);
        ((ArrayList) term14777).add((Object)null);
        Object term14771 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term14771, term14771.getClass(), "parameters", term14772);
        setField(term14771, term14771.getClass(), "name", "");
        setField(term14771, term14771.getClass(), "type", "");
        setField(term14771, term14771.getClass(), "modifiers", term14777);
        ArrayList term14781 = new ArrayList();
        ArrayList term14786 = new ArrayList();
        ((ArrayList) term14786).add((Object)null);
        ((ArrayList) term14786).add((Object)null);
        ((ArrayList) term14786).add((Object)null);
        ((ArrayList) term14786).add((Object)null);
        ((ArrayList) term14786).add((Object)null);
        ((ArrayList) term14786).add((Object)null);
        ((ArrayList) term14786).add((Object)null);
        Object term14780 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term14780, term14780.getClass(), "parameters", term14781);
        setField(term14780, term14780.getClass(), "name", "");
        setField(term14780, term14780.getClass(), "type", "");
        setField(term14780, term14780.getClass(), "modifiers", term14786);
        ArrayList term14790 = new ArrayList();
        ((ArrayList) term14790).add((Object)null);
        ((ArrayList) term14790).add((Object)null);
        ArrayList term14795 = new ArrayList();
        ((ArrayList) term14795).add((Object)null);
        Object term14789 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term14789, term14789.getClass(), "parameters", term14790);
        setField(term14789, term14789.getClass(), "name", "");
        setField(term14789, term14789.getClass(), "type", "");
        setField(term14789, term14789.getClass(), "modifiers", term14795);
        ArrayList term14799 = new ArrayList();
        ((ArrayList) term14799).add((Object)null);
        ((ArrayList) term14799).add((Object)null);
        ((ArrayList) term14799).add((Object)null);
        ((ArrayList) term14799).add((Object)null);
        ((ArrayList) term14799).add((Object)null);
        ((ArrayList) term14799).add((Object)null);
        ArrayList term14804 = new ArrayList();
        ((ArrayList) term14804).add((Object)null);
        Object term14798 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term14798, term14798.getClass(), "parameters", term14799);
        setField(term14798, term14798.getClass(), "name", "");
        setField(term14798, term14798.getClass(), "type", "");
        setField(term14798, term14798.getClass(), "modifiers", term14804);
        ArrayList term14808 = new ArrayList();
        ((ArrayList) term14808).add((Object)null);
        ((ArrayList) term14808).add((Object)null);
        ((ArrayList) term14808).add((Object)null);
        ((ArrayList) term14808).add((Object)null);
        ((ArrayList) term14808).add((Object)null);
        ((ArrayList) term14808).add((Object)null);
        ((ArrayList) term14808).add((Object)null);
        ArrayList term14813 = new ArrayList();
        ((ArrayList) term14813).add((Object)null);
        ((ArrayList) term14813).add((Object)null);
        ((ArrayList) term14813).add((Object)null);
        ((ArrayList) term14813).add((Object)null);
        ((ArrayList) term14813).add((Object)null);
        ((ArrayList) term14813).add((Object)null);
        ((ArrayList) term14813).add((Object)null);
        Object term14807 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term14807, term14807.getClass(), "parameters", term14808);
        setField(term14807, term14807.getClass(), "name", "");
        setField(term14807, term14807.getClass(), "type", "");
        setField(term14807, term14807.getClass(), "modifiers", term14813);
        ArrayList term14817 = new ArrayList();
        ((ArrayList) term14817).add((Object)null);
        ArrayList term14822 = new ArrayList();
        ((ArrayList) term14822).add((Object)null);
        ((ArrayList) term14822).add((Object)null);
        ((ArrayList) term14822).add((Object)null);
        ((ArrayList) term14822).add((Object)null);
        ((ArrayList) term14822).add((Object)null);
        Object term14816 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term14816, term14816.getClass(), "parameters", term14817);
        setField(term14816, term14816.getClass(), "name", "");
        setField(term14816, term14816.getClass(), "type", "");
        setField(term14816, term14816.getClass(), "modifiers", term14822);
        ArrayList term14751 = new ArrayList();
        ((ArrayList) term14751).add(term14753);
        ((ArrayList) term14751).add(term14762);
        ((ArrayList) term14751).add(term14771);
        ((ArrayList) term14751).add(term14780);
        ((ArrayList) term14751).add(term14789);
        ((ArrayList) term14751).add(term14798);
        ((ArrayList) term14751).add(term14807);
        ((ArrayList) term14751).add(term14816);
        ArrayList term14851 = new ArrayList();
        ((ArrayList) term14851).add((Object)null);
        term14725 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term14725, term14725.getClass(), "modifiers", term14726);
        setField(term14725, term14725.getClass(), "attributes", term14735);
        setField(term14725, term14725.getClass(), "methods", term14751);
        setField(term14725, term14725.getClass(), "id", "idgaQsnJpQ");
        setField(term14725, term14725.getClass(), "name", "VgZnGoIFwQ");
        setField(term14725, term14725.getClass(), "relations", term14851);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Object[] args = new Object[1];
        args[0] = term14725;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


