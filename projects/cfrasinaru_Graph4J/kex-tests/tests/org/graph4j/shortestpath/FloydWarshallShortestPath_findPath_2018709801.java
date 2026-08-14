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

public class FloydWarshallShortestPath_findPath_2018709801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1011;
     Object term1040;
     Object term1042;

    public FloydWarshallShortestPath_findPath_2018709801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1011 = newInstance(Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath"));
        Object[] term1012 = (Object[]) newArray("[D", 5);
        double[] term1013 = (double[]) newDoubleArray(3);
        double[] term1017 = (double[]) newDoubleArray(4);
        double[] term1022 = (double[]) newDoubleArray(8);
        double[] term1031 = (double[]) newDoubleArray(0);
        double[] term1032 = (double[]) newDoubleArray(4);
        Object[] term1037 = (Object[]) newArray("[I", 1);
        int[] term1038 = (int[]) newIntArray(0);
        setDoubleElement(term1013, 0, 0.33871772875627537);
        setDoubleElement(term1013, 1, 0.9952003100858836);
        setDoubleElement(term1013, 2, 0.22059525284415726);
        setElement(term1012, 0, term1013);
        setDoubleElement(term1017, 0, 0.281059649526194);
        setDoubleElement(term1017, 1, 0.049786419821445604);
        setDoubleElement(term1017, 2, 0.8814078959581401);
        setDoubleElement(term1017, 3, 0.47210750955444725);
        setElement(term1012, 1, term1017);
        setDoubleElement(term1022, 0, 0.8381176594884352);
        setDoubleElement(term1022, 1, 0.23070800524236523);
        setDoubleElement(term1022, 2, 0.4337266793917268);
        setDoubleElement(term1022, 3, 0.11979392765421404);
        setDoubleElement(term1022, 4, 0.4555542221910589);
        setDoubleElement(term1022, 5, 0.9938727080758785);
        setDoubleElement(term1022, 6, 0.39416780533640805);
        setDoubleElement(term1022, 7, 0.5384156574050297);
        setElement(term1012, 2, term1022);
        setElement(term1012, 3, term1031);
        setDoubleElement(term1032, 0, 0.28813953022653416);
        setDoubleElement(term1032, 1, 0.6221715730666386);
        setDoubleElement(term1032, 2, 0.6375926466054153);
        setDoubleElement(term1032, 3, 0.6933516214415875);
        setElement(term1012, 4, term1032);
        setField(term1011, term1011.getClass(), "cost", term1012);
        setElement(term1037, 0, term1038);
        setField(term1011, term1011.getClass(), "before", term1037);
        setField(term1011, term1011.getClass(), "graph", null);
        setBooleanField(term1011, term1011.getClass(), "directed", true);
        term1040 = new Integer(1202361360);
        term1042 = new Integer(-2015048153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1040;
        args[1] = term1042;
        callMethod(klass, "findPath", argTypes, term1011, args);
    }

};


