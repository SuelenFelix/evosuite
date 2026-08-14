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

public class Node_coloring_3303730936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609;

    public Node_coloring_3303730936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term609 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term612 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term615 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term618 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term621 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term627 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term629 = (Object[]) newArray("org.graph4j.util.Domain", 6);
        Object term630 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term636 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term638 = (Object[]) newArray("org.graph4j.util.Domain", 8);
        Object term639 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term642 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term645 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term648 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term651 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term654 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term660 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term662 = (Object[]) newArray("org.graph4j.util.Domain", 9);
        Object term663 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term666 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term672 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term674 = (Object[]) newArray("org.graph4j.util.Domain", 7);
        Object term675 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setField(term609, term609.getClass(), "alg", null);
        setIntField(term609, term609.getClass(), "vertex", 1283079251);
        setIntField(term609, term609.getClass(), "color", -523949691);
        setField(term612, term612.getClass(), "alg", null);
        setIntField(term612, term612.getClass(), "vertex", 1398204340);
        setIntField(term612, term612.getClass(), "color", 229204365);
        setField(term615, term615.getClass(), "alg", null);
        setIntField(term615, term615.getClass(), "vertex", -461771056);
        setIntField(term615, term615.getClass(), "color", -243422082);
        setField(term618, term618.getClass(), "alg", null);
        setIntField(term618, term618.getClass(), "vertex", 1384592638);
        setIntField(term618, term618.getClass(), "color", -1002370457);
        setField(term621, term621.getClass(), "alg", null);
        setIntField(term621, term621.getClass(), "vertex", -2014576105);
        setIntField(term621, term621.getClass(), "color", 1296895584);
        setField(term621, term621.getClass(), "parent", null);
        setField(term621, term621.getClass(), "coloring", null);
        setField(term621, term621.getClass(), "domains", null);
        setField(term621, term621.getClass(), "minDomain", null);
        setBooleanField(term621, term621.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term621, term621.getClass(), "propagator", true);
        setBooleanField(term621, term621.getClass(), "failed", true);
        setField(term618, term618.getClass(), "parent", term621);
        setField(term627, term627.getClass(), "graph", null);
        setField(term627, term627.getClass(), "vertexColor", null);
        setIntField(term627, term627.getClass(), "numColoredVertices", 0);
        setField(term627, term627.getClass(), "usedColors", null);
        setField(term627, term627.getClass(), "colorMap", null);
        setField(term618, term618.getClass(), "coloring", term627);
        setField(term618, term618.getClass(), "domains", term629);
        setIntField(term630, term630.getClass(), "vertex", 0);
        setField(term630, term630.getClass(), "values", null);
        setField(term630, term630.getClass(), "positions", null);
        setIntField(term630, term630.getClass(), "size", 0);
        setField(term618, term618.getClass(), "minDomain", term630);
        setBooleanField(term618, term618.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term618, term618.getClass(), "propagator", false);
        setBooleanField(term618, term618.getClass(), "failed", true);
        setField(term615, term615.getClass(), "parent", term618);
        setField(term636, term636.getClass(), "graph", null);
        setField(term636, term636.getClass(), "vertexColor", null);
        setIntField(term636, term636.getClass(), "numColoredVertices", 0);
        setField(term636, term636.getClass(), "usedColors", null);
        setField(term636, term636.getClass(), "colorMap", null);
        setField(term615, term615.getClass(), "coloring", term636);
        setIntField(term639, term639.getClass(), "vertex", 0);
        setField(term639, term639.getClass(), "values", null);
        setField(term639, term639.getClass(), "positions", null);
        setIntField(term639, term639.getClass(), "size", 0);
        setElement(term638, 0, term639);
        setIntField(term642, term642.getClass(), "vertex", 0);
        setField(term642, term642.getClass(), "values", null);
        setField(term642, term642.getClass(), "positions", null);
        setIntField(term642, term642.getClass(), "size", 0);
        setElement(term638, 1, term642);
        setIntField(term645, term645.getClass(), "vertex", 0);
        setField(term645, term645.getClass(), "values", null);
        setField(term645, term645.getClass(), "positions", null);
        setIntField(term645, term645.getClass(), "size", 0);
        setElement(term638, 2, term645);
        setIntField(term648, term648.getClass(), "vertex", 0);
        setField(term648, term648.getClass(), "values", null);
        setField(term648, term648.getClass(), "positions", null);
        setIntField(term648, term648.getClass(), "size", 0);
        setElement(term638, 3, term648);
        setIntField(term651, term651.getClass(), "vertex", 0);
        setField(term651, term651.getClass(), "values", null);
        setField(term651, term651.getClass(), "positions", null);
        setIntField(term651, term651.getClass(), "size", 0);
        setElement(term638, 4, term651);
        setElement(term638, 5, term651);
        setIntField(term654, term654.getClass(), "vertex", 0);
        setField(term654, term654.getClass(), "values", null);
        setField(term654, term654.getClass(), "positions", null);
        setIntField(term654, term654.getClass(), "size", 0);
        setElement(term638, 6, term654);
        setElement(term638, 7, term630);
        setField(term615, term615.getClass(), "domains", term638);
        setField(term615, term615.getClass(), "minDomain", term630);
        setBooleanField(term615, term615.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term615, term615.getClass(), "propagator", true);
        setBooleanField(term615, term615.getClass(), "failed", false);
        setField(term612, term612.getClass(), "parent", term615);
        setField(term660, term660.getClass(), "graph", null);
        setField(term660, term660.getClass(), "vertexColor", null);
        setIntField(term660, term660.getClass(), "numColoredVertices", 0);
        setField(term660, term660.getClass(), "usedColors", null);
        setField(term660, term660.getClass(), "colorMap", null);
        setField(term612, term612.getClass(), "coloring", term660);
        setIntField(term663, term663.getClass(), "vertex", 0);
        setField(term663, term663.getClass(), "values", null);
        setField(term663, term663.getClass(), "positions", null);
        setIntField(term663, term663.getClass(), "size", 0);
        setElement(term662, 0, term663);
        setElement(term662, 1, term654);
        setElement(term662, 2, term630);
        setElement(term662, 3, term645);
        setIntField(term666, term666.getClass(), "vertex", 0);
        setField(term666, term666.getClass(), "values", null);
        setField(term666, term666.getClass(), "positions", null);
        setIntField(term666, term666.getClass(), "size", 0);
        setElement(term662, 4, term666);
        setElement(term662, 5, term663);
        setElement(term662, 6, term630);
        setElement(term662, 7, term654);
        setElement(term662, 8, term654);
        setField(term612, term612.getClass(), "domains", term662);
        setField(term612, term612.getClass(), "minDomain", term648);
        setBooleanField(term612, term612.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term612, term612.getClass(), "propagator", false);
        setBooleanField(term612, term612.getClass(), "failed", false);
        setField(term609, term609.getClass(), "parent", term612);
        setField(term672, term672.getClass(), "graph", null);
        setField(term672, term672.getClass(), "vertexColor", null);
        setIntField(term672, term672.getClass(), "numColoredVertices", 0);
        setField(term672, term672.getClass(), "usedColors", null);
        setField(term672, term672.getClass(), "colorMap", null);
        setField(term609, term609.getClass(), "coloring", term672);
        setElement(term674, 0, term663);
        setElement(term674, 1, term663);
        setElement(term674, 2, term651);
        setIntField(term675, term675.getClass(), "vertex", 0);
        setField(term675, term675.getClass(), "values", null);
        setField(term675, term675.getClass(), "positions", null);
        setIntField(term675, term675.getClass(), "size", 0);
        setElement(term674, 3, term675);
        setElement(term674, 4, term675);
        setElement(term674, 5, term639);
        setElement(term674, 6, term654);
        setField(term609, term609.getClass(), "domains", term674);
        setField(term609, term609.getClass(), "minDomain", term666);
        setBooleanField(term609, term609.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term609, term609.getClass(), "propagator", true);
        setBooleanField(term609, term609.getClass(), "failed", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "coloring", argTypes, term609, args);
    }

};


