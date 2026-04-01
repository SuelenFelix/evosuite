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

public class Person_getFriends_15403169512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273;

    public Person_getFriends_15403169512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term290 = new ArrayList();
        ((ArrayList) term290).add((Object)null);
        ((ArrayList) term290).add((Object)null);
        ((ArrayList) term290).add((Object)null);
        ((ArrayList) term290).add((Object)null);
        ((ArrayList) term290).add((Object)null);
        Object term288 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term288, term288.getClass(), "name", "");
        setField(term288, term288.getClass(), "friends", term290);
        ArrayList term295 = new ArrayList();
        Object term293 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term293, term293.getClass(), "name", "");
        setField(term293, term293.getClass(), "friends", term295);
        ArrayList term300 = new ArrayList();
        ((ArrayList) term300).add((Object)null);
        ((ArrayList) term300).add((Object)null);
        ((ArrayList) term300).add((Object)null);
        ((ArrayList) term300).add((Object)null);
        ((ArrayList) term300).add((Object)null);
        ((ArrayList) term300).add((Object)null);
        ((ArrayList) term300).add((Object)null);
        ((ArrayList) term300).add((Object)null);
        Object term298 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term298, term298.getClass(), "name", "");
        setField(term298, term298.getClass(), "friends", term300);
        ArrayList term305 = new ArrayList();
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        ((ArrayList) term305).add((Object)null);
        Object term303 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term303, term303.getClass(), "name", "");
        setField(term303, term303.getClass(), "friends", term305);
        ArrayList term310 = new ArrayList();
        ((ArrayList) term310).add((Object)null);
        ((ArrayList) term310).add((Object)null);
        ((ArrayList) term310).add((Object)null);
        ((ArrayList) term310).add((Object)null);
        ((ArrayList) term310).add((Object)null);
        Object term308 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term308, term308.getClass(), "name", "");
        setField(term308, term308.getClass(), "friends", term310);
        ArrayList term286 = new ArrayList();
        ((ArrayList) term286).add(term288);
        ((ArrayList) term286).add(term293);
        ((ArrayList) term286).add(term298);
        ((ArrayList) term286).add(term303);
        ((ArrayList) term286).add(term308);
        ((ArrayList) term286).add(term293);
        term273 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term273, term273.getClass(), "name", "hoicvmsovO");
        setField(term273, term273.getClass(), "friends", term286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.Person");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFriends", argTypes, term273, args);
    }

};


