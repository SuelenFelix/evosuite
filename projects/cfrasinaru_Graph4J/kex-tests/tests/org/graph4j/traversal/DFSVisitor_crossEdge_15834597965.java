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

public class DFSVisitor_crossEdge_15834597965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147826;
     Object term147851;

    public DFSVisitor_crossEdge_15834597965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147826 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147831 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147836 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147841 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147846 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147826, term147826.getClass(), "component", 1654561683);
        setIntField(term147826, term147826.getClass(), "vertex", 2075402659);
        setIntField(term147826, term147826.getClass(), "level", 1914608773);
        setIntField(term147826, term147826.getClass(), "order", -637528607);
        setIntField(term147831, term147831.getClass(), "component", 2008575126);
        setIntField(term147831, term147831.getClass(), "vertex", 301667127);
        setIntField(term147831, term147831.getClass(), "level", 1848900496);
        setIntField(term147831, term147831.getClass(), "order", -988791435);
        setIntField(term147836, term147836.getClass(), "component", -1814683135);
        setIntField(term147836, term147836.getClass(), "vertex", 2139308332);
        setIntField(term147836, term147836.getClass(), "level", 1550222829);
        setIntField(term147836, term147836.getClass(), "order", 83429601);
        setIntField(term147841, term147841.getClass(), "component", 1322584528);
        setIntField(term147841, term147841.getClass(), "vertex", 2046421462);
        setIntField(term147841, term147841.getClass(), "level", 160865740);
        setIntField(term147841, term147841.getClass(), "order", 1540479122);
        setIntField(term147846, term147846.getClass(), "component", 602850305);
        setIntField(term147846, term147846.getClass(), "vertex", 1705989523);
        setIntField(term147846, term147846.getClass(), "level", -1070705569);
        setIntField(term147846, term147846.getClass(), "order", 453868758);
        setField(term147846, term147846.getClass(), "parent", null);
        setField(term147841, term147841.getClass(), "parent", term147846);
        setField(term147836, term147836.getClass(), "parent", term147841);
        setField(term147831, term147831.getClass(), "parent", term147836);
        setField(term147826, term147826.getClass(), "parent", term147831);
        term147851 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147856 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147861 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147866 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147871 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147851, term147851.getClass(), "component", -589001020);
        setIntField(term147851, term147851.getClass(), "vertex", 1552808032);
        setIntField(term147851, term147851.getClass(), "level", -971152899);
        setIntField(term147851, term147851.getClass(), "order", -1282628103);
        setIntField(term147856, term147856.getClass(), "component", -1187909933);
        setIntField(term147856, term147856.getClass(), "vertex", -981299895);
        setIntField(term147856, term147856.getClass(), "level", 1406994756);
        setIntField(term147856, term147856.getClass(), "order", -641693408);
        setIntField(term147861, term147861.getClass(), "component", -343194810);
        setIntField(term147861, term147861.getClass(), "vertex", 741234101);
        setIntField(term147861, term147861.getClass(), "level", -782544343);
        setIntField(term147861, term147861.getClass(), "order", -284308864);
        setIntField(term147866, term147866.getClass(), "component", 1812549483);
        setIntField(term147866, term147866.getClass(), "vertex", 539743809);
        setIntField(term147866, term147866.getClass(), "level", 1856037345);
        setIntField(term147866, term147866.getClass(), "order", 1225547376);
        setIntField(term147871, term147871.getClass(), "component", 1068981530);
        setIntField(term147871, term147871.getClass(), "vertex", -448844937);
        setIntField(term147871, term147871.getClass(), "level", 417917035);
        setIntField(term147871, term147871.getClass(), "order", -1452610222);
        setField(term147871, term147871.getClass(), "parent", null);
        setField(term147866, term147866.getClass(), "parent", term147871);
        setField(term147861, term147861.getClass(), "parent", term147866);
        setField(term147856, term147856.getClass(), "parent", term147861);
        setField(term147851, term147851.getClass(), "parent", term147856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term147826;
        args[1] = term147851;
        callMethod(klass, "crossEdge", argTypes, null, args);
    }

};


