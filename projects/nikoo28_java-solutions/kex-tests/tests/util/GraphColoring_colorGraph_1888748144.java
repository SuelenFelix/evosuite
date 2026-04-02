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

public class GraphColoring_colorGraph_1888748144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2134;

    public GraphColoring_colorGraph_1888748144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2134 = newInstance(Class.forName("util.GraphColoring"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.GraphColoring");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.WeightedGraph");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "colorGraph", argTypes, term2134, args);
    }

};


