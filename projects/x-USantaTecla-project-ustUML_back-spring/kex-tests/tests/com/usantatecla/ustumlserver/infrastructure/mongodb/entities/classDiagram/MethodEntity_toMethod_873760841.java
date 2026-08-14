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

public class MethodEntity_toMethod_873760841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35695;

    public MethodEntity_toMethod_873760841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35789 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term35788 = ((Class) term35789).getDeclaredField((String) "PROTECTED");
        ((Field) term35788).setAccessible(true);
        Object enum92 =  ((Field) term35788).get((Object) null);
        Class<? extends Object> term36138 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term36137 = ((Class) term36138).getDeclaredField((String) "PACKAGE");
        ((Field) term36137).setAccessible(true);
        Object enum93 =  ((Field) term36137).get((Object) null);
        Class<? extends Object> term36481 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term36480 = ((Class) term36481).getDeclaredField((String) "PACKAGE");
        ((Field) term36480).setAccessible(true);
        Object enum94 =  ((Field) term36480).get((Object) null);
        Class<? extends Object> term36824 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term36823 = ((Class) term36824).getDeclaredField((String) "ABSTRACT");
        ((Field) term36823).setAccessible(true);
        Object enum95 =  ((Field) term36823).get((Object) null);
        Class<? extends Object> term37170 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term37169 = ((Class) term37170).getDeclaredField((String) "PROTECTED");
        ((Field) term37169).setAccessible(true);
        Object enum96 =  ((Field) term37169).get((Object) null);
        Class<? extends Object> term37519 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term37518 = ((Class) term37519).getDeclaredField((String) "PRIVATE");
        ((Field) term37518).setAccessible(true);
        Object enum97 =  ((Field) term37518).get((Object) null);
        ArrayList term35720 = new ArrayList();
        ((ArrayList) term35720).add(enum92);
        ((ArrayList) term35720).add(enum93);
        ((ArrayList) term35720).add(enum94);
        ((ArrayList) term35720).add(enum95);
        ((ArrayList) term35720).add(enum96);
        ((ArrayList) term35720).add(enum97);
        ((ArrayList) term35720).add(enum97);
        ((ArrayList) term35720).add(enum97);
        ((ArrayList) term35720).add(enum94);
        Object term35754 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term35754, term35754.getClass(), "name", "");
        setField(term35754, term35754.getClass(), "type", "");
        Object term35757 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term35757, term35757.getClass(), "name", "");
        setField(term35757, term35757.getClass(), "type", "");
        Object term35760 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term35760, term35760.getClass(), "name", "");
        setField(term35760, term35760.getClass(), "type", "");
        Object term35763 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term35763, term35763.getClass(), "name", "");
        setField(term35763, term35763.getClass(), "type", "");
        ArrayList term35752 = new ArrayList();
        ((ArrayList) term35752).add(term35754);
        ((ArrayList) term35752).add(term35757);
        ((ArrayList) term35752).add(term35760);
        ((ArrayList) term35752).add(term35763);
        term35695 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term35695, term35695.getClass(), "name", "uOJFOUcNvv");
        setField(term35695, term35695.getClass(), "type", "tkmmGweDwJ");
        setField(term35695, term35695.getClass(), "modifiers", term35720);
        setField(term35695, term35695.getClass(), "parametersEntities", term35752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toMethod", argTypes, term35695, args);
    }

};


