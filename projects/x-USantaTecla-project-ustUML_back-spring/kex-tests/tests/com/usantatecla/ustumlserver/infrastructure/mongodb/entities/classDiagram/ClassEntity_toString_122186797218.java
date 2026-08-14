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

public class ClassEntity_toString_122186797218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33275;

    public ClassEntity_toString_122186797218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33364 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term33363 = ((Class) term33364).getDeclaredField((String) "STATIC");
        ((Field) term33363).setAccessible(true);
        Object enum86 =  ((Field) term33363).get((Object) null);
        ArrayList term33276 = new ArrayList();
        ((ArrayList) term33276).add(enum86);
        ArrayList term33290 = new ArrayList();
        ((ArrayList) term33290).add((Object)null);
        ((ArrayList) term33290).add((Object)null);
        Object term33287 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term33287, term33287.getClass(), "name", "");
        setField(term33287, term33287.getClass(), "type", "");
        setField(term33287, term33287.getClass(), "modifiers", term33290);
        ArrayList term33296 = new ArrayList();
        Object term33293 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term33293, term33293.getClass(), "name", "");
        setField(term33293, term33293.getClass(), "type", "");
        setField(term33293, term33293.getClass(), "modifiers", term33296);
        ArrayList term33302 = new ArrayList();
        ((ArrayList) term33302).add((Object)null);
        ((ArrayList) term33302).add((Object)null);
        ((ArrayList) term33302).add((Object)null);
        ((ArrayList) term33302).add((Object)null);
        ((ArrayList) term33302).add((Object)null);
        Object term33299 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term33299, term33299.getClass(), "name", "");
        setField(term33299, term33299.getClass(), "type", "");
        setField(term33299, term33299.getClass(), "modifiers", term33302);
        ArrayList term33308 = new ArrayList();
        ((ArrayList) term33308).add((Object)null);
        ((ArrayList) term33308).add((Object)null);
        ((ArrayList) term33308).add((Object)null);
        ((ArrayList) term33308).add((Object)null);
        ((ArrayList) term33308).add((Object)null);
        ((ArrayList) term33308).add((Object)null);
        Object term33305 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term33305, term33305.getClass(), "name", "");
        setField(term33305, term33305.getClass(), "type", "");
        setField(term33305, term33305.getClass(), "modifiers", term33308);
        ArrayList term33285 = new ArrayList();
        ((ArrayList) term33285).add(term33287);
        ((ArrayList) term33285).add(term33293);
        ((ArrayList) term33285).add(term33299);
        ((ArrayList) term33285).add(term33305);
        ArrayList term33318 = new ArrayList();
        ((ArrayList) term33318).add((Object)null);
        ArrayList term33321 = new ArrayList();
        Object term33315 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term33315, term33315.getClass(), "name", "");
        setField(term33315, term33315.getClass(), "type", "");
        setField(term33315, term33315.getClass(), "modifiers", term33318);
        setField(term33315, term33315.getClass(), "parametersEntities", term33321);
        ArrayList term33327 = new ArrayList();
        ((ArrayList) term33327).add((Object)null);
        ((ArrayList) term33327).add((Object)null);
        ((ArrayList) term33327).add((Object)null);
        ((ArrayList) term33327).add((Object)null);
        ((ArrayList) term33327).add((Object)null);
        ((ArrayList) term33327).add((Object)null);
        ((ArrayList) term33327).add((Object)null);
        ((ArrayList) term33327).add((Object)null);
        ArrayList term33330 = new ArrayList();
        ((ArrayList) term33330).add((Object)null);
        ((ArrayList) term33330).add((Object)null);
        ((ArrayList) term33330).add((Object)null);
        ((ArrayList) term33330).add((Object)null);
        Object term33324 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term33324, term33324.getClass(), "name", "");
        setField(term33324, term33324.getClass(), "type", "");
        setField(term33324, term33324.getClass(), "modifiers", term33327);
        setField(term33324, term33324.getClass(), "parametersEntities", term33330);
        ArrayList term33313 = new ArrayList();
        ((ArrayList) term33313).add(term33315);
        ((ArrayList) term33313).add(term33324);
        ArrayList term33359 = new ArrayList();
        ((ArrayList) term33359).add((Object)null);
        ((ArrayList) term33359).add((Object)null);
        ((ArrayList) term33359).add((Object)null);
        term33275 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity"));
        setField(term33275, term33275.getClass(), "modifiers", term33276);
        setField(term33275, term33275.getClass(), "attributesEntities", term33285);
        setField(term33275, term33275.getClass(), "methodsEntities", term33313);
        setField(term33275, term33275.getClass(), "id", "hPpFNeDBIb");
        setField(term33275, term33275.getClass(), "name", "DNOtiLPAIY");
        setField(term33275, term33275.getClass(), "relationEntities", term33359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term33275, args);
    }

};


