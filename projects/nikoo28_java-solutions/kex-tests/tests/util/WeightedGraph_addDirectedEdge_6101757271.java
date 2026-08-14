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
import java.util.ArrayList;
import java.lang.Integer;

public class WeightedGraph_addDirectedEdge_6101757271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1577;
     Object term1588;
     Object term1590;
     Object term1592;

    public WeightedGraph_addDirectedEdge_6101757271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1580 = new ArrayList();
        ArrayList term1584 = new ArrayList();
        term1577 = newInstance(Class.forName("util.WeightedGraph"));
        Object[] term1579 = (Object[]) newArray("java.util.List", 2);
        setIntField(term1577, term1577.getClass(), "vertices", 1160010161);
        setElement(term1579, 0, term1580);
        setElement(term1579, 1, term1584);
        setField(term1577, term1577.getClass(), "adjacencyList", term1579);
        term1588 = new Integer(-423900705);
        term1590 = new Integer(-525570815);
        term1592 = new Integer(754055848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.WeightedGraph");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1588;
        args[1] = term1590;
        args[2] = term1592;
        callMethod(klass, "addDirectedEdge", argTypes, term1577, args);
    }

};


