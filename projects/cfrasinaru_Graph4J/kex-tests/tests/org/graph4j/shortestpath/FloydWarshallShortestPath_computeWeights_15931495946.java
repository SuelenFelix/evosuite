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

public class FloydWarshallShortestPath_computeWeights_15931495946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1297;

    public FloydWarshallShortestPath_computeWeights_15931495946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1297 = newInstance(Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath"));
        Object[] term1298 = (Object[]) newArray("[D", 5);
        double[] term1299 = (double[]) newDoubleArray(1);
        double[] term1301 = (double[]) newDoubleArray(8);
        double[] term1310 = (double[]) newDoubleArray(7);
        double[] term1318 = (double[]) newDoubleArray(2);
        double[] term1321 = (double[]) newDoubleArray(2);
        Object[] term1324 = (Object[]) newArray("[I", 8);
        int[] term1325 = (int[]) newIntArray(5);
        int[] term1331 = (int[]) newIntArray(6);
        int[] term1338 = (int[]) newIntArray(6);
        int[] term1345 = (int[]) newIntArray(7);
        int[] term1353 = (int[]) newIntArray(5);
        int[] term1359 = (int[]) newIntArray(2);
        int[] term1362 = (int[]) newIntArray(6);
        int[] term1369 = (int[]) newIntArray(1);
        setDoubleElement(term1299, 0, 0.9306289418004117);
        setElement(term1298, 0, term1299);
        setDoubleElement(term1301, 0, 0.6094033208961637);
        setDoubleElement(term1301, 1, 0.8841587807231336);
        setDoubleElement(term1301, 2, 0.5041105894588648);
        setDoubleElement(term1301, 3, 0.5447228125601069);
        setDoubleElement(term1301, 4, 0.881005463515806);
        setDoubleElement(term1301, 5, 0.24535082601257097);
        setDoubleElement(term1301, 6, 0.8251257683961645);
        setDoubleElement(term1301, 7, 0.9368808881355091);
        setElement(term1298, 1, term1301);
        setDoubleElement(term1310, 0, 0.6198040082983302);
        setDoubleElement(term1310, 1, 0.8222160691812529);
        setDoubleElement(term1310, 2, 0.6481625751444708);
        setDoubleElement(term1310, 3, 0.62046987338639);
        setDoubleElement(term1310, 4, 0.16681991355621673);
        setDoubleElement(term1310, 5, 0.24168508149332457);
        setDoubleElement(term1310, 6, 0.9765582392968284);
        setElement(term1298, 2, term1310);
        setDoubleElement(term1318, 0, 0.33340230026214834);
        setDoubleElement(term1318, 1, 0.7912735654922212);
        setElement(term1298, 3, term1318);
        setDoubleElement(term1321, 0, 0.7177162541558186);
        setDoubleElement(term1321, 1, 0.4751993224281752);
        setElement(term1298, 4, term1321);
        setField(term1297, term1297.getClass(), "cost", term1298);
        setIntElement(term1325, 0, 1041916673);
        setIntElement(term1325, 1, -601863069);
        setIntElement(term1325, 2, 663292551);
        setIntElement(term1325, 3, -1885090354);
        setIntElement(term1325, 4, -2066804303);
        setElement(term1324, 0, term1325);
        setIntElement(term1331, 0, -1731761810);
        setIntElement(term1331, 1, 197109649);
        setIntElement(term1331, 2, -1239406390);
        setIntElement(term1331, 3, 1557431527);
        setIntElement(term1331, 4, -1504890659);
        setIntElement(term1331, 5, 1358829571);
        setElement(term1324, 1, term1331);
        setIntElement(term1338, 0, 991356662);
        setIntElement(term1338, 1, -506958186);
        setIntElement(term1338, 2, -507387516);
        setIntElement(term1338, 3, -1970452551);
        setIntElement(term1338, 4, -1896376975);
        setIntElement(term1338, 5, 729658803);
        setElement(term1324, 2, term1338);
        setIntElement(term1345, 0, 114754804);
        setIntElement(term1345, 1, 1687361082);
        setIntElement(term1345, 2, 584893196);
        setIntElement(term1345, 3, 497269071);
        setIntElement(term1345, 4, -1899301124);
        setIntElement(term1345, 5, -1882480155);
        setIntElement(term1345, 6, -1410220680);
        setElement(term1324, 3, term1345);
        setIntElement(term1353, 0, 389427431);
        setIntElement(term1353, 1, -1945706126);
        setIntElement(term1353, 2, 1152356969);
        setIntElement(term1353, 3, -1667990367);
        setIntElement(term1353, 4, -1214628358);
        setElement(term1324, 4, term1353);
        setIntElement(term1359, 0, 1102721075);
        setIntElement(term1359, 1, -426764678);
        setElement(term1324, 5, term1359);
        setIntElement(term1362, 0, -1222614956);
        setIntElement(term1362, 1, -1870495012);
        setIntElement(term1362, 2, -1310015129);
        setIntElement(term1362, 3, -2104981311);
        setIntElement(term1362, 4, -571169753);
        setIntElement(term1362, 5, 318591690);
        setElement(term1324, 6, term1362);
        setIntElement(term1369, 0, -165587447);
        setElement(term1324, 7, term1369);
        setField(term1297, term1297.getClass(), "before", term1324);
        setField(term1297, term1297.getClass(), "graph", null);
        setBooleanField(term1297, term1297.getClass(), "directed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.shortestpath.FloydWarshallShortestPath");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeWeights", argTypes, term1297, args);
    }

};


