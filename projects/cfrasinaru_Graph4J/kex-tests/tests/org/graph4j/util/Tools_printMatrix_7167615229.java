package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Tools_printMatrix_7167615229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10841;
     Object term10851;

    public Tools_printMatrix_7167615229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10841 = (Object[]) newArray("[D", 1);
        double[] term10842 = (double[]) newDoubleArray(8);
        setDoubleElement(term10842, 0, 0.8823181080774973);
        setDoubleElement(term10842, 1, 0.2192450926212024);
        setDoubleElement(term10842, 2, 0.7591353014991907);
        setDoubleElement(term10842, 3, 0.791695029600875);
        setDoubleElement(term10842, 4, 0.6862221294683138);
        setDoubleElement(term10842, 5, 0.15917839663695388);
        setDoubleElement(term10842, 6, 0.9374115574082594);
        setDoubleElement(term10842, 7, 0.8454723071922143);
        setElement(term10841, 0, term10842);
        term10851 = new Integer(-309827965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10841;
        args[1] = term10851;
        callMethod(klass, "printMatrix", argTypes, null, args);
    }

};


