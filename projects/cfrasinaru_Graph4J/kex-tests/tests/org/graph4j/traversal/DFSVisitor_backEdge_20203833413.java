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
     Object term3161;
     Object term3186;

    public DFSVisitor_backEdge_20203833413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3161 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3166 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3171 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3176 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3181 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3161, term3161.getClass(), "component", -935900044);
        setIntField(term3161, term3161.getClass(), "vertex", 1747876558);
        setIntField(term3161, term3161.getClass(), "level", 833477776);
        setIntField(term3161, term3161.getClass(), "order", 2043960707);
        setIntField(term3166, term3166.getClass(), "component", 272179554);
        setIntField(term3166, term3166.getClass(), "vertex", 1717711536);
        setIntField(term3166, term3166.getClass(), "level", -606339607);
        setIntField(term3166, term3166.getClass(), "order", 800440712);
        setIntField(term3171, term3171.getClass(), "component", -1976407622);
        setIntField(term3171, term3171.getClass(), "vertex", -552996061);
        setIntField(term3171, term3171.getClass(), "level", -153013117);
        setIntField(term3171, term3171.getClass(), "order", 712181359);
        setIntField(term3176, term3176.getClass(), "component", -1943255435);
        setIntField(term3176, term3176.getClass(), "vertex", 868436312);
        setIntField(term3176, term3176.getClass(), "level", 1737963071);
        setIntField(term3176, term3176.getClass(), "order", 6456997);
        setIntField(term3181, term3181.getClass(), "component", -797269627);
        setIntField(term3181, term3181.getClass(), "vertex", -224331928);
        setIntField(term3181, term3181.getClass(), "level", -587857163);
        setIntField(term3181, term3181.getClass(), "order", -2018093075);
        setField(term3181, term3181.getClass(), "parent", null);
        setField(term3176, term3176.getClass(), "parent", term3181);
        setField(term3171, term3171.getClass(), "parent", term3176);
        setField(term3166, term3166.getClass(), "parent", term3171);
        setField(term3161, term3161.getClass(), "parent", term3166);
        term3186 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3191 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3196 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3201 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term3206 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term3186, term3186.getClass(), "component", 1610419467);
        setIntField(term3186, term3186.getClass(), "vertex", 1155135931);
        setIntField(term3186, term3186.getClass(), "level", -636910567);
        setIntField(term3186, term3186.getClass(), "order", 1896114203);
        setIntField(term3191, term3191.getClass(), "component", 1045745470);
        setIntField(term3191, term3191.getClass(), "vertex", 892741901);
        setIntField(term3191, term3191.getClass(), "level", -1724900201);
        setIntField(term3191, term3191.getClass(), "order", -758523003);
        setIntField(term3196, term3196.getClass(), "component", 1567184195);
        setIntField(term3196, term3196.getClass(), "vertex", 63595623);
        setIntField(term3196, term3196.getClass(), "level", 1764150991);
        setIntField(term3196, term3196.getClass(), "order", 944653455);
        setIntField(term3201, term3201.getClass(), "component", -1819474400);
        setIntField(term3201, term3201.getClass(), "vertex", 783684648);
        setIntField(term3201, term3201.getClass(), "level", 553754005);
        setIntField(term3201, term3201.getClass(), "order", 1986699236);
        setIntField(term3206, term3206.getClass(), "component", -1729178560);
        setIntField(term3206, term3206.getClass(), "vertex", 874974171);
        setIntField(term3206, term3206.getClass(), "level", -1689017763);
        setIntField(term3206, term3206.getClass(), "order", 1657387281);
        setField(term3206, term3206.getClass(), "parent", null);
        setField(term3201, term3201.getClass(), "parent", term3206);
        setField(term3196, term3196.getClass(), "parent", term3201);
        setField(term3191, term3191.getClass(), "parent", term3196);
        setField(term3186, term3186.getClass(), "parent", term3191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term3161;
        args[1] = term3186;
        callMethod(klass, "backEdge", argTypes, null, args);
    }

};


