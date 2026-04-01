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
import java.util.ArrayList;

public class BacktrackVertexSeparator_nodesExplored_126849438611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54402;

    public BacktrackVertexSeparator_nodesExplored_126849438611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term54464 = new ArrayList();
        term54402 = newInstance(Class.forName("org.graph4j.vsp.BacktrackVertexSeparator"));
        Object term54479 = newInstance(Class.forName("org.graph4j.vsp.VertexSeparator"));
        Object term54480 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term54481 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term54482 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term54486 = (int[]) newIntArray(9);
        Object term54498 = newInstance(Class.forName("java.util.BitSet"));
        long[] term54499 = (long[]) newLongArray(1);
        Object term54503 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term54504 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term54505 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term54509 = (int[]) newIntArray(8);
        Object term54520 = newInstance(Class.forName("java.util.BitSet"));
        long[] term54521 = (long[]) newLongArray(1);
        Object term54525 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term54526 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term54527 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        setLongField(term54402, term54402.getClass(), "timeLimit", 918397384129253729L);
        setLongField(term54402, term54402.getClass(), "startTime", -2187638136407967948L);
        setBooleanField(term54402, term54402.getClass(), "timeExpired", true);
        setField(term54479, term54479.getClass(), "graph", null);
        setField(term54481, term54481.getClass(), "table", term54482);
        setIntField(term54481, term54481.getClass(), "count", -1276527088);
        setIntField(term54481, term54481.getClass(), "threshold", 15);
        setFloatField(term54481, term54481.getClass(), "loadFactor", 0.75F);
        setField(term54480, term54480.getClass(), "posMap", term54481);
        setField(term54480, term54480.getClass(), "graph", null);
        setIntElement(term54486, 0, -1354264089);
        setIntElement(term54486, 1, -2041515106);
        setIntElement(term54486, 2, 699571489);
        setIntElement(term54486, 3, 2067513821);
        setIntElement(term54486, 4, 1556440556);
        setIntElement(term54486, 5, -436359872);
        setIntElement(term54486, 6, -1959666038);
        setIntElement(term54486, 7, 2128660618);
        setIntElement(term54486, 8, -1354012258);
        setField(term54480, term54480.getClass(), "vertices", term54486);
        setIntField(term54480, term54480.getClass(), "numVertices", -734919944);
        setIntField(term54480, term54480.getClass(), "first", -91371563);
        setField(term54498, term54498.getClass(), "words", term54499);
        setIntField(term54498, term54498.getClass(), "wordsInUse", 4662703);
        setBooleanField(term54498, term54498.getClass(), "sizeIsSticky", false);
        setField(term54480, term54480.getClass(), "bitset", term54498);
        setField(term54479, term54479.getClass(), "separator", term54480);
        setField(term54504, term54504.getClass(), "table", term54505);
        setIntField(term54504, term54504.getClass(), "count", -2118566618);
        setIntField(term54504, term54504.getClass(), "threshold", 15);
        setFloatField(term54504, term54504.getClass(), "loadFactor", 0.75F);
        setField(term54503, term54503.getClass(), "posMap", term54504);
        setField(term54503, term54503.getClass(), "graph", null);
        setIntElement(term54509, 0, 1655029720);
        setIntElement(term54509, 1, -793892224);
        setIntElement(term54509, 2, 1440702542);
        setIntElement(term54509, 3, -943970524);
        setIntElement(term54509, 4, 917621965);
        setIntElement(term54509, 5, 749518086);
        setIntElement(term54509, 6, -1596868093);
        setIntElement(term54509, 7, -1081975340);
        setField(term54503, term54503.getClass(), "vertices", term54509);
        setIntField(term54503, term54503.getClass(), "numVertices", 1804381424);
        setIntField(term54503, term54503.getClass(), "first", 347701928);
        setField(term54520, term54520.getClass(), "words", term54521);
        setIntField(term54520, term54520.getClass(), "wordsInUse", 0);
        setBooleanField(term54520, term54520.getClass(), "sizeIsSticky", false);
        setField(term54503, term54503.getClass(), "bitset", term54520);
        setField(term54479, term54479.getClass(), "leftShore", term54503);
        setField(term54526, term54526.getClass(), "table", term54527);
        setIntField(term54526, term54526.getClass(), "count", 0);
        setIntField(term54526, term54526.getClass(), "threshold", 15);
        setFloatField(term54526, term54526.getClass(), "loadFactor", 0.75F);
        setField(term54525, term54525.getClass(), "posMap", term54526);
        setField(term54525, term54525.getClass(), "graph", null);
        setField(term54525, term54525.getClass(), "vertices", null);
        setIntField(term54525, term54525.getClass(), "numVertices", 0);
        setIntField(term54525, term54525.getClass(), "first", 0);
        setField(term54525, term54525.getClass(), "bitset", null);
        setField(term54479, term54479.getClass(), "rightShore", term54525);
        setIntField(term54479, term54479.getClass(), "maxShoreSize", -1540852359);
        setField(term54402, term54402.getClass(), "solution", term54479);
        setField(term54402, term54402.getClass(), "workers", term54464);
        setLongField(term54402, term54402.getClass(), "nodesExplored", 8708846223293804408L);
        setIntField(term54402, term54402.getClass(), "minSepSize", -1053171626);
        setIntField(term54402, term54402.getClass(), "vertexConnectivity", -523085747);
        setIntField(term54402, term54402.getClass(), "greedySepSize", 417603895);
        setIntField(term54402, term54402.getClass(), "LEFT", -1482676874);
        setIntField(term54402, term54402.getClass(), "RIGHT", -1157428137);
        setIntField(term54402, term54402.getClass(), "SEP", 1937997872);
        setIntField(term54402, term54402.getClass(), "UNKNOWN", -1961074437);
        setIntField(term54402, term54402.getClass(), "FAILURE", 2132751608);
        setIntField(term54402, term54402.getClass(), "POTENTIAL_SOLUTION", -739046971);
        setIntField(term54402, term54402.getClass(), "maxShoreSize", 1735844763);
        setField(term54402, term54402.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.vsp.BacktrackVertexSeparator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "nodesExplored", argTypes, term54402, args);
    }

};


