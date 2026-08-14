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

public class MaximalCliqueExample_solveProblem_19646644994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term591;

    public MaximalCliqueExample_solveProblem_19646644994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term597 = new ArrayList();
        ((ArrayList) term597).add((Object)null);
        ((ArrayList) term597).add((Object)null);
        ((ArrayList) term597).add((Object)null);
        ((ArrayList) term597).add((Object)null);
        Object term595 = newInstance(Class.forName("org.graph4j.examples.Person"));
        setField(term595, term595.getClass(), "name", "");
        setField(term595, term595.getClass(), "friends", term597);
        ArrayList term593 = new ArrayList();
        ((ArrayList) term593).add(term595);
        term591 = newInstance(Class.forName("org.graph4j.examples.MaximalCliqueExample"));
        setIntField(term591, term591.getClass(), "numPersons", 30);
        setField(term591, term591.getClass(), "persons", term593);
        setField(term591, term591.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.examples.MaximalCliqueExample");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "solveProblem", argTypes, term591, args);
    }

};


