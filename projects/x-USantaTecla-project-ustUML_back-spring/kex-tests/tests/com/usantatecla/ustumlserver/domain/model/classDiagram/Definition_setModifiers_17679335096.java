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
import java.util.LinkedList;

public class Definition_setModifiers_17679335096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86608;
     Object term86642;

    public Definition_setModifiers_17679335096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86693 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term86692 = ((Class) term86693).getDeclaredField((String) "ABSTRACT");
        ((Field) term86692).setAccessible(true);
        Object enum220 =  ((Field) term86692).get((Object) null);
        ArrayList term86633 = new ArrayList();
        ((ArrayList) term86633).add(enum220);
        term86608 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition"));
        setField(term86608, term86608.getClass(), "name", "lmZBCmpOeb");
        setField(term86608, term86608.getClass(), "type", "cPlYOAUqsP");
        setField(term86608, term86608.getClass(), "modifiers", term86633);
        Class<? extends Object> term87039 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term87038 = ((Class) term87039).getDeclaredField((String) "PUBLIC");
        ((Field) term87038).setAccessible(true);
        Object enum221 =  ((Field) term87038).get((Object) null);
        Class<? extends Object> term87379 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term87378 = ((Class) term87379).getDeclaredField((String) "PRIVATE");
        ((Field) term87378).setAccessible(true);
        Object enum222 =  ((Field) term87378).get((Object) null);
        term86642 = new LinkedList();
        ((LinkedList) term86642).add(enum221);
        ((LinkedList) term86642).add(enum222);
        ((LinkedList) term86642).add(enum220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term86642;
        callMethod(klass, "setModifiers", argTypes, term86608, args);
    }

};


