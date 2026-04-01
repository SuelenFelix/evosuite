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
import java.util.ArrayList;
import java.lang.Object;

public class RootedTree_traverse_5133175197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119291;

    public RootedTree_traverse_5133175197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term119296 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119297 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119301 = (int[]) newIntArray(9);
        Object term119313 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119297, term119297.getClass(), "table", null);
        setIntField(term119297, term119297.getClass(), "count", -1637230216);
        setIntField(term119297, term119297.getClass(), "threshold", 15);
        setFloatField(term119297, term119297.getClass(), "loadFactor", 0.75F);
        setField(term119296, term119296.getClass(), "posMap", term119297);
        setField(term119296, term119296.getClass(), "graph", null);
        setIntElement(term119301, 0, 937338727);
        setIntElement(term119301, 1, 1373177568);
        setIntElement(term119301, 2, -1176571827);
        setIntElement(term119301, 3, -1847648617);
        setIntElement(term119301, 4, -1629061284);
        setIntElement(term119301, 5, 614077584);
        setIntElement(term119301, 6, 1613570880);
        setIntElement(term119301, 7, -1066282695);
        setIntElement(term119301, 8, 449049984);
        setField(term119296, term119296.getClass(), "vertices", term119301);
        setIntField(term119296, term119296.getClass(), "numVertices", -174720521);
        setIntField(term119296, term119296.getClass(), "first", 176159726);
        setField(term119313, term119313.getClass(), "words", null);
        setIntField(term119313, term119313.getClass(), "wordsInUse", 145078069);
        setBooleanField(term119313, term119313.getClass(), "sizeIsSticky", false);
        setField(term119296, term119296.getClass(), "bitset", term119313);
        Object term119316 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119317 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119321 = (int[]) newIntArray(0);
        Object term119324 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119317, term119317.getClass(), "table", null);
        setIntField(term119317, term119317.getClass(), "count", -602903146);
        setIntField(term119317, term119317.getClass(), "threshold", 15);
        setFloatField(term119317, term119317.getClass(), "loadFactor", 0.75F);
        setField(term119316, term119316.getClass(), "posMap", term119317);
        setField(term119316, term119316.getClass(), "graph", null);
        setField(term119316, term119316.getClass(), "vertices", term119321);
        setIntField(term119316, term119316.getClass(), "numVertices", -1411855479);
        setIntField(term119316, term119316.getClass(), "first", 1832816267);
        setField(term119324, term119324.getClass(), "words", null);
        setIntField(term119324, term119324.getClass(), "wordsInUse", -1078115971);
        setBooleanField(term119324, term119324.getClass(), "sizeIsSticky", false);
        setField(term119316, term119316.getClass(), "bitset", term119324);
        Object term119327 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term119328 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term119332 = (int[]) newIntArray(9);
        Object term119344 = newInstance(Class.forName("java.util.BitSet"));
        setField(term119328, term119328.getClass(), "table", null);
        setIntField(term119328, term119328.getClass(), "count", -1342129393);
        setIntField(term119328, term119328.getClass(), "threshold", 15);
        setFloatField(term119328, term119328.getClass(), "loadFactor", 0.75F);
        setField(term119327, term119327.getClass(), "posMap", term119328);
        setField(term119327, term119327.getClass(), "graph", null);
        setIntElement(term119332, 0, -198585857);
        setIntElement(term119332, 1, 1021673948);
        setIntElement(term119332, 2, 996539266);
        setIntElement(term119332, 3, -216766818);
        setIntElement(term119332, 4, -1969282471);
        setIntElement(term119332, 5, -1205706522);
        setIntElement(term119332, 6, -1800270634);
        setIntElement(term119332, 7, 2063284492);
        setIntElement(term119332, 8, -544984538);
        setField(term119327, term119327.getClass(), "vertices", term119332);
        setIntField(term119327, term119327.getClass(), "numVertices", -1377446937);
        setIntField(term119327, term119327.getClass(), "first", -1242189550);
        setField(term119344, term119344.getClass(), "words", null);
        setIntField(term119344, term119344.getClass(), "wordsInUse", -1245175992);
        setBooleanField(term119344, term119344.getClass(), "sizeIsSticky", true);
        setField(term119327, term119327.getClass(), "bitset", term119344);
        ArrayList term119294 = new ArrayList();
        ((ArrayList) term119294).add(term119296);
        ((ArrayList) term119294).add(term119316);
        ((ArrayList) term119294).add(term119327);
        term119291 = newInstance(Class.forName("org.graph4j.util.RootedTree"));
        int[] term119293 = (int[]) newIntArray(0);
        setField(term119291, term119291.getClass(), "tree", null);
        setIntField(term119291, term119291.getClass(), "root", 1705739004);
        setField(term119291, term119291.getClass(), "parents", term119293);
        setField(term119291, term119291.getClass(), "levels", term119294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.RootedTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "traverse", argTypes, term119291, args);
    }

};


