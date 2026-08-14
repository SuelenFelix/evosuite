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

public class BacktrackColoringBase_propagateFailure_422060166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1380;

    public BacktrackColoringBase_propagateFailure_422060166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1380 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term1383 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term1386 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term1389 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term1392 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term1398 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term1400 = (Object[]) newArray("org.graph4j.util.Domain", 5);
        Object term1401 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1407 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term1409 = (Object[]) newArray("org.graph4j.util.Domain", 3);
        Object term1410 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1413 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1419 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term1421 = (Object[]) newArray("org.graph4j.util.Domain", 9);
        Object term1422 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1425 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1428 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1431 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1434 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1440 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term1442 = (Object[]) newArray("org.graph4j.util.Domain", 7);
        Object term1443 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setField(term1380, term1380.getClass(), "alg", null);
        setIntField(term1380, term1380.getClass(), "vertex", 579006268);
        setIntField(term1380, term1380.getClass(), "color", -1694747156);
        setField(term1383, term1383.getClass(), "alg", null);
        setIntField(term1383, term1383.getClass(), "vertex", 1466373988);
        setIntField(term1383, term1383.getClass(), "color", -358526505);
        setField(term1386, term1386.getClass(), "alg", null);
        setIntField(term1386, term1386.getClass(), "vertex", 1843268026);
        setIntField(term1386, term1386.getClass(), "color", 954660603);
        setField(term1389, term1389.getClass(), "alg", null);
        setIntField(term1389, term1389.getClass(), "vertex", -1351605385);
        setIntField(term1389, term1389.getClass(), "color", 278355793);
        setField(term1392, term1392.getClass(), "alg", null);
        setIntField(term1392, term1392.getClass(), "vertex", -310648604);
        setIntField(term1392, term1392.getClass(), "color", -648200466);
        setField(term1392, term1392.getClass(), "parent", null);
        setField(term1392, term1392.getClass(), "coloring", null);
        setField(term1392, term1392.getClass(), "domains", null);
        setField(term1392, term1392.getClass(), "minDomain", null);
        setBooleanField(term1392, term1392.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term1392, term1392.getClass(), "propagator", true);
        setBooleanField(term1392, term1392.getClass(), "failed", false);
        setField(term1389, term1389.getClass(), "parent", term1392);
        setField(term1398, term1398.getClass(), "graph", null);
        setField(term1398, term1398.getClass(), "vertexColor", null);
        setIntField(term1398, term1398.getClass(), "numColoredVertices", 0);
        setField(term1398, term1398.getClass(), "usedColors", null);
        setField(term1398, term1398.getClass(), "colorMap", null);
        setField(term1389, term1389.getClass(), "coloring", term1398);
        setField(term1389, term1389.getClass(), "domains", term1400);
        setIntField(term1401, term1401.getClass(), "vertex", 0);
        setField(term1401, term1401.getClass(), "values", null);
        setField(term1401, term1401.getClass(), "positions", null);
        setIntField(term1401, term1401.getClass(), "size", 0);
        setField(term1389, term1389.getClass(), "minDomain", term1401);
        setBooleanField(term1389, term1389.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term1389, term1389.getClass(), "propagator", false);
        setBooleanField(term1389, term1389.getClass(), "failed", false);
        setField(term1386, term1386.getClass(), "parent", term1389);
        setField(term1407, term1407.getClass(), "graph", null);
        setField(term1407, term1407.getClass(), "vertexColor", null);
        setIntField(term1407, term1407.getClass(), "numColoredVertices", 0);
        setField(term1407, term1407.getClass(), "usedColors", null);
        setField(term1407, term1407.getClass(), "colorMap", null);
        setField(term1386, term1386.getClass(), "coloring", term1407);
        setIntField(term1410, term1410.getClass(), "vertex", 0);
        setField(term1410, term1410.getClass(), "values", null);
        setField(term1410, term1410.getClass(), "positions", null);
        setIntField(term1410, term1410.getClass(), "size", 0);
        setElement(term1409, 0, term1410);
        setIntField(term1413, term1413.getClass(), "vertex", 0);
        setField(term1413, term1413.getClass(), "values", null);
        setField(term1413, term1413.getClass(), "positions", null);
        setIntField(term1413, term1413.getClass(), "size", 0);
        setElement(term1409, 1, term1413);
        setElement(term1409, 2, term1401);
        setField(term1386, term1386.getClass(), "domains", term1409);
        setField(term1386, term1386.getClass(), "minDomain", term1410);
        setBooleanField(term1386, term1386.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term1386, term1386.getClass(), "propagator", true);
        setBooleanField(term1386, term1386.getClass(), "failed", true);
        setField(term1383, term1383.getClass(), "parent", term1386);
        setField(term1419, term1419.getClass(), "graph", null);
        setField(term1419, term1419.getClass(), "vertexColor", null);
        setIntField(term1419, term1419.getClass(), "numColoredVertices", 0);
        setField(term1419, term1419.getClass(), "usedColors", null);
        setField(term1419, term1419.getClass(), "colorMap", null);
        setField(term1383, term1383.getClass(), "coloring", term1419);
        setIntField(term1422, term1422.getClass(), "vertex", 0);
        setField(term1422, term1422.getClass(), "values", null);
        setField(term1422, term1422.getClass(), "positions", null);
        setIntField(term1422, term1422.getClass(), "size", 0);
        setElement(term1421, 0, term1422);
        setIntField(term1425, term1425.getClass(), "vertex", 0);
        setField(term1425, term1425.getClass(), "values", null);
        setField(term1425, term1425.getClass(), "positions", null);
        setIntField(term1425, term1425.getClass(), "size", 0);
        setElement(term1421, 1, term1425);
        setIntField(term1428, term1428.getClass(), "vertex", 0);
        setField(term1428, term1428.getClass(), "values", null);
        setField(term1428, term1428.getClass(), "positions", null);
        setIntField(term1428, term1428.getClass(), "size", 0);
        setElement(term1421, 2, term1428);
        setIntField(term1431, term1431.getClass(), "vertex", 0);
        setField(term1431, term1431.getClass(), "values", null);
        setField(term1431, term1431.getClass(), "positions", null);
        setIntField(term1431, term1431.getClass(), "size", 0);
        setElement(term1421, 3, term1431);
        setElement(term1421, 4, term1431);
        setElement(term1421, 5, term1413);
        setElement(term1421, 6, term1401);
        setElement(term1421, 7, term1401);
        setIntField(term1434, term1434.getClass(), "vertex", 0);
        setField(term1434, term1434.getClass(), "values", null);
        setField(term1434, term1434.getClass(), "positions", null);
        setIntField(term1434, term1434.getClass(), "size", 0);
        setElement(term1421, 8, term1434);
        setField(term1383, term1383.getClass(), "domains", term1421);
        setField(term1383, term1383.getClass(), "minDomain", term1413);
        setBooleanField(term1383, term1383.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term1383, term1383.getClass(), "propagator", false);
        setBooleanField(term1383, term1383.getClass(), "failed", false);
        setField(term1380, term1380.getClass(), "parent", term1383);
        setField(term1440, term1440.getClass(), "graph", null);
        setField(term1440, term1440.getClass(), "vertexColor", null);
        setIntField(term1440, term1440.getClass(), "numColoredVertices", 0);
        setField(term1440, term1440.getClass(), "usedColors", null);
        setField(term1440, term1440.getClass(), "colorMap", null);
        setField(term1380, term1380.getClass(), "coloring", term1440);
        setElement(term1442, 0, term1401);
        setElement(term1442, 1, term1425);
        setIntField(term1443, term1443.getClass(), "vertex", 0);
        setField(term1443, term1443.getClass(), "values", null);
        setField(term1443, term1443.getClass(), "positions", null);
        setIntField(term1443, term1443.getClass(), "size", 0);
        setElement(term1442, 2, term1443);
        setElement(term1442, 3, term1434);
        setElement(term1442, 4, term1401);
        setElement(term1442, 5, term1413);
        setElement(term1442, 6, term1413);
        setField(term1380, term1380.getClass(), "domains", term1442);
        setField(term1380, term1380.getClass(), "minDomain", term1428);
        setBooleanField(term1380, term1380.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term1380, term1380.getClass(), "propagator", false);
        setBooleanField(term1380, term1380.getClass(), "failed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoringBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.coloring.Node");
        Object[] args = new Object[1];
        args[0] = term1380;
        callMethod(klass, "propagateFailure", argTypes, null, args);
    }

};


