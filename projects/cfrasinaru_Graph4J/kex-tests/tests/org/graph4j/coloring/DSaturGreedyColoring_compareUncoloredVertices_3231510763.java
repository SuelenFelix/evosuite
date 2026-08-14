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
import java.lang.Integer;

public class DSaturGreedyColoring_compareUncoloredVertices_3231510763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5028;
     Object term5096;
     Object term5098;

    public DSaturGreedyColoring_compareUncoloredVertices_3231510763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5028 = newInstance(Class.forName("org.graph4j.coloring.DSaturGreedyColoring"));
        Object term5029 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term5030 = (int[]) newIntArray(8);
        int[] term5039 = (int[]) newIntArray(2);
        int[] term5043 = (int[]) newIntArray(5);
        Object[] term5049 = (Object[]) newArray("java.util.BitSet", 7);
        Object term5050 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5051 = (long[]) newLongArray(1);
        Object term5055 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5056 = (long[]) newLongArray(1);
        Object term5060 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5061 = (long[]) newLongArray(1);
        Object term5065 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5066 = (long[]) newLongArray(1);
        Object term5070 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5071 = (long[]) newLongArray(1);
        Object term5075 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5076 = (long[]) newLongArray(1);
        Object term5080 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5081 = (long[]) newLongArray(1);
        int[] term5085 = (int[]) newIntArray(3);
        Object term5089 = newInstance(Class.forName("java.util.BitSet"));
        long[] term5090 = (long[]) newLongArray(1);
        setField(term5029, term5029.getClass(), "graph", null);
        setField(term5029, term5029.getClass(), "comparator", null);
        setIntElement(term5030, 0, 623717232);
        setIntElement(term5030, 1, -1413291732);
        setIntElement(term5030, 2, 203264365);
        setIntElement(term5030, 3, -1066281036);
        setIntElement(term5030, 4, 30837706);
        setIntElement(term5030, 5, 379523101);
        setIntElement(term5030, 6, 1017354215);
        setIntElement(term5030, 7, 695330987);
        setField(term5029, term5029.getClass(), "keys", term5030);
        setIntElement(term5039, 0, -267289967);
        setIntElement(term5039, 1, 773432822);
        setField(term5029, term5029.getClass(), "positions", term5039);
        setIntField(term5029, term5029.getClass(), "size", -488294922);
        setField(term5028, term5028.getClass(), "heap", term5029);
        setIntElement(term5043, 0, -397161164);
        setIntElement(term5043, 1, -703717191);
        setIntElement(term5043, 2, -1255535445);
        setIntElement(term5043, 3, -2033952124);
        setIntElement(term5043, 4, 560401653);
        setField(term5028, term5028.getClass(), "degree", term5043);
        setField(term5050, term5050.getClass(), "words", term5051);
        setIntField(term5050, term5050.getClass(), "wordsInUse", 1633691536);
        setBooleanField(term5050, term5050.getClass(), "sizeIsSticky", true);
        setElement(term5049, 0, term5050);
        setField(term5055, term5055.getClass(), "words", term5056);
        setIntField(term5055, term5055.getClass(), "wordsInUse", 898165245);
        setBooleanField(term5055, term5055.getClass(), "sizeIsSticky", false);
        setElement(term5049, 1, term5055);
        setField(term5060, term5060.getClass(), "words", term5061);
        setIntField(term5060, term5060.getClass(), "wordsInUse", 1810754549);
        setBooleanField(term5060, term5060.getClass(), "sizeIsSticky", false);
        setElement(term5049, 2, term5060);
        setField(term5065, term5065.getClass(), "words", term5066);
        setIntField(term5065, term5065.getClass(), "wordsInUse", 338342107);
        setBooleanField(term5065, term5065.getClass(), "sizeIsSticky", true);
        setElement(term5049, 3, term5065);
        setField(term5070, term5070.getClass(), "words", term5071);
        setIntField(term5070, term5070.getClass(), "wordsInUse", -650288950);
        setBooleanField(term5070, term5070.getClass(), "sizeIsSticky", false);
        setElement(term5049, 4, term5070);
        setField(term5075, term5075.getClass(), "words", term5076);
        setIntField(term5075, term5075.getClass(), "wordsInUse", 433039357);
        setBooleanField(term5075, term5075.getClass(), "sizeIsSticky", true);
        setElement(term5049, 5, term5075);
        setField(term5080, term5080.getClass(), "words", term5081);
        setIntField(term5080, term5080.getClass(), "wordsInUse", 1469939797);
        setBooleanField(term5080, term5080.getClass(), "sizeIsSticky", false);
        setElement(term5049, 6, term5080);
        setField(term5028, term5028.getClass(), "dsatur", term5049);
        setIntElement(term5085, 0, 252799294);
        setIntElement(term5085, 1, -2072618022);
        setIntElement(term5085, 2, -269909549);
        setField(term5028, term5028.getClass(), "colors", term5085);
        setField(term5089, term5089.getClass(), "words", term5090);
        setIntField(term5089, term5089.getClass(), "wordsInUse", 686286032);
        setBooleanField(term5089, term5089.getClass(), "sizeIsSticky", false);
        setField(term5028, term5028.getClass(), "used", term5089);
        setIntField(term5028, term5028.getClass(), "numColors", -1277201854);
        setIntField(term5028, term5028.getClass(), "maxColor", 1691516034);
        setField(term5028, term5028.getClass(), "recolor", null);
        setField(term5028, term5028.getClass(), "graph", null);
        term5096 = new Integer(335681723);
        term5098 = new Integer(-773707674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.DSaturGreedyColoring");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term5096;
        args[1] = term5098;
        callMethod(klass, "compareUncoloredVertices", argTypes, term5028, args);
    }

};


