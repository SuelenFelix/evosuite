package com.usantatecla.ustumlserver.domain.model.generators;

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
import static com.usantatecla.ustumlserver.domain.model.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class UstUMLGenerator_visit_13117996213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11880;
     Object term11882;

    public UstUMLGenerator_visit_13117996213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11880 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator"));
        setIntField(term11880, term11880.getClass(), "depthLevel", 597278769);
        Class<? extends Object> term11977 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term11976 = ((Class) term11977).getDeclaredField((String) "STATIC");
        ((Field) term11976).setAccessible(true);
        Object enum29 =  ((Field) term11976).get((Object) null);
        Class<? extends Object> term12317 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term12316 = ((Class) term12317).getDeclaredField((String) "NULL");
        ((Field) term12316).setAccessible(true);
        Object enum30 =  ((Field) term12316).get((Object) null);
        Class<? extends Object> term12651 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term12650 = ((Class) term12651).getDeclaredField((String) "PUBLIC");
        ((Field) term12650).setAccessible(true);
        Object enum31 =  ((Field) term12650).get((Object) null);
        Class<? extends Object> term12991 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term12990 = ((Class) term12991).getDeclaredField((String) "PROTECTED");
        ((Field) term12990).setAccessible(true);
        Object enum32 =  ((Field) term12990).get((Object) null);
        Class<? extends Object> term13340 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term13339 = ((Class) term13340).getDeclaredField((String) "PROTECTED");
        ((Field) term13339).setAccessible(true);
        Object enum33 =  ((Field) term13339).get((Object) null);
        ArrayList term11883 = new ArrayList();
        ((ArrayList) term11883).add(enum29);
        ((ArrayList) term11883).add(enum30);
        ((ArrayList) term11883).add(enum31);
        ((ArrayList) term11883).add(enum32);
        ((ArrayList) term11883).add(enum31);
        ((ArrayList) term11883).add(enum33);
        ArrayList term11915 = new ArrayList();
        ((ArrayList) term11915).add((Object)null);
        ((ArrayList) term11915).add((Object)null);
        ((ArrayList) term11915).add((Object)null);
        ((ArrayList) term11915).add((Object)null);
        ((ArrayList) term11915).add((Object)null);
        ((ArrayList) term11915).add((Object)null);
        ((ArrayList) term11915).add((Object)null);
        ((ArrayList) term11915).add((Object)null);
        ((ArrayList) term11915).add((Object)null);
        Object term11912 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term11912, term11912.getClass(), "name", "");
        setField(term11912, term11912.getClass(), "type", "");
        setField(term11912, term11912.getClass(), "modifiers", term11915);
        ArrayList term11921 = new ArrayList();
        ((ArrayList) term11921).add((Object)null);
        ((ArrayList) term11921).add((Object)null);
        Object term11918 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term11918, term11918.getClass(), "name", "");
        setField(term11918, term11918.getClass(), "type", "");
        setField(term11918, term11918.getClass(), "modifiers", term11921);
        ArrayList term11927 = new ArrayList();
        ((ArrayList) term11927).add((Object)null);
        ((ArrayList) term11927).add((Object)null);
        ((ArrayList) term11927).add((Object)null);
        ((ArrayList) term11927).add((Object)null);
        ((ArrayList) term11927).add((Object)null);
        ((ArrayList) term11927).add((Object)null);
        ((ArrayList) term11927).add((Object)null);
        Object term11924 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term11924, term11924.getClass(), "name", "");
        setField(term11924, term11924.getClass(), "type", "");
        setField(term11924, term11924.getClass(), "modifiers", term11927);
        ArrayList term11933 = new ArrayList();
        Object term11930 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term11930, term11930.getClass(), "name", "");
        setField(term11930, term11930.getClass(), "type", "");
        setField(term11930, term11930.getClass(), "modifiers", term11933);
        ArrayList term11939 = new ArrayList();
        ((ArrayList) term11939).add((Object)null);
        ((ArrayList) term11939).add((Object)null);
        ((ArrayList) term11939).add((Object)null);
        ((ArrayList) term11939).add((Object)null);
        ((ArrayList) term11939).add((Object)null);
        ((ArrayList) term11939).add((Object)null);
        ((ArrayList) term11939).add((Object)null);
        ((ArrayList) term11939).add((Object)null);
        ((ArrayList) term11939).add((Object)null);
        Object term11936 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term11936, term11936.getClass(), "name", "");
        setField(term11936, term11936.getClass(), "type", "");
        setField(term11936, term11936.getClass(), "modifiers", term11939);
        ArrayList term11910 = new ArrayList();
        ((ArrayList) term11910).add(term11912);
        ((ArrayList) term11910).add(term11918);
        ((ArrayList) term11910).add(term11924);
        ((ArrayList) term11910).add(term11930);
        ((ArrayList) term11910).add(term11936);
        ArrayList term11944 = new ArrayList();
        ArrayList term11972 = new ArrayList();
        ((ArrayList) term11972).add((Object)null);
        ((ArrayList) term11972).add((Object)null);
        ((ArrayList) term11972).add((Object)null);
        ((ArrayList) term11972).add((Object)null);
        ((ArrayList) term11972).add((Object)null);
        term11882 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term11882, term11882.getClass(), "modifiers", term11883);
        setField(term11882, term11882.getClass(), "attributes", term11910);
        setField(term11882, term11882.getClass(), "methods", term11944);
        setField(term11882, term11882.getClass(), "id", "BwtdjiefJn");
        setField(term11882, term11882.getClass(), "name", "jDmhBrIoDa");
        setField(term11882, term11882.getClass(), "relations", term11972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Object[] args = new Object[1];
        args[0] = term11882;
        callMethod(klass, "visit", argTypes, term11880, args);
    }

};


