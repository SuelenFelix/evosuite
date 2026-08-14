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

public class Attribute_hashCode_15457720336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48301;

    public Attribute_hashCode_15457720336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48361 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term48360 = ((Class) term48361).getDeclaredField((String) "STATIC");
        ((Field) term48360).setAccessible(true);
        Object enum125 =  ((Field) term48360).get((Object) null);
        Class<? extends Object> term48701 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term48700 = ((Class) term48701).getDeclaredField((String) "NULL");
        ((Field) term48700).setAccessible(true);
        Object enum126 =  ((Field) term48700).get((Object) null);
        ArrayList term48326 = new ArrayList();
        ((ArrayList) term48326).add(enum125);
        ((ArrayList) term48326).add(enum126);
        term48301 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term48301, term48301.getClass(), "name", "crkNabVaWs");
        setField(term48301, term48301.getClass(), "type", "qBcAJgrABE");
        setField(term48301, term48301.getClass(), "modifiers", term48326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term48301, args);
    }

};


