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
import java.util.HashMap;
import java.lang.Integer;

public class AdjacencyListGraph_removeEdge_19109430734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2567;
     Object term2573;
     Object term2575;

    public AdjacencyListGraph_removeEdge_19109430734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2568 = new HashMap();
        term2567 = newInstance(Class.forName("util.AdjacencyListGraph"));
        setField(term2567, term2567.getClass(), "adjacencyList", term2568);
        term2573 = new Integer(-1079020032);
        term2575 = new Integer(-1973791064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.AdjacencyListGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2573;
        args[1] = term2575;
        callMethod(klass, "removeEdge", argTypes, term2567, args);
    }

};


