package org.graph4j.support;

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
import static org.graph4j.support.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class ChordalGraphSupport_findPerfectEliminationOrdering_17982610742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189;

    public ChordalGraphSupport_findPerfectEliminationOrdering_17982610742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term190 = new Boolean(false);
        ArrayList term235 = new ArrayList();
        HashMap term249 = new HashMap();
        Object term281 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term282 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term286 = (int[]) newIntArray(1);
        Object term290 = newInstance(Class.forName("java.util.BitSet"));
        setField(term282, term282.getClass(), "table", null);
        setIntField(term282, term282.getClass(), "count", 107945604);
        setIntField(term282, term282.getClass(), "threshold", 15);
        setFloatField(term282, term282.getClass(), "loadFactor", 0.75F);
        setField(term281, term281.getClass(), "posMap", term282);
        setField(term281, term281.getClass(), "graph", null);
        setIntElement(term286, 0, -1963464809);
        setField(term281, term281.getClass(), "vertices", term286);
        setIntField(term281, term281.getClass(), "numVertices", 71190297);
        setIntField(term281, term281.getClass(), "first", 1202361360);
        setField(term290, term290.getClass(), "words", null);
        setIntField(term290, term290.getClass(), "wordsInUse", -2015048153);
        setBooleanField(term290, term290.getClass(), "sizeIsSticky", false);
        setField(term281, term281.getClass(), "bitset", term290);
        Object term293 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term294 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term298 = (int[]) newIntArray(9);
        Object term310 = newInstance(Class.forName("java.util.BitSet"));
        setField(term294, term294.getClass(), "table", null);
        setIntField(term294, term294.getClass(), "count", -2063457669);
        setIntField(term294, term294.getClass(), "threshold", 15);
        setFloatField(term294, term294.getClass(), "loadFactor", 0.75F);
        setField(term293, term293.getClass(), "posMap", term294);
        setField(term293, term293.getClass(), "graph", null);
        setIntElement(term298, 0, -1222006000);
        setIntElement(term298, 1, 2095798786);
        setIntElement(term298, 2, -1565502840);
        setIntElement(term298, 3, 344323424);
        setIntElement(term298, 4, 9726679);
        setIntElement(term298, 5, -25637976);
        setIntElement(term298, 6, 1555897383);
        setIntElement(term298, 7, 202001407);
        setIntElement(term298, 8, 158873461);
        setField(term293, term293.getClass(), "vertices", term298);
        setIntField(term293, term293.getClass(), "numVertices", -430151637);
        setIntField(term293, term293.getClass(), "first", -1697741339);
        setField(term310, term310.getClass(), "words", null);
        setIntField(term310, term310.getClass(), "wordsInUse", 98922530);
        setBooleanField(term310, term310.getClass(), "sizeIsSticky", true);
        setField(term293, term293.getClass(), "bitset", term310);
        ArrayList term279 = new ArrayList();
        ((ArrayList) term279).add(term281);
        ((ArrayList) term279).add(term293);
        HashMap term315 = new HashMap();
        term189 = newInstance(Class.forName("org.graph4j.support.ChordalGraphSupport"));
        int[] term192 = (int[]) newIntArray(5);
        int[] term198 = (int[]) newIntArray(2);
        Object term205 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term207 = (int[]) newIntArray(3);
        Object term213 = newInstance(Class.forName("java.util.BitSet"));
        long[] term214 = (long[]) newLongArray(1);
        Object term220 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term221 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term222 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term226 = (int[]) newIntArray(1);
        Object term230 = newInstance(Class.forName("java.util.BitSet"));
        long[] term231 = (long[]) newLongArray(1);
        Object term239 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        int[] term240 = (int[]) newIntArray(2);
        Object term244 = newInstance(Class.forName("java.util.BitSet"));
        long[] term245 = (long[]) newLongArray(1);
        Object term259 = newInstance(Class.forName("org.graph4j.util.StableSet"));
        Object term260 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term261 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term265 = (int[]) newIntArray(6);
        Object term274 = newInstance(Class.forName("java.util.BitSet"));
        long[] term275 = (long[]) newLongArray(1);
        setField(term189, term189.getClass(), "chordal", term190);
        setIntElement(term192, 0, 1240914516);
        setIntElement(term192, 1, -1465035361);
        setIntElement(term192, 2, 1090617576);
        setIntElement(term192, 3, -1547384488);
        setIntElement(term192, 4, 1442160736);
        setField(term189, term189.getClass(), "ordering", term192);
        setIntElement(term198, 0, 1114000454);
        setIntElement(term198, 1, -556405712);
        setField(term189, term189.getClass(), "positions", term198);
        setIntField(term189, term189.getClass(), "holeOrderingPos", -1772434990);
        setIntField(term189, term189.getClass(), "holeVertex0", -1845499264);
        setIntField(term189, term189.getClass(), "holeVertex1", -505439934);
        setIntField(term189, term189.getClass(), "holeVertex2", -344842608);
        setIntField(term205, term205.getClass(), "numEdges", 941650513);
        setField(term205, term205.getClass(), "graph", null);
        setIntElement(term207, 0, 444029505);
        setIntElement(term207, 1, -1034506028);
        setIntElement(term207, 2, -1263114719);
        setField(term205, term205.getClass(), "vertices", term207);
        setIntField(term205, term205.getClass(), "numVertices", -894662986);
        setIntField(term205, term205.getClass(), "first", 304775596);
        setField(term213, term213.getClass(), "words", term214);
        setIntField(term213, term213.getClass(), "wordsInUse", -1347665717);
        setBooleanField(term213, term213.getClass(), "sizeIsSticky", true);
        setField(term205, term205.getClass(), "bitset", term213);
        setField(term189, term189.getClass(), "hole", term205);
        setIntField(term189, term189.getClass(), "maxCliquePos", -1888585309);
        setIntField(term189, term189.getClass(), "maxCliqueSize", 683666002);
        setField(term221, term221.getClass(), "table", term222);
        setIntField(term221, term221.getClass(), "count", 1596213415);
        setIntField(term221, term221.getClass(), "threshold", 15);
        setFloatField(term221, term221.getClass(), "loadFactor", 0.75F);
        setField(term220, term220.getClass(), "posMap", term221);
        setField(term220, term220.getClass(), "graph", null);
        setIntElement(term226, 0, -268815336);
        setField(term220, term220.getClass(), "vertices", term226);
        setIntField(term220, term220.getClass(), "numVertices", -1210583429);
        setIntField(term220, term220.getClass(), "first", -663691365);
        setField(term230, term230.getClass(), "words", term231);
        setIntField(term230, term230.getClass(), "wordsInUse", 339854490);
        setBooleanField(term230, term230.getClass(), "sizeIsSticky", false);
        setField(term220, term220.getClass(), "bitset", term230);
        setField(term189, term189.getClass(), "maximumClique", term220);
        setField(term189, term189.getClass(), "maximalCliques", term235);
        setField(term239, term239.getClass(), "graph", null);
        setIntElement(term240, 0, -615654495);
        setIntElement(term240, 1, -1476117762);
        setField(term239, term239.getClass(), "vertexColor", term240);
        setIntField(term239, term239.getClass(), "numColoredVertices", -341962980);
        setField(term244, term244.getClass(), "words", term245);
        setIntField(term244, term244.getClass(), "wordsInUse", 1532716628);
        setBooleanField(term244, term244.getClass(), "sizeIsSticky", true);
        setField(term239, term239.getClass(), "usedColors", term244);
        setField(term239, term239.getClass(), "colorMap", term249);
        setField(term189, term189.getClass(), "coloring", term239);
        setField(term260, term260.getClass(), "table", term261);
        setIntField(term260, term260.getClass(), "count", 568954359);
        setIntField(term260, term260.getClass(), "threshold", 15);
        setFloatField(term260, term260.getClass(), "loadFactor", 0.75F);
        setField(term259, term259.getClass(), "posMap", term260);
        setField(term259, term259.getClass(), "graph", null);
        setIntElement(term265, 0, 53410913);
        setIntElement(term265, 1, -375014958);
        setIntElement(term265, 2, 1107176718);
        setIntElement(term265, 3, 480137250);
        setIntElement(term265, 4, -341152642);
        setIntElement(term265, 5, -2015854073);
        setField(term259, term259.getClass(), "vertices", term265);
        setIntField(term259, term259.getClass(), "numVertices", 538259104);
        setIntField(term259, term259.getClass(), "first", 96566506);
        setField(term274, term274.getClass(), "words", term275);
        setIntField(term274, term274.getClass(), "wordsInUse", -343325701);
        setBooleanField(term274, term274.getClass(), "sizeIsSticky", true);
        setField(term259, term259.getClass(), "bitset", term274);
        setField(term189, term189.getClass(), "maximumStableSet", term259);
        setField(term189, term189.getClass(), "minimumCliqueCover", term279);
        setField(term189, term189.getClass(), "minimalVertexSeparators", term315);
        setField(term189, term189.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.support.ChordalGraphSupport");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "findPerfectEliminationOrdering", argTypes, term189, args);
    }

};


