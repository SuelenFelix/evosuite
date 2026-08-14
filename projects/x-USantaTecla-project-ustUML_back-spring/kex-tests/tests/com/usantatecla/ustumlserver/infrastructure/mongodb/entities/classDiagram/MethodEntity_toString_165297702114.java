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

public class MethodEntity_toString_165297702114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50470;

    public MethodEntity_toString_165297702114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50561 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term50560 = ((Class) term50561).getDeclaredField((String) "ABSTRACT");
        ((Field) term50560).setAccessible(true);
        Object enum132 =  ((Field) term50560).get((Object) null);
        Class<? extends Object> term50907 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term50906 = ((Class) term50907).getDeclaredField((String) "ABSTRACT");
        ((Field) term50906).setAccessible(true);
        Object enum133 =  ((Field) term50906).get((Object) null);
        Class<? extends Object> term51253 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term51252 = ((Class) term51253).getDeclaredField((String) "PUBLIC");
        ((Field) term51252).setAccessible(true);
        Object enum134 =  ((Field) term51252).get((Object) null);
        ArrayList term50495 = new ArrayList();
        ((ArrayList) term50495).add(enum132);
        ((ArrayList) term50495).add(enum133);
        ((ArrayList) term50495).add(enum134);
        Object term50514 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term50514, term50514.getClass(), "name", "");
        setField(term50514, term50514.getClass(), "type", "");
        Object term50517 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term50517, term50517.getClass(), "name", "");
        setField(term50517, term50517.getClass(), "type", "");
        Object term50520 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term50520, term50520.getClass(), "name", "");
        setField(term50520, term50520.getClass(), "type", "");
        Object term50523 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term50523, term50523.getClass(), "name", "");
        setField(term50523, term50523.getClass(), "type", "");
        Object term50526 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term50526, term50526.getClass(), "name", "");
        setField(term50526, term50526.getClass(), "type", "");
        Object term50529 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term50529, term50529.getClass(), "name", "");
        setField(term50529, term50529.getClass(), "type", "");
        Object term50532 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term50532, term50532.getClass(), "name", "");
        setField(term50532, term50532.getClass(), "type", "");
        Object term50535 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.ParameterEntity"));
        setField(term50535, term50535.getClass(), "name", "");
        setField(term50535, term50535.getClass(), "type", "");
        ArrayList term50512 = new ArrayList();
        ((ArrayList) term50512).add(term50514);
        ((ArrayList) term50512).add(term50517);
        ((ArrayList) term50512).add(term50520);
        ((ArrayList) term50512).add(term50523);
        ((ArrayList) term50512).add(term50526);
        ((ArrayList) term50512).add(term50529);
        ((ArrayList) term50512).add(term50532);
        ((ArrayList) term50512).add(term50535);
        term50470 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity"));
        setField(term50470, term50470.getClass(), "name", "GISHLsgALf");
        setField(term50470, term50470.getClass(), "type", "PVykkUSgBq");
        setField(term50470, term50470.getClass(), "modifiers", term50495);
        setField(term50470, term50470.getClass(), "parametersEntities", term50512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.classDiagram.MethodEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term50470, args);
    }

};


