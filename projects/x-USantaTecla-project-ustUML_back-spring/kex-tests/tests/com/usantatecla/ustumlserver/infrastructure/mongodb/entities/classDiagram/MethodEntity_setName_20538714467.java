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

public class MethodEntity_setName_20538714467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42677;

    public MethodEntity_setName_20538714467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42753 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term42752 = ((Class) term42753).getDeclaredField((String) "NULL");
        ((Field) term42752).setAccessible(true);
        Object enum111 =  ((Field) term42752).get((Object) null);
        Class<? extends Object> term43087 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term43086 = ((Class) term43087).getDeclaredField((String) "NULL");
        ((Field) term43086).setAccessible(true);
        Object enum112 =  ((Field) term43086).get((Object) null);
        ArrayList term42702 = new ArrayList();
        ((ArrayList) term42702).add(enum111);
        ((ArrayList) term42702).add(enum112);
        ((ArrayList) term42702).add(enum112);
        ((ArrayList) term42702).add(enum112);
        ArrayList term42716 = new ArrayList();
        term42677 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term42677, term42677.getClass(), "name", "GlPTiCMCGP");
        setField(term42677, term42677.getClass(), "type", "jlcBpLoWfd");
        setField(term42677, term42677.getClass(), "modifiers", term42702);
        setField(term42677, term42677.getClass(), "parametersEntities", term42716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oYymmLqbfJ";
        callMethod(klass, "setName", argTypes, term42677, args);
    }

};


