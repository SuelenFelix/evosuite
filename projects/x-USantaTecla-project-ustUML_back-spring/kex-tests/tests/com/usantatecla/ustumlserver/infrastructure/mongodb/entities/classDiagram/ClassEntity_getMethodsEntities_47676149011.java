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

public class ClassEntity_getMethodsEntities_47676149011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23697;

    public ClassEntity_getMethodsEntities_47676149011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23781 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term23780 = ((Class) term23781).getDeclaredField((String) "PRIVATE");
        ((Field) term23780).setAccessible(true);
        Object enum61 =  ((Field) term23780).get((Object) null);
        Class<? extends Object> term24124 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term24123 = ((Class) term24124).getDeclaredField((String) "PRIVATE");
        ((Field) term24123).setAccessible(true);
        Object enum62 =  ((Field) term24123).get((Object) null);
        Class<? extends Object> term24467 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term24466 = ((Class) term24467).getDeclaredField((String) "NULL");
        ((Field) term24466).setAccessible(true);
        Object enum63 =  ((Field) term24466).get((Object) null);
        Class<? extends Object> term24801 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term24800 = ((Class) term24801).getDeclaredField((String) "FINAL");
        ((Field) term24800).setAccessible(true);
        Object enum64 =  ((Field) term24800).get((Object) null);
        ArrayList term23698 = new ArrayList();
        ((ArrayList) term23698).add(enum61);
        ((ArrayList) term23698).add(enum62);
        ((ArrayList) term23698).add(enum63);
        ((ArrayList) term23698).add(enum62);
        ((ArrayList) term23698).add(enum64);
        ((ArrayList) term23698).add(enum62);
        ArrayList term23725 = new ArrayList();
        ((ArrayList) term23725).add((Object)null);
        ((ArrayList) term23725).add((Object)null);
        ((ArrayList) term23725).add((Object)null);
        ((ArrayList) term23725).add((Object)null);
        ((ArrayList) term23725).add((Object)null);
        ((ArrayList) term23725).add((Object)null);
        Object term23722 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term23722, term23722.getClass(), "name", "");
        setField(term23722, term23722.getClass(), "type", "");
        setField(term23722, term23722.getClass(), "modifiers", term23725);
        ArrayList term23731 = new ArrayList();
        ((ArrayList) term23731).add((Object)null);
        ((ArrayList) term23731).add((Object)null);
        ((ArrayList) term23731).add((Object)null);
        Object term23728 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term23728, term23728.getClass(), "name", "");
        setField(term23728, term23728.getClass(), "type", "");
        setField(term23728, term23728.getClass(), "modifiers", term23731);
        ArrayList term23737 = new ArrayList();
        ((ArrayList) term23737).add((Object)null);
        ((ArrayList) term23737).add((Object)null);
        ((ArrayList) term23737).add((Object)null);
        ((ArrayList) term23737).add((Object)null);
        ((ArrayList) term23737).add((Object)null);
        ((ArrayList) term23737).add((Object)null);
        Object term23734 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term23734, term23734.getClass(), "name", "");
        setField(term23734, term23734.getClass(), "type", "");
        setField(term23734, term23734.getClass(), "modifiers", term23737);
        ArrayList term23743 = new ArrayList();
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        Object term23740 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term23740, term23740.getClass(), "name", "");
        setField(term23740, term23740.getClass(), "type", "");
        setField(term23740, term23740.getClass(), "modifiers", term23743);
        ArrayList term23720 = new ArrayList();
        ((ArrayList) term23720).add(term23722);
        ((ArrayList) term23720).add(term23728);
        ((ArrayList) term23720).add(term23734);
        ((ArrayList) term23720).add(term23740);
        ArrayList term23748 = new ArrayList();
        ArrayList term23776 = new ArrayList();
        term23697 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity"));
        setField(term23697, term23697.getClass(), "modifiers", term23698);
        setField(term23697, term23697.getClass(), "attributesEntities", term23720);
        setField(term23697, term23697.getClass(), "methodsEntities", term23748);
        setField(term23697, term23697.getClass(), "id", "dwlZSxlXOo");
        setField(term23697, term23697.getClass(), "name", "lKrEAkypza");
        setField(term23697, term23697.getClass(), "relationEntities", term23776);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMethodsEntities", argTypes, term23697, args);
    }

};


