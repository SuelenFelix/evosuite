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
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class ClassEntity_init_32684409320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33723;
     Object term33759;
     Object term33801;

    public ClassEntity_init_32684409320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33852 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term33851 = ((Class) term33852).getDeclaredField((String) "FINAL");
        ((Field) term33851).setAccessible(true);
        Object enum87 =  ((Field) term33851).get((Object) null);
        Class<? extends Object> term34189 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term34188 = ((Class) term34189).getDeclaredField((String) "PROTECTED");
        ((Field) term34188).setAccessible(true);
        Object enum88 =  ((Field) term34188).get((Object) null);
        Class<? extends Object> term34538 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term34537 = ((Class) term34538).getDeclaredField((String) "PROTECTED");
        ((Field) term34537).setAccessible(true);
        Object enum89 =  ((Field) term34537).get((Object) null);
        term33723 = new LinkedList();
        ((LinkedList) term33723).add(enum87);
        ((LinkedList) term33723).add(enum88);
        ((LinkedList) term33723).add(enum89);
        ArrayList term33787 = new ArrayList();
        ((ArrayList) term33787).add((Object)null);
        Object term33762 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term33762, term33762.getClass(), "name", "FnEkAHBfyV");
        setField(term33762, term33762.getClass(), "type", "VfmNFpEuax");
        setField(term33762, term33762.getClass(), "modifiers", term33787);
        ArrayList term33795 = new ArrayList();
        ((ArrayList) term33795).add((Object)null);
        ((ArrayList) term33795).add((Object)null);
        ((ArrayList) term33795).add((Object)null);
        ((ArrayList) term33795).add((Object)null);
        ((ArrayList) term33795).add((Object)null);
        ((ArrayList) term33795).add((Object)null);
        ((ArrayList) term33795).add((Object)null);
        ((ArrayList) term33795).add((Object)null);
        Object term33792 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term33792, term33792.getClass(), "name", "");
        setField(term33792, term33792.getClass(), "type", "");
        setField(term33792, term33792.getClass(), "modifiers", term33795);
        Object term33799 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term33799, term33799.getClass(), "name", null);
        setField(term33799, term33799.getClass(), "type", null);
        setField(term33799, term33799.getClass(), "modifiers", null);
        term33759 = new LinkedList();
        ((LinkedList) term33759).add(term33762);
        ((LinkedList) term33759).add(term33792);
        ((LinkedList) term33759).add(term33799);
        ArrayList term33829 = new ArrayList();
        ArrayList term33833 = new ArrayList();
        ((ArrayList) term33833).add((Object)null);
        ((ArrayList) term33833).add((Object)null);
        ((ArrayList) term33833).add((Object)null);
        Object term33804 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term33804, term33804.getClass(), "name", "SvGTualQPa");
        setField(term33804, term33804.getClass(), "type", "mdxcgZwsaP");
        setField(term33804, term33804.getClass(), "modifiers", term33829);
        setField(term33804, term33804.getClass(), "parametersEntities", term33833);
        ArrayList term33841 = new ArrayList();
        ((ArrayList) term33841).add((Object)null);
        ((ArrayList) term33841).add((Object)null);
        ((ArrayList) term33841).add((Object)null);
        ((ArrayList) term33841).add((Object)null);
        ((ArrayList) term33841).add((Object)null);
        ArrayList term33844 = new ArrayList();
        ((ArrayList) term33844).add((Object)null);
        ((ArrayList) term33844).add((Object)null);
        ((ArrayList) term33844).add((Object)null);
        ((ArrayList) term33844).add((Object)null);
        ((ArrayList) term33844).add((Object)null);
        ((ArrayList) term33844).add((Object)null);
        ((ArrayList) term33844).add((Object)null);
        ((ArrayList) term33844).add((Object)null);
        Object term33838 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term33838, term33838.getClass(), "name", "");
        setField(term33838, term33838.getClass(), "type", "");
        setField(term33838, term33838.getClass(), "modifiers", term33841);
        setField(term33838, term33838.getClass(), "parametersEntities", term33844);
        Object term33848 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term33848, term33848.getClass(), "name", null);
        setField(term33848, term33848.getClass(), "type", null);
        setField(term33848, term33848.getClass(), "modifiers", null);
        setField(term33848, term33848.getClass(), "parametersEntities", null);
        term33801 = new LinkedList();
        ((LinkedList) term33801).add(term33804);
        ((LinkedList) term33801).add(term33838);
        ((LinkedList) term33801).add(term33848);
        ((LinkedList) term33801).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term33723;
        args[1] = term33759;
        args[2] = term33801;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


