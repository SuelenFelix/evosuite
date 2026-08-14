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

public class Definition_getType_6661505902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80474;

    public Definition_getType_6661505902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80549 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term80548 = ((Class) term80549).getDeclaredField((String) "PUBLIC");
        ((Field) term80548).setAccessible(true);
        Object enum203 =  ((Field) term80548).get((Object) null);
        Class<? extends Object> term80889 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term80888 = ((Class) term80889).getDeclaredField((String) "PUBLIC");
        ((Field) term80888).setAccessible(true);
        Object enum204 =  ((Field) term80888).get((Object) null);
        Class<? extends Object> term81229 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term81228 = ((Class) term81229).getDeclaredField((String) "ABSTRACT");
        ((Field) term81228).setAccessible(true);
        Object enum205 =  ((Field) term81228).get((Object) null);
        Class<? extends Object> term81575 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term81574 = ((Class) term81575).getDeclaredField((String) "NULL");
        ((Field) term81574).setAccessible(true);
        Object enum206 =  ((Field) term81574).get((Object) null);
        Class<? extends Object> term81909 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term81908 = ((Class) term81909).getDeclaredField((String) "PACKAGE");
        ((Field) term81908).setAccessible(true);
        Object enum207 =  ((Field) term81908).get((Object) null);
        ArrayList term80499 = new ArrayList();
        ((ArrayList) term80499).add(enum203);
        ((ArrayList) term80499).add(enum204);
        ((ArrayList) term80499).add(enum205);
        ((ArrayList) term80499).add(enum206);
        ((ArrayList) term80499).add(enum207);
        ((ArrayList) term80499).add(enum203);
        ((ArrayList) term80499).add(enum204);
        term80474 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition"));
        setField(term80474, term80474.getClass(), "name", "SBTEFDmQVY");
        setField(term80474, term80474.getClass(), "type", "ohZpRiNDZM");
        setField(term80474, term80474.getClass(), "modifiers", term80499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term80474, args);
    }

};


