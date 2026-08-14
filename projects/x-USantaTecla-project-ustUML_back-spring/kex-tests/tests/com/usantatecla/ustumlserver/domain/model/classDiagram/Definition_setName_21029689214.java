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

public class Definition_setName_21029689214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83678;

    public Definition_setName_21029689214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83755 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term83754 = ((Class) term83755).getDeclaredField((String) "PUBLIC");
        ((Field) term83754).setAccessible(true);
        Object enum212 =  ((Field) term83754).get((Object) null);
        Class<? extends Object> term84095 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term84094 = ((Class) term84095).getDeclaredField((String) "PROTECTED");
        ((Field) term84094).setAccessible(true);
        Object enum213 =  ((Field) term84094).get((Object) null);
        Class<? extends Object> term84444 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term84443 = ((Class) term84444).getDeclaredField((String) "PROTECTED");
        ((Field) term84443).setAccessible(true);
        Object enum214 =  ((Field) term84443).get((Object) null);
        ArrayList term83703 = new ArrayList();
        ((ArrayList) term83703).add(enum212);
        ((ArrayList) term83703).add(enum213);
        ((ArrayList) term83703).add(enum214);
        term83678 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition"));
        setField(term83678, term83678.getClass(), "name", "kyTUkLCRYm");
        setField(term83678, term83678.getClass(), "type", "oAotZgNUFH");
        setField(term83678, term83678.getClass(), "modifiers", term83703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Definition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TowhQcovXu";
        callMethod(klass, "setName", argTypes, term83678, args);
    }

};


