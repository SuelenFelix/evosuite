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

public class RandomGnmGraphGenerator_createEdgesProbabilistic_182214576112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;
     Object term271;
     Object term273;

    public RandomGnmGraphGenerator_createEdgesProbabilistic_182214576112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term261 = newInstance(Class.forName("java.util.Random"));
        Object term262 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term266 = (int[]) newIntArray(2);
        int[] term269 = (int[]) newIntArray(1);
        setLongField(term259, term259.getClass(), "numEdges", -4325723315152823407L);
        setLongField(term262, term262.getClass(), "value", 173632557372992L);
        setField(term261, term261.getClass(), "seed", term262);
        setDoubleField(term261, term261.getClass(), "nextNextGaussian", 0.8474802076607362);
        setBooleanField(term261, term261.getClass(), "haveNextNextGaussian", false);
        setField(term259, term259.getClass(), "random", term261);
        setIntElement(term266, 0, 972867650);
        setIntElement(term266, 1, 1655935355);
        setField(term259, term259.getClass(), "edgeValues", term266);
        setIntElement(term269, 0, -481533957);
        setField(term259, term259.getClass(), "vertices", term269);
        term271 = new Boolean(true);
        term273 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term271;
        args[2] = term273;
        callMethod(klass, "createEdgesProbabilistic", argTypes, term259, args);
    }

};


