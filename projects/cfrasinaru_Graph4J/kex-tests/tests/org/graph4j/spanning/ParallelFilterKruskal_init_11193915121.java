package org.graph4j.spanning;

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
import static org.graph4j.spanning.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class ParallelFilterKruskal_init_11193915121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1485;
     Object term1498;
     Object term1522;

    public ParallelFilterKruskal_init_11193915121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1485 = newInstance(Class.forName("org.graph4j.util.UnionFind"));
        int[] term1488 = (int[]) newIntArray(8);
        setIntField(term1485, term1485.getClass(), "numVertices", 1074848808);
        setBooleanField(term1485, term1485.getClass(), "pathCompression", true);
        setIntElement(term1488, 0, -146054762);
        setIntElement(term1488, 1, 798043553);
        setIntElement(term1488, 2, 533197381);
        setIntElement(term1488, 3, 1048271679);
        setIntElement(term1488, 4, -1529797673);
        setIntElement(term1488, 5, -868676396);
        setIntElement(term1488, 6, 1922684808);
        setIntElement(term1488, 7, -2005784375);
        setField(term1485, term1485.getClass(), "parent", term1488);
        setIntField(term1485, term1485.getClass(), "numSets", -288604325);
        Double term1504 = new Double(0.5375131002500685);
        Double term1506 = new Double(0.8347207486220592);
        Double term1508 = new Double(0.6121208871391735);
        Double term1510 = new Double(0.7727907711525114);
        Double term1512 = new Double(0.01895872020734357);
        Double term1514 = new Double(0.2736100778332827);
        Double term1516 = new Double(0.3629389093951403);
        Double term1518 = new Double(0.5048764503874877);
        Double term1520 = new Double(0.18688693015118896);
        term1498 = (Object[]) newArray("org.graph4j.Edge", 1);
        Object term1499 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1503 = (Object[]) newArray("java.lang.Double", 9);
        setBooleanField(term1499, term1499.getClass(), "directed", false);
        setIntField(term1499, term1499.getClass(), "source", -1268314569);
        setIntField(term1499, term1499.getClass(), "target", 877649659);
        setElement(term1503, 0, term1504);
        setElement(term1503, 1, term1506);
        setElement(term1503, 2, term1508);
        setElement(term1503, 3, term1510);
        setElement(term1503, 4, term1512);
        setElement(term1503, 5, term1514);
        setElement(term1503, 6, term1516);
        setElement(term1503, 7, term1518);
        setElement(term1503, 8, term1520);
        setField(term1499, term1499.getClass(), "data", term1503);
        setField(term1499, term1499.getClass(), "label", null);
        setElement(term1498, 0, term1499);
        term1522 = newInstance(Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble"));
        setDoubleField(term1522, term1522.getClass(), "value", 0.1374549299694151);
        setField(term1522, term1522.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.spanning.ParallelFilterKruskal");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.Graph");
        argTypes[2] = Class.forName("org.graph4j.util.UnionFind");
        argTypes[3] = Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass();
        argTypes[4] = Class.forName("org.graph4j.spanning.ParallelFilterKruskal$MutableDouble");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term1485;
        args[3] = term1498;
        args[4] = term1522;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


