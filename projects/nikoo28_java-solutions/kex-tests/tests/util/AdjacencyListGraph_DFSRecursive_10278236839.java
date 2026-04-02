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
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class AdjacencyListGraph_DFSRecursive_10278236839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2607;
     Object term2613;
     Object term2615;

    public AdjacencyListGraph_DFSRecursive_10278236839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2608 = new HashMap();
        term2607 = newInstance(Class.forName("util.AdjacencyListGraph"));
        setField(term2607, term2607.getClass(), "adjacencyList", term2608);
        term2613 = new Integer(1633913667);
        HashMap term2616 = new HashMap();
        Set<Object> term2621 =  ((Map) term2616).keySet();
        term2615 = new HashSet((Collection<? extends Object>) term2621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.AdjacencyListGraph");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term2613;
        args[1] = term2615;
        callMethod(klass, "DFSRecursive", argTypes, term2607, args);
    }

};


