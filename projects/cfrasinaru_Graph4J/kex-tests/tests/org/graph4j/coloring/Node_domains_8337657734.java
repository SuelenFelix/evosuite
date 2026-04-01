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

public class Node_domains_8337657734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475;

    public Node_domains_8337657734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term478 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term481 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term484 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term487 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term493 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term495 = (Object[]) newArray("org.graph4j.util.Domain", 5);
        Object term496 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term502 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term504 = (Object[]) newArray("org.graph4j.util.Domain", 1);
        Object term505 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term508 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term514 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term516 = (Object[]) newArray("org.graph4j.util.Domain", 0);
        Object term517 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term523 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term525 = (Object[]) newArray("org.graph4j.util.Domain", 9);
        Object term526 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term529 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term532 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term535 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term538 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setField(term475, term475.getClass(), "alg", null);
        setIntField(term475, term475.getClass(), "vertex", -2063457669);
        setIntField(term475, term475.getClass(), "color", -1222006000);
        setField(term478, term478.getClass(), "alg", null);
        setIntField(term478, term478.getClass(), "vertex", 2095798786);
        setIntField(term478, term478.getClass(), "color", -1565502840);
        setField(term481, term481.getClass(), "alg", null);
        setIntField(term481, term481.getClass(), "vertex", 344323424);
        setIntField(term481, term481.getClass(), "color", 9726679);
        setField(term484, term484.getClass(), "alg", null);
        setIntField(term484, term484.getClass(), "vertex", -25637976);
        setIntField(term484, term484.getClass(), "color", 1555897383);
        setField(term487, term487.getClass(), "alg", null);
        setIntField(term487, term487.getClass(), "vertex", 202001407);
        setIntField(term487, term487.getClass(), "color", 158873461);
        setField(term487, term487.getClass(), "parent", null);
        setField(term487, term487.getClass(), "coloring", null);
        setField(term487, term487.getClass(), "domains", null);
        setField(term487, term487.getClass(), "minDomain", null);
        setBooleanField(term487, term487.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term487, term487.getClass(), "propagator", false);
        setBooleanField(term487, term487.getClass(), "failed", false);
        setField(term484, term484.getClass(), "parent", term487);
        setField(term493, term493.getClass(), "graph", null);
        setField(term493, term493.getClass(), "vertexColor", null);
        setIntField(term493, term493.getClass(), "numColoredVertices", 0);
        setField(term493, term493.getClass(), "usedColors", null);
        setField(term493, term493.getClass(), "colorMap", null);
        setField(term484, term484.getClass(), "coloring", term493);
        setField(term484, term484.getClass(), "domains", term495);
        setIntField(term496, term496.getClass(), "vertex", 0);
        setField(term496, term496.getClass(), "values", null);
        setField(term496, term496.getClass(), "positions", null);
        setIntField(term496, term496.getClass(), "size", 0);
        setField(term484, term484.getClass(), "minDomain", term496);
        setBooleanField(term484, term484.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term484, term484.getClass(), "propagator", false);
        setBooleanField(term484, term484.getClass(), "failed", false);
        setField(term481, term481.getClass(), "parent", term484);
        setField(term502, term502.getClass(), "graph", null);
        setField(term502, term502.getClass(), "vertexColor", null);
        setIntField(term502, term502.getClass(), "numColoredVertices", 0);
        setField(term502, term502.getClass(), "usedColors", null);
        setField(term502, term502.getClass(), "colorMap", null);
        setField(term481, term481.getClass(), "coloring", term502);
        setIntField(term505, term505.getClass(), "vertex", 0);
        setField(term505, term505.getClass(), "values", null);
        setField(term505, term505.getClass(), "positions", null);
        setIntField(term505, term505.getClass(), "size", 0);
        setElement(term504, 0, term505);
        setField(term481, term481.getClass(), "domains", term504);
        setIntField(term508, term508.getClass(), "vertex", 0);
        setField(term508, term508.getClass(), "values", null);
        setField(term508, term508.getClass(), "positions", null);
        setIntField(term508, term508.getClass(), "size", 0);
        setField(term481, term481.getClass(), "minDomain", term508);
        setBooleanField(term481, term481.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term481, term481.getClass(), "propagator", false);
        setBooleanField(term481, term481.getClass(), "failed", false);
        setField(term478, term478.getClass(), "parent", term481);
        setField(term514, term514.getClass(), "graph", null);
        setField(term514, term514.getClass(), "vertexColor", null);
        setIntField(term514, term514.getClass(), "numColoredVertices", 0);
        setField(term514, term514.getClass(), "usedColors", null);
        setField(term514, term514.getClass(), "colorMap", null);
        setField(term478, term478.getClass(), "coloring", term514);
        setField(term478, term478.getClass(), "domains", term516);
        setIntField(term517, term517.getClass(), "vertex", 0);
        setField(term517, term517.getClass(), "values", null);
        setField(term517, term517.getClass(), "positions", null);
        setIntField(term517, term517.getClass(), "size", 0);
        setField(term478, term478.getClass(), "minDomain", term517);
        setBooleanField(term478, term478.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term478, term478.getClass(), "propagator", false);
        setBooleanField(term478, term478.getClass(), "failed", true);
        setField(term475, term475.getClass(), "parent", term478);
        setField(term523, term523.getClass(), "graph", null);
        setField(term523, term523.getClass(), "vertexColor", null);
        setIntField(term523, term523.getClass(), "numColoredVertices", 0);
        setField(term523, term523.getClass(), "usedColors", null);
        setField(term523, term523.getClass(), "colorMap", null);
        setField(term475, term475.getClass(), "coloring", term523);
        setIntField(term526, term526.getClass(), "vertex", 0);
        setField(term526, term526.getClass(), "values", null);
        setField(term526, term526.getClass(), "positions", null);
        setIntField(term526, term526.getClass(), "size", 0);
        setElement(term525, 0, term526);
        setElement(term525, 1, term526);
        setIntField(term529, term529.getClass(), "vertex", 0);
        setField(term529, term529.getClass(), "values", null);
        setField(term529, term529.getClass(), "positions", null);
        setIntField(term529, term529.getClass(), "size", 0);
        setElement(term525, 2, term529);
        setIntField(term532, term532.getClass(), "vertex", 0);
        setField(term532, term532.getClass(), "values", null);
        setField(term532, term532.getClass(), "positions", null);
        setIntField(term532, term532.getClass(), "size", 0);
        setElement(term525, 3, term532);
        setElement(term525, 4, term532);
        setIntField(term535, term535.getClass(), "vertex", 0);
        setField(term535, term535.getClass(), "values", null);
        setField(term535, term535.getClass(), "positions", null);
        setIntField(term535, term535.getClass(), "size", 0);
        setElement(term525, 5, term535);
        setElement(term525, 6, term529);
        setElement(term525, 7, term532);
        setElement(term525, 8, term508);
        setField(term475, term475.getClass(), "domains", term525);
        setIntField(term538, term538.getClass(), "vertex", 0);
        setField(term538, term538.getClass(), "values", null);
        setField(term538, term538.getClass(), "positions", null);
        setIntField(term538, term538.getClass(), "size", 0);
        setField(term475, term475.getClass(), "minDomain", term538);
        setBooleanField(term475, term475.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term475, term475.getClass(), "propagator", true);
        setBooleanField(term475, term475.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "domains", argTypes, term475, args);
    }

};


