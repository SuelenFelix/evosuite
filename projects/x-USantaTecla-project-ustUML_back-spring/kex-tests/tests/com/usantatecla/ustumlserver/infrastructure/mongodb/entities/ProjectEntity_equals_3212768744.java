package com.usantatecla.ustumlserver.infrastructure.mongodb.entities;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class ProjectEntity_equals_3212768744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112012;
     Object term112045;

    public ProjectEntity_equals_3212768744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term112013 = new ArrayList();
        ((ArrayList) term112013).add((Object)null);
        ((ArrayList) term112013).add((Object)null);
        ((ArrayList) term112013).add((Object)null);
        ((ArrayList) term112013).add((Object)null);
        ((ArrayList) term112013).add((Object)null);
        ArrayList term112041 = new ArrayList();
        ((ArrayList) term112041).add((Object)null);
        ((ArrayList) term112041).add((Object)null);
        ((ArrayList) term112041).add((Object)null);
        ((ArrayList) term112041).add((Object)null);
        ((ArrayList) term112041).add((Object)null);
        term112012 = newInstance(Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity"));
        setField(term112012, term112012.getClass(), "memberEntities", term112013);
        setField(term112012, term112012.getClass(), "id", "lkujDCFpdm");
        setField(term112012, term112012.getClass(), "name", "sGfzmhpQEH");
        setField(term112012, term112012.getClass(), "relationEntities", term112041);
        term112045 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.entities.ProjectEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term112045;
        callMethod(klass, "equals", argTypes, term112012, args);
    }

};


