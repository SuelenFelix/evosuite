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
import java.lang.Integer;

public class Node_domain_13105583085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term544;
     Object term607;

    public Node_domain_13105583085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term544 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term547 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term550 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term553 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term556 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term562 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term564 = (Object[]) newArray("org.graph4j.util.Domain", 8);
        Object term565 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term571 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term573 = (Object[]) newArray("org.graph4j.util.Domain", 6);
        Object term574 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term577 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term580 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term583 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term586 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term592 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term594 = (Object[]) newArray("org.graph4j.util.Domain", 2);
        Object term598 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term600 = (Object[]) newArray("org.graph4j.util.Domain", 8);
        Object term601 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setField(term544, term544.getClass(), "alg", null);
        setIntField(term544, term544.getClass(), "vertex", -430151637);
        setIntField(term544, term544.getClass(), "color", -1697741339);
        setField(term547, term547.getClass(), "alg", null);
        setIntField(term547, term547.getClass(), "vertex", 98922530);
        setIntField(term547, term547.getClass(), "color", -1388471422);
        setField(term550, term550.getClass(), "alg", null);
        setIntField(term550, term550.getClass(), "vertex", -1498296052);
        setIntField(term550, term550.getClass(), "color", 2098647989);
        setField(term553, term553.getClass(), "alg", null);
        setIntField(term553, term553.getClass(), "vertex", 1598895173);
        setIntField(term553, term553.getClass(), "color", 1830648570);
        setField(term556, term556.getClass(), "alg", null);
        setIntField(term556, term556.getClass(), "vertex", -227365013);
        setIntField(term556, term556.getClass(), "color", 11724947);
        setField(term556, term556.getClass(), "parent", null);
        setField(term556, term556.getClass(), "coloring", null);
        setField(term556, term556.getClass(), "domains", null);
        setField(term556, term556.getClass(), "minDomain", null);
        setBooleanField(term556, term556.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term556, term556.getClass(), "propagator", true);
        setBooleanField(term556, term556.getClass(), "failed", true);
        setField(term553, term553.getClass(), "parent", term556);
        setField(term562, term562.getClass(), "graph", null);
        setField(term562, term562.getClass(), "vertexColor", null);
        setIntField(term562, term562.getClass(), "numColoredVertices", 0);
        setField(term562, term562.getClass(), "usedColors", null);
        setField(term562, term562.getClass(), "colorMap", null);
        setField(term553, term553.getClass(), "coloring", term562);
        setField(term553, term553.getClass(), "domains", term564);
        setIntField(term565, term565.getClass(), "vertex", 0);
        setField(term565, term565.getClass(), "values", null);
        setField(term565, term565.getClass(), "positions", null);
        setIntField(term565, term565.getClass(), "size", 0);
        setField(term553, term553.getClass(), "minDomain", term565);
        setBooleanField(term553, term553.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term553, term553.getClass(), "propagator", true);
        setBooleanField(term553, term553.getClass(), "failed", true);
        setField(term550, term550.getClass(), "parent", term553);
        setField(term571, term571.getClass(), "graph", null);
        setField(term571, term571.getClass(), "vertexColor", null);
        setIntField(term571, term571.getClass(), "numColoredVertices", 0);
        setField(term571, term571.getClass(), "usedColors", null);
        setField(term571, term571.getClass(), "colorMap", null);
        setField(term550, term550.getClass(), "coloring", term571);
        setIntField(term574, term574.getClass(), "vertex", 0);
        setField(term574, term574.getClass(), "values", null);
        setField(term574, term574.getClass(), "positions", null);
        setIntField(term574, term574.getClass(), "size", 0);
        setElement(term573, 0, term574);
        setIntField(term577, term577.getClass(), "vertex", 0);
        setField(term577, term577.getClass(), "values", null);
        setField(term577, term577.getClass(), "positions", null);
        setIntField(term577, term577.getClass(), "size", 0);
        setElement(term573, 1, term577);
        setElement(term573, 2, term577);
        setIntField(term580, term580.getClass(), "vertex", 0);
        setField(term580, term580.getClass(), "values", null);
        setField(term580, term580.getClass(), "positions", null);
        setIntField(term580, term580.getClass(), "size", 0);
        setElement(term573, 3, term580);
        setIntField(term583, term583.getClass(), "vertex", 0);
        setField(term583, term583.getClass(), "values", null);
        setField(term583, term583.getClass(), "positions", null);
        setIntField(term583, term583.getClass(), "size", 0);
        setElement(term573, 4, term583);
        setElement(term573, 5, term583);
        setField(term550, term550.getClass(), "domains", term573);
        setIntField(term586, term586.getClass(), "vertex", 0);
        setField(term586, term586.getClass(), "values", null);
        setField(term586, term586.getClass(), "positions", null);
        setIntField(term586, term586.getClass(), "size", 0);
        setField(term550, term550.getClass(), "minDomain", term586);
        setBooleanField(term550, term550.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term550, term550.getClass(), "propagator", false);
        setBooleanField(term550, term550.getClass(), "failed", true);
        setField(term547, term547.getClass(), "parent", term550);
        setField(term592, term592.getClass(), "graph", null);
        setField(term592, term592.getClass(), "vertexColor", null);
        setIntField(term592, term592.getClass(), "numColoredVertices", 0);
        setField(term592, term592.getClass(), "usedColors", null);
        setField(term592, term592.getClass(), "colorMap", null);
        setField(term547, term547.getClass(), "coloring", term592);
        setElement(term594, 0, term580);
        setElement(term594, 1, term583);
        setField(term547, term547.getClass(), "domains", term594);
        setField(term547, term547.getClass(), "minDomain", term565);
        setBooleanField(term547, term547.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term547, term547.getClass(), "propagator", true);
        setBooleanField(term547, term547.getClass(), "failed", false);
        setField(term544, term544.getClass(), "parent", term547);
        setField(term598, term598.getClass(), "graph", null);
        setField(term598, term598.getClass(), "vertexColor", null);
        setIntField(term598, term598.getClass(), "numColoredVertices", 0);
        setField(term598, term598.getClass(), "usedColors", null);
        setField(term598, term598.getClass(), "colorMap", null);
        setField(term544, term544.getClass(), "coloring", term598);
        setIntField(term601, term601.getClass(), "vertex", 0);
        setField(term601, term601.getClass(), "values", null);
        setField(term601, term601.getClass(), "positions", null);
        setIntField(term601, term601.getClass(), "size", 0);
        setElement(term600, 0, term601);
        setElement(term600, 1, term586);
        setElement(term600, 2, term583);
        setElement(term600, 3, term580);
        setElement(term600, 4, term580);
        setElement(term600, 5, term574);
        setElement(term600, 6, term586);
        setElement(term600, 7, term586);
        setField(term544, term544.getClass(), "domains", term600);
        setField(term544, term544.getClass(), "minDomain", term577);
        setBooleanField(term544, term544.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term544, term544.getClass(), "propagator", true);
        setBooleanField(term544, term544.getClass(), "failed", false);
        term607 = new Integer(1953277050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term607;
        callMethod(klass, "domain", argTypes, term544, args);
    }

};


