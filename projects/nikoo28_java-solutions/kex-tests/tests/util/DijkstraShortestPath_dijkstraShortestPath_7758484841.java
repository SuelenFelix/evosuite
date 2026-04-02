package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class DijkstraShortestPath_dijkstraShortestPath_7758484841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1323;
     Object term1346;

    public DijkstraShortestPath_dijkstraShortestPath_7758484841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1326 = new ArrayList();
        ArrayList term1330 = new ArrayList();
        ArrayList term1334 = new ArrayList();
        ArrayList term1338 = new ArrayList();
        ArrayList term1342 = new ArrayList();
        term1323 = newInstance(Class.forName("util.WeightedGraph"));
        Object[] term1325 = (Object[]) newArray("java.util.List", 5);
        setIntField(term1323, term1323.getClass(), "vertices", -97742366);
        setElement(term1325, 0, term1326);
        setElement(term1325, 1, term1330);
        setElement(term1325, 2, term1334);
        setElement(term1325, 3, term1338);
        setElement(term1325, 4, term1342);
        setField(term1323, term1323.getClass(), "adjacencyList", term1325);
        term1346 = new Integer(1638851942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DijkstraShortestPath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("util.WeightedGraph");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1323;
        args[1] = term1346;
        callMethod(klass, "dijkstraShortestPath", argTypes, null, args);
    }

};


