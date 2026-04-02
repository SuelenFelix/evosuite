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

public class WeightedGraph_removeUndirectedEdge_32132645311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1787;
     Object term1789;
     Object term1791;

    public WeightedGraph_removeUndirectedEdge_32132645311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1787 = newInstance(Class.forName("util.WeightedGraph"));
        setIntField(term1787, term1787.getClass(), "vertices", 0);
        setField(term1787, term1787.getClass(), "adjacencyList", null);
        term1789 = new Integer(0);
        term1791 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.WeightedGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1789;
        args[1] = term1791;
        callMethod(klass, "removeUndirectedEdge", argTypes, term1787, args);
    }

};


