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

public class WeightedGraph_removeUndirectedEdge_3213264534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1658;
     Object term1669;
     Object term1671;

    public WeightedGraph_removeUndirectedEdge_3213264534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1661 = new ArrayList();
        ArrayList term1665 = new ArrayList();
        term1658 = newInstance(Class.forName("util.WeightedGraph"));
        Object[] term1660 = (Object[]) newArray("java.util.List", 2);
        setIntField(term1658, term1658.getClass(), "vertices", 91958879);
        setElement(term1660, 0, term1661);
        setElement(term1660, 1, term1665);
        setField(term1658, term1658.getClass(), "adjacencyList", term1660);
        term1669 = new Integer(-645429025);
        term1671 = new Integer(-688213483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.WeightedGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1669;
        args[1] = term1671;
        callMethod(klass, "removeUndirectedEdge", argTypes, term1658, args);
    }

};


