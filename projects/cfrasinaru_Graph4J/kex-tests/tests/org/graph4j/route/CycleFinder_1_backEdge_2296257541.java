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
import java.lang.Object;

public class CycleFinder_1_backEdge_2296257541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239;
     Object term240;
     Object term265;

    public CycleFinder_1_backEdge_2296257541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239 = newInstance(Class.forName("org.graph4j.route.CycleFinder$1"));
        setField(term239, term239.getClass(), "this$0", null);
        term240 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term245 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term250 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term255 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term260 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term240, term240.getClass(), "component", 1484323161);
        setIntField(term240, term240.getClass(), "vertex", 391863371);
        setIntField(term240, term240.getClass(), "level", -1922583790);
        setIntField(term240, term240.getClass(), "order", -616727354);
        setIntField(term245, term245.getClass(), "component", -1955890973);
        setIntField(term245, term245.getClass(), "vertex", -2038273078);
        setIntField(term245, term245.getClass(), "level", 1227103734);
        setIntField(term245, term245.getClass(), "order", -1339778481);
        setIntField(term250, term250.getClass(), "component", 1725571209);
        setIntField(term250, term250.getClass(), "vertex", -522618178);
        setIntField(term250, term250.getClass(), "level", 1134449235);
        setIntField(term250, term250.getClass(), "order", -883034806);
        setIntField(term255, term255.getClass(), "component", 1585847225);
        setIntField(term255, term255.getClass(), "vertex", 597278769);
        setIntField(term255, term255.getClass(), "level", -1685132342);
        setIntField(term255, term255.getClass(), "order", -1456670397);
        setIntField(term260, term260.getClass(), "component", 1622346318);
        setIntField(term260, term260.getClass(), "vertex", 1048535127);
        setIntField(term260, term260.getClass(), "level", -655067527);
        setIntField(term260, term260.getClass(), "order", -6029667);
        setField(term260, term260.getClass(), "parent", null);
        setField(term255, term255.getClass(), "parent", term260);
        setField(term250, term250.getClass(), "parent", term255);
        setField(term245, term245.getClass(), "parent", term250);
        setField(term240, term240.getClass(), "parent", term245);
        term265 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term270 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term275 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term280 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term285 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term265, term265.getClass(), "component", -602026508);
        setIntField(term265, term265.getClass(), "vertex", -157887805);
        setIntField(term265, term265.getClass(), "level", 1876565163);
        setIntField(term265, term265.getClass(), "order", -817164822);
        setIntField(term270, term270.getClass(), "component", -1016503459);
        setIntField(term270, term270.getClass(), "vertex", -1968847291);
        setIntField(term270, term270.getClass(), "level", 579005622);
        setIntField(term270, term270.getClass(), "order", -14890619);
        setIntField(term275, term275.getClass(), "component", 1632125673);
        setIntField(term275, term275.getClass(), "vertex", 454281060);
        setIntField(term275, term275.getClass(), "level", -1786399638);
        setIntField(term275, term275.getClass(), "order", 2055867847);
        setIntField(term280, term280.getClass(), "component", -1048298087);
        setIntField(term280, term280.getClass(), "vertex", 292681826);
        setIntField(term280, term280.getClass(), "level", 458147407);
        setIntField(term280, term280.getClass(), "order", -184153539);
        setIntField(term285, term285.getClass(), "component", 493620644);
        setIntField(term285, term285.getClass(), "vertex", 1328271830);
        setIntField(term285, term285.getClass(), "level", 1596070772);
        setIntField(term285, term285.getClass(), "order", 97029295);
        setField(term285, term285.getClass(), "parent", null);
        setField(term280, term280.getClass(), "parent", term285);
        setField(term275, term275.getClass(), "parent", term280);
        setField(term270, term270.getClass(), "parent", term275);
        setField(term265, term265.getClass(), "parent", term270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term240;
        args[1] = term265;
        callMethod(klass, "backEdge", argTypes, term239, args);
    }

};


