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

public class UstUMLGenerator_getUML_151632155912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17432;
     Object term17434;

    public UstUMLGenerator_getUML_151632155912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17432 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator"));
        setIntField(term17432, term17432.getClass(), "depthLevel", -1007160944);
        Object term17437 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term17437, term17437.getClass(), "name", "");
        setField(term17437, term17437.getClass(), "type", "");
        Object term17440 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term17440, term17440.getClass(), "name", "");
        setField(term17440, term17440.getClass(), "type", "");
        Object term17443 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term17443, term17443.getClass(), "name", "");
        setField(term17443, term17443.getClass(), "type", "");
        Object term17446 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term17446, term17446.getClass(), "name", "");
        setField(term17446, term17446.getClass(), "type", "");
        Object term17449 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term17449, term17449.getClass(), "name", "");
        setField(term17449, term17449.getClass(), "type", "");
        Object term17452 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term17452, term17452.getClass(), "name", "");
        setField(term17452, term17452.getClass(), "type", "");
        Object term17455 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term17455, term17455.getClass(), "name", "");
        setField(term17455, term17455.getClass(), "type", "");
        ArrayList term17435 = new ArrayList();
        ((ArrayList) term17435).add(term17437);
        ((ArrayList) term17435).add(term17440);
        ((ArrayList) term17435).add(term17443);
        ((ArrayList) term17435).add(term17446);
        ((ArrayList) term17435).add(term17449);
        ((ArrayList) term17435).add(term17452);
        ((ArrayList) term17435).add(term17455);
        Class<? extends Object> term17527 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term17526 = ((Class) term17527).getDeclaredField((String) "PRIVATE");
        ((Field) term17526).setAccessible(true);
        Object enum43 =  ((Field) term17526).get((Object) null);
        Class<? extends Object> term17870 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term17869 = ((Class) term17870).getDeclaredField((String) "PACKAGE");
        ((Field) term17869).setAccessible(true);
        Object enum44 =  ((Field) term17869).get((Object) null);
        Class<? extends Object> term18213 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term18212 = ((Class) term18213).getDeclaredField((String) "PACKAGE");
        ((Field) term18212).setAccessible(true);
        Object enum45 =  ((Field) term18212).get((Object) null);
        Class<? extends Object> term18556 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term18555 = ((Class) term18556).getDeclaredField((String) "PRIVATE");
        ((Field) term18555).setAccessible(true);
        Object enum46 =  ((Field) term18555).get((Object) null);
        ArrayList term17484 = new ArrayList();
        ((ArrayList) term17484).add(enum43);
        ((ArrayList) term17484).add(enum44);
        ((ArrayList) term17484).add(enum43);
        ((ArrayList) term17484).add(enum45);
        ((ArrayList) term17484).add(enum46);
        ((ArrayList) term17484).add(enum46);
        ((ArrayList) term17484).add(enum43);
        ((ArrayList) term17484).add(enum46);
        term17434 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term17434, term17434.getClass(), "parameters", term17435);
        setField(term17434, term17434.getClass(), "name", "PqywFWJlpE");
        setField(term17434, term17434.getClass(), "type", "OzXRsFGTIp");
        setField(term17434, term17434.getClass(), "modifiers", term17484);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method");
        Object[] args = new Object[1];
        args[0] = term17434;
        callMethod(klass, "getUML", argTypes, term17432, args);
    }

};


