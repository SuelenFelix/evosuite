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

public class RandomGnmGraphGenerator_createDirectedMultigraph_2628826286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;

    public RandomGnmGraphGenerator_createDirectedMultigraph_2628826286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109 = newInstance(Class.forName("org.graph4j.generators.RandomGnmGraphGenerator"));
        Object term111 = newInstance(Class.forName("java.util.Random"));
        Object term112 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term116 = (int[]) newIntArray(7);
        int[] term124 = (int[]) newIntArray(1);
        setLongField(term109, term109.getClass(), "numEdges", 4872422362414183754L);
        setLongField(term112, term112.getClass(), "value", 53064155541306L);
        setField(term111, term111.getClass(), "seed", term112);
        setDoubleField(term111, term111.getClass(), "nextNextGaussian", 0.28570734989730284);
        setBooleanField(term111, term111.getClass(), "haveNextNextGaussian", true);
        setField(term109, term109.getClass(), "random", term111);
        setIntElement(term116, 0, 1193880199);
        setIntElement(term116, 1, -1087774327);
        setIntElement(term116, 2, -1530420153);
        setIntElement(term116, 3, -469968304);
        setIntElement(term116, 4, -1145578966);
        setIntElement(term116, 5, 679763016);
        setIntElement(term116, 6, 1962444399);
        setField(term109, term109.getClass(), "edgeValues", term116);
        setIntElement(term124, 0, 767834723);
        setField(term109, term109.getClass(), "vertices", term124);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.RandomGnmGraphGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createDirectedMultigraph", argTypes, term109, args);
    }

};


