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

public class AdjacencyMatrixGraph_removeVertex_7706917974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term641;
     Object term660;

    public AdjacencyMatrixGraph_removeVertex_7706917974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term641 = newInstance(Class.forName("util.AdjacencyMatrixGraph"));
        Object[] term642 = (Object[]) newArray("[I", 2);
        int[] term643 = (int[]) newIntArray(8);
        int[] term652 = (int[]) newIntArray(6);
        setIntElement(term643, 0, 1045547089);
        setIntElement(term643, 1, -1122880881);
        setIntElement(term643, 2, -542712742);
        setIntElement(term643, 3, -1254072822);
        setIntElement(term643, 4, -1111249833);
        setIntElement(term643, 5, -1692331299);
        setIntElement(term643, 6, 479531250);
        setIntElement(term643, 7, 1320570890);
        setElement(term642, 0, term643);
        setIntElement(term652, 0, -130649791);
        setIntElement(term652, 1, 534834644);
        setIntElement(term652, 2, 1959097203);
        setIntElement(term652, 3, -209654048);
        setIntElement(term652, 4, 477625804);
        setIntElement(term652, 5, 252575029);
        setElement(term642, 1, term652);
        setField(term641, term641.getClass(), "adjMatrix", term642);
        setIntField(term641, term641.getClass(), "numVertices", 57189932);
        term660 = new Integer(1460722225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.AdjacencyMatrixGraph");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term660;
        callMethod(klass, "removeVertex", argTypes, term641, args);
    }

};


