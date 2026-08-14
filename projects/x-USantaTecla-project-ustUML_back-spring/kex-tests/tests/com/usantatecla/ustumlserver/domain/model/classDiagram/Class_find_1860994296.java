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

public class Class_find_1860994296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10286;
     Object term10392;

    public Class_find_1860994296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10435 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term10434 = ((Class) term10435).getDeclaredField((String) "PRIVATE");
        ((Field) term10434).setAccessible(true);
        Object enum25 =  ((Field) term10434).get((Object) null);
        ArrayList term10287 = new ArrayList();
        ((ArrayList) term10287).add(enum25);
        ArrayList term10301 = new ArrayList();
        ((ArrayList) term10301).add((Object)null);
        ((ArrayList) term10301).add((Object)null);
        ((ArrayList) term10301).add((Object)null);
        Object term10298 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term10298, term10298.getClass(), "name", "");
        setField(term10298, term10298.getClass(), "type", "");
        setField(term10298, term10298.getClass(), "modifiers", term10301);
        ArrayList term10307 = new ArrayList();
        ((ArrayList) term10307).add((Object)null);
        ((ArrayList) term10307).add((Object)null);
        ((ArrayList) term10307).add((Object)null);
        ((ArrayList) term10307).add((Object)null);
        Object term10304 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term10304, term10304.getClass(), "name", "");
        setField(term10304, term10304.getClass(), "type", "");
        setField(term10304, term10304.getClass(), "modifiers", term10307);
        ArrayList term10313 = new ArrayList();
        ((ArrayList) term10313).add((Object)null);
        ((ArrayList) term10313).add((Object)null);
        ((ArrayList) term10313).add((Object)null);
        ((ArrayList) term10313).add((Object)null);
        ((ArrayList) term10313).add((Object)null);
        ((ArrayList) term10313).add((Object)null);
        ((ArrayList) term10313).add((Object)null);
        Object term10310 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term10310, term10310.getClass(), "name", "");
        setField(term10310, term10310.getClass(), "type", "");
        setField(term10310, term10310.getClass(), "modifiers", term10313);
        ArrayList term10319 = new ArrayList();
        ((ArrayList) term10319).add((Object)null);
        ((ArrayList) term10319).add((Object)null);
        ((ArrayList) term10319).add((Object)null);
        ((ArrayList) term10319).add((Object)null);
        Object term10316 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term10316, term10316.getClass(), "name", "");
        setField(term10316, term10316.getClass(), "type", "");
        setField(term10316, term10316.getClass(), "modifiers", term10319);
        ArrayList term10325 = new ArrayList();
        ((ArrayList) term10325).add((Object)null);
        ((ArrayList) term10325).add((Object)null);
        ((ArrayList) term10325).add((Object)null);
        ((ArrayList) term10325).add((Object)null);
        ((ArrayList) term10325).add((Object)null);
        ((ArrayList) term10325).add((Object)null);
        Object term10322 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term10322, term10322.getClass(), "name", "");
        setField(term10322, term10322.getClass(), "type", "");
        setField(term10322, term10322.getClass(), "modifiers", term10325);
        ArrayList term10331 = new ArrayList();
        ((ArrayList) term10331).add((Object)null);
        ((ArrayList) term10331).add((Object)null);
        ((ArrayList) term10331).add((Object)null);
        ((ArrayList) term10331).add((Object)null);
        Object term10328 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term10328, term10328.getClass(), "name", "");
        setField(term10328, term10328.getClass(), "type", "");
        setField(term10328, term10328.getClass(), "modifiers", term10331);
        ArrayList term10337 = new ArrayList();
        ((ArrayList) term10337).add((Object)null);
        Object term10334 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term10334, term10334.getClass(), "name", "");
        setField(term10334, term10334.getClass(), "type", "");
        setField(term10334, term10334.getClass(), "modifiers", term10337);
        ArrayList term10296 = new ArrayList();
        ((ArrayList) term10296).add(term10298);
        ((ArrayList) term10296).add(term10304);
        ((ArrayList) term10296).add(term10310);
        ((ArrayList) term10296).add(term10316);
        ((ArrayList) term10296).add(term10322);
        ((ArrayList) term10296).add(term10328);
        ((ArrayList) term10296).add(term10334);
        ArrayList term10345 = new ArrayList();
        ((ArrayList) term10345).add((Object)null);
        ((ArrayList) term10345).add((Object)null);
        ((ArrayList) term10345).add((Object)null);
        ((ArrayList) term10345).add((Object)null);
        ((ArrayList) term10345).add((Object)null);
        ArrayList term10350 = new ArrayList();
        ((ArrayList) term10350).add((Object)null);
        ((ArrayList) term10350).add((Object)null);
        Object term10344 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term10344, term10344.getClass(), "parameters", term10345);
        setField(term10344, term10344.getClass(), "name", "");
        setField(term10344, term10344.getClass(), "type", "");
        setField(term10344, term10344.getClass(), "modifiers", term10350);
        ArrayList term10354 = new ArrayList();
        ((ArrayList) term10354).add((Object)null);
        ((ArrayList) term10354).add((Object)null);
        ((ArrayList) term10354).add((Object)null);
        ArrayList term10359 = new ArrayList();
        ((ArrayList) term10359).add((Object)null);
        ((ArrayList) term10359).add((Object)null);
        ((ArrayList) term10359).add((Object)null);
        ((ArrayList) term10359).add((Object)null);
        Object term10353 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term10353, term10353.getClass(), "parameters", term10354);
        setField(term10353, term10353.getClass(), "name", "");
        setField(term10353, term10353.getClass(), "type", "");
        setField(term10353, term10353.getClass(), "modifiers", term10359);
        ArrayList term10342 = new ArrayList();
        ((ArrayList) term10342).add(term10344);
        ((ArrayList) term10342).add(term10353);
        ArrayList term10388 = new ArrayList();
        ((ArrayList) term10388).add((Object)null);
        ((ArrayList) term10388).add((Object)null);
        ((ArrayList) term10388).add((Object)null);
        ((ArrayList) term10388).add((Object)null);
        ((ArrayList) term10388).add((Object)null);
        ((ArrayList) term10388).add((Object)null);
        term10286 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term10286, term10286.getClass(), "modifiers", term10287);
        setField(term10286, term10286.getClass(), "attributes", term10296);
        setField(term10286, term10286.getClass(), "methods", term10342);
        setField(term10286, term10286.getClass(), "id", "ITRRYiuDwH");
        setField(term10286, term10286.getClass(), "name", "llRfwANcVF");
        setField(term10286, term10286.getClass(), "relations", term10388);
        Class<? extends Object> term10818 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term10817 = ((Class) term10818).getDeclaredField((String) "PACKAGE");
        ((Field) term10817).setAccessible(true);
        Object enum26 =  ((Field) term10817).get((Object) null);
        Class<? extends Object> term11161 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term11160 = ((Class) term11161).getDeclaredField((String) "NULL");
        ((Field) term11160).setAccessible(true);
        Object enum27 =  ((Field) term11160).get((Object) null);
        Class<? extends Object> term11495 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term11494 = ((Class) term11495).getDeclaredField((String) "PRIVATE");
        ((Field) term11494).setAccessible(true);
        Object enum28 =  ((Field) term11494).get((Object) null);
        ArrayList term10417 = new ArrayList();
        ((ArrayList) term10417).add(enum26);
        ((ArrayList) term10417).add(enum27);
        ((ArrayList) term10417).add(enum28);
        ((ArrayList) term10417).add(enum27);
        term10392 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term10392, term10392.getClass(), "name", "sUEeHQTWkA");
        setField(term10392, term10392.getClass(), "type", "BDIRCxAWLA");
        setField(term10392, term10392.getClass(), "modifiers", term10417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute");
        Object[] args = new Object[1];
        args[0] = term10392;
        callMethod(klass, "find", argTypes, term10286, args);
    }

};


