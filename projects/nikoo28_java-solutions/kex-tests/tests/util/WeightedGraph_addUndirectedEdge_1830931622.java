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

public class WeightedGraph_addUndirectedEdge_1830931622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1594;
     Object term1621;
     Object term1623;
     Object term1625;

    public WeightedGraph_addUndirectedEdge_1830931622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1597 = new ArrayList();
        ArrayList term1601 = new ArrayList();
        ArrayList term1605 = new ArrayList();
        ArrayList term1609 = new ArrayList();
        ArrayList term1613 = new ArrayList();
        ArrayList term1617 = new ArrayList();
        term1594 = newInstance(Class.forName("util.WeightedGraph"));
        Object[] term1596 = (Object[]) newArray("java.util.List", 6);
        setIntField(term1594, term1594.getClass(), "vertices", -19246901);
        setElement(term1596, 0, term1597);
        setElement(term1596, 1, term1601);
        setElement(term1596, 2, term1605);
        setElement(term1596, 3, term1609);
        setElement(term1596, 4, term1613);
        setElement(term1596, 5, term1617);
        setField(term1594, term1594.getClass(), "adjacencyList", term1596);
        term1621 = new Integer(-370828664);
        term1623 = new Integer(1168633950);
        term1625 = new Integer(1607082164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.WeightedGraph");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1621;
        args[1] = term1623;
        args[2] = term1625;
        callMethod(klass, "addUndirectedEdge", argTypes, term1594, args);
    }

};


