package org.graph4j.traversal;

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
import static org.graph4j.traversal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BFSVisitor_crossEdge_20104429224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1261;
     Object term1286;

    public BFSVisitor_crossEdge_20104429224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1261 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1266 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1271 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1276 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1281 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1261, term1261.getClass(), "component", 1857693976);
        setIntField(term1261, term1261.getClass(), "vertex", 1631305277);
        setIntField(term1261, term1261.getClass(), "level", 162113491);
        setIntField(term1261, term1261.getClass(), "order", -932147928);
        setIntField(term1266, term1266.getClass(), "component", 487369012);
        setIntField(term1266, term1266.getClass(), "vertex", -179238712);
        setIntField(term1266, term1266.getClass(), "level", -2018735535);
        setIntField(term1266, term1266.getClass(), "order", -658524954);
        setIntField(term1271, term1271.getClass(), "component", -2009613557);
        setIntField(term1271, term1271.getClass(), "vertex", 654195547);
        setIntField(term1271, term1271.getClass(), "level", 1622857008);
        setIntField(term1271, term1271.getClass(), "order", 934338954);
        setIntField(term1276, term1276.getClass(), "component", 598635505);
        setIntField(term1276, term1276.getClass(), "vertex", -944986533);
        setIntField(term1276, term1276.getClass(), "level", 1894454926);
        setIntField(term1276, term1276.getClass(), "order", 1415142780);
        setIntField(term1281, term1281.getClass(), "component", -574105759);
        setIntField(term1281, term1281.getClass(), "vertex", -1165271567);
        setIntField(term1281, term1281.getClass(), "level", 376834234);
        setIntField(term1281, term1281.getClass(), "order", -1911972560);
        setField(term1281, term1281.getClass(), "parent", null);
        setField(term1276, term1276.getClass(), "parent", term1281);
        setField(term1271, term1271.getClass(), "parent", term1276);
        setField(term1266, term1266.getClass(), "parent", term1271);
        setField(term1261, term1261.getClass(), "parent", term1266);
        term1286 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1291 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1296 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1301 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1306 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1286, term1286.getClass(), "component", -1984436481);
        setIntField(term1286, term1286.getClass(), "vertex", -407582855);
        setIntField(term1286, term1286.getClass(), "level", 1190753616);
        setIntField(term1286, term1286.getClass(), "order", -752378450);
        setIntField(term1291, term1291.getClass(), "component", 848907965);
        setIntField(term1291, term1291.getClass(), "vertex", 1865070548);
        setIntField(term1291, term1291.getClass(), "level", 1904515443);
        setIntField(term1291, term1291.getClass(), "order", 1361126430);
        setIntField(term1296, term1296.getClass(), "component", 1728588701);
        setIntField(term1296, term1296.getClass(), "vertex", -355769268);
        setIntField(term1296, term1296.getClass(), "level", -114460662);
        setIntField(term1296, term1296.getClass(), "order", -355376034);
        setIntField(term1301, term1301.getClass(), "component", 588390599);
        setIntField(term1301, term1301.getClass(), "vertex", -95969566);
        setIntField(term1301, term1301.getClass(), "level", -68615285);
        setIntField(term1301, term1301.getClass(), "order", -337504086);
        setIntField(term1306, term1306.getClass(), "component", 2074130991);
        setIntField(term1306, term1306.getClass(), "vertex", 532588266);
        setIntField(term1306, term1306.getClass(), "level", -1286686332);
        setIntField(term1306, term1306.getClass(), "order", -284885486);
        setField(term1306, term1306.getClass(), "parent", null);
        setField(term1301, term1301.getClass(), "parent", term1306);
        setField(term1296, term1296.getClass(), "parent", term1301);
        setField(term1291, term1291.getClass(), "parent", term1296);
        setField(term1286, term1286.getClass(), "parent", term1291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term1261;
        args[1] = term1286;
        callMethod(klass, "crossEdge", argTypes, null, args);
    }

};


