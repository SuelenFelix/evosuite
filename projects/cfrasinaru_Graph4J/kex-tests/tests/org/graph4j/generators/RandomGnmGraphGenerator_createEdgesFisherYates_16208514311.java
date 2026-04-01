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
import java.lang.Object;
import java.lang.Boolean;

public class RandomGnmGraphGenerator_createEdgesFisherYates_16208514311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220;
     Object term243;

    public RandomGnmGraphGenerator_createEdgesFisherYates_16208514311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term222 = newInstance(Class.forName("java.util.Random"));
        Object term223 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term227 = (int[]) newIntArray(8);
        int[] term236 = (int[]) newIntArray(6);
        setLongField(term220, term220.getClass(), "numEdges", -8885298608300233488L);
        setLongField(term223, term223.getClass(), "value", 106025325461761L);
        setField(term222, term222.getClass(), "seed", term223);
        setDoubleField(term222, term222.getClass(), "nextNextGaussian", 0.37773193782763337);
        setBooleanField(term222, term222.getClass(), "haveNextNextGaussian", false);
        setField(term220, term220.getClass(), "random", term222);
        setIntElement(term227, 0, -1588772968);
        setIntElement(term227, 1, -93135961);
        setIntElement(term227, 2, -112921587);
        setIntElement(term227, 3, 933028652);
        setIntElement(term227, 4, 287287233);
        setIntElement(term227, 5, 962840079);
        setIntElement(term227, 6, 1540719661);
        setIntElement(term227, 7, 1265463001);
        setField(term220, term220.getClass(), "edgeValues", term227);
        setIntElement(term236, 0, 335112684);
        setIntElement(term236, 1, 1551099402);
        setIntElement(term236, 2, -2027534003);
        setIntElement(term236, 3, 1063420942);
        setIntElement(term236, 4, 1375330971);
        setIntElement(term236, 5, -478195677);
        setField(term220, term220.getClass(), "vertices", term236);
        term243 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term243;
        callMethod(klass, "createEdgesFisherYates", argTypes, term220, args);
    }

};


