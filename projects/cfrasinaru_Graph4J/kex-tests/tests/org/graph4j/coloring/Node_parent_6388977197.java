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

public class Node_parent_6388977197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681;

    public Node_parent_6388977197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term684 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term687 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term690 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term693 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term699 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term701 = (Object[]) newArray("org.graph4j.util.Domain", 4);
        Object term702 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term708 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term710 = (Object[]) newArray("org.graph4j.util.Domain", 2);
        Object term711 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term714 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term720 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term722 = (Object[]) newArray("org.graph4j.util.Domain", 5);
        Object term723 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term726 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term729 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term732 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term738 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term740 = (Object[]) newArray("org.graph4j.util.Domain", 0);
        setField(term681, term681.getClass(), "alg", null);
        setIntField(term681, term681.getClass(), "vertex", 628918458);
        setIntField(term681, term681.getClass(), "color", -1274456137);
        setField(term684, term684.getClass(), "alg", null);
        setIntField(term684, term684.getClass(), "vertex", 1041916673);
        setIntField(term684, term684.getClass(), "color", -601863069);
        setField(term687, term687.getClass(), "alg", null);
        setIntField(term687, term687.getClass(), "vertex", 663292551);
        setIntField(term687, term687.getClass(), "color", -1885090354);
        setField(term690, term690.getClass(), "alg", null);
        setIntField(term690, term690.getClass(), "vertex", -2066804303);
        setIntField(term690, term690.getClass(), "color", -1731761810);
        setField(term693, term693.getClass(), "alg", null);
        setIntField(term693, term693.getClass(), "vertex", 197109649);
        setIntField(term693, term693.getClass(), "color", -1239406390);
        setField(term693, term693.getClass(), "parent", null);
        setField(term693, term693.getClass(), "coloring", null);
        setField(term693, term693.getClass(), "domains", null);
        setField(term693, term693.getClass(), "minDomain", null);
        setBooleanField(term693, term693.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term693, term693.getClass(), "propagator", false);
        setBooleanField(term693, term693.getClass(), "failed", false);
        setField(term690, term690.getClass(), "parent", term693);
        setField(term699, term699.getClass(), "graph", null);
        setField(term699, term699.getClass(), "vertexColor", null);
        setIntField(term699, term699.getClass(), "numColoredVertices", 0);
        setField(term699, term699.getClass(), "usedColors", null);
        setField(term699, term699.getClass(), "colorMap", null);
        setField(term690, term690.getClass(), "coloring", term699);
        setField(term690, term690.getClass(), "domains", term701);
        setIntField(term702, term702.getClass(), "vertex", 0);
        setField(term702, term702.getClass(), "values", null);
        setField(term702, term702.getClass(), "positions", null);
        setIntField(term702, term702.getClass(), "size", 0);
        setField(term690, term690.getClass(), "minDomain", term702);
        setBooleanField(term690, term690.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term690, term690.getClass(), "propagator", false);
        setBooleanField(term690, term690.getClass(), "failed", false);
        setField(term687, term687.getClass(), "parent", term690);
        setField(term708, term708.getClass(), "graph", null);
        setField(term708, term708.getClass(), "vertexColor", null);
        setIntField(term708, term708.getClass(), "numColoredVertices", 0);
        setField(term708, term708.getClass(), "usedColors", null);
        setField(term708, term708.getClass(), "colorMap", null);
        setField(term687, term687.getClass(), "coloring", term708);
        setIntField(term711, term711.getClass(), "vertex", 0);
        setField(term711, term711.getClass(), "values", null);
        setField(term711, term711.getClass(), "positions", null);
        setIntField(term711, term711.getClass(), "size", 0);
        setElement(term710, 0, term711);
        setIntField(term714, term714.getClass(), "vertex", 0);
        setField(term714, term714.getClass(), "values", null);
        setField(term714, term714.getClass(), "positions", null);
        setIntField(term714, term714.getClass(), "size", 0);
        setElement(term710, 1, term714);
        setField(term687, term687.getClass(), "domains", term710);
        setField(term687, term687.getClass(), "minDomain", term702);
        setBooleanField(term687, term687.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term687, term687.getClass(), "propagator", false);
        setBooleanField(term687, term687.getClass(), "failed", true);
        setField(term684, term684.getClass(), "parent", term687);
        setField(term720, term720.getClass(), "graph", null);
        setField(term720, term720.getClass(), "vertexColor", null);
        setIntField(term720, term720.getClass(), "numColoredVertices", 0);
        setField(term720, term720.getClass(), "usedColors", null);
        setField(term720, term720.getClass(), "colorMap", null);
        setField(term684, term684.getClass(), "coloring", term720);
        setIntField(term723, term723.getClass(), "vertex", 0);
        setField(term723, term723.getClass(), "values", null);
        setField(term723, term723.getClass(), "positions", null);
        setIntField(term723, term723.getClass(), "size", 0);
        setElement(term722, 0, term723);
        setIntField(term726, term726.getClass(), "vertex", 0);
        setField(term726, term726.getClass(), "values", null);
        setField(term726, term726.getClass(), "positions", null);
        setIntField(term726, term726.getClass(), "size", 0);
        setElement(term722, 1, term726);
        setIntField(term729, term729.getClass(), "vertex", 0);
        setField(term729, term729.getClass(), "values", null);
        setField(term729, term729.getClass(), "positions", null);
        setIntField(term729, term729.getClass(), "size", 0);
        setElement(term722, 2, term729);
        setIntField(term732, term732.getClass(), "vertex", 0);
        setField(term732, term732.getClass(), "values", null);
        setField(term732, term732.getClass(), "positions", null);
        setIntField(term732, term732.getClass(), "size", 0);
        setElement(term722, 3, term732);
        setElement(term722, 4, term732);
        setField(term684, term684.getClass(), "domains", term722);
        setField(term684, term684.getClass(), "minDomain", term711);
        setBooleanField(term684, term684.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term684, term684.getClass(), "propagator", false);
        setBooleanField(term684, term684.getClass(), "failed", true);
        setField(term681, term681.getClass(), "parent", term684);
        setField(term738, term738.getClass(), "graph", null);
        setField(term738, term738.getClass(), "vertexColor", null);
        setIntField(term738, term738.getClass(), "numColoredVertices", 0);
        setField(term738, term738.getClass(), "usedColors", null);
        setField(term738, term738.getClass(), "colorMap", null);
        setField(term681, term681.getClass(), "coloring", term738);
        setField(term681, term681.getClass(), "domains", term740);
        setField(term681, term681.getClass(), "minDomain", term714);
        setBooleanField(term681, term681.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term681, term681.getClass(), "propagator", false);
        setBooleanField(term681, term681.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parent", argTypes, term681, args);
    }

};


