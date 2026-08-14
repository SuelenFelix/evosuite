package com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils;

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
import static com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class MemberEntityFinder_visit_17434032166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2839;

    public MemberEntityFinder_visit_17434032166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2955 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term2954 = ((Class) term2955).getDeclaredField((String) "PUBLIC");
        ((Field) term2954).setAccessible(true);
        Object enum6 =  ((Field) term2954).get((Object) null);
        Class<? extends Object> term3295 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term3294 = ((Class) term3295).getDeclaredField((String) "STATIC");
        ((Field) term3294).setAccessible(true);
        Object enum7 =  ((Field) term3294).get((Object) null);
        Class<? extends Object> term3635 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term3634 = ((Class) term3635).getDeclaredField((String) "FINAL");
        ((Field) term3634).setAccessible(true);
        Object enum8 =  ((Field) term3634).get((Object) null);
        Class<? extends Object> term3972 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term3971 = ((Class) term3972).getDeclaredField((String) "PRIVATE");
        ((Field) term3971).setAccessible(true);
        Object enum9 =  ((Field) term3971).get((Object) null);
        Class<? extends Object> term4315 = Class.forName((String) "com.usantatecla.ustumlserver.domain.model.classDiagram.Modifier");
        Field term4314 = ((Class) term4315).getDeclaredField((String) "PRIVATE");
        ((Field) term4314).setAccessible(true);
        Object enum10 =  ((Field) term4314).get((Object) null);
        ArrayList term2840 = new ArrayList();
        ((ArrayList) term2840).add(enum6);
        ((ArrayList) term2840).add(enum7);
        ((ArrayList) term2840).add(enum8);
        ((ArrayList) term2840).add(enum8);
        ((ArrayList) term2840).add(enum9);
        ((ArrayList) term2840).add(enum10);
        ((ArrayList) term2840).add(enum10);
        ArrayList term2872 = new ArrayList();
        ((ArrayList) term2872).add((Object)null);
        ((ArrayList) term2872).add((Object)null);
        ((ArrayList) term2872).add((Object)null);
        ((ArrayList) term2872).add((Object)null);
        ((ArrayList) term2872).add((Object)null);
        Object term2869 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Attribute"));
        setField(term2869, term2869.getClass(), "name", "");
        setField(term2869, term2869.getClass(), "type", "");
        setField(term2869, term2869.getClass(), "modifiers", term2872);
        ArrayList term2867 = new ArrayList();
        ((ArrayList) term2867).add(term2869);
        ArrayList term2880 = new ArrayList();
        ((ArrayList) term2880).add((Object)null);
        ((ArrayList) term2880).add((Object)null);
        ((ArrayList) term2880).add((Object)null);
        ((ArrayList) term2880).add((Object)null);
        ArrayList term2885 = new ArrayList();
        ((ArrayList) term2885).add((Object)null);
        Object term2879 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term2879, term2879.getClass(), "parameters", term2880);
        setField(term2879, term2879.getClass(), "name", "");
        setField(term2879, term2879.getClass(), "type", "");
        setField(term2879, term2879.getClass(), "modifiers", term2885);
        ArrayList term2889 = new ArrayList();
        ((ArrayList) term2889).add((Object)null);
        ((ArrayList) term2889).add((Object)null);
        ArrayList term2894 = new ArrayList();
        ((ArrayList) term2894).add((Object)null);
        ((ArrayList) term2894).add((Object)null);
        ((ArrayList) term2894).add((Object)null);
        ((ArrayList) term2894).add((Object)null);
        ((ArrayList) term2894).add((Object)null);
        ((ArrayList) term2894).add((Object)null);
        Object term2888 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term2888, term2888.getClass(), "parameters", term2889);
        setField(term2888, term2888.getClass(), "name", "");
        setField(term2888, term2888.getClass(), "type", "");
        setField(term2888, term2888.getClass(), "modifiers", term2894);
        ArrayList term2898 = new ArrayList();
        ((ArrayList) term2898).add((Object)null);
        ArrayList term2903 = new ArrayList();
        ((ArrayList) term2903).add((Object)null);
        Object term2897 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term2897, term2897.getClass(), "parameters", term2898);
        setField(term2897, term2897.getClass(), "name", "");
        setField(term2897, term2897.getClass(), "type", "");
        setField(term2897, term2897.getClass(), "modifiers", term2903);
        ArrayList term2907 = new ArrayList();
        ((ArrayList) term2907).add((Object)null);
        ((ArrayList) term2907).add((Object)null);
        ArrayList term2912 = new ArrayList();
        ((ArrayList) term2912).add((Object)null);
        ((ArrayList) term2912).add((Object)null);
        ((ArrayList) term2912).add((Object)null);
        Object term2906 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term2906, term2906.getClass(), "parameters", term2907);
        setField(term2906, term2906.getClass(), "name", "");
        setField(term2906, term2906.getClass(), "type", "");
        setField(term2906, term2906.getClass(), "modifiers", term2912);
        ArrayList term2916 = new ArrayList();
        ((ArrayList) term2916).add((Object)null);
        ((ArrayList) term2916).add((Object)null);
        ((ArrayList) term2916).add((Object)null);
        ((ArrayList) term2916).add((Object)null);
        ArrayList term2921 = new ArrayList();
        ((ArrayList) term2921).add((Object)null);
        ((ArrayList) term2921).add((Object)null);
        ((ArrayList) term2921).add((Object)null);
        ((ArrayList) term2921).add((Object)null);
        ((ArrayList) term2921).add((Object)null);
        ((ArrayList) term2921).add((Object)null);
        ((ArrayList) term2921).add((Object)null);
        ((ArrayList) term2921).add((Object)null);
        ((ArrayList) term2921).add((Object)null);
        Object term2915 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Method"));
        setField(term2915, term2915.getClass(), "parameters", term2916);
        setField(term2915, term2915.getClass(), "name", "");
        setField(term2915, term2915.getClass(), "type", "");
        setField(term2915, term2915.getClass(), "modifiers", term2921);
        ArrayList term2877 = new ArrayList();
        ((ArrayList) term2877).add(term2879);
        ((ArrayList) term2877).add(term2888);
        ((ArrayList) term2877).add(term2897);
        ((ArrayList) term2877).add(term2906);
        ((ArrayList) term2877).add(term2915);
        ArrayList term2950 = new ArrayList();
        ((ArrayList) term2950).add((Object)null);
        ((ArrayList) term2950).add((Object)null);
        ((ArrayList) term2950).add((Object)null);
        ((ArrayList) term2950).add((Object)null);
        term2839 = newInstance(Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Interface"));
        setField(term2839, term2839.getClass(), "modifiers", term2840);
        setField(term2839, term2839.getClass(), "attributes", term2867);
        setField(term2839, term2839.getClass(), "methods", term2877);
        setField(term2839, term2839.getClass(), "id", "MAcUBcBckh");
        setField(term2839, term2839.getClass(), "name", "oVgzLbrsFr");
        setField(term2839, term2839.getClass(), "relations", term2950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.usantatecla.ustumlserver.infrastructure.mongodb.persistence.utils.MemberEntityFinder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.usantatecla.ustumlserver.domain.model.classDiagram.Interface");
        Object[] args = new Object[1];
        args[0] = term2839;
        callMethod(klass, "visit", argTypes, null, args);
    }

};


