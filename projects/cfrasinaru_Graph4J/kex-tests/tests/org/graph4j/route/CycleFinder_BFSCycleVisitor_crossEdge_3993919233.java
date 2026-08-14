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

public class CycleFinder_BFSCycleVisitor_crossEdge_3993919233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672;
     Object term706;
     Object term731;

    public CycleFinder_BFSCycleVisitor_crossEdge_3993919233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672 = newInstance(Class.forName("org.graph4j.route.CycleFinder$BFSCycleVisitor"));
        Object term673 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term675 = (int[]) newIntArray(3);
        Object term681 = newInstance(Class.forName("java.util.BitSet"));
        long[] term682 = (long[]) newLongArray(1);
        Object term686 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term691 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term696 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term701 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term673, term673.getClass(), "numEdges", -916335264);
        setField(term673, term673.getClass(), "graph", null);
        setIntElement(term675, 0, -919416536);
        setIntElement(term675, 1, -43417861);
        setIntElement(term675, 2, -1533843432);
        setField(term673, term673.getClass(), "vertices", term675);
        setIntField(term673, term673.getClass(), "numVertices", -123338791);
        setIntField(term673, term673.getClass(), "first", -1467089634);
        setField(term681, term681.getClass(), "words", term682);
        setIntField(term681, term681.getClass(), "wordsInUse", 413548937);
        setBooleanField(term681, term681.getClass(), "sizeIsSticky", false);
        setField(term673, term673.getClass(), "bitset", term681);
        setField(term672, term672.getClass(), "cycle", term673);
        setIntField(term686, term686.getClass(), "component", 1901317214);
        setIntField(term686, term686.getClass(), "vertex", 1166710220);
        setIntField(term686, term686.getClass(), "level", -1070592289);
        setIntField(term686, term686.getClass(), "order", -1464172784);
        setIntField(term691, term691.getClass(), "component", 32185364);
        setIntField(term691, term691.getClass(), "vertex", 1768204942);
        setIntField(term691, term691.getClass(), "level", 1252951645);
        setIntField(term691, term691.getClass(), "order", 574481092);
        setIntField(term696, term696.getClass(), "component", -310528004);
        setIntField(term696, term696.getClass(), "vertex", -634976996);
        setIntField(term696, term696.getClass(), "level", -1015274146);
        setIntField(term696, term696.getClass(), "order", -49052672);
        setIntField(term701, term701.getClass(), "component", 339372704);
        setIntField(term701, term701.getClass(), "vertex", -851097944);
        setIntField(term701, term701.getClass(), "level", 803925431);
        setIntField(term701, term701.getClass(), "order", 76929641);
        setField(term701, term701.getClass(), "parent", null);
        setField(term696, term696.getClass(), "parent", term701);
        setField(term691, term691.getClass(), "parent", term696);
        setField(term686, term686.getClass(), "parent", term691);
        setField(term672, term672.getClass(), "targetNode", term686);
        setField(term672, term672.getClass(), "this$0", null);
        term706 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term711 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term716 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term721 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term726 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term706, term706.getClass(), "component", 993388358);
        setIntField(term706, term706.getClass(), "vertex", -765191335);
        setIntField(term706, term706.getClass(), "level", -1697741155);
        setIntField(term706, term706.getClass(), "order", 1295839803);
        setIntField(term711, term711.getClass(), "component", -1891015523);
        setIntField(term711, term711.getClass(), "vertex", -1560631747);
        setIntField(term711, term711.getClass(), "level", 1215150180);
        setIntField(term711, term711.getClass(), "order", -1422859977);
        setIntField(term716, term716.getClass(), "component", -1972436591);
        setIntField(term716, term716.getClass(), "vertex", 68922753);
        setIntField(term716, term716.getClass(), "level", -220791533);
        setIntField(term716, term716.getClass(), "order", 1741500243);
        setIntField(term721, term721.getClass(), "component", -2070466617);
        setIntField(term721, term721.getClass(), "vertex", -1127721881);
        setIntField(term721, term721.getClass(), "level", 1074848808);
        setIntField(term721, term721.getClass(), "order", -146054762);
        setIntField(term726, term726.getClass(), "component", 798043553);
        setIntField(term726, term726.getClass(), "vertex", 533197381);
        setIntField(term726, term726.getClass(), "level", 1048271679);
        setIntField(term726, term726.getClass(), "order", -1529797673);
        setField(term726, term726.getClass(), "parent", null);
        setField(term721, term721.getClass(), "parent", term726);
        setField(term716, term716.getClass(), "parent", term721);
        setField(term711, term711.getClass(), "parent", term716);
        setField(term706, term706.getClass(), "parent", term711);
        term731 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term736 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term741 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term746 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term751 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term731, term731.getClass(), "component", 1116576792);
        setIntField(term731, term731.getClass(), "vertex", -942194446);
        setIntField(term731, term731.getClass(), "level", -938508470);
        setIntField(term731, term731.getClass(), "order", 1242676024);
        setIntField(term736, term736.getClass(), "component", -1865023308);
        setIntField(term736, term736.getClass(), "vertex", 1698510819);
        setIntField(term736, term736.getClass(), "level", -1553893255);
        setIntField(term736, term736.getClass(), "order", 1303442927);
        setIntField(term741, term741.getClass(), "component", 794568325);
        setIntField(term741, term741.getClass(), "vertex", -434468428);
        setIntField(term741, term741.getClass(), "level", 1559605714);
        setIntField(term741, term741.getClass(), "order", 1146601902);
        setIntField(term746, term746.getClass(), "component", -1938881385);
        setIntField(term746, term746.getClass(), "vertex", -1629418973);
        setIntField(term746, term746.getClass(), "level", -100825168);
        setIntField(term746, term746.getClass(), "order", 768407648);
        setIntField(term751, term751.getClass(), "component", -350454594);
        setIntField(term751, term751.getClass(), "vertex", -1148142995);
        setIntField(term751, term751.getClass(), "level", -233024044);
        setIntField(term751, term751.getClass(), "order", 1820784228);
        setField(term751, term751.getClass(), "parent", null);
        setField(term746, term746.getClass(), "parent", term751);
        setField(term741, term741.getClass(), "parent", term746);
        setField(term736, term736.getClass(), "parent", term741);
        setField(term731, term731.getClass(), "parent", term736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$BFSCycleVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term706;
        args[1] = term731;
        callMethod(klass, "crossEdge", argTypes, term672, args);
    }

};


