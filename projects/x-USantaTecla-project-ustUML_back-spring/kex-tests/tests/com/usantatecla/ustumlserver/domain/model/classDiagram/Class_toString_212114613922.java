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

public class Class_toString_212114613922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33139;

    public Class_toString_212114613922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term33140 = new ArrayList();
        ArrayList term33149 = new ArrayList();
        ((ArrayList) term33149).add((Object)null);
        ((ArrayList) term33149).add((Object)null);
        ((ArrayList) term33149).add((Object)null);
        ((ArrayList) term33149).add((Object)null);
        ((ArrayList) term33149).add((Object)null);
        Object term33146 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term33146, term33146.getClass(), "name", "");
        setField(term33146, term33146.getClass(), "type", "");
        setField(term33146, term33146.getClass(), "modifiers", term33149);
        ArrayList term33155 = new ArrayList();
        Object term33152 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term33152, term33152.getClass(), "name", "");
        setField(term33152, term33152.getClass(), "type", "");
        setField(term33152, term33152.getClass(), "modifiers", term33155);
        ArrayList term33161 = new ArrayList();
        ((ArrayList) term33161).add((Object)null);
        ((ArrayList) term33161).add((Object)null);
        ((ArrayList) term33161).add((Object)null);
        ((ArrayList) term33161).add((Object)null);
        ((ArrayList) term33161).add((Object)null);
        ((ArrayList) term33161).add((Object)null);
        Object term33158 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term33158, term33158.getClass(), "name", "");
        setField(term33158, term33158.getClass(), "type", "");
        setField(term33158, term33158.getClass(), "modifiers", term33161);
        ArrayList term33167 = new ArrayList();
        ((ArrayList) term33167).add((Object)null);
        ((ArrayList) term33167).add((Object)null);
        ((ArrayList) term33167).add((Object)null);
        ((ArrayList) term33167).add((Object)null);
        Object term33164 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term33164, term33164.getClass(), "name", "");
        setField(term33164, term33164.getClass(), "type", "");
        setField(term33164, term33164.getClass(), "modifiers", term33167);
        ArrayList term33173 = new ArrayList();
        ((ArrayList) term33173).add((Object)null);
        ((ArrayList) term33173).add((Object)null);
        ((ArrayList) term33173).add((Object)null);
        ((ArrayList) term33173).add((Object)null);
        ((ArrayList) term33173).add((Object)null);
        ((ArrayList) term33173).add((Object)null);
        Object term33170 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term33170, term33170.getClass(), "name", "");
        setField(term33170, term33170.getClass(), "type", "");
        setField(term33170, term33170.getClass(), "modifiers", term33173);
        ArrayList term33144 = new ArrayList();
        ((ArrayList) term33144).add(term33146);
        ((ArrayList) term33144).add(term33152);
        ((ArrayList) term33144).add(term33158);
        ((ArrayList) term33144).add(term33164);
        ((ArrayList) term33144).add(term33170);
        ArrayList term33178 = new ArrayList();
        ArrayList term33206 = new ArrayList();
        ((ArrayList) term33206).add((Object)null);
        ((ArrayList) term33206).add((Object)null);
        ((ArrayList) term33206).add((Object)null);
        ((ArrayList) term33206).add((Object)null);
        ((ArrayList) term33206).add((Object)null);
        term33139 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term33139, term33139.getClass(), "modifiers", term33140);
        setField(term33139, term33139.getClass(), "attributes", term33144);
        setField(term33139, term33139.getClass(), "methods", term33178);
        setField(term33139, term33139.getClass(), "id", "ZKVeStsSNT");
        setField(term33139, term33139.getClass(), "name", "cqCXYaAnFB");
        setField(term33139, term33139.getClass(), "relations", term33206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term33139, args);
    }

};


