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

public class Definition_getName_4721218071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79729;

    public Definition_getName_4721218071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term79789 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term79788 = ((Class) term79789).getDeclaredField((String) "ABSTRACT");
        ((Field) term79788).setAccessible(true);
        Object enum201 =  ((Field) term79788).get((Object) null);
        Class<? extends Object> term80135 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term80134 = ((Class) term80135).getDeclaredField((String) "PUBLIC");
        ((Field) term80134).setAccessible(true);
        Object enum202 =  ((Field) term80134).get((Object) null);
        ArrayList term79754 = new ArrayList();
        ((ArrayList) term79754).add(enum201);
        ((ArrayList) term79754).add(enum202);
        term79729 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition"));
        setField(term79729, term79729.getClass(), "name", "vQbiGKncal");
        setField(term79729, term79729.getClass(), "type", "NTSNSiYeUu");
        setField(term79729, term79729.getClass(), "modifiers", term79754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term79729, args);
    }

};


