package org.graph4j.connectivity;

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
import static org.graph4j.connectivity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TarjanStrongConnectivity_Visitor_startVertex_7640139541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term950;
     Object term969;

    public TarjanStrongConnectivity_Visitor_startVertex_7640139541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term950 = newInstance(Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor"));
        int[] term952 = (int[]) newIntArray(5);
        Object term958 = newInstance(Class.forName("org.graph4j.util.VertexStack"));
        int[] term959 = (int[]) newIntArray(1);
        Object term963 = newInstance(Class.forName("java.util.BitSet"));
        long[] term964 = (long[]) newLongArray(1);
        boolean[] term968 = (boolean[]) newBooleanArray(0);
        setBooleanField(term950, term950.getClass(), "checkOnly", true);
        setIntElement(term952, 0, 515182546);
        setIntElement(term952, 1, -936895502);
        setIntElement(term952, 2, -129547140);
        setIntElement(term952, 3, 199287428);
        setIntElement(term952, 4, -1195339592);
        setField(term950, term950.getClass(), "low", term952);
        setField(term958, term958.getClass(), "graph", null);
        setIntElement(term959, 0, -376422566);
        setField(term958, term958.getClass(), "vertices", term959);
        setIntField(term958, term958.getClass(), "numVertices", 306847454);
        setIntField(term958, term958.getClass(), "first", 1745276158);
        setField(term963, term963.getClass(), "words", term964);
        setIntField(term963, term963.getClass(), "wordsInUse", 2009020256);
        setBooleanField(term963, term963.getClass(), "sizeIsSticky", true);
        setField(term958, term958.getClass(), "bitset", term963);
        setField(term950, term950.getClass(), "stack", term958);
        setField(term950, term950.getClass(), "instack", term968);
        setField(term950, term950.getClass(), "this$0", null);
        term969 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term974 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term979 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term984 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        Object term989 = newInstance(Class.forName("org.graph4j.traversal.SearchNode"));
        setIntField(term969, term969.getClass(), "component", 2049577015);
        setIntField(term969, term969.getClass(), "vertex", 1236004505);
        setIntField(term969, term969.getClass(), "level", 1050765721);
        setIntField(term969, term969.getClass(), "order", 474518942);
        setIntField(term974, term974.getClass(), "component", -1656687479);
        setIntField(term974, term974.getClass(), "vertex", -249614216);
        setIntField(term974, term974.getClass(), "level", 1870727665);
        setIntField(term974, term974.getClass(), "order", -519881101);
        setIntField(term979, term979.getClass(), "component", -680920524);
        setIntField(term979, term979.getClass(), "vertex", -916335264);
        setIntField(term979, term979.getClass(), "level", -919416536);
        setIntField(term979, term979.getClass(), "order", -43417861);
        setIntField(term984, term984.getClass(), "component", -1533843432);
        setIntField(term984, term984.getClass(), "vertex", -123338791);
        setIntField(term984, term984.getClass(), "level", -1467089634);
        setIntField(term984, term984.getClass(), "order", 413548937);
        setIntField(term989, term989.getClass(), "component", 1901317214);
        setIntField(term989, term989.getClass(), "vertex", 1166710220);
        setIntField(term989, term989.getClass(), "level", -1070592289);
        setIntField(term989, term989.getClass(), "order", -1464172784);
        setField(term989, term989.getClass(), "parent", null);
        setField(term984, term984.getClass(), "parent", term989);
        setField(term979, term979.getClass(), "parent", term984);
        setField(term974, term974.getClass(), "parent", term979);
        setField(term969, term969.getClass(), "parent", term974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.connectivity.TarjanStrongConnectivity$Visitor");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.traversal.SearchNode");
        Object[] args = new Object[1];
        args[0] = term969;
        callMethod(klass, "startVertex", argTypes, term950, args);
    }

};


