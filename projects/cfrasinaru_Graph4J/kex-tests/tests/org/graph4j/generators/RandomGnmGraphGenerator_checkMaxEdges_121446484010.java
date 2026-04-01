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

public class RandomGnmGraphGenerator_checkMaxEdges_121446484010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;

    public RandomGnmGraphGenerator_checkMaxEdges_121446484010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term209 = newInstance(Class.forName("java.util.Random"));
        Object term210 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term214 = (int[]) newIntArray(0);
        int[] term215 = (int[]) newIntArray(2);
        setLongField(term207, term207.getClass(), "numEdges", -2813493605142626659L);
        setLongField(term210, term210.getClass(), "value", 208110072480952L);
        setField(term209, term209.getClass(), "seed", term210);
        setDoubleField(term209, term209.getClass(), "nextNextGaussian", 0.6076495596892013);
        setBooleanField(term209, term209.getClass(), "haveNextNextGaussian", true);
        setField(term207, term207.getClass(), "random", term209);
        setField(term207, term207.getClass(), "edgeValues", term214);
        setIntElement(term215, 0, 1225272962);
        setIntElement(term215, 1, 1324040357);
        setField(term207, term207.getClass(), "vertices", term215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "checkMaxEdges", argTypes, term207, args);
    }

};


