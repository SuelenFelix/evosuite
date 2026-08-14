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
import java.lang.Object;
import java.lang.String;

public class MethodEntity_init_7907566560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34943;

    public MethodEntity_init_7907566560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term34946 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term34946, term34946.getClass(), "name", "");
        setField(term34946, term34946.getClass(), "type", "");
        Object term34949 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term34949, term34949.getClass(), "name", "");
        setField(term34949, term34949.getClass(), "type", "");
        Object term34952 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term34952, term34952.getClass(), "name", "");
        setField(term34952, term34952.getClass(), "type", "");
        Object term34955 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term34955, term34955.getClass(), "name", "");
        setField(term34955, term34955.getClass(), "type", "");
        Object term34958 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term34958, term34958.getClass(), "name", "");
        setField(term34958, term34958.getClass(), "type", "");
        ArrayList term34944 = new ArrayList();
        ((ArrayList) term34944).add(term34946);
        ((ArrayList) term34944).add(term34949);
        ((ArrayList) term34944).add(term34952);
        ((ArrayList) term34944).add(term34955);
        ((ArrayList) term34944).add(term34958);
        Class<? extends Object> term35022 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term35021 = ((Class) term35022).getDeclaredField((String) "PUBLIC");
        ((Field) term35021).setAccessible(true);
        Object enum90 =  ((Field) term35021).get((Object) null);
        Class<? extends Object> term35362 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term35361 = ((Class) term35362).getDeclaredField((String) "NULL");
        ((Field) term35361).setAccessible(true);
        Object enum91 =  ((Field) term35361).get((Object) null);
        ArrayList term34987 = new ArrayList();
        ((ArrayList) term34987).add(enum90);
        ((ArrayList) term34987).add(enum91);
        term34943 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term34943, term34943.getClass(), "parameters", term34944);
        setField(term34943, term34943.getClass(), "name", "itAUCFhZhq");
        setField(term34943, term34943.getClass(), "type", "bIqaKgXgPm");
        setField(term34943, term34943.getClass(), "modifiers", term34987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method");
        Object[] args = new Object[1];
        args[0] = term34943;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


