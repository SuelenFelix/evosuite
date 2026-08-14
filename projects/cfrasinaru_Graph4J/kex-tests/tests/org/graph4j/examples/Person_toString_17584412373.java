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

public class Person_toString_17584412373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325;

    public Person_toString_17584412373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term342 = new ArrayList();
        ((ArrayList) term342).add((Object)null);
        Object term340 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term340, term340.getClass(), "name", "");
        setField(term340, term340.getClass(), "friends", term342);
        ArrayList term347 = new ArrayList();
        ((ArrayList) term347).add((Object)null);
        ((ArrayList) term347).add((Object)null);
        ((ArrayList) term347).add((Object)null);
        ((ArrayList) term347).add((Object)null);
        ((ArrayList) term347).add((Object)null);
        ((ArrayList) term347).add((Object)null);
        Object term345 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term345, term345.getClass(), "name", "");
        setField(term345, term345.getClass(), "friends", term347);
        ArrayList term338 = new ArrayList();
        ((ArrayList) term338).add(term340);
        ((ArrayList) term338).add(term345);
        term325 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term325, term325.getClass(), "name", "JUmudUmaaV");
        setField(term325, term325.getClass(), "friends", term338);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term325, args);
    }

};


