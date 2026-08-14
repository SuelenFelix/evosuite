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

public class CycleFinder_DFSCycleVisitor_startVertex_6533280911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1162;
     Object term1179;

    public CycleFinder_DFSCycleVisitor_startVertex_6533280911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1162 = newInstance(Class.forName("org.graph4j.route.CycleFinder$DFSCycleVisitor"));
        Object term1163 = newInstance(Class.forName("org.graph4j.util.Cycle"));
        int[] term1165 = (int[]) newIntArray(6);
        Object term1174 = newInstance(Class.forName("java.util.BitSet"));
        long[] term1175 = (long[]) newLongArray(1);
        setIntField(term1163, term1163.getClass(), "numEdges", 897010381);
        setField(term1163, term1163.getClass(), "graph", null);
        setIntElement(term1165, 0, -15712667);
        setIntElement(term1165, 1, 1964967720);
        setIntElement(term1165, 2, 1351900243);
        setIntElement(term1165, 3, -330897705);
        setIntElement(term1165, 4, 1065595802);
        setIntElement(term1165, 5, 21031843);
        setField(term1163, term1163.getClass(), "vertices", term1165);
        setIntField(term1163, term1163.getClass(), "numVertices", -380787857);
        setIntField(term1163, term1163.getClass(), "first", 319853052);
        setField(term1174, term1174.getClass(), "words", term1175);
        setIntField(term1174, term1174.getClass(), "wordsInUse", -1097563716);
        setBooleanField(term1174, term1174.getClass(), "sizeIsSticky", true);
        setField(term1163, term1163.getClass(), "bitset", term1174);
        setField(term1162, term1162.getClass(), "cycle", term1163);
        setField(term1162, term1162.getClass(), "this$0", null);
        term1179 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1184 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1189 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1194 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1199 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1179, term1179.getClass(), "component", 1572907769);
        setIntField(term1179, term1179.getClass(), "vertex", 1608016787);
        setIntField(term1179, term1179.getClass(), "level", -516303035);
        setIntField(term1179, term1179.getClass(), "order", -2143043890);
        setIntField(term1184, term1184.getClass(), "component", -2138825831);
        setIntField(term1184, term1184.getClass(), "vertex", 1454781562);
        setIntField(term1184, term1184.getClass(), "level", -27944011);
        setIntField(term1184, term1184.getClass(), "order", -20614472);
        setIntField(term1189, term1189.getClass(), "component", 1126618861);
        setIntField(term1189, term1189.getClass(), "vertex", 947449400);
        setIntField(term1189, term1189.getClass(), "level", -763799087);
        setIntField(term1189, term1189.getClass(), "order", 1207142014);
        setIntField(term1194, term1194.getClass(), "component", -876426634);
        setIntField(term1194, term1194.getClass(), "vertex", 213831054);
        setIntField(term1194, term1194.getClass(), "level", 330043745);
        setIntField(term1194, term1194.getClass(), "order", -509349195);
        setIntField(term1199, term1199.getClass(), "component", -1639041228);
        setIntField(term1199, term1199.getClass(), "vertex", 2027686272);
        setIntField(term1199, term1199.getClass(), "level", -1494356104);
        setIntField(term1199, term1199.getClass(), "order", -695279311);
        setField(term1199, term1199.getClass(), "parent", null);
        setField(term1194, term1194.getClass(), "parent", term1199);
        setField(term1189, term1189.getClass(), "parent", term1194);
        setField(term1184, term1184.getClass(), "parent", term1189);
        setField(term1179, term1179.getClass(), "parent", term1184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.route.CycleFinder$DFSCycleVisitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term1179;
        callMethod(klass, "startVertex", argTypes, term1162, args);
    }

};


