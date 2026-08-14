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

public class MinimumSpanningTree_kruskalMST_1241396372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1079;
     Object term1080;

    public MinimumSpanningTree_kruskalMST_1241396372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1079 = newInstance(Class.forName("util.MinimumSpanningTree"));
        ArrayList term1083 = new ArrayList();
        ArrayList term1087 = new ArrayList();
        ArrayList term1091 = new ArrayList();
        ArrayList term1095 = new ArrayList();
        ArrayList term1099 = new ArrayList();
        ArrayList term1103 = new ArrayList();
        ArrayList term1107 = new ArrayList();
        ArrayList term1111 = new ArrayList();
        ArrayList term1115 = new ArrayList();
        term1080 = newInstance(Class.forName("util.WeightedGraph"));
        Object[] term1082 = (Object[]) newArray("java.util.List", 9);
        setIntField(term1080, term1080.getClass(), "vertices", 765766290);
        setElement(term1082, 0, term1083);
        setElement(term1082, 1, term1087);
        setElement(term1082, 2, term1091);
        setElement(term1082, 3, term1095);
        setElement(term1082, 4, term1099);
        setElement(term1082, 5, term1103);
        setElement(term1082, 6, term1107);
        setElement(term1082, 7, term1111);
        setElement(term1082, 8, term1115);
        setField(term1080, term1080.getClass(), "adjacencyList", term1082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.MinimumSpanningTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("util.WeightedGraph");
        Object[] args = new Object[1];
        args[0] = term1080;
        callMethod(klass, "kruskalMST", argTypes, term1079, args);
    }

};


