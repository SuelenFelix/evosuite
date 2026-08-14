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

public class JohnsonShortestPath_getPathWeights_4217386925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71037;

    public JohnsonShortestPath_getPathWeights_4217386925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71037 = newInstance(Class.forName("org.graph4j.shortestpath.JohnsonShortestPath"));
        double[] term71038 = (double[]) newDoubleArray(6);
        Object[] term71045 = (Object[]) newArray("org.graph4j.shortestpath.SingleSourceShortestPath", 8);
        Object[] term71046 = (Object[]) newArray("[D", 8);
        double[] term71047 = (double[]) newDoubleArray(6);
        double[] term71054 = (double[]) newDoubleArray(3);
        double[] term71058 = (double[]) newDoubleArray(1);
        double[] term71060 = (double[]) newDoubleArray(1);
        double[] term71062 = (double[]) newDoubleArray(5);
        double[] term71068 = (double[]) newDoubleArray(3);
        double[] term71072 = (double[]) newDoubleArray(3);
        double[] term71076 = (double[]) newDoubleArray(3);
        setField(term71037, term71037.getClass(), "auxGraph", null);
        setDoubleElement(term71038, 0, 0.9936640998569629);
        setDoubleElement(term71038, 1, 0.20546170051950008);
        setDoubleElement(term71038, 2, 0.20430379801390142);
        setDoubleElement(term71038, 3, 0.8036899230168622);
        setDoubleElement(term71038, 4, 0.5190742747448386);
        setDoubleElement(term71038, 5, 0.9704353655783307);
        setField(term71037, term71037.getClass(), "h", term71038);
        setField(term71037, term71037.getClass(), "algs", term71045);
        setDoubleElement(term71047, 0, 0.8549688890034337);
        setDoubleElement(term71047, 1, 0.4854991655570662);
        setDoubleElement(term71047, 2, 0.3546881031736713);
        setDoubleElement(term71047, 3, 0.7541843407325554);
        setDoubleElement(term71047, 4, 0.5001960906721182);
        setDoubleElement(term71047, 5, 0.5744013871464905);
        setElement(term71046, 0, term71047);
        setDoubleElement(term71054, 0, 0.009847686564342317);
        setDoubleElement(term71054, 1, 0.8372266484313398);
        setDoubleElement(term71054, 2, 0.8556592684298061);
        setElement(term71046, 1, term71054);
        setDoubleElement(term71058, 0, 0.6301948004503596);
        setElement(term71046, 2, term71058);
        setDoubleElement(term71060, 0, 0.535748158063941);
        setElement(term71046, 3, term71060);
        setDoubleElement(term71062, 0, 0.08310928294058717);
        setDoubleElement(term71062, 1, 0.6260523257255749);
        setDoubleElement(term71062, 2, 0.7148139031631464);
        setDoubleElement(term71062, 3, 0.36223776143673214);
        setDoubleElement(term71062, 4, 0.94856757856315);
        setElement(term71046, 4, term71062);
        setDoubleElement(term71068, 0, 0.01739845969937226);
        setDoubleElement(term71068, 1, 0.6339098276360026);
        setDoubleElement(term71068, 2, 0.5470756971357633);
        setElement(term71046, 5, term71068);
        setDoubleElement(term71072, 0, 0.6928319251546493);
        setDoubleElement(term71072, 1, 0.9767124470053601);
        setDoubleElement(term71072, 2, 0.5744316188592816);
        setElement(term71046, 6, term71072);
        setDoubleElement(term71076, 0, 0.36748732182712396);
        setDoubleElement(term71076, 1, 0.8099157607911107);
        setDoubleElement(term71076, 2, 0.6772351062411043);
        setElement(term71046, 7, term71076);
        setField(term71037, term71037.getClass(), "weights", term71046);
        setField(term71037, term71037.getClass(), "graph", null);
        setBooleanField(term71037, term71037.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.JohnsonShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPathWeights", argTypes, term71037, args);
    }

};


