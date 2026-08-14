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
import java.lang.Object;

public class TarjanStrongConnectivity_Visitor_upward_20777791065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1255;
     Object term1282;
     Object term1307;

    public TarjanStrongConnectivity_Visitor_upward_20777791065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1255 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor"));
        int[] term1257 = (int[]) newIntArray(7);
        Object term1265 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term1266 = (int[]) newIntArray(1);
        Object term1270 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1271 = (long[]) newLongArray(1);
        boolean[] term1275 = (boolean[]) newBooleanArray(6);
        setBooleanField(term1255, term1255.getClass(), "checkOnly", false);
        setIntElement(term1257, 0, -344907703);
        setIntElement(term1257, 1, 824341437);
        setIntElement(term1257, 2, -1794965320);
        setIntElement(term1257, 3, 520504102);
        setIntElement(term1257, 4, -457396133);
        setIntElement(term1257, 5, -1793950607);
        setIntElement(term1257, 6, 1091954101);
        setField(term1255, term1255.getClass(), "low", term1257);
        setField(term1265, term1265.getClass(), "graph", null);
        setIntElement(term1266, 0, 1895143076);
        setField(term1265, term1265.getClass(), "vertices", term1266);
        setIntField(term1265, term1265.getClass(), "numVertices", 1981860404);
        setIntField(term1265, term1265.getClass(), "first", 732174235);
        setField(term1270, term1270.getClass(), "words", term1271);
        setIntField(term1270, term1270.getClass(), "wordsInUse", 470895808);
        setBooleanField(term1270, term1270.getClass(), "sizeIsSticky", false);
        setField(term1265, term1265.getClass(), "bitset", term1270);
        setField(term1255, term1255.getClass(), "stack", term1265);
        setBooleanElement(term1275, 0, true);
        setBooleanElement(term1275, 3, true);
        setBooleanElement(term1275, 5, true);
        setField(term1255, term1255.getClass(), "instack", term1275);
        setField(term1255, term1255.getClass(), "this$0", null);
        term1282 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1287 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1292 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1297 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1302 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1282, term1282.getClass(), "component", 1787325291);
        setIntField(term1282, term1282.getClass(), "vertex", 1470349147);
        setIntField(term1282, term1282.getClass(), "level", -255317272);
        setIntField(term1282, term1282.getClass(), "order", -706253892);
        setIntField(term1287, term1287.getClass(), "component", -1341439819);
        setIntField(term1287, term1287.getClass(), "vertex", -728760750);
        setIntField(term1287, term1287.getClass(), "level", -1617383807);
        setIntField(term1287, term1287.getClass(), "order", -1244386281);
        setIntField(term1292, term1292.getClass(), "component", -885788574);
        setIntField(term1292, term1292.getClass(), "vertex", -865722613);
        setIntField(term1292, term1292.getClass(), "level", -1551355284);
        setIntField(term1292, term1292.getClass(), "order", -1381970335);
        setIntField(term1297, term1297.getClass(), "component", 1213549815);
        setIntField(term1297, term1297.getClass(), "vertex", -1518419301);
        setIntField(term1297, term1297.getClass(), "level", 674879025);
        setIntField(term1297, term1297.getClass(), "order", -1538936030);
        setIntField(term1302, term1302.getClass(), "component", -752870423);
        setIntField(term1302, term1302.getClass(), "vertex", -1698809299);
        setIntField(term1302, term1302.getClass(), "level", 401512128);
        setIntField(term1302, term1302.getClass(), "order", -2069930777);
        setField(term1302, term1302.getClass(), "parent", null);
        setField(term1297, term1297.getClass(), "parent", term1302);
        setField(term1292, term1292.getClass(), "parent", term1297);
        setField(term1287, term1287.getClass(), "parent", term1292);
        setField(term1282, term1282.getClass(), "parent", term1287);
        term1307 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1312 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1317 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1322 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1327 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1307, term1307.getClass(), "component", 1024134939);
        setIntField(term1307, term1307.getClass(), "vertex", 109078154);
        setIntField(term1307, term1307.getClass(), "level", -314165467);
        setIntField(term1307, term1307.getClass(), "order", 963694071);
        setIntField(term1312, term1312.getClass(), "component", -995785731);
        setIntField(term1312, term1312.getClass(), "vertex", 1349815364);
        setIntField(term1312, term1312.getClass(), "level", 2128383340);
        setIntField(term1312, term1312.getClass(), "order", 1238598518);
        setIntField(term1317, term1317.getClass(), "component", -558146961);
        setIntField(term1317, term1317.getClass(), "vertex", 1505480070);
        setIntField(term1317, term1317.getClass(), "level", -829088844);
        setIntField(term1317, term1317.getClass(), "order", -31751777);
        setIntField(term1322, term1322.getClass(), "component", -246967963);
        setIntField(term1322, term1322.getClass(), "vertex", -1777140369);
        setIntField(term1322, term1322.getClass(), "level", 993627098);
        setIntField(term1322, term1322.getClass(), "order", 872295704);
        setIntField(term1327, term1327.getClass(), "component", 86041387);
        setIntField(term1327, term1327.getClass(), "vertex", 1010721666);
        setIntField(term1327, term1327.getClass(), "level", 27043781);
        setIntField(term1327, term1327.getClass(), "order", -1367122405);
        setField(term1327, term1327.getClass(), "parent", null);
        setField(term1322, term1322.getClass(), "parent", term1327);
        setField(term1317, term1317.getClass(), "parent", term1322);
        setField(term1312, term1312.getClass(), "parent", term1317);
        setField(term1307, term1307.getClass(), "parent", term1312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1282;
        args[1] = term1307;
        callMethod(klass, "upward", argTypes, term1255, args);
    }

};


