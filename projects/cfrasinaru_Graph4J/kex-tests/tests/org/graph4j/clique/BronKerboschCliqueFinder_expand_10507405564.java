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

public class BronKerboschCliqueFinder_expand_10507405564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151176;
     Object term151253;
     Object term151271;

    public BronKerboschCliqueFinder_expand_10507405564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term151199 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term151200 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term151204 = (int[]) newIntArray(8);
        Object term151215 = newInstance(Class.forName("java.util.BitSet"));
        setField(term151200, term151200.getClass(), "table", null);
        setIntField(term151200, term151200.getClass(), "count", 1079349728);
        setIntField(term151200, term151200.getClass(), "threshold", 15);
        setFloatField(term151200, term151200.getClass(), "loadFactor", 0.75F);
        setField(term151199, term151199.getClass(), "posMap", term151200);
        setField(term151199, term151199.getClass(), "graph", null);
        setIntElement(term151204, 0, -1561510406);
        setIntElement(term151204, 1, 1832451596);
        setIntElement(term151204, 2, 1641477721);
        setIntElement(term151204, 3, -2020879030);
        setIntElement(term151204, 4, 618855717);
        setIntElement(term151204, 5, -1112398956);
        setIntElement(term151204, 6, -330460756);
        setIntElement(term151204, 7, 1137150249);
        setField(term151199, term151199.getClass(), "vertices", term151204);
        setIntField(term151199, term151199.getClass(), "numVertices", -723656760);
        setIntField(term151199, term151199.getClass(), "first", -1102078379);
        setField(term151215, term151215.getClass(), "words", null);
        setIntField(term151215, term151215.getClass(), "wordsInUse", -179887492);
        setBooleanField(term151215, term151215.getClass(), "sizeIsSticky", false);
        setField(term151199, term151199.getClass(), "bitset", term151215);
        Object term151218 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term151219 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term151223 = (int[]) newIntArray(2);
        Object term151228 = newInstance(Class.forName("java.util.BitSet"));
        setField(term151219, term151219.getClass(), "table", null);
        setIntField(term151219, term151219.getClass(), "count", 412139876);
        setIntField(term151219, term151219.getClass(), "threshold", 15);
        setFloatField(term151219, term151219.getClass(), "loadFactor", 0.75F);
        setField(term151218, term151218.getClass(), "posMap", term151219);
        setField(term151218, term151218.getClass(), "graph", null);
        setIntElement(term151223, 0, -1706700802);
        setIntElement(term151223, 1, -816182938);
        setField(term151218, term151218.getClass(), "vertices", term151223);
        setIntField(term151218, term151218.getClass(), "numVertices", -2045036346);
        setIntField(term151218, term151218.getClass(), "first", -309625685);
        setField(term151228, term151228.getClass(), "words", null);
        setIntField(term151228, term151228.getClass(), "wordsInUse", 1160000089);
        setBooleanField(term151228, term151228.getClass(), "sizeIsSticky", false);
        setField(term151218, term151218.getClass(), "bitset", term151228);
        Object term151231 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term151232 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term151236 = (int[]) newIntArray(9);
        Object term151248 = newInstance(Class.forName("java.util.BitSet"));
        setField(term151232, term151232.getClass(), "table", null);
        setIntField(term151232, term151232.getClass(), "count", 22104098);
        setIntField(term151232, term151232.getClass(), "threshold", 15);
        setFloatField(term151232, term151232.getClass(), "loadFactor", 0.75F);
        setField(term151231, term151231.getClass(), "posMap", term151232);
        setField(term151231, term151231.getClass(), "graph", null);
        setIntElement(term151236, 0, 652036077);
        setIntElement(term151236, 1, -1724703488);
        setIntElement(term151236, 2, 1072483862);
        setIntElement(term151236, 3, 1879448658);
        setIntElement(term151236, 4, 1180036117);
        setIntElement(term151236, 5, -608803720);
        setIntElement(term151236, 6, 15762577);
        setIntElement(term151236, 7, 1479834252);
        setIntElement(term151236, 8, -1732595534);
        setField(term151231, term151231.getClass(), "vertices", term151236);
        setIntField(term151231, term151231.getClass(), "numVertices", 940571202);
        setIntField(term151231, term151231.getClass(), "first", -1728082949);
        setField(term151248, term151248.getClass(), "words", null);
        setIntField(term151248, term151248.getClass(), "wordsInUse", -918273835);
        setBooleanField(term151248, term151248.getClass(), "sizeIsSticky", false);
        setField(term151231, term151231.getClass(), "bitset", term151248);
        ArrayList term151197 = new ArrayList();
        ((ArrayList) term151197).add(term151199);
        ((ArrayList) term151197).add(term151218);
        ((ArrayList) term151197).add(term151231);
        term151176 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueFinder"));
        Object term151177 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term151178 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term151179 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term151183 = (int[]) newIntArray(6);
        Object term151192 = newInstance(Class.forName("java.util.BitSet"));
        long[] term151193 = (long[]) newLongArray(1);
        setField(term151178, term151178.getClass(), "table", term151179);
        setIntField(term151178, term151178.getClass(), "count", 1544316944);
        setIntField(term151178, term151178.getClass(), "threshold", 15);
        setFloatField(term151178, term151178.getClass(), "loadFactor", 0.75F);
        setField(term151177, term151177.getClass(), "posMap", term151178);
        setField(term151177, term151177.getClass(), "graph", null);
        setIntElement(term151183, 0, -1869775936);
        setIntElement(term151183, 1, -1145467519);
        setIntElement(term151183, 2, -1670135939);
        setIntElement(term151183, 3, -475758957);
        setIntElement(term151183, 4, -1023256046);
        setIntElement(term151183, 5, 2113527184);
        setField(term151177, term151177.getClass(), "vertices", term151183);
        setIntField(term151177, term151177.getClass(), "numVertices", 2126816687);
        setIntField(term151177, term151177.getClass(), "first", 1642503944);
        setField(term151192, term151192.getClass(), "words", term151193);
        setIntField(term151192, term151192.getClass(), "wordsInUse", 145968092);
        setBooleanField(term151192, term151192.getClass(), "sizeIsSticky", true);
        setField(term151177, term151177.getClass(), "bitset", term151192);
        setField(term151176, term151176.getClass(), "workingClique", term151177);
        setField(term151176, term151176.getClass(), "cliques", term151197);
        setField(term151176, term151176.getClass(), "graph", null);
        term151253 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term151254 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term151255 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term151259 = (int[]) newIntArray(4);
        Object term151266 = newInstance(Class.forName("java.util.BitSet"));
        long[] term151267 = (long[]) newLongArray(1);
        setField(term151254, term151254.getClass(), "table", term151255);
        setIntField(term151254, term151254.getClass(), "count", -2113721253);
        setIntField(term151254, term151254.getClass(), "threshold", 15);
        setFloatField(term151254, term151254.getClass(), "loadFactor", 0.75F);
        setField(term151253, term151253.getClass(), "posMap", term151254);
        setField(term151253, term151253.getClass(), "graph", null);
        setIntElement(term151259, 0, 817085416);
        setIntElement(term151259, 1, 585638217);
        setIntElement(term151259, 2, -1760808051);
        setIntElement(term151259, 3, 257132004);
        setField(term151253, term151253.getClass(), "vertices", term151259);
        setIntField(term151253, term151253.getClass(), "numVertices", 870932181);
        setIntField(term151253, term151253.getClass(), "first", 819586415);
        setField(term151266, term151266.getClass(), "words", term151267);
        setIntField(term151266, term151266.getClass(), "wordsInUse", 919430284);
        setBooleanField(term151266, term151266.getClass(), "sizeIsSticky", false);
        setField(term151253, term151253.getClass(), "bitset", term151266);
        term151271 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term151272 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term151273 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term151277 = (int[]) newIntArray(1);
        Object term151281 = newInstance(Class.forName("java.util.BitSet"));
        long[] term151282 = (long[]) newLongArray(1);
        setField(term151272, term151272.getClass(), "table", term151273);
        setIntField(term151272, term151272.getClass(), "count", 971093674);
        setIntField(term151272, term151272.getClass(), "threshold", 15);
        setFloatField(term151272, term151272.getClass(), "loadFactor", 0.75F);
        setField(term151271, term151271.getClass(), "posMap", term151272);
        setField(term151271, term151271.getClass(), "graph", null);
        setIntElement(term151277, 0, 242296342);
        setField(term151271, term151271.getClass(), "vertices", term151277);
        setIntField(term151271, term151271.getClass(), "numVertices", 545610189);
        setIntField(term151271, term151271.getClass(), "first", 760965255);
        setField(term151281, term151281.getClass(), "words", term151282);
        setIntField(term151281, term151281.getClass(), "wordsInUse", -566485456);
        setBooleanField(term151281, term151281.getClass(), "sizeIsSticky", true);
        setField(term151271, term151271.getClass(), "bitset", term151281);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BronKerboschCliqueFinder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.util.VertexSet");
        argTypes[1] = Class.forName("org.graph4j.util.VertexSet");
        Object[] args = new Object[2];
        args[0] = term151253;
        args[1] = term151271;
        callMethod(klass, "expand", argTypes, term151176, args);
    }

};


