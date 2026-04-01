package org.graph4j.clique;

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
import static org.graph4j.clique.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class BronKerboschCliqueFinder_getCliques_3760325042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1997;

    public BronKerboschCliqueFinder_getCliques_3760325042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2020 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term2021 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term2025 = (int[]) newIntArray(5);
        Object term2033 = newInstance(Class.forName("java.util.BitSet"));
        setField(term2021, term2021.getClass(), "table", null);
        setIntField(term2021, term2021.getClass(), "count", -2017073245);
        setIntField(term2021, term2021.getClass(), "threshold", 15);
        setFloatField(term2021, term2021.getClass(), "loadFactor", 0.75F);
        setField(term2020, term2020.getClass(), "posMap", term2021);
        setField(term2020, term2020.getClass(), "graph", null);
        setIntElement(term2025, 0, 522440332);
        setIntElement(term2025, 1, 1516598327);
        setIntElement(term2025, 2, 82353584);
        setIntElement(term2025, 3, -758778797);
        setIntElement(term2025, 4, 765680355);
        setField(term2020, term2020.getClass(), "vertices", term2025);
        setIntField(term2020, term2020.getClass(), "numVertices", -1012090049);
        setIntField(term2020, term2020.getClass(), "first", -2025214553);
        setField(term2033, term2033.getClass(), "words", null);
        setIntField(term2033, term2033.getClass(), "wordsInUse", -154750730);
        setBooleanField(term2033, term2033.getClass(), "sizeIsSticky", true);
        setField(term2020, term2020.getClass(), "bitset", term2033);
        ArrayList term2018 = new ArrayList();
        ((ArrayList) term2018).add(term2020);
        term1997 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueFinder"));
        Object term1998 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term1999 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term2000 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term2004 = (int[]) newIntArray(6);
        Object term2013 = newInstance(Class.forName("java.util.BitSet"));
        long[] term2014 = (long[]) newLongArray(1);
        setField(term1999, term1999.getClass(), "table", term2000);
        setIntField(term1999, term1999.getClass(), "count", 428360161);
        setIntField(term1999, term1999.getClass(), "threshold", 15);
        setFloatField(term1999, term1999.getClass(), "loadFactor", 0.75F);
        setField(term1998, term1998.getClass(), "posMap", term1999);
        setField(term1998, term1998.getClass(), "graph", null);
        setIntElement(term2004, 0, 631528579);
        setIntElement(term2004, 1, -1652091834);
        setIntElement(term2004, 2, -282021579);
        setIntElement(term2004, 3, -1652588127);
        setIntElement(term2004, 4, -1902823385);
        setIntElement(term2004, 5, -784924879);
        setField(term1998, term1998.getClass(), "vertices", term2004);
        setIntField(term1998, term1998.getClass(), "numVertices", -1062027102);
        setIntField(term1998, term1998.getClass(), "first", 1763217806);
        setField(term2013, term2013.getClass(), "words", term2014);
        setIntField(term2013, term2013.getClass(), "wordsInUse", 1644949396);
        setBooleanField(term2013, term2013.getClass(), "sizeIsSticky", true);
        setField(term1998, term1998.getClass(), "bitset", term2013);
        setField(term1997, term1997.getClass(), "workingClique", term1998);
        setField(term1997, term1997.getClass(), "cliques", term2018);
        setField(term1997, term1997.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BronKerboschCliqueFinder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCliques", argTypes, term1997, args);
    }

};


