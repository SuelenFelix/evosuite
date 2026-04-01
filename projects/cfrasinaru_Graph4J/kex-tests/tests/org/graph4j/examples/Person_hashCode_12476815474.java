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

public class Person_hashCode_12476815474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362;

    public Person_hashCode_12476815474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term379 = new ArrayList();
        ((ArrayList) term379).add((Object)null);
        ((ArrayList) term379).add((Object)null);
        ((ArrayList) term379).add((Object)null);
        ((ArrayList) term379).add((Object)null);
        ((ArrayList) term379).add((Object)null);
        ((ArrayList) term379).add((Object)null);
        Object term377 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term377, term377.getClass(), "name", "");
        setField(term377, term377.getClass(), "friends", term379);
        ArrayList term384 = new ArrayList();
        ((ArrayList) term384).add((Object)null);
        ((ArrayList) term384).add((Object)null);
        ((ArrayList) term384).add((Object)null);
        ((ArrayList) term384).add((Object)null);
        ((ArrayList) term384).add((Object)null);
        Object term382 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term382, term382.getClass(), "name", "");
        setField(term382, term382.getClass(), "friends", term384);
        ArrayList term389 = new ArrayList();
        ((ArrayList) term389).add((Object)null);
        ((ArrayList) term389).add((Object)null);
        ((ArrayList) term389).add((Object)null);
        ((ArrayList) term389).add((Object)null);
        ((ArrayList) term389).add((Object)null);
        Object term387 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term387, term387.getClass(), "name", "");
        setField(term387, term387.getClass(), "friends", term389);
        ArrayList term394 = new ArrayList();
        ((ArrayList) term394).add((Object)null);
        Object term392 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term392, term392.getClass(), "name", "");
        setField(term392, term392.getClass(), "friends", term394);
        ArrayList term375 = new ArrayList();
        ((ArrayList) term375).add(term377);
        ((ArrayList) term375).add(term382);
        ((ArrayList) term375).add(term387);
        ((ArrayList) term375).add(term377);
        ((ArrayList) term375).add(term392);
        ((ArrayList) term375).add(term387);
        term362 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term362, term362.getClass(), "name", "jUbSRrkrYZ");
        setField(term362, term362.getClass(), "friends", term375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term362, args);
    }

};


