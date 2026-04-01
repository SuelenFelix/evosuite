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
import java.util.ArrayDeque;

public class BoundedCliqueIterator_hasNext_11931276723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;

    public BoundedCliqueIterator_hasNext_11931276723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term264 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        setField(term264, term264.getClass(), "subg", null);
        setField(term264, term264.getClass(), "cand", null);
        setField(term264, term264.getClass(), "ext", null);
        setField(term264, term264.getClass(), "this$0", null);
        Object term265 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        setField(term265, term265.getClass(), "subg", null);
        setField(term265, term265.getClass(), "cand", null);
        setField(term265, term265.getClass(), "ext", null);
        setField(term265, term265.getClass(), "this$0", null);
        Object term266 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator$Node"));
        setField(term266, term266.getClass(), "subg", null);
        setField(term266, term266.getClass(), "cand", null);
        setField(term266, term266.getClass(), "ext", null);
        setField(term266, term266.getClass(), "this$0", null);
        ArrayDeque term262 = new ArrayDeque();
        ((ArrayDeque) term262).add(term264);
        ((ArrayDeque) term262).add(term265);
        ((ArrayDeque) term262).add(term266);
        term195 = newInstance(Class.forName("org.graph4j.clique.BoundedCliqueIterator"));
        Object term199 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term200 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term201 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        int[] term205 = (int[]) newIntArray(2);
        Object term210 = newInstance(Class.forName("java.util.BitSet"));
        long[] term211 = (long[]) newLongArray(1);
        Object term215 = newInstance(Class.forName("org.graph4j.clique.BronKerboschCliqueIterator"));
        Object[] term216 = (Object[]) newArray("[I", 8);
        int[] term217 = (int[]) newIntArray(6);
        int[] term224 = (int[]) newIntArray(2);
        int[] term227 = (int[]) newIntArray(1);
        int[] term229 = (int[]) newIntArray(9);
        int[] term239 = (int[]) newIntArray(3);
        int[] term243 = (int[]) newIntArray(5);
        int[] term249 = (int[]) newIntArray(6);
        int[] term256 = (int[]) newIntArray(5);
        Object term269 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term270 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        Object[] term271 = (Object[]) newArray("org.graph4j.util.IntHashMap$Entry", 20);
        Object term277 = newInstance(Class.forName("org.graph4j.util.Clique"));
        Object term280 = newInstance(Class.forName("org.graph4j.util.BoundedSubsetIterator"));
        setIntField(term195, term195.getClass(), "minSize", 1240914516);
        setIntField(term195, term195.getClass(), "maxSize", -1465035361);
        setLongField(term195, term195.getClass(), "timeout", -8400487765614892086L);
        setField(term200, term200.getClass(), "table", term201);
        setIntField(term200, term200.getClass(), "count", 1090617576);
        setIntField(term200, term200.getClass(), "threshold", 15);
        setFloatField(term200, term200.getClass(), "loadFactor", 0.75F);
        setField(term199, term199.getClass(), "posMap", term200);
        setField(term199, term199.getClass(), "graph", null);
        setIntElement(term205, 0, -1547384488);
        setIntElement(term205, 1, 1442160736);
        setField(term199, term199.getClass(), "vertices", term205);
        setIntField(term199, term199.getClass(), "numVertices", 1114000454);
        setIntField(term199, term199.getClass(), "first", -556405712);
        setField(term210, term210.getClass(), "words", term211);
        setIntField(term210, term210.getClass(), "wordsInUse", -1772434990);
        setBooleanField(term210, term210.getClass(), "sizeIsSticky", true);
        setField(term199, term199.getClass(), "bitset", term210);
        setField(term195, term195.getClass(), "currentClique", term199);
        setIntElement(term217, 0, -1845499264);
        setIntElement(term217, 1, -505439934);
        setIntElement(term217, 2, -344842608);
        setIntElement(term217, 3, 941650513);
        setIntElement(term217, 4, 444029505);
        setIntElement(term217, 5, -1034506028);
        setElement(term216, 0, term217);
        setIntElement(term224, 0, -1263114719);
        setIntElement(term224, 1, -894662986);
        setElement(term216, 1, term224);
        setIntElement(term227, 0, 304775596);
        setElement(term216, 2, term227);
        setIntElement(term229, 0, -1347665717);
        setIntElement(term229, 1, -1888585309);
        setIntElement(term229, 2, 683666002);
        setIntElement(term229, 3, 1596213415);
        setIntElement(term229, 4, -268815336);
        setIntElement(term229, 5, -1210583429);
        setIntElement(term229, 6, -663691365);
        setIntElement(term229, 7, 339854490);
        setIntElement(term229, 8, -615654495);
        setElement(term216, 3, term229);
        setIntElement(term239, 0, -1476117762);
        setIntElement(term239, 1, -341962980);
        setIntElement(term239, 2, 1532716628);
        setElement(term216, 4, term239);
        setIntElement(term243, 0, -1801760683);
        setIntElement(term243, 1, 1141317871);
        setIntElement(term243, 2, 890669485);
        setIntElement(term243, 3, 691577392);
        setIntElement(term243, 4, -893623680);
        setElement(term216, 5, term243);
        setIntElement(term249, 0, -1963434938);
        setIntElement(term249, 1, 906181092);
        setIntElement(term249, 2, 1045657203);
        setIntElement(term249, 3, 1386130016);
        setIntElement(term249, 4, 1072005683);
        setIntElement(term249, 5, 1861318859);
        setElement(term216, 6, term249);
        setIntElement(term256, 0, 1474524152);
        setIntElement(term256, 1, 568954359);
        setIntElement(term256, 2, 53410913);
        setIntElement(term256, 3, -375014958);
        setIntElement(term256, 4, 1107176718);
        setElement(term216, 7, term256);
        setField(term215, term215.getClass(), "adjMatrix", term216);
        setField(term215, term215.getClass(), "stack", term262);
        setField(term270, term270.getClass(), "table", term271);
        setIntField(term270, term270.getClass(), "count", 0);
        setIntField(term270, term270.getClass(), "threshold", 15);
        setFloatField(term270, term270.getClass(), "loadFactor", 0.75F);
        setField(term269, term269.getClass(), "posMap", term270);
        setField(term269, term269.getClass(), "graph", null);
        setField(term269, term269.getClass(), "vertices", null);
        setIntField(term269, term269.getClass(), "numVertices", 0);
        setIntField(term269, term269.getClass(), "first", 0);
        setField(term269, term269.getClass(), "bitset", null);
        setField(term215, term215.getClass(), "workingClique", term269);
        setField(term277, term277.getClass(), "posMap", null);
        setField(term277, term277.getClass(), "graph", null);
        setField(term277, term277.getClass(), "vertices", null);
        setIntField(term277, term277.getClass(), "numVertices", 0);
        setIntField(term277, term277.getClass(), "first", 0);
        setField(term277, term277.getClass(), "bitset", null);
        setField(term215, term215.getClass(), "currentClique", term277);
        setField(term215, term215.getClass(), "graph", null);
        setField(term195, term195.getClass(), "bkIterator", term215);
        setField(term280, term280.getClass(), "elements", null);
        setIntField(term280, term280.getClass(), "numElements", 0);
        setIntField(term280, term280.getClass(), "maxSubsetSize", 0);
        setIntField(term280, term280.getClass(), "currentSubsetSize", 0);
        setField(term280, term280.getClass(), "indices", null);
        setField(term195, term195.getClass(), "subsetIterator", term280);
        setBooleanField(term195, term195.getClass(), "timeExpired", false);
        setField(term195, term195.getClass(), "graph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.clique.BoundedCliqueIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term195, args);
    }

};


