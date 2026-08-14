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

public class Definition_getModifiers_4017297153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82251;

    public Definition_getModifiers_4017297153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82319 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term82318 = ((Class) term82319).getDeclaredField((String) "PRIVATE");
        ((Field) term82318).setAccessible(true);
        Object enum208 =  ((Field) term82318).get((Object) null);
        Class<? extends Object> term82662 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term82661 = ((Class) term82662).getDeclaredField((String) "PACKAGE");
        ((Field) term82661).setAccessible(true);
        Object enum209 =  ((Field) term82661).get((Object) null);
        Class<? extends Object> term83005 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term83004 = ((Class) term83005).getDeclaredField((String) "NULL");
        ((Field) term83004).setAccessible(true);
        Object enum210 =  ((Field) term83004).get((Object) null);
        Class<? extends Object> term83339 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term83338 = ((Class) term83339).getDeclaredField((String) "STATIC");
        ((Field) term83338).setAccessible(true);
        Object enum211 =  ((Field) term83338).get((Object) null);
        ArrayList term82276 = new ArrayList();
        ((ArrayList) term82276).add(enum208);
        ((ArrayList) term82276).add(enum209);
        ((ArrayList) term82276).add(enum210);
        ((ArrayList) term82276).add(enum209);
        ((ArrayList) term82276).add(enum211);
        ((ArrayList) term82276).add(enum209);
        term82251 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition"));
        setField(term82251, term82251.getClass(), "name", "qEXIxhmUwz");
        setField(term82251, term82251.getClass(), "type", "RlyxtfCqKY");
        setField(term82251, term82251.getClass(), "modifiers", term82276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModifiers", argTypes, term82251, args);
    }

};


