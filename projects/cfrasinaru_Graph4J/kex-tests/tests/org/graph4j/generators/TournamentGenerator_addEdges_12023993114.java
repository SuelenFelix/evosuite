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

public class TournamentGenerator_addEdges_12023993114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1700;
     Object term1713;

    public TournamentGenerator_addEdges_12023993114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1700 = newInstance(Class.forName("org.graph4j.generators.TournamentGenerator"));
        Object term1701 = newInstance(Class.forName("java.util.Random"));
        Object term1702 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        int[] term1706 = (int[]) newIntArray(6);
        setLongField(term1702, term1702.getClass(), "value", 211627663429189L);
        setField(term1701, term1701.getClass(), "seed", term1702);
        setDoubleField(term1701, term1701.getClass(), "nextNextGaussian", 0.8454723071922143);
        setBooleanField(term1701, term1701.getClass(), "haveNextNextGaussian", true);
        setField(term1700, term1700.getClass(), "rand", term1701);
        setIntElement(term1706, 0, -2138825831);
        setIntElement(term1706, 1, 1454781562);
        setIntElement(term1706, 2, -27944011);
        setIntElement(term1706, 3, -20614472);
        setIntElement(term1706, 4, 1126618861);
        setIntElement(term1706, 5, 947449400);
        setField(term1700, term1700.getClass(), "vertices", term1706);
        term1713 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.TournamentGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1713;
        callMethod(klass, "addEdges", argTypes, term1700, args);
    }

};


