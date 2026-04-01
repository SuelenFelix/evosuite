package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RandomGnpGraphGenerator_createEdges_44839343511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term627;

    public RandomGnpGraphGenerator_createEdges_44839343511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term627 = newInstance(Class.forName("org.graph4j.generators.RandomGnpGraphGenerator"));
        int[] term629 = (int[]) newIntArray(8);
        setDoubleField(term627, term627.getClass(), "edgeProbability", 0.11493000848982304);
        setIntElement(term629, 0, -1410220680);
        setIntElement(term629, 1, 389427431);
        setIntElement(term629, 2, -1945706126);
        setIntElement(term629, 3, 1152356969);
        setIntElement(term629, 4, -1667990367);
        setIntElement(term629, 5, -1214628358);
        setIntElement(term629, 6, 1102721075);
        setIntElement(term629, 7, -426764678);
        setField(term627, term627.getClass(), "vertices", term629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnpGraphGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createEdges", argTypes, term627, args);
    }

};


