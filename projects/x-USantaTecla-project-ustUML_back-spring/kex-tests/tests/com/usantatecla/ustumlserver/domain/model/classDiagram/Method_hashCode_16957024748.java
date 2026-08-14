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
import java.lang.Object;
import java.lang.String;

public class Method_hashCode_16957024748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44532;

    public Method_hashCode_16957024748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term44535 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term44535, term44535.getClass(), "name", "");
        setField(term44535, term44535.getClass(), "type", "");
        Object term44538 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term44538, term44538.getClass(), "name", "");
        setField(term44538, term44538.getClass(), "type", "");
        Object term44541 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term44541, term44541.getClass(), "name", "");
        setField(term44541, term44541.getClass(), "type", "");
        Object term44544 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term44544, term44544.getClass(), "name", "");
        setField(term44544, term44544.getClass(), "type", "");
        Object term44547 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term44547, term44547.getClass(), "name", "");
        setField(term44547, term44547.getClass(), "type", "");
        Object term44550 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term44550, term44550.getClass(), "name", "");
        setField(term44550, term44550.getClass(), "type", "");
        Object term44553 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term44553, term44553.getClass(), "name", "");
        setField(term44553, term44553.getClass(), "type", "");
        Object term44556 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Parameter"));
        setField(term44556, term44556.getClass(), "name", "");
        setField(term44556, term44556.getClass(), "type", "");
        ArrayList term44533 = new ArrayList();
        ((ArrayList) term44533).add(term44535);
        ((ArrayList) term44533).add(term44538);
        ((ArrayList) term44533).add(term44541);
        ((ArrayList) term44533).add(term44544);
        ((ArrayList) term44533).add(term44547);
        ((ArrayList) term44533).add(term44550);
        ((ArrayList) term44533).add(term44553);
        ((ArrayList) term44533).add(term44556);
        Class<? extends Object> term44618 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term44617 = ((Class) term44618).getDeclaredField((String) "FINAL");
        ((Field) term44617).setAccessible(true);
        Object enum115 =  ((Field) term44617).get((Object) null);
        Class<? extends Object> term44955 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term44954 = ((Class) term44955).getDeclaredField((String) "NULL");
        ((Field) term44954).setAccessible(true);
        Object enum116 =  ((Field) term44954).get((Object) null);
        ArrayList term44585 = new ArrayList();
        ((ArrayList) term44585).add(enum115);
        ((ArrayList) term44585).add(enum116);
        ((ArrayList) term44585).add(enum115);
        ((ArrayList) term44585).add(enum115);
        ((ArrayList) term44585).add(enum115);
        ((ArrayList) term44585).add(enum115);
        ((ArrayList) term44585).add(enum115);
        ((ArrayList) term44585).add(enum116);
        term44532 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term44532, term44532.getClass(), "parameters", term44533);
        setField(term44532, term44532.getClass(), "name", "kevWstoxwq");
        setField(term44532, term44532.getClass(), "type", "aSYOhFwzSm");
        setField(term44532, term44532.getClass(), "modifiers", term44585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term44532, args);
    }

};


