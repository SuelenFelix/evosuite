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
import java.lang.String;
import java.lang.Object;

public class Class_getPlantUml_137509678214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23459;

    public Class_getPlantUml_137509678214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23527 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term23526 = ((Class) term23527).getDeclaredField((String) "NULL");
        ((Field) term23526).setAccessible(true);
        Object enum59 =  ((Field) term23526).get((Object) null);
        Class<? extends Object> term23861 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term23860 = ((Class) term23861).getDeclaredField((String) "STATIC");
        ((Field) term23860).setAccessible(true);
        Object enum60 =  ((Field) term23860).get((Object) null);
        Class<? extends Object> term24201 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term24200 = ((Class) term24201).getDeclaredField((String) "PROTECTED");
        ((Field) term24200).setAccessible(true);
        Object enum61 =  ((Field) term24200).get((Object) null);
        Class<? extends Object> term24550 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term24549 = ((Class) term24550).getDeclaredField((String) "STATIC");
        ((Field) term24549).setAccessible(true);
        Object enum62 =  ((Field) term24549).get((Object) null);
        ArrayList term23460 = new ArrayList();
        ((ArrayList) term23460).add(enum59);
        ((ArrayList) term23460).add(enum60);
        ((ArrayList) term23460).add(enum59);
        ((ArrayList) term23460).add(enum60);
        ((ArrayList) term23460).add(enum59);
        ((ArrayList) term23460).add(enum61);
        ((ArrayList) term23460).add(enum62);
        ArrayList term23489 = new ArrayList();
        ((ArrayList) term23489).add((Object)null);
        ((ArrayList) term23489).add((Object)null);
        ((ArrayList) term23489).add((Object)null);
        Object term23486 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term23486, term23486.getClass(), "name", "");
        setField(term23486, term23486.getClass(), "type", "");
        setField(term23486, term23486.getClass(), "modifiers", term23489);
        ArrayList term23484 = new ArrayList();
        ((ArrayList) term23484).add(term23486);
        ArrayList term23494 = new ArrayList();
        ArrayList term23522 = new ArrayList();
        ((ArrayList) term23522).add((Object)null);
        term23459 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term23459, term23459.getClass(), "modifiers", term23460);
        setField(term23459, term23459.getClass(), "attributes", term23484);
        setField(term23459, term23459.getClass(), "methods", term23494);
        setField(term23459, term23459.getClass(), "id", "CRAUqtVBkU");
        setField(term23459, term23459.getClass(), "name", "DddqUYfomL");
        setField(term23459, term23459.getClass(), "relations", term23522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlantUml", argTypes, term23459, args);
    }

};


