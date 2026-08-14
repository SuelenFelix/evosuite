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

public class DirectoryTreeGenerator_visit_11079975142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;
     Object term410;

    public DirectoryTreeGenerator_visit_11079975142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.generators.DirectoryTreeGenerator"));
        ArrayList term411 = new ArrayList();
        ((ArrayList) term411).add((Object)null);
        ((ArrayList) term411).add((Object)null);
        ((ArrayList) term411).add((Object)null);
        ((ArrayList) term411).add((Object)null);
        ArrayList term439 = new ArrayList();
        ((ArrayList) term439).add((Object)null);
        ((ArrayList) term439).add((Object)null);
        ((ArrayList) term439).add((Object)null);
        term410 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.Package"));
        setField(term410, term410.getClass(), "members", term411);
        setField(term410, term410.getClass(), "id", "jJCZpVmanW");
        setField(term410, term410.getClass(), "name", "EGtDIRbSSb");
        setField(term410, term410.getClass(), "relations", term439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.generators.DirectoryTreeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.Package");
        Object[] args = new Object[1];
        args[0] = term410;
        callMethod(klass, "visit", argTypes, term409, args);
    }

};


