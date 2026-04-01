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

public class DFSVisitor_backEdge_20203833413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147726;
     Object term147751;

    public DFSVisitor_backEdge_20203833413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147726 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147731 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147736 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147741 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147746 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147726, term147726.getClass(), "component", -1235764823);
        setIntField(term147726, term147726.getClass(), "vertex", 476401308);
        setIntField(term147726, term147726.getClass(), "level", -691975586);
        setIntField(term147726, term147726.getClass(), "order", -625040595);
        setIntField(term147731, term147731.getClass(), "component", 1203490531);
        setIntField(term147731, term147731.getClass(), "vertex", -1393425051);
        setIntField(term147731, term147731.getClass(), "level", 1871316476);
        setIntField(term147731, term147731.getClass(), "order", 1330840151);
        setIntField(term147736, term147736.getClass(), "component", 1525512337);
        setIntField(term147736, term147736.getClass(), "vertex", -2013456162);
        setIntField(term147736, term147736.getClass(), "level", -1778542453);
        setIntField(term147736, term147736.getClass(), "order", -117877442);
        setIntField(term147741, term147741.getClass(), "component", 1944317324);
        setIntField(term147741, term147741.getClass(), "vertex", 1645961696);
        setIntField(term147741, term147741.getClass(), "level", 1542820680);
        setIntField(term147741, term147741.getClass(), "order", 1561368902);
        setIntField(term147746, term147746.getClass(), "component", -1859934574);
        setIntField(term147746, term147746.getClass(), "vertex", 1482565040);
        setIntField(term147746, term147746.getClass(), "level", -1320789675);
        setIntField(term147746, term147746.getClass(), "order", -1403759343);
        setField(term147746, term147746.getClass(), "parent", null);
        setField(term147741, term147741.getClass(), "parent", term147746);
        setField(term147736, term147736.getClass(), "parent", term147741);
        setField(term147731, term147731.getClass(), "parent", term147736);
        setField(term147726, term147726.getClass(), "parent", term147731);
        term147751 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147756 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147761 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147766 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term147771 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term147751, term147751.getClass(), "component", -716079388);
        setIntField(term147751, term147751.getClass(), "vertex", 1909215429);
        setIntField(term147751, term147751.getClass(), "level", 73009872);
        setIntField(term147751, term147751.getClass(), "order", 2012132992);
        setIntField(term147756, term147756.getClass(), "component", -895254618);
        setIntField(term147756, term147756.getClass(), "vertex", 821633152);
        setIntField(term147756, term147756.getClass(), "level", 614587732);
        setIntField(term147756, term147756.getClass(), "order", 1557739632);
        setIntField(term147761, term147761.getClass(), "component", -1485555740);
        setIntField(term147761, term147761.getClass(), "vertex", -448518102);
        setIntField(term147761, term147761.getClass(), "level", 1254966530);
        setIntField(term147761, term147761.getClass(), "order", 598609916);
        setIntField(term147766, term147766.getClass(), "component", 1386805386);
        setIntField(term147766, term147766.getClass(), "vertex", 608447651);
        setIntField(term147766, term147766.getClass(), "level", -913102629);
        setIntField(term147766, term147766.getClass(), "order", -1019327954);
        setIntField(term147771, term147771.getClass(), "component", 1587025134);
        setIntField(term147771, term147771.getClass(), "vertex", -916485859);
        setIntField(term147771, term147771.getClass(), "level", -1751873139);
        setIntField(term147771, term147771.getClass(), "order", -1149846145);
        setField(term147771, term147771.getClass(), "parent", null);
        setField(term147766, term147766.getClass(), "parent", term147771);
        setField(term147761, term147761.getClass(), "parent", term147766);
        setField(term147756, term147756.getClass(), "parent", term147761);
        setField(term147751, term147751.getClass(), "parent", term147756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term147726;
        args[1] = term147751;
        callMethod(klass, "backEdge", argTypes, null, args);
    }

};


