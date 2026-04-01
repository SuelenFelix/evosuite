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

public class MaximalCliqueExample_createUserModel_17526794412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term524;

    public MaximalCliqueExample_createUserModel_17526794412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term530 = new ArrayList();
        ((ArrayList) term530).add((Object)null);
        ((ArrayList) term530).add((Object)null);
        Object term528 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term528, term528.getClass(), "name", "");
        setField(term528, term528.getClass(), "friends", term530);
        ArrayList term535 = new ArrayList();
        ((ArrayList) term535).add((Object)null);
        ((ArrayList) term535).add((Object)null);
        Object term533 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term533, term533.getClass(), "name", "");
        setField(term533, term533.getClass(), "friends", term535);
        ArrayList term540 = new ArrayList();
        ((ArrayList) term540).add((Object)null);
        ((ArrayList) term540).add((Object)null);
        ((ArrayList) term540).add((Object)null);
        ((ArrayList) term540).add((Object)null);
        ((ArrayList) term540).add((Object)null);
        ((ArrayList) term540).add((Object)null);
        Object term538 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term538, term538.getClass(), "name", "");
        setField(term538, term538.getClass(), "friends", term540);
        ArrayList term545 = new ArrayList();
        ((ArrayList) term545).add((Object)null);
        ((ArrayList) term545).add((Object)null);
        ((ArrayList) term545).add((Object)null);
        ((ArrayList) term545).add((Object)null);
        ((ArrayList) term545).add((Object)null);
        ((ArrayList) term545).add((Object)null);
        ((ArrayList) term545).add((Object)null);
        Object term543 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term543, term543.getClass(), "name", "");
        setField(term543, term543.getClass(), "friends", term545);
        ArrayList term526 = new ArrayList();
        ((ArrayList) term526).add(term528);
        ((ArrayList) term526).add(term533);
        ((ArrayList) term526).add(term538);
        ((ArrayList) term526).add(term543);
        term524 = newInstance(Class.forName("org.graph4j.examples.MaximalCliqueExample"));
        setIntField(term524, term524.getClass(), "numPersons", 30);
        setField(term524, term524.getClass(), "persons", term526);
        setField(term524, term524.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.MaximalCliqueExample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createUserModel", argTypes, term524, args);
    }

};


