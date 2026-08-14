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
import java.util.ArrayDeque;
import java.lang.Object;

public class DFSIterator_init_20678315952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term892;

    public DFSIterator_init_20678315952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term897 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term902 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term897, term897.getClass(), "component", 499519708);
        setIntField(term897, term897.getClass(), "vertex", 1501165033);
        setIntField(term897, term897.getClass(), "level", 510162332);
        setIntField(term897, term897.getClass(), "order", 888506903);
        setIntField(term902, term902.getClass(), "component", 200252898);
        setIntField(term902, term902.getClass(), "vertex", -1831826725);
        setIntField(term902, term902.getClass(), "level", 752152965);
        setIntField(term902, term902.getClass(), "order", -1577069773);
        setField(term902, term902.getClass(), "parent", null);
        setField(term897, term897.getClass(), "parent", term902);
        Object term907 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term912 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term907, term907.getClass(), "component", 76650923);
        setIntField(term907, term907.getClass(), "vertex", 1003743923);
        setIntField(term907, term907.getClass(), "level", 1887772522);
        setIntField(term907, term907.getClass(), "order", 354196060);
        setIntField(term912, term912.getClass(), "component", 91958879);
        setIntField(term912, term912.getClass(), "vertex", -645429025);
        setIntField(term912, term912.getClass(), "level", -688213483);
        setIntField(term912, term912.getClass(), "order", 644154104);
        setField(term912, term912.getClass(), "parent", null);
        setField(term907, term907.getClass(), "parent", term912);
        Object term917 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term917, term917.getClass(), "component", 0);
        setIntField(term917, term917.getClass(), "vertex", 0);
        setIntField(term917, term917.getClass(), "level", 0);
        setIntField(term917, term917.getClass(), "order", 0);
        setField(term917, term917.getClass(), "parent", null);
        ArrayDeque term895 = new ArrayDeque();
        ((ArrayDeque) term895).add(term897);
        ((ArrayDeque) term895).add(term907);
        ((ArrayDeque) term895).add(term917);
        term892 = newInstance(Class.forName("org.graph4j.traversal.DFSIterator"));
        boolean[] term924 = (boolean[]) newBooleanArray(7);
        int[] term932 = (int[]) newIntArray(2);
        setField(term892, term892.getClass(), "graph", null);
        setIntField(term892, term892.getClass(), "numVertices", -1792504217);
        setIntField(term892, term892.getClass(), "startVertex", 1824538861);
        setField(term892, term892.getClass(), "stack", term895);
        setBooleanElement(term924, 0, true);
        setBooleanElement(term924, 2, true);
        setBooleanElement(term924, 3, true);
        setBooleanElement(term924, 4, true);
        setBooleanElement(term924, 5, true);
        setField(term892, term892.getClass(), "visited", term924);
        setIntElement(term932, 0, -1840305774);
        setIntElement(term932, 1, 1365087144);
        setField(term892, term892.getClass(), "nextPos", term932);
        setIntField(term892, term892.getClass(), "restartIndex", -1537255112);
        setIntField(term892, term892.getClass(), "numIterations", 934477462);
        setIntField(term892, term892.getClass(), "component", 4900410);
        setIntField(term892, term892.getClass(), "orderNumber", -1252345779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term892, args);
    }

};


