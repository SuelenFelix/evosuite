package com.usantatecla.ustumlserver.domain.model.classDiagram;

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
import static com.usantatecla.ustumlserver.domain.model.classDiagram.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.String;
import java.lang.Object;

public class Interface_init_16824991880 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56753;
     Object term56790;

    public Interface_init_16824991880() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56804 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term56803 = ((Class) term56804).getDeclaredField((String) "PACKAGE");
        ((Field) term56803).setAccessible(true);
        Object enum148 =  ((Field) term56803).get((Object) null);
        Class<? extends Object> term57147 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term57146 = ((Class) term57147).getDeclaredField((String) "PACKAGE");
        ((Field) term57146).setAccessible(true);
        Object enum149 =  ((Field) term57146).get((Object) null);
        Class<? extends Object> term57490 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term57489 = ((Class) term57490).getDeclaredField((String) "FINAL");
        ((Field) term57489).setAccessible(true);
        Object enum150 =  ((Field) term57489).get((Object) null);
        term56753 = new LinkedList();
        ((LinkedList) term56753).add(enum148);
        ((LinkedList) term56753).add(enum149);
        ((LinkedList) term56753).add(enum150);
        ((LinkedList) term56753).add((Object)null);
        ((LinkedList) term56753).add((Object)null);
        ((LinkedList) term56753).add((Object)null);
        term56790 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Interface");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "EUapSrAmOe";
        args[1] = term56753;
        args[2] = term56790;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


