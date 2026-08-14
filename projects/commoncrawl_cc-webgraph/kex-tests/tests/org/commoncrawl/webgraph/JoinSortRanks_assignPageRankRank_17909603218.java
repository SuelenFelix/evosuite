package org.commoncrawl.webgraph;

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
import static org.commoncrawl.webgraph.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JoinSortRanks_assignPageRankRank_17909603218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9304;

    public JoinSortRanks_assignPageRankRank_17909603218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9304 = newInstance(Class.forName("org.commoncrawl.webgraph.JoinSortRanks"));
        float[] term9305 = (float[]) newFloatArray(8);
        double[] term9314 = (double[]) newDoubleArray(7);
        int[] term9322 = (int[]) newIntArray(9);
        int[] term9332 = (int[]) newIntArray(8);
        int[] term9341 = (int[]) newIntArray(6);
        setFloatElement(term9305, 0, 0.26696402F);
        setFloatElement(term9305, 1, 0.54856896F);
        setFloatElement(term9305, 2, 0.6206213F);
        setFloatElement(term9305, 3, 0.9765248F);
        setFloatElement(term9305, 4, 0.17890882F);
        setFloatElement(term9305, 5, 0.9184034F);
        setFloatElement(term9305, 6, 0.7326771F);
        setFloatElement(term9305, 7, 0.9457448F);
        setField(term9304, term9304.getClass(), "harmonicCentralityValues", term9305);
        setDoubleElement(term9314, 0, 0.41934015614685227);
        setDoubleElement(term9314, 1, 0.07298304401683597);
        setDoubleElement(term9314, 2, 0.6101411757610665);
        setDoubleElement(term9314, 3, 0.07932996853888874);
        setDoubleElement(term9314, 4, 0.4335752168808029);
        setDoubleElement(term9314, 5, 0.9196949182738653);
        setDoubleElement(term9314, 6, 0.5820770579753712);
        setField(term9304, term9304.getClass(), "pageRankValues", term9314);
        setIntElement(term9322, 0, -1516995753);
        setIntElement(term9322, 1, -390501023);
        setIntElement(term9322, 2, -1667482829);
        setIntElement(term9322, 3, 1116576792);
        setIntElement(term9322, 4, -942194446);
        setIntElement(term9322, 5, -938508470);
        setIntElement(term9322, 6, 1242676024);
        setIntElement(term9322, 7, -1865023308);
        setIntElement(term9322, 8, 1698510819);
        setField(term9304, term9304.getClass(), "harmonicCentralityRanks", term9322);
        setIntElement(term9332, 0, -1553893255);
        setIntElement(term9332, 1, 1303442927);
        setIntElement(term9332, 2, 794568325);
        setIntElement(term9332, 3, -434468428);
        setIntElement(term9332, 4, 1559605714);
        setIntElement(term9332, 5, 1146601902);
        setIntElement(term9332, 6, -1938881385);
        setIntElement(term9332, 7, -1629418973);
        setField(term9304, term9304.getClass(), "pageRankRanks", term9332);
        setIntElement(term9341, 0, -100825168);
        setIntElement(term9341, 1, 768407648);
        setIntElement(term9341, 2, -350454594);
        setIntElement(term9341, 3, -1148142995);
        setIntElement(term9341, 4, -233024044);
        setIntElement(term9341, 5, 1820784228);
        setField(term9304, term9304.getClass(), "indirectSortPerm", term9341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.commoncrawl.webgraph.JoinSortRanks");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assignPageRankRank", argTypes, term9304, args);
    }

};


