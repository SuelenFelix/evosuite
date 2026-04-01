package org.graph4j.coloring;

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
import static org.graph4j.coloring.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class Coloring_maxColorNumber_48204951828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2309;

    public Coloring_maxColorNumber_48204951828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2325 = new HashMap();
        term2309 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term2310 = (int[]) newIntArray(8);
        Object term2320 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2321 = (long[]) newLongArray(1);
        setField(term2309, term2309.getClass(), "graph", null);
        setIntElement(term2310, 0, 1789351397);
        setIntElement(term2310, 1, 2145528170);
        setIntElement(term2310, 2, -585773976);
        setIntElement(term2310, 3, 852806940);
        setIntElement(term2310, 4, 698551724);
        setIntElement(term2310, 5, -1631048635);
        setIntElement(term2310, 6, 1342808731);
        setIntElement(term2310, 7, -64893740);
        setField(term2309, term2309.getClass(), "vertexColor", term2310);
        setIntField(term2309, term2309.getClass(), "numColoredVertices", -222012928);
        setField(term2320, term2320.getClass(), "words", term2321);
        setIntField(term2320, term2320.getClass(), "wordsInUse", -146564963);
        setBooleanField(term2320, term2320.getClass(), "sizeIsSticky", false);
        setField(term2309, term2309.getClass(), "usedColors", term2320);
        setField(term2309, term2309.getClass(), "colorMap", term2325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "maxColorNumber", argTypes, term2309, args);
    }

};


