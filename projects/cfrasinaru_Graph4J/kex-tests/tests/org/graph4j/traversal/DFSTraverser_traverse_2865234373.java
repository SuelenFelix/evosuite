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
import java.util.ArrayDeque;

public class DFSTraverser_traverse_2865234373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1809;

    public DFSTraverser_traverse_2865234373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1820 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1825 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1820, term1820.getClass(), "component", -1408678076);
        setIntField(term1820, term1820.getClass(), "vertex", 1201413899);
        setIntField(term1820, term1820.getClass(), "level", -376722373);
        setIntField(term1820, term1820.getClass(), "order", 1180687854);
        setIntField(term1825, term1825.getClass(), "component", 328631288);
        setIntField(term1825, term1825.getClass(), "vertex", -1631415805);
        setIntField(term1825, term1825.getClass(), "level", 1073400519);
        setIntField(term1825, term1825.getClass(), "order", -2025555268);
        setField(term1825, term1825.getClass(), "parent", null);
        setField(term1820, term1820.getClass(), "parent", term1825);
        Object term1830 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1835 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1830, term1830.getClass(), "component", -203832871);
        setIntField(term1830, term1830.getClass(), "vertex", 1151963130);
        setIntField(term1830, term1830.getClass(), "level", -1855819749);
        setIntField(term1830, term1830.getClass(), "order", 1059048043);
        setIntField(term1835, term1835.getClass(), "component", 537273345);
        setIntField(term1835, term1835.getClass(), "vertex", -346107257);
        setIntField(term1835, term1835.getClass(), "level", -1577393360);
        setIntField(term1835, term1835.getClass(), "order", 1112256038);
        setField(term1835, term1835.getClass(), "parent", null);
        setField(term1830, term1830.getClass(), "parent", term1835);
        Object term1840 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1845 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1840, term1840.getClass(), "component", -1231122778);
        setIntField(term1840, term1840.getClass(), "vertex", 1923558221);
        setIntField(term1840, term1840.getClass(), "level", 1762934060);
        setIntField(term1840, term1840.getClass(), "order", -859828739);
        setIntField(term1845, term1845.getClass(), "component", 1986855642);
        setIntField(term1845, term1845.getClass(), "vertex", 1280322790);
        setIntField(term1845, term1845.getClass(), "level", -1702209203);
        setIntField(term1845, term1845.getClass(), "order", -1592307668);
        setField(term1845, term1845.getClass(), "parent", null);
        setField(term1840, term1840.getClass(), "parent", term1845);
        Object term1850 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1855 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1850, term1850.getClass(), "component", -831921156);
        setIntField(term1850, term1850.getClass(), "vertex", -2085566906);
        setIntField(term1850, term1850.getClass(), "level", 1773193728);
        setIntField(term1850, term1850.getClass(), "order", -1341357647);
        setIntField(term1855, term1855.getClass(), "component", 138447019);
        setIntField(term1855, term1855.getClass(), "vertex", 114915275);
        setIntField(term1855, term1855.getClass(), "level", 338519695);
        setIntField(term1855, term1855.getClass(), "order", 2025566580);
        setField(term1855, term1855.getClass(), "parent", term1840);
        setField(term1850, term1850.getClass(), "parent", term1855);
        ArrayDeque term1818 = new ArrayDeque();
        ((ArrayDeque) term1818).add(term1820);
        ((ArrayDeque) term1818).add(term1830);
        ((ArrayDeque) term1818).add(term1830);
        ((ArrayDeque) term1818).add(term1820);
        ((ArrayDeque) term1818).add(term1840);
        ((ArrayDeque) term1818).add(term1850);
        ((ArrayDeque) term1818).add(term1825);
        term1809 = newInstance(Class.forName("org.graph4j.traversal.DFSTraverser"));
        Object[] term1813 = (Object[]) newArray("org.graph4j.traversal.SearchNode", 0);
        int[] term1814 = (int[]) newIntArray(2);
        boolean[] term1862 = (boolean[]) newBooleanArray(2);
        setField(term1809, term1809.getClass(), "graph", null);
        setBooleanField(term1809, term1809.getClass(), "directed", true);
        setField(term1809, term1809.getClass(), "visitor", null);
        setIntField(term1809, term1809.getClass(), "orderIndex", -1749591213);
        setIntField(term1809, term1809.getClass(), "compIndex", 1703093401);
        setField(term1809, term1809.getClass(), "visited", term1813);
        setIntElement(term1814, 0, 47607734);
        setIntElement(term1814, 1, 1717232691);
        setField(term1809, term1809.getClass(), "nextPos", term1814);
        setIntField(term1809, term1809.getClass(), "restartIndex", -938127737);
        setField(term1809, term1809.getClass(), "stack", term1818);
        setBooleanElement(term1862, 0, true);
        setBooleanElement(term1862, 1, true);
        setField(term1809, term1809.getClass(), "instack", term1862);
        setBooleanField(term1809, term1809.getClass(), "interrupted", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSTraverser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.DFSVisitor");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "traverse", argTypes, term1809, args);
    }

};


