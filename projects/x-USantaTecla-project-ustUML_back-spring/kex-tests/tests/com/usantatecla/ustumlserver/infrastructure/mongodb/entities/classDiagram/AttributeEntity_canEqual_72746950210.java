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

public class AttributeEntity_canEqual_72746950210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10373;
     Object term10420;

    public AttributeEntity_canEqual_72746950210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10442 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term10441 = ((Class) term10442).getDeclaredField((String) "FINAL");
        ((Field) term10441).setAccessible(true);
        Object enum27 =  ((Field) term10441).get((Object) null);
        Class<? extends Object> term10779 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term10778 = ((Class) term10779).getDeclaredField((String) "PROTECTED");
        ((Field) term10778).setAccessible(true);
        Object enum28 =  ((Field) term10778).get((Object) null);
        Class<? extends Object> term11128 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term11127 = ((Class) term11128).getDeclaredField((String) "ABSTRACT");
        ((Field) term11127).setAccessible(true);
        Object enum29 =  ((Field) term11127).get((Object) null);
        Class<? extends Object> term11474 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term11473 = ((Class) term11474).getDeclaredField((String) "PUBLIC");
        ((Field) term11473).setAccessible(true);
        Object enum30 =  ((Field) term11473).get((Object) null);
        ArrayList term10398 = new ArrayList();
        ((ArrayList) term10398).add(enum27);
        ((ArrayList) term10398).add(enum28);
        ((ArrayList) term10398).add(enum29);
        ((ArrayList) term10398).add(enum30);
        ((ArrayList) term10398).add(enum27);
        ((ArrayList) term10398).add(enum29);
        term10373 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term10373, term10373.getClass(), "name", "AijpHYOFuy");
        setField(term10373, term10373.getClass(), "type", "SbAoxhfrkn");
        setField(term10373, term10373.getClass(), "modifiers", term10398);
        term10420 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term10420;
        callMethod(klass, "canEqual", argTypes, term10373, args);
    }

};


