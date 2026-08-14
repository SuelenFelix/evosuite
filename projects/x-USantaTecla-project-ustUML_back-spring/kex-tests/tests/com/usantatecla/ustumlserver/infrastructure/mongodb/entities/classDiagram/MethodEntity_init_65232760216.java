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

public class MethodEntity_init_65232760216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51616;
     Object term51671;

    public MethodEntity_init_65232760216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51727 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term51726 = ((Class) term51727).getDeclaredField((String) "PROTECTED");
        ((Field) term51726).setAccessible(true);
        Object enum135 =  ((Field) term51726).get((Object) null);
        Class<? extends Object> term52076 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term52075 = ((Class) term52076).getDeclaredField((String) "STATIC");
        ((Field) term52075).setAccessible(true);
        Object enum136 =  ((Field) term52075).get((Object) null);
        term51616 = new LinkedList();
        ((LinkedList) term51616).add(enum135);
        ((LinkedList) term51616).add(enum135);
        ((LinkedList) term51616).add(enum136);
        ((LinkedList) term51616).add((Object)null);
        ((LinkedList) term51616).add((Object)null);
        ((LinkedList) term51616).add((Object)null);
        ((LinkedList) term51616).add((Object)null);
        ((LinkedList) term51616).add((Object)null);
        ((LinkedList) term51616).add((Object)null);
        Object term51674 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term51674, term51674.getClass(), "name", "fuvdkDwBeH");
        setField(term51674, term51674.getClass(), "type", "NTefzwLPhx");
        Object term51700 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term51700, term51700.getClass(), "name", "");
        setField(term51700, term51700.getClass(), "type", "");
        Object term51704 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term51704, term51704.getClass(), "name", null);
        setField(term51704, term51704.getClass(), "type", null);
        term51671 = new LinkedList();
        ((LinkedList) term51671).add(term51674);
        ((LinkedList) term51671).add(term51700);
        ((LinkedList) term51671).add(term51704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("java.util.List");
        Object[] args = new Object[4];
        args[0] = "fufeuGfwpN";
        args[1] = "XJbkXbljvz";
        args[2] = term51616;
        args[3] = term51671;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


