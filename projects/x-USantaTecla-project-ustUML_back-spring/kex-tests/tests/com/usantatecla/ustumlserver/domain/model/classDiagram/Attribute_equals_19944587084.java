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

public class Attribute_equals_19944587084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47157;
     Object term47201;

    public Attribute_equals_19944587084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47223 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term47222 = ((Class) term47223).getDeclaredField((String) "NULL");
        ((Field) term47222).setAccessible(true);
        Object enum122 =  ((Field) term47222).get((Object) null);
        Class<? extends Object> term47557 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term47556 = ((Class) term47557).getDeclaredField((String) "ABSTRACT");
        ((Field) term47556).setAccessible(true);
        Object enum123 =  ((Field) term47556).get((Object) null);
        Class<? extends Object> term47903 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term47902 = ((Class) term47903).getDeclaredField((String) "PROTECTED");
        ((Field) term47902).setAccessible(true);
        Object enum124 =  ((Field) term47902).get((Object) null);
        ArrayList term47182 = new ArrayList();
        ((ArrayList) term47182).add(enum122);
        ((ArrayList) term47182).add(enum123);
        ((ArrayList) term47182).add(enum123);
        ((ArrayList) term47182).add(enum124);
        term47157 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term47157, term47157.getClass(), "name", "kHxujKiCsr");
        setField(term47157, term47157.getClass(), "type", "cseZveWowm");
        setField(term47157, term47157.getClass(), "modifiers", term47182);
        term47201 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term47201;
        callMethod(klass, "equals", argTypes, term47157, args);
    }

};


