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

public class Node_trace_20106905242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346;

    public Node_trace_20106905242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term349 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term352 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term355 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term358 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term364 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term366 = (Object[]) newArray("org.graph4j.util.Domain", 5);
        Object term367 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term373 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term375 = (Object[]) newArray("org.graph4j.util.Domain", 3);
        Object term376 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term379 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term382 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term388 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term390 = (Object[]) newArray("org.graph4j.util.Domain", 7);
        Object term391 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term394 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term397 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term400 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term406 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term408 = (Object[]) newArray("org.graph4j.util.Domain", 2);
        setField(term346, term346.getClass(), "alg", null);
        setIntField(term346, term346.getClass(), "vertex", 1045657203);
        setIntField(term346, term346.getClass(), "color", 1386130016);
        setField(term349, term349.getClass(), "alg", null);
        setIntField(term349, term349.getClass(), "vertex", 1072005683);
        setIntField(term349, term349.getClass(), "color", 1861318859);
        setField(term352, term352.getClass(), "alg", null);
        setIntField(term352, term352.getClass(), "vertex", 1474524152);
        setIntField(term352, term352.getClass(), "color", 568954359);
        setField(term355, term355.getClass(), "alg", null);
        setIntField(term355, term355.getClass(), "vertex", 53410913);
        setIntField(term355, term355.getClass(), "color", -375014958);
        setField(term358, term358.getClass(), "alg", null);
        setIntField(term358, term358.getClass(), "vertex", 1107176718);
        setIntField(term358, term358.getClass(), "color", 480137250);
        setField(term358, term358.getClass(), "parent", null);
        setField(term358, term358.getClass(), "coloring", null);
        setField(term358, term358.getClass(), "domains", null);
        setField(term358, term358.getClass(), "minDomain", null);
        setBooleanField(term358, term358.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term358, term358.getClass(), "propagator", false);
        setBooleanField(term358, term358.getClass(), "failed", true);
        setField(term355, term355.getClass(), "parent", term358);
        setField(term364, term364.getClass(), "graph", null);
        setField(term364, term364.getClass(), "vertexColor", null);
        setIntField(term364, term364.getClass(), "numColoredVertices", 0);
        setField(term364, term364.getClass(), "usedColors", null);
        setField(term364, term364.getClass(), "colorMap", null);
        setField(term355, term355.getClass(), "coloring", term364);
        setField(term355, term355.getClass(), "domains", term366);
        setIntField(term367, term367.getClass(), "vertex", 0);
        setField(term367, term367.getClass(), "values", null);
        setField(term367, term367.getClass(), "positions", null);
        setIntField(term367, term367.getClass(), "size", 0);
        setField(term355, term355.getClass(), "minDomain", term367);
        setBooleanField(term355, term355.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term355, term355.getClass(), "propagator", true);
        setBooleanField(term355, term355.getClass(), "failed", false);
        setField(term352, term352.getClass(), "parent", term355);
        setField(term373, term373.getClass(), "graph", null);
        setField(term373, term373.getClass(), "vertexColor", null);
        setIntField(term373, term373.getClass(), "numColoredVertices", 0);
        setField(term373, term373.getClass(), "usedColors", null);
        setField(term373, term373.getClass(), "colorMap", null);
        setField(term352, term352.getClass(), "coloring", term373);
        setIntField(term376, term376.getClass(), "vertex", 0);
        setField(term376, term376.getClass(), "values", null);
        setField(term376, term376.getClass(), "positions", null);
        setIntField(term376, term376.getClass(), "size", 0);
        setElement(term375, 0, term376);
        setIntField(term379, term379.getClass(), "vertex", 0);
        setField(term379, term379.getClass(), "values", null);
        setField(term379, term379.getClass(), "positions", null);
        setIntField(term379, term379.getClass(), "size", 0);
        setElement(term375, 1, term379);
        setIntField(term382, term382.getClass(), "vertex", 0);
        setField(term382, term382.getClass(), "values", null);
        setField(term382, term382.getClass(), "positions", null);
        setIntField(term382, term382.getClass(), "size", 0);
        setElement(term375, 2, term382);
        setField(term352, term352.getClass(), "domains", term375);
        setField(term352, term352.getClass(), "minDomain", term382);
        setBooleanField(term352, term352.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term352, term352.getClass(), "propagator", false);
        setBooleanField(term352, term352.getClass(), "failed", false);
        setField(term349, term349.getClass(), "parent", term352);
        setField(term388, term388.getClass(), "graph", null);
        setField(term388, term388.getClass(), "vertexColor", null);
        setIntField(term388, term388.getClass(), "numColoredVertices", 0);
        setField(term388, term388.getClass(), "usedColors", null);
        setField(term388, term388.getClass(), "colorMap", null);
        setField(term349, term349.getClass(), "coloring", term388);
        setIntField(term391, term391.getClass(), "vertex", 0);
        setField(term391, term391.getClass(), "values", null);
        setField(term391, term391.getClass(), "positions", null);
        setIntField(term391, term391.getClass(), "size", 0);
        setElement(term390, 0, term391);
        setIntField(term394, term394.getClass(), "vertex", 0);
        setField(term394, term394.getClass(), "values", null);
        setField(term394, term394.getClass(), "positions", null);
        setIntField(term394, term394.getClass(), "size", 0);
        setElement(term390, 1, term394);
        setElement(term390, 2, term394);
        setIntField(term397, term397.getClass(), "vertex", 0);
        setField(term397, term397.getClass(), "values", null);
        setField(term397, term397.getClass(), "positions", null);
        setIntField(term397, term397.getClass(), "size", 0);
        setElement(term390, 3, term397);
        setElement(term390, 4, term391);
        setElement(term390, 5, term394);
        setElement(term390, 6, term376);
        setField(term349, term349.getClass(), "domains", term390);
        setIntField(term400, term400.getClass(), "vertex", 0);
        setField(term400, term400.getClass(), "values", null);
        setField(term400, term400.getClass(), "positions", null);
        setIntField(term400, term400.getClass(), "size", 0);
        setField(term349, term349.getClass(), "minDomain", term400);
        setBooleanField(term349, term349.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term349, term349.getClass(), "propagator", false);
        setBooleanField(term349, term349.getClass(), "failed", true);
        setField(term346, term346.getClass(), "parent", term349);
        setField(term406, term406.getClass(), "graph", null);
        setField(term406, term406.getClass(), "vertexColor", null);
        setIntField(term406, term406.getClass(), "numColoredVertices", 0);
        setField(term406, term406.getClass(), "usedColors", null);
        setField(term406, term406.getClass(), "colorMap", null);
        setField(term346, term346.getClass(), "coloring", term406);
        setElement(term408, 0, term397);
        setElement(term408, 1, term394);
        setField(term346, term346.getClass(), "domains", term408);
        setField(term346, term346.getClass(), "minDomain", term391);
        setBooleanField(term346, term346.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term346, term346.getClass(), "propagator", false);
        setBooleanField(term346, term346.getClass(), "failed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "trace", argTypes, term346, args);
    }

};


