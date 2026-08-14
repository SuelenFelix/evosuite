package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Graph_containsEdge_9395273783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118526;

    public Graph_containsEdge_9395273783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term118531 = new Double(0.98052877651785);
        Double term118533 = new Double(0.4906639639979675);
        Double term118535 = new Double(0.4078402832279562);
        Double term118537 = new Double(0.11543135860402265);
        term118526 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term118530 = (Object[]) newArray("java.lang.Double", 4);
        setBooleanField(term118526, term118526.getClass(), "directed", true);
        setIntField(term118526, term118526.getClass(), "source", -1777445737);
        setIntField(term118526, term118526.getClass(), "target", 1876169364);
        setElement(term118530, 0, term118531);
        setElement(term118530, 1, term118533);
        setElement(term118530, 2, term118535);
        setElement(term118530, 3, term118537);
        setField(term118526, term118526.getClass(), "data", term118530);
        setField(term118526, term118526.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Graph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term118526;
        callMethod(klass, "containsEdge", argTypes, null, args);
    }

};


