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

public class BFSVisitor_crossEdge_20104429224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105824;
     Object term105849;

    public BFSVisitor_crossEdge_20104429224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105824 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105829 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105834 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105839 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105844 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term105824, term105824.getClass(), "component", 533555487);
        setIntField(term105824, term105824.getClass(), "vertex", 270555833);
        setIntField(term105824, term105824.getClass(), "level", -1454916925);
        setIntField(term105824, term105824.getClass(), "order", -1348867097);
        setIntField(term105829, term105829.getClass(), "component", 1412892169);
        setIntField(term105829, term105829.getClass(), "vertex", 1364137068);
        setIntField(term105829, term105829.getClass(), "level", 1874584166);
        setIntField(term105829, term105829.getClass(), "order", 869259501);
        setIntField(term105834, term105834.getClass(), "component", -480123256);
        setIntField(term105834, term105834.getClass(), "vertex", 1232910681);
        setIntField(term105834, term105834.getClass(), "level", 1226906639);
        setIntField(term105834, term105834.getClass(), "order", 1627208885);
        setIntField(term105839, term105839.getClass(), "component", -1869105420);
        setIntField(term105839, term105839.getClass(), "vertex", 893460953);
        setIntField(term105839, term105839.getClass(), "level", 1348216633);
        setIntField(term105839, term105839.getClass(), "order", -5190998);
        setIntField(term105844, term105844.getClass(), "component", 1160994774);
        setIntField(term105844, term105844.getClass(), "vertex", 451249819);
        setIntField(term105844, term105844.getClass(), "level", -1756025848);
        setIntField(term105844, term105844.getClass(), "order", -105569667);
        setField(term105844, term105844.getClass(), "parent", null);
        setField(term105839, term105839.getClass(), "parent", term105844);
        setField(term105834, term105834.getClass(), "parent", term105839);
        setField(term105829, term105829.getClass(), "parent", term105834);
        setField(term105824, term105824.getClass(), "parent", term105829);
        term105849 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105854 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105859 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105864 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105869 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term105849, term105849.getClass(), "component", 1494923419);
        setIntField(term105849, term105849.getClass(), "vertex", 556950465);
        setIntField(term105849, term105849.getClass(), "level", 1099903179);
        setIntField(term105849, term105849.getClass(), "order", -1521358551);
        setIntField(term105854, term105854.getClass(), "component", 1832556877);
        setIntField(term105854, term105854.getClass(), "vertex", -1087471651);
        setIntField(term105854, term105854.getClass(), "level", 1869899776);
        setIntField(term105854, term105854.getClass(), "order", 2034369438);
        setIntField(term105859, term105859.getClass(), "component", -1784707255);
        setIntField(term105859, term105859.getClass(), "vertex", -1007991583);
        setIntField(term105859, term105859.getClass(), "level", 509641395);
        setIntField(term105859, term105859.getClass(), "order", -1784404553);
        setIntField(term105864, term105864.getClass(), "component", -1943012393);
        setIntField(term105864, term105864.getClass(), "vertex", -1950346318);
        setIntField(term105864, term105864.getClass(), "level", 989437746);
        setIntField(term105864, term105864.getClass(), "order", 1117487487);
        setIntField(term105869, term105869.getClass(), "component", 1631255765);
        setIntField(term105869, term105869.getClass(), "vertex", -1811916333);
        setIntField(term105869, term105869.getClass(), "level", 752701210);
        setIntField(term105869, term105869.getClass(), "order", -589123886);
        setField(term105869, term105869.getClass(), "parent", null);
        setField(term105864, term105864.getClass(), "parent", term105869);
        setField(term105859, term105859.getClass(), "parent", term105864);
        setField(term105854, term105854.getClass(), "parent", term105859);
        setField(term105849, term105849.getClass(), "parent", term105854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term105824;
        args[1] = term105849;
        callMethod(klass, "crossEdge", argTypes, null, args);
    }

};


