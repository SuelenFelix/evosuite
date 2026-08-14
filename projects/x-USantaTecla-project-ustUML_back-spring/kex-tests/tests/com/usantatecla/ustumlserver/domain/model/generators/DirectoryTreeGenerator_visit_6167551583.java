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

public class DirectoryTreeGenerator_visit_6167551583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463;
     Object term464;

    public DirectoryTreeGenerator_visit_6167551583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term463 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.DirectoryTreeGenerator"));
        Class<? extends Object> term728 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term727 = ((Class) term728).getDeclaredField((String) "ABSTRACT");
        ((Field) term727).setAccessible(true);
        Object enum1 =  ((Field) term727).get((Object) null);
        Class<? extends Object> term1074 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term1073 = ((Class) term1074).getDeclaredField((String) "PRIVATE");
        ((Field) term1073).setAccessible(true);
        Object enum2 =  ((Field) term1073).get((Object) null);
        Class<? extends Object> term1417 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term1416 = ((Class) term1417).getDeclaredField((String) "PACKAGE");
        ((Field) term1416).setAccessible(true);
        Object enum3 =  ((Field) term1416).get((Object) null);
        ArrayList term465 = new ArrayList();
        ((ArrayList) term465).add(enum1);
        ((ArrayList) term465).add(enum2);
        ((ArrayList) term465).add(enum2);
        ((ArrayList) term465).add(enum3);
        ArrayList term489 = new ArrayList();
        ((ArrayList) term489).add((Object)null);
        ((ArrayList) term489).add((Object)null);
        ((ArrayList) term489).add((Object)null);
        ((ArrayList) term489).add((Object)null);
        ((ArrayList) term489).add((Object)null);
        ((ArrayList) term489).add((Object)null);
        Object term486 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term486, term486.getClass(), "name", "");
        setField(term486, term486.getClass(), "type", "");
        setField(term486, term486.getClass(), "modifiers", term489);
        ArrayList term484 = new ArrayList();
        ((ArrayList) term484).add(term486);
        ArrayList term497 = new ArrayList();
        ((ArrayList) term497).add((Object)null);
        ((ArrayList) term497).add((Object)null);
        ((ArrayList) term497).add((Object)null);
        ((ArrayList) term497).add((Object)null);
        ((ArrayList) term497).add((Object)null);
        ((ArrayList) term497).add((Object)null);
        ArrayList term502 = new ArrayList();
        ((ArrayList) term502).add((Object)null);
        ((ArrayList) term502).add((Object)null);
        ((ArrayList) term502).add((Object)null);
        ((ArrayList) term502).add((Object)null);
        ((ArrayList) term502).add((Object)null);
        ((ArrayList) term502).add((Object)null);
        ((ArrayList) term502).add((Object)null);
        Object term496 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term496, term496.getClass(), "parameters", term497);
        setField(term496, term496.getClass(), "name", "");
        setField(term496, term496.getClass(), "type", "");
        setField(term496, term496.getClass(), "modifiers", term502);
        ArrayList term506 = new ArrayList();
        ((ArrayList) term506).add((Object)null);
        ArrayList term511 = new ArrayList();
        ((ArrayList) term511).add((Object)null);
        ((ArrayList) term511).add((Object)null);
        ((ArrayList) term511).add((Object)null);
        ((ArrayList) term511).add((Object)null);
        ((ArrayList) term511).add((Object)null);
        ((ArrayList) term511).add((Object)null);
        Object term505 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term505, term505.getClass(), "parameters", term506);
        setField(term505, term505.getClass(), "name", "");
        setField(term505, term505.getClass(), "type", "");
        setField(term505, term505.getClass(), "modifiers", term511);
        ArrayList term494 = new ArrayList();
        ((ArrayList) term494).add(term496);
        ((ArrayList) term494).add(term505);
        ArrayList term540 = new ArrayList();
        ((ArrayList) term540).add((Object)null);
        ((ArrayList) term540).add((Object)null);
        ((ArrayList) term540).add((Object)null);
        ((ArrayList) term540).add((Object)null);
        ((ArrayList) term540).add((Object)null);
        term464 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term464, term464.getClass(), "modifiers", term465);
        setField(term464, term464.getClass(), "attributes", term484);
        setField(term464, term464.getClass(), "methods", term494);
        setField(term464, term464.getClass(), "id", "flxyYxBRtu");
        setField(term464, term464.getClass(), "name", "OclPbYPkcH");
        setField(term464, term464.getClass(), "relations", term540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.DirectoryTreeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Object[] args = new Object[1];
        args[0] = term464;
        callMethod(klass, "visit", argTypes, term463, args);
    }

};


