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
import java.util.LinkedList;

public class Class_addMethods_17126129154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7885;
     Object term7971;

    public Class_addMethods_17126129154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7886 = new ArrayList();
        ArrayList term7895 = new ArrayList();
        ((ArrayList) term7895).add((Object)null);
        Object term7892 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term7892, term7892.getClass(), "name", "");
        setField(term7892, term7892.getClass(), "type", "");
        setField(term7892, term7892.getClass(), "modifiers", term7895);
        ArrayList term7901 = new ArrayList();
        ((ArrayList) term7901).add((Object)null);
        ((ArrayList) term7901).add((Object)null);
        ((ArrayList) term7901).add((Object)null);
        ((ArrayList) term7901).add((Object)null);
        ((ArrayList) term7901).add((Object)null);
        ((ArrayList) term7901).add((Object)null);
        ((ArrayList) term7901).add((Object)null);
        ((ArrayList) term7901).add((Object)null);
        ((ArrayList) term7901).add((Object)null);
        Object term7898 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term7898, term7898.getClass(), "name", "");
        setField(term7898, term7898.getClass(), "type", "");
        setField(term7898, term7898.getClass(), "modifiers", term7901);
        ArrayList term7907 = new ArrayList();
        ((ArrayList) term7907).add((Object)null);
        ((ArrayList) term7907).add((Object)null);
        Object term7904 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term7904, term7904.getClass(), "name", "");
        setField(term7904, term7904.getClass(), "type", "");
        setField(term7904, term7904.getClass(), "modifiers", term7907);
        ArrayList term7890 = new ArrayList();
        ((ArrayList) term7890).add(term7892);
        ((ArrayList) term7890).add(term7898);
        ((ArrayList) term7890).add(term7904);
        ArrayList term7915 = new ArrayList();
        ((ArrayList) term7915).add((Object)null);
        ((ArrayList) term7915).add((Object)null);
        ArrayList term7920 = new ArrayList();
        ((ArrayList) term7920).add((Object)null);
        ((ArrayList) term7920).add((Object)null);
        ((ArrayList) term7920).add((Object)null);
        ((ArrayList) term7920).add((Object)null);
        ((ArrayList) term7920).add((Object)null);
        Object term7914 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term7914, term7914.getClass(), "parameters", term7915);
        setField(term7914, term7914.getClass(), "name", "");
        setField(term7914, term7914.getClass(), "type", "");
        setField(term7914, term7914.getClass(), "modifiers", term7920);
        ArrayList term7924 = new ArrayList();
        ((ArrayList) term7924).add((Object)null);
        ArrayList term7929 = new ArrayList();
        ((ArrayList) term7929).add((Object)null);
        ((ArrayList) term7929).add((Object)null);
        ((ArrayList) term7929).add((Object)null);
        ((ArrayList) term7929).add((Object)null);
        ((ArrayList) term7929).add((Object)null);
        ((ArrayList) term7929).add((Object)null);
        ((ArrayList) term7929).add((Object)null);
        ((ArrayList) term7929).add((Object)null);
        Object term7923 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term7923, term7923.getClass(), "parameters", term7924);
        setField(term7923, term7923.getClass(), "name", "");
        setField(term7923, term7923.getClass(), "type", "");
        setField(term7923, term7923.getClass(), "modifiers", term7929);
        ArrayList term7933 = new ArrayList();
        ((ArrayList) term7933).add((Object)null);
        ((ArrayList) term7933).add((Object)null);
        ((ArrayList) term7933).add((Object)null);
        ((ArrayList) term7933).add((Object)null);
        ((ArrayList) term7933).add((Object)null);
        ((ArrayList) term7933).add((Object)null);
        ((ArrayList) term7933).add((Object)null);
        ArrayList term7938 = new ArrayList();
        ((ArrayList) term7938).add((Object)null);
        ((ArrayList) term7938).add((Object)null);
        Object term7932 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term7932, term7932.getClass(), "parameters", term7933);
        setField(term7932, term7932.getClass(), "name", "");
        setField(term7932, term7932.getClass(), "type", "");
        setField(term7932, term7932.getClass(), "modifiers", term7938);
        ArrayList term7912 = new ArrayList();
        ((ArrayList) term7912).add(term7914);
        ((ArrayList) term7912).add(term7923);
        ((ArrayList) term7912).add(term7932);
        ArrayList term7967 = new ArrayList();
        ((ArrayList) term7967).add((Object)null);
        ((ArrayList) term7967).add((Object)null);
        term7885 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class"));
        setField(term7885, term7885.getClass(), "modifiers", term7886);
        setField(term7885, term7885.getClass(), "attributes", term7890);
        setField(term7885, term7885.getClass(), "methods", term7912);
        setField(term7885, term7885.getClass(), "id", "oPxuZbkYio");
        setField(term7885, term7885.getClass(), "name", "vKitydDVnM");
        setField(term7885, term7885.getClass(), "relations", term7967);
        term7971 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Class");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term7971;
        callMethod(klass, "addMethods", argTypes, term7885, args);
    }

};


