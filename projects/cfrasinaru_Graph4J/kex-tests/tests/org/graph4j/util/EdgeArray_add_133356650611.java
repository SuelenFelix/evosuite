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
import java.lang.Double;

public class EdgeArray_add_133356650611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1467;
     Object term1496;

    public EdgeArray_add_133356650611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1467 = newInstance(Class.forName("org.graph4j.util.EdgeArray"));
        Object[] term1468 = (Object[]) newArray("[I", 3);
        int[] term1469 = (int[]) newIntArray(5);
        int[] term1475 = (int[]) newIntArray(9);
        int[] term1485 = (int[]) newIntArray(9);
        setField(term1467, term1467.getClass(), "graph", null);
        setIntElement(term1469, 0, -2143043890);
        setIntElement(term1469, 1, -2138825831);
        setIntElement(term1469, 2, 1454781562);
        setIntElement(term1469, 3, -27944011);
        setIntElement(term1469, 4, -20614472);
        setElement(term1468, 0, term1469);
        setIntElement(term1475, 0, 1126618861);
        setIntElement(term1475, 1, 947449400);
        setIntElement(term1475, 2, -763799087);
        setIntElement(term1475, 3, 1207142014);
        setIntElement(term1475, 4, -876426634);
        setIntElement(term1475, 5, 213831054);
        setIntElement(term1475, 6, 330043745);
        setIntElement(term1475, 7, -509349195);
        setIntElement(term1475, 8, -1639041228);
        setElement(term1468, 1, term1475);
        setIntElement(term1485, 0, 2027686272);
        setIntElement(term1485, 1, -1494356104);
        setIntElement(term1485, 2, -695279311);
        setIntElement(term1485, 3, 114279242);
        setIntElement(term1485, 4, 990883365);
        setIntElement(term1485, 5, 633598642);
        setIntElement(term1485, 6, 1862841859);
        setIntElement(term1485, 7, -1114668574);
        setIntElement(term1485, 8, 514511037);
        setElement(term1468, 2, term1485);
        setField(term1467, term1467.getClass(), "edges", term1468);
        setIntField(term1467, term1467.getClass(), "numEdges", 1713573821);
        Double term1501 = new Double(0.2852810965221698);
        Double term1503 = new Double(0.6300849762307866);
        Double term1505 = new Double(0.9737083944266686);
        Double term1507 = new Double(0.0668892744806211);
        Double term1509 = new Double(0.3587267442738795);
        Double term1511 = new Double(0.07802449704920456);
        term1496 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term1500 = (Object[]) newArray("java.lang.Double", 6);
        setBooleanField(term1496, term1496.getClass(), "directed", true);
        setIntField(term1496, term1496.getClass(), "source", 1956590498);
        setIntField(term1496, term1496.getClass(), "target", 1467356494);
        setElement(term1500, 0, term1501);
        setElement(term1500, 1, term1503);
        setElement(term1500, 2, term1505);
        setElement(term1500, 3, term1507);
        setElement(term1500, 4, term1509);
        setElement(term1500, 5, term1511);
        setField(term1496, term1496.getClass(), "data", term1500);
        setField(term1496, term1496.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeArray");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term1496;
        callMethod(klass, "add", argTypes, term1467, args);
    }

};


