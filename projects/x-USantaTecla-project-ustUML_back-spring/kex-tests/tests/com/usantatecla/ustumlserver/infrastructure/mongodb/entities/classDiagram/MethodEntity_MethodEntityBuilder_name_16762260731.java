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

public class MethodEntity_MethodEntityBuilder_name_16762260731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85963;

    public MethodEntity_MethodEntityBuilder_name_16762260731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86042 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term86041 = ((Class) term86042).getDeclaredField((String) "FINAL");
        ((Field) term86041).setAccessible(true);
        Object enum221 =  ((Field) term86041).get((Object) null);
        Class<? extends Object> term86379 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term86378 = ((Class) term86379).getDeclaredField((String) "STATIC");
        ((Field) term86378).setAccessible(true);
        Object enum222 =  ((Field) term86378).get((Object) null);
        ArrayList term85988 = new ArrayList();
        ((ArrayList) term85988).add(enum221);
        ((ArrayList) term85988).add(enum222);
        Object term86004 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term86004, term86004.getClass(), "name", "");
        setField(term86004, term86004.getClass(), "type", "");
        ArrayList term86002 = new ArrayList();
        ((ArrayList) term86002).add(term86004);
        term85963 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder"));
        setField(term85963, term85963.getClass(), "name", "QHYZiyDyPC");
        setField(term85963, term85963.getClass(), "type", "kcHMyiheuH");
        setField(term85963, term85963.getClass(), "modifiers", term85988);
        setField(term85963, term85963.getClass(), "parametersEntities", term86002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity$MethodEntityBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IXQQwaXITf";
        callMethod(klass, "name", argTypes, term85963, args);
    }

};


