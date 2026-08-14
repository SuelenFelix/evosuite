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

public class AttributeEntity_AttributeEntityBuilder_build_15630928194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63069;

    public AttributeEntity_AttributeEntityBuilder_build_15630928194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term63142 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term63141 = ((Class) term63142).getDeclaredField((String) "STATIC");
        ((Field) term63141).setAccessible(true);
        Object enum162 =  ((Field) term63141).get((Object) null);
        Class<? extends Object> term63482 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term63481 = ((Class) term63482).getDeclaredField((String) "NULL");
        ((Field) term63481).setAccessible(true);
        Object enum163 =  ((Field) term63481).get((Object) null);
        Class<? extends Object> term63816 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term63815 = ((Class) term63816).getDeclaredField((String) "PACKAGE");
        ((Field) term63815).setAccessible(true);
        Object enum164 =  ((Field) term63815).get((Object) null);
        Class<? extends Object> term64159 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term64158 = ((Class) term64159).getDeclaredField((String) "FINAL");
        ((Field) term64158).setAccessible(true);
        Object enum165 =  ((Field) term64158).get((Object) null);
        Class<? extends Object> term64496 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term64495 = ((Class) term64496).getDeclaredField((String) "PROTECTED");
        ((Field) term64495).setAccessible(true);
        Object enum166 =  ((Field) term64495).get((Object) null);
        ArrayList term63094 = new ArrayList();
        ((ArrayList) term63094).add(enum162);
        ((ArrayList) term63094).add(enum163);
        ((ArrayList) term63094).add(enum163);
        ((ArrayList) term63094).add(enum164);
        ((ArrayList) term63094).add(enum165);
        ((ArrayList) term63094).add(enum166);
        term63069 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity$AttributeEntityBuilder"));
        setField(term63069, term63069.getClass(), "name", "MltgFGldop");
        setField(term63069, term63069.getClass(), "type", "JCWSoxnBJs");
        setField(term63069, term63069.getClass(), "modifiers", term63094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.AttributeEntity$AttributeEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term63069, args);
    }

};


