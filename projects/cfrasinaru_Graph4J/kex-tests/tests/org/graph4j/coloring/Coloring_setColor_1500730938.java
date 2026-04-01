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
import java.lang.Integer;

public class Coloring_setColor_1500730938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1627;
     Object term1657;
     Object term1659;

    public Coloring_setColor_1500730938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1644 = new HashMap();
        term1627 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term1628 = (int[]) newIntArray(9);
        Object term1639 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1640 = (long[]) newLongArray(1);
        setField(term1627, term1627.getClass(), "graph", null);
        setIntElement(term1628, 0, 1988605357);
        setIntElement(term1628, 1, 808203320);
        setIntElement(term1628, 2, -544382127);
        setIntElement(term1628, 3, -1830198043);
        setIntElement(term1628, 4, -439048495);
        setIntElement(term1628, 5, -1849105286);
        setIntElement(term1628, 6, 1334483645);
        setIntElement(term1628, 7, 917513193);
        setIntElement(term1628, 8, 787278105);
        setField(term1627, term1627.getClass(), "vertexColor", term1628);
        setIntField(term1627, term1627.getClass(), "numColoredVertices", -2063843486);
        setField(term1639, term1639.getClass(), "words", term1640);
        setIntField(term1639, term1639.getClass(), "wordsInUse", 833762980);
        setBooleanField(term1639, term1639.getClass(), "sizeIsSticky", true);
        setField(term1627, term1627.getClass(), "usedColors", term1639);
        setField(term1627, term1627.getClass(), "colorMap", term1644);
        term1657 = new Integer(-1284825282);
        term1659 = new Integer(-1941343035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Coloring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1657;
        args[1] = term1659;
        callMethod(klass, "setColor", argTypes, term1627, args);
    }

};


