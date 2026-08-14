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

public class MethodEntity_canEqual_87838128112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47929;
     Object term47998;

    public MethodEntity_canEqual_87838128112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48020 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term48019 = ((Class) term48020).getDeclaredField((String) "FINAL");
        ((Field) term48019).setAccessible(true);
        Object enum125 =  ((Field) term48019).get((Object) null);
        Class<? extends Object> term48357 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term48356 = ((Class) term48357).getDeclaredField((String) "PUBLIC");
        ((Field) term48356).setAccessible(true);
        Object enum126 =  ((Field) term48356).get((Object) null);
        Class<? extends Object> term48697 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term48696 = ((Class) term48697).getDeclaredField((String) "PACKAGE");
        ((Field) term48696).setAccessible(true);
        Object enum127 =  ((Field) term48696).get((Object) null);
        Class<? extends Object> term49040 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term49039 = ((Class) term49040).getDeclaredField((String) "NULL");
        ((Field) term49039).setAccessible(true);
        Object enum128 =  ((Field) term49039).get((Object) null);
        ArrayList term47954 = new ArrayList();
        ((ArrayList) term47954).add(enum125);
        ((ArrayList) term47954).add(enum126);
        ((ArrayList) term47954).add(enum127);
        ((ArrayList) term47954).add(enum128);
        Object term47978 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47978, term47978.getClass(), "name", "");
        setField(term47978, term47978.getClass(), "type", "");
        Object term47981 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47981, term47981.getClass(), "name", "");
        setField(term47981, term47981.getClass(), "type", "");
        Object term47984 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47984, term47984.getClass(), "name", "");
        setField(term47984, term47984.getClass(), "type", "");
        Object term47987 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47987, term47987.getClass(), "name", "");
        setField(term47987, term47987.getClass(), "type", "");
        Object term47990 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47990, term47990.getClass(), "name", "");
        setField(term47990, term47990.getClass(), "type", "");
        Object term47993 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term47993, term47993.getClass(), "name", "");
        setField(term47993, term47993.getClass(), "type", "");
        ArrayList term47976 = new ArrayList();
        ((ArrayList) term47976).add(term47978);
        ((ArrayList) term47976).add(term47981);
        ((ArrayList) term47976).add(term47984);
        ((ArrayList) term47976).add(term47987);
        ((ArrayList) term47976).add(term47990);
        ((ArrayList) term47976).add(term47993);
        term47929 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term47929, term47929.getClass(), "name", "OxNXeKMDje");
        setField(term47929, term47929.getClass(), "type", "hGTqHomrbc");
        setField(term47929, term47929.getClass(), "modifiers", term47954);
        setField(term47929, term47929.getClass(), "parametersEntities", term47976);
        term47998 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term47998;
        callMethod(klass, "canEqual", argTypes, term47929, args);
    }

};


