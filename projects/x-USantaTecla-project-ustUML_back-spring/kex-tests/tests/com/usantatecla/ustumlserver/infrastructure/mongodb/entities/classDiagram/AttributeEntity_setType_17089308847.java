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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class AttributeEntity_setType_17089308847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7765;

    public AttributeEntity_setType_17089308847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7845 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term7844 = ((Class) term7845).getDeclaredField((String) "STATIC");
        ((Field) term7844).setAccessible(true);
        Object enum20 =  ((Field) term7844).get((Object) null);
        Class<? extends Object> term8185 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term8184 = ((Class) term8185).getDeclaredField((String) "PACKAGE");
        ((Field) term8184).setAccessible(true);
        Object enum21 =  ((Field) term8184).get((Object) null);
        Class<? extends Object> term8528 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term8527 = ((Class) term8528).getDeclaredField((String) "PROTECTED");
        ((Field) term8527).setAccessible(true);
        Object enum22 =  ((Field) term8527).get((Object) null);
        Class<? extends Object> term8877 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term8876 = ((Class) term8877).getDeclaredField((String) "PACKAGE");
        ((Field) term8876).setAccessible(true);
        Object enum23 =  ((Field) term8876).get((Object) null);
        ArrayList term7790 = new ArrayList();
        ((ArrayList) term7790).add(enum20);
        ((ArrayList) term7790).add(enum21);
        ((ArrayList) term7790).add(enum22);
        ((ArrayList) term7790).add(enum22);
        ((ArrayList) term7790).add(enum21);
        ((ArrayList) term7790).add(enum22);
        ((ArrayList) term7790).add(enum22);
        ((ArrayList) term7790).add(enum23);
        term7765 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term7765, term7765.getClass(), "name", "vrQLuWIDJX");
        setField(term7765, term7765.getClass(), "type", "flxyYxBRtu");
        setField(term7765, term7765.getClass(), "modifiers", term7790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OclPbYPkcH";
        callMethod(klass, "setType", argTypes, term7765, args);
    }

};


