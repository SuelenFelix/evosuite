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

public class AttributeEntity_getModifiers_2017204615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6616;

    public AttributeEntity_getModifiers_2017204615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6676 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term6675 = ((Class) term6676).getDeclaredField((String) "STATIC");
        ((Field) term6675).setAccessible(true);
        Object enum17 =  ((Field) term6675).get((Object) null);
        Class<? extends Object> term7016 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term7015 = ((Class) term7016).getDeclaredField((String) "NULL");
        ((Field) term7015).setAccessible(true);
        Object enum18 =  ((Field) term7015).get((Object) null);
        ArrayList term6641 = new ArrayList();
        ((ArrayList) term6641).add(enum17);
        ((ArrayList) term6641).add(enum18);
        term6616 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term6616, term6616.getClass(), "name", "hNxWaHcfhY");
        setField(term6616, term6616.getClass(), "type", "RkybSrpybU");
        setField(term6616, term6616.getClass(), "modifiers", term6641);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModifiers", argTypes, term6616, args);
    }

};


