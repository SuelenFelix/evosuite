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

public class MaximalCliqueExample_createGraph_9079037133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550;

    public MaximalCliqueExample_createGraph_9079037133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term556 = new ArrayList();
        ((ArrayList) term556).add((Object)null);
        ((ArrayList) term556).add((Object)null);
        ((ArrayList) term556).add((Object)null);
        ((ArrayList) term556).add((Object)null);
        ((ArrayList) term556).add((Object)null);
        ((ArrayList) term556).add((Object)null);
        ((ArrayList) term556).add((Object)null);
        Object term554 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term554, term554.getClass(), "name", "");
        setField(term554, term554.getClass(), "friends", term556);
        ArrayList term561 = new ArrayList();
        ((ArrayList) term561).add((Object)null);
        ((ArrayList) term561).add((Object)null);
        ((ArrayList) term561).add((Object)null);
        ((ArrayList) term561).add((Object)null);
        ((ArrayList) term561).add((Object)null);
        Object term559 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term559, term559.getClass(), "name", "");
        setField(term559, term559.getClass(), "friends", term561);
        ArrayList term566 = new ArrayList();
        ((ArrayList) term566).add((Object)null);
        ((ArrayList) term566).add((Object)null);
        ((ArrayList) term566).add((Object)null);
        ((ArrayList) term566).add((Object)null);
        ((ArrayList) term566).add((Object)null);
        Object term564 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term564, term564.getClass(), "name", "");
        setField(term564, term564.getClass(), "friends", term566);
        ArrayList term571 = new ArrayList();
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        ((ArrayList) term571).add((Object)null);
        Object term569 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term569, term569.getClass(), "name", "");
        setField(term569, term569.getClass(), "friends", term571);
        ArrayList term576 = new ArrayList();
        ((ArrayList) term576).add((Object)null);
        ((ArrayList) term576).add((Object)null);
        ((ArrayList) term576).add((Object)null);
        ((ArrayList) term576).add((Object)null);
        ((ArrayList) term576).add((Object)null);
        ((ArrayList) term576).add((Object)null);
        Object term574 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term574, term574.getClass(), "name", "");
        setField(term574, term574.getClass(), "friends", term576);
        ArrayList term581 = new ArrayList();
        ((ArrayList) term581).add((Object)null);
        Object term579 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term579, term579.getClass(), "name", "");
        setField(term579, term579.getClass(), "friends", term581);
        ArrayList term586 = new ArrayList();
        ((ArrayList) term586).add((Object)null);
        ((ArrayList) term586).add((Object)null);
        ((ArrayList) term586).add((Object)null);
        ((ArrayList) term586).add((Object)null);
        ((ArrayList) term586).add((Object)null);
        ((ArrayList) term586).add((Object)null);
        Object term584 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term584, term584.getClass(), "name", "");
        setField(term584, term584.getClass(), "friends", term586);
        ArrayList term552 = new ArrayList();
        ((ArrayList) term552).add(term554);
        ((ArrayList) term552).add(term559);
        ((ArrayList) term552).add(term564);
        ((ArrayList) term552).add(term569);
        ((ArrayList) term552).add(term574);
        ((ArrayList) term552).add(term579);
        ((ArrayList) term552).add(term559);
        ((ArrayList) term552).add(term584);
        ((ArrayList) term552).add(term564);
        term550 = newInstance(Class.forName("org.graph4j.examples.MaximalCliqueExample"));
        setIntField(term550, term550.getClass(), "numPersons", 30);
        setField(term550, term550.getClass(), "persons", term552);
        setField(term550, term550.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.MaximalCliqueExample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createGraph", argTypes, term550, args);
    }

};


