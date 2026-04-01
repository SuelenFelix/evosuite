package org.graph4j.shortestpath;

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
import static org.graph4j.shortestpath.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AStarAlgorithm_getSource_6555623261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122481;

    public AStarAlgorithm_getSource_6555623261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122481 = newInstance(Class.forName("org.graph4j.shortestpath.AStarAlgorithm"));
        int[] term122484 = (int[]) newIntArray(8);
        double[] term122493 = (double[]) newDoubleArray(8);
        int[] term122502 = (int[]) newIntArray(6);
        int[] term122509 = (int[]) newIntArray(2);
        boolean[] term122512 = (boolean[]) newBooleanArray(3);
        Object term122517 = newInstance(Class.forName("org.graph4j.util.VertexHeap"));
        int[] term122518 = (int[]) newIntArray(9);
        int[] term122528 = (int[]) newIntArray(3);
        setIntField(term122481, term122481.getClass(), "source", -127253041);
        setIntField(term122481, term122481.getClass(), "target", -1811207274);
        setIntElement(term122484, 0, 768422554);
        setIntElement(term122484, 1, 394650643);
        setIntElement(term122484, 2, -932679601);
        setIntElement(term122484, 3, -1330421355);
        setIntElement(term122484, 4, 1571484497);
        setIntElement(term122484, 5, -206357114);
        setIntElement(term122484, 6, 535792127);
        setIntElement(term122484, 7, 1312846329);
        setField(term122481, term122481.getClass(), "vertices", term122484);
        setDoubleElement(term122493, 0, 0.18789282046375821);
        setDoubleElement(term122493, 1, 0.6677608601022691);
        setDoubleElement(term122493, 2, 0.6028360664361403);
        setDoubleElement(term122493, 3, 0.3121133083939044);
        setDoubleElement(term122493, 4, 0.05747721541427808);
        setDoubleElement(term122493, 5, 0.2499984568053112);
        setDoubleElement(term122493, 6, 0.5038070731128561);
        setDoubleElement(term122493, 7, 0.7086638820476577);
        setField(term122481, term122481.getClass(), "cost", term122493);
        setIntElement(term122502, 0, 1121498182);
        setIntElement(term122502, 1, 382253178);
        setIntElement(term122502, 2, -1183590239);
        setIntElement(term122502, 3, -1714250163);
        setIntElement(term122502, 4, 1034423507);
        setIntElement(term122502, 5, 1679956659);
        setField(term122481, term122481.getClass(), "before", term122502);
        setIntElement(term122509, 0, 55150040);
        setIntElement(term122509, 1, -1569380298);
        setField(term122481, term122481.getClass(), "size", term122509);
        setBooleanElement(term122512, 0, true);
        setBooleanElement(term122512, 1, true);
        setBooleanElement(term122512, 2, true);
        setField(term122481, term122481.getClass(), "solved", term122512);
        setIntField(term122481, term122481.getClass(), "numSolved", -618790435);
        setField(term122517, term122517.getClass(), "graph", null);
        setField(term122517, term122517.getClass(), "comparator", null);
        setIntElement(term122518, 0, 2115457033);
        setIntElement(term122518, 1, -279187388);
        setIntElement(term122518, 2, -1821126917);
        setIntElement(term122518, 3, -1479667968);
        setIntElement(term122518, 4, -344715886);
        setIntElement(term122518, 5, 14711246);
        setIntElement(term122518, 6, 1011622215);
        setIntElement(term122518, 7, 968888075);
        setIntElement(term122518, 8, -1071381760);
        setField(term122517, term122517.getClass(), "keys", term122518);
        setIntElement(term122528, 0, 305620804);
        setIntElement(term122528, 1, -826562770);
        setIntElement(term122528, 2, 166180782);
        setField(term122517, term122517.getClass(), "positions", term122528);
        setIntField(term122517, term122517.getClass(), "size", -1339670970);
        setField(term122481, term122481.getClass(), "heap", term122517);
        setField(term122481, term122481.getClass(), "heuristic", null);
        setField(term122481, term122481.getClass(), "graph", null);
        setBooleanField(term122481, term122481.getClass(), "directed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.AStarAlgorithm");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term122481, args);
    }

};


