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

public class Interface_InterfaceBuilderImpl_build_2887817412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2074;

    public Interface_InterfaceBuilderImpl_build_2887817412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2139 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term2138 = ((Class) term2139).getDeclaredField((String) "ABSTRACT");
        ((Field) term2138).setAccessible(true);
        Object enum5 =  ((Field) term2138).get((Object) null);
        ArrayList term2075 = new ArrayList();
        ((ArrayList) term2075).add(enum5);
        ArrayList term2084 = new ArrayList();
        ArrayList term2091 = new ArrayList();
        ((ArrayList) term2091).add((Object)null);
        ((ArrayList) term2091).add((Object)null);
        ((ArrayList) term2091).add((Object)null);
        ((ArrayList) term2091).add((Object)null);
        ((ArrayList) term2091).add((Object)null);
        ((ArrayList) term2091).add((Object)null);
        ((ArrayList) term2091).add((Object)null);
        ((ArrayList) term2091).add((Object)null);
        ArrayList term2096 = new ArrayList();
        ((ArrayList) term2096).add((Object)null);
        ((ArrayList) term2096).add((Object)null);
        ((ArrayList) term2096).add((Object)null);
        ((ArrayList) term2096).add((Object)null);
        ((ArrayList) term2096).add((Object)null);
        ((ArrayList) term2096).add((Object)null);
        Object term2090 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term2090, term2090.getClass(), "parameters", term2091);
        setField(term2090, term2090.getClass(), "name", "");
        setField(term2090, term2090.getClass(), "type", "");
        setField(term2090, term2090.getClass(), "modifiers", term2096);
        ArrayList term2100 = new ArrayList();
        ((ArrayList) term2100).add((Object)null);
        ((ArrayList) term2100).add((Object)null);
        ArrayList term2105 = new ArrayList();
        ((ArrayList) term2105).add((Object)null);
        Object term2099 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term2099, term2099.getClass(), "parameters", term2100);
        setField(term2099, term2099.getClass(), "name", "");
        setField(term2099, term2099.getClass(), "type", "");
        setField(term2099, term2099.getClass(), "modifiers", term2105);
        ArrayList term2088 = new ArrayList();
        ((ArrayList) term2088).add(term2090);
        ((ArrayList) term2088).add(term2099);
        ArrayList term2134 = new ArrayList();
        ((ArrayList) term2134).add((Object)null);
        ((ArrayList) term2134).add((Object)null);
        ((ArrayList) term2134).add((Object)null);
        ((ArrayList) term2134).add((Object)null);
        ((ArrayList) term2134).add((Object)null);
        ((ArrayList) term2134).add((Object)null);
        ((ArrayList) term2134).add((Object)null);
        ((ArrayList) term2134).add((Object)null);
        ((ArrayList) term2134).add((Object)null);
        term2074 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Interface$InterfaceBuilderImpl"));
        setField(term2074, term2074.getClass(), "modifiers", term2075);
        setField(term2074, term2074.getClass(), "attributes", term2084);
        setField(term2074, term2074.getClass(), "methods", term2088);
        setField(term2074, term2074.getClass(), "id", "nHXjMycHlU");
        setField(term2074, term2074.getClass(), "name", "ieCtQFdkii");
        setField(term2074, term2074.getClass(), "relations", term2134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Interface$InterfaceBuilderImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term2074, args);
    }

};


