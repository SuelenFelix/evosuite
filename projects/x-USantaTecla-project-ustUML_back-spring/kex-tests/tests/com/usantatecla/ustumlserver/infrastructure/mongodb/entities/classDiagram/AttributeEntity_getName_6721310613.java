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

public class AttributeEntity_getName_6721310613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4792;

    public AttributeEntity_getName_6721310613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4865 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term4864 = ((Class) term4865).getDeclaredField((String) "FINAL");
        ((Field) term4864).setAccessible(true);
        Object enum12 =  ((Field) term4864).get((Object) null);
        Class<? extends Object> term5202 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term5201 = ((Class) term5202).getDeclaredField((String) "NULL");
        ((Field) term5201).setAccessible(true);
        Object enum13 =  ((Field) term5201).get((Object) null);
        Class<? extends Object> term5536 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term5535 = ((Class) term5536).getDeclaredField((String) "ABSTRACT");
        ((Field) term5535).setAccessible(true);
        Object enum14 =  ((Field) term5535).get((Object) null);
        Class<? extends Object> term5882 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term5881 = ((Class) term5882).getDeclaredField((String) "PRIVATE");
        ((Field) term5881).setAccessible(true);
        Object enum15 =  ((Field) term5881).get((Object) null);
        Class<? extends Object> term6225 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term6224 = ((Class) term6225).getDeclaredField((String) "PACKAGE");
        ((Field) term6224).setAccessible(true);
        Object enum16 =  ((Field) term6224).get((Object) null);
        ArrayList term4817 = new ArrayList();
        ((ArrayList) term4817).add(enum12);
        ((ArrayList) term4817).add(enum13);
        ((ArrayList) term4817).add(enum14);
        ((ArrayList) term4817).add(enum15);
        ((ArrayList) term4817).add(enum16);
        ((ArrayList) term4817).add(enum15);
        term4792 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity"));
        setField(term4792, term4792.getClass(), "name", "ZiaGIbnzTs");
        setField(term4792, term4792.getClass(), "type", "tbcdzjIfER");
        setField(term4792, term4792.getClass(), "modifiers", term4817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term4792, args);
    }

};


