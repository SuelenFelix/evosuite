package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Trail_checkDuplicateEdges_4967405994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100398;

    public Trail_checkDuplicateEdges_4967405994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100398 = newInstance(Class.forName("org.graph4j.util.Trail"));
        int[] term100400 = (int[]) newIntArray(6);
        Object term100409 = newInstance(Class.forName("java.util.BitSet"));
        long[] term100410 = (long[]) newLongArray(1);
        setIntField(term100398, term100398.getClass(), "numEdges", 905536730);
        setField(term100398, term100398.getClass(), "graph", null);
        setIntElement(term100400, 0, 1579733651);
        setIntElement(term100400, 1, 734712664);
        setIntElement(term100400, 2, 1380507045);
        setIntElement(term100400, 3, -817128051);
        setIntElement(term100400, 4, 1221899586);
        setIntElement(term100400, 5, 1587152573);
        setField(term100398, term100398.getClass(), "vertices", term100400);
        setIntField(term100398, term100398.getClass(), "numVertices", 374759994);
        setIntField(term100398, term100398.getClass(), "first", 1614709177);
        setField(term100409, term100409.getClass(), "words", term100410);
        setIntField(term100409, term100409.getClass(), "wordsInUse", 966660807);
        setBooleanField(term100409, term100409.getClass(), "sizeIsSticky", true);
        setField(term100398, term100398.getClass(), "bitset", term100409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Trail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkDuplicateEdges", argTypes, term100398, args);
    }

};


