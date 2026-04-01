package org.graph4j.examples;

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
import static org.graph4j.examples.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Person_equals_7989948725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;
     Object term441;

    public Person_equals_7989948725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term426 = new ArrayList();
        ((ArrayList) term426).add((Object)null);
        ((ArrayList) term426).add((Object)null);
        ((ArrayList) term426).add((Object)null);
        ((ArrayList) term426).add((Object)null);
        ((ArrayList) term426).add((Object)null);
        ((ArrayList) term426).add((Object)null);
        ((ArrayList) term426).add((Object)null);
        ((ArrayList) term426).add((Object)null);
        Object term424 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term424, term424.getClass(), "name", "");
        setField(term424, term424.getClass(), "friends", term426);
        ArrayList term431 = new ArrayList();
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        ((ArrayList) term431).add((Object)null);
        Object term429 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term429, term429.getClass(), "name", "");
        setField(term429, term429.getClass(), "friends", term431);
        ArrayList term436 = new ArrayList();
        ((ArrayList) term436).add((Object)null);
        ((ArrayList) term436).add((Object)null);
        ((ArrayList) term436).add((Object)null);
        ((ArrayList) term436).add((Object)null);
        ((ArrayList) term436).add((Object)null);
        ((ArrayList) term436).add((Object)null);
        Object term434 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term434, term434.getClass(), "name", "");
        setField(term434, term434.getClass(), "friends", term436);
        ArrayList term422 = new ArrayList();
        ((ArrayList) term422).add(term424);
        ((ArrayList) term422).add(term429);
        ((ArrayList) term422).add(term434);
        ((ArrayList) term422).add(term409);
        term409 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term409, term409.getClass(), "name", "GVizqqzXpy");
        setField(term409, term409.getClass(), "friends", term422);
        term441 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.Person");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term441;
        callMethod(klass, "equals", argTypes, term409, args);
    }

};


