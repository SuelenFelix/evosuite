package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class JohnsonShortestPath_getPathWeight_17576081054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70990;
     Object term71016;
     Object term71018;

    public JohnsonShortestPath_getPathWeight_17576081054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70990 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term70991 = (double[]) newDoubleArray(0);
        Object[] term70992 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 8);
        Object[] term70993 = (Object[]) newArray("[D", 4);
        double[] term70994 = (double[]) newDoubleArray(1);
        double[] term70996 = (double[]) newDoubleArray(0);
        double[] term70997 = (double[]) newDoubleArray(9);
        double[] term71007 = (double[]) newDoubleArray(7);
        setField(term70990, term70990.getClass(), "auxGraph", null);
        setField(term70990, term70990.getClass(), "h", term70991);
        setField(term70990, term70990.getClass(), "algs", term70992);
        setDoubleElement(term70994, 0, 0.048158861470667724);
        setElement(term70993, 0, term70994);
        setElement(term70993, 1, term70996);
        setDoubleElement(term70997, 0, 0.962224635527715);
        setDoubleElement(term70997, 1, 0.3902214023005367);
        setDoubleElement(term70997, 2, 0.572530789747374);
        setDoubleElement(term70997, 3, 0.9299698234419386);
        setDoubleElement(term70997, 4, 0.18295306869593786);
        setDoubleElement(term70997, 5, 0.6254164937751863);
        setDoubleElement(term70997, 6, 0.8585420370032856);
        setDoubleElement(term70997, 7, 0.6422709490368054);
        setDoubleElement(term70997, 8, 0.10291377388613854);
        setElement(term70993, 2, term70997);
        setDoubleElement(term71007, 0, 0.8050088946994343);
        setDoubleElement(term71007, 1, 0.7989371246643056);
        setDoubleElement(term71007, 2, 0.9172275381317997);
        setDoubleElement(term71007, 3, 0.7663558242705327);
        setDoubleElement(term71007, 4, 0.9318107547916823);
        setDoubleElement(term71007, 5, 0.5310672421115092);
        setDoubleElement(term71007, 6, 0.40512056466346225);
        setElement(term70993, 3, term71007);
        setField(term70990, term70990.getClass(), "weights", term70993);
        setField(term70990, term70990.getClass(), "graph", null);
        setBooleanField(term70990, term70990.getClass(), "directed", false);
        term71016 = new Integer(1160843153);
        term71018 = new Integer(1818052325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term71016;
        args[1] = term71018;
        callMethod(klass, "getPathWeight", argTypes, term70990, args);
    }

};


