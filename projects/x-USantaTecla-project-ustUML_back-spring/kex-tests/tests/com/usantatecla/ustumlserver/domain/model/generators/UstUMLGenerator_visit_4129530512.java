package com.usantatecla.ustumlserver.domain.model.generators;

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
import static com.usantatecla.ustumlserver.domain.model.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class UstUMLGenerator_visit_4129530512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11825;
     Object term11827;

    public UstUMLGenerator_visit_4129530512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11825 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator"));
        setIntField(term11825, term11825.getClass(), "depthLevel", 1585847225);
        ArrayList term11828 = new ArrayList();
        ((ArrayList) term11828).add((Object)null);
        ArrayList term11856 = new ArrayList();
        ((ArrayList) term11856).add((Object)null);
        ((ArrayList) term11856).add((Object)null);
        ((ArrayList) term11856).add((Object)null);
        ((ArrayList) term11856).add((Object)null);
        ((ArrayList) term11856).add((Object)null);
        ((ArrayList) term11856).add((Object)null);
        term11827 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term11827, term11827.getClass(), "members", term11828);
        setField(term11827, term11827.getClass(), "id", "lCyLIcSuom");
        setField(term11827, term11827.getClass(), "name", "CGOpQSZZwI");
        setField(term11827, term11827.getClass(), "relations", term11856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.UstUMLGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Object[] args = new Object[1];
        args[0] = term11827;
        callMethod(klass, "visit", argTypes, term11825, args);
    }

};


