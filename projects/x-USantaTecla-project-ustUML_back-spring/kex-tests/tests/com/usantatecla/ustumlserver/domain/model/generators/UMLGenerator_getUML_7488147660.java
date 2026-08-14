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

public class UMLGenerator_getUML_7488147660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2690;

    public UMLGenerator_getUML_7488147660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2763 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term2762 = ((Class) term2763).getDeclaredField((String) "FINAL");
        ((Field) term2762).setAccessible(true);
        Object enum6 =  ((Field) term2762).get((Object) null);
        Class<? extends Object> term3100 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term3099 = ((Class) term3100).getDeclaredField((String) "PRIVATE");
        ((Field) term3099).setAccessible(true);
        Object enum7 =  ((Field) term3099).get((Object) null);
        Class<? extends Object> term3443 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term3442 = ((Class) term3443).getDeclaredField((String) "PRIVATE");
        ((Field) term3442).setAccessible(true);
        Object enum8 =  ((Field) term3442).get((Object) null);
        Class<? extends Object> term3786 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term3785 = ((Class) term3786).getDeclaredField((String) "STATIC");
        ((Field) term3785).setAccessible(true);
        Object enum9 =  ((Field) term3785).get((Object) null);
        Class<? extends Object> term4126 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term4125 = ((Class) term4126).getDeclaredField((String) "NULL");
        ((Field) term4125).setAccessible(true);
        Object enum10 =  ((Field) term4125).get((Object) null);
        ArrayList term2715 = new ArrayList();
        ((ArrayList) term2715).add(enum6);
        ((ArrayList) term2715).add(enum7);
        ((ArrayList) term2715).add(enum8);
        ((ArrayList) term2715).add(enum9);
        ((ArrayList) term2715).add(enum6);
        ((ArrayList) term2715).add(enum6);
        ((ArrayList) term2715).add(enum10);
        term2690 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term2690, term2690.getClass(), "name", "UoYtihxVaS");
        setField(term2690, term2690.getClass(), "type", "JDswTTCZHV");
        setField(term2690, term2690.getClass(), "modifiers", term2715);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute");
        Object[] args = new Object[1];
        args[0] = term2690;
        callMethod(klass, "getUML", argTypes, null, args);
    }

};


