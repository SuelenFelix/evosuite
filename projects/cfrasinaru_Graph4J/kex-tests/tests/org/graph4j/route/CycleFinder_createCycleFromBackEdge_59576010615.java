package org.graph4j.route;

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
import static org.graph4j.route.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class CycleFinder_createCycleFromBackEdge_59576010615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4718;
     Object term4731;
     Object term4756;

    public CycleFinder_createCycleFromBackEdge_59576010615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4782 = Class.forName((String) "org.graph4j.traversal.TraversalStrategy");
        Field term4781 = ((Class) term4782).getDeclaredField((String) "DFS");
        ((Field) term4781).setAccessible(true);
        Object enum18 = ((Field) term4781).get((Object) null);
        term4718 = newInstance(Class.forName("org.graph4j.route.CycleFinder"));
        setIntField(term4718, term4718.getClass(), "target", -1934033808);
        setIntField(term4718, term4718.getClass(), "parity", 950322609);
        setBooleanField(term4718, term4718.getClass(), "shortest", true);
        setBooleanField(term4718, term4718.getClass(), "longer", true);
        setField(term4718, term4718.getClass(), "strategy", enum18);
        setField(term4718, term4718.getClass(), "graph", null);
        setBooleanField(term4718, term4718.getClass(), "directed", false);
        term4731 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term4736 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term4741 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term4746 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term4751 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term4731, term4731.getClass(), "component", -2023791789);
        setIntField(term4731, term4731.getClass(), "vertex", 353974456);
        setIntField(term4731, term4731.getClass(), "level", -485108462);
        setIntField(term4731, term4731.getClass(), "order", 1418551216);
        setIntField(term4736, term4736.getClass(), "component", -626779272);
        setIntField(term4736, term4736.getClass(), "vertex", -1150062870);
        setIntField(term4736, term4736.getClass(), "level", -886200503);
        setIntField(term4736, term4736.getClass(), "order", 1136393691);
        setIntField(term4741, term4741.getClass(), "component", -1288536479);
        setIntField(term4741, term4741.getClass(), "vertex", 1092038167);
        setIntField(term4741, term4741.getClass(), "level", 1879729823);
        setIntField(term4741, term4741.getClass(), "order", 1443855558);
        setIntField(term4746, term4746.getClass(), "component", -1933419449);
        setIntField(term4746, term4746.getClass(), "vertex", -1804322375);
        setIntField(term4746, term4746.getClass(), "level", 1595814906);
        setIntField(term4746, term4746.getClass(), "order", -834193529);
        setIntField(term4751, term4751.getClass(), "component", 335780735);
        setIntField(term4751, term4751.getClass(), "vertex", -1541981599);
        setIntField(term4751, term4751.getClass(), "level", 1605456363);
        setIntField(term4751, term4751.getClass(), "order", 2059896693);
        setField(term4751, term4751.getClass(), "parent", null);
        setField(term4746, term4746.getClass(), "parent", term4751);
        setField(term4741, term4741.getClass(), "parent", term4746);
        setField(term4736, term4736.getClass(), "parent", term4741);
        setField(term4731, term4731.getClass(), "parent", term4736);
        term4756 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term4761 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term4766 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term4771 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term4776 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term4756, term4756.getClass(), "component", 1120271104);
        setIntField(term4756, term4756.getClass(), "vertex", -128435804);
        setIntField(term4756, term4756.getClass(), "level", 2136158480);
        setIntField(term4756, term4756.getClass(), "order", 2118747457);
        setIntField(term4761, term4761.getClass(), "component", 1868344256);
        setIntField(term4761, term4761.getClass(), "vertex", 1857693976);
        setIntField(term4761, term4761.getClass(), "level", 1631305277);
        setIntField(term4761, term4761.getClass(), "order", 162113491);
        setIntField(term4766, term4766.getClass(), "component", -932147928);
        setIntField(term4766, term4766.getClass(), "vertex", 487369012);
        setIntField(term4766, term4766.getClass(), "level", -179238712);
        setIntField(term4766, term4766.getClass(), "order", -2018735535);
        setIntField(term4771, term4771.getClass(), "component", -658524954);
        setIntField(term4771, term4771.getClass(), "vertex", -2009613557);
        setIntField(term4771, term4771.getClass(), "level", 654195547);
        setIntField(term4771, term4771.getClass(), "order", 1622857008);
        setIntField(term4776, term4776.getClass(), "component", 934338954);
        setIntField(term4776, term4776.getClass(), "vertex", 598635505);
        setIntField(term4776, term4776.getClass(), "level", -944986533);
        setIntField(term4776, term4776.getClass(), "order", 1894454926);
        setField(term4776, term4776.getClass(), "parent", null);
        setField(term4771, term4771.getClass(), "parent", term4776);
        setField(term4766, term4766.getClass(), "parent", term4771);
        setField(term4761, term4761.getClass(), "parent", term4766);
        setField(term4756, term4756.getClass(), "parent", term4761);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term4731;
        args[1] = term4756;
        callMethod(klass, "createCycleFromBackEdge", argTypes, term4718, args);
    }

};


