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
import java.lang.Object;
import java.lang.String;

public class PlantUMLGenerator_getUML_197742113213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9942;
     Object term9944;

    public PlantUMLGenerator_getUML_197742113213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9942 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator"));
        setField(term9942, term9942.getClass(), "withMembersMember", null);
        setField(term9942, term9942.getClass(), "origin", null);
        setIntField(term9942, term9942.getClass(), "depthLevel", 1134449235);
        Object term9947 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term9947, term9947.getClass(), "name", "");
        setField(term9947, term9947.getClass(), "type", "");
        Object term9950 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term9950, term9950.getClass(), "name", "");
        setField(term9950, term9950.getClass(), "type", "");
        Object term9953 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term9953, term9953.getClass(), "name", "");
        setField(term9953, term9953.getClass(), "type", "");
        Object term9956 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term9956, term9956.getClass(), "name", "");
        setField(term9956, term9956.getClass(), "type", "");
        Object term9959 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term9959, term9959.getClass(), "name", "");
        setField(term9959, term9959.getClass(), "type", "");
        Object term9962 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term9962, term9962.getClass(), "name", "");
        setField(term9962, term9962.getClass(), "type", "");
        Object term9965 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term9965, term9965.getClass(), "name", "");
        setField(term9965, term9965.getClass(), "type", "");
        Object term9968 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term9968, term9968.getClass(), "name", "");
        setField(term9968, term9968.getClass(), "type", "");
        Object term9971 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term9971, term9971.getClass(), "name", "");
        setField(term9971, term9971.getClass(), "type", "");
        ArrayList term9945 = new ArrayList();
        ((ArrayList) term9945).add(term9947);
        ((ArrayList) term9945).add(term9950);
        ((ArrayList) term9945).add(term9953);
        ((ArrayList) term9945).add(term9956);
        ((ArrayList) term9945).add(term9959);
        ((ArrayList) term9945).add(term9962);
        ((ArrayList) term9945).add(term9965);
        ((ArrayList) term9945).add(term9968);
        ((ArrayList) term9945).add(term9971);
        Class<? extends Object> term10045 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term10044 = ((Class) term10045).getDeclaredField((String) "PROTECTED");
        ((Field) term10044).setAccessible(true);
        Object enum24 =  ((Field) term10044).get((Object) null);
        Class<? extends Object> term10394 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term10393 = ((Class) term10394).getDeclaredField((String) "NULL");
        ((Field) term10393).setAccessible(true);
        Object enum25 =  ((Field) term10393).get((Object) null);
        Class<? extends Object> term10728 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term10727 = ((Class) term10728).getDeclaredField((String) "PUBLIC");
        ((Field) term10727).setAccessible(true);
        Object enum26 =  ((Field) term10727).get((Object) null);
        Class<? extends Object> term11068 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term11067 = ((Class) term11068).getDeclaredField((String) "PUBLIC");
        ((Field) term11067).setAccessible(true);
        Object enum27 =  ((Field) term11067).get((Object) null);
        ArrayList term10000 = new ArrayList();
        ((ArrayList) term10000).add(enum24);
        ((ArrayList) term10000).add(enum24);
        ((ArrayList) term10000).add(enum25);
        ((ArrayList) term10000).add(enum26);
        ((ArrayList) term10000).add(enum27);
        ((ArrayList) term10000).add(enum27);
        term9944 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term9944, term9944.getClass(), "parameters", term9945);
        setField(term9944, term9944.getClass(), "name", "qYzsiuXOgS");
        setField(term9944, term9944.getClass(), "type", "bxrCBbrrct");
        setField(term9944, term9944.getClass(), "modifiers", term10000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.PlantUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method");
        Object[] args = new Object[1];
        args[0] = term9944;
        callMethod(klass, "getUML", argTypes, term9942, args);
    }

};


