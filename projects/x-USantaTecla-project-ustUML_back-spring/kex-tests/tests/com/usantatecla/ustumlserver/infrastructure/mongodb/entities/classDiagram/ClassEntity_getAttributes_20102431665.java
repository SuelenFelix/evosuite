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

public class ClassEntity_getAttributes_20102431665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18670;

    public ClassEntity_getAttributes_20102431665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18776 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term18775 = ((Class) term18776).getDeclaredField((String) "PRIVATE");
        ((Field) term18775).setAccessible(true);
        Object enum48 =  ((Field) term18775).get((Object) null);
        Class<? extends Object> term19119 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term19118 = ((Class) term19119).getDeclaredField((String) "ABSTRACT");
        ((Field) term19118).setAccessible(true);
        Object enum49 =  ((Field) term19118).get((Object) null);
        ArrayList term18671 = new ArrayList();
        ((ArrayList) term18671).add(enum48);
        ((ArrayList) term18671).add(enum49);
        ArrayList term18685 = new ArrayList();
        ArrayList term18694 = new ArrayList();
        ((ArrayList) term18694).add((Object)null);
        ArrayList term18697 = new ArrayList();
        ((ArrayList) term18697).add((Object)null);
        ((ArrayList) term18697).add((Object)null);
        Object term18691 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term18691, term18691.getClass(), "name", "");
        setField(term18691, term18691.getClass(), "type", "");
        setField(term18691, term18691.getClass(), "modifiers", term18694);
        setField(term18691, term18691.getClass(), "parametersEntities", term18697);
        ArrayList term18703 = new ArrayList();
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        ((ArrayList) term18703).add((Object)null);
        ArrayList term18706 = new ArrayList();
        ((ArrayList) term18706).add((Object)null);
        ((ArrayList) term18706).add((Object)null);
        ((ArrayList) term18706).add((Object)null);
        ((ArrayList) term18706).add((Object)null);
        Object term18700 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term18700, term18700.getClass(), "name", "");
        setField(term18700, term18700.getClass(), "type", "");
        setField(term18700, term18700.getClass(), "modifiers", term18703);
        setField(term18700, term18700.getClass(), "parametersEntities", term18706);
        ArrayList term18712 = new ArrayList();
        ((ArrayList) term18712).add((Object)null);
        ((ArrayList) term18712).add((Object)null);
        ((ArrayList) term18712).add((Object)null);
        ((ArrayList) term18712).add((Object)null);
        ((ArrayList) term18712).add((Object)null);
        ((ArrayList) term18712).add((Object)null);
        ((ArrayList) term18712).add((Object)null);
        ((ArrayList) term18712).add((Object)null);
        ArrayList term18715 = new ArrayList();
        ((ArrayList) term18715).add((Object)null);
        ((ArrayList) term18715).add((Object)null);
        ((ArrayList) term18715).add((Object)null);
        ((ArrayList) term18715).add((Object)null);
        ((ArrayList) term18715).add((Object)null);
        ((ArrayList) term18715).add((Object)null);
        ((ArrayList) term18715).add((Object)null);
        Object term18709 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term18709, term18709.getClass(), "name", "");
        setField(term18709, term18709.getClass(), "type", "");
        setField(term18709, term18709.getClass(), "modifiers", term18712);
        setField(term18709, term18709.getClass(), "parametersEntities", term18715);
        ArrayList term18721 = new ArrayList();
        ((ArrayList) term18721).add((Object)null);
        ((ArrayList) term18721).add((Object)null);
        ((ArrayList) term18721).add((Object)null);
        ((ArrayList) term18721).add((Object)null);
        ((ArrayList) term18721).add((Object)null);
        ArrayList term18724 = new ArrayList();
        ((ArrayList) term18724).add((Object)null);
        ((ArrayList) term18724).add((Object)null);
        ((ArrayList) term18724).add((Object)null);
        ((ArrayList) term18724).add((Object)null);
        ((ArrayList) term18724).add((Object)null);
        Object term18718 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term18718, term18718.getClass(), "name", "");
        setField(term18718, term18718.getClass(), "type", "");
        setField(term18718, term18718.getClass(), "modifiers", term18721);
        setField(term18718, term18718.getClass(), "parametersEntities", term18724);
        ArrayList term18730 = new ArrayList();
        ((ArrayList) term18730).add((Object)null);
        ((ArrayList) term18730).add((Object)null);
        ArrayList term18733 = new ArrayList();
        Object term18727 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term18727, term18727.getClass(), "name", "");
        setField(term18727, term18727.getClass(), "type", "");
        setField(term18727, term18727.getClass(), "modifiers", term18730);
        setField(term18727, term18727.getClass(), "parametersEntities", term18733);
        ArrayList term18739 = new ArrayList();
        ((ArrayList) term18739).add((Object)null);
        ((ArrayList) term18739).add((Object)null);
        ((ArrayList) term18739).add((Object)null);
        ((ArrayList) term18739).add((Object)null);
        ((ArrayList) term18739).add((Object)null);
        ((ArrayList) term18739).add((Object)null);
        ((ArrayList) term18739).add((Object)null);
        ArrayList term18742 = new ArrayList();
        ((ArrayList) term18742).add((Object)null);
        ((ArrayList) term18742).add((Object)null);
        Object term18736 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term18736, term18736.getClass(), "name", "");
        setField(term18736, term18736.getClass(), "type", "");
        setField(term18736, term18736.getClass(), "modifiers", term18739);
        setField(term18736, term18736.getClass(), "parametersEntities", term18742);
        ArrayList term18689 = new ArrayList();
        ((ArrayList) term18689).add(term18691);
        ((ArrayList) term18689).add(term18700);
        ((ArrayList) term18689).add(term18709);
        ((ArrayList) term18689).add(term18718);
        ((ArrayList) term18689).add(term18727);
        ((ArrayList) term18689).add(term18736);
        ArrayList term18771 = new ArrayList();
        term18670 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity"));
        setField(term18670, term18670.getClass(), "modifiers", term18671);
        setField(term18670, term18670.getClass(), "attributesEntities", term18685);
        setField(term18670, term18670.getClass(), "methodsEntities", term18689);
        setField(term18670, term18670.getClass(), "id", "rIPMBcrNqB");
        setField(term18670, term18670.getClass(), "name", "UDaboHZHhz");
        setField(term18670, term18670.getClass(), "relationEntities", term18771);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ClassEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttributes", argTypes, term18670, args);
    }

};


