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

public class Node_getState_89937688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term744;

    public Node_getState_89937688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term744 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term747 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term750 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term753 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term756 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term762 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term764 = (Object[]) newArray("org.graph4j.util.Domain", 7);
        Object term765 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term771 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term773 = (Object[]) newArray("org.graph4j.util.Domain", 2);
        Object term774 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term777 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term780 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term786 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term788 = (Object[]) newArray("org.graph4j.util.Domain", 9);
        Object term789 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term792 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term795 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term798 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term804 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term806 = (Object[]) newArray("org.graph4j.util.Domain", 7);
        Object term807 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setField(term744, term744.getClass(), "alg", null);
        setIntField(term744, term744.getClass(), "vertex", 1557431527);
        setIntField(term744, term744.getClass(), "color", -1504890659);
        setField(term747, term747.getClass(), "alg", null);
        setIntField(term747, term747.getClass(), "vertex", 1358829571);
        setIntField(term747, term747.getClass(), "color", 991356662);
        setField(term750, term750.getClass(), "alg", null);
        setIntField(term750, term750.getClass(), "vertex", -506958186);
        setIntField(term750, term750.getClass(), "color", -507387516);
        setField(term753, term753.getClass(), "alg", null);
        setIntField(term753, term753.getClass(), "vertex", -1970452551);
        setIntField(term753, term753.getClass(), "color", -1896376975);
        setField(term756, term756.getClass(), "alg", null);
        setIntField(term756, term756.getClass(), "vertex", 729658803);
        setIntField(term756, term756.getClass(), "color", 114754804);
        setField(term756, term756.getClass(), "parent", null);
        setField(term756, term756.getClass(), "coloring", null);
        setField(term756, term756.getClass(), "domains", null);
        setField(term756, term756.getClass(), "minDomain", null);
        setBooleanField(term756, term756.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term756, term756.getClass(), "propagator", false);
        setBooleanField(term756, term756.getClass(), "failed", true);
        setField(term753, term753.getClass(), "parent", term756);
        setField(term762, term762.getClass(), "graph", null);
        setField(term762, term762.getClass(), "vertexColor", null);
        setIntField(term762, term762.getClass(), "numColoredVertices", 0);
        setField(term762, term762.getClass(), "usedColors", null);
        setField(term762, term762.getClass(), "colorMap", null);
        setField(term753, term753.getClass(), "coloring", term762);
        setField(term753, term753.getClass(), "domains", term764);
        setIntField(term765, term765.getClass(), "vertex", 0);
        setField(term765, term765.getClass(), "values", null);
        setField(term765, term765.getClass(), "positions", null);
        setIntField(term765, term765.getClass(), "size", 0);
        setField(term753, term753.getClass(), "minDomain", term765);
        setBooleanField(term753, term753.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term753, term753.getClass(), "propagator", false);
        setBooleanField(term753, term753.getClass(), "failed", true);
        setField(term750, term750.getClass(), "parent", term753);
        setField(term771, term771.getClass(), "graph", null);
        setField(term771, term771.getClass(), "vertexColor", null);
        setIntField(term771, term771.getClass(), "numColoredVertices", 0);
        setField(term771, term771.getClass(), "usedColors", null);
        setField(term771, term771.getClass(), "colorMap", null);
        setField(term750, term750.getClass(), "coloring", term771);
        setIntField(term774, term774.getClass(), "vertex", 0);
        setField(term774, term774.getClass(), "values", null);
        setField(term774, term774.getClass(), "positions", null);
        setIntField(term774, term774.getClass(), "size", 0);
        setElement(term773, 0, term774);
        setIntField(term777, term777.getClass(), "vertex", 0);
        setField(term777, term777.getClass(), "values", null);
        setField(term777, term777.getClass(), "positions", null);
        setIntField(term777, term777.getClass(), "size", 0);
        setElement(term773, 1, term777);
        setField(term750, term750.getClass(), "domains", term773);
        setIntField(term780, term780.getClass(), "vertex", 0);
        setField(term780, term780.getClass(), "values", null);
        setField(term780, term780.getClass(), "positions", null);
        setIntField(term780, term780.getClass(), "size", 0);
        setField(term750, term750.getClass(), "minDomain", term780);
        setBooleanField(term750, term750.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term750, term750.getClass(), "propagator", true);
        setBooleanField(term750, term750.getClass(), "failed", false);
        setField(term747, term747.getClass(), "parent", term750);
        setField(term786, term786.getClass(), "graph", null);
        setField(term786, term786.getClass(), "vertexColor", null);
        setIntField(term786, term786.getClass(), "numColoredVertices", 0);
        setField(term786, term786.getClass(), "usedColors", null);
        setField(term786, term786.getClass(), "colorMap", null);
        setField(term747, term747.getClass(), "coloring", term786);
        setIntField(term789, term789.getClass(), "vertex", 0);
        setField(term789, term789.getClass(), "values", null);
        setField(term789, term789.getClass(), "positions", null);
        setIntField(term789, term789.getClass(), "size", 0);
        setElement(term788, 0, term789);
        setIntField(term792, term792.getClass(), "vertex", 0);
        setField(term792, term792.getClass(), "values", null);
        setField(term792, term792.getClass(), "positions", null);
        setIntField(term792, term792.getClass(), "size", 0);
        setElement(term788, 1, term792);
        setElement(term788, 2, term792);
        setIntField(term795, term795.getClass(), "vertex", 0);
        setField(term795, term795.getClass(), "values", null);
        setField(term795, term795.getClass(), "positions", null);
        setIntField(term795, term795.getClass(), "size", 0);
        setElement(term788, 3, term795);
        setElement(term788, 4, term765);
        setElement(term788, 5, term765);
        setIntField(term798, term798.getClass(), "vertex", 0);
        setField(term798, term798.getClass(), "values", null);
        setField(term798, term798.getClass(), "positions", null);
        setIntField(term798, term798.getClass(), "size", 0);
        setElement(term788, 6, term798);
        setElement(term788, 7, term795);
        setElement(term788, 8, term765);
        setField(term747, term747.getClass(), "domains", term788);
        setField(term747, term747.getClass(), "minDomain", term780);
        setBooleanField(term747, term747.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term747, term747.getClass(), "propagator", false);
        setBooleanField(term747, term747.getClass(), "failed", false);
        setField(term744, term744.getClass(), "parent", term747);
        setField(term804, term804.getClass(), "graph", null);
        setField(term804, term804.getClass(), "vertexColor", null);
        setIntField(term804, term804.getClass(), "numColoredVertices", 0);
        setField(term804, term804.getClass(), "usedColors", null);
        setField(term804, term804.getClass(), "colorMap", null);
        setField(term744, term744.getClass(), "coloring", term804);
        setIntField(term807, term807.getClass(), "vertex", 0);
        setField(term807, term807.getClass(), "values", null);
        setField(term807, term807.getClass(), "positions", null);
        setIntField(term807, term807.getClass(), "size", 0);
        setElement(term806, 0, term807);
        setElement(term806, 1, term798);
        setElement(term806, 2, term765);
        setElement(term806, 3, term795);
        setElement(term806, 4, term795);
        setElement(term806, 5, term789);
        setElement(term806, 6, term798);
        setField(term744, term744.getClass(), "domains", term806);
        setField(term744, term744.getClass(), "minDomain", term798);
        setBooleanField(term744, term744.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term744, term744.getClass(), "propagator", false);
        setBooleanField(term744, term744.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term744, args);
    }

};


