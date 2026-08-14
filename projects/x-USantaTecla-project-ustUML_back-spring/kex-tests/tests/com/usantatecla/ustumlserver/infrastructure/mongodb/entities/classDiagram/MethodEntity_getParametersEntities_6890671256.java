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

public class MethodEntity_getParametersEntities_6890671256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41552;

    public MethodEntity_getParametersEntities_6890671256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41646 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term41645 = ((Class) term41646).getDeclaredField((String) "PRIVATE");
        ((Field) term41645).setAccessible(true);
        Object enum108 =  ((Field) term41645).get((Object) null);
        Class<? extends Object> term41989 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term41988 = ((Class) term41989).getDeclaredField((String) "ABSTRACT");
        ((Field) term41988).setAccessible(true);
        Object enum109 =  ((Field) term41988).get((Object) null);
        Class<? extends Object> term42335 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term42334 = ((Class) term42335).getDeclaredField((String) "PACKAGE");
        ((Field) term42334).setAccessible(true);
        Object enum110 =  ((Field) term42334).get((Object) null);
        ArrayList term41577 = new ArrayList();
        ((ArrayList) term41577).add(enum108);
        ((ArrayList) term41577).add(enum109);
        ((ArrayList) term41577).add(enum110);
        Object term41596 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41596, term41596.getClass(), "name", "");
        setField(term41596, term41596.getClass(), "type", "");
        Object term41599 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41599, term41599.getClass(), "name", "");
        setField(term41599, term41599.getClass(), "type", "");
        Object term41602 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41602, term41602.getClass(), "name", "");
        setField(term41602, term41602.getClass(), "type", "");
        Object term41605 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41605, term41605.getClass(), "name", "");
        setField(term41605, term41605.getClass(), "type", "");
        Object term41608 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41608, term41608.getClass(), "name", "");
        setField(term41608, term41608.getClass(), "type", "");
        Object term41611 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41611, term41611.getClass(), "name", "");
        setField(term41611, term41611.getClass(), "type", "");
        Object term41614 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41614, term41614.getClass(), "name", "");
        setField(term41614, term41614.getClass(), "type", "");
        Object term41617 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41617, term41617.getClass(), "name", "");
        setField(term41617, term41617.getClass(), "type", "");
        Object term41620 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term41620, term41620.getClass(), "name", "");
        setField(term41620, term41620.getClass(), "type", "");
        ArrayList term41594 = new ArrayList();
        ((ArrayList) term41594).add(term41596);
        ((ArrayList) term41594).add(term41599);
        ((ArrayList) term41594).add(term41602);
        ((ArrayList) term41594).add(term41605);
        ((ArrayList) term41594).add(term41608);
        ((ArrayList) term41594).add(term41611);
        ((ArrayList) term41594).add(term41614);
        ((ArrayList) term41594).add(term41617);
        ((ArrayList) term41594).add(term41620);
        term41552 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term41552, term41552.getClass(), "name", "HcUUieXdep");
        setField(term41552, term41552.getClass(), "type", "AbonCTtbef");
        setField(term41552, term41552.getClass(), "modifiers", term41577);
        setField(term41552, term41552.getClass(), "parametersEntities", term41594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParametersEntities", argTypes, term41552, args);
    }

};


