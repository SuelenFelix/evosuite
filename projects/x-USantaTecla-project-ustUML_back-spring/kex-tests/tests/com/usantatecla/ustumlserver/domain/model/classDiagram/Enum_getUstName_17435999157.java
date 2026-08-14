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

public class Enum_getUstName_17435999157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70523;

    public Enum_getUstName_17435999157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70524 = new ArrayList();
        ((ArrayList) term70524).add("esbhDGQDgF");
        ((ArrayList) term70524).add("tKlyiBloWu");
        ((ArrayList) term70524).add("uIgRFcwqLd");
        ((ArrayList) term70524).add("AvdsiEyCve");
        ((ArrayList) term70524).add("XMArCaVAEc");
        Class<? extends Object> term70716 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term70715 = ((Class) term70716).getDeclaredField((String) "ABSTRACT");
        ((Field) term70715).setAccessible(true);
        Object enum180 =  ((Field) term70715).get((Object) null);
        Class<? extends Object> term71062 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term71061 = ((Class) term71062).getDeclaredField((String) "PUBLIC");
        ((Field) term71061).setAccessible(true);
        Object enum181 =  ((Field) term71061).get((Object) null);
        Class<? extends Object> term71402 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term71401 = ((Class) term71402).getDeclaredField((String) "ABSTRACT");
        ((Field) term71401).setAccessible(true);
        Object enum182 =  ((Field) term71401).get((Object) null);
        ArrayList term70588 = new ArrayList();
        ((ArrayList) term70588).add(enum180);
        ((ArrayList) term70588).add(enum181);
        ((ArrayList) term70588).add(enum182);
        ArrayList term70610 = new ArrayList();
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        ((ArrayList) term70610).add((Object)null);
        Object term70607 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term70607, term70607.getClass(), "name", "");
        setField(term70607, term70607.getClass(), "type", "");
        setField(term70607, term70607.getClass(), "modifiers", term70610);
        ArrayList term70616 = new ArrayList();
        ((ArrayList) term70616).add((Object)null);
        ((ArrayList) term70616).add((Object)null);
        ((ArrayList) term70616).add((Object)null);
        ((ArrayList) term70616).add((Object)null);
        ((ArrayList) term70616).add((Object)null);
        ((ArrayList) term70616).add((Object)null);
        ((ArrayList) term70616).add((Object)null);
        ((ArrayList) term70616).add((Object)null);
        Object term70613 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term70613, term70613.getClass(), "name", "");
        setField(term70613, term70613.getClass(), "type", "");
        setField(term70613, term70613.getClass(), "modifiers", term70616);
        ArrayList term70622 = new ArrayList();
        ((ArrayList) term70622).add((Object)null);
        Object term70619 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term70619, term70619.getClass(), "name", "");
        setField(term70619, term70619.getClass(), "type", "");
        setField(term70619, term70619.getClass(), "modifiers", term70622);
        ArrayList term70628 = new ArrayList();
        ((ArrayList) term70628).add((Object)null);
        ((ArrayList) term70628).add((Object)null);
        Object term70625 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term70625, term70625.getClass(), "name", "");
        setField(term70625, term70625.getClass(), "type", "");
        setField(term70625, term70625.getClass(), "modifiers", term70628);
        ArrayList term70605 = new ArrayList();
        ((ArrayList) term70605).add(term70607);
        ((ArrayList) term70605).add(term70613);
        ((ArrayList) term70605).add(term70619);
        ((ArrayList) term70605).add(term70625);
        ArrayList term70633 = new ArrayList();
        ArrayList term70661 = new ArrayList();
        term70523 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum"));
        setField(term70523, term70523.getClass(), "objects", term70524);
        setField(term70523, term70523.getClass(), "modifiers", term70588);
        setField(term70523, term70523.getClass(), "attributes", term70605);
        setField(term70523, term70523.getClass(), "methods", term70633);
        setField(term70523, term70523.getClass(), "id", "jleFBTYSNb");
        setField(term70523, term70523.getClass(), "name", "WmSSWHEELj");
        setField(term70523, term70523.getClass(), "relations", term70661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Enum");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUstName", argTypes, term70523, args);
    }

};


