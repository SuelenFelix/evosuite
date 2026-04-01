package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class TarjanStrongConnectivity_compute_15633802024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6089;
     Object term6202;

    public TarjanStrongConnectivity_compute_15633802024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term6092 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6093 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6097 = (int[]) newIntArray(3);
        Object term6103 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6093, term6093.getClass(), "table", null);
        setIntField(term6093, term6093.getClass(), "count", -1435032444);
        setIntField(term6093, term6093.getClass(), "threshold", 15);
        setFloatField(term6093, term6093.getClass(), "loadFactor", 0.75F);
        setField(term6092, term6092.getClass(), "posMap", term6093);
        setField(term6092, term6092.getClass(), "graph", null);
        setIntElement(term6097, 0, -420769218);
        setIntElement(term6097, 1, -1047476590);
        setIntElement(term6097, 2, -804745833);
        setField(term6092, term6092.getClass(), "vertices", term6097);
        setIntField(term6092, term6092.getClass(), "numVertices", 1080834214);
        setIntField(term6092, term6092.getClass(), "first", 323842695);
        setField(term6103, term6103.getClass(), "words", null);
        setIntField(term6103, term6103.getClass(), "wordsInUse", 331897564);
        setBooleanField(term6103, term6103.getClass(), "sizeIsSticky", false);
        setField(term6092, term6092.getClass(), "bitset", term6103);
        Object term6106 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6107 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6111 = (int[]) newIntArray(7);
        Object term6121 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6107, term6107.getClass(), "table", null);
        setIntField(term6107, term6107.getClass(), "count", -968105925);
        setIntField(term6107, term6107.getClass(), "threshold", 15);
        setFloatField(term6107, term6107.getClass(), "loadFactor", 0.75F);
        setField(term6106, term6106.getClass(), "posMap", term6107);
        setField(term6106, term6106.getClass(), "graph", null);
        setIntElement(term6111, 0, -206020926);
        setIntElement(term6111, 1, -2054014210);
        setIntElement(term6111, 2, 1179045520);
        setIntElement(term6111, 3, 1056739921);
        setIntElement(term6111, 4, 1384627927);
        setIntElement(term6111, 5, -1252280115);
        setIntElement(term6111, 6, -120849363);
        setField(term6106, term6106.getClass(), "vertices", term6111);
        setIntField(term6106, term6106.getClass(), "numVertices", 147387583);
        setIntField(term6106, term6106.getClass(), "first", -1307347557);
        setField(term6121, term6121.getClass(), "words", null);
        setIntField(term6121, term6121.getClass(), "wordsInUse", 1092325030);
        setBooleanField(term6121, term6121.getClass(), "sizeIsSticky", true);
        setField(term6106, term6106.getClass(), "bitset", term6121);
        Object term6124 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6125 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6129 = (int[]) newIntArray(8);
        Object term6140 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6125, term6125.getClass(), "table", null);
        setIntField(term6125, term6125.getClass(), "count", -1901115940);
        setIntField(term6125, term6125.getClass(), "threshold", 15);
        setFloatField(term6125, term6125.getClass(), "loadFactor", 0.75F);
        setField(term6124, term6124.getClass(), "posMap", term6125);
        setField(term6124, term6124.getClass(), "graph", null);
        setIntElement(term6129, 0, 1934437115);
        setIntElement(term6129, 1, 1820319919);
        setIntElement(term6129, 2, 1444962020);
        setIntElement(term6129, 3, 1636228804);
        setIntElement(term6129, 4, -1650533427);
        setIntElement(term6129, 5, -1076430316);
        setIntElement(term6129, 6, 1984492528);
        setIntElement(term6129, 7, -655764067);
        setField(term6124, term6124.getClass(), "vertices", term6129);
        setIntField(term6124, term6124.getClass(), "numVertices", 31238744);
        setIntField(term6124, term6124.getClass(), "first", 680031965);
        setField(term6140, term6140.getClass(), "words", null);
        setIntField(term6140, term6140.getClass(), "wordsInUse", -2112419098);
        setBooleanField(term6140, term6140.getClass(), "sizeIsSticky", true);
        setField(term6124, term6124.getClass(), "bitset", term6140);
        Object term6143 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6144 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6148 = (int[]) newIntArray(3);
        Object term6154 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6144, term6144.getClass(), "table", null);
        setIntField(term6144, term6144.getClass(), "count", -1649429373);
        setIntField(term6144, term6144.getClass(), "threshold", 15);
        setFloatField(term6144, term6144.getClass(), "loadFactor", 0.75F);
        setField(term6143, term6143.getClass(), "posMap", term6144);
        setField(term6143, term6143.getClass(), "graph", null);
        setIntElement(term6148, 0, -1605518502);
        setIntElement(term6148, 1, -499081946);
        setIntElement(term6148, 2, 1834067063);
        setField(term6143, term6143.getClass(), "vertices", term6148);
        setIntField(term6143, term6143.getClass(), "numVertices", -1578513908);
        setIntField(term6143, term6143.getClass(), "first", 312330930);
        setField(term6154, term6154.getClass(), "words", null);
        setIntField(term6154, term6154.getClass(), "wordsInUse", 1635910980);
        setBooleanField(term6154, term6154.getClass(), "sizeIsSticky", false);
        setField(term6143, term6143.getClass(), "bitset", term6154);
        Object term6157 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6158 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6162 = (int[]) newIntArray(5);
        Object term6170 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6158, term6158.getClass(), "table", null);
        setIntField(term6158, term6158.getClass(), "count", 1560346640);
        setIntField(term6158, term6158.getClass(), "threshold", 15);
        setFloatField(term6158, term6158.getClass(), "loadFactor", 0.75F);
        setField(term6157, term6157.getClass(), "posMap", term6158);
        setField(term6157, term6157.getClass(), "graph", null);
        setIntElement(term6162, 0, 100626332);
        setIntElement(term6162, 1, 763794722);
        setIntElement(term6162, 2, -696403395);
        setIntElement(term6162, 3, 227321148);
        setIntElement(term6162, 4, -266870537);
        setField(term6157, term6157.getClass(), "vertices", term6162);
        setIntField(term6157, term6157.getClass(), "numVertices", -453010858);
        setIntField(term6157, term6157.getClass(), "first", -1855427206);
        setField(term6170, term6170.getClass(), "words", null);
        setIntField(term6170, term6170.getClass(), "wordsInUse", -647618746);
        setBooleanField(term6170, term6170.getClass(), "sizeIsSticky", true);
        setField(term6157, term6157.getClass(), "bitset", term6170);
        Object term6173 = newInstance(Class.forName("org.graph4j.util.VertexSet"));
        Object term6174 = newInstance(Class.forName("org.graph4j.util.IntHashMap"));
        int[] term6178 = (int[]) newIntArray(7);
        Object term6188 = newInstance(Class.forName("java.util.BitSet"));
        setField(term6174, term6174.getClass(), "table", null);
        setIntField(term6174, term6174.getClass(), "count", -91129577);
        setIntField(term6174, term6174.getClass(), "threshold", 15);
        setFloatField(term6174, term6174.getClass(), "loadFactor", 0.75F);
        setField(term6173, term6173.getClass(), "posMap", term6174);
        setField(term6173, term6173.getClass(), "graph", null);
        setIntElement(term6178, 0, 1629059877);
        setIntElement(term6178, 1, -649940550);
        setIntElement(term6178, 2, 36785954);
        setIntElement(term6178, 3, -907057089);
        setIntElement(term6178, 4, -1740998635);
        setIntElement(term6178, 5, 183857482);
        setIntElement(term6178, 6, -1845135476);
        setField(term6173, term6173.getClass(), "vertices", term6178);
        setIntField(term6173, term6173.getClass(), "numVertices", -811321521);
        setIntField(term6173, term6173.getClass(), "first", 449172516);
        setField(term6188, term6188.getClass(), "words", null);
        setIntField(term6188, term6188.getClass(), "wordsInUse", -1224535182);
        setBooleanField(term6188, term6188.getClass(), "sizeIsSticky", true);
        setField(term6173, term6173.getClass(), "bitset", term6188);
        ArrayList term6090 = new ArrayList();
        ((ArrayList) term6090).add(term6092);
        ((ArrayList) term6090).add(term6106);
        ((ArrayList) term6090).add(term6124);
        ((ArrayList) term6090).add(term6143);
        ((ArrayList) term6090).add(term6157);
        ((ArrayList) term6090).add(term6173);
        Boolean term6200 = new Boolean(false);
        term6089 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity"));
        int[] term6193 = (int[]) newIntArray(6);
        setField(term6089, term6089.getClass(), "compSets", term6090);
        setIntElement(term6193, 0, 1181771633);
        setIntElement(term6193, 1, -21975974);
        setIntElement(term6193, 2, -862969915);
        setIntElement(term6193, 3, -1289681614);
        setIntElement(term6193, 4, 496461454);
        setIntElement(term6193, 5, -697047947);
        setField(term6089, term6089.getClass(), "vertexComp", term6193);
        setField(term6089, term6089.getClass(), "graph", null);
        setField(term6089, term6089.getClass(), "stronglyConnected", term6200);
        term6202 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term6202;
        callMethod(klass, "compute", argTypes, term6089, args);
    }

};


