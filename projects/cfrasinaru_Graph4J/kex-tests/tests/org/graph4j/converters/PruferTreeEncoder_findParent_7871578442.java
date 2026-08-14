package org.graph4j.converters;

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
import static org.graph4j.converters.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PruferTreeEncoder_findParent_7871578442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81;
     Object term100;

    public PruferTreeEncoder_findParent_7871578442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81 = newInstance(Class.forName("org.graph4j.converters.PruferTreeEncoder"));
        int[] term82 = (int[]) newIntArray(7);
        int[] term90 = (int[]) newIntArray(1);
        boolean[] term92 = (boolean[]) newBooleanArray(6);
        setIntElement(term82, 0, 590364439);
        setIntElement(term82, 1, 865208305);
        setIntElement(term82, 2, -1275173084);
        setIntElement(term82, 3, -244121226);
        setIntElement(term82, 4, -203030934);
        setIntElement(term82, 5, -1179120542);
        setIntElement(term82, 6, -73683645);
        setField(term81, term81.getClass(), "vertices", term82);
        setIntElement(term90, 0, -226514366);
        setField(term81, term81.getClass(), "degrees", term90);
        setBooleanElement(term92, 0, true);
        setBooleanElement(term92, 2, true);
        setBooleanElement(term92, 4, true);
        setField(term81, term81.getClass(), "visited", term92);
        setBooleanField(term81, term81.getClass(), "orderedVertices", true);
        setField(term81, term81.getClass(), "graph", null);
        term100 = new Integer(1193880199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.converters.PruferTreeEncoder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100;
        callMethod(klass, "findParent", argTypes, term81, args);
    }

};


