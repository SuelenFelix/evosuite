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

public class WeightedGraph_removeDirectedEdge_20019764983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1627;
     Object term1654;
     Object term1656;

    public WeightedGraph_removeDirectedEdge_20019764983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1630 = new ArrayList();
        ArrayList term1634 = new ArrayList();
        ArrayList term1638 = new ArrayList();
        ArrayList term1642 = new ArrayList();
        ArrayList term1646 = new ArrayList();
        ArrayList term1650 = new ArrayList();
        term1627 = newInstance(Class.forName("util.WeightedGraph"));
        Object[] term1629 = (Object[]) newArray("java.util.List", 6);
        setIntField(term1627, term1627.getClass(), "vertices", 1890399366);
        setElement(term1629, 0, term1630);
        setElement(term1629, 1, term1634);
        setElement(term1629, 2, term1638);
        setElement(term1629, 3, term1642);
        setElement(term1629, 4, term1646);
        setElement(term1629, 5, term1650);
        setField(term1627, term1627.getClass(), "adjacencyList", term1629);
        term1654 = new Integer(-1867239125);
        term1656 = new Integer(952869601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.WeightedGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1654;
        args[1] = term1656;
        callMethod(klass, "removeDirectedEdge", argTypes, term1627, args);
    }

};


