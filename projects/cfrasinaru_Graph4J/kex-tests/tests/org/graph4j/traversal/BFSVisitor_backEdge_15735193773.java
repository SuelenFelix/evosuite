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

public class BFSVisitor_backEdge_15735193773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105774;
     Object term105799;

    public BFSVisitor_backEdge_15735193773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term105774 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105779 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105784 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105789 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105794 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term105774, term105774.getClass(), "component", -221358154);
        setIntField(term105774, term105774.getClass(), "vertex", -516595702);
        setIntField(term105774, term105774.getClass(), "level", -557215514);
        setIntField(term105774, term105774.getClass(), "order", 2002251821);
        setIntField(term105779, term105779.getClass(), "component", 437164912);
        setIntField(term105779, term105779.getClass(), "vertex", -706458680);
        setIntField(term105779, term105779.getClass(), "level", 1062951811);
        setIntField(term105779, term105779.getClass(), "order", -909676866);
        setIntField(term105784, term105784.getClass(), "component", 1051932573);
        setIntField(term105784, term105784.getClass(), "vertex", -569396908);
        setIntField(term105784, term105784.getClass(), "level", 1013221881);
        setIntField(term105784, term105784.getClass(), "order", 1923722067);
        setIntField(term105789, term105789.getClass(), "component", -1345415060);
        setIntField(term105789, term105789.getClass(), "vertex", -408639521);
        setIntField(term105789, term105789.getClass(), "level", 1757333328);
        setIntField(term105789, term105789.getClass(), "order", 127436166);
        setIntField(term105794, term105794.getClass(), "component", 730050663);
        setIntField(term105794, term105794.getClass(), "vertex", 534469982);
        setIntField(term105794, term105794.getClass(), "level", -907905819);
        setIntField(term105794, term105794.getClass(), "order", -1500119769);
        setField(term105794, term105794.getClass(), "parent", null);
        setField(term105789, term105789.getClass(), "parent", term105794);
        setField(term105784, term105784.getClass(), "parent", term105789);
        setField(term105779, term105779.getClass(), "parent", term105784);
        setField(term105774, term105774.getClass(), "parent", term105779);
        term105799 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105804 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105809 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105814 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term105819 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term105799, term105799.getClass(), "component", -925486854);
        setIntField(term105799, term105799.getClass(), "vertex", 1067945533);
        setIntField(term105799, term105799.getClass(), "level", 1635163759);
        setIntField(term105799, term105799.getClass(), "order", -1183115171);
        setIntField(term105804, term105804.getClass(), "component", -1473536555);
        setIntField(term105804, term105804.getClass(), "vertex", -741876612);
        setIntField(term105804, term105804.getClass(), "level", 472842962);
        setIntField(term105804, term105804.getClass(), "order", -1859274829);
        setIntField(term105809, term105809.getClass(), "component", 1457126791);
        setIntField(term105809, term105809.getClass(), "vertex", 856920140);
        setIntField(term105809, term105809.getClass(), "level", -383713307);
        setIntField(term105809, term105809.getClass(), "order", -1558025995);
        setIntField(term105814, term105814.getClass(), "component", 1056318989);
        setIntField(term105814, term105814.getClass(), "vertex", 334255307);
        setIntField(term105814, term105814.getClass(), "level", 1723184992);
        setIntField(term105814, term105814.getClass(), "order", 221967550);
        setIntField(term105819, term105819.getClass(), "component", 2081272358);
        setIntField(term105819, term105819.getClass(), "vertex", 307424802);
        setIntField(term105819, term105819.getClass(), "level", 2082908668);
        setIntField(term105819, term105819.getClass(), "order", 1900872551);
        setField(term105819, term105819.getClass(), "parent", null);
        setField(term105814, term105814.getClass(), "parent", term105819);
        setField(term105809, term105809.getClass(), "parent", term105814);
        setField(term105804, term105804.getClass(), "parent", term105809);
        setField(term105799, term105799.getClass(), "parent", term105804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.BFSVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term105774;
        args[1] = term105799;
        callMethod(klass, "backEdge", argTypes, null, args);
    }

};


