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
import java.util.ArrayDeque;
import java.lang.Object;

public class DFSIterator_next_3082138994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1022;

    public DFSIterator_next_3082138994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1027 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1032 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1027, term1027.getClass(), "component", 1207142014);
        setIntField(term1027, term1027.getClass(), "vertex", -876426634);
        setIntField(term1027, term1027.getClass(), "level", 213831054);
        setIntField(term1027, term1027.getClass(), "order", 330043745);
        setIntField(term1032, term1032.getClass(), "component", -509349195);
        setIntField(term1032, term1032.getClass(), "vertex", -1639041228);
        setIntField(term1032, term1032.getClass(), "level", 2027686272);
        setIntField(term1032, term1032.getClass(), "order", -1494356104);
        setField(term1032, term1032.getClass(), "parent", null);
        setField(term1027, term1027.getClass(), "parent", term1032);
        Object term1037 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1042 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1037, term1037.getClass(), "component", -1271375703);
        setIntField(term1037, term1037.getClass(), "vertex", 1136208236);
        setIntField(term1037, term1037.getClass(), "level", -1220630391);
        setIntField(term1037, term1037.getClass(), "order", -995822131);
        setIntField(term1042, term1042.getClass(), "component", -1556527718);
        setIntField(term1042, term1042.getClass(), "vertex", 895255351);
        setIntField(term1042, term1042.getClass(), "level", -1317044799);
        setIntField(term1042, term1042.getClass(), "order", -1428063820);
        setField(term1042, term1042.getClass(), "parent", null);
        setField(term1037, term1037.getClass(), "parent", term1042);
        Object term1047 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1047, term1047.getClass(), "component", 0);
        setIntField(term1047, term1047.getClass(), "vertex", 0);
        setIntField(term1047, term1047.getClass(), "level", 0);
        setIntField(term1047, term1047.getClass(), "order", 0);
        setField(term1047, term1047.getClass(), "parent", null);
        Object term1052 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term1057 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term1052, term1052.getClass(), "component", 1692937831);
        setIntField(term1052, term1052.getClass(), "vertex", -1539747985);
        setIntField(term1052, term1052.getClass(), "level", -1982489643);
        setIntField(term1052, term1052.getClass(), "order", 550892835);
        setIntField(term1057, term1057.getClass(), "component", 1237549886);
        setIntField(term1057, term1057.getClass(), "vertex", -1945635750);
        setIntField(term1057, term1057.getClass(), "level", -1622760744);
        setIntField(term1057, term1057.getClass(), "order", 2068435279);
        setField(term1057, term1057.getClass(), "parent", term1042);
        setField(term1052, term1052.getClass(), "parent", term1057);
        ArrayDeque term1025 = new ArrayDeque();
        ((ArrayDeque) term1025).add(term1027);
        ((ArrayDeque) term1025).add(term1037);
        ((ArrayDeque) term1025).add(term1047);
        ((ArrayDeque) term1025).add(term1027);
        ((ArrayDeque) term1025).add(term1052);
        term1022 = newInstance(Class.forName("org.graph4j.traversal.DFSIterator"));
        boolean[] term1064 = (boolean[]) newBooleanArray(3);
        int[] term1068 = (int[]) newIntArray(5);
        setField(term1022, term1022.getClass(), "graph", null);
        setIntField(term1022, term1022.getClass(), "numVertices", 947449400);
        setIntField(term1022, term1022.getClass(), "startVertex", -763799087);
        setField(term1022, term1022.getClass(), "stack", term1025);
        setBooleanElement(term1064, 0, true);
        setBooleanElement(term1064, 1, true);
        setField(term1022, term1022.getClass(), "visited", term1064);
        setIntElement(term1068, 0, -687282231);
        setIntElement(term1068, 1, 1200440315);
        setIntElement(term1068, 2, 40571662);
        setIntElement(term1068, 3, 1863910269);
        setIntElement(term1068, 4, 864645689);
        setField(term1022, term1022.getClass(), "nextPos", term1068);
        setIntField(term1022, term1022.getClass(), "restartIndex", 279384872);
        setIntField(term1022, term1022.getClass(), "numIterations", 1427305953);
        setIntField(term1022, term1022.getClass(), "component", -781832877);
        setIntField(term1022, term1022.getClass(), "orderNumber", 797203987);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term1022, args);
    }

};


