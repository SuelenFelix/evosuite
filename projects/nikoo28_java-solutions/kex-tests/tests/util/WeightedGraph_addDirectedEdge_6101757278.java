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
import java.lang.Integer;

public class WeightedGraph_addDirectedEdge_6101757278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1765;
     Object term1767;
     Object term1769;
     Object term1771;

    public WeightedGraph_addDirectedEdge_6101757278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1765 = newInstance(Class.forName("util.WeightedGraph"));
        setIntField(term1765, term1765.getClass(), "vertices", 0);
        setField(term1765, term1765.getClass(), "adjacencyList", null);
        term1767 = new Integer(0);
        term1769 = new Integer(0);
        term1771 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.WeightedGraph");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1767;
        args[1] = term1769;
        args[2] = term1771;
        callMethod(klass, "addDirectedEdge", argTypes, term1765, args);
    }

};


