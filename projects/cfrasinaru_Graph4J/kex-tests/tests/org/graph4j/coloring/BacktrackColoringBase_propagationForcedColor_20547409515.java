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
import java.lang.Integer;
import java.lang.Object;

public class BacktrackColoringBase_propagationForcedColor_20547409515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1307;
     Object term1309;
     Object term1311;

    public BacktrackColoringBase_propagationForcedColor_20547409515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1307 = new Integer(-634976996);
        term1309 = new Integer(-1015274146);
        term1311 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term1314 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term1317 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term1320 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term1323 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term1329 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term1331 = (Object[]) newArray("org.graph4j.util.Domain", 6);
        Object term1332 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1338 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term1340 = (Object[]) newArray("org.graph4j.util.Domain", 8);
        Object term1341 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1344 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1347 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1350 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1353 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1359 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term1361 = (Object[]) newArray("org.graph4j.util.Domain", 6);
        Object term1362 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1368 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term1370 = (Object[]) newArray("org.graph4j.util.Domain", 2);
        Object term1371 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term1374 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setField(term1311, term1311.getClass(), "alg", null);
        setIntField(term1311, term1311.getClass(), "vertex", -49052672);
        setIntField(term1311, term1311.getClass(), "color", 339372704);
        setField(term1314, term1314.getClass(), "alg", null);
        setIntField(term1314, term1314.getClass(), "vertex", -851097944);
        setIntField(term1314, term1314.getClass(), "color", 803925431);
        setField(term1317, term1317.getClass(), "alg", null);
        setIntField(term1317, term1317.getClass(), "vertex", 76929641);
        setIntField(term1317, term1317.getClass(), "color", -2003192918);
        setField(term1320, term1320.getClass(), "alg", null);
        setIntField(term1320, term1320.getClass(), "vertex", -1362856620);
        setIntField(term1320, term1320.getClass(), "color", -1835839814);
        setField(term1323, term1323.getClass(), "alg", null);
        setIntField(term1323, term1323.getClass(), "vertex", -1404350380);
        setIntField(term1323, term1323.getClass(), "color", -2013924238);
        setField(term1323, term1323.getClass(), "parent", null);
        setField(term1323, term1323.getClass(), "coloring", null);
        setField(term1323, term1323.getClass(), "domains", null);
        setField(term1323, term1323.getClass(), "minDomain", null);
        setBooleanField(term1323, term1323.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term1323, term1323.getClass(), "propagator", true);
        setBooleanField(term1323, term1323.getClass(), "failed", true);
        setField(term1320, term1320.getClass(), "parent", term1323);
        setField(term1329, term1329.getClass(), "graph", null);
        setField(term1329, term1329.getClass(), "vertexColor", null);
        setIntField(term1329, term1329.getClass(), "numColoredVertices", 0);
        setField(term1329, term1329.getClass(), "usedColors", null);
        setField(term1329, term1329.getClass(), "colorMap", null);
        setField(term1320, term1320.getClass(), "coloring", term1329);
        setField(term1320, term1320.getClass(), "domains", term1331);
        setIntField(term1332, term1332.getClass(), "vertex", 0);
        setField(term1332, term1332.getClass(), "values", null);
        setField(term1332, term1332.getClass(), "positions", null);
        setIntField(term1332, term1332.getClass(), "size", 0);
        setField(term1320, term1320.getClass(), "minDomain", term1332);
        setBooleanField(term1320, term1320.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term1320, term1320.getClass(), "propagator", true);
        setBooleanField(term1320, term1320.getClass(), "failed", true);
        setField(term1317, term1317.getClass(), "parent", term1320);
        setField(term1338, term1338.getClass(), "graph", null);
        setField(term1338, term1338.getClass(), "vertexColor", null);
        setIntField(term1338, term1338.getClass(), "numColoredVertices", 0);
        setField(term1338, term1338.getClass(), "usedColors", null);
        setField(term1338, term1338.getClass(), "colorMap", null);
        setField(term1317, term1317.getClass(), "coloring", term1338);
        setIntField(term1341, term1341.getClass(), "vertex", 0);
        setField(term1341, term1341.getClass(), "values", null);
        setField(term1341, term1341.getClass(), "positions", null);
        setIntField(term1341, term1341.getClass(), "size", 0);
        setElement(term1340, 0, term1341);
        setIntField(term1344, term1344.getClass(), "vertex", 0);
        setField(term1344, term1344.getClass(), "values", null);
        setField(term1344, term1344.getClass(), "positions", null);
        setIntField(term1344, term1344.getClass(), "size", 0);
        setElement(term1340, 1, term1344);
        setElement(term1340, 2, term1344);
        setIntField(term1347, term1347.getClass(), "vertex", 0);
        setField(term1347, term1347.getClass(), "values", null);
        setField(term1347, term1347.getClass(), "positions", null);
        setIntField(term1347, term1347.getClass(), "size", 0);
        setElement(term1340, 3, term1347);
        setElement(term1340, 4, term1341);
        setElement(term1340, 5, term1344);
        setIntField(term1350, term1350.getClass(), "vertex", 0);
        setField(term1350, term1350.getClass(), "values", null);
        setField(term1350, term1350.getClass(), "positions", null);
        setIntField(term1350, term1350.getClass(), "size", 0);
        setElement(term1340, 6, term1350);
        setIntField(term1353, term1353.getClass(), "vertex", 0);
        setField(term1353, term1353.getClass(), "values", null);
        setField(term1353, term1353.getClass(), "positions", null);
        setIntField(term1353, term1353.getClass(), "size", 0);
        setElement(term1340, 7, term1353);
        setField(term1317, term1317.getClass(), "domains", term1340);
        setField(term1317, term1317.getClass(), "minDomain", term1347);
        setBooleanField(term1317, term1317.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term1317, term1317.getClass(), "propagator", false);
        setBooleanField(term1317, term1317.getClass(), "failed", true);
        setField(term1314, term1314.getClass(), "parent", term1317);
        setField(term1359, term1359.getClass(), "graph", null);
        setField(term1359, term1359.getClass(), "vertexColor", null);
        setIntField(term1359, term1359.getClass(), "numColoredVertices", 0);
        setField(term1359, term1359.getClass(), "usedColors", null);
        setField(term1359, term1359.getClass(), "colorMap", null);
        setField(term1314, term1314.getClass(), "coloring", term1359);
        setElement(term1361, 0, term1344);
        setElement(term1361, 1, term1341);
        setElement(term1361, 2, term1341);
        setIntField(term1362, term1362.getClass(), "vertex", 0);
        setField(term1362, term1362.getClass(), "values", null);
        setField(term1362, term1362.getClass(), "positions", null);
        setIntField(term1362, term1362.getClass(), "size", 0);
        setElement(term1361, 3, term1362);
        setElement(term1361, 4, term1347);
        setElement(term1361, 5, term1347);
        setField(term1314, term1314.getClass(), "domains", term1361);
        setField(term1314, term1314.getClass(), "minDomain", term1332);
        setBooleanField(term1314, term1314.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term1314, term1314.getClass(), "propagator", false);
        setBooleanField(term1314, term1314.getClass(), "failed", false);
        setField(term1311, term1311.getClass(), "parent", term1314);
        setField(term1368, term1368.getClass(), "graph", null);
        setField(term1368, term1368.getClass(), "vertexColor", null);
        setIntField(term1368, term1368.getClass(), "numColoredVertices", 0);
        setField(term1368, term1368.getClass(), "usedColors", null);
        setField(term1368, term1368.getClass(), "colorMap", null);
        setField(term1311, term1311.getClass(), "coloring", term1368);
        setIntField(term1371, term1371.getClass(), "vertex", 0);
        setField(term1371, term1371.getClass(), "values", null);
        setField(term1371, term1371.getClass(), "positions", null);
        setIntField(term1371, term1371.getClass(), "size", 0);
        setElement(term1370, 0, term1371);
        setElement(term1370, 1, term1371);
        setField(term1311, term1311.getClass(), "domains", term1370);
        setIntField(term1374, term1374.getClass(), "vertex", 0);
        setField(term1374, term1374.getClass(), "values", null);
        setField(term1374, term1374.getClass(), "positions", null);
        setIntField(term1374, term1374.getClass(), "size", 0);
        setField(term1311, term1311.getClass(), "minDomain", term1374);
        setBooleanField(term1311, term1311.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term1311, term1311.getClass(), "propagator", false);
        setBooleanField(term1311, term1311.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.BacktrackColoringBase");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.graph4j.coloring.Node");
        Object[] args = new Object[3];
        args[0] = term1307;
        args[1] = term1309;
        args[2] = term1311;
        callMethod(klass, "propagationForcedColor", argTypes, null, args);
    }

};


