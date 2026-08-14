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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class Definition_setType_19089401385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84802;

    public Definition_setType_19089401385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term84887 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term84886 = ((Class) term84887).getDeclaredField((String) "PRIVATE");
        ((Field) term84886).setAccessible(true);
        Object enum215 =  ((Field) term84886).get((Object) null);
        Class<? extends Object> term85230 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term85229 = ((Class) term85230).getDeclaredField((String) "ABSTRACT");
        ((Field) term85229).setAccessible(true);
        Object enum216 =  ((Field) term85229).get((Object) null);
        Class<? extends Object> term85576 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term85575 = ((Class) term85576).getDeclaredField((String) "PROTECTED");
        ((Field) term85575).setAccessible(true);
        Object enum217 =  ((Field) term85575).get((Object) null);
        Class<? extends Object> term85925 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term85924 = ((Class) term85925).getDeclaredField((String) "NULL");
        ((Field) term85924).setAccessible(true);
        Object enum218 =  ((Field) term85924).get((Object) null);
        Class<? extends Object> term86259 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term86258 = ((Class) term86259).getDeclaredField((String) "PUBLIC");
        ((Field) term86258).setAccessible(true);
        Object enum219 =  ((Field) term86258).get((Object) null);
        ArrayList term84827 = new ArrayList();
        ((ArrayList) term84827).add(enum215);
        ((ArrayList) term84827).add(enum216);
        ((ArrayList) term84827).add(enum217);
        ((ArrayList) term84827).add(enum215);
        ((ArrayList) term84827).add(enum216);
        ((ArrayList) term84827).add(enum218);
        ((ArrayList) term84827).add(enum216);
        ((ArrayList) term84827).add(enum219);
        ((ArrayList) term84827).add(enum216);
        term84802 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition"));
        setField(term84802, term84802.getClass(), "name", "UFGOnIMOzf");
        setField(term84802, term84802.getClass(), "type", "ySiyRlAQpt");
        setField(term84802, term84802.getClass(), "modifiers", term84827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MiankJgKCp";
        callMethod(klass, "setType", argTypes, term84802, args);
    }

};


