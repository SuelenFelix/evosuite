package com.usantatecla.ustumlserver.domain.model.generators;

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
import static com.usantatecla.ustumlserver.domain.model.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class PlantUMLGenerator_getClassHeader_7442417404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5209;
     Object term5211;

    public PlantUMLGenerator_getClassHeader_7442417404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5209 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator"));
        setField(term5209, term5209.getClass(), "withMembersMember", null);
        setField(term5209, term5209.getClass(), "origin", null);
        setIntField(term5209, term5209.getClass(), "depthLevel", 391863371);
        Class<? extends Object> term5325 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term5324 = ((Class) term5325).getDeclaredField((String) "PRIVATE");
        ((Field) term5324).setAccessible(true);
        Object enum12 =  ((Field) term5324).get((Object) null);
        Class<? extends Object> term5668 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term5667 = ((Class) term5668).getDeclaredField((String) "PUBLIC");
        ((Field) term5667).setAccessible(true);
        Object enum13 =  ((Field) term5667).get((Object) null);
        Class<? extends Object> term6008 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term6007 = ((Class) term6008).getDeclaredField((String) "NULL");
        ((Field) term6007).setAccessible(true);
        Object enum14 =  ((Field) term6007).get((Object) null);
        Class<? extends Object> term6342 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term6341 = ((Class) term6342).getDeclaredField((String) "NULL");
        ((Field) term6341).setAccessible(true);
        Object enum15 =  ((Field) term6341).get((Object) null);
        ArrayList term5212 = new ArrayList();
        ((ArrayList) term5212).add(enum12);
        ((ArrayList) term5212).add(enum13);
        ((ArrayList) term5212).add(enum13);
        ((ArrayList) term5212).add(enum14);
        ((ArrayList) term5212).add(enum15);
        ((ArrayList) term5212).add(enum13);
        ArrayList term5234 = new ArrayList();
        ArrayList term5241 = new ArrayList();
        ((ArrayList) term5241).add((Object)null);
        ((ArrayList) term5241).add((Object)null);
        ((ArrayList) term5241).add((Object)null);
        ((ArrayList) term5241).add((Object)null);
        ((ArrayList) term5241).add((Object)null);
        ArrayList term5246 = new ArrayList();
        ((ArrayList) term5246).add((Object)null);
        Object term5240 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term5240, term5240.getClass(), "parameters", term5241);
        setField(term5240, term5240.getClass(), "name", "");
        setField(term5240, term5240.getClass(), "type", "");
        setField(term5240, term5240.getClass(), "modifiers", term5246);
        ArrayList term5250 = new ArrayList();
        ArrayList term5255 = new ArrayList();
        ((ArrayList) term5255).add((Object)null);
        ((ArrayList) term5255).add((Object)null);
        ((ArrayList) term5255).add((Object)null);
        ((ArrayList) term5255).add((Object)null);
        ((ArrayList) term5255).add((Object)null);
        ((ArrayList) term5255).add((Object)null);
        Object term5249 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term5249, term5249.getClass(), "parameters", term5250);
        setField(term5249, term5249.getClass(), "name", "");
        setField(term5249, term5249.getClass(), "type", "");
        setField(term5249, term5249.getClass(), "modifiers", term5255);
        ArrayList term5259 = new ArrayList();
        ((ArrayList) term5259).add((Object)null);
        ((ArrayList) term5259).add((Object)null);
        ((ArrayList) term5259).add((Object)null);
        ((ArrayList) term5259).add((Object)null);
        ((ArrayList) term5259).add((Object)null);
        ArrayList term5264 = new ArrayList();
        ((ArrayList) term5264).add((Object)null);
        Object term5258 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term5258, term5258.getClass(), "parameters", term5259);
        setField(term5258, term5258.getClass(), "name", "");
        setField(term5258, term5258.getClass(), "type", "");
        setField(term5258, term5258.getClass(), "modifiers", term5264);
        ArrayList term5268 = new ArrayList();
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ((ArrayList) term5268).add((Object)null);
        ArrayList term5273 = new ArrayList();
        ((ArrayList) term5273).add((Object)null);
        Object term5267 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term5267, term5267.getClass(), "parameters", term5268);
        setField(term5267, term5267.getClass(), "name", "");
        setField(term5267, term5267.getClass(), "type", "");
        setField(term5267, term5267.getClass(), "modifiers", term5273);
        ArrayList term5277 = new ArrayList();
        ((ArrayList) term5277).add((Object)null);
        ArrayList term5282 = new ArrayList();
        ((ArrayList) term5282).add((Object)null);
        ((ArrayList) term5282).add((Object)null);
        ((ArrayList) term5282).add((Object)null);
        ((ArrayList) term5282).add((Object)null);
        ((ArrayList) term5282).add((Object)null);
        ((ArrayList) term5282).add((Object)null);
        Object term5276 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term5276, term5276.getClass(), "parameters", term5277);
        setField(term5276, term5276.getClass(), "name", "");
        setField(term5276, term5276.getClass(), "type", "");
        setField(term5276, term5276.getClass(), "modifiers", term5282);
        ArrayList term5286 = new ArrayList();
        ((ArrayList) term5286).add((Object)null);
        ((ArrayList) term5286).add((Object)null);
        ((ArrayList) term5286).add((Object)null);
        ((ArrayList) term5286).add((Object)null);
        ((ArrayList) term5286).add((Object)null);
        ((ArrayList) term5286).add((Object)null);
        ((ArrayList) term5286).add((Object)null);
        ArrayList term5291 = new ArrayList();
        Object term5285 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term5285, term5285.getClass(), "parameters", term5286);
        setField(term5285, term5285.getClass(), "name", "");
        setField(term5285, term5285.getClass(), "type", "");
        setField(term5285, term5285.getClass(), "modifiers", term5291);
        ArrayList term5238 = new ArrayList();
        ((ArrayList) term5238).add(term5240);
        ((ArrayList) term5238).add(term5249);
        ((ArrayList) term5238).add(term5258);
        ((ArrayList) term5238).add(term5267);
        ((ArrayList) term5238).add(term5276);
        ((ArrayList) term5238).add(term5285);
        ArrayList term5320 = new ArrayList();
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        ((ArrayList) term5320).add((Object)null);
        term5211 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term5211, term5211.getClass(), "modifiers", term5212);
        setField(term5211, term5211.getClass(), "attributes", term5234);
        setField(term5211, term5211.getClass(), "methods", term5238);
        setField(term5211, term5211.getClass(), "id", "VYkqXKVlAJ");
        setField(term5211, term5211.getClass(), "name", "XkIoWJRNwN");
        setField(term5211, term5211.getClass(), "relations", term5320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Object[] args = new Object[1];
        args[0] = term5211;
        callMethod(klass, "getClassHeader", argTypes, term5209, args);
    }

};


