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

public class GraphColoring_colorGraph_1888748141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1931;
     Object term1932;

    public GraphColoring_colorGraph_1888748141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1931 = newInstance(Class.forName("util.GraphColoring"));
        term1932 = newInstance(Class.forName("util.WeightedGraph"));
        Object[] term1934 = (Object[]) newArray("java.util.List", 0);
        setIntField(term1932, term1932.getClass(), "vertices", 934477462);
        setField(term1932, term1932.getClass(), "adjacencyList", term1934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.GraphColoring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.WeightedGraph");
        Object[] args = new Object[1];
        args[0] = term1932;
        callMethod(klass, "colorGraph", argTypes, term1931, args);
    }

};


