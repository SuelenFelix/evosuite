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

public class MethodEntity_MethodEntityBuilder_toString_17041225506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90793;

    public MethodEntity_MethodEntityBuilder_toString_17041225506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term90857 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term90856 = ((Class) term90857).getDeclaredField((String) "PUBLIC");
        ((Field) term90856).setAccessible(true);
        Object enum234 =  ((Field) term90856).get((Object) null);
        Class<? extends Object> term91197 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term91196 = ((Class) term91197).getDeclaredField((String) "PUBLIC");
        ((Field) term91196).setAccessible(true);
        Object enum235 =  ((Field) term91196).get((Object) null);
        ArrayList term90818 = new ArrayList();
        ((ArrayList) term90818).add(enum234);
        ((ArrayList) term90818).add(enum235);
        ArrayList term90832 = new ArrayList();
        term90793 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder"));
        setField(term90793, term90793.getClass(), "name", "ElTdyUVQYi");
        setField(term90793, term90793.getClass(), "type", "KkgJnxXxVl");
        setField(term90793, term90793.getClass(), "modifiers", term90818);
        setField(term90793, term90793.getClass(), "parametersEntities", term90832);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term90793, args);
    }

};


