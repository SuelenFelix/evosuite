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
import java.lang.Integer;

public class WeightedGraph_addUndirectedEdge_1830931629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1773;
     Object term1775;
     Object term1777;
     Object term1779;

    public WeightedGraph_addUndirectedEdge_1830931629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1773 = newInstance(Class.forName("util.WeightedGraph"));
        setIntField(term1773, term1773.getClass(), "vertices", 0);
        setField(term1773, term1773.getClass(), "adjacencyList", null);
        term1775 = new Integer(0);
        term1777 = new Integer(0);
        term1779 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.WeightedGraph");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1775;
        args[1] = term1777;
        args[2] = term1779;
        callMethod(klass, "addUndirectedEdge", argTypes, term1773, args);
    }

};


