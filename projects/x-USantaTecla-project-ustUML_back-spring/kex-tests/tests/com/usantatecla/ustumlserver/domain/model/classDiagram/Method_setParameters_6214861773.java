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
import java.lang.Object;
import java.lang.String;
import java.util.LinkedList;

public class Method_setParameters_6214861773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38000;
     Object term38073;

    public Method_setParameters_6214861773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38003 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term38003, term38003.getClass(), "name", "");
        setField(term38003, term38003.getClass(), "type", "");
        Object term38006 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term38006, term38006.getClass(), "name", "");
        setField(term38006, term38006.getClass(), "type", "");
        Object term38009 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term38009, term38009.getClass(), "name", "");
        setField(term38009, term38009.getClass(), "type", "");
        Object term38012 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term38012, term38012.getClass(), "name", "");
        setField(term38012, term38012.getClass(), "type", "");
        Object term38015 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term38015, term38015.getClass(), "name", "");
        setField(term38015, term38015.getClass(), "type", "");
        ArrayList term38001 = new ArrayList();
        ((ArrayList) term38001).add(term38003);
        ((ArrayList) term38001).add(term38006);
        ((ArrayList) term38001).add(term38009);
        ((ArrayList) term38001).add(term38012);
        ((ArrayList) term38001).add(term38015);
        Class<? extends Object> term38123 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term38122 = ((Class) term38123).getDeclaredField((String) "PRIVATE");
        ((Field) term38122).setAccessible(true);
        Object enum97 =  ((Field) term38122).get((Object) null);
        Class<? extends Object> term38466 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term38465 = ((Class) term38466).getDeclaredField((String) "ABSTRACT");
        ((Field) term38465).setAccessible(true);
        Object enum98 =  ((Field) term38465).get((Object) null);
        Class<? extends Object> term38812 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term38811 = ((Class) term38812).getDeclaredField((String) "ABSTRACT");
        ((Field) term38811).setAccessible(true);
        Object enum99 =  ((Field) term38811).get((Object) null);
        Class<? extends Object> term39158 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term39157 = ((Class) term39158).getDeclaredField((String) "FINAL");
        ((Field) term39157).setAccessible(true);
        Object enum100 =  ((Field) term39157).get((Object) null);
        Class<? extends Object> term39495 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term39494 = ((Class) term39495).getDeclaredField((String) "FINAL");
        ((Field) term39494).setAccessible(true);
        Object enum101 =  ((Field) term39494).get((Object) null);
        ArrayList term38044 = new ArrayList();
        ((ArrayList) term38044).add(enum97);
        ((ArrayList) term38044).add(enum98);
        ((ArrayList) term38044).add(enum99);
        ((ArrayList) term38044).add(enum98);
        ((ArrayList) term38044).add(enum98);
        ((ArrayList) term38044).add(enum100);
        ((ArrayList) term38044).add(enum98);
        ((ArrayList) term38044).add(enum101);
        term38000 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term38000, term38000.getClass(), "parameters", term38001);
        setField(term38000, term38000.getClass(), "name", "cjaaJUnNCR");
        setField(term38000, term38000.getClass(), "type", "ETbxNuJLii");
        setField(term38000, term38000.getClass(), "modifiers", term38044);
        Object term38076 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term38076, term38076.getClass(), "name", "YJhnPtWtJR");
        setField(term38076, term38076.getClass(), "type", "xzGnrvbExX");
        term38073 = new LinkedList();
        ((LinkedList) term38073).add(term38076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term38073;
        callMethod(klass, "setParameters", argTypes, term38000, args);
    }

};


