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

public class DFSIterator_hasNext_14757299323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term948;

    public DFSIterator_hasNext_14757299323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term953 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term958 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term953, term953.getClass(), "component", -1488938905);
        setIntField(term953, term953.getClass(), "vertex", 1916544127);
        setIntField(term953, term953.getClass(), "level", -1133405894);
        setIntField(term953, term953.getClass(), "order", 1289741214);
        setIntField(term958, term958.getClass(), "component", 243280944);
        setIntField(term958, term958.getClass(), "vertex", -726681073);
        setIntField(term958, term958.getClass(), "level", -1724487863);
        setIntField(term958, term958.getClass(), "order", -128490829);
        setField(term958, term958.getClass(), "parent", null);
        setField(term953, term953.getClass(), "parent", term958);
        Object term963 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term968 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term963, term963.getClass(), "component", -1097563716);
        setIntField(term963, term963.getClass(), "vertex", 1572907769);
        setIntField(term963, term963.getClass(), "level", 1608016787);
        setIntField(term963, term963.getClass(), "order", -516303035);
        setIntField(term968, term968.getClass(), "component", 1065595802);
        setIntField(term968, term968.getClass(), "vertex", 21031843);
        setIntField(term968, term968.getClass(), "level", -380787857);
        setIntField(term968, term968.getClass(), "order", 319853052);
        setField(term968, term968.getClass(), "parent", null);
        setField(term963, term963.getClass(), "parent", term968);
        Object term973 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term973, term973.getClass(), "component", 0);
        setIntField(term973, term973.getClass(), "vertex", 0);
        setIntField(term973, term973.getClass(), "level", 0);
        setIntField(term973, term973.getClass(), "order", 0);
        setField(term973, term973.getClass(), "parent", null);
        Object term978 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term983 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term978, term978.getClass(), "component", 433248783);
        setIntField(term978, term978.getClass(), "vertex", -507944154);
        setIntField(term978, term978.getClass(), "level", -1736183862);
        setIntField(term978, term978.getClass(), "order", 897010381);
        setIntField(term983, term983.getClass(), "component", -15712667);
        setIntField(term983, term983.getClass(), "vertex", 1964967720);
        setIntField(term983, term983.getClass(), "level", 1351900243);
        setIntField(term983, term983.getClass(), "order", -330897705);
        setField(term983, term983.getClass(), "parent", term968);
        setField(term978, term978.getClass(), "parent", term983);
        Object term988 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term993 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term988, term988.getClass(), "component", 291864719);
        setIntField(term988, term988.getClass(), "vertex", -1549607466);
        setIntField(term988, term988.getClass(), "level", 853609788);
        setIntField(term988, term988.getClass(), "order", -197820800);
        setIntField(term993, term993.getClass(), "component", 723812297);
        setIntField(term993, term993.getClass(), "vertex", 1639448749);
        setIntField(term993, term993.getClass(), "level", 873659088);
        setIntField(term993, term993.getClass(), "order", -975748721);
        setField(term993, term993.getClass(), "parent", term978);
        setField(term988, term988.getClass(), "parent", term993);
        ArrayDeque term951 = new ArrayDeque();
        ((ArrayDeque) term951).add(term953);
        ((ArrayDeque) term951).add(term963);
        ((ArrayDeque) term951).add(term973);
        ((ArrayDeque) term951).add(term953);
        ((ArrayDeque) term951).add(term978);
        ((ArrayDeque) term951).add(term988);
        term948 = newInstance(Class.forName("org.graph4j.traversal.DFSIterator"));
        boolean[] term1000 = (boolean[]) newBooleanArray(6);
        int[] term1007 = (int[]) newIntArray(2);
        setField(term948, term948.getClass(), "graph", null);
        setIntField(term948, term948.getClass(), "numVertices", -2063365430);
        setIntField(term948, term948.getClass(), "startVertex", 812570053);
        setField(term948, term948.getClass(), "stack", term951);
        setBooleanElement(term1000, 2, true);
        setBooleanElement(term1000, 3, true);
        setBooleanElement(term1000, 5, true);
        setField(term948, term948.getClass(), "visited", term1000);
        setIntElement(term1007, 0, -2143043890);
        setIntElement(term1007, 1, -2138825831);
        setField(term948, term948.getClass(), "nextPos", term1007);
        setIntField(term948, term948.getClass(), "restartIndex", 1454781562);
        setIntField(term948, term948.getClass(), "numIterations", -27944011);
        setIntField(term948, term948.getClass(), "component", -20614472);
        setIntField(term948, term948.getClass(), "orderNumber", 1126618861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.traversal.DFSIterator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term948, args);
    }

};


