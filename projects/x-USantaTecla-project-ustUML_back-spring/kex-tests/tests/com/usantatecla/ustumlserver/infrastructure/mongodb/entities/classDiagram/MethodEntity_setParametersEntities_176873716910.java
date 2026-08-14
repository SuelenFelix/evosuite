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
import java.util.LinkedList;

public class MethodEntity_setParametersEntities_176873716910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46031;
     Object term46102;

    public MethodEntity_setParametersEntities_176873716910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46126 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term46125 = ((Class) term46126).getDeclaredField((String) "PACKAGE");
        ((Field) term46125).setAccessible(true);
        Object enum120 =  ((Field) term46125).get((Object) null);
        Class<? extends Object> term46469 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term46468 = ((Class) term46469).getDeclaredField((String) "PACKAGE");
        ((Field) term46468).setAccessible(true);
        Object enum121 =  ((Field) term46468).get((Object) null);
        Class<? extends Object> term46812 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term46811 = ((Class) term46812).getDeclaredField((String) "PROTECTED");
        ((Field) term46811).setAccessible(true);
        Object enum122 =  ((Field) term46811).get((Object) null);
        Class<? extends Object> term47161 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term47160 = ((Class) term47161).getDeclaredField((String) "ABSTRACT");
        ((Field) term47160).setAccessible(true);
        Object enum123 =  ((Field) term47160).get((Object) null);
        ArrayList term46056 = new ArrayList();
        ((ArrayList) term46056).add(enum120);
        ((ArrayList) term46056).add(enum121);
        ((ArrayList) term46056).add(enum122);
        ((ArrayList) term46056).add(enum121);
        ((ArrayList) term46056).add(enum120);
        ((ArrayList) term46056).add(enum123);
        Object term46082 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term46082, term46082.getClass(), "name", "");
        setField(term46082, term46082.getClass(), "type", "");
        Object term46085 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term46085, term46085.getClass(), "name", "");
        setField(term46085, term46085.getClass(), "type", "");
        Object term46088 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term46088, term46088.getClass(), "name", "");
        setField(term46088, term46088.getClass(), "type", "");
        Object term46091 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term46091, term46091.getClass(), "name", "");
        setField(term46091, term46091.getClass(), "type", "");
        Object term46094 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term46094, term46094.getClass(), "name", "");
        setField(term46094, term46094.getClass(), "type", "");
        Object term46097 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term46097, term46097.getClass(), "name", "");
        setField(term46097, term46097.getClass(), "type", "");
        ArrayList term46080 = new ArrayList();
        ((ArrayList) term46080).add(term46082);
        ((ArrayList) term46080).add(term46085);
        ((ArrayList) term46080).add(term46088);
        ((ArrayList) term46080).add(term46091);
        ((ArrayList) term46080).add(term46094);
        ((ArrayList) term46080).add(term46097);
        term46031 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term46031, term46031.getClass(), "name", "bbHWyibNmy");
        setField(term46031, term46031.getClass(), "type", "vYYOYhWMWZ");
        setField(term46031, term46031.getClass(), "modifiers", term46056);
        setField(term46031, term46031.getClass(), "parametersEntities", term46080);
        term46102 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term46102;
        callMethod(klass, "setParametersEntities", argTypes, term46031, args);
    }

};


