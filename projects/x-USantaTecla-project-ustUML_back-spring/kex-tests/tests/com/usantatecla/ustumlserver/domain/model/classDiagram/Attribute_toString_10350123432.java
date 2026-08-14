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

public class Attribute_toString_10350123432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45364;

    public Attribute_toString_10350123432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term45437 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term45436 = ((Class) term45437).getDeclaredField((String) "PACKAGE");
        ((Field) term45436).setAccessible(true);
        Object enum117 =  ((Field) term45436).get((Object) null);
        Class<? extends Object> term45780 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term45779 = ((Class) term45780).getDeclaredField((String) "PRIVATE");
        ((Field) term45779).setAccessible(true);
        Object enum118 =  ((Field) term45779).get((Object) null);
        Class<? extends Object> term46123 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term46122 = ((Class) term46123).getDeclaredField((String) "PACKAGE");
        ((Field) term46122).setAccessible(true);
        Object enum119 =  ((Field) term46122).get((Object) null);
        Class<? extends Object> term46466 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term46465 = ((Class) term46466).getDeclaredField((String) "ABSTRACT");
        ((Field) term46465).setAccessible(true);
        Object enum120 =  ((Field) term46465).get((Object) null);
        Class<? extends Object> term46812 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term46811 = ((Class) term46812).getDeclaredField((String) "ABSTRACT");
        ((Field) term46811).setAccessible(true);
        Object enum121 =  ((Field) term46811).get((Object) null);
        ArrayList term45389 = new ArrayList();
        ((ArrayList) term45389).add(enum117);
        ((ArrayList) term45389).add(enum118);
        ((ArrayList) term45389).add(enum119);
        ((ArrayList) term45389).add(enum119);
        ((ArrayList) term45389).add(enum120);
        ((ArrayList) term45389).add(enum121);
        term45364 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term45364, term45364.getClass(), "name", "igruEzTbBE");
        setField(term45364, term45364.getClass(), "type", "LFjgROsRUV");
        setField(term45364, term45364.getClass(), "modifiers", term45389);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term45364, args);
    }

};


