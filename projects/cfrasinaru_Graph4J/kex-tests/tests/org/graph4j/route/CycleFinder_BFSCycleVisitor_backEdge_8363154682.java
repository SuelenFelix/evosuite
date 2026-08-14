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

public class CycleFinder_BFSCycleVisitor_backEdge_8363154682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582;
     Object term617;
     Object term642;

    public CycleFinder_BFSCycleVisitor_backEdge_8363154682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term582 = newInstance(Class.forName("org.graph4j.route.CycleFinder$BFSCycleVisitor"));
        Object term583 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term585 = (int[]) newIntArray(4);
        Object term592 = newInstance(Class.forName("java.util.BitSet"));
        long[] term593 = (long[]) newLongArray(1);
        Object term597 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term602 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term607 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term612 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term583, term583.getClass(), "numEdges", -243422082);
        setField(term583, term583.getClass(), "graph", null);
        setIntElement(term585, 0, 1384592638);
        setIntElement(term585, 1, -1002370457);
        setIntElement(term585, 2, -2014576105);
        setIntElement(term585, 3, 1296895584);
        setField(term583, term583.getClass(), "vertices", term585);
        setIntField(term583, term583.getClass(), "numVertices", 628918458);
        setIntField(term583, term583.getClass(), "first", -1274456137);
        setField(term592, term592.getClass(), "words", term593);
        setIntField(term592, term592.getClass(), "wordsInUse", 1041916673);
        setBooleanField(term592, term592.getClass(), "sizeIsSticky", true);
        setField(term583, term583.getClass(), "bitset", term592);
        setField(term582, term582.getClass(), "cycle", term583);
        setIntField(term597, term597.getClass(), "component", -601863069);
        setIntField(term597, term597.getClass(), "vertex", 663292551);
        setIntField(term597, term597.getClass(), "level", -1885090354);
        setIntField(term597, term597.getClass(), "order", -2066804303);
        setIntField(term602, term602.getClass(), "component", -1731761810);
        setIntField(term602, term602.getClass(), "vertex", 197109649);
        setIntField(term602, term602.getClass(), "level", -1239406390);
        setIntField(term602, term602.getClass(), "order", 1557431527);
        setIntField(term607, term607.getClass(), "component", -1504890659);
        setIntField(term607, term607.getClass(), "vertex", 1358829571);
        setIntField(term607, term607.getClass(), "level", 991356662);
        setIntField(term607, term607.getClass(), "order", -506958186);
        setIntField(term612, term612.getClass(), "component", -507387516);
        setIntField(term612, term612.getClass(), "vertex", -1970452551);
        setIntField(term612, term612.getClass(), "level", -1896376975);
        setIntField(term612, term612.getClass(), "order", 729658803);
        setField(term612, term612.getClass(), "parent", null);
        setField(term607, term607.getClass(), "parent", term612);
        setField(term602, term602.getClass(), "parent", term607);
        setField(term597, term597.getClass(), "parent", term602);
        setField(term582, term582.getClass(), "targetNode", term597);
        setField(term582, term582.getClass(), "this$0", null);
        term617 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term622 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term627 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term632 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term637 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term617, term617.getClass(), "component", -1310015129);
        setIntField(term617, term617.getClass(), "vertex", -2104981311);
        setIntField(term617, term617.getClass(), "level", -571169753);
        setIntField(term617, term617.getClass(), "order", 318591690);
        setIntField(term622, term622.getClass(), "component", -165587447);
        setIntField(term622, term622.getClass(), "vertex", -1347358701);
        setIntField(term622, term622.getClass(), "level", 806595993);
        setIntField(term622, term622.getClass(), "order", 548228925);
        setIntField(term627, term627.getClass(), "component", -749861210);
        setIntField(term627, term627.getClass(), "vertex", 1694224101);
        setIntField(term627, term627.getClass(), "level", 937859191);
        setIntField(term627, term627.getClass(), "order", -916584829);
        setIntField(term632, term632.getClass(), "component", -2131181468);
        setIntField(term632, term632.getClass(), "vertex", 282916351);
        setIntField(term632, term632.getClass(), "level", 880977281);
        setIntField(term632, term632.getClass(), "order", 371943306);
        setIntField(term637, term637.getClass(), "component", 982388293);
        setIntField(term637, term637.getClass(), "vertex", -159494544);
        setIntField(term637, term637.getClass(), "level", -75206835);
        setIntField(term637, term637.getClass(), "order", -1618206977);
        setField(term637, term637.getClass(), "parent", null);
        setField(term632, term632.getClass(), "parent", term637);
        setField(term627, term627.getClass(), "parent", term632);
        setField(term622, term622.getClass(), "parent", term627);
        setField(term617, term617.getClass(), "parent", term622);
        term642 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term647 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term652 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term657 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term662 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term642, term642.getClass(), "component", 477625804);
        setIntField(term642, term642.getClass(), "vertex", 252575029);
        setIntField(term642, term642.getClass(), "level", 57189932);
        setIntField(term642, term642.getClass(), "order", 1460722225);
        setIntField(term647, term647.getClass(), "component", 1743224434);
        setIntField(term647, term647.getClass(), "vertex", 842904495);
        setIntField(term647, term647.getClass(), "level", 1008080511);
        setIntField(term647, term647.getClass(), "order", 1935707624);
        setIntField(term652, term652.getClass(), "component", 1507074215);
        setIntField(term652, term652.getClass(), "vertex", -282881827);
        setIntField(term652, term652.getClass(), "level", -1183353915);
        setIntField(term652, term652.getClass(), "order", -420030135);
        setIntField(term657, term657.getClass(), "component", 267763294);
        setIntField(term657, term657.getClass(), "vertex", -1497710478);
        setIntField(term657, term657.getClass(), "level", 49950830);
        setIntField(term657, term657.getClass(), "order", -525257914);
        setIntField(term662, term662.getClass(), "component", 147209682);
        setIntField(term662, term662.getClass(), "vertex", 34470066);
        setIntField(term662, term662.getClass(), "level", 2058711405);
        setIntField(term662, term662.getClass(), "order", 1743683601);
        setField(term662, term662.getClass(), "parent", null);
        setField(term657, term657.getClass(), "parent", term662);
        setField(term652, term652.getClass(), "parent", term657);
        setField(term647, term647.getClass(), "parent", term652);
        setField(term642, term642.getClass(), "parent", term647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$BFSCycleVisitor");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        argTypes[1] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[2];
        args[0] = term617;
        args[1] = term642;
        callMethod(klass, "backEdge", argTypes, term582, args);
    }

};


