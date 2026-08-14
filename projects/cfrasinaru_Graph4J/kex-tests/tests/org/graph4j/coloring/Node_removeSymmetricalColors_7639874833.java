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

public class Node_removeSymmetricalColors_7639874833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412;

    public Node_removeSymmetricalColors_7639874833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term415 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term418 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term421 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term424 = newInstance(Class.forName("org.graph4j.coloring.Node"));
        Object term430 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term432 = (Object[]) newArray("org.graph4j.util.Domain", 6);
        Object term433 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term439 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term441 = (Object[]) newArray("org.graph4j.util.Domain", 2);
        Object term442 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term445 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term451 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term453 = (Object[]) newArray("org.graph4j.util.Domain", 5);
        Object term454 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term457 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term460 = newInstance(Class.forName("org.graph4j.util.Domain"));
        Object term466 = newInstance(Class.forName("org.graph4j.coloring.Coloring"));
        Object[] term468 = (Object[]) newArray("org.graph4j.util.Domain", 3);
        Object term469 = newInstance(Class.forName("org.graph4j.util.Domain"));
        setField(term412, term412.getClass(), "alg", null);
        setIntField(term412, term412.getClass(), "vertex", -341152642);
        setIntField(term412, term412.getClass(), "color", -2015854073);
        setField(term415, term415.getClass(), "alg", null);
        setIntField(term415, term415.getClass(), "vertex", 538259104);
        setIntField(term415, term415.getClass(), "color", 96566506);
        setField(term418, term418.getClass(), "alg", null);
        setIntField(term418, term418.getClass(), "vertex", -343325701);
        setIntField(term418, term418.getClass(), "color", 107945604);
        setField(term421, term421.getClass(), "alg", null);
        setIntField(term421, term421.getClass(), "vertex", -1963464809);
        setIntField(term421, term421.getClass(), "color", 71190297);
        setField(term424, term424.getClass(), "alg", null);
        setIntField(term424, term424.getClass(), "vertex", 1202361360);
        setIntField(term424, term424.getClass(), "color", -2015048153);
        setField(term424, term424.getClass(), "parent", null);
        setField(term424, term424.getClass(), "coloring", null);
        setField(term424, term424.getClass(), "domains", null);
        setField(term424, term424.getClass(), "minDomain", null);
        setBooleanField(term424, term424.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term424, term424.getClass(), "propagator", false);
        setBooleanField(term424, term424.getClass(), "failed", false);
        setField(term421, term421.getClass(), "parent", term424);
        setField(term430, term430.getClass(), "graph", null);
        setField(term430, term430.getClass(), "vertexColor", null);
        setIntField(term430, term430.getClass(), "numColoredVertices", 0);
        setField(term430, term430.getClass(), "usedColors", null);
        setField(term430, term430.getClass(), "colorMap", null);
        setField(term421, term421.getClass(), "coloring", term430);
        setField(term421, term421.getClass(), "domains", term432);
        setIntField(term433, term433.getClass(), "vertex", 0);
        setField(term433, term433.getClass(), "values", null);
        setField(term433, term433.getClass(), "positions", null);
        setIntField(term433, term433.getClass(), "size", 0);
        setField(term421, term421.getClass(), "minDomain", term433);
        setBooleanField(term421, term421.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term421, term421.getClass(), "propagator", true);
        setBooleanField(term421, term421.getClass(), "failed", true);
        setField(term418, term418.getClass(), "parent", term421);
        setField(term439, term439.getClass(), "graph", null);
        setField(term439, term439.getClass(), "vertexColor", null);
        setIntField(term439, term439.getClass(), "numColoredVertices", 0);
        setField(term439, term439.getClass(), "usedColors", null);
        setField(term439, term439.getClass(), "colorMap", null);
        setField(term418, term418.getClass(), "coloring", term439);
        setIntField(term442, term442.getClass(), "vertex", 0);
        setField(term442, term442.getClass(), "values", null);
        setField(term442, term442.getClass(), "positions", null);
        setIntField(term442, term442.getClass(), "size", 0);
        setElement(term441, 0, term442);
        setIntField(term445, term445.getClass(), "vertex", 0);
        setField(term445, term445.getClass(), "values", null);
        setField(term445, term445.getClass(), "positions", null);
        setIntField(term445, term445.getClass(), "size", 0);
        setElement(term441, 1, term445);
        setField(term418, term418.getClass(), "domains", term441);
        setField(term418, term418.getClass(), "minDomain", term445);
        setBooleanField(term418, term418.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term418, term418.getClass(), "propagator", false);
        setBooleanField(term418, term418.getClass(), "failed", true);
        setField(term415, term415.getClass(), "parent", term418);
        setField(term451, term451.getClass(), "graph", null);
        setField(term451, term451.getClass(), "vertexColor", null);
        setIntField(term451, term451.getClass(), "numColoredVertices", 0);
        setField(term451, term451.getClass(), "usedColors", null);
        setField(term451, term451.getClass(), "colorMap", null);
        setField(term415, term415.getClass(), "coloring", term451);
        setIntField(term454, term454.getClass(), "vertex", 0);
        setField(term454, term454.getClass(), "values", null);
        setField(term454, term454.getClass(), "positions", null);
        setIntField(term454, term454.getClass(), "size", 0);
        setElement(term453, 0, term454);
        setIntField(term457, term457.getClass(), "vertex", 0);
        setField(term457, term457.getClass(), "values", null);
        setField(term457, term457.getClass(), "positions", null);
        setIntField(term457, term457.getClass(), "size", 0);
        setElement(term453, 1, term457);
        setElement(term453, 2, term457);
        setIntField(term460, term460.getClass(), "vertex", 0);
        setField(term460, term460.getClass(), "values", null);
        setField(term460, term460.getClass(), "positions", null);
        setIntField(term460, term460.getClass(), "size", 0);
        setElement(term453, 3, term460);
        setElement(term453, 4, term454);
        setField(term415, term415.getClass(), "domains", term453);
        setField(term415, term415.getClass(), "minDomain", term457);
        setBooleanField(term415, term415.getClass(), "removeSymmetricalColors", true);
        setBooleanField(term415, term415.getClass(), "propagator", true);
        setBooleanField(term415, term415.getClass(), "failed", false);
        setField(term412, term412.getClass(), "parent", term415);
        setField(term466, term466.getClass(), "graph", null);
        setField(term466, term466.getClass(), "vertexColor", null);
        setIntField(term466, term466.getClass(), "numColoredVertices", 0);
        setField(term466, term466.getClass(), "usedColors", null);
        setField(term466, term466.getClass(), "colorMap", null);
        setField(term412, term412.getClass(), "coloring", term466);
        setElement(term468, 0, term433);
        setIntField(term469, term469.getClass(), "vertex", 0);
        setField(term469, term469.getClass(), "values", null);
        setField(term469, term469.getClass(), "positions", null);
        setIntField(term469, term469.getClass(), "size", 0);
        setElement(term468, 1, term469);
        setElement(term468, 2, term460);
        setField(term412, term412.getClass(), "domains", term468);
        setField(term412, term412.getClass(), "minDomain", term457);
        setBooleanField(term412, term412.getClass(), "removeSymmetricalColors", false);
        setBooleanField(term412, term412.getClass(), "propagator", false);
        setBooleanField(term412, term412.getClass(), "failed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.coloring.Node");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removeSymmetricalColors", argTypes, term412, args);
    }

};


