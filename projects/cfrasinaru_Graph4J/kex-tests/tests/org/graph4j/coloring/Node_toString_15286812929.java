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

public class Node_toString_15286812929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term813;

    public Node_toString_15286812929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term813 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term816 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term819 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term822 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term825 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term831 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term833 = (Object[]) newArray("org.graph4j.util.Domain", 7);
        Object term834 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term840 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term842 = (Object[]) newArray("org.graph4j.util.Domain", 9);
        Object term843 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term846 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term849 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term852 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term855 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term858 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term864 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term866 = (Object[]) newArray("org.graph4j.util.Domain", 7);
        Object term870 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term872 = (Object[]) newArray("org.graph4j.util.Domain", 6);
        Object term873 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term876 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setField(term813, term813.getClass(), "alg", null);
        setIntField(term813, term813.getClass(), "vertex", 1687361082);
        setIntField(term813, term813.getClass(), "color", 584893196);
        setField(term816, term816.getClass(), "alg", null);
        setIntField(term816, term816.getClass(), "vertex", 497269071);
        setIntField(term816, term816.getClass(), "color", -1899301124);
        setField(term819, term819.getClass(), "alg", null);
        setIntField(term819, term819.getClass(), "vertex", -1882480155);
        setIntField(term819, term819.getClass(), "color", -1410220680);
        setField(term822, term822.getClass(), "alg", null);
        setIntField(term822, term822.getClass(), "vertex", 389427431);
        setIntField(term822, term822.getClass(), "color", -1945706126);
        setField(term825, term825.getClass(), "alg", null);
        setIntField(term825, term825.getClass(), "vertex", 1152356969);
        setIntField(term825, term825.getClass(), "color", -1667990367);
        setField(term825, term825.getClass(), "parent", null);
        setField(term825, term825.getClass(), "coloring", null);
        setField(term825, term825.getClass(), "domains", null);
        setField(term825, term825.getClass(), "minDomain", null);
        setBooleanField(term825, term825.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term825, term825.getClass(), "propagator", true);
        setBooleanField(term825, term825.getClass(), "failed", true);
        setField(term822, term822.getClass(), "parent", term825);
        setField(term831, term831.getClass(), "graph", null);
        setField(term831, term831.getClass(), "vertexColor", null);
        setIntField(term831, term831.getClass(), "numColoredVertices", 0);
        setField(term831, term831.getClass(), "usedColors", null);
        setField(term831, term831.getClass(), "colorMap", null);
        setField(term822, term822.getClass(), "coloring", term831);
        setField(term822, term822.getClass(), "domains", term833);
        setIntField(term834, term834.getClass(), "vertex", 0);
        setField(term834, term834.getClass(), "values", null);
        setField(term834, term834.getClass(), "positions", null);
        setIntField(term834, term834.getClass(), "size", 0);
        setField(term822, term822.getClass(), "minDomain", term834);
        setBooleanField(term822, term822.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term822, term822.getClass(), "propagator", true);
        setBooleanField(term822, term822.getClass(), "failed", true);
        setField(term819, term819.getClass(), "parent", term822);
        setField(term840, term840.getClass(), "graph", null);
        setField(term840, term840.getClass(), "vertexColor", null);
        setIntField(term840, term840.getClass(), "numColoredVertices", 0);
        setField(term840, term840.getClass(), "usedColors", null);
        setField(term840, term840.getClass(), "colorMap", null);
        setField(term819, term819.getClass(), "coloring", term840);
        setIntField(term843, term843.getClass(), "vertex", 0);
        setField(term843, term843.getClass(), "values", null);
        setField(term843, term843.getClass(), "positions", null);
        setIntField(term843, term843.getClass(), "size", 0);
        setElement(term842, 0, term843);
        setElement(term842, 1, term843);
        setIntField(term846, term846.getClass(), "vertex", 0);
        setField(term846, term846.getClass(), "values", null);
        setField(term846, term846.getClass(), "positions", null);
        setIntField(term846, term846.getClass(), "size", 0);
        setElement(term842, 2, term846);
        setIntField(term849, term849.getClass(), "vertex", 0);
        setField(term849, term849.getClass(), "values", null);
        setField(term849, term849.getClass(), "positions", null);
        setIntField(term849, term849.getClass(), "size", 0);
        setElement(term842, 3, term849);
        setElement(term842, 4, term849);
        setIntField(term852, term852.getClass(), "vertex", 0);
        setField(term852, term852.getClass(), "values", null);
        setField(term852, term852.getClass(), "positions", null);
        setIntField(term852, term852.getClass(), "size", 0);
        setElement(term842, 5, term852);
        setElement(term842, 6, term846);
        setElement(term842, 7, term849);
        setIntField(term855, term855.getClass(), "vertex", 0);
        setField(term855, term855.getClass(), "values", null);
        setField(term855, term855.getClass(), "positions", null);
        setIntField(term855, term855.getClass(), "size", 0);
        setElement(term842, 8, term855);
        setField(term819, term819.getClass(), "domains", term842);
        setIntField(term858, term858.getClass(), "vertex", 0);
        setField(term858, term858.getClass(), "values", null);
        setField(term858, term858.getClass(), "positions", null);
        setIntField(term858, term858.getClass(), "size", 0);
        setField(term819, term819.getClass(), "minDomain", term858);
        setBooleanField(term819, term819.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term819, term819.getClass(), "propagator", false);
        setBooleanField(term819, term819.getClass(), "failed", false);
        setField(term816, term816.getClass(), "parent", term819);
        setField(term864, term864.getClass(), "graph", null);
        setField(term864, term864.getClass(), "vertexColor", null);
        setIntField(term864, term864.getClass(), "numColoredVertices", 0);
        setField(term864, term864.getClass(), "usedColors", null);
        setField(term864, term864.getClass(), "colorMap", null);
        setField(term816, term816.getClass(), "coloring", term864);
        setElement(term866, 0, term852);
        setElement(term866, 1, term849);
        setElement(term866, 2, term846);
        setElement(term866, 3, term846);
        setElement(term866, 4, term834);
        setElement(term866, 5, term852);
        setElement(term866, 6, term852);
        setField(term816, term816.getClass(), "domains", term866);
        setField(term816, term816.getClass(), "minDomain", term843);
        setBooleanField(term816, term816.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term816, term816.getClass(), "propagator", false);
        setBooleanField(term816, term816.getClass(), "failed", false);
        setField(term813, term813.getClass(), "parent", term816);
        setField(term870, term870.getClass(), "graph", null);
        setField(term870, term870.getClass(), "vertexColor", null);
        setIntField(term870, term870.getClass(), "numColoredVertices", 0);
        setField(term870, term870.getClass(), "usedColors", null);
        setField(term870, term870.getClass(), "colorMap", null);
        setField(term813, term813.getClass(), "coloring", term870);
        setIntField(term873, term873.getClass(), "vertex", 0);
        setField(term873, term873.getClass(), "values", null);
        setField(term873, term873.getClass(), "positions", null);
        setIntField(term873, term873.getClass(), "size", 0);
        setElement(term872, 0, term873);
        setElement(term872, 1, term873);
        setIntField(term876, term876.getClass(), "vertex", 0);
        setField(term876, term876.getClass(), "values", null);
        setField(term876, term876.getClass(), "positions", null);
        setIntField(term876, term876.getClass(), "size", 0);
        setElement(term872, 2, term876);
        setElement(term872, 3, term846);
        setElement(term872, 4, term858);
        setElement(term872, 5, term873);
        setField(term813, term813.getClass(), "domains", term872);
        setField(term813, term813.getClass(), "minDomain", term855);
        setBooleanField(term813, term813.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term813, term813.getClass(), "propagator", true);
        setBooleanField(term813, term813.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term813, args);
    }

};


