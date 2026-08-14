package org.graph4j.vsp;

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
import static org.graph4j.vsp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class VertexSeparator_toString_88882953710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3612;

    public VertexSeparator_toString_88882953710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3612 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term3613 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3614 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3615 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3619 = (int[]) newIntArray(8);
        Object term3630 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3631 = (long[]) newLongArray(1);
        Object term3635 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3636 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3637 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3641 = (int[]) newIntArray(7);
        Object term3651 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3652 = (long[]) newLongArray(1);
        Object term3656 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term3657 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term3658 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term3662 = (int[]) newIntArray(8);
        Object term3673 = newInstance(Class.forName("java.util.BitSet"));
        long[] term3674 = (long[]) newLongArray(1);
        setField(term3612, term3612.getClass(), "graph", null);
        setField(term3614, term3614.getClass(), "table", term3615);
        setIntField(term3614, term3614.getClass(), "count", 1674165862);
        setIntField(term3614, term3614.getClass(), "threshold", 15);
        setFloatField(term3614, term3614.getClass(), "loadFactor", 0.75F);
        setField(term3613, term3613.getClass(), "posMap", term3614);
        setField(term3613, term3613.getClass(), "graph", null);
        setIntElement(term3619, 0, 1875252647);
        setIntElement(term3619, 1, -1298688401);
        setIntElement(term3619, 2, 1907832341);
        setIntElement(term3619, 3, 932199784);
        setIntElement(term3619, 4, 1953620444);
        setIntElement(term3619, 5, -1111307978);
        setIntElement(term3619, 6, 609697271);
        setIntElement(term3619, 7, 1121247998);
        setField(term3613, term3613.getClass(), "vertices", term3619);
        setIntField(term3613, term3613.getClass(), "numVertices", -710001354);
        setIntField(term3613, term3613.getClass(), "first", 2007404429);
        setField(term3630, term3630.getClass(), "words", term3631);
        setIntField(term3630, term3630.getClass(), "wordsInUse", 472580433);
        setBooleanField(term3630, term3630.getClass(), "sizeIsSticky", true);
        setField(term3613, term3613.getClass(), "bitset", term3630);
        setField(term3612, term3612.getClass(), "separator", term3613);
        setField(term3636, term3636.getClass(), "table", term3637);
        setIntField(term3636, term3636.getClass(), "count", 1189049164);
        setIntField(term3636, term3636.getClass(), "threshold", 15);
        setFloatField(term3636, term3636.getClass(), "loadFactor", 0.75F);
        setField(term3635, term3635.getClass(), "posMap", term3636);
        setField(term3635, term3635.getClass(), "graph", null);
        setIntElement(term3641, 0, -673413879);
        setIntElement(term3641, 1, 1609778442);
        setIntElement(term3641, 2, 524850421);
        setIntElement(term3641, 3, -1833121756);
        setIntElement(term3641, 4, -1493632787);
        setIntElement(term3641, 5, -1056969264);
        setIntElement(term3641, 6, -709130701);
        setField(term3635, term3635.getClass(), "vertices", term3641);
        setIntField(term3635, term3635.getClass(), "numVertices", 86144663);
        setIntField(term3635, term3635.getClass(), "first", -1480903995);
        setField(term3651, term3651.getClass(), "words", term3652);
        setIntField(term3651, term3651.getClass(), "wordsInUse", -2111772603);
        setBooleanField(term3651, term3651.getClass(), "sizeIsSticky", true);
        setField(term3635, term3635.getClass(), "bitset", term3651);
        setField(term3612, term3612.getClass(), "leftShore", term3635);
        setField(term3657, term3657.getClass(), "table", term3658);
        setIntField(term3657, term3657.getClass(), "count", 637942911);
        setIntField(term3657, term3657.getClass(), "threshold", 15);
        setFloatField(term3657, term3657.getClass(), "loadFactor", 0.75F);
        setField(term3656, term3656.getClass(), "posMap", term3657);
        setField(term3656, term3656.getClass(), "graph", null);
        setIntElement(term3662, 0, -395396657);
        setIntElement(term3662, 1, 1677171453);
        setIntElement(term3662, 2, -2108979704);
        setIntElement(term3662, 3, 1629835601);
        setIntElement(term3662, 4, 1866184476);
        setIntElement(term3662, 5, -17998574);
        setIntElement(term3662, 6, 145080354);
        setIntElement(term3662, 7, -2087321012);
        setField(term3656, term3656.getClass(), "vertices", term3662);
        setIntField(term3656, term3656.getClass(), "numVertices", -1613074612);
        setIntField(term3656, term3656.getClass(), "first", 1054908502);
        setField(term3673, term3673.getClass(), "words", term3674);
        setIntField(term3673, term3673.getClass(), "wordsInUse", -1226802566);
        setBooleanField(term3673, term3673.getClass(), "sizeIsSticky", true);
        setField(term3656, term3656.getClass(), "bitset", term3673);
        setField(term3612, term3612.getClass(), "rightShore", term3656);
        setIntField(term3612, term3612.getClass(), "maxShoreSize", 1162813858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.VertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3612, args);
    }

};


