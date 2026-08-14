package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class AdjacencyMatrixGraph_addEdge_19019696331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537;
     Object term559;
     Object term561;

    public AdjacencyMatrixGraph_addEdge_19019696331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537 = newInstance(Class.forName("util.AdjacencyMatrixGraph"));
        Object[] term538 = (Object[]) newArray("[I", 4);
        int[] term539 = (int[]) newIntArray(1);
        int[] term541 = (int[]) newIntArray(6);
        int[] term548 = (int[]) newIntArray(2);
        int[] term551 = (int[]) newIntArray(6);
        setIntElement(term539, 0, 729658803);
        setElement(term538, 0, term539);
        setIntElement(term541, 0, 114754804);
        setIntElement(term541, 1, 1687361082);
        setIntElement(term541, 2, 584893196);
        setIntElement(term541, 3, 497269071);
        setIntElement(term541, 4, -1899301124);
        setIntElement(term541, 5, -1882480155);
        setElement(term538, 1, term541);
        setIntElement(term548, 0, -1410220680);
        setIntElement(term548, 1, 389427431);
        setElement(term538, 2, term548);
        setIntElement(term551, 0, -1945706126);
        setIntElement(term551, 1, 1152356969);
        setIntElement(term551, 2, -1667990367);
        setIntElement(term551, 3, -1214628358);
        setIntElement(term551, 4, 1102721075);
        setIntElement(term551, 5, -426764678);
        setElement(term538, 3, term551);
        setField(term537, term537.getClass(), "adjMatrix", term538);
        setIntField(term537, term537.getClass(), "numVertices", -1222614956);
        term559 = new Integer(-1870495012);
        term561 = new Integer(-1310015129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.AdjacencyMatrixGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term559;
        args[1] = term561;
        callMethod(klass, "addEdge", argTypes, term537, args);
    }

};


